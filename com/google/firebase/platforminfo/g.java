package com.google.firebase.platforminfo;

import com.google.firebase.components.i;
import com.google.firebase.components.l;

public final class g implements l {
    public final String a;
    public final a b;

    public g(String s, a h$a0) {
        this.a = s;
        this.b = h$a0;
    }

    @Override  // com.google.firebase.components.l
    public final Object a(i i0) {
        return h.a(this.a, this.b, i0);
    }
}

