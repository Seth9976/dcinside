package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class F implements l0 {
    @m
    private final m0 a;
    @m
    private final l0 b;

    public F(@m m0 m00, @m l0 l00) {
        this.a = m00;
        this.b = l00;
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void a(@l j0 j00, @m String s, boolean z) {
        L.p(j00, "context");
        m0 m00 = this.a;
        if(m00 != null) {
            m00.i(j00.getId(), s, z);
        }
        l0 l00 = this.b;
        if(l00 != null) {
            l00.a(j00, s, z);
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void b(@l j0 j00, @m String s) {
        L.p(j00, "context");
        m0 m00 = this.a;
        if(m00 != null) {
            m00.a(j00.getId(), s);
        }
        l0 l00 = this.b;
        if(l00 != null) {
            l00.b(j00, s);
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void d(@l j0 j00, @m String s, @m Map map0) {
        L.p(j00, "context");
        m0 m00 = this.a;
        if(m00 != null) {
            m00.h(j00.getId(), s, map0);
        }
        l0 l00 = this.b;
        if(l00 != null) {
            l00.d(j00, s, map0);
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public boolean f(@l j0 j00, @m String s) {
        L.p(j00, "context");
        Boolean boolean0 = null;
        Boolean boolean1 = this.a == null ? null : Boolean.valueOf(this.a.f(j00.getId()));
        if(!L.g(boolean1, Boolean.TRUE)) {
            l0 l00 = this.b;
            if(l00 != null) {
                boolean0 = Boolean.valueOf(l00.f(j00, s));
            }
            boolean1 = boolean0;
        }
        return boolean1 == null ? false : boolean1.booleanValue();
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void h(@l j0 j00, @m String s, @m String s1) {
        L.p(j00, "context");
        m0 m00 = this.a;
        if(m00 != null) {
            m00.d(j00.getId(), s, s1);
        }
        l0 l00 = this.b;
        if(l00 != null) {
            l00.h(j00, s, s1);
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void j(@l j0 j00, @m String s, @m Map map0) {
        L.p(j00, "context");
        m0 m00 = this.a;
        if(m00 != null) {
            m00.g(j00.getId(), s, map0);
        }
        l0 l00 = this.b;
        if(l00 != null) {
            l00.j(j00, s, map0);
        }
    }

    @Override  // com.facebook.imagepipeline.producers.l0
    public void k(@l j0 j00, @m String s, @m Throwable throwable0, @m Map map0) {
        L.p(j00, "context");
        m0 m00 = this.a;
        if(m00 != null) {
            m00.c(j00.getId(), s, throwable0, map0);
        }
        l0 l00 = this.b;
        if(l00 != null) {
            l00.k(j00, s, throwable0, map0);
        }
    }

    @m
    public final m0 l() {
        return this.a;
    }

    @m
    public final l0 m() {
        return this.b;
    }
}

