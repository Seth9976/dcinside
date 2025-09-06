package org.mp4parser.aj.lang;

import org.mp4parser.aj.runtime.internal.AroundClosure;

public interface ProceedingJoinPoint extends JoinPoint {
    Object proceed() throws Throwable;

    Object proceed(Object[] arg1) throws Throwable;

    void set$AroundClosure(AroundClosure arg1);
}

