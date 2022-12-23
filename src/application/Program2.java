package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDAO departmentDAO = DaoFactory.createDepartmentDAO();
		
		System.out.println("### TEST 1: department insert() ###");
		Department newDepartment = new Department(null, "Sports");
		departmentDAO.insert(newDepartment);
		System.out.println("Inserted: New id = " + newDepartment.getId());
		
		System.out.println("\n### TEST 2: department findById() ###");
		Department department = departmentDAO.findById(3);
		System.out.println(department);
		
		System.out.println("\n### TEST 3: department update() ###");
		department = departmentDAO.findById(6);
		department.setName("Cooking");
		departmentDAO.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n### TEST 4: department deleteById() ###");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDAO.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
		
		System.out.println("\n### TEST 5: department findAll() ###");
		List<Department> list = new ArrayList<>();
		list = departmentDAO.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}

	}

}
