package com.imk.tn.currencyconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.beans.BeansEndpointAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imk.tn.currencyconfig.bean.ConfigBean;
import com.imk.tn.currencyconfig.bean.CurrencyConfig;

import lombok.Getter;
import lombok.Setter;

@RestController
public class CurrencyConfigController {
	
	
	@Autowired
	@Setter
	@Getter
	private ConfigBean config ;
	
	@GetMapping("/currencyConf")
	public CurrencyConfig getCurrencyConfig() {
		return new CurrencyConfig(config.getMaximum(), config.getMinimum());
		
		
	}

}
