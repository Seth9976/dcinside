package androidx.compose.runtime;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class ThreadLocal extends java.lang.ThreadLocal {
    @l
    private final a a;

    public ThreadLocal(@l a a0) {
        L.p(a0, "initialValue");
        super();
        this.a = a0;
    }

    @Override
    public Object get() {
        return super.get();
    }

    @Override
    @m
    protected Object initialValue() {
        return this.a.invoke();
    }

    @Override
    public void remove() {
        super.remove();
    }

    @Override
    public void set(Object object0) {
        super.set(object0);
    }
}

