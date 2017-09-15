package com.club.web.login;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.velocity.tools.config.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.club.web.model.SysUserAdmin;
import com.club.web.service.SysUserAdminService;
import com.club.web.util.Constants;

@Controller
@RequestMapping("/login")
public class BaLoginController {
	private final static Logger log = Logger.getLogger(BaLoginController.class);

	@Autowired
	private SysUserAdminService sysUserAdminService;
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="gobalogin.do")
	public String gologin(HttpServletRequest request, ModelMap map,SysUserAdmin admin) {
		SysUserAdmin admin_session = (SysUserAdmin) request.getSession().getAttribute(Constants.USER_SESSION);
		if (admin_session==null) {
			return "controlcenter/login";
		}
		return "receptionframe/homepage";
	}
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="basignin.do")
	public String indexPage(HttpServletRequest request, ModelMap map,SysUserAdmin admin) {
		
		SysUserAdmin loginuser = sysUserAdminService.getUserAdminByAP(admin);
		
		if (loginuser != null) {
			if (loginuser.getStatus().equals('0')) {
				map.put(Constants.loginmsg, "您的账号已停用,如有疑问请联系管理员");	
				return "controlcenter/login";
			}
			request.getSession().setAttribute(Constants.USER_SESSION, loginuser);
			log.warn("login successful √");
			return "receptionframe/homepage";
		}
		
		log.warn("logon failure ×");
		map.put(Constants.loginmsg, "用户名或密码错误");
		return "controlcenter/login";
	}
	

}
