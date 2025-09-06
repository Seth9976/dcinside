package io.reactivex.internal.util;

import e3.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public enum b implements o, Callable {
    INSTANCE;

    public List a(Object object0) throws Exception {
        return new ArrayList();
    }

    @Override  // e3.o
    public Object apply(Object object0) throws Exception {
        return this.a(object0);
    }

    public static Callable b() {
        return b.a;
    }

    public static o c() {
        return b.a;
    }

    @Override
    public Object call() throws Exception {
        return this.d();
    }

    public List d() throws Exception {
        return new ArrayList();
    }
}

