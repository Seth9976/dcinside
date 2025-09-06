package com.google.crypto.tink.jwt;

import O1.j;
import com.google.gson.g;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import j..time.Instant;
import j..util.DesugarCollections;
import j..util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@j
public final class y {
    static class a {
    }

    public static final class b {
        private Optional a;
        private boolean b;
        private final m c;

        private b() {
            this.a = Optional.empty();
            this.b = false;
            this.c = new m();
        }

        b(a y$a0) {
        }

        @O1.a
        public b d(String s) {
            g g0;
            if(!com.google.crypto.tink.jwt.a.a(s)) {
                throw new IllegalArgumentException("invalid string");
            }
            if(this.c.K("aud")) {
                com.google.gson.j j0 = this.c.G("aud");
                if(!j0.u()) {
                    throw new IllegalArgumentException("addAudience can\'t be used together with setAudience");
                }
                g0 = j0.l();
            }
            else {
                g0 = new g();
            }
            g0.D(s);
            this.c.z("aud", g0);
            return this;
        }

        @O1.a
        public b e(String s, boolean z) {
            l.b(s);
            p p0 = new p(Boolean.valueOf(z));
            this.c.z(s, p0);
            return this;
        }

        @O1.a
        public b f(String s, String s1) throws com.google.crypto.tink.jwt.g {
            l.b(s);
            g g0 = com.google.crypto.tink.jwt.a.c(s1);
            this.c.z(s, g0);
            return this;
        }

        @O1.a
        public b g(String s, String s1) throws com.google.crypto.tink.jwt.g {
            l.b(s);
            m m0 = com.google.crypto.tink.jwt.a.b(s1);
            this.c.z(s, m0);
            return this;
        }

        @O1.a
        public b h(String s) {
            l.b(s);
            this.c.z(s, com.google.gson.l.a);
            return this;
        }

        @O1.a
        public b i(String s, double f) {
            l.b(s);
            p p0 = new p(f);
            this.c.z(s, p0);
            return this;
        }

        @O1.a
        public b j(String s, String s1) {
            if(!com.google.crypto.tink.jwt.a.a(s1)) {
                throw new IllegalArgumentException();
            }
            l.b(s);
            p p0 = new p(s1);
            this.c.z(s, p0);
            return this;
        }

        public y k() {
            return new y(this, null);
        }

        @O1.a
        public b l(String s) {
            if(this.c.K("aud") && this.c.G("aud").u()) {
                throw new IllegalArgumentException("setAudience can\'t be used together with setAudiences or addAudience");
            }
            if(!com.google.crypto.tink.jwt.a.a(s)) {
                throw new IllegalArgumentException("invalid string");
            }
            p p0 = new p(s);
            this.c.z("aud", p0);
            return this;
        }

        @O1.a
        public b m(List list0) {
            if(this.c.K("aud") && !this.c.G("aud").u()) {
                throw new IllegalArgumentException("setAudiences can\'t be used together with setAudience");
            }
            if(list0.isEmpty()) {
                throw new IllegalArgumentException("audiences must not be empty");
            }
            g g0 = new g();
            for(Object object0: list0) {
                if(!com.google.crypto.tink.jwt.a.a(((String)object0))) {
                    throw new IllegalArgumentException("invalid string");
                }
                g0.D(((String)object0));
            }
            this.c.z("aud", g0);
            return this;
        }

        @O1.a
        public b n(Instant instant0) {
            this.t("exp", instant0);
            return this;
        }

        @O1.a
        public b o(Instant instant0) {
            this.t("iat", instant0);
            return this;
        }

        @O1.a
        public b p(String s) {
            if(!com.google.crypto.tink.jwt.a.a(s)) {
                throw new IllegalArgumentException();
            }
            p p0 = new p(s);
            this.c.z("iss", p0);
            return this;
        }

        @O1.a
        public b q(String s) {
            if(!com.google.crypto.tink.jwt.a.a(s)) {
                throw new IllegalArgumentException();
            }
            p p0 = new p(s);
            this.c.z("jti", p0);
            return this;
        }

        @O1.a
        public b r(Instant instant0) {
            this.t("nbf", instant0);
            return this;
        }

        @O1.a
        public b s(String s) {
            if(!com.google.crypto.tink.jwt.a.a(s)) {
                throw new IllegalArgumentException();
            }
            p p0 = new p(s);
            this.c.z("sub", p0);
            return this;
        }

