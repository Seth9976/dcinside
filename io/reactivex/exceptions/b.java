package io.reactivex.exceptions;

import d3.f;
import io.reactivex.internal.util.k;

public final class b {
    private b() {
        throw new IllegalStateException("No instances!");
    }

    @f
    public static RuntimeException a(@f Throwable throwable0) {
        throw k.f(throwable0);
    }

    public static void b(@f Throwable throwable0) {
        if(throwable0 instanceof VirtualMachineError) {
            throw (VirtualMachineError)throwable0;
        }
        if(throwable0 instanceof ThreadDeath) {
            throw (ThreadDeath)throwable0;
        }
        if(throwable0 instanceof LinkageError) {
            throw (LinkageError)throwable0;
        }
    }
}

