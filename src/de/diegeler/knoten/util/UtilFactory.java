package de.diegeler.knoten.util;

import java.io.PrintStream;

public class UtilFactory {
    public Logger createLogger(final Class clazz, final PrintStream output) {
        if(clazz == null) {
            throw new IllegalArgumentException("null Class in UtilFactory!");
        }
        return new Logger() {
            private final PrintStream stream = output;
            private final Class loggedClass = clazz;
            public void log(String message) {
                output.println("[" + clazz.getName() + "]: " + message);
            }
        };
    }
}
