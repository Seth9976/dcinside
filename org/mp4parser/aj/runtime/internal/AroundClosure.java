package org.mp4parser.aj.runtime.internal;

import org.mp4parser.aj.lang.ProceedingJoinPoint;

public abstract class AroundClosure {
    protected int bitflags;
    protected Object[] preInitializationState;
    protected Object[] state;

    public AroundClosure() {
        this.bitflags = 0x100000;
    }

    public AroundClosure(Object[] arr_object) {
        this.bitflags = 0x100000;
        this.state = arr_object;
    }

    public int getFlags() {
        return this.bitflags;
    }

    public Object[] getPreInitializationState() {
        return this.preInitializationState;
    }

    public Object[] getState() {
        return this.state;
    }

    public ProceedingJoinPoint linkClosureAndJoinPoint() {
        ProceedingJoinPoint proceedingJoinPoint0 = (ProceedingJoinPoint)this.state[this.state.length - 1];
        proceedingJoinPoint0.set$AroundClosure(this);
        return proceedingJoinPoint0;
    }

    public ProceedingJoinPoint linkClosureAndJoinPoint(int v) {
        ProceedingJoinPoint proceedingJoinPoint0 = (ProceedingJoinPoint)this.state[this.state.length - 1];
        proceedingJoinPoint0.set$AroundClosure(this);
        this.bitflags = v;
        return proceedingJoinPoint0;
    }

    public abstract Object run(Object[] arg1) throws Throwable;
}

