package org.mp4parser.aj.runtime.internal.cflowstack;

public class ThreadStackFactoryImpl11 implements ThreadStackFactory {
    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactory
    public ThreadCounter getNewThreadCounter() {
        return new ThreadCounterImpl11();
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactory
    public ThreadStack getNewThreadStack() {
        return new ThreadStackImpl11();
    }
}

