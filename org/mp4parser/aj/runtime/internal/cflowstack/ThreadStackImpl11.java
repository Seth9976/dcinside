package org.mp4parser.aj.runtime.internal.cflowstack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

public class ThreadStackImpl11 implements ThreadStack {
    private static final int COLLECT_AT = 20000;
    private static final int MIN_COLLECT_AT = 100;
    private Stack cached_stack;
    private Thread cached_thread;
    private int change_count;
    private Hashtable stacks;

    public ThreadStackImpl11() {
        this.stacks = new Hashtable();
        this.change_count = 0;
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadStack
    public Stack getThreadStack() {
        synchronized(this) {
            if(Thread.currentThread() != this.cached_thread) {
                Thread thread0 = Thread.currentThread();
                this.cached_thread = thread0;
                Stack stack0 = (Stack)this.stacks.get(thread0);
                this.cached_stack = stack0;
                if(stack0 == null) {
                    Stack stack1 = new Stack();
                    this.cached_stack = stack1;
                    this.stacks.put(this.cached_thread, stack1);
                }
                ++this.change_count;
                if(this.change_count > Math.max(100, 20000 / Math.max(1, this.stacks.size()))) {
                    Stack stack2 = new Stack();
                    Enumeration enumeration0 = this.stacks.keys();
                    while(enumeration0.hasMoreElements()) {
                        Thread thread1 = (Thread)enumeration0.nextElement();
                        if(!thread1.isAlive()) {
                            stack2.push(thread1);
                        }
                    }
                    Enumeration enumeration1 = stack2.elements();
                    while(enumeration1.hasMoreElements()) {
                        Thread thread2 = (Thread)enumeration1.nextElement();
                        this.stacks.remove(thread2);
                    }
                    this.change_count = 0;
                }
            }
            return this.cached_stack;
        }
    }

    @Override  // org.mp4parser.aj.runtime.internal.cflowstack.ThreadStack
    public void removeThreadStack() {
    }
}

