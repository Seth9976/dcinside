package com.dcinside.app.post;

import com.dcinside.app.response.PostHead;
import rx.functions.b;

public final class t0 implements b {
    public final S0 a;
    public final PostHead b;

    public t0(S0 s00, PostHead postHead0) {
        this.a = s00;
        this.b = postHead0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        S0.q2(this.a, this.b, ((Throwable)object0));
    }
}

