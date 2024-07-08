package com.lalithya.employeecrud;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeecrudApplication implements CommandLineRunner {
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeecrudApplication.class, args);
	}

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void run(String... args) throws Exception {
		Scanner s = new Scanner(System.in);

		int choice;
		do {
			System.out.println("Press 1 to Add Employee \n 2 to Update Employe\n 3 to Delete Employee\n 4 to Display Employee Details By ID\n 5 to exit");
			choice = s.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter new ID");
					int id = s.nextInt();
					System.out.println("Enter new name: ");
					String name = s.next();
					System.out.println("Enter new department: ");
					String department = s.next();
					Employee emp = new Employee();
					emp.createemployeeobj(id, name, department);
					this.employeeService.addEmployee(emp);
					break;
				case 2:
					System.out.println("Enter ID to update");
					int id1 = s.nextInt();
					System.out.println("Enter new name: ");
					String name1 = s.next();
					System.out.println("Enter new department: ");
					String department1 = s.next();
					this.employeeService.updateEmployee(id1, name1, department1);
					break;
				case 3:
					System.out.println("Enter ID to delete");
					int id2 = s.nextInt();
					this.employeeService.deleteEmployee(id2);
					break;
				case 4:
					System.out.println("Enter ID to display");
					int id3 = s.nextInt();
					Employee obj = this.employeeService.getbyid(id3);
					System.out.println(obj);
					break;
				case 5:
					System.out.println("Thank you for using Employee Database!!!");
			}
		} while(choice != 5);

	}
}