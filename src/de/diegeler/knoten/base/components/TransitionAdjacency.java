package de.diegeler.knoten.base.components;

public interface TransitionAdjacency {
    /**
     * Whether t1 is adjacent to t2. This is non-symmetric (dock1 may be adjacent
     * to dock2, but dock2 may not be adjacent to dock1), implying directionality in
     * this case.
     * @param t1 Entry
     * @param t2 Exit
     * @return whether adjacence is given.
     */
    boolean isAdjacent(Transition t1, Transition t2);
}
