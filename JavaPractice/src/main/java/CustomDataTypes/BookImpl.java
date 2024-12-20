package CustomDataTypes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookImpl {

	public static void main(String[] args) {

		LocalDate dt = LocalDate.of(2023, 1, 23);

		System.out.println(dt);

		Book b1 = new Book("Name1", "Author1", dt, 200.45f);

		System.out.println(b1);

		Book b2 = new Book("Name2", "Author2", LocalDate.of(2021, 1, 23), 2100.45f);
		Book b3 = new Book("Name3", "Author3", LocalDate.of(2022, 1, 23), 1300.45f);
		Book b4 = new Book("Name4", "Author4", LocalDate.of(2024, 1, 23), 400.45f);

		List<Book> list = new ArrayList<>();

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);

		for(Book b: list) {
			System.out.println(b);
		}

		float result = 0;

		for(Book b: list) {
			result = result + b.getPrice();
		}

		System.out.println(result);

		float highestPrice = 0;
		int indexOfHighestPricedBook = 0;
		int startIndex = 0;

		for(Book b: list) {

			if(b.getPrice()>=highestPrice) {
				highestPrice = b.getPrice();
				indexOfHighestPricedBook = startIndex;
			}

			startIndex++;

		}

		System.out.println(list.get(indexOfHighestPricedBook).getName()+"  "+ list.get(indexOfHighestPricedBook).getPrice());

	}

}
