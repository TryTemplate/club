package com.club.web.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.club.web.controller.WelcomeController;
import com.club.web.model.SysNewsContext;
import com.club.web.service.SysNewsContextService;
import com.club.web.util.ResultUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/api")
public class ClubApiTestController {
	
	private final static Logger log = Logger.getLogger(WelcomeController.class);

	@Autowired
	private SysNewsContextService sysNewsContextService;
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST },value="getdata.api")
	public void getData(HttpServletRequest request, HttpServletResponse response, ModelMap map){
		
		JSONObject res = new JSONObject();
		
		List<SysNewsContext> hotNews = sysNewsContextService.getHotNews();
		
		res.put("hotNews", hotNews);
		
		try {
			ResultUtil.writeResult(response, res.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("getdata.api error :\t", e);
			
		}
	}
	
}
