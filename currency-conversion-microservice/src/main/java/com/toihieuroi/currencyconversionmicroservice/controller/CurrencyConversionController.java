package com.toihieuroi.currencyconversionmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.toihieuroi.currencyconversionmicroservice.CurrencyExchangeServiceProxy;
import com.toihieuroi.currencyconversionmicroservice.response.entity.CurrencyConversion;

@RestController
public class CurrencyConversionController {
	@Autowired
	private Gson gson;
	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	@GetMapping("/currency")
	public CurrencyConversion convertCurrency(@RequestParam String from, @RequestParam String to,
			@RequestParam int quantity) {
		final String uri = "http://localhost:8000/exchange?from=" + from + "&to=" + to;

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		JsonElement element = gson.fromJson(result, JsonElement.class);
		JsonObject exchangeValue = element.getAsJsonObject();
		int port = Integer.valueOf(exchangeValue.get("port").getAsString());
		int conversionMultiple = Integer.valueOf(exchangeValue.get("conversionMultiple").getAsString());
		return new CurrencyConversion(from, to, conversionMultiple, quantity, quantity * conversionMultiple, port);

	}
}
