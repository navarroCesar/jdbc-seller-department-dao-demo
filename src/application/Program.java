package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sd = DaoFactory.createSellerDao();

		System.out.println("\n==== TEST: seller findById ====");
		Seller seller = sd.findById(3);
		System.out.println(seller);

		System.out.println("\n==== TEST: seller findByDepartment ====");
		Department dep = new Department(2, null);
		List<Seller> list = sd.findByDepartment(dep);

		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println("\n==== TEST: seller findAll ====");
		list = sd.findAll();

		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println("\n==== TEST: seller insert ====");
		Seller batman = new Seller(null, "Bruce Wayne", "bruce.wayne@wayneenterprises.com", new Date(), 40000.0, dep);
		sd.insert(batman);
		System.out.println("Inserted! New Id = " + batman.getId());

		System.out.println("\n==== TEST: seller update ====");
		seller = sd.findById(1);
		seller.setName("Clark Kent");
		seller.setEmail("clark@gmail.com");
		sd.update(seller);
		System.out.println(seller);
	}

}
