package com.capgemini.spring.provider;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Lazy
@Component("provider")
public class GoodMorningMessageProvider implements MessageProvider {

	@Override
	public String getMessage()
	{

		return "good Morning";
	}


}