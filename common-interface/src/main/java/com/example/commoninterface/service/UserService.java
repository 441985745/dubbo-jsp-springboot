package com.example.commoninterface.service;

import com.example.commoninterface.bean.User;
import com.example.commoninterface.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 * @author lfy
 *
 */
public interface UserService {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);

	public List<User> selectUser();

}
