package de.diegeler.knoten.base.components;

public interface NodeFactory {
    void setAdjacencies(TransitionAdjacencyBuilder adjacencies);
    Node create();
}
