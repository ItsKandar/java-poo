package com.example.slotmachine;

public class Symbol {
    private String name;
    private int value;
    private double probability;

    public Symbol(String name, int value, double probability) {
        this.name = name;
        this.value = value;
        this.probability = probability;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public double getProbability() {
        return probability;
    }

    @Override
    public String toString() {
        return name;
    }
}