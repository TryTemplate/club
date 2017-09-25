package com.club.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.club.web.dao.HmMenuMainmenuMapper;
import com.club.web.model.HmMenuMainmenu;

@Service
public class HmMenuMainmenuServiceImpl implements HmMenuMainmenuService {

	@Autowired
	private HmMenuMainmenuMapper hmMenuMainmenuMapper;

	@Override
	public List<HmMenuMainmenu> getMainMenu(int type){
		return hmMenuMainmenuMapper.selectHomeViewMenu(type);
	}

}
