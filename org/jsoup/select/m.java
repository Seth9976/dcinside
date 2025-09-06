package org.jsoup.select;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.i;
import org.jsoup.internal.n;
import org.jsoup.parser.s;

public class m {
    private final s a;
    private final String b;
    private final List c;
    private static final char[] d;
    private static final String[] e;
    private static final Pattern f;
    private static final Pattern g;
    static final boolean h;

    static {
        m.d = new char[]{',', '>', '+', '~', ' '};
        m.e = new String[]{"=", "!=", "^=", "$=", "*=", "~="};
        m.f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
        m.g = Pattern.compile("([+-])?(\\d+)");
    }

    private m(String s) {
        this.c = new ArrayList();
        i.l(s);
        String s1 = s.trim();
        this.b = s1;
        this.a = new s(s1);
    }

    private g a() {
        s s0 = new s(this.a.c('[', ']'));
        String s1 = s0.l(m.e);
        i.l(s1);
        s0.n();
        if(s0.q()) {
            if(s1.startsWith("^")) {
                return new d(s1.substring(1));
            }
            return s1.equals("*") ? new d("") : new b(s1);
        }
        if(s0.r("=")) {
            return new e(s1, s0.y());
        }
        if(s0.r("!=")) {
            return new org.jsoup.select.g.i(s1, s0.y());
        }
        if(s0.r("^=")) {
            return new j(s1, s0.y());
        }
        if(s0.r("$=")) {
            return new org.jsoup.select.g.g(s1, s0.y());
        }
        if(s0.r("*=")) {
            return new f(s1, s0.y());
        }
        if(s0.r("~=")) {
            return new h(s1, Pattern.compile(s0.y()));
        }
        String s2 = s0.y();
        throw new a("Could not parse attribute query \'%s\': unexpected token at \'%s\'", new Object[]{this.b, s2});
    }

    private g b() {
        String s = this.a.h();
        i.l(s);
        return new k(s.trim());
    }

    private g c() {
        String s = this.a.h();
        i.l(s);
        return new r(s);
    }

    private g d() {
        String s = org.jsoup.internal.g.b(this.a.i());
        i.l(s);
        if(s.startsWith("*|")) {
            String s1 = s.substring(2);
            return new org.jsoup.select.d.b(new g[]{new N(s1), new O(":" + s1)});
        }
        if(s.endsWith("|*")) {
            return new P(s.substring(0, s.length() - 2) + ":");
        }
        if(s.contains("|")) {
            s = s.replace("|", ":");
        }
        return new N(s);
    }

    private void e(char c) {
        org.jsoup.select.d.a d$a0;
        g g2;
        boolean z;
        g g1;
        this.a.n();
        g g0 = m.t(this.i());
        if(this.c.size() == 1) {
            g1 = (g)this.c.get(0);
            if(!(g1 instanceof org.jsoup.select.d.b) || c == 44) {
                g2 = g1;
                z = false;
            }
            else {
                z = true;
                g2 = g1;
                g1 = ((org.jsoup.select.d.b)g1).h();
            }
        }
        else {
            g1 = new org.jsoup.select.d.a(this.c);
            g2 = g1;
            z = false;
        }
        this.c.clear();
        switch(c) {
            case 0x20: {
                d$a0 = new org.jsoup.select.d.a(new g[]{new org.jsoup.select.r.f(g1), g0});
                break;
            }
            case 43: {
                d$a0 = new org.jsoup.select.d.a(new g[]{new c(g1), g0});
                break;
            }
            case 44: {
                if(g1 instanceof org.jsoup.select.d.b) {
                    d$a0 = (org.jsoup.select.d.b)g1;
                }
                else {
                    org.jsoup.select.d.b d$b0 = new org.jsoup.select.d.b();
                    d$b0.j(g1);
                    d$a0 = d$b0;
                }
                ((org.jsoup.select.d.b)d$a0).j(g0);
                break;
            }
            case 62: {
                d$a0 = g1 instanceof org.jsoup.select.r.b ? ((org.jsoup.select.r.b)g1) : new org.jsoup.select.r.b(g1);
                ((org.jsoup.select.r.b)d$a0).g(g0);
                break;
            }
            case 0x7E: {
                d$a0 = new org.jsoup.select.d.a(new g[]{new org.jsoup.select.r.g(g1), g0});
                break;
            }
            default: {
                throw new a("Unknown combinator \'%s\'", new Object[]{Character.valueOf(c)});
            }
        }
        if(z) {
            ((org.jsoup.select.d.b)g2).g(d$a0);
        }
        else {
            g2 = d$a0;
        }
        this.c.add(g2);
    }