        private void t(String s, Instant instant0) {
            long v = instant0.getEpochSecond();
            if(v > 0x3AFFF4417FL || v < 0L) {
                throw new IllegalArgumentException("timestamp of claim " + s + " is out of range");
            }
            p p0 = new p(v);
            this.c.z(s, p0);
        }

        @O1.a
        public b u(String s) {
            this.a = Optional.of(s);
            return this;
        }

        @O1.a
        public b v() {
            this.b = true;
            return this;
        }
    }

    private final m a;
    private final Optional b;
    private static final long c = 0x3AFFF4417FL;

    private y(b y$b0) {
        if(!y$b0.c.K("exp") && !y$b0.b) {
            throw new IllegalArgumentException("neither setExpiration() nor withoutExpiration() was called");
        }
        if(y$b0.c.K("exp") && y$b0.b) {
            throw new IllegalArgumentException("setExpiration() and withoutExpiration() must not be called together");
        }
        this.b = y$b0.a;
        this.a = y$b0.c.F();
    }

    y(b y$b0, a y$a0) {
        this(y$b0);
    }

    private y(Optional optional0, String s) throws com.google.crypto.tink.jwt.g {
        this.b = optional0;
        this.a = com.google.crypto.tink.jwt.a.b(s);
        this.I("iss");
        this.I("sub");
        this.I("jti");
        this.J("exp");
        this.J("nbf");
        this.J("iat");
        this.H();
    }

    boolean A() {
        return this.a.K("nbf");
    }

    boolean B(String s) {
        l.b(s);
        return this.a.K(s) && this.a.G(s).y() && this.a.G(s).o().C();
    }

    boolean C(String s) {
        l.b(s);
        return this.a.K(s) && this.a.G(s).y() && this.a.G(s).o().D();
    }

    boolean D() {
        return this.a.K("sub");
    }

    boolean E() {
        return this.b.isPresent();
    }

    boolean F(String s) {
        l.b(s);
        try {
            com.google.gson.j j0 = this.a.G(s);
            return com.google.gson.l.a.equals(j0);
        }
        catch(n unused_ex) {
            return false;
        }
    }

    public static b G() {
        return new b(null);
    }

    private void H() throws com.google.crypto.tink.jwt.g {
        if(!this.a.K("aud")) {
            return;
        }
        if(this.a.G("aud").y() && this.a.G("aud").o().D()) {
            return;
        }
        if(this.c().size() < 1) {
            throw new com.google.crypto.tink.jwt.g("invalid JWT payload: claim aud is present but empty.");
        }
    }

    private void I(String s) throws com.google.crypto.tink.jwt.g {
        if(!this.a.K(s)) {
            return;
        }
        if(!this.a.G(s).y() || !this.a.G(s).o().D()) {
            throw new com.google.crypto.tink.jwt.g("invalid JWT payload: claim " + s + " is not a string.");
        }
    }

    private void J(String s) throws com.google.crypto.tink.jwt.g {
        if(!this.a.K(s)) {
            return;
        }
        if(!this.a.G(s).y() || !this.a.G(s).o().C()) {
            throw new com.google.crypto.tink.jwt.g("invalid JWT payload: claim " + s + " is not a number.");
        }
        double f = this.a.G(s).o().i();
        if(f > 253402300799.0 || f < 0.0) {
            throw new com.google.crypto.tink.jwt.g("invalid JWT payload: claim " + s + " has an invalid timestamp");
        }
    }

    Set a() {
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.a.M()) {
            String s = (String)object0;
            if(!l.a(s)) {
                hashSet0.add(s);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet0);
    }

    static y b(Optional optional0, String s) throws com.google.crypto.tink.jwt.g {
        return new y(optional0, s);
    }

