package com.dcinside.app.youtube;

import rx.g.a;
import rx.n;

public final class c implements a {
    public final String a;
    public final String b;

    public c(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        YoutubeSearchActivity.x2(this.a, this.b, ((n)object0));
    }
}

