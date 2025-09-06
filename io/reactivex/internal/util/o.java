package io.reactivex.internal.util;

import e3.c;
import java.util.List;

public enum o implements c {
    INSTANCE;

    public List a(List list0, Object object0) throws Exception {
        list0.add(object0);
        return list0;
    }

    @Override  // e3.c
    public Object apply(Object object0, Object object1) throws Exception {
        return this.a(((List)object0), object1);
    }

    public static c b() {
        return o.a;
    }
}

