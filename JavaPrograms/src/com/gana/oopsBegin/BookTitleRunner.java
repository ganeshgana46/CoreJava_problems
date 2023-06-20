package com.gana.oopsBegin;

public class BookTitleRunner {

	public static void main(String[] args) {
		BookTitle title = new BookTitle();
		title.setTitle("Book Name : The Art Of computer programming");
		System.out.println(title.getTitle());
		title.setNoOfCopies(100);
		System.out.println("Number of copies : " + title.getNoOfCopies());
		title.setTitle("Book Name : effective java");
		System.out.println(title.getTitle());
		title.setNoOfCopies(180);
		System.out.println("Number of copies : " + title.getNoOfCopies());
		title.setTitle("Book Name : Clean code");
		System.out.println(title.getTitle());
		title.setNoOfCopies(150);
		System.out.println("Number of copies : " + title.getNoOfCopies());
		

		

		

	}

}
