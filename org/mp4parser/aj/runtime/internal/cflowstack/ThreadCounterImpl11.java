package org.mp4parser.aj.runtime.internal.cflowstack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class ThreadCounterImpl11 implements ThreadCounter {
    static class Counter {
        protected int value;

        Counter() {
            this.value = 0;
        }
    }

    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Counter cached_counter;
    private Thread cached_thread;
    private int change_count;
    private Hashtable counters;

    public ThreadCounterImpl11() {
        this.counters = new Hashtable();
        this.change_count = 0;
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter
    public void dec() {
        Counter threadCounterImpl11$Counter0 = this.getThreadCounter();
        --threadCounterImpl11$Counter0.value;
    }

    private Counter getThreadCounter() {
        synchronized(this) {
            if(Thread.currentThread() != this.cached_thread) {
                Thread thread0 = Thread.currentThread();
                this.cached_thread = thread0;
                Counter threadCounterImpl11$Counter0 = (Counter)this.counters.get(thread0);
                this.cached_counter = threadCounterImpl11$Counter0;
                if(threadCounterImpl11$Counter0 == null) {
                    Counter threadCounterImpl11$Counter1 = new Counter();
                    this.cached_counter = threadCounterImpl11$Counter1;
                    this.counters.put(this.cached_thread, threadCounterImpl11$Counter1);
                }
                ++this.change_count;
                if(this.change_count > Math.max(100, 20000 / Math.max(1, this.counters.size()))) {
                    ArrayList arrayList0 = new ArrayList();
                    Enumeration enumeration0 = this.counters.keys();
                    while(enumeration0.hasMoreElements()) {
                        Thread thread1 = (Thread)enumeration0.nextElement();
                        if(!thread1.isAlive()) {
                            arrayList0.add(thread1);
                        }
                    }
                    for(Object object0: arrayList0) {
                        this.counters.remove(((Thread)object0));
                    }
                    this.change_count = 0;
                }
            }
            return this.cached_counter;
        }
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter
    public void inc() {
        Counter threadCounterImpl11$Counter0 = this.getThreadCounter();
        ++threadCounterImpl11$Counter0.value;
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter
    public boolean isNotZero() {
        return this.getThreadCounter().value != 0;
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadCounter
    public void removeThreadCounter() {
    }
}

