package com.bhushan.SpringAnnotedImpl;

import org.springframework.stereotype.Component;

@Component
public class MediTek implements Processor {

	public void process() {
		System.out.println("I am also best in the Industry");

	}

}
