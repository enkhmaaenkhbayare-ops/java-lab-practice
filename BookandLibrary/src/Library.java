
public class Library {
	
	private Book[] book = new Book[10];
	
	public Library() {
		for (int i = 0; i < 10; i++) {
			Book newBook = new Book();
			newBook.state = 0;
			book[i] = newBook;
		}
	}
	
	public void borrow(int n) {
		if (n > 9 || n < 0) {
			System.out.println("Invalid book number.");
		}
		else if (book[n-1].state == 1) {
			System.out.println("Book " + n + " is already borrowed.");
		} 
		else {
			book[n-1].state = 1;
			System.out.println("Book " + n + " borrowed.");
		}
	}
	public void returnBook(int n) {
		if (book[n-1].state == 0) {
			System.out.println("Book " + n + " is already returned.");
		} else {
			book[n-1].state = 0;
			System.out.println("Book " + n + " returned.");
		}
	}
}
