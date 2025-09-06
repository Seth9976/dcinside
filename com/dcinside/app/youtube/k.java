package com.dcinside.app.youtube;

import rx.functions.a;

public final class k implements a {
    public final YoutubeSearchActivity a;

    public k(YoutubeSearchActivity youtubeSearchActivity0) {
        this.a = youtubeSearchActivity0;
    }

    @Override  // rx.functions.a
    public final void call() {
        YoutubeSearchActivity.s2(this.a);
    }
}

