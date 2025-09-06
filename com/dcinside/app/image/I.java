package com.dcinside.app.image;

import android.content.Context;
import android.net.Uri;
import rx.g.a;
import rx.n;

public final class i implements a {
    public final Context a;
    public final Uri b;

    public i(Context context0, Uri uri0) {
        this.a = context0;
        this.b = uri0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        j.h(this.a, this.b, ((n)object0));
    }
}

