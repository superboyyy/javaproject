package accountclass;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Account[] account = new Account[10];

        for (int i = 0; i < account.length; i++) {
            account[i] = new Account();
            account[i].setId(i);
            account[i].setBalance(100);
        }


        while (true) {
            System.out.println("Enter an id: ");
            int id = in.nextInt();
            if (id < 1 || id > 10) {
                System.out.println("Please enter a correct id: ");
                continue;
            }

            boolean t = true;
            while (t) {
                mainMenu();
                System.out.println("Enter a choice: ");
                int choice = in.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + account[id].getBalance());
                        break;
                    case 2:
                        System.out.println("Enter an amount to withdraw: ");
                        int withdrawAmount = in.nextInt();

                        if (withdrawAmount >= account[id].getBalance()) {
                            System.out.println("The amount you input is too large!");
                        }
                        else
                            account[id].withDraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter an amount to deposit: ");
                        int depositAmount = in.nextInt();

                        if (depositAmount > 0)
                            account[id].deposit(depositAmount);
                        else
                            System.out.println("The amount is invalid!");
                        break;
                    case 4:
                        t = false;
                }
            }


        }
    }

    public static void mainMenu() {
        System.out.println("Main Menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
}
