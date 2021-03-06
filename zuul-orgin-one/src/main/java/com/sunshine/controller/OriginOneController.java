package com.sunshine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <sunshine> yangsonglin@maoyan.com
 * @date 2018/11/8 下午4:26
 */
@RestController
@RequestMapping("/origin/one")
public class OriginOneController {

	@GetMapping("/hello")
	public String sayHello() {
		return String.format("%s-%s", "originOne", String.valueOf(System.currentTimeMillis()));
	}
}
