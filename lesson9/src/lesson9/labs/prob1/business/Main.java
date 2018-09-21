package lesson9.labs.prob1.business;

import lesson9.labs.prob1.dataaccess.DataAccess;
import lesson9.labs.prob1.dataaccess.DataAccessFacade;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

//	Member Info: ID: 1002, name: Drew Stevens, 702-998-2414 (1435 Channing Ave, Palo Alto, 94301),
//	Member Info: ID: 1001, name: Andy Rogers, 641-223-2211 (5001 Venice Dr., Los Angeles, 93736)]

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement
//		return mems.stream().filter(x -> x.getAddress().getZip().contains("3")).map(x -> x.getMemberId()).collect(Collectors.toList());
//		OR
	return mems.stream().filter(x -> x.getAddress().getZip().contains("3")).map(LibraryMember::getMemberId).collect(Collectors.toList());

	}
	//Returns a list of all isbns of books having at least two copies
		public static List<String> allHavingAtLeastTwoCopies() {
			DataAccess da = new DataAccessFacade();
			Collection<Book> books = da.readBooksMap().values();
			List<Book> bs = new ArrayList<>();
			bs.addAll(books);

			//implement
//			return bs.stream().filter(x -> x.getCopies().length >= 2).map(Book::getIsbn).collect(Collectors.toList());
//			OR
		return bs.stream().filter(x -> x.getCopies().length >= 2).map(x -> x.getIsbn()).collect(Collectors.toList());

		}
	
	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement
		return bs.stream().filter(x -> x.getAuthors().size()>= 2).map(x -> x.getIsbn()).collect(Collectors.toList());
		
		}

}
