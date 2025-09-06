package javassist.compiler;

import javassist.compiler.ast.a;
import javassist.compiler.ast.b;
import javassist.compiler.ast.d;
import javassist.compiler.ast.e;
import javassist.compiler.ast.f;
import javassist.compiler.ast.g;
import javassist.compiler.ast.i;
import javassist.compiler.ast.j;
import javassist.compiler.ast.k;
import javassist.compiler.ast.m;
import javassist.compiler.ast.p;
import javassist.compiler.ast.r;
import javassist.compiler.ast.s;
import javassist.compiler.ast.t;
import javassist.compiler.ast.u;
import javassist.compiler.ast.v;
import javassist.compiler.ast.w;

public final class l implements q {
    private h a;
    private static final int[] b;

    static {
        l.b = new int[]{0, 0, 0, 0, 1, 6, 0, 0, 0, 1, 2, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, 0};
    }

    public l(h h0) {
        this.a = h0;
    }

    private t A(n n0) throws c {
        t t0 = null;
        while(true) {
            t0 = (t)a.h(t0, new t(66, new t(69, this.B(n0))));
            if(this.a.k() != 44) {
                break;
            }
            this.a.a();
        }
        return t0;
    }

    public b B(n n0) throws c {
        b b0 = this.s(n0);
        return !l.d(this.a.k()) ? b0 : d.B(this.a.a(), b0, this.B(n0));
    }

    private javassist.compiler.ast.l C(n n0, a a0, i i0) throws c {
        b b0;
        if(this.a.k() == 61) {
            this.a.a();
            b0 = this.B(n0);
        }
        else {
            b0 = null;
        }
        int v = this.a.a();
        if(v == 59) {
            return new javassist.compiler.ast.l(a0, new a(i0, new a(b0)));
        }
        if(v == 44) {
            throw new c("only one field can be declared in one declaration", this.a);
        }
        throw new o(this.a);
    }

    private t D(n n0) throws c {
        t t1;
        t t0 = null;
        int v = this.a.a();
        n n1 = new n(n0);
        if(this.a.a() != 40) {
            throw new o(this.a);
        }
        if(this.a.k() == 59) {
            this.a.a();
            t1 = null;
        }
        else {
            t1 = this.u(n1, true);
        }
        b b0 = this.a.k() == 59 ? null : this.B(n1);
        if(this.a.a() != 59) {
            throw new c("; is missing", this.a);
        }
        if(this.a.k() != 41) {
            t0 = this.A(n1);
        }
        if(this.a.a() != 41) {
            throw new c(") is missing", this.a);
        }
        return new t(v, t1, new a(b0, new a(t0, this.U(n1))));
    }

    private i E(n n0) throws c {
        i i0 = this.F(n0);
        if(this.a.a() != 400) {
            throw new o(this.a);
        }
        String s = this.a.f();
        i0.F(new v(s));
        i0.r(this.j());
        n0.a(s, i0);
        return i0;
    }

    private i F(n n0) throws c {
        int v = this.a.k();
        if(!l.e(v) && v != 344) {
            return new i(this.r(n0), this.j());
        }
        this.a.a();
        return new i(v, this.j());
    }

    private t G(n n0) throws c {
        int v = this.a.a();
        b b0 = this.Q(n0);
        t t0 = this.U(n0);
        if(this.a.k() == 313) {
            this.a.a();
            return new t(v, b0, new a(t0, new a(this.U(n0))));
        }
        return new t(v, b0, new a(t0, new a(null)));
    }

    private b H(n n0) throws c {
        return this.a.k() == 0x7B ? this.l(n0) : this.B(n0);
    }

    private b I(n n0, b b0) throws c {
        int v = this.a.k();
        if(l.e(v)) {
            this.a.a();
            return new m(v, this.j(), b0);
        }
        return new m(this.r(n0), this.j(), b0);
    }

    public a J(n n0) throws c {
        a a0 = this.K(n0);
        return a0 instanceof javassist.compiler.ast.q ? this.N(n0, ((javassist.compiler.ast.q)a0)) : a0;
    }

    public a K(n n0) throws c {
        i i0;
        a a0 = this.L();
        boolean z = false;
        if(this.a.k() != 400 || this.a.l(1) != 40) {
            i0 = this.F(n0);
        }
        else {
            i0 = new i(344, 0);
            z = true;
        }
        if(this.a.a() != 400) {
            throw new o(this.a);
        }
        i0.F(new v((z ? "<init>" : this.a.f())));
        return !z && this.a.k() != 40 ? this.C(n0, a0, i0) : this.M(n0, z, a0, i0);
    }

