package com.dcinside.app.util;

import io.realm.F0.d;
import io.realm.F0;
import java.util.List;

public final class l implements d {
    public final String a;
    public final List b;

    public l(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        n.S(this.a, this.b, f00);
    }
}

