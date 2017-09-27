package com.club.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.club.web.dao.SysNewsContextMapper;
import com.club.web.model.SysNewsContext;

@Service
public class SysNewsContextServiceImpl implements SysNewsContextService {
	
	@Autowired
	private SysNewsContextMapper sysNewsContextMapper;
	
	@Override
	public List<SysNewsContext> getHotNews(){
		return sysNewsContextMapper.getHotNews();
	}

}
