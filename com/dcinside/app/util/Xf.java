package com.dcinside.app.util;

import android.net.Uri.Builder;
import rx.functions.p;

public final class xf implements p {
    public final String a;

    public xf(String s) {
        this.a = s;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.Al(this.a, ((Uri.Builder)object0));
    }
}

