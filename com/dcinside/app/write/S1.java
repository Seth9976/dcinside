package com.dcinside.app.write;

import android.content.Context;
import android.net.Uri;
import rx.functions.o;

public final class s1 implements o {
    public final Context a;
    public final Uri b;

    public s1(Context context0, Uri uri0) {
        this.a = context0;
        this.b = uri0;
    }

    @Override  // rx.functions.o
    public final Object call() {
        return A1.S(this.a, this.b);
    }
}

