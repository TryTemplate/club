	$(window).bind("scroll", function(){ 
			//当滚动条滚动时
			scrollEvent();
	}); 
	function scrollEvent() {
			var top = $(window).scrollTop() + 50;
			$("#rel_div").css("margin-top", top + "px");
	}
	
	/*呼出上传附件div*/
	$("#scdzbl").click(function(){
		$("#pzsc_tc").show();
		if(isNull($("#mzzzApplyId").val())){
			$.ajax({
				url:"/longpoling/applyId.htm",
				async : false,
				type:"get",
				dateType:"text",
				timeout: 8000,
				success:function(data){
					var obj = JSON.parse(data);
					$("#mzzzApplyId").attr("value",obj.applyId);
				}
			});
		}
		LongPolingLock = 1;
		LongpolingQRRetrun(4);
		$("#fullscrean").show();
	})
	/*关闭上传附件div*/
	function qdsc(){
		$("#pzsc_tc").hide();
		$(".fullscrean").hide();
		LongPolingLock = 0;
	}
	
	/*上传附件*/
	function uploadFj(a,filename,type){
	//	处理为当前的文件名称
		var filestr=filename;
		var pos=filestr.lastIndexOf("\\");
		filestr=filestr.substring(pos+1);  
		pos = filestr.lastIndexOf(".");
		var fileEnd=filestr.substring(pos+1);
		fileEnd = fileEnd.toLowerCase();
		var $this=$(a);
		var inputId = $this.attr("id");
		//	var dom = $("#"+inputId)[0];
		//	var fileSize =  dom.files[0].fileSize;//文件的大小，单位为字节B
		//	if(fileSize > 10240){
		//		alert("附件大小不能超过")
		//	}
		if(fileEnd!='jpg'&&fileEnd!='png'&&fileEnd!='xls'
			&&fileEnd!='xlsx'&&fileEnd!='pdf'&&fileEnd!='zip'
				&&fileEnd!='txt'&&fileEnd!='rar'&&fileEnd!='pptx'
					&&fileEnd!='docx'&&fileEnd!='doc'){
			layer.msg("请注意上传文件格式", {icon: 0, time: 5000});
			return false;
		}
		$.ajaxFileUpload({
			type:"post",
			url:"/longpoling/uploadFile.htm",
			data : {"inputId" : inputId,"classify" : type,"name" : filestr},
			dataType : "text",
			fileElementId :inputId,
			timeout:900000,
			success:function(data){
				var obj = $.parseJSON(data);
				$("#addFjDiv").before(htmlFileDiv(obj,filestr));
				dzblnumChange();
			},
			error:function(){
				alert("上传附件出错，请稍后重试");
			}
		})
	}
	
	/*删除附件*/
	function deletefilefj(img,id){
		
		$.ajax({
			url:"/longpoling/deletefile.htm",
			async : false,
			type:"get",
			dateType:"text",
			data:{fileId:id},
			timeout: 8000,
			success:function(data){
			},error:function(){
				layer.msg("删除失败", {icon: 0, time: 5000});
			}
		});
		$("#uploadFj").attr("value","");
		   $(img).parent().remove();
		   dzblnumChange();
		}
	
	
	/*获取二维码4附件，1手写报告*/
	function getQRUrl(type){
		if($("#QRUrl").attr("src") != ""){
			showQR();
			return;
		}
		var mzzzApplyId = $("#mzzzApplyId").val();
		var params = [];
		params.push("applyId=" + mzzzApplyId);
		params.push("type=" + type);
		var param = params.join("&");
		$.ajax({
			url:"/longpoling/getQRCode.htm",
			async : false,
			type:"post",
			dateType:"text",
			data:param,
			timeout: 8000,
			success:function(data){
				var obj = JSON.parse(data);
				$("#mzzzApplyId").attr("value",obj.applyId);
				$("#QRUrl").attr("src",obj.QRUrl);
				showQR();
			},error:function(){
				layer.msg("二维码生成失败，请使用网页附件上传并联系管理员", {icon: 0, time: 5000});
			}
		});
	}
	
	/*开启二维码弹窗*/
	function showQR(){
		$('.QRdiv').show();
		$('.fullscrean2').show();
	}
	/*关闭二维码弹窗*/
	function QRclose(){
		$('.QRdiv').hide();
		$('.fullscrean2').hide();
	}
	
	function LongpolingQRRetrun(type){
		if(LongPolingLock == 0){
			return;
		}
		var mzzzApplyId = $("#mzzzApplyId").val();
		var params = [];
		params.push("id=" + mzzzApplyId);
		params.push("type=" + type);
		var param = params.join("&");
		$.ajax({
			url:"/longpoling/longpolingYlScanFile.htm",
			type:"post",
			dateType:"text",
			data:param,
			success:function(data){
				if(data != "{}"){
					var obj = eval( "(" + data + ")" );
					for(var i = 0; i < obj.fileList.length; i++){
						$("#addFjDiv").before(htmlFileDiv(obj.fileList[i],obj.fileList[i].fileName));
						dzblnumChange();
						QRclose();
					}
				}
				LongpolingQRRetrun(type);
			},error:function(){
				LongpolingQRRetrun(type);
			}
		});
	}
	
	function dzblnumChange(){
		$("#dzblnum").html($("#pzsc_tc .qpdiv").length);
	}
	
	function htmlFileDiv(obj,filestr){
		var str = [];
		str.push('<div class="qpdiv" fid="'+obj.fid+'">');
		str.push('<div class="qpimgdiv" title="' + filestr + '">');
		str.push( '<a href='+obj.url+' target="_blank">');
		str.push( '<img  onerror="/images/icons/fileicons/unknow.png" src="'+imgJson(filestr, obj.url,jsnFile)+'"/>');
		str.push( '</a>');
		str.push('</div>');
		str.push( '<img onclick="deletefilefj(this,'+obj.fid+')" class="addbtn" src="/images/remove.png">');
		str.push('</div>');
		return str.join("");
	}
