/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;

import java.util.Scanner;

public class CarShopping {

    private static Scanner kb = new Scanner(System.in);
    // Create static Scanner Object call it kb

    public static void main(String[] args) {
        int totalCost = 0;
        System.out.println(totalCost);

       totalCost += base();
        System.out.println(totalCost);
        totalCost += automaticWindows();
        System.out.println(totalCost);

        totalCost += keylessEntry();
        System.out.println(totalCost);
        
        
        
        
        totalCost += onStarSystem();
        System.out.println(totalCost);
        
        
        
        
        totalCost += ABS();
        System.out.println(totalCost);
        
        
        
        totalCost += selfDestruct();
        System.out.println(totalCost);
        
        
        
        
        totalCost += ejectoSeato();
        System.out.println(totalCost);
    }

    public static int base() {
        System.out.println("Our inventory:");
        System.out.println("Model 1 - $15,000");
        System.out.println("Model 2 - $24,000");
        System.out.println("Model 3 - $40,000");
        System.out.println("Which base model did the customer choose?"
                + "(enter full model name ex. Model 1): ");

        String model = kb.nextLine();

        if (model.equalsIgnoreCase("Model 1")) {
            return 15000;
        } else if (model.equalsIgnoreCase("Model 2")) {
            return 24000;
        } else if (model.equalsIgnoreCase("Model 3")) {
            return 40000;
        } else {
            return 0;
        }
    }

    public static int automaticWindows() {
        System.out.println("Test");
        System.out.print("Automatic Windows for $500? (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equals("y")) {
            return 500;
        } else {
            return 0;
        }

    }

    public static int keylessEntry() {
        System.out.print("Remote keyless entry for $1000? (y/n)");
        String answer = kb.nextLine();
        if (answer.equals("y")) {
            return 1000;
        } else {
            return 0;
        }
    }

    public static int onStarSystem() {
        System.out.print("OnStar System for $1000? (y/n)");
        String answer = kb.nextLine();
        if (answer.equals("y")) {
            return 1000;
        } else {
            return 0;
        }
    }

    public static int ABS() {

        System.out.print("Anti Lock Breaks for $500? (y/n)");
        String answer = kb.nextLine();
        if (answer.equals("y")) {
            return 500;
        } else {
            return 0;
        }
    }

    public static int selfDestruct() {

        System.out.print("Self Destruct for $5? (y/n)");
        String answer = kb.nextLine();
        if (answer.equals("y")) {
            return 5;
        } else {
            return 0;
        }

    }

    public static int ejectoSeato() {

        System.out.print(" Ejecto Seato for $8000 cuz? (y/n)");
        String answer = kb.nextLine();
        if (answer.equals("y")) {
            return 8000;
        } else {
            return 0;
        }
    }

}
