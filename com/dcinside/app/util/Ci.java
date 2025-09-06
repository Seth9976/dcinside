package com.dcinside.app.util;

import android.net.Uri.Builder;
import rx.functions.p;

public final class ci implements p {
    public final String a;

    public ci(String s) {
        this.a = s;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.xu(this.a, ((Uri.Builder)object0));
    }
}

