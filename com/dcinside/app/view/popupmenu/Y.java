package com.dcinside.app.view.popupmenu;

import com.dcinside.app.model.Q;
import rx.functions.o;

public final class y implements o {
    public final Q a;
    public final String b;

    public y(Q q0, String s) {
        this.a = q0;
        this.b = s;
    }

    @Override  // rx.functions.o
    public final Object call() {
        return U.P(this.a, this.b);
    }
}