    List c() throws com.google.crypto.tink.jwt.g {
        if(!this.s()) {
            throw new com.google.crypto.tink.jwt.g("claim aud does not exist");
        }
        com.google.gson.j j0 = this.a.G("aud");
        if(j0.y()) {
            if(!j0.o().D()) {
                throw new com.google.crypto.tink.jwt.g(String.format("invalid audience: got %s; want a string", j0));
            }
            return DesugarCollections.unmodifiableList(Arrays.asList(new String[]{j0.t()}));
        }
        if(!j0.u()) {
            throw new com.google.crypto.tink.jwt.g("claim aud is not a string or a JSON array");
        }
        g g0 = j0.l();
        ArrayList arrayList0 = new ArrayList(g0.size());
        for(int v = 0; v < g0.size(); ++v) {
            if(!g0.I(v).y() || !g0.I(v).o().D()) {
                throw new com.google.crypto.tink.jwt.g(String.format("invalid audience: got %s; want a string", g0.I(v)));
            }
            arrayList0.add(g0.I(v).t());
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    Boolean d(String s) throws com.google.crypto.tink.jwt.g {
        l.b(s);
        if(!this.a.K(s)) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " does not exist");
        }
        if(!this.a.G(s).y() || !this.a.G(s).o().A()) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " is not a boolean");
        }
        return Boolean.valueOf(this.a.G(s).d());
    }

    Instant e() throws com.google.crypto.tink.jwt.g {
        return this.f("exp");
    }

    private Instant f(String s) throws com.google.crypto.tink.jwt.g {
        if(!this.a.K(s)) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " does not exist");
        }
        if(this.a.G(s).y() && this.a.G(s).o().C()) {
            try {
                return Instant.ofEpochMilli(((long)(this.a.G(s).o().i() * 1000.0)));
            }
            catch(NumberFormatException numberFormatException0) {
                throw new com.google.crypto.tink.jwt.g("claim " + s + " is not a timestamp: " + numberFormatException0);
            }
        }
        throw new com.google.crypto.tink.jwt.g("claim " + s + " is not a timestamp");
    }

    Instant g() throws com.google.crypto.tink.jwt.g {
        return this.f("iat");
    }

    String h() throws com.google.crypto.tink.jwt.g {
        return this.p("iss");
    }

    String i(String s) throws com.google.crypto.tink.jwt.g {
        l.b(s);
        if(!this.a.K(s)) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " does not exist");
        }
        if(!this.a.G(s).u()) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " is not a JSON array");
        }
        return this.a.G(s).l().toString();
    }

    String j(String s) throws com.google.crypto.tink.jwt.g {
        l.b(s);
        if(!this.a.K(s)) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " does not exist");
        }
        if(!this.a.G(s).x()) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " is not a JSON object");
        }
        return this.a.G(s).n().toString();
    }

    String k() {
        return this.a.toString();
    }

    String l() throws com.google.crypto.tink.jwt.g {
        return this.p("jti");
    }

    Instant m() throws com.google.crypto.tink.jwt.g {
        return this.f("nbf");
    }

    Double n(String s) throws com.google.crypto.tink.jwt.g {
        l.b(s);
        if(!this.a.K(s)) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " does not exist");
        }
        if(!this.a.G(s).y() || !this.a.G(s).o().C()) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " is not a number");
        }
        return this.a.G(s).i();
    }

    String o(String s) throws com.google.crypto.tink.jwt.g {
        l.b(s);
        return this.p(s);
    }

    private String p(String s) throws com.google.crypto.tink.jwt.g {
        if(!this.a.K(s)) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " does not exist");
        }
        if(!this.a.G(s).y() || !this.a.G(s).o().D()) {
            throw new com.google.crypto.tink.jwt.g("claim " + s + " is not a string");
        }
        return this.a.G(s).t();
    }

    String q() throws com.google.crypto.tink.jwt.g {
        return this.p("sub");
    }

    String r() throws com.google.crypto.tink.jwt.g {
        if(!this.b.isPresent()) {
            throw new com.google.crypto.tink.jwt.g("type header is not set");
        }
        return (String)this.b.get();
    }

    boolean s() {
        return this.a.K("aud");
    }

    boolean t(String s) {
        l.b(s);
        return this.a.K(s) && this.a.G(s).y() && this.a.G(s).o().A();
    }

    @Override
    public String toString() {
        m m0 = new m();
        if(this.b.isPresent()) {
            m0.z("typ", new p(((String)this.b.get())));
        }
        return m0 + "." + this.a;
    }

    boolean u() {
        return this.a.K("exp");
    }

    boolean v() {
        return this.a.K("iat");
    }

    boolean w() {
        return this.a.K("iss");
    }

    boolean x(String s) {
        l.b(s);
        return this.a.K(s) && this.a.G(s).u();
    }

    boolean y(String s) {
        l.b(s);
        return this.a.K(s) && this.a.G(s).x();
    }

    boolean z() {
        return this.a.K("jti");
    }
}

