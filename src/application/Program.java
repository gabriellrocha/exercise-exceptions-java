package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = input.nextInt();
		System.out.print("Holder: ");
		String holder = input.next();
		System.out.print("Initial balance: ");
		double initialBalance = input.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = input.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		System.out.print("Enter amount for withdraw: ");
		double amount = input.nextDouble();
		try {
			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());;
		}
		
		input.close();
	}
}
