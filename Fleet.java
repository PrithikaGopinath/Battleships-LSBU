package battleships;

import java.util.ArrayList;
import java.util.List;

import battleships.ship.Aeroplane;
import battleships.ship.AircraftCarrier;
import battleships.ship.Battleship;
import battleships.ship.Destroyer;
import battleships.ship.Submarine;

public class Fleet implements Cloneable {

    private List<Ship> ships = new ArrayList<>();

    private int battleships;
    private int destroyers;
    private int submarines;
    private int aeroplanes;
    private int aircraftCarriers;

    public Fleet(int battleships, int destroyers, int submarines, int aeroplanes, int aircraftCarriers) {

        this.battleships = battleships;
        this.destroyers = destroyers;
        this.submarines = submarines;
        this.aeroplanes = aeroplanes;
        this.aircraftCarriers = aircraftCarriers;
        for (int i = 0; i < battleships; i++) {
            this.ships.add(new Battleship());
        }
        for (int i = 0; i < destroyers; i++) {
            this.ships.add(new Destroyer());
        }
        for (int i = 0; i < submarines; i++) {
            this.ships.add(new Submarine());
        }
        for (int i = 0; i < aeroplanes; i++) {
            this.ships.add(new Aeroplane());
        }
        for (int i = 0; i < aircraftCarriers; i++) {
            this.ships.add(new AircraftCarrier());
        }
    }

    public List<Ship> getShips() {
        return ships;
    }

    @Override
    public Fleet clone() {
        return new Fleet(battleships, destroyers, submarines, aeroplanes, aircraftCarriers);
    }

}
