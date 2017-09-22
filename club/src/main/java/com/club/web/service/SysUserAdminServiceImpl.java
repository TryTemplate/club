package com.club.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.club.web.dao.SysUserAdminMapper;
import com.club.web.model.SysUserAdmin;

@Service
public class SysUserAdminServiceImpl implements SysUserAdminService {
	
	@Autowired
	private SysUserAdminMapper sysUserAdminMapper;
	
	@Override
	public void addUserAdmin(SysUserAdmin admin) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateUserAdmin(SysUserAdmin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SysUserAdmin getUserAdminByAP(SysUserAdmin admin) {
		// TODO Auto-generated method stub
		return sysUserAdminMapper.getUserAdminByAP(admin);
	}

	@Override
	public SysUserAdmin getAdminByAP(SysUserAdmin admin) {
		// TODO Auto-generated method stub
		return sysUserAdminMapper.getAdminByAP(admin);
	}


}
