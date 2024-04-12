/*
3. Write a program by creating an "Employee" class having the following methods
and print the final salary.
a. 'getInfo()' which takes the salary, number of hours of work per day of
employee as parameter
b. 'AddSal()' which adds $10 to salary of the employee if it is less
than $500.
c. 'AddWork()' which adds $5 to salary of employee if the number of hours of
work per day is more than 6 hours.
 */

package javaassignment3;

import java.util.Scanner;

public class Employee {
	private double salary;
	private double hoursWorkedPerDay;

	public void getInfo(double salary, double hoursWorkedPerDay) {
		this.salary = salary;
		this.hoursWorkedPerDay = hoursWorkedPerDay;
	}

	public void addSal() {
		if (salary < 500) {
			salary += 10;
		}
	}

	public void addWork() {
		if (hoursWorkedPerDay > 6) {
			salary += 5;
		}
	}

	public void printFinalSalary() {
		System.out.println("Final Salary: $" + salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Enter the salary: $");
		double salary = sc.nextDouble();
		System.out.print("Enter the number of hours worked per day: ");
		double hoursWorkedPerDay = sc.nextDouble();

		employee.getInfo(salary, hoursWorkedPerDay);

		employee.addSal();
		employee.addWork();

		employee.printFinalSalary();
	}
}