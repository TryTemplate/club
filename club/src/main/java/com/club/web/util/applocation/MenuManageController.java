package com.club.web.util.applocation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.club.web.model.HmMenuMainmenu;
import com.club.web.model.SysUserAdmin;
import com.club.web.service.HmMenuMainmenuService;
import com.club.web.service.HmMenuSubmenuService;
import com.club.web.service.SysUserAdminService;
import com.club.web.util.Constants;

@Controller
@RequestMapping("/menumanage")
public class MenuManageController {
	private final static Logger log = Logger.getLogger(MenuManageController.class);

	@Autowired
	private HmMenuMainmenuService hmMenuMainmenuService;
	
	@Autowired
	private HmMenuSubmenuService hmMenuSubmenuService;
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="menuSelect.do")
	public String gobalogin(HttpServletRequest request, ModelMap map,String loginmsg) {

		List<HmMenuMainmenu> menuList = hmMenuMainmenuService.getMainMenu(1);
		
		map.put("menuList", menuList);
		return "baceptionframe/menus/mainMenuManage";
	}
	

}
