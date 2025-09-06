package com.dcinside.app.image;

import android.content.Context;
import android.net.Uri;
import rx.g.a;
import rx.n;

public final class h implements a {
    public final Context a;
    public final Uri b;
    public final String c;
    public final String d;

    public h(Context context0, Uri uri0, String s, String s1) {
        this.a = context0;
        this.b = uri0;
        this.c = s;
        this.d = s1;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        j.j(this.a, this.b, this.c, this.d, ((n)object0));
    }
}

