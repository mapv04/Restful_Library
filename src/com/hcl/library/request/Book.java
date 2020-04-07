package com.hcl.library.request;


import com.hcl.library.enums.request.StatusBook;

import lombok.Data;

@Data
public class Book {
	private int id;
	private String name;
	private String isbn;
	private String editorial;
	private String edition;
	private String category;
	private String lenguage;
	private String bookCover;
	private StatusBook status;	
}
