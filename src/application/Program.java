package application;

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

	}

}
