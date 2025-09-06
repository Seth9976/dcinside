package com.facebook.imagepipeline.backends.okhttp3;

import android.content.Context;
import com.facebook.imagepipeline.core.y;
import kotlin.jvm.internal.L;
import okhttp3.OkHttpClient;
import y4.l;
import z3.n;

public final class a {
    @l
    public static final a a;

    static {
        a.a = new a();
    }

    @l
    @n
    public static final com.facebook.imagepipeline.core.y.a a(@l Context context0, @l OkHttpClient okHttpClient0) {
        L.p(context0, "context");
        L.p(okHttpClient0, "okHttpClient");
        return y.O.j(context0).D0(new b(okHttpClient0));
    }
}

