package com.xue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xue.dao.RoncooUserDao;
import com.xue.entity.RoncooUser;
import com.xue.service.RoncooUserService;

@Service(value="roncooUserService")
public class RoncooUserServiceImpl implements RoncooUserService{
	
	@Autowired
	private RoncooUserDao roncooUseDao;
	
	@Override
	public int insert(RoncooUser roncooUser) {
		return roncooUseDao.insert(roncooUser);
	}

	@Override
	public int deleteById(int id) {
		return 0;
	}

	@Override
	public int updateById(RoncooUser roncooUser) {
		
		return 0;
	}

	@Override
	public RoncooUser selectById(int id) {
		return roncooUseDao.selectById(id);
	}

}