    private g f() {
        if(this.a.r("#")) {
            return this.c();
        }
        if(this.a.r(".")) {
            return this.b();
        }
        if(!this.a.x() && !this.a.s("*|")) {
            if(this.a.s("[")) {
                return this.a();
            }
            if(this.a.r("*")) {
                return new org.jsoup.select.g.a();
            }
            if(this.a.r(":")) {
                return this.u();
            }
            String s = this.a.y();
            throw new a("Could not parse query \'%s\': unexpected token at \'%s\'", new Object[]{this.b, s});
        }
        return this.d();
    }

    private int g() {
        String s = this.h().trim();
        i.i(n.k(s), "Index must be numeric");
        return Integer.parseInt(s);
    }

    private String h() {
        return this.a.c('(', ')');
    }

    private String i() {
        StringBuilder stringBuilder0 = n.d();
        boolean z = false;
        while(!this.a.q()) {
            if(this.a.t(m.d)) {
                if(z) {
                    break;
                }
                stringBuilder0.append(this.a.f());
            }
            else {
                if(this.a.s("(")) {
                    stringBuilder0.append("(");
                    stringBuilder0.append(this.a.c('(', ')'));
                    stringBuilder0.append(")");
                }
                else if(this.a.s("[")) {
                    stringBuilder0.append("[");
                    stringBuilder0.append(this.a.c('[', ']'));
                    stringBuilder0.append("]");
                }
                else if(this.a.s("\\")) {
                    stringBuilder0.append(this.a.f());
                    if(!this.a.q()) {
                        stringBuilder0.append(this.a.f());
                    }
                }
                else {
                    stringBuilder0.append(this.a.f());
                }
                z = true;
            }
        }
        return n.v(stringBuilder0);
    }

    private g j(boolean z) {
        String s = s.A(this.h());
        i.m(s, (z ? ":containsOwn" : ":contains") + "(text) query must not be empty");
        return z ? new org.jsoup.select.g.m(s) : new org.jsoup.select.g.n(s);
    }

    private g k() {
        String s = s.A(this.h());
        i.m(s, ":containsData(text) query must not be empty");
        return new l(s);
    }

    private g l(boolean z) {
        String s = s.A(this.h());
        i.m(s, (z ? ":containsWholeOwnText" : ":containsWholeText") + "(text) query must not be empty");
        return z ? new o(s) : new p(s);
    }

    private g m(boolean z, boolean z1) {
        int v2;
        int v = 0;
        String s = org.jsoup.internal.g.b(this.h());
        Matcher matcher0 = m.f.matcher(s);
        Matcher matcher1 = m.g.matcher(s);
        int v1 = 1;
        if("odd".equals(s)) {
            v = 2;
            v2 = 1;
        }
        else {
            if("even".equals(s)) {
                v = 2;
                v2 = 0;
                goto label_23;
            }
            if(matcher0.matches()) {
                if(matcher0.group(3) != null) {
                    v1 = Integer.parseInt(matcher0.group(1).replaceFirst("^\\+", ""));
                }
                if(matcher0.group(4) != null) {
                    v = Integer.parseInt(matcher0.group(4).replaceFirst("^\\+", ""));
                }
                v2 = v;
                v = v1;
            }
            else if(matcher1.matches()) {
                v2 = Integer.parseInt(matcher1.group().replaceFirst("^\\+", ""));
            }
            else {
                throw new a("Could not parse nth-index \'%s\': unexpected format", new Object[]{s});
            }
        }
    label_23:
        if(z1) {
            return z ? new D(v, v2) : new E(v, v2);
        }
        return z ? new C(v, v2) : new B(v, v2);
    }

