package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.executors.j;
import com.facebook.common.internal.q;
import com.facebook.imagepipeline.core.m0;
import com.facebook.imagepipeline.core.x;
import java.util.Set;
import k1.n.a;
import k1.n;

@n(a.a)
public class g implements q {
    private final Context a;
    private final x b;
    private final h c;
    private final Set d;
    private final Set e;
    @o3.h
    private final S0.g f;

    public g(Context context0) {
        this(context0, null);
    }

    public g(Context context0, @o3.h b b0) {
        this(context0, m0.n(), b0);
    }

    public g(Context context0, m0 m00, @o3.h b b0) {
        this(context0, m00, null, null, b0);
    }

    public g(Context context0, m0 m00, Set set0, Set set1, @o3.h b b0) {
        this.a = context0;
        x x0 = m00.l();
        this.b = x0;
        this.c = b0 == null || b0.d() == null ? new h() : b0.d();
        Resources resources0 = context0.getResources();
        com.facebook.drawee.components.a a0 = com.facebook.drawee.components.a.b();
        c1.a a1 = m00.c(context0);
        c1.a a2 = m00.s();
        j j0 = j.f();
        S0.g g0 = null;
        this.c.a(resources0, a0, a1, a2, j0, x0.y(), (b0 == null ? null : b0.a()), (b0 == null ? null : b0.b()));
        this.d = set0;
        this.e = set1;
        if(b0 != null) {
            g0 = b0.c();
        }
        this.f = g0;
    }

    public f a() {
        return new f(this.a, this.c, this.b, this.d, this.e).h0(this.f);
    }

    @Override  // com.facebook.common.internal.q
    public Object get() {
        return this.a();
    }
}

