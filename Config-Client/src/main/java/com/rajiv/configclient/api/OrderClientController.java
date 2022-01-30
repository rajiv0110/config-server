package com.rajiv.configclient.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class OrderClientController {
	@Autowired
	@Lazy
	private RestTemplate template;

	@Value("${order.provider.url}")
	private String url;

	@GetMapping("/order")
	public List<String> getOrder() {
		List<String> item = this.template.getForObject(url, List.class);
		return item;
	}

}