    private g n() {
        String s = this.h();
        i.m(s, ":has(selector) sub-select must not be empty");
        return new org.jsoup.select.r.a(m.t(s));
    }

    private g o() {
        String s = this.h();
        i.m(s, ":is(selector) sub-select must not be empty");
        return new org.jsoup.select.r.d(m.t(s));
    }

    private g p(boolean z) {
        String s = this.h();
        i.m(s, (z ? ":matchesOwn" : ":matches") + "(regex) query must not be empty");
        return z ? new K(Pattern.compile(s)) : new J(Pattern.compile(s));
    }

    private g q(boolean z) {
        String s = this.h();
        i.m(s, (z ? ":matchesWholeOwnText" : ":matchesWholeText") + "(regex) query must not be empty");
        return z ? new L(Pattern.compile(s)) : new M(Pattern.compile(s));
    }

    private g r() {
        String s = this.h();
        i.m(s, ":not(selector) subselect must not be empty");
        return new org.jsoup.select.r.e(m.t(s));
    }

    g s() {
        this.a.n();
        if(this.a.t(m.d)) {
            org.jsoup.select.r.h r$h0 = new org.jsoup.select.r.h();
            this.c.add(r$h0);
            this.e(this.a.f());
        }
        else {
            g g0 = this.f();
            this.c.add(g0);
        }
        while(!this.a.q()) {
            boolean z = this.a.n();
            if(this.a.t(m.d)) {
                this.e(this.a.f());
            }
            else if(z) {
                this.e(' ');
            }
            else {
                g g1 = this.f();
                this.c.add(g1);
            }
        }
        return this.c.size() == 1 ? ((g)this.c.get(0)) : new org.jsoup.select.d.a(this.c);
    }

    public static g t(String s) {
        try {
            return new m(s).s();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new a(illegalArgumentException0.getMessage());
        }
    }

    @Override
    public String toString() {
        return this.b;
    }

    private g u() {
        String s = this.a.h();
        s.hashCode();
        switch(s) {
            case "contains": {
                return this.j(false);
            }
            case "containsData": {
                return this.k();
            }
            case "containsOwn": {
                return this.j(true);
            }
            case "containsWholeOwnText": {
                return this.l(true);
            }
            case "containsWholeText": {
                return this.l(false);
            }
            case "empty": {
                return new w();
            }
            case "eq": {
                return new org.jsoup.select.g.s(this.g());
            }
            case "first-child": {
                return new x();
            }
            case "first-of-type": {
                return new y();
            }
            case "gt": {
                return new u(this.g());
            }
            case "has": {
                return this.n();
            }
            case "is": {
                return this.o();
            }
            case "last-child": {
                return new z();
            }
            case "last-of-type": {
                return new A();
            }
            case "lt": {
                return new v(this.g());
            }
            case "matchText": {
                return new I();
            }
            case "matches": {
                return this.p(false);
            }
            case "matchesOwn": {
                return this.p(true);
            }
            case "matchesWholeOwnText": {
                return this.q(true);
            }
            case "matchesWholeText": {
                return this.q(false);
            }
            case "not": {
                return this.r();
            }
            case "nth-child": {
                return this.m(false, false);
            }
            case "nth-last-child": {
                return this.m(true, false);
            }
            case "nth-last-of-type": {
                return this.m(true, true);
            }
            case "nth-of-type": {
                return this.m(false, true);
            }
            case "only-child": {
                return new F();
            }
            case "only-of-type": {
                return new G();
            }
            case "root": {
                return new H();
            }
            default: {
                String s1 = this.a.y();
                throw new a("Could not parse query \'%s\': unexpected token at \'%s\'", new Object[]{this.b, s1});
            }
        }
    }
}

