package com.club.web.login;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.club.web.model.SysUserAdmin;
import com.club.web.service.SysUserAdminService;
import com.club.web.util.Constants;

@Controller
@RequestMapping("/balogin")
public class BaLoginController {
	private final static Logger log = Logger.getLogger(BaLoginController.class);

	@Autowired
	private SysUserAdminService sysUserAdminService;
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="gobalogin.do")
	public String gobalogin(HttpServletRequest request, ModelMap map) {
		/**
		SysUserAdmin admin_session = (SysUserAdmin) request.getSession().getAttribute(Constants.ADMIN_SESSION);
		if (admin_session==null) {
			return "bacontrolcenter/balogin";
		}
		 */
		
		return "baceptionframe/bahomepage";
	}
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="basignin.do")
	public String baindexPage(HttpServletRequest request, ModelMap map,SysUserAdmin admin) {
		
		SysUserAdmin loginuser = sysUserAdminService.getAdminByAP(admin);
		
		if (loginuser != null) {
			if (loginuser.getStatus().equals('0')) {
				map.put(Constants.loginmsg, "您的账号已停用,如有疑问请联系管理员");
				return "bacontrolcenter/login";
			}
			request.getSession().setAttribute(Constants.ADMIN_SESSION, loginuser);
			log.warn("login successful √");
			return "baceptionframe/bahomepage";
		}
		
		log.warn("logon failure ×");
		map.put(Constants.loginmsg, "用户名或密码错误");
		return "bacontrolcenter/balogin";
	}
	

}
