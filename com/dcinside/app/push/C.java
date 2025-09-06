package com.dcinside.app.push;

import rx.functions.b;

public final class c implements b {
    public final ArticlePostListActivity a;

    public c(ArticlePostListActivity articlePostListActivity0) {
        this.a = articlePostListActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArticlePostListActivity.U1(this.a, ((Throwable)object0));
    }
}

