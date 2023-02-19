package de.diegeler.knoten.base.components;

import de.diegeler.knoten.base.concept.UnitBasedDouble;

import java.util.Collection;

public interface EdgeFactory<T extends Edge> {

    void setTransitions(Collection<Transition> transitions);
    T create(UnitBasedDouble length);

}
