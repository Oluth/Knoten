package de.diegeler.knoten.base.components;

import de.diegeler.knoten.base.concept.UnitBasedDouble;

import java.util.concurrent.atomic.AtomicBoolean;

public interface Edge {
    UnitBasedDouble getLength();

    /**
     * Whether this edge can be entered at time of request.
     * @return AtomicBoolean
     */
    AtomicBoolean isClaimed();

    /**
     * Registers a transition
     * @param transition
     */
    void registerTransition(Transition transition);
    void unregisterTransition(Transition transition);

}
