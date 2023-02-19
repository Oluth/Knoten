package de.diegeler.knoten.base.components;

import java.util.stream.Stream;

public interface TransitionAdjacencyBuilder extends TransitionAdjacency {
    void set(Transition t1, Transition t2);

    /**
     * The array contains all adjacencies from Edge[0] to Edge[1].
     * The relation is not symmetric; thus, directionality is implied.
     * @return all adjacencies
     */
    Stream<Edge[]> getAdjacencies();
}
