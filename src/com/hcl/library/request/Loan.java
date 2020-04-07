package com.hcl.library.request;

import java.util.List;

import lombok.Data;

@Data
public class Loan {
	private String customerCurp;
	private String staffUsername;
	private List<String> books;

}
