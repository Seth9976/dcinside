package com.kakao.adfit.j;

import android.content.Context;
import com.kakao.adfit.m.u;
import kotlin.jvm.internal.L;

public final class a implements d {
    private final Context a;

    public a(Context context0) {
        L.p(context0, "context");
        super();
        Context context1 = context0.getApplicationContext();
        L.o(context1, "context.applicationContext");
        this.a = context1;
    }

    @Override  // com.kakao.adfit.j.d
    public boolean a() {
        return u.c(this.a);
    }
}

