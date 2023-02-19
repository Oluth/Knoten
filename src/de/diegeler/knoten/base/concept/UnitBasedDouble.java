package de.diegeler.knoten.base.concept;

import de.diegeler.knoten.base.components.Edge;

public class UnitBasedDouble {
    private final double value;
    private final Unit unit;

    public UnitBasedDouble(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    public enum Unit {
        M, FT
    }
}
