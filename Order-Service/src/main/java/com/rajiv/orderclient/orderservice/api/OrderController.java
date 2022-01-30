package com.rajiv.orderclient.orderservice.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/orderUpdate")
	public List<String> getItem() {
		return Stream.of("Laptop", "Mobile").collect(Collectors.toList());
	}
}
