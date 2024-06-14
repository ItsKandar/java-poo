package com.example.slotmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlotMachineApp {
    public static void main(String[] args) {
        List<Symbol> symbols = new ArrayList<>();
        symbols.add(new Symbol("S1", 20, 1.0 / 16));
        symbols.add(new Symbol("S2", 10, 1.0 / 12));
        symbols.add(new Symbol("S3", 6, 1.0 / 8));
        symbols.add(new Symbol("S4", 5, 1.0 / 6));
        symbols.add(new Symbol("S5", 4, 1.0 / 5));
        symbols.add(new Symbol("S6", 3, 1.0 / 4));
        symbols.add(new Symbol("S7", 2, 1.0 / 3));
        symbols.add(new Symbol("S8", 1, 1.0 / 3));
        symbols.add(new Symbol("S9", 0, 1.0 / 3));

        List<Reel> reels = new ArrayList<>();
        for (int i = 0; i < 5; i++) { // Assuming 5 reels
            reels.add(new Reel(symbols));
        }

        SlotMachine slotMachine = new SlotMachine(reels);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Appuyez sur entrée pour jouer, ou tapez 'exit' pour quitter:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            List<Symbol> result = slotMachine.spin();
            System.out.println("Resultat: " + result);
        }

        scanner.close();
        System.out.println("Merci d'avoir joué!");
    }
}