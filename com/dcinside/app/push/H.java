package com.dcinside.app.push;

import rx.functions.b;

public final class h implements b {
    public final ArticlePostListActivity a;

    public h(ArticlePostListActivity articlePostListActivity0) {
        this.a = articlePostListActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        ArticlePostListActivity.X1(this.a, ((Throwable)object0));
    }
}

