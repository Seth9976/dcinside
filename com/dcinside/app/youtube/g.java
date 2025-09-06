package com.dcinside.app.youtube;

import rx.functions.a;

public final class g implements a {
    public final YoutubeSearchActivity a;

    public g(YoutubeSearchActivity youtubeSearchActivity0) {
        this.a = youtubeSearchActivity0;
    }

    @Override  // rx.functions.a
    public final void call() {
        YoutubeSearchActivity.m2(this.a);
    }
}

