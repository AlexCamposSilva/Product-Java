package Program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Produto " + i + 1 + "daodos: ");
			System.out.print("Comum, usado ou importado (c / u / i) ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'c') {
				Product product = new Product(name, price);
				list.add(product);

			}
			if (ch == 'u') {
				System.out.print("Data de Fabricação: ");
				LocalDate manufateDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product product = new UsedProduct(name, price, manufateDate);

				list.add(product);

			}
			if (ch == 'i') {
				System.out.print("Taxa Alfandega: ");
				double customsFee = sc.nextDouble();

				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);

			}

		}

		System.out.println("");
		System.out.println("Etiqueta de preços");

		for( Product product : list){
			System.out.println(product.pricetag());
		}
		
		
		sc.close();

	}

}
