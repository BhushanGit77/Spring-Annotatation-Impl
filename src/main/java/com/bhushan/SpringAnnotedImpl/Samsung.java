package com.bhushan.SpringAnnotedImpl;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	@Autowired
	Processor proc;

	public Processor getProc() {
		return proc;
	}


	public void setProc(Processor proc) {
		this.proc = proc;
	}


	public void config() {	
		System.out.println("CPU Octa Core, 12 GB, 64MP");
		proc.process();
	}
}
