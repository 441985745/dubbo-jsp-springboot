package com.example.commoninterface.service;


import com.example.commoninterface.bean.UserAddress;

import java.util.List;

public interface OrderService {
	public List<UserAddress> initOrder(String userId);
}
