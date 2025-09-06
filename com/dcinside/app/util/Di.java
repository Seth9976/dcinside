package com.dcinside.app.util;

import android.net.Uri.Builder;
import rx.functions.p;

public final class di implements p {
    public final Integer a;

    public di(Integer integer0) {
        this.a = integer0;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.yu(this.a, ((Uri.Builder)object0));
    }
}

