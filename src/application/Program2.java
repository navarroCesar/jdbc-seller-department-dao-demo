package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao dd = DaoFactory.createDepartmentDao();

		System.out.println("\n==== TEST: department insert ====");
		Department dep = new Department(null, "Food");
		dd.insert(dep);
		System.out.println(dep);

		System.out.println("\n==== TEST: department update ====");
		dep.setName("Drinks");
		dd.update(dep);
		System.out.println(dep);

		System.out.println("\n==== TEST: department findById ====");
		dep = dd.findById(2);
		System.out.println(dep);

		System.out.println("\n==== TEST: department findAll ====");
		List<Department> list = dd.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

	}

}
