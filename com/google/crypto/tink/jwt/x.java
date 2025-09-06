package com.google.crypto.tink.jwt;

import O1.j;
import j..time.Clock;
import j..time.Duration;
import j..time.Instant;
import j..util.Optional;
import java.util.ArrayList;

@j
public final class x {
    static class a {
    }

    public static final class b {
        private Optional a;
        private boolean b;
        private Optional c;
        private boolean d;
        private Optional e;
        private boolean f;
        private boolean g;
        private boolean h;
        private Clock i;
        private Duration j;

        private b() {
            this.i = Clock.systemUTC();
            this.j = Duration.ZERO;
            this.a = Optional.empty();
            this.b = false;
            this.c = Optional.empty();
            this.d = false;
            this.e = Optional.empty();
            this.f = false;
            this.g = false;
            this.h = false;
        }

        b(a x$a0) {
        }

        @O1.a
        public b k() {
            this.g = true;
            return this;
        }

        public x l() {
            if(this.b && this.a.isPresent()) {
                throw new IllegalArgumentException("ignoreTypeHeader() and expectedTypeHeader() cannot be used together.");
            }
            if(this.d && this.c.isPresent()) {
                throw new IllegalArgumentException("ignoreIssuer() and expectedIssuer() cannot be used together.");
            }
            if(this.f && this.e.isPresent()) {
                throw new IllegalArgumentException("ignoreAudiences() and expectedAudience() cannot be used together.");
            }
            return new x(this, null);
        }

        @O1.a
        public b m(String s) {
            if(s == null) {
                throw new NullPointerException("audience cannot be null");
            }
            this.e = Optional.of(s);
            return this;
        }

        @O1.a
        public b n() {
            this.h = true;
            return this;
        }

        @O1.a
        public b o(String s) {
            if(s == null) {
                throw new NullPointerException("issuer cannot be null");
            }
            this.c = Optional.of(s);
            return this;
        }

        @O1.a
        public b p(String s) {
            if(s == null) {
                throw new NullPointerException("typ header cannot be null");
            }
            this.a = Optional.of(s);
            return this;
        }

        @O1.a
        public b q() {
            this.f = true;
            return this;
        }

        @O1.a
        public b r() {
            this.d = true;
            return this;
        }

        @O1.a
        public b s() {
            this.b = true;
            return this;
        }

        @O1.a
        public b t(Clock clock0) {
            if(clock0 == null) {
                throw new NullPointerException("clock cannot be null");
            }
            this.i = clock0;
            return this;
        }

        @O1.a
        public b u(Duration duration0) {
            if(duration0.compareTo(x.k) > 0) {
                throw new IllegalArgumentException("Clock skew too large, max is 10 minutes");
            }
            this.j = duration0;
            return this;
        }
    }

    private final Optional a;
    private final boolean b;
    private final Optional c;
    private final boolean d;
    private final Optional e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final Clock i;
    private final Duration j;
    private static final Duration k;

    static {
        x.k = Duration.ofMinutes(10L);
    }

    private x(b x$b0) {
        this.a = x$b0.a;
        this.b = x$b0.b;
        this.c = x$b0.c;
        this.d = x$b0.d;
        this.e = x$b0.e;
        this.f = x$b0.f;
        this.g = x$b0.g;
        this.h = x$b0.h;
        this.i = x$b0.i;
        this.j = x$b0.j;
    }

    x(b x$b0, a x$a0) {
        this(x$b0);
    }

    public static b b() {
        return new b(null);
    }

    z c(y y0) throws g {
        this.f(y0);
        this.g(y0);
        this.e(y0);
        this.d(y0);
        return new z(y0);
    }

    private void d(y y0) throws g {
        if(this.e.isPresent()) {
            if(!y0.s() || !y0.c().contains(this.e.get())) {
                throw new g(String.format("invalid JWT; missing expected audience %s.", this.e.get()));
            }
        }
        else if(y0.s() && !this.f) {
            throw new g("invalid JWT; token has audience set, but validator not.");
        }
    }

    private void e(y y0) throws g {
        if(this.c.isPresent()) {
            if(!y0.w()) {
                throw new g(String.format("invalid JWT; missing expected issuer %s.", this.c.get()));
            }
            if(!y0.h().equals(this.c.get())) {
                throw new g(String.format("invalid JWT; expected issuer %s, but got %s", this.c.get(), y0.h()));
            }
        }
        else if(y0.w() && !this.d) {
            throw new g("invalid JWT; token has issuer set, but validator not.");
        }
    }

    private void f(y y0) throws g {
        Instant instant0 = this.i.instant();
        if(!y0.u() && !this.g) {
            throw new g("token does not have an expiration set");
        }
        if(y0.u() && !y0.e().isAfter(instant0.minus(this.j))) {
            throw new g("token has expired since " + y0.e());
        }
        if(y0.A() && y0.m().isAfter(instant0.plus(this.j))) {
            throw new g("token cannot be used before " + y0.m());
        }
        if(this.h) {
            if(!y0.v()) {
                throw new g("token does not have an iat claim");
            }
            if(y0.g().isAfter(instant0.plus(this.j))) {
                throw new g("token has a invalid iat claim in the future: " + y0.g());
            }
        }
    }

    private void g(y y0) throws g {
        if(this.a.isPresent()) {
            if(!y0.E()) {
                throw new g(String.format("invalid JWT; missing expected type header %s.", this.a.get()));
            }
            if(!y0.r().equals(this.a.get())) {
                throw new g(String.format("invalid JWT; expected type header %s, but got %s", this.a.get(), y0.r()));
            }
        }
        else if(y0.E() && !this.b) {
            throw new g("invalid JWT; token has type header set, but validator not.");
        }
    }

    @Override
    public String toString() {
        ArrayList arrayList0 = new ArrayList();
        if(this.a.isPresent()) {
            arrayList0.add("expectedTypeHeader=" + ((String)this.a.get()));
        }
        if(this.b) {
            arrayList0.add("ignoreTypeHeader");
        }
        if(this.c.isPresent()) {
            arrayList0.add("expectedIssuer=" + ((String)this.c.get()));
        }
        if(this.d) {
            arrayList0.add("ignoreIssuer");
        }
        if(this.e.isPresent()) {
            arrayList0.add("expectedAudience=" + ((String)this.e.get()));
        }
        if(this.f) {
            arrayList0.add("ignoreAudiences");
        }
        if(this.g) {
            arrayList0.add("allowMissingExpiration");
        }
        if(this.h) {
            arrayList0.add("expectIssuedInThePast");
        }
        if(!this.j.isZero()) {
            arrayList0.add("clockSkew=" + this.j);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("JwtValidator{");
        String s = "";
        for(Object object0: arrayList0) {
            stringBuilder0.append(s);
            stringBuilder0.append(((String)object0));
            s = ",";
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

