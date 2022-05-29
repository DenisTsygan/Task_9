package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Players implements Serializable {
    private ArrayList<Player> players;

    Players() {
        players = new ArrayList<>();
    }

    public void add(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    @Override
    public String toString() {
        return "Players{" + players + '}';
    }


}
