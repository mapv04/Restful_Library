package com.hcl.library.response;

import java.time.LocalDate;

import com.hcl.library.response.enums.StatusLoan;

import lombok.Data;

@Data
public class LoanDetailsResponse {
	private int id;
	private String customerName;
	private String staffName;
	private LocalDate loanDate;
	private LocalDate returnDate;
	private StatusLoan status;
	//private List<BookResponse> books;
	
}
