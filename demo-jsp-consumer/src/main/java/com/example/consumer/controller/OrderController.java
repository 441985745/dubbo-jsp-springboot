package com.example.consumer.controller;
import com.example.commoninterface.bean.UserAddress;
import com.example.commoninterface.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;

	Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@RequestMapping("/initOrder")
	@ResponseBody
	public List<UserAddress> initOrder(@RequestParam("uid") String userId) {

		logger.info("记录日志===========================");
		return orderService.initOrder(userId);
	}

	@RequestMapping("/test")
	public String test(Model model){
		model.addAttribute("test","test");
		return "index";
	}

	@RequestMapping("/selectUser")
	public String selectUser(Model model){
		model.addAttribute("test",orderService.selectUser());
		return "index";
	}
}
