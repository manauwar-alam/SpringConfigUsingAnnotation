package com.matrix.spring.di;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService  implements FortuneService{

	public String getFortune() {
		
		return "Today is your Happy day";
	}

}
