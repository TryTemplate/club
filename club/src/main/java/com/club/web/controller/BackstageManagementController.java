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
import com.club.web.util.ResultUtil;

import net.sf.json.JSONObject;


@Controller
@RequestMapping("/mangerment")
public class BackstageManagementController {
	private final static Logger log = Logger.getLogger(BackstageManagementController.class);
	
	@Autowired
	private HmMenuMainmenuService hmMenuMainmenuService;
	
	@Autowired
	private HmMenuSubmenuService hmMenuSubmenuService;
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="home.do")
	public String indexPage(HttpServletRequest request, ModelMap map) {
		
		List<HmMenuMainmenu> hmmList = hmMenuMainmenuService.getMainMenu(2);
		
		for (HmMenuMainmenu hmMenuMainmenu : hmmList) {
			hmMenuMainmenu.setSmenuList(hmMenuSubmenuService.getSmenuByMid(hmMenuMainmenu.getId(),2));
		}
		
		map.put("mList", hmmList);
		map.put("msg", "hello club !");

		return "baceptionframe/bahomepage";
	}
	
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="ajaxtest.htm")
	public void ajaxTest(HttpServletRequest request, HttpServletResponse response, ModelMap map) {

		JSONObject res = new JSONObject();
		
		res.put("msg", "hello world !");
		
		try {
			ResultUtil.writeResult(response, res.toString());
		} catch (Exception e) {
			log.error(e);
		}
		
	}

}
