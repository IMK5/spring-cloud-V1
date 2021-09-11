package com.imk.tn.currencyconfig.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@ConfigurationProperties("currency-config")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConfigBean {
	
	// We have tu use the same properties name , see application.properties file
	private int maximum;
	private int minimum;

}
