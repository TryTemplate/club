package com.club.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.club.web.dao.HmMenuSubmenuMapper;
import com.club.web.model.HmMenuSubmenu;

@Service
public class HmMenuSubmenuServiceImpl implements HmMenuSubmenuService {

	@Autowired
	private HmMenuSubmenuMapper hmMenuSubmenuMapper;

	@Override
	public List<HmMenuSubmenu> getSmenuByMid(Integer mid, Integer type) {
		// TODO Auto-generated method stub
		return hmMenuSubmenuMapper.getSmenuByMid(mid,type);
	}

}
