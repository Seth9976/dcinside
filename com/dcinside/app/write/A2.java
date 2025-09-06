package com.dcinside.app.write;

import android.content.Context;
import android.net.Uri;
import rx.functions.o;

public final class a2 implements o {
    public final Uri a;
    public final Context b;

    public a2(Uri uri0, Context context0) {
        this.a = uri0;
        this.b = context0;
    }

    @Override  // rx.functions.o
    public final Object call() {
        return h2.S(this.a, this.b);
    }
}

