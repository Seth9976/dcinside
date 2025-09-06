package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public enum m implements Callable {
    INSTANCE;

    public static Callable a() {
        return m.a;
    }

    public Map b() throws Exception {
        return new HashMap();
    }

    @Override
    public Object call() throws Exception {
        return this.b();
    }
}