    private a L() {
        a a0 = null;
    alab1:
        while(true) {
            switch(this.a.k()) {
                case 300: 
                case 315: 
                case 330: 
                case 331: 
                case 332: 
                case 0x14F: 
                case 338: 
                case 342: 
                case 345: 
                case 347: {
                    a0 = new a(new javassist.compiler.ast.o(this.a.a()), a0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        return a0;
    }

    private javassist.compiler.ast.q M(n n0, boolean z, a a0, i i0) throws c {
        a a2;
        a a1;
        if(this.a.a() != 40) {
            throw new o(this.a);
        }
        if(this.a.k() == 41) {
            a1 = null;
        }
        else {
            a1 = null;
            while(true) {
                a1 = a.g(a1, this.E(n0));
                int v = this.a.k();
                if(v == 44) {
                    this.a.a();
                }
                else if(v == 41) {
                    break;
                }
            }
        }
        this.a.a();
        i0.r(this.j());
        if(z && i0.w() > 0) {
            throw new o(this.a);
        }
        if(this.a.k() == 341) {
            this.a.a();
            a2 = null;
            while(true) {
                a2 = a.g(a2, this.r(n0));
                if(this.a.k() != 44) {
                    break;
                }
                this.a.a();
            }
        }
        else {
            a2 = null;
        }
        return new javassist.compiler.ast.q(a0, new a(i0, a.l(a1, a2, null)));
    }

    public javassist.compiler.ast.q N(n n0, javassist.compiler.ast.q q0) throws c {
        t t0;
        if(this.a.k() == 59) {
            this.a.a();
            t0 = null;
        }
        else {
            t0 = this.o(n0);
            if(t0 == null) {
                t0 = new t(66);
            }
        }
        q0.o(4).m(t0);
        return q0;
    }

    private b O(n n0, b b0) throws c {
        if(b0 instanceof javassist.compiler.ast.o) {
            switch(((javassist.compiler.ast.o)b0).g()) {
                case 0x150: 
                case 339: {
                    break;
                }
                default: {
                    throw new o(this.a);
                }
            }
        }
        else if(!(b0 instanceof v) && b0 instanceof k) {
            switch(((k)b0).r()) {
                case 35: 
                case 46: {
                    break;
                }
                default: {
                    throw new o(this.a);
                }
            }
        }
        return f.C(b0, this.i(n0));
    }

    private r P(n n0) throws c {
        int v = this.a.k();
        javassist.compiler.ast.c c0 = null;
        if(l.e(v)) {
            this.a.a();
            a a0 = this.m(n0);
            if(this.a.k() == 0x7B) {
                c0 = this.l(n0);
            }
            return new r(v, a0, c0);
        }
        if(v == 400) {
            a a1 = this.r(n0);
            int v1 = this.a.k();
            if(v1 == 40) {
                return new r(a1, this.i(n0));
            }
            if(v1 == 91) {
                a a2 = this.m(n0);
                if(this.a.k() == 0x7B) {
                    c0 = this.l(n0);
                }
                return r.z(a1, a2, c0);
            }
        }
        throw new o(this.a);
    }

    private b Q(n n0) throws c {
        if(this.a.a() != 40) {
            throw new o(this.a);
        }
        b b0 = this.B(n0);
        if(this.a.a() != 41) {
            throw new o(this.a);
        }
        return b0;
    }

    private b R(n n0) throws c {
        int v = this.a.k();
        switch(v) {
            case 401: 
            case 402: 
            case 403: {
                this.a.a();
                return new javassist.compiler.ast.n(this.a.d(), v);
            }
            case 404: 
            case 405: {
                this.a.a();
                return new j(this.a.c(), v);
            }
            default: {
                b b0 = this.S(n0);
            alab1:
                while(true) {
                    switch(this.a.k()) {
                        case 35: {
                            this.a.a();
                            if(this.a.a() == 400) {
                                break;
                            }
                            break alab1;
                        }
                        case 40: {
                            b0 = this.O(n0, b0);
                            continue;
                        }
                        case 46: {
                            this.a.a();
                            int v2 = this.a.a();
                            if(v2 == 307) {
                                b0 = this.z(b0, 0);
                            }
                            else {
                                switch(v2) {
                                    case 0x150: {
                                        b0 = k.u(46, new v(this.d0(b0)), new javassist.compiler.ast.o(0x150));
                                        break;
                                    }
                                    case 400: {
                                        b0 = k.u(46, b0, new p(this.a.f()));
                                        break;
                                    }
                                    default: {
                                        throw new c("missing member name", this.a);
                                    }
                                }
                            }
                            continue;
                        }
                        case 91: {
                            if(this.a.l(1) == 93) {
                                int v1 = this.j();
                                if(this.a.a() == 46 && this.a.a() == 307) {
                                    b0 = this.z(b0, v1);
                                    continue;
                                }
                            }
                            else {
                                b b1 = this.k(n0);
                                if(b1 != null) {
                                    b0 = k.u(65, b0, b1);
                                    continue;
                                }
                            }
                            throw new o(this.a);
                        }
                        case 362: 
                        case 363: {
                            b0 = k.u(this.a.a(), null, b0);
                            continue;
                        }
                        default: {
                            return b0;
                        }
                    }
                    String s = this.a.f();
                    b0 = k.u(35, new v(this.d0(b0)), new p(s));
                }
                throw new c("missing static member name", this.a);
            }
        }
    }

    private b S(n n0) throws c {
        int v = this.a.a();
        switch(v) {
            case 40: {
                b b0 = this.B(n0);
                if(this.a.a() != 41) {
                    throw new c(") is missing", this.a);
                }
                return b0;
            label_14:
                if(v != 410 && v != 411 && v != 412) {
                    if(l.e(v) || v == 344) {
                        int v1 = this.j();
                        if(this.a.a() == 46 && this.a.a() == 307) {
                            return this.y(v, v1);
                        }
                    }
                    throw new o(this.a);
                }
                break;
            }
            case 328: {
                return this.P(n0);
            }
            case 0x150: 
            case 339: {
                break;
            }
            case 400: {
                String s = this.a.f();
                i i0 = n0.c(s);
                return i0 == null ? new p(s) : new w(s, i0);
            }
            case 406: {
                return new u(this.a.f());
            }
            default: {
                goto label_14;
            }
        }
        return new javassist.compiler.ast.o(v);
    }

    private t T(n n0) throws c {
        t t0 = new t(this.a.a());
        if(this.a.k() != 59) {
            t0.e(this.B(n0));
        }
        if(this.a.a() != 59) {
            throw new c("; is missing", this.a);
        }
        return t0;
    }

    public t U(n n0) throws c {
        switch(this.a.k()) {
            case 59: {
                this.a.a();
                return new t(66);
            }
            case 0x7B: {
                return this.o(n0);
            }
            case 302: {
                return this.p(n0);
            }
            case 309: {
                return this.t(n0);
            }
            case 311: {
                return this.x(n0);
            }
            case 318: {
                return this.D(n0);
            }
            case 320: {
                return this.G(n0);
            }
            case 333: {
                return this.T(n0);
            }
            case 337: {
                return this.W(n0);
            }
            case 338: {
                return this.Y(n0);
            }
            case 340: {
                return this.Z(n0);
            }
            case 343: {
                return this.a0(n0);
            }
            case 346: {
                return this.c0(n0);
            }
            case 400: {
                if(this.a.l(1) == 58) {
                    this.a.a();
                    String s = this.a.f();
                    this.a.a();
                    return t.s(76, new v(s), this.U(n0));
                }
                return this.u(n0, false);
            }
            default: {
                return this.u(n0, false);
            }
        }
    }

    private t V(n n0) throws c {
        int v = this.a.k();
        if(v != 304 && v != 310) {
            return this.U(n0);
        }
        this.a.a();
        t t0 = v == 304 ? new t(304, this.B(n0)) : new t(310);
        if(this.a.a() != 58) {
            throw new c(": is missing", this.a);
        }
        return t0;
    }

    private t W(n n0) throws c {
        return new t(this.a.a(), this.Q(n0), this.X(n0));
    }

    private t X(n n0) throws c {
        if(this.a.a() != 0x7B) {
            throw new o(this.a);
        }
        n n1 = new n(n0);
        t t0 = this.V(n1);
        if(t0 != null) {
            switch(t0.r()) {
                case 304: 
                case 310: {
                    t t1 = new t(66, t0);
                    while(this.a.k() != 0x7D) {
                        t t2 = this.V(n1);
                        if(t2 != null) {
                            switch(t2.r()) {
                                case 304: 
                                case 310: {
                                    t1 = (t)a.h(t1, new t(66, t2));
                                    t0 = t2;
                                    break;
                                }
                                default: {
                                    t0 = (t)a.h(t0, new t(66, t2));
                                }
                            }
                        }
                    }
                    this.a.a();
                    return t1;
                }
                default: {
                    throw new c("no case or default in a switch block", this.a);
                }
            }
        }
        throw new c("empty switch block", this.a);
    }

    private t Y(n n0) throws c {
        int v = this.a.a();
        if(this.a.a() != 40) {
            throw new o(this.a);
        }
        b b0 = this.B(n0);
        if(this.a.a() != 41) {
            throw new o(this.a);
        }
        return new t(v, b0, this.o(n0));
    }

    private t Z(n n0) throws c {
        int v = this.a.a();
        b b0 = this.B(n0);
        if(this.a.a() != 59) {
            throw new c("; is missing", this.a);
        }
        return new t(v, b0);
    }

    private b a(n n0, b b0, int v) throws c {
        int v1 = this.a.a();
        if(v1 == 323) {
            return this.I(n0, b0);
        }
        b b1;
        for(b1 = this.b0(n0); true; b1 = this.a(n0, b1, v2)) {
            int v2 = this.b(this.a.k());
            if(v2 == 0 || v <= v2) {
                break;
            }
        }
        return e.B(v1, b0, b1);
    }

    private t a0(n n0) throws c {
        i i0;
        n n1;
        this.a.a();
        t t0 = this.o(n0);
    alab1:
        for(b b0 = null; true; b0 = a.g(((a)b0), new s(i0, this.o(n1)))) {
            switch(this.a.k()) {
                case 305: {
                    this.a.a();
                    if(this.a.a() != 40) {
                        break alab1;
                    }
                    n1 = new n(n0);
                    i0 = this.E(n1);
                    if(i0.w() > 0 || i0.A() != 307 || this.a.a() != 41) {
                        throw new o(this.a);
                    }
                    break;
                }
                case 316: {
                    this.a.a();
                    return t.u(343, t0, b0, this.o(n0));
                }
                default: {
                    return t.u(343, t0, b0, null);
                }
            }
        }
        throw new o(this.a);
    }

    private int b(int v) {
        if(33 <= v && v <= 0x3F) {
            return l.b[v - 33];
        }
        switch(v) {
            case 94: {
                return 7;
            }
            case 0x7C: {
                return 8;
            }
            case 350: 
            case 358: {
                return 5;
            }
            case 323: 
            case 357: 
            case 359: {
                return 4;
            }
            case 0x170: {
                return 10;
            }
            case 369: {
                return 9;
            }
            case 364: 
            case 366: 
            case 370: {
                return 3;
            }
            default: {
                return 0;
            }
        }
    }

    private b b0(n n0) throws c {
        int v = this.a.k();
        switch(v) {
            case 33: {
                break;
            }
            case 40: {
                return this.q(n0);
            label_4:
                if(v != 43 && v != 45 && (v != 0x7E && v != 362 && v != 363)) {
                    return this.R(n0);
                }
                break;
            }
            default: {
                goto label_4;
            }
        }
        int v1 = this.a.a();
        if(v1 == 45) {
            int v2 = this.a.k();
            switch(v2) {
                case 401: 
                case 402: 
                case 403: {
                    this.a.a();
                    return new javassist.compiler.ast.n(-this.a.d(), v2);
                }
                case 404: 
                case 405: {
                    this.a.a();
                    return new j(-this.a.c(), v2);
                }
                default: {
                    return k.s(45, this.b0(n0));
                }
            }
        }
        return k.s(v1, this.b0(n0));
    }

    public boolean c() {
        return this.a.k() >= 0;
    }

    private t c0(n n0) throws c {
        return new t(this.a.a(), this.Q(n0), this.U(n0));
    }

    private static boolean d(int v) {
        switch(v) {
            case 61: 
            case 0x15F: 
            case 0x160: 
            case 353: 
            case 354: 
            case 355: 
            case 356: 
            case 360: 
            case 361: 
            case 365: 
            case 0x16F: 
            case 371: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private String d0(b b0) throws c {
        StringBuffer stringBuffer0 = new StringBuffer();
        this.e0(b0, stringBuffer0);
        return stringBuffer0.toString();
    }

    private static boolean e(int v) {
        switch(v) {
            case 301: 
            case 303: 
            case 306: 
            case 312: 
            case 317: 
            case 324: 
            case 326: 
            case 334: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private void e0(b b0, StringBuffer stringBuffer0) throws c {
        if(b0 instanceof v) {
            stringBuffer0.append(((v)b0).g());
            return;
        }
        if(!(b0 instanceof k) || ((k)b0).r() != 46) {
            throw new c("bad static member access", this.a);
        }
        this.e0(((k)b0).w(), stringBuffer0);
        stringBuffer0.append('.');
        this.e0(((k)b0).x(), stringBuffer0);
    }

    private boolean f() {
        int v = 2;
        while(true) {
            int v1 = v + 1;
            if(this.a.l(v) != 91) {
                break;
            }
            v += 2;
            if(this.a.l(v1) != 93) {
                return false;
            }
        }
        return this.a.l(v) == 41;
    }

    private boolean g() {
        int v = this.h(1);
        if(v < 0) {
            return false;
        }
        if(this.a.l(v) != 41) {
            return false;
        }
        switch(this.a.l(v + 1)) {
            case 40: 
            case 328: 
            case 0x150: 
            case 339: 
            case 400: 
            case 401: 
            case 402: 
            case 403: 
            case 404: 
            case 405: 
            case 406: 
            case 410: 
            case 411: 
            case 412: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private int h(int v) {
        int v1;
        while(true) {
            v1 = v + 1;
            if(this.a.l(v1) != 46) {
                break;
            }
            v += 2;
            if(this.a.l(v) != 400) {
                return -1;
            }
        }
        while(true) {
            int v2 = v1 + 1;
            if(this.a.l(v1) != 91) {
                break;
            }
            v1 += 2;
            if(this.a.l(v2) != 93) {
                return -1;
            }
        }
        return v1;
    }

    private a i(n n0) throws c {
        a a0 = null;
        if(this.a.a() != 40) {
            throw new c("( is missing", this.a);
        }
        if(this.a.k() != 41) {
            while(true) {
                a0 = a.g(a0, this.B(n0));
                if(this.a.k() != 44) {
                    break;
                }
                this.a.a();
            }
        }
        if(this.a.a() != 41) {
            throw new c(") is missing", this.a);
        }
        return a0;
    }

    private int j() throws c {
        int v = 0;
        while(this.a.k() == 91) {
            ++v;
            this.a.a();
            if(this.a.a() != 93) {
                throw new c("] is missing", this.a);
            }
            if(false) {
                break;
            }
        }
        return v;
    }

    private b k(n n0) throws c {
        this.a.a();
        if(this.a.k() == 93) {
            this.a.a();
            return null;
        }
        b b0 = this.B(n0);
        if(this.a.a() != 93) {
            throw new c("] is missing", this.a);
        }
        return b0;
    }

    private javassist.compiler.ast.c l(n n0) throws c {
        this.a.a();
        javassist.compiler.ast.c c0 = new javassist.compiler.ast.c(this.B(n0));
        while(this.a.k() == 44) {
            this.a.a();
            a.g(c0, this.B(n0));
        }
        if(this.a.a() != 0x7D) {
            throw new o(this.a);
        }
        return c0;
    }

    private a m(n n0) throws c {
        a a0;
        for(a0 = null; this.a.k() == 91; a0 = a.g(a0, this.k(n0))) {
        }
        return a0;
    }

    private b n(n n0) throws c {
        b b0 = this.b0(n0);
        int v;
        while((v = this.b(this.a.k())) != 0) {
            b0 = this.a(n0, b0, v);
        }
        return b0;
    }

    private t o(n n0) throws c {
        if(this.a.a() != 0x7B) {
            throw new o(this.a);
        }
        n n1 = new n(n0);
        t t0 = null;
        while(this.a.k() != 0x7D) {
            t t1 = this.U(n1);
            if(t1 != null) {
                t0 = (t)a.h(t0, new t(66, t1));
            }
        }
        this.a.a();
        return t0 == null ? new t(66) : t0;
    }

    private t p(n n0) throws c {
        return this.t(n0);
    }

    private b q(n n0) throws c {
        int v = this.a.l(1);
        if(l.e(v) && this.f()) {
            this.a.a();
            this.a.a();
            int v1 = this.j();
            if(this.a.a() != 41) {
                throw new c(") is missing", this.a);
            }
            return new g(v, v1, this.b0(n0));
        }
        if(v == 400 && this.g()) {
            this.a.a();
            a a0 = this.r(n0);
            int v2 = this.j();
            if(this.a.a() != 41) {
                throw new c(") is missing", this.a);
            }
            return new g(a0, v2, this.b0(n0));
        }
        return this.R(n0);
    }

    private a r(n n0) throws c {
        a a0 = null;
        while(this.a.a() == 400) {
            a0 = a.g(a0, new v(this.a.f()));
            if(this.a.k() == 46) {
                this.a.a();
                continue;
            }
            return a0;
        }
        throw new o(this.a);
    }

    private b s(n n0) throws c {
        b b0 = this.n(n0);
        if(this.a.k() == 0x3F) {
            this.a.a();
            b b1 = this.B(n0);
            if(this.a.a() != 58) {
                throw new c(": is missing", this.a);
            }
            return new javassist.compiler.ast.h(b0, b1, this.B(n0));
        }
        return b0;
    }

    private t t(n n0) throws c {
        t t0 = new t(this.a.a());
        int v = this.a.a();
        if(v == 400) {
            t0.e(new v(this.a.f()));
            v = this.a.a();
        }
        if(v != 59) {
            throw new c("; is missing", this.a);
        }
        return t0;
    }

    private t u(n n0, boolean z) throws c {
        int v;
        for(v = this.a.k(); v == 315; v = this.a.k()) {
            this.a.a();
        }
        if(l.e(v)) {
            return this.w(n0, new i(this.a.a(), this.j()));
        }
        if(v == 400) {
            int v1 = this.h(0);
            if(v1 >= 0 && this.a.l(v1) == 400) {
                return this.w(n0, new i(this.r(n0), this.j()));
            }
        }
        t t0 = z ? this.A(n0) : new t(69, this.B(n0));
        if(this.a.a() != 59) {
            throw new c("; is missing", this.a);
        }
        return t0;
    }

    private i v(n n0, i i0) throws c {
        b b0;
        if(this.a.a() != 400 || i0.A() == 344) {
            throw new o(this.a);
        }
        String s = this.a.f();
        v v0 = new v(s);
        int v1 = this.j();
        if(this.a.k() == 61) {
            this.a.a();
            b0 = this.H(n0);
        }
        else {
            b0 = null;
        }
        i i1 = i0.C(v0, v1, b0);
        n0.a(s, i1);
        return i1;
    }

    private t w(n n0, i i0) throws c {
        t t0 = null;
        do {
            t0 = (t)a.h(t0, new t(68, this.v(n0, i0)));
            int v = this.a.a();
            if(v == 59) {
                return t0;
            }
        }
        while(v == 44);
        throw new c("; is missing", this.a);
    }

    private t x(n n0) throws c {
        int v = this.a.a();
        t t0 = this.U(n0);
        if(this.a.a() != 346 || this.a.a() != 40) {
            throw new o(this.a);
        }
        b b0 = this.B(n0);
        if(this.a.a() != 41 || this.a.a() != 59) {
            throw new o(this.a);
        }
        return new t(v, b0, t0);
    }

    private b y(int v, int v1) throws c {
        if(v1 > 0) {
            return k.u(46, new v(javassist.compiler.b.P0(v, v1)), new p("class"));
        }
        switch(v) {
            case 301: {
                return k.u(35, new v("java.lang.Boolean"), new p("TYPE"));
            }
            case 303: {
                return k.u(35, new v("java.lang.Byte"), new p("TYPE"));
            }
            case 306: {
                return k.u(35, new v("java.lang.Character"), new p("TYPE"));
            }
            case 312: {
                return k.u(35, new v("java.lang.Double"), new p("TYPE"));
            }
            case 317: {
                return k.u(35, new v("java.lang.Float"), new p("TYPE"));
            }
            case 324: {
                return k.u(35, new v("java.lang.Integer"), new p("TYPE"));
            }
            case 326: {
                return k.u(35, new v("java.lang.Long"), new p("TYPE"));
            }
            case 334: {
                return k.u(35, new v("java.lang.Short"), new p("TYPE"));
            }
            case 344: {
                return k.u(35, new v("java.lang.Void"), new p("TYPE"));
            }
            default: {
                throw new c("invalid builtin type: " + v);
            }
        }
    }

    private b z(b b0, int v) throws c {
        String s = this.d0(b0);
        if(v > 0) {
            StringBuffer stringBuffer0 = new StringBuffer();
            while(v > 0) {
                stringBuffer0.append('[');
                --v;
            }
            stringBuffer0.append('L');
            stringBuffer0.append(s.replace('.', '/'));
            stringBuffer0.append(';');
            s = stringBuffer0.toString();
        }
        return k.u(46, new v(s), new p("class"));
    }
}

