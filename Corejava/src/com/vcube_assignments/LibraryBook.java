package com.vcube_assignments;
/* * 13-08-2026
 * -------------
  	Library Book Management :
 	-------------------------
	Create a class LibraryBook to store book details.
	Variables:
	---------
* 	bookId 
* 	bookTitle 
* 	authorName 
* 	availableCopies
* 	libraryName 
* 	librarianName
 	Methods:
 	-------
* 	displayBookDetails() – Display all book details.
* 	displayLibraryDetails() – Display library name and librarian name.
* 	changeLibrarian() – Change the librarian name.
	1. Create two LibraryBook objects.
	2. Assign values to all variables.
	3. D	isplay all the library details.
 */
public class LibraryBook {
	int bookId;
	String bookTitle;
	String authorName;
	int avaCopies;
	static String libName;
	static String librarianName;
		void displayBookDetails() {
		System.out.println("BookId : "+bookId);
		System.out.println("BookTitle : "+bookTitle);
		System.out.println("AuthorName : "+authorName);
		System.out.println("Available Copies : "+avaCopies);
	}
	void displayLibraryDetails() {
		System.out.println("Library Name : "+libName);
		System.out.println("Librarian Name : "+librarianName);
	}
	void changeLibrarian(String name) {
		librarianName=name;
		System.out.println("Updated Librarian name : "+librarianName);
	}
	public static void main(String[] args) {
		libName="Coforge Library";
		librarianName="Jaya Ramudu";
		LibraryBook l1=new LibraryBook();
		l1.bookId=1290;
		l1.bookTitle="You Can";
		l1.authorName="Something";
		l1.avaCopies=18;
		l1.displayLibraryDetails();
		l1.displayBookDetails();
		System.out.println();
		
		
//		librarianName="ashu";
		LibraryBook l2=new LibraryBook();
		l2.bookId=5321;
		l2.bookTitle="Ayodhya Cherina Krishna";
		l2.authorName="Srinivas Kamisetty";
		l2.avaCopies=39;
		l1.displayLibraryDetails();
		l2.displayBookDetails();
		l2.changeLibrarian("Laxmi");
	}

}
