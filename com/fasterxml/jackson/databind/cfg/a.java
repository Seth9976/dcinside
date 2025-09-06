package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.D;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.introspect.r;
import com.fasterxml.jackson.databind.introspect.w;
import com.fasterxml.jackson.databind.introspect.z.c;
import com.fasterxml.jackson.databind.jsontype.d;
import com.fasterxml.jackson.databind.jsontype.i;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.G;
import j..util.DesugarTimeZone;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public final class a implements Serializable {
    protected final q a;
    protected final w b;
    protected final b c;
    protected final D d;
    protected final com.fasterxml.jackson.databind.introspect.a.b e;
    protected final i f;
    protected final d g;
    protected final DateFormat h;
    protected final com.fasterxml.jackson.databind.cfg.q i;
    protected final Locale j;
    protected final TimeZone k;
    protected final com.fasterxml.jackson.core.a l;
    protected final com.fasterxml.jackson.databind.cfg.b m;
    private static final long n = 1L;
    private static final TimeZone o;

    static {
        a.o = DesugarTimeZone.getTimeZone("UTC");
    }

    @Deprecated
    public a(w w0, b b0, D d0, q q0, i i0, DateFormat dateFormat0, com.fasterxml.jackson.databind.cfg.q q1, Locale locale0, TimeZone timeZone0, com.fasterxml.jackson.core.a a0, d d1) {
        this(w0, b0, d0, q0, i0, dateFormat0, q1, locale0, timeZone0, a0, d1, new c(), n.c());
    }

    @Deprecated
    public a(w w0, b b0, D d0, q q0, i i0, DateFormat dateFormat0, com.fasterxml.jackson.databind.cfg.q q1, Locale locale0, TimeZone timeZone0, com.fasterxml.jackson.core.a a0, d d1, com.fasterxml.jackson.databind.introspect.a.b a$b0) {
        this(w0, b0, d0, q0, i0, dateFormat0, q1, locale0, timeZone0, a0, d1, a$b0, n.c());
    }

    public a(w w0, b b0, D d0, q q0, i i0, DateFormat dateFormat0, com.fasterxml.jackson.databind.cfg.q q1, Locale locale0, TimeZone timeZone0, com.fasterxml.jackson.core.a a0, d d1, com.fasterxml.jackson.databind.introspect.a.b a$b0, com.fasterxml.jackson.databind.cfg.b b1) {
        this.b = w0;
        this.c = b0;
        this.d = d0;
        this.a = q0;
        this.f = i0;
        this.h = dateFormat0;
        this.i = q1;
        this.j = locale0;
        this.k = timeZone0;
        this.l = a0;
        this.g = d1;
        this.e = a$b0;
        this.m = b1;
    }

    public a A(w w0) {
        return this.b == w0 ? this : new a(w0, this.c, this.d, this.a, this.f, this.h, this.i, this.j, this.k, this.l, this.g, this.e, this.m);
    }

    public a B(DateFormat dateFormat0) {
        if(this.h == dateFormat0) {
            return this;
        }
        if(dateFormat0 != null && this.p()) {
            dateFormat0 = this.a(dateFormat0, this.k);
        }
        return new a(this.b, this.c, this.d, this.a, this.f, dateFormat0, this.i, this.j, this.k, this.l, this.g, this.e, this.m);
    }

    public a C(com.fasterxml.jackson.databind.cfg.q q0) {
        return this.i == q0 ? this : new a(this.b, this.c, this.d, this.a, this.f, this.h, q0, this.j, this.k, this.l, this.g, this.e, this.m);
    }

    public a D(b b0) {
        return this.y(r.Q0(b0, this.c));
    }

    public a E(D d0) {
        return this.d == d0 ? this : new a(this.b, this.c, d0, this.a, this.f, this.h, this.i, this.j, this.k, this.l, this.g, this.e, this.m);
    }

    public a F(q q0) {
        return this.a == q0 ? this : new a(this.b, this.c, this.d, q0, this.f, this.h, this.i, this.j, this.k, this.l, this.g, this.e, this.m);
    }

    public a G(i i0) {
        return this.f == i0 ? this : new a(this.b, this.c, this.d, this.a, i0, this.h, this.i, this.j, this.k, this.l, this.g, this.e, this.m);
    }

    private DateFormat a(DateFormat dateFormat0, TimeZone timeZone0) {
        if(dateFormat0 instanceof G) {
            return ((G)dateFormat0).D(timeZone0);
        }
        DateFormat dateFormat1 = (DateFormat)dateFormat0.clone();
        dateFormat1.setTimeZone(timeZone0);
        return dateFormat1;
    }

    public a b() {
        return new a(this.b.a(), this.c, this.d, this.a, this.f, this.h, this.i, this.j, this.k, this.l, this.g, this.e, this.m);
    }

    public com.fasterxml.jackson.databind.introspect.a.b c() {
        return this.e;
    }

    public b d() {
        return this.c;
    }

    public com.fasterxml.jackson.core.a e() {
        return this.l;
    }

    public com.fasterxml.jackson.databind.cfg.b f() {
        return this.m;
    }

    public w g() {
        return this.b;
    }

    public DateFormat h() {
        return this.h;
    }

    public com.fasterxml.jackson.databind.cfg.q i() {
        return this.i;
    }

    public Locale j() {
        return this.j;
    }

    public d k() {
        return this.g;
    }

    public D l() {
        return this.d;
    }

    public TimeZone m() {
        return this.k == null ? a.o : this.k;
    }

    public q n() {
        return this.a;
    }

    public i o() {
        return this.f;
    }

    public boolean p() {
        return this.k != null;
    }

    public a q(com.fasterxml.jackson.core.a a0) {
        return a0 == this.l ? this : new a(this.b, this.c, this.d, this.a, this.f, this.h, this.i, this.j, this.k, a0, this.g, this.e, this.m);
    }

    public a r(com.fasterxml.jackson.databind.cfg.b b0) {
        return b0 == this.m ? this : new a(this.b, this.c, this.d, this.a, this.f, this.h, this.i, this.j, this.k, this.l, this.g, this.e, b0);
    }

    public a s(d d0) {
        return d0 == this.g ? this : new a(this.b, this.c, this.d, this.a, this.f, this.h, this.i, this.j, this.k, this.l, d0, this.e, this.m);
    }

    public a u(Locale locale0) {
        return this.j == locale0 ? this : new a(this.b, this.c, this.d, this.a, this.f, this.h, this.i, locale0, this.k, this.l, this.g, this.e, this.m);
    }

    public a w(TimeZone timeZone0) {
        if(timeZone0 == this.k) {
            return this;
        }
        DateFormat dateFormat0 = this.a(this.h, (timeZone0 == null ? a.o : timeZone0));
        return new a(this.b, this.c, this.d, this.a, this.f, dateFormat0, this.i, this.j, timeZone0, this.l, this.g, this.e, this.m);
    }

    public a x(com.fasterxml.jackson.databind.introspect.a.b a$b0) {
        return this.e == a$b0 ? this : new a(this.b, this.c, this.d, this.a, this.f, this.h, this.i, this.j, this.k, this.l, this.g, a$b0, this.m);
    }

    public a y(b b0) {
        return this.c == b0 ? this : new a(this.b, b0, this.d, this.a, this.f, this.h, this.i, this.j, this.k, this.l, this.g, this.e, this.m);
    }

    public a z(b b0) {
        return this.y(r.Q0(this.c, b0));
    }
}

