package org.mp4parser.aj.runtime.internal.cflowstack;

import java.util.Stack;

public class ThreadStackFactoryImpl implements ThreadStackFactory {
    static class ThreadCounterImpl extends ThreadLocal implements ThreadCounter {
        static class Counter {
            protected int value;

            Counter() {
                this.value = 0;
            }
        }

        private ThreadCounterImpl() {
        }

        ThreadCounterImpl(ThreadStackFactoryImpl.1 threadStackFactoryImpl$10) {
        }

        @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter
        public void dec() {
            Counter threadStackFactoryImpl$ThreadCounterImpl$Counter0 = this.getThreadCounter();
            --threadStackFactoryImpl$ThreadCounterImpl$Counter0.value;
        }

        public Counter getThreadCounter() {
            return (Counter)this.get();
        }

        @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter
        public void inc() {
            Counter threadStackFactoryImpl$ThreadCounterImpl$Counter0 = this.getThreadCounter();
            ++threadStackFactoryImpl$ThreadCounterImpl$Counter0.value;
        }

        @Override
        public Object initialValue() {
            return new Counter();
        }

        @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter
        public boolean isNotZero() {
            return this.getThreadCounter().value != 0;
        }

        @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter
        public void removeThreadCounter() {
            this.remove();
        }
    }

    static class ThreadStackImpl extends ThreadLocal implements ThreadStack {
        private ThreadStackImpl() {
        }

        ThreadStackImpl(ThreadStackFactoryImpl.1 threadStackFactoryImpl$10) {
        }

        @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadStack
        public Stack getThreadStack() {
            return (Stack)this.get();
        }

        @Override
        public Object initialValue() {
            return new Stack();
        }

        @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadStack
        public void removeThreadStack() {
            this.remove();
        }
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactory
    public ThreadCounter getNewThreadCounter() {
        return new ThreadCounterImpl(null);
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadStackFactory
    public ThreadStack getNewThreadStack() {
        return new ThreadStackImpl(null);
    }
}

