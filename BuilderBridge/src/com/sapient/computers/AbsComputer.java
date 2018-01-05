package com.sapient.computers;

import com.sapient.processors.IProcessor;

public class AbsComputer {

	protected IProcessor pro;

	public AbsComputer() {
		super();
	}

	public void setPro(IProcessor pro) {
		this.pro = pro;
	}

}