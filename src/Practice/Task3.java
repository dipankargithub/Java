import Transaction.Transaction;

import java.util.ArrayList;
import java.util.Scanner;

    public class Task3 {
        private static ArrayList<Transaction> transactionHistory = new ArrayList<Transaction>();
        private static Scanner scanner = new Scanner(System.in);
        private static int userId;
        private static int userPin;
        private static boolean loggedIn = false;
        private static int balance = 1000; // initial balance

        public static void main(String[] args) {
            // initialize user id and pin
            userId = 123456;
            userPin = 1234;

            // prompt for user id and pin
            System.out.print("Enter user id: ");
            int inputId = scanner.nextInt();
            System.out.print("Enter user pin: ");
            int inputPin = scanner.nextInt();

            // authenticate user
            if (inputId == userId && inputPin == userPin) {
                loggedIn = true;
                System.out.println("Welcome to the ATM!");
                displayMenu();
            } else {
                System.out.println("Invalid user id or pin.");
            }
        }

        public static void displayMenu() {
            while (loggedIn) {
                System.out.println("\nPlease select an option:");
                System.out.println("1. View balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. Transaction history");
                System.out.println("6. Quit");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        viewBalance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        transfer();
                        break;
                    case 5:
                        viewTransactionHistory();
                        break;
                    case 6:
                        loggedIn = false;
                        System.out.println("Thank you for using the ATM.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }

        public static void viewBalance() {
            System.out.println("Your balance is: $" + balance);
        }

        public static void deposit() {
            System.out.print("Enter amount to deposit: $");
            int amount = scanner.nextInt();
            balance += amount;
            Transaction transaction = new Transaction("deposit", amount);
            transactionHistory.add(transaction);
            System.out.println("$" + amount + " deposited successfully.");
        }

        public static void withdraw() {
            System.out.print("Enter amount to withdraw: $");
            int amount = scanner.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                Transaction transaction = new Transaction("withdrawal", amount);
                transactionHistory.add(transaction);
                System.out.println("$" + amount + " withdrawn successfully.");
            }
        }

        public static void transfer() {
            System.out.print("Enter recipient user id: ");
            int recipientId = scanner.nextInt();
            System.out.print("Enter amount to transfer: $");
            int amount = scanner.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                Transaction transaction = new Transaction("transfer", amount);
                transactionHistory.add(transaction);
                System.out.println("$" + amount + " transferred to user " + recipientId + " successfully.");
            }
        }

        public static void viewTransactionHistory() {
            if (transactionHistory.size() == 0) {
                System.out.println("No transaction history");
            }
            System.out.println("THANK YOU VISIT AGAIN!! ");
        }
    }
