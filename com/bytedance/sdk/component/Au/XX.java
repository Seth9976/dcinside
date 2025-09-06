package com.bytedance.sdk.component.Au;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class XX extends FutureTask implements Comparable {
    private int PjT;
    private int Zh;

    public XX(Runnable runnable0, Object object0, int v, int v1) {
        super(runnable0, object0);
        if(v == -1) {
            v = 5;
        }
        this.PjT = v;
        this.Zh = v1;
    }

    public XX(Callable callable0, int v, int v1) {
        super(callable0);
        if(v == -1) {
            v = 5;
        }
        this.PjT = v;
        this.Zh = v1;
    }

    public int PjT() {
        return this.PjT;
    }

    public int PjT(XX xX0) {
        if(this.PjT() < xX0.PjT()) {
            return 1;
        }
        return this.PjT() <= xX0.PjT() ? 0 : -1;
    }

    @Override
    public int compareTo(Object object0) {
        return this.PjT(((XX)object0));
    }
}

