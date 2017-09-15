      /**
     * @param {Object} input 元素的的集合
     * @param {Object} type 返回jsonobject的key是元素的id或name
      * @param {Object} data 
     */
    function getElemToJson(input,type,data){
        for(var i=0;input.length>i;i++){
        	if($(input[i]).attr("check")!="off"){
	            if(type=="name"){
	                if(!isNull(input[i].name))
	                data[input[i].name] =input[i].value;
	            }else{
	                if(!isNull(input[i].id))
	                data[input[i].id] =input[i].value;
	            }
	        }
        }
        return data;
   }

    function isNull(val){
        if(val==""||typeof(val)=="undefined"||val==null){
            return true;
        }
            return false;
    }
    /**
     * 
     * @param {Object} data getElemToJson方法返回的json 或者 key为(id或name) value为元素value的json
     * @param {Object} type 入参“name”或者。。。。
     */
    function checkNull(data,type){
        for(var key in data){
        	if(key=="primaryDiagnosis"){
        		continue;
        	}
            if(isNull(data[key])){
                if(type=="name"){
                    var elem = getElemByName(key);
                }else{
                    var elem = $("#"+key);
                }
                elem.addClass("checkDataRed");
                moveToElem(elem);
                return false;
            }
        }
        return true;
    }

    /**
     * 删除样式 给所有元素添加emptyCheckCLass的方法
     */
    $.fn.extend({ 
        emptyCheckClass:function(className){
            this.removeClass(className);
        }
    });
    /**
     * 删除样式 给所有元素添加emptyCheckCLass的方法
     */
    $.fn.extend({ 
        nextElem:function(elemClass){
        	if(this.next(elemClass).length==0){
        		return this.next().nextElem(elemClass);
        	}else{
        		return this.next(elemClass);
        	}
        }
    });
    /**
     * 定位元素 跳转到elem元素
     * @param {Object} elem
     */
    function moveToElem(elem){
        $(elem).before($("<a id='moveA'/>"));
        $("<a href='#moveA'/>")[0].click();
        $("#moveA").remove();
    }
    /**
     * 根据name属性获取元素
     * 默认input,select,textarea 三种类型的元素
     * @param {Object} name
     */
    function getElemByName(name){
        var arr = ["input","select","textarea,input[type='radio']:checked"];
        for(var i=0;i<arr.length;){
            var select =arr[i];
            if($(select+"[name='"+name+"']").length==1){
                return $(select+"[name='"+name+"']");
            }else{
                i++;
            }
        }
    }

     String.prototype.trim=function() {
        return this.replace(/(^\s*)|(\s*$)/g,'');
     }
     $("input").blur(function(){
    	 $(this).removeClass("checkDataRed");
     })
     $("textarea").blur(function(){
    	 $(this).removeClass("checkDataRed");
     })
     
    var jsnFile = {};
	jsnFile["xls"] ="/images/apply/xls.png";
	jsnFile["xlsx"] ="/images/apply/xls.png";
	jsnFile["doc"] ="/images/apply/doc.png";
	jsnFile["docx"] ="/images/apply/doc.png";
	jsnFile["music"] ="/images/icons/fileicons/music.png";
	jsnFile["ppt"] ="/images/apply/ppt.png";
	jsnFile["pptx"] ="/images/apply/ppt.png";
	jsnFile["rar"] ="/images/apply/rar.png";
	jsnFile["txt"] ="/images/icons/fileicons/txt.png";
	jsnFile["word"] ="/images/icons/fileicons/word.png";
	jsnFile["zip"] ="/images/icons/fileicons/zip.png";
	jsnFile["pdf"] ="/images/apply/pdf.png";
	function imgJson(fileName,imgUrl,jsn){
		var pos = fileName.lastIndexOf(".");
		var fileEnd=fileName.substring(pos+1);
		var url = jsn[fileEnd];
		if(url==""||typeof(url)=="undefined"){
			return imgUrl;
		}else{
			return url;
		}
	}