package com.poc.product.controller;

import static lombok.AccessLevel.PRIVATE;

import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
@NoArgsConstructor(access = PRIVATE)
public class StatusController {

	@GetMapping
	public String status() {
		return "OK";
	}
}