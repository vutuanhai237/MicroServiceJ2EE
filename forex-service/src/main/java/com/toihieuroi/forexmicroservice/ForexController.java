package com.toihieuroi.forexmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {

	@Autowired
	private ExchangeValueRepository exchangeValueRepo;
	@Autowired
	private Environment env;

	@GetMapping("/exchange")
	public ExchangeValue findExchangeValue(@RequestParam String from, @RequestParam String to) {

//		ExchangeValue exchangeValue = this.exchangeValueRepo.findByFromAndTo(from, to);
//		if (exchangeValue != null) {
//			exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
//		}
//		return exchangeValue;
		ExchangeValue exchangeValue = new ExchangeValue();
		exchangeValue.setConversionMultiple(100);
		exchangeValue.setFrom(from);
		exchangeValue.setTo(to);
		exchangeValue.setPort(8000);
		return exchangeValue;
	}
}
