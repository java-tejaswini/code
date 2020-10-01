package com.controllers;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.ExchangeValue;
import com.repository.ExchangeValueRepository;

@RestController
public class MyController {

	@GetMapping("/hello")
	public String message() {
		return "welcome";
	}

	@GetMapping("/currency-exchange-dummy/to/{to}/from/{from}")
	public ExchangeValue getConverionMultiple(@PathVariable String to, @PathVariable String from) {
		return new ExchangeValue(1, from, to, BigDecimal.valueOf(1000), 8000);
	}

	@Autowired
	ExchangeValueRepository repo;

	@Autowired
	Environment env;

	@GetMapping("/currency-exchange/to/{to}/from/{from}")
	public ExchangeValue getConverionMultiple_Actual(@PathVariable String to, @PathVariable String from) {
		Optional<ExchangeValue> optional = repo.findByValueFromAndValueTo(from, to);
		
		String value = env.getProperty("local.server.port");
		int port = Integer.parseInt(value);

		ExchangeValue exValue = optional.get();
		exValue.setPort(port);
		return exValue;
	}

}
