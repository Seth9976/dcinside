package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import p3.d;
import y4.l;
import y4.m;
import z3.n;

@d
public final class i extends a {
    public static final class com.facebook.imagepipeline.datasource.i.a {
        private com.facebook.imagepipeline.datasource.i.a() {
        }

        public com.facebook.imagepipeline.datasource.i.a(w w0) {
        }

        @l
        @n
        public final i a() {
            return new i(null);
        }
    }

    @l
    public static final com.facebook.imagepipeline.datasource.i.a i;

    static {
        i.i = new com.facebook.imagepipeline.datasource.i.a(null);
    }

    private i() {
    }

    public i(w w0) {
    }

    public final boolean A(@m com.facebook.common.references.a a0) {
        return super.u(com.facebook.common.references.a.e(a0), true, null);
    }

    public final boolean B(@l Throwable throwable0) {
        L.p(throwable0, "throwable");
        return super.o(throwable0);
    }

    @Override  // com.facebook.datasource.a
    public Object getResult() {
        return this.z();
    }

    @Override  // com.facebook.datasource.a
    public void h(Object object0) {
        this.x(((com.facebook.common.references.a)object0));
    }

    @Override  // com.facebook.datasource.a
    public boolean r(float f) {
        return super.r(f);
    }

    protected void x(@m com.facebook.common.references.a a0) {
        com.facebook.common.references.a.j(a0);
    }

    @l
    @n
    public static final i y() {
        return i.i.a();
    }

    @m
    public com.facebook.common.references.a z() {
        return com.facebook.common.references.a.e(((com.facebook.common.references.a)super.getResult()));
    }
}

