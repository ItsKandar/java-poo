package com.example.slotmachine;

import java.util.ArrayList;
import java.util.List;

public class SlotMachine {
    private List<Reel> reels;

    public SlotMachine(List<Reel> reels) {
        this.reels = reels;
    }

    public List<Symbol> spin() {
        List<Symbol> result = new ArrayList<>();
        for (Reel reel : reels) {
            result.add(reel.spin());
        }
        return result;
    }
}