package com.example.slotmachine;

import java.util.List;
import java.util.Random;

public class Reel {
    private List<Symbol> symbols;
    private Random random;

    public Reel(List<Symbol> symbols) {
        this.symbols = symbols;
        this.random = new Random();
    }

    public Symbol spin() {
        double rand = random.nextDouble();
        double cumulativeProbability = 0.0;

        for (Symbol symbol : symbols) {
            cumulativeProbability += symbol.getProbability();
            if (rand <= cumulativeProbability) {
                return symbol;
            }
        }

        return symbols.get(symbols.size() - 1); // Fallback in case of rounding errors
    }
}
