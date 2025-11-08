import model.*;
import visitor.PriceVisitor;
import visitor.ServiceVisitor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] parts = {
                new Engine(),
                new Wheel(),
                new Body(),
                new Brake()
        };
        ServiceVisitor serviceVisitor = new ServiceVisitor();
        PriceVisitor priceVisitor = new PriceVisitor();

        while (true) {
            System.out.println("Welcome to CTO");
            System.out.println("1) Perform serving");
            System.out.println("2) Calculate total service cost");
            System.out.println("3) Service specific part");
            System.out.println("4) exit");
            System.out.println("choose:");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Invalid input");
                continue;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("\nPerforming full service-");
                    for (Car part : parts) {
                        part.accept(serviceVisitor);
                    }
                }

                case 2 -> {
                    System.out.println("\nCalculating service cost");
                    priceVisitor.resetCost();
                    for (Car part : parts) {
                        part.accept(priceVisitor);
                    }
                    System.out.println("\nTotal service cost: " + priceVisitor.getPrice());
                }

                case 3 -> {
                    System.out.println("\nAvailable parts:");
                    for (int i = 0; i < parts.length; i++) {
                        System.out.println((i + 1) + ". " + parts[i].getName());
                    }
                    System.out.print("Choose a part: ");
                    int partChoice;
                    try {
                        partChoice = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                        break;
                    }

                    if (partChoice < 1 || partChoice > parts.length) {
                        System.out.println("Invalid part choice");
                        break;
                    }

                    Car selected = parts[partChoice - 1];
                    System.out.println("1. Perform service\n2. Calculate cost");
                    System.out.print("Select operation: ");
                    int opChoice;
                    try {
                        opChoice = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                        break;
                    }

                    if (opChoice == 1) selected.accept(serviceVisitor);
                    else if (opChoice == 2) selected.accept(priceVisitor);
                    else System.out.println("Invalid operation.");
                }

                case 4 -> {
                    System.out.println("\nExit");
                    return;
                }

                default -> System.out.println("Invalid input.");
            }
        }
    }
}