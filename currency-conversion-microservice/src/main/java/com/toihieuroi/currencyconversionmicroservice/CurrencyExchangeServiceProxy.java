package com.toihieuroi.currencyconversionmicroservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.toihieuroi.currencyconversionmicroservice.response.entity.CurrencyConversion;

@FeignClient(name = "forex-service")
@RibbonClient(name = "forex-service")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("/exchange")
	public CurrencyConversion retrieveExchangeValue(@RequestParam("from") String from, @RequestParam("to") String to);
}
