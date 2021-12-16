package EmployePayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployPayrollService {

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	List<EmployeePayRollData> employeepayrollList;

	public EmployPayrollService(List<EmployeePayRollData> employeepayrollList) {
		super();
		this.employeepayrollList = employeepayrollList;
	}

	void readEmployeePayrollData(Scanner ConsoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id = ConsoleInputReader.nextInt();

		System.out.println("Enter Employee Name: ");
		String name = ConsoleInputReader.next();

		System.out.println("Enter Employee Salary: ");
		double salary = ConsoleInputReader.nextDouble();
		employeepayrollList.add(new EmployeePayRollData(id, name, salary));
	}

	void writeEmployeeData() {
		System.out.println("\n Writng Employee Payroll Roaster to Console \n" + employeepayrollList);
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayRollData> employeepayrollList = new ArrayList<>();
		
		EmployPayrollService employPayrollService = new EmployPayrollService(employeepayrollList);
		
		Scanner ConsoleInputReader = new Scanner(System.in);	
		employPayrollService.readEmployeePayrollData(ConsoleInputReader);
		employPayrollService.writeEmployeeData();
	}
}
