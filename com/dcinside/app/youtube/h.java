package com.dcinside.app.youtube;

import rx.functions.a;

public final class h implements a {
    public final YoutubeSearchActivity a;

    public h(YoutubeSearchActivity youtubeSearchActivity0) {
        this.a = youtubeSearchActivity0;
    }

    @Override  // rx.functions.a
    public final void call() {
        YoutubeSearchActivity.n2(this.a);
    }
}

