package com.club.web.service;

import com.club.web.model.SysUserAdmin;

public interface SysUserAdminService {
	
	public void addUserAdmin(SysUserAdmin admin);
	
	public void updateUserAdmin(SysUserAdmin admin);
	
	public SysUserAdmin getUserAdminByAP(SysUserAdmin admin);
	
	public SysUserAdmin getAdminByAP(SysUserAdmin admin);
}
