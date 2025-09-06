package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import com.facebook.common.internal.i;
import com.facebook.common.internal.q;
import com.facebook.imagepipeline.cache.B;
import java.util.concurrent.Executor;
import k1.n.a;
import k1.n;

@n(a.a)
public class h {
    private Resources a;
    private com.facebook.drawee.components.a b;
    @o3.h
    private c1.a c;
    @o3.h
    private c1.a d;
    private Executor e;
    @o3.h
    private B f;
    @o3.h
    private i g;
    @o3.h
    private q h;

    public void a(Resources resources0, com.facebook.drawee.components.a a0, @o3.h c1.a a1, @o3.h c1.a a2, Executor executor0, B b0, @o3.h i i0, @o3.h q q0) {
        this.a = resources0;
        this.b = a0;
        this.c = a1;
        this.d = a2;
        this.e = executor0;
        this.f = b0;
        this.g = i0;
        this.h = q0;
    }

    protected e b(Resources resources0, com.facebook.drawee.components.a a0, @o3.h c1.a a1, @o3.h c1.a a2, Executor executor0, @o3.h B b0, @o3.h i i0) {
        return new e(resources0, a0, a1, a2, executor0, b0, i0);
    }

    public e c() {
        e e0 = this.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        q q0 = this.h;
        if(q0 != null) {
            e0.K0(((Boolean)q0.get()).booleanValue());
        }
        return e0;
    }
}

