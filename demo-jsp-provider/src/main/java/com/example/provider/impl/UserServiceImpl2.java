package com.example.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.example.commoninterface.bean.User;
import com.example.commoninterface.bean.UserAddress;
import com.example.commoninterface.service.UserService;
import com.example.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Service(version = "2.0.0") //注意,这个是dubbo的注解,不是spring的,暴露服务
public class UserServiceImpl2 implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....new...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return Arrays.asList(address1,address2);
	}

	@Override
	public List<User> selectUser() {
		return userMapper.selectUser();
	}

}
