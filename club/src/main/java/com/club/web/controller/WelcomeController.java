package com.club.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.club.web.model.HmMenuMainmenu;
import com.club.web.service.HmMenuMainmenuService;
import com.club.web.service.HmMenuSubmenuService;
import com.club.web.service.SysUserAdminService;
import com.club.web.util.ResultUtil;

import net.sf.json.JSONObject;


@Controller
@RequestMapping("/home")
public class WelcomeController {
	private final static Logger log = Logger.getLogger(WelcomeController.class);
	
	@Autowired
	private HmMenuMainmenuService hmMenuMainmenuService;
	
	@Autowired
	private HmMenuSubmenuService hmMenuSubmenuService;
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="homepage.htm")
	public String indexPage(HttpServletRequest request, ModelMap map) {
		
		System.out.println("------------- in to home homepage");
		
		List<HmMenuMainmenu> hmmList = hmMenuMainmenuService.getMainMenu();
		
		for (HmMenuMainmenu hmMenuMainmenu : hmmList) {
			hmMenuMainmenu.setSmenuList(hmMenuSubmenuService.getSmenuByMid(hmMenuMainmenu.getId()));
		}
		
		map.put("mList", hmmList);
		
		map.put("msg", "hello club !");

		return "receptionframe/homepage";
	}
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="delsession.htm")
	public String delssion(HttpServletRequest request, ModelMap map) {
		request.getSession().invalidate();
		System.out.println("------------- login out");
		return "redirect:/home/homepage.htm";
	}
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="ajaxtest.htm")
	public void ajaxTest(HttpServletRequest request, HttpServletResponse response, ModelMap map) {

		JSONObject res = new JSONObject();
		
		System.out.println("------------- in to test ajaxtest");
			
		res.put("msg", "hello world !");
		
		try {
			ResultUtil.writeResult(response, res.toString());
		} catch (Exception e) {
			log.error(e);
		}
		
	}

}
