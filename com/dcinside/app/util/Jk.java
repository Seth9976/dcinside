package com.dcinside.app.util;

import com.dcinside.app.response.PostHead;
import com.dcinside.app.type.v;
import kotlin.jvm.functions.Function1;

public final class jk implements Function1 {
    public final String a;
    public final String b;
    public final v c;
    public final PostHead d;

    public jk(String s, String s1, v v0, PostHead postHead0) {
        this.a = s;
        this.b = s1;
        this.c = v0;
        this.d = postHead0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.my(this.a, this.b, this.c, this.d, ((String)object0));
    }
}

