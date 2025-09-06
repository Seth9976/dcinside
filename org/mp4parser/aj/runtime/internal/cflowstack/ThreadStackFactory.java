package org.mp4parser.aj.runtime.internal.cflowstack;

public interface ThreadStackFactory {
    ThreadCounter getNewThreadCounter();

    ThreadStack getNewThreadStack();
}

