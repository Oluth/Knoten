package de.diegeler.knoten.base.components;

public interface Transition {
    /**
     * Transitions are supposed to have only one input edge.
     * @param edge Edge ending here.
     */
    void setInputEdge(Edge edge);

    Edge getInputEdge();

    boolean hasInputEdge();


}
