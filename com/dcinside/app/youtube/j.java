package com.dcinside.app.youtube;

import rx.functions.b;

public final class j implements b {
    public final YoutubeSearchActivity a;
    public final String b;

    public j(YoutubeSearchActivity youtubeSearchActivity0, String s) {
        this.a = youtubeSearchActivity0;
        this.b = s;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        YoutubeSearchActivity.p2(this.a, this.b, ((Throwable)object0));
    }
}

