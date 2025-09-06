package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d.a;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.jsonFormatVisitors.l;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.p;
import java.io.IOException;
import java.lang.annotation.Annotation;

public class t extends p {
    protected final j e;
    protected final d f;
    protected Object g;
    protected Object h;
    protected r i;
    protected r j;
    private static final long k = 1L;
    private static final d l;

    static {
        t.l = new a();
    }

    public t(j j0, d d0) {
        super((d0 == null ? A.k : d0.getMetadata()));
        this.e = j0;
        if(d0 == null) {
            d0 = t.l;
        }
        this.f = d0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public B a() {
        return new B(this.getName());
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public Annotation b(Class class0) {
        return this.f.b(class0);
    }

    @Override  // com.fasterxml.jackson.databind.d
    public B d() {
        return this.f.d();
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void g(l l0, I i0) throws o {
        this.f.g(l0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public Annotation getAnnotation(Class class0) {
        return this.f.getAnnotation(class0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.ser.p
    public String getName() {
        return this.g instanceof String ? ((String)this.g) : String.valueOf(this.g);
    }

    @Override  // com.fasterxml.jackson.databind.d
    public m getType() {
        return this.f.getType();
    }

    @Override  // com.fasterxml.jackson.databind.d
    public k h() {
        return this.f.h();
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    @Deprecated
    public void l(u u0, I i0) throws o {
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws Exception {
        j j0 = this.e;
        if(j0 == null) {
            this.j.m(this.h, k0, i0);
            return;
        }
        this.j.n(this.h, k0, i0, j0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void o(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.i.m(this.g, k0, i0);
        j j0 = this.e;
        if(j0 == null) {
            this.j.m(this.h, k0, i0);
            return;
        }
        this.j.n(this.h, k0, i0, j0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void p(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws Exception {
        if(!k0.q()) {
            k0.m4(this.getName());
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void q(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws Exception {
        k0.y3();
    }

    public Object r() {
        return this.h;
    }

    @Deprecated
    public void s(Object object0, r r0, r r1) {
        this.u(object0, this.h, r0, r1);
    }

    public void u(Object object0, Object object1, r r0, r r1) {
        this.g = object0;
        this.h = object1;
        this.i = r0;
        this.j = r1;
    }

    public void w(Object object0) {
        this.h = object0;
    }
}

