package de.diegeler.knoten.base.components;


import java.util.Optional;

/**
 * Place where transitions are linked together at "docks" and where the relationship
 * between these docks is defined.
 */
public interface Node {
    void registerTransition(int dockIndex);

    /**
     * Transition is returned when one has been defined for this dock.
     * @param dock Dock number
     * @return Optional transition
     */
    Optional<Transition> getTransition(int dock);

    TransitionAdjacency getAdjacencies();
}
