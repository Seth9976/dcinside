package com.dcinside.app.util;

import rx.functions.p;

public final class ff implements p {
    public final String[] a;

    public ff(String[] arr_s) {
        this.a = arr_s;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.Jo(this.a, ((String)object0));
    }
}

