package view;

import model.map.book.BookMap;

// Importar as classes utilizadas

public class Main {

	public static void main(String[] args) {

		BookMap bm = new BookMap();
		bm.addBook("123", "Book 1", "A1", 10);
		bm.addBook("13", "Book 1", "A1", 30);
		bm.addBook("321", "Book 3", "A5", 5);
		bm.addBook("444", "Book 4", "A2", 15);
		bm.addBook("14", "Book 4", "A2", 25);
		System.out.println(bm.sortByPrice());
		System.out.println(bm.sortByAuthor());
		bm.removeBook("Book 1");
		System.out.println(bm.sortByPrice());
		System.out.println(bm.getMostExpensiveBook());
		System.out.println(bm.getLeastExpensiveBook());
		System.out.println(bm.searchBooksByAuthor("A2"));

//		EventSchedule es = new EventSchedule();
//		es.addEvent(LocalDate.of(2022, Month.JULY, 15), "Event 1", "Attraction 1");
//		es.addEvent(LocalDate.of(2022, 7, 9), "Event 2", "Attraction 2");
//		es.addEvent(LocalDate.of(2000, Month.JANUARY, 12), "Event 0", "Attraction 4");
//		es.addEvent(LocalDate.of(2024, Month.JULY, 15), "Event 5", "Attraction 3");
//		es.addEvent(LocalDate.of(2024, Month.JULY, 6), "Event 10", "Attraction 2");
//		es.displayEvents();
//		es.getNextEvent();

//		CountWords cw = new CountWords();
//		cw.addWord("W3", 3);
//		cw.addWord("W1", 1);
//		cw.addWord("W5", 5);
//		cw.displayWords();
//		cw.removeWord("W1");
//		cw.displayWords();
//		System.out.println(cw.getMostFrequentWord());

//		ProductInventory pi = new ProductInventory();
//		pi.addProduct(1L, "Product 1", 10, 3);
//		pi.addProduct(2L, "Product 2", 11, 2);
//		pi.addProduct(3L, "Product 3", 4, 5);
//		pi.addProduct(4L, "err", 2.5, 10);
//		pi.addProduct(4L, "Product 4", 3.5, 4);
//		pi.displayProducts();
//		System.out.println(pi.calculateTotalPrice());
//		System.out.println(pi.getMostExpensiveProduct());
//		System.out.println(pi.getLeastExpensiveProduct());
//		System.out.println(pi.getProductWithHighestStockValue());

//		Dictionary dt = new Dictionary();
//		dt.addWord("W1", "W");
//		dt.addWord("W1", "WW");
//		dt.addWord("W2", "WW");
//		dt.addWord("W3", "WWW");
//		dt.displayWords();
//		dt.removeWord("WE");
//		dt.removeWord("W2");
//		dt.displayWords();
//		System.out.println(dt.findByWord("W3"));

//		ContactBook cb = new ContactBook();
//		cb.addContact("Contact 1", 1234);
//		cb.addContact("Contact 3", 4321);
//		cb.addContact("Contact 1", 123);
//		cb.addContact("Contact 2", 321);
//		cb.displayContacts();
//		cb.removeContact("Contact 2");
//		cb.displayContacts();
//		System.out.println(cb.findContactByName("Contact 3"));

//		StudentManager sm = new StudentManager();
//		sm.addStudent(1L, "S1", 9.35);
//		sm.addStudent(4L, "J1", 6.82);
//		sm.addStudent(2L, "A3", 8.21);
//		sm.addStudent(5L, "C3", 5.8);
//		sm.displayStudents();
//		sm.removeStudent(1L);
//		sm.displayStudents();
//		System.out.println(sm.sortByName());
//		System.out.println(sm.sortByGrade());

//		ProductSet ps = new ProductSet();
//		ps.addProduct(1L, "Z 1", 10);
//		ps.addProduct(2L, "P 2", 15);
//		ps.addProduct(5L, "B 5", 11);
//		ps.addProduct(3L, "F 3", 5);
//		ps.displayProducts();
//		System.out.println(ps.sortByName());
//		System.out.println(ps.sortByPrice());		

//		TaskSet ts = new TaskSet();
//		ts.addTask("Task 1", false);
//		ts.addTask("Task 2", false);
//		ts.addTask("Task 3", true);
//		ts.displayTasks();
//		System.out.println(ts.countTasks());
//		System.out.println(ts.getDoneTasks());
//		System.out.println(ts.getPendingTasks());
//		ts.markTaskAsCompleted("Task 1");
//		System.out.println(ts.getDoneTasks());
//		ts.markTaskAsPending("Task 3");
//		System.out.println(ts.getPendingTasks());

//		ContactBook cb = new ContactBook();
//		cb.addBook("Contact 1", 123);
//		cb.addBook("Contact 12", 12);
//		cb.addBook("Contact 22", 1234);
//		cb.displayContacts();
//		System.out.println(cb.searchByName("Contact 1"));
//		cb.updateContactName(123, "Contact 33");
//		cb.displayContacts();

//		UniqueWordsSet unq = new UniqueWordsSet();
//		unq.addWord("word");
//		unq.addWord("word 2");
//		System.out.println(unq.checkWord("word"));
//		unq.displayUniqueWords();
//		unq.removeWord("word 2");
//		System.out.println(unq.checkWord("word 2"));
//		unq.displayUniqueWords();

//		GuestList gl = new GuestList();
//		gl.addGuest("Guest 1", 123);
//		gl.addGuest("Guest 11", 123);
//		gl.addGuest("Guest 2", 1236);
//		gl.addGuest("Guest 3", 1234);
//		System.out.println(gl.countGuests());
//		gl.displayGuests();
//		gl.removeGuestByInvitationCode(123);
//		System.out.println(gl.countGuests());
//		gl.displayGuests();

//		NumberSorter nbs = new NumberSorter();
//		nbs.addNumber(10);
//		nbs.addNumber(1);
//		nbs.addNumber(5);
//		nbs.addNumber(20);
//		nbs.displayNumbers();
//		System.out.println(nbs.sortAsc());
//		System.out.println(nbs.sortDesc());

//		PersonList psl = new PersonList();
//		psl.addPerson("Person 1", 20, 1.80);
//		psl.addPerson("Person 2", 18, 1.70);
//		psl.addPerson("Person 3", 25, 1.73);
//		psl.addPerson("Person 4", 30, 1.67);
//		System.out.println(psl.sortByAge());
//		System.out.println(psl.sortByHeight());

//		IntegerSum intgSum = new IntegerSum();
//		intgSum.addNumber(1);
//		intgSum.addNumber(3);
//		intgSum.addNumber(5);
//		intgSum.addNumber(7);
//		System.out.println(intgSum.calculateSum());
//		System.out.println(intgSum.findMax());
//		System.out.println(intgSum.findMin());
//		intgSum.displayNumbers();

//		TaskList objTaskList = new TaskList();
//		objTaskList.addTask("Test");
//		objTaskList.addTask("Test 2");
//		objTaskList.addTask("Test 3");
//		System.out.println(objTaskList.totalTasks));
//		objTaskList.getAllTasksDescriptions();

//		Cart cart = new Cart();
//		cart.addToCart("Item 01", 13.55, 2);
//		cart.addToCart("Item 02", 10, 7);
//		System.out.println(cart.calculateTotalPrice());
//		cart.displayCartItems();

//		BookCatalog bookCatalog = new BookCatalog();
//		bookCatalog.addBook("Book 1", "Author 2", 2004);
//		bookCatalog.addBook("Book 2", "Author 4", 2001);
//		bookCatalog.addBook("Book 3", "Author 2", 2002);
//		bookCatalog.addBook("Book 1", "Author 1", 2000);
//		bookCatalog.addBook("Book 4", "Author 3", 2003);
//		System.out.println(bookCatalog.searchBooksByAuthor("Author 4"));
//		System.out.println(bookCatalog.searchBooksByYearRange(2002, 2002));
//		System.out.println(bookCatalog.findBookByTitle("Book 1"));

	}

}