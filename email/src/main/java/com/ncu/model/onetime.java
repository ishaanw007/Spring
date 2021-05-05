package com.ncu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class onetime {
	 @NotNull(message="is required")
		@Size(min=4,message="is required")
		 private String one;

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}
}
