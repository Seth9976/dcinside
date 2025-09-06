package org.jsoup.parser;

import java.util.ArrayList;
import org.jsoup.internal.n;
import org.jsoup.nodes.o;

abstract enum c {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a extends c {
        a(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.a == j.e) {
                if(((org.jsoup.parser.r.c)r0).w().equals("\u0000")) {
                    b0.P(this);
                    return false;
                }
                b0.E(((org.jsoup.parser.r.c)r0));
                return true;
            }
            if(b0.b0().size() > 0) {
                r r1 = b0.g;
                for(Object object0: b0.b0()) {
                    org.jsoup.parser.r.c r$c0 = (org.jsoup.parser.r.c)object0;
                    b0.g = r$c0;
                    if(c.h(r$c0)) {
                        b0.m0(r$c0);
                    }
                    else {
                        b0.P(this);
                        if(n.f(b0.c().R(), z.B)) {
                            b0.g1(true);
                            b0.R0(r$c0, c.g);
                            b0.g1(false);
                        }
                        else {
                            b0.R0(r$c0, c.g);
                        }
                    }
                }
                b0.g = r1;
                b0.e1();
            }
            b0.k1(b0.L0());
            return b0.t(r0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.b extends c {
        org.jsoup.parser.c.b(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.n() && ((g)r0).L().equals("caption")) {
                if(!b0.l0("caption")) {
                    b0.P(this);
                    return false;
                }
                b0.S();
                if(!b0.d("caption")) {
                    b0.P(this);
                }
                b0.M0("caption");
                b0.G();
                b0.k1(c.i);
                return true;
            }
            if(r0.o() && n.f(((h)r0).L(), z.z) || r0.n() && ((g)r0).L().equals("table")) {
                if(!b0.l0("caption")) {
                    b0.P(this);
                    return false;
                }
                b0.U(false);
                if(!b0.d("caption")) {
                    b0.P(this);
                }
                b0.M0("caption");
                b0.G();
                b0.k1(c.i);
                c.i.i(r0, b0);
                return true;
            }
            if(r0.n() && n.f(((g)r0).L(), z.K)) {
                b0.P(this);
                return false;
            }
            return b0.R0(r0, c.g);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.c extends c {
        org.jsoup.parser.c.c(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(c.h(r0)) {
                b0.m0(((org.jsoup.parser.r.c)r0));
                return true;
            }
            switch(q.a[r0.a.ordinal()]) {
                case 1: {
                    b0.o0(((d)r0));
                    return true;
                }
                case 2: {
                    b0.P(this);
                    return true;
                }
                case 3: {
                    String s = ((h)r0).L();
                    s.hashCode();
                    switch(s) {
                        case "col": {
                            b0.q0(((h)r0));
                            return true;
                        }
                        case "html": {
                            return b0.R0(r0, c.g);
                        }
                        case "template": {
                            b0.R0(r0, c.d);
                            return true;
                        }
                        default: {
                            return this.j(r0, b0);
                        }
                    }
                }
                case 4: {
                    String s1 = ((g)r0).L();
                    s1.hashCode();
                    if(!s1.equals("template")) {
                        if(!s1.equals("colgroup")) {
                            return this.j(r0, b0);
                        }
                        if(!b0.d(s1)) {
                            b0.P(this);
                            return false;
                        }
                        b0.s();
                        b0.k1(c.i);
                        return true;
                    }
                    b0.R0(r0, c.d);
                    return true;
                }
                case 6: {
                    return b0.d("html") ? true : this.j(r0, b0);
                }
                default: {
                    return this.j(r0, b0);
                }
            }
        }

        private boolean j(r r0, b b0) {
            if(!b0.d("colgroup")) {
                b0.P(this);
                return false;
            }
            b0.s();
            b0.k1(c.i);
            b0.t(r0);
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.d extends c {
        org.jsoup.parser.c.d(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            switch(r0.a) {
                case 3: {
                    String s = ((h)r0).L();
                    if(s.equals("tr")) {
                        b0.I();
                        b0.p0(((h)r0));
                        b0.k1(c.n);
                        return true;
                    }
                    if(n.f(s, z.w)) {
                        b0.P(this);
                        b0.v("tr");
                        return b0.t(((h)r0));
                    }
                    return n.f(s, z.C) ? this.k(r0, b0) : this.j(r0, b0);
                }
                case 4: {
                    String s1 = ((g)r0).L();
                    if(n.f(s1, z.I)) {
                        if(!b0.l0(s1)) {
                            b0.P(this);
                            return false;
                        }
                        b0.I();
                        b0.s();
                        b0.k1(c.i);
                        return true;
                    }
                    if(s1.equals("table")) {
                        return this.k(r0, b0);
                    }
                    if(n.f(s1, z.D)) {
                        b0.P(this);
                        return false;
                    }
                    return this.j(r0, b0);
                }
                default: {
                    return this.j(r0, b0);
                }
            }
        }

        private boolean j(r r0, b b0) {
            return b0.R0(r0, c.i);
        }

        private boolean k(r r0, b b0) {
            if(!b0.l0("tbody") && !b0.l0("thead") && !b0.f0("tfoot")) {
                b0.P(this);
                return false;
            }
            b0.I();
            b0.u(b0.c().R());
            return b0.t(r0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class e extends c {
        e(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.o()) {
                String s = ((h)r0).L();
                if(n.f(s, z.w)) {
                    b0.K();
                    b0.p0(((h)r0));
                    b0.k1(c.o);
                    b0.u0();
                    return true;
                }
                if(n.f(s, z.E)) {
                    if(!b0.l0("tr")) {
                        b0.P(this);
                        return false;
                    }
                    b0.K();
                    b0.s();
                    b0.k1(c.m);
                    return b0.t(r0);
                }
                return this.j(r0, b0);
            }
            if(r0.n()) {
                String s1 = ((g)r0).L();
                if(s1.equals("tr")) {
                    if(!b0.l0(s1)) {
                        b0.P(this);
                        return false;
                    }
                    b0.K();
                    b0.s();
                    b0.k1(c.m);
                    return true;
                }
                if(s1.equals("table")) {
                    if(!b0.l0("tr")) {
                        b0.P(this);
                        return false;
                    }
                    b0.K();
                    b0.s();
                    b0.k1(c.m);
                    return b0.t(r0);
                }
                if(n.f(s1, z.t)) {
                    if(!b0.l0(s1)) {
                        b0.P(this);
                        return false;
                    }
                    if(!b0.l0("tr")) {
                        return false;
                    }
                    b0.K();
                    b0.s();
                    b0.k1(c.m);
                    return b0.t(r0);
                }
                if(n.f(s1, z.F)) {
                    b0.P(this);
                    return false;
                }
                return this.j(r0, b0);
            }
            return this.j(r0, b0);
        }

        private boolean j(r r0, b b0) {
            return b0.R0(r0, c.i);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class f extends c {
        f(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.n()) {
                String s = ((g)r0).L();
                if(n.f(s, z.w)) {
                    if(!b0.l0(s)) {
                        b0.P(this);
                        b0.k1(c.n);
                        return false;
                    }
                    b0.S();
                    if(!b0.d(s)) {
                        b0.P(this);
                    }
                    b0.M0(s);
                    b0.G();
                    b0.k1(c.n);
                    return true;
                }
                if(n.f(s, z.x)) {
                    b0.P(this);
                    return false;
                }
                if(n.f(s, z.y)) {
                    if(!b0.l0(s)) {
                        b0.P(this);
                        return false;
                    }
                    this.k(b0);
                    return b0.t(r0);
                }
                return this.j(r0, b0);
            }
            if(r0.o() && n.f(((h)r0).L(), z.z)) {
                if(!b0.l0("td") && !b0.l0("th")) {
                    b0.P(this);
                    return false;
                }
                this.k(b0);
                return b0.t(r0);
            }
            return this.j(r0, b0);
        }

        private boolean j(r r0, b b0) {
            return b0.R0(r0, c.g);
        }

        private void k(b b0) {
            if(b0.l0("td")) {
                b0.u("td");
                return;
            }
            b0.u("th");
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.g extends c {
        org.jsoup.parser.c.g(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            switch(r0.a) {
                case 1: {
                    b0.o0(((d)r0));
                    return true;
                }
                case 2: {
                    b0.P(this);
                    return false;
                }
                case 3: {
                    String s = ((h)r0).L();
                    if(s.equals("html")) {
                        return b0.R0(((h)r0), c.g);
                    }
                    if(s.equals("option")) {
                        if(b0.d("option")) {
                            b0.u("option");
                        }
                        b0.p0(((h)r0));
                        return true;
                    }
                    if(s.equals("optgroup")) {
                        if(b0.d("option")) {
                            b0.u("option");
                        }
                        if(b0.d("optgroup")) {
                            b0.u("optgroup");
                        }
                        b0.p0(((h)r0));
                        return true;
                    }
                    if(s.equals("select")) {
                        b0.P(this);
                        return b0.u("select");
                    }
                    if(n.f(s, z.G)) {
                        b0.P(this);
                        if(!b0.i0("select")) {
                            return false;
                        }
                        b0.u("select");
                        return b0.t(((h)r0));
                    }
                    return s.equals("script") || s.equals("template") ? b0.R0(r0, c.d) : this.j(r0, b0);
                }
                case 4: {
                    String s1 = ((g)r0).L();
                    s1.hashCode();
                    switch(s1) {
                        case "optgroup": {
                            if(b0.d("option") && b0.D(b0.c()) != null && b0.D(b0.c()).L("optgroup")) {
                                b0.u("option");
                            }
                            if(b0.d("optgroup")) {
                                b0.s();
                                return true;
                            }
                            b0.P(this);
                            return true;
                        }
                        case "option": {
                            if(b0.d("option")) {
                                b0.s();
                                return true;
                            }
                            b0.P(this);
                            return true;
                        }
                        case "select": {
                            if(!b0.i0(s1)) {
                                b0.P(this);
                                return false;
                            }
                            b0.M0(s1);
                            b0.d1();
                            return true;
                        }
                        case "template": {
                            return b0.R0(r0, c.d);
                        }
                        default: {
                            return this.j(r0, b0);
                        }
                    }
                }
                case 5: {
                    if(((org.jsoup.parser.r.c)r0).w().equals("\u0000")) {
                        b0.P(this);
                        return false;
                    }
                    b0.m0(((org.jsoup.parser.r.c)r0));
                    return true;
                }
                case 6: {
                    if(!b0.d("html")) {
                        b0.P(this);
                        return true;
                    }
                    return true;
                }
                default: {
                    return this.j(r0, b0);
                }
            }
        }

        private boolean j(r r0, b b0) {
            b0.P(this);
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.h extends c {
        org.jsoup.parser.c.h(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.o() && n.f(((h)r0).L(), z.H)) {
                b0.P(this);
                b0.M0("select");
                b0.d1();
                return b0.t(r0);
            }
            if(r0.n() && n.f(((g)r0).L(), z.H)) {
                b0.P(this);
                if(b0.l0(((g)r0).L())) {
                    b0.M0("select");
                    b0.d1();
                    return b0.t(r0);
                }
                return false;
            }
            return b0.R0(r0, c.p);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class i extends c {
        i(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            switch(q.a[r0.a.ordinal()]) {
                case 3: {
                    String s = ((h)r0).L();
                    if(n.f(s, z.L)) {
                        b0.R0(r0, c.d);
                        return true;
                    }
                    if(n.f(s, z.M)) {
                        b0.P0();
                        b0.T0(c.i);
                        b0.k1(c.i);
                        return b0.t(r0);
                    }
                    if(s.equals("col")) {
                        b0.P0();
                        b0.T0(c.l);
                        b0.k1(c.l);
                        return b0.t(r0);
                    }
                    if(s.equals("tr")) {
                        b0.P0();
                        b0.T0(c.m);
                        b0.k1(c.m);
                        return b0.t(r0);
                    }
                    if(!s.equals("td") && !s.equals("th")) {
                        b0.P0();
                        b0.T0(c.g);
                        b0.k1(c.g);
                        return b0.t(r0);
                    }
                    b0.P0();
                    b0.T0(c.n);
                    b0.k1(c.n);
                    return b0.t(r0);
                }
                case 4: {
                    if(((g)r0).L().equals("template")) {
                        b0.R0(r0, c.d);
                        return true;
                    }
                    b0.P(this);
                    return false;
                }
                case 1: 
                case 2: 
                case 5: {
                    b0.R0(r0, c.g);
                    return true;
                }
                case 6: {
                    if(!b0.H0("template")) {
                        return true;
                    }
                    b0.P(this);
                    b0.M0("template");
                    b0.G();
                    b0.P0();
                    b0.d1();
                    return b0.i1() == c.r || b0.j1() >= 12 ? true : b0.t(r0);
                }
                default: {
                    return true;
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.j extends c {
        org.jsoup.parser.c.j(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            o o0 = b0.Z("html");
            if(c.h(r0)) {
                if(o0 != null) {
                    b0.n0(((org.jsoup.parser.r.c)r0), o0);
                    return true;
                }
                b0.R0(r0, c.g);
                return true;
            }
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(r0.l()) {
                b0.P(this);
                return false;
            }
            if(r0.o() && ((h)r0).L().equals("html")) {
                return b0.R0(r0, c.g);
            }
            if(r0.n() && ((g)r0).L().equals("html")) {
                if(b0.x0()) {
                    b0.P(this);
                    return false;
                }
                if(o0 != null) {
                    b0.o(o0);
                }
                b0.k1(c.v);
                return true;
            }
            if(r0.m()) {
                return true;
            }
            b0.P(this);
            b0.c1();
            return b0.t(r0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class k extends c {
        k(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(c.h(r0)) {
                return true;
            }
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(r0.l()) {
                org.jsoup.nodes.g g0 = new org.jsoup.nodes.g(b0.h.d(""), "", "");
                g0.B0(((org.jsoup.parser.r.e)r0).v());
                b0.X().D0(g0);
                b0.p(g0);
                if(((org.jsoup.parser.r.e)r0).y()) {
                    b0.X().x3(org.jsoup.nodes.f.b.b);
                }
                b0.k1(c.b);
                return true;
            }
            b0.k1(c.b);
            return b0.t(r0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class l extends c {
        l(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(c.h(r0)) {
                b0.m0(((org.jsoup.parser.r.c)r0));
                return true;
            }
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(r0.l()) {
                b0.P(this);
                return false;
            }
            if(r0.o()) {
                String s = ((h)r0).L();
                s.hashCode();
                switch(s) {
                    case "frame": {
                        b0.q0(((h)r0));
                        return true;
                    }
                    case "frameset": {
                        b0.p0(((h)r0));
                        return true;
                    }
                    case "html": {
                        return b0.R0(((h)r0), c.g);
                    }
                    case "noframes": {
                        return b0.R0(((h)r0), c.d);
                    }
                    default: {
                        b0.P(this);
                        return false;
                    }
                }
            }
            if(r0.n() && ((g)r0).L().equals("frameset")) {
                if(b0.d("html")) {
                    b0.P(this);
                    return false;
                }
                b0.s();
                if(b0.x0() || b0.d("frameset")) {
                    return true;
                }
                b0.k1(c.u);
                return true;
            }
            if(r0.m()) {
                if(!b0.d("html")) {
                    b0.P(this);
                }
                return true;
            }
            b0.P(this);
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class m extends c {
        m(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(c.h(r0)) {
                b0.m0(((org.jsoup.parser.r.c)r0));
                return true;
            }
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(r0.l()) {
                b0.P(this);
                return false;
            }
            if(r0.o() && ((h)r0).L().equals("html")) {
                return b0.R0(r0, c.g);
            }
            if(r0.n() && ((g)r0).L().equals("html")) {
                b0.k1(c.w);
                return true;
            }
            if(r0.o() && ((h)r0).L().equals("noframes")) {
                return b0.R0(r0, c.d);
            }
            if(r0.m()) {
                return true;
            }
            b0.P(this);
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.n extends c {
        org.jsoup.parser.c.n(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(!r0.l() && (!r0.o() || !((h)r0).L().equals("html"))) {
                if(c.h(r0)) {
                    b0.n0(((org.jsoup.parser.r.c)r0), b0.X());
                    return true;
                }
                if(r0.m()) {
                    return true;
                }
                b0.P(this);
                b0.c1();
                return b0.t(r0);
            }
            return b0.R0(r0, c.g);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.o extends c {
        org.jsoup.parser.c.o(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(!r0.l() && !c.h(r0) && (!r0.o() || !((h)r0).L().equals("html"))) {
                if(r0.m()) {
                    return true;
                }
                if(r0.o() && ((h)r0).L().equals("noframes")) {
                    return b0.R0(r0, c.d);
                }
                b0.P(this);
                return false;
            }
            return b0.R0(r0, c.g);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class p extends c {
        p(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
        alab1:
            switch(r0.a) {
                case 1: {
                    b0.o0(((d)r0));
                    break;
                }
                case 2: {
                    b0.P(this);
                    return true;
                }
                case 3: {
                    if(n.e(((h)r0).f, z.N)) {
                        return this.j(r0, b0);
                    }
                    if(((h)r0).f.equals("font") && (((h)r0).F("color") || ((h)r0).F("face") || ((h)r0).F("size"))) {
                        return this.j(r0, b0);
                    }
                    b0.r0(((h)r0), b0.c().O2().C());
                    return true;
                }
                case 4: {
                    if(!((g)r0).f.equals("br") && !((g)r0).f.equals("p")) {
                        if(((g)r0).f.equals("script") && b0.e("script", "http://www.w3.org/2000/svg")) {
                            b0.s();
                            return true;
                        }
                        ArrayList arrayList0 = b0.c0();
                        if(arrayList0.isEmpty()) {
                            org.jsoup.helper.i.r("Stack unexpectedly empty");
                        }
                        int v = arrayList0.size() - 1;
                        o o0 = (o)arrayList0.get(v);
                        if(!o0.L(((g)r0).f)) {
                            b0.P(this);
                        }
                        while(true) {
                            if(v == 0) {
                                break alab1;
                            }
                            if(o0.L(((g)r0).f)) {
                                b0.O0(o0.R());
                                return true;
                            }
                            --v;
                            o0 = (o)arrayList0.get(v);
                            if(!o0.O2().C().equals("http://www.w3.org/1999/xhtml")) {
                                continue;
                            }
                            return this.j(r0, b0);
                        }
                    }
                    return this.j(r0, b0);
                }
                case 5: {
                    if(((org.jsoup.parser.r.c)r0).w().equals("\u0000")) {
                        b0.P(this);
                        return true;
                    }
                    if(c.h(((org.jsoup.parser.r.c)r0))) {
                        b0.m0(((org.jsoup.parser.r.c)r0));
                        return true;
                    }
                    b0.m0(((org.jsoup.parser.r.c)r0));
                    b0.Q(false);
                    return true;
                }
                default: {
                    return true;
                }
            }
            return true;
        }

        boolean j(r r0, b b0) {
            return b0.i1().i(r0, b0);
        }
    }

    static class q {
        static final int[] a;

        static {
            int[] arr_v = new int[j.values().length];
            q.a = arr_v;
            try {
                arr_v[j.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                q.a[j.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                q.a[j.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                q.a[j.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                q.a[j.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                q.a[j.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.r extends c {
        org.jsoup.parser.c.r(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.l()) {
                b0.P(this);
                return false;
            }
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(c.h(r0)) {
                b0.m0(((org.jsoup.parser.r.c)r0));
                return true;
            }
            if(r0.o() && ((h)r0).L().equals("html")) {
                b0.p0(((h)r0));
                b0.k1(c.c);
                return true;
            }
            if(r0.n() && n.f(((g)r0).L(), z.e)) {
                return this.j(r0, b0);
            }
            if(r0.n()) {
                b0.P(this);
                return false;
            }
            return this.j(r0, b0);
        }

        private boolean j(r r0, b b0) {
            b0.v("html");
            b0.k1(c.c);
            return b0.t(r0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class s extends c {
        s(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(c.h(r0)) {
                b0.m0(((org.jsoup.parser.r.c)r0));
                return true;
            }
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(r0.l()) {
                b0.P(this);
                return false;
            }
            if(r0.o() && ((h)r0).L().equals("html")) {
                return c.g.i(r0, b0);
            }
            if(r0.o() && ((h)r0).L().equals("head")) {
                b0.h1(b0.p0(((h)r0)));
                b0.k1(c.d);
                return true;
            }
            if(r0.n() && n.f(((g)r0).L(), z.e)) {
                b0.v("head");
                return b0.t(r0);
            }
            if(r0.n()) {
                b0.P(this);
                return false;
            }
            b0.v("head");
            return b0.t(r0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class t extends c {
        t(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(c.h(r0)) {
                b0.m0(((org.jsoup.parser.r.c)r0));
                return true;
            }
            switch(r0.a) {
                case 1: {
                    b0.o0(((d)r0));
                    return true;
                }
                case 2: {
                    b0.P(this);
                    return false;
                }
                case 3: {
                    String s = ((h)r0).L();
                    if(s.equals("html")) {
                        return c.g.i(r0, b0);
                    }
                    if(n.f(s, z.a)) {
                        o o0 = b0.q0(((h)r0));
                        if(s.equals("base") && o0.D("href")) {
                            b0.F0(o0);
                            return true;
                        }
                        return true;
                    }
                    if(s.equals("meta")) {
                        b0.q0(((h)r0));
                        return true;
                    }
                    if(s.equals("title")) {
                        c.g(((h)r0), b0);
                        return true;
                    }
                    if(n.f(s, z.b)) {
                        c.f(((h)r0), b0);
                        return true;
                    }
                    if(s.equals("noscript")) {
                        b0.p0(((h)r0));
                        b0.k1(c.e);
                        return true;
                    }
                    if(s.equals("script")) {
                        b0.c.B(u.f);
                        b0.E0();
                        b0.k1(c.h);
                        b0.p0(((h)r0));
                        return true;
                    }
                    if(s.equals("head")) {
                        b0.P(this);
                        return false;
                    }
                    if(s.equals("template")) {
                        b0.p0(((h)r0));
                        b0.u0();
                        b0.Q(false);
                        b0.k1(c.r);
                        b0.T0(c.r);
                        return true;
                    }
                    return this.j(r0, b0);
                }
                case 4: {
                    String s1 = ((g)r0).L();
                    if(s1.equals("head")) {
                        b0.s();
                        b0.k1(c.f);
                        return true;
                    }
                    if(n.f(s1, z.c)) {
                        return this.j(r0, b0);
                    }
                    if(s1.equals("template")) {
                        if(!b0.H0(s1)) {
                            b0.P(this);
                            return true;
                        }
                        b0.U(true);
                        if(!b0.d(s1)) {
                            b0.P(this);
                        }
                        b0.M0(s1);
                        b0.G();
                        b0.P0();
                        b0.d1();
                        return true;
                    }
                    b0.P(this);
                    return false;
                }
                default: {
                    return this.j(r0, b0);
                }
            }
        }

        private boolean j(r r0, v v0) {
            v0.u("head");
            return v0.t(r0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.u extends c {
        org.jsoup.parser.c.u(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.l()) {
                b0.P(this);
                return true;
            }
            if(r0.o() && ((h)r0).L().equals("html")) {
                return b0.R0(r0, c.g);
            }
            if(r0.n() && ((g)r0).L().equals("noscript")) {
                b0.s();
                b0.k1(c.d);
                return true;
            }
            if(!c.h(r0) && !r0.k() && (!r0.o() || !n.f(((h)r0).L(), z.f))) {
                if(r0.n() && ((g)r0).L().equals("br")) {
                    return this.j(r0, b0);
                }
                if(r0.o() && n.f(((h)r0).L(), z.J) || r0.n()) {
                    b0.P(this);
                    return false;
                }
                return this.j(r0, b0);
            }
            return b0.R0(r0, c.d);
        }

        private boolean j(r r0, b b0) {
            b0.P(this);
            b0.m0(new org.jsoup.parser.r.c().v(r0.toString()));
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.c.v extends c {
        org.jsoup.parser.c.v(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(c.h(r0)) {
                b0.m0(((org.jsoup.parser.r.c)r0));
                return true;
            }
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(r0.l()) {
                b0.P(this);
                return true;
            }
            if(r0.o()) {
                String s = ((h)r0).L();
                if(s.equals("html")) {
                    return b0.R0(r0, c.g);
                }
                if(s.equals("body")) {
                    b0.p0(((h)r0));
                    b0.Q(false);
                    b0.k1(c.g);
                    return true;
                }
                if(s.equals("frameset")) {
                    b0.p0(((h)r0));
                    b0.k1(c.t);
                    return true;
                }
                if(n.f(s, z.g)) {
                    b0.P(this);
                    o o0 = b0.a0();
                    b0.x(o0);
                    b0.R0(r0, c.d);
                    b0.X0(o0);
                    return true;
                }
                if(s.equals("head")) {
                    b0.P(this);
                    return false;
                }
                this.j(r0, b0);
                return true;
            }
            if(r0.n()) {
                String s1 = ((g)r0).L();
                if(n.f(s1, z.d)) {
                    this.j(r0, b0);
                    return true;
                }
                if(s1.equals("template")) {
                    b0.R0(r0, c.d);
                    return true;
                }
                b0.P(this);
                return false;
            }
            this.j(r0, b0);
            return true;
        }

        private boolean j(r r0, b b0) {
            b0.v("body");
            b0.Q(true);
            return b0.t(r0);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class w extends c {
        private static final int A = 24;

        w(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            switch(r0.a) {
                case 1: {
                    b0.o0(((d)r0));
                    return true;
                }
                case 2: {
                    b0.P(this);
                    return false;
                }
                case 3: {
                    return this.m(r0, b0);
                }
                case 4: {
                    return this.k(r0, b0);
                }
                case 5: {
                    if(((org.jsoup.parser.r.c)r0).w().equals("\u0000")) {
                        b0.P(this);
                        return false;
                    }
                    if(b0.R() && c.h(((org.jsoup.parser.r.c)r0))) {
                        b0.V0();
                        b0.m0(((org.jsoup.parser.r.c)r0));
                        return true;
                    }
                    b0.V0();
                    b0.m0(((org.jsoup.parser.r.c)r0));
                    b0.Q(false);
                    return true;
                }
                case 6: {
                    if(b0.j1() > 0) {
                        return b0.R0(r0, c.r);
                    }
                    if(b0.K0(z.q)) {
                        b0.P(this);
                        return true;
                    }
                    return true;
                }
                default: {
                    return true;
                }
            }
        }

        boolean j(r r0, b b0) {
            String s = ((g)r0).f;
            ArrayList arrayList0 = b0.c0();
            if(b0.Z(s) == null) {
                b0.P(this);
                return false;
            }
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                o o0 = (o)arrayList0.get(v);
                if(o0.L(s)) {
                    b0.T(s);
                    if(!b0.d(s)) {
                        b0.P(this);
                    }
                    b0.M0(s);
                    return true;
                }
                if(b.C0(o0)) {
                    b0.P(this);
                    return false;
                }
            }
            return true;
        }

        private boolean k(r r0, b b0) {
            String s = ((g)r0).L();
            s.hashCode();
            switch(s) {
                case "body": {
                    if(!b0.f0("body")) {
                        b0.P(this);
                        return false;
                    }
                    if(b0.K0(z.q)) {
                        b0.P(this);
                    }
                    b0.o(b0.Z("body"));
                    b0.k1(c.s);
                    return true;
                }
                case "br": {
                    b0.P(this);
                    b0.v("br");
                    return false;
                }
                case "dd": 
                case "dt": {
                    if(!b0.f0(s)) {
                        b0.P(this);
                        return false;
                    }
                    b0.T(s);
                    if(!b0.d(s)) {
                        b0.P(this);
                    }
                    b0.M0(s);
                    return true;
                }
                case "form": {
                    if(!b0.H0("template")) {
                        org.jsoup.nodes.r r1 = b0.Y();
                        b0.f1(null);
                        if(r1 != null && b0.f0(s)) {
                            b0.S();
                            if(!b0.d(s)) {
                                b0.P(this);
                            }
                            b0.X0(r1);
                            return true;
                        }
                        b0.P(this);
                        return false;
                    }
                    if(!b0.f0(s)) {
                        b0.P(this);
                        return false;
                    }
                    b0.S();
                    if(!b0.d(s)) {
                        b0.P(this);
                    }
                    b0.M0(s);
                    return true;
                }
                case "h1": 
                case "h2": 
                case "h3": 
                case "h4": 
                case "h5": 
                case "h6": {
                    String[] arr_s = z.i;
                    if(!b0.h0(arr_s)) {
                        b0.P(this);
                        return false;
                    }
                    b0.T(s);
                    if(!b0.d(s)) {
                        b0.P(this);
                    }
                    b0.N0(arr_s);
                    return true;
                }
                case "html": {
                    if(!b0.H0("body")) {
                        b0.P(this);
                        return false;
                    }
                    if(b0.K0(z.q)) {
                        b0.P(this);
                    }
                    b0.k1(c.s);
                    return b0.t(r0);
                }
                case "li": {
                    if(!b0.e0(s)) {
                        b0.P(this);
                        return false;
                    }
                    b0.T(s);
                    if(!b0.d(s)) {
                        b0.P(this);
                    }
                    b0.M0(s);
                    return true;
                }
                case "p": {
                    if(!b0.d0(s)) {
                        b0.P(this);
                        b0.v(s);
                        return b0.t(((g)r0));
                    }
                    b0.T(s);
                    if(!b0.d(s)) {
                        b0.P(this);
                    }
                    b0.M0(s);
                    return true;
                }
                case "sarcasm": {
                    return this.j(r0, b0);
                label_77:
                    if(n.f(s, z.r)) {
                        return this.l(r0, b0);
                    }
                    if(n.f(s, z.p)) {
                        if(!b0.f0(s)) {
                            b0.P(this);
                            return false;
                        }
                        b0.S();
                        if(!b0.d(s)) {
                            b0.P(this);
                        }
                        b0.M0(s);
                        return true;
                    }
                    if(!n.f(s, z.l)) {
                        return this.j(r0, b0);
                    }
                    else if(!b0.f0("name")) {
                        if(!b0.f0(s)) {
                            b0.P(this);
                            return false;
                        }
                        b0.S();
                        if(!b0.d(s)) {
                            b0.P(this);
                        }
                        b0.M0(s);
                        b0.G();
                        return true;
                    }
                    break;
                }
                case "span": {
                    return this.j(r0, b0);
                }
                case "template": {
                    b0.R0(r0, c.d);
                    break;
                }
                default: {
                    goto label_77;
                }
            }
            return true;
        }

        private boolean l(r r0, b b0) {
            String s = ((g)r0).L();
            ArrayList arrayList0 = b0.c0();
            for(int v = 0; v < 8; ++v) {
                o o0 = b0.V(s);
                if(o0 == null) {
                    return this.j(r0, b0);
                }
                if(!b0.J0(o0)) {
                    b0.P(this);
                    b0.W0(o0);
                    return true;
                }
                if(!b0.f0(o0.R())) {
                    b0.P(this);
                    return false;
                }
                if(b0.c() != o0) {
                    b0.P(this);
                }
                int v1 = arrayList0.size();
                o o1 = null;
                int v2 = -1;
                o o2 = null;
                boolean z = false;
                for(int v3 = 1; v3 < v1 && v3 < 0x40; ++v3) {
                    o o3 = (o)arrayList0.get(v3);
                    if(o3 == o0) {
                        o2 = (o)arrayList0.get(v3 - 1);
                        v2 = b0.Q0(o3);
                        z = true;
                    }
                    else if(z && b.C0(o3)) {
                        o1 = o3;
                        break;
                    }
                }
                if(o1 == null) {
                    b0.M0(o0.R());
                    b0.W0(o0);
                    return true;
                }
                o o4 = o1;
                o o5 = o4;
                for(int v4 = 0; v4 < 3; ++v4) {
                    if(b0.J0(o4)) {
                        o4 = b0.D(o4);
                    }
                    if(!b0.z0(o4)) {
                        b0.X0(o4);
                    }
                    else if(o4 == o0) {
                        break;
                    }
                    else {
                        o o6 = new o(b0.B(o4.N(), org.jsoup.parser.f.d), b0.W());
                        b0.Z0(o4, o6);
                        b0.b1(o4, o6);
                        if(o5 == o1) {
                            v2 = b0.Q0(o6) + 1;
                        }
                        if(o5.p2() != null) {
                            o5.d0();
                        }
                        o6.D0(o5);
                        o4 = o6;
                        o5 = o4;
                    }
                }
                if(o2 != null) {
                    if(n.f(o2.R(), z.s)) {
                        if(o5.p2() != null) {
                            o5.d0();
                        }
                        b0.t0(o5);
                    }
                    else {
                        if(o5.p2() != null) {
                            o5.d0();
                        }
                        o2.D0(o5);
                    }
                }
                o o7 = new o(o0.O2(), b0.W());
                o7.j().g(o0.j());
                o7.E0(o1.q());
                o1.D0(o7);
                b0.W0(o0);
                b0.U0(o7, v2);
                b0.X0(o0);
                b0.v0(o1, o7);
            }
            return true;
        }

        private boolean m(r r0, b b0) {
            h r$h0 = (h)r0;
            String s = r$h0.L();
            s.hashCode();
            switch(s) {
                case "a": {
                    if(b0.V("a") != null) {
                        b0.P(this);
                        b0.u("a");
                        o o1 = b0.Z("a");
                        if(o1 != null) {
                            b0.W0(o1);
                            b0.X0(o1);
                        }
                    }
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "area": 
                case "embed": 
                case "img": 
                case "wbr": {
                    b0.V0();
                    b0.q0(r$h0);
                    b0.Q(false);
                    return true;
                }
                case "b": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "big": 
                case "code": 
                case "font": 
                case "small": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "body": {
                    b0.P(this);
                    ArrayList arrayList3 = b0.c0();
                    if(arrayList3.size() == 1 || arrayList3.size() > 2 && !((o)arrayList3.get(1)).L("body") || b0.H0("template")) {
                        return false;
                    }
                    b0.Q(false);
                    if(r$h0.G()) {
                        o o4 = b0.Z("body");
                        if(o4 != null) {
                            for(Object object1: r$h0.h) {
                                org.jsoup.nodes.a a1 = (org.jsoup.nodes.a)object1;
                                if(!o4.D(a1.c())) {
                                    o4.j().J(a1);
                                }
                            }
                            return true;
                        }
                    }
                    break;
                }
                case "br": {
                    b0.V0();
                    b0.q0(r$h0);
                    b0.Q(false);
                    return true;
                }
                case "button": {
                    if(b0.d0("button")) {
                        b0.P(this);
                        b0.u("button");
                        b0.t(r$h0);
                        return true;
                    }
                    b0.V0();
                    b0.p0(r$h0);
                    b0.Q(false);
                    return true;
                }
                case "dd": 
                case "dt": {
                    b0.Q(false);
                    ArrayList arrayList1 = b0.c0();
                    int v = arrayList1.size();
                    int v1 = v - 1;
                    int v2 = v1 < 24 ? 0 : v - 25;
                    while(v1 >= v2) {
                        o o2 = (o)arrayList1.get(v1);
                        if(n.f(o2.R(), z.k)) {
                            b0.u(o2.R());
                            break;
                        }
                        if(b.C0(o2) && !n.f(o2.R(), z.j)) {
                            break;
                        }
                        --v1;
                    }
                    if(b0.d0("p")) {
                        b0.u("p");
                    }
                    b0.p0(r$h0);
                    return true;
                }
                case "em": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "form": {
                    if(b0.Y() != null && !b0.H0("template")) {
                        b0.P(this);
                        return false;
                    }
                    if(b0.d0("p")) {
                        b0.L("p");
                    }
                    b0.s0(r$h0, true, true);
                    return true;
                }
                case "frameset": {
                    b0.P(this);
                    ArrayList arrayList0 = b0.c0();
                    if(arrayList0.size() == 1 || arrayList0.size() > 2 && !((o)arrayList0.get(1)).L("body")) {
                        return false;
                    }
                    if(!b0.R()) {
                        return false;
                    }
                    o o0 = (o)arrayList0.get(1);
                    if(o0.p2() != null) {
                        o0.d0();
                    }
                    while(arrayList0.size() > 1) {
                        arrayList0.remove(arrayList0.size() - 1);
                    }
                    b0.p0(r$h0);
                    b0.k1(c.t);
                    return true;
                }
                case "h1": 
                case "h2": 
                case "h3": 
                case "h4": 
                case "h5": 
                case "h6": {
                    if(b0.d0("p")) {
                        b0.u("p");
                    }
                    if(n.f(b0.c().R(), z.i)) {
                        b0.P(this);
                        b0.s();
                    }
                    b0.p0(r$h0);
                    return true;
                }
                case "hr": {
                    if(b0.d0("p")) {
                        b0.u("p");
                    }
                    b0.q0(r$h0);
                    b0.Q(false);
                    return true;
                }
                case "html": {
                    b0.P(this);
                    if(b0.H0("template")) {
                        return false;
                    }
                    if(b0.c0().size() > 0) {
                        o o5 = (o)b0.c0().get(0);
                        if(r$h0.G()) {
                            for(Object object2: r$h0.h) {
                                org.jsoup.nodes.a a2 = (org.jsoup.nodes.a)object2;
                                if(!o5.D(a2.c())) {
                                    o5.j().J(a2);
                                }
                            }
                            return true;
                        }
                    }
                    break;
                }
                case "i": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "iframe": {
                    b0.Q(false);
                    c.f(r$h0, b0);
                    return true;
                }
                case "image": {
                    if(b0.Z("svg") == null) {
                        return b0.t(r$h0.J("img"));
                    }
                    b0.p0(r$h0);
                    return true;
                }
                case "input": {
                    b0.V0();
                    if(!b0.q0(r$h0).g("type").equalsIgnoreCase("hidden")) {
                        b0.Q(false);
                        return true;
                    }
                    break;
                }
                case "isindex": {
                    b0.P(this);
                    if(b0.Y() != null) {
                        return false;
                    }
                    b0.v("form");
                    if(r$h0.E("action")) {
                        org.jsoup.nodes.r r1 = b0.Y();
                        if(r1 != null && r$h0.E("action")) {
                            r1.j().H("action", "");
                        }
                    }
                    b0.v("hr");
                    b0.v("label");
                    String s1 = r$h0.E("prompt") ? "" : "This is a searchable index. Enter search keywords: ";
                    b0.t(new org.jsoup.parser.r.c().v(s1));
                    org.jsoup.nodes.b b1 = new org.jsoup.nodes.b();
                    if(r$h0.G()) {
                        for(Object object0: r$h0.h) {
                            org.jsoup.nodes.a a0 = (org.jsoup.nodes.a)object0;
                            if(!n.f(a0.c(), z.n)) {
                                b1.J(a0);
                            }
                        }
                    }
                    b1.H("name", "isindex");
                    b0.w("input", b1);
                    b0.u("label");
                    b0.v("hr");
                    b0.u("form");
                    return true;
                }
                case "keygen": {
                    b0.V0();
                    b0.q0(r$h0);
                    b0.Q(false);
                    return true;
                }
                case "li": {
                    b0.Q(false);
                    ArrayList arrayList2 = b0.c0();
                    for(int v3 = arrayList2.size() - 1; v3 > 0; --v3) {
                        o o3 = (o)arrayList2.get(v3);
                        if(o3.L("li")) {
                            b0.u("li");
                            break;
                        }
                        if(b.C0(o3) && !n.f(o3.R(), z.j)) {
                            break;
                        }
                    }
                    if(b0.d0("p")) {
                        b0.u("p");
                    }
                    b0.p0(r$h0);
                    return true;
                }
                case "listing": 
                case "pre": {
                    if(b0.d0("p")) {
                        b0.u("p");
                    }
                    b0.p0(r$h0);
                    b0.b.D("\n");
                    b0.Q(false);
                    return true;
                }
                case "math": {
                    b0.V0();
                    b0.r0(r$h0, "http://www.w3.org/1998/Math/MathML");
                    return true;
                }
                case "nobr": {
                    b0.V0();
                    if(b0.f0("nobr")) {
                        b0.P(this);
                        b0.u("nobr");
                        b0.V0();
                    }
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "noembed": {
                    c.f(r$h0, b0);
                    return true;
                }
                case "optgroup": 
                case "option": {
                    if(b0.d("option")) {
                        b0.u("option");
                    }
                    b0.V0();
                    b0.p0(r$h0);
                    return true;
                }
                case "plaintext": {
                    if(b0.d0("p")) {
                        b0.u("p");
                    }
                    b0.p0(r$h0);
                    b0.c.B(u.g);
                    return true;
                }
                case "rb": 
                case "rtc": {
                    if(b0.f0("ruby")) {
                        b0.S();
                        if(!b0.d("ruby")) {
                            b0.P(this);
                        }
                    }
                    b0.p0(r$h0);
                    return true;
                }
                case "rp": 
                case "rt": {
                    if(b0.f0("ruby")) {
                        b0.T("rtc");
                        if(!b0.d("rtc") && !b0.d("ruby")) {
                            b0.P(this);
                        }
                    }
                    b0.p0(r$h0);
                    return true;
                }
                case "s": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "select": {
                    b0.V0();
                    b0.p0(r$h0);
                    b0.Q(false);
                    if(!r$h0.g) {
                        c c0 = b0.i1();
                        if(!c0.equals(c.i) && !c0.equals(c.k) && !c0.equals(c.m) && !c0.equals(c.n) && !c0.equals(c.o)) {
                            b0.k1(c.p);
                            return true;
                        }
                        b0.k1(c.q);
                        return true;
                    }
                    break;
                }
                case "span": {
                    b0.V0();
                    b0.p0(r$h0);
                    return true;
                }
                case "strike": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "strong": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "svg": {
                    b0.V0();
                    b0.r0(r$h0, "http://www.w3.org/2000/svg");
                    return true;
                }
                case "table": {
                    if(b0.X().w3() != org.jsoup.nodes.f.b.b && b0.d0("p")) {
                        b0.u("p");
                    }
                    b0.p0(r$h0);
                    b0.Q(false);
                    b0.k1(c.i);
                    return true;
                }
                case "textarea": {
                    b0.p0(r$h0);
                    if(!r$h0.H()) {
                        b0.c.B(u.c);
                        b0.E0();
                        b0.Q(false);
                        b0.k1(c.h);
                        return true;
                    }
                    break;
                }
                case "tt": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "u": {
                    b0.V0();
                    b0.S0(b0.p0(r$h0));
                    return true;
                }
                case "xmp": {
                    if(b0.d0("p")) {
                        b0.u("p");
                    }
                    b0.V0();
                    b0.Q(false);
                    c.f(r$h0, b0);
                    return true;
                }
                default: {
                    if(!org.jsoup.parser.q.s(s)) {
                        b0.p0(r$h0);
                        return true;
                    }
                    if(n.f(s, z.h)) {
                        if(b0.d0("p")) {
                            b0.u("p");
                        }
                        b0.p0(r$h0);
                        return true;
                    }
                    if(n.f(s, z.g)) {
                        return b0.R0(r0, c.d);
                    }
                    if(n.f(s, z.l)) {
                        b0.V0();
                        b0.p0(r$h0);
                        b0.u0();
                        b0.Q(false);
                        return true;
                    }
                    if(n.f(s, z.m)) {
                        b0.q0(r$h0);
                        return true;
                    }
                    if(n.f(s, z.o)) {
                        b0.P(this);
                        return false;
                    }
                    b0.V0();
                    b0.p0(r$h0);
                    return true;
                }
            }
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class x extends c {
        x(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.j()) {
                b0.m0(((org.jsoup.parser.r.c)r0));
                return true;
            }
            if(r0.m()) {
                b0.P(this);
                b0.s();
                b0.k1(b0.L0());
                return b0.t(r0);
            }
            if(r0.n()) {
                b0.s();
                b0.k1(b0.L0());
            }
            return true;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class y extends c {
        y(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.c
        boolean i(r r0, b b0) {
            if(r0.j() && n.f(b0.c().R(), z.B)) {
                b0.e1();
                b0.E0();
                b0.k1(c.j);
                return b0.t(r0);
            }
            if(r0.k()) {
                b0.o0(((d)r0));
                return true;
            }
            if(r0.l()) {
                b0.P(this);
                return false;
            }
            if(r0.o()) {
                String s = ((h)r0).L();
                if(s.equals("caption")) {
                    b0.J();
                    b0.u0();
                    b0.p0(((h)r0));
                    b0.k1(c.k);
                    return true;
                }
                if(s.equals("colgroup")) {
                    b0.J();
                    b0.p0(((h)r0));
                    b0.k1(c.l);
                    return true;
                }
                if(s.equals("col")) {
                    b0.J();
                    b0.v("colgroup");
                    return b0.t(r0);
                }
                if(n.f(s, z.t)) {
                    b0.J();
                    b0.p0(((h)r0));
                    b0.k1(c.m);
                    return true;
                }
                if(n.f(s, z.u)) {
                    b0.J();
                    b0.v("tbody");
                    return b0.t(r0);
                }
                if(s.equals("table")) {
                    b0.P(this);
                    if(!b0.l0(s)) {
                        return false;
                    }
                    b0.M0(s);
                    if(!b0.d1()) {
                        b0.p0(((h)r0));
                        return true;
                    }
                    return b0.t(r0);
                }
                if(n.f(s, z.v)) {
                    return b0.R0(r0, c.d);
                }
                if(s.equals("input")) {
                    if(((h)r0).G() && false) {
                        b0.q0(((h)r0));
                        return true;
                    }
                    return this.j(r0, b0);
                }
                if(s.equals("form")) {
                    b0.P(this);
                    if(b0.Y() == null && !b0.H0("template")) {
                        b0.s0(((h)r0), false, false);
                        return true;
                    }
                    return false;
                }
                return this.j(r0, b0);
            }
            if(r0.n()) {
                String s1 = ((g)r0).L();
                if(s1.equals("table")) {
                    if(!b0.l0(s1)) {
                        b0.P(this);
                        return false;
                    }
                    b0.M0("table");
                    b0.d1();
                    return true;
                }
                if(n.f(s1, z.A)) {
                    b0.P(this);
                    return false;
                }
                if(s1.equals("template")) {
                    b0.R0(r0, c.d);
                    return true;
                }
                return this.j(r0, b0);
            }
            if(r0.m()) {
                if(b0.d("html")) {
                    b0.P(this);
                }
                return true;
            }
            return this.j(r0, b0);
        }

        boolean j(r r0, b b0) {
            b0.P(this);
            b0.g1(true);
            b0.R0(r0, c.g);
            b0.g1(false);
            return true;
        }
    }

    static final class z {
        static final String[] A;
        static final String[] B;
        static final String[] C;
        static final String[] D;
        static final String[] E;
        static final String[] F;
        static final String[] G;
        static final String[] H;
        static final String[] I;
        static final String[] J;
        static final String[] K;
        static final String[] L;
        static final String[] M;
        static final String[] N;
        static final String[] a;
        static final String[] b;
        static final String[] c;
        static final String[] d;
        static final String[] e;
        static final String[] f;
        static final String[] g;
        static final String[] h;
        static final String[] i;
        static final String[] j;
        static final String[] k;
        static final String[] l;
        static final String[] m;
        static final String[] n;
        static final String[] o;
        static final String[] p;
        static final String[] q;
        static final String[] r;
        static final String[] s;
        static final String[] t;
        static final String[] u;
        static final String[] v;
        static final String[] w;
        static final String[] x;
        static final String[] y;
        static final String[] z;

        static {
            z.a = new String[]{"base", "basefont", "bgsound", "command", "link"};
            z.b = new String[]{"noframes", "style"};
            z.c = new String[]{"body", "br", "html"};
            z.d = new String[]{"body", "br", "html"};
            z.e = new String[]{"body", "br", "head", "html"};
            z.f = new String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"};
            z.g = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
            z.h = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
            z.i = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            z.j = new String[]{"address", "div", "p"};
            z.k = new String[]{"dd", "dt"};
            z.l = new String[]{"applet", "marquee", "object"};
            z.m = new String[]{"param", "source", "track"};
            z.n = new String[]{"action", "name", "prompt"};
            z.o = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            z.p = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            z.q = new String[]{"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
            z.r = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
            z.s = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            z.t = new String[]{"tbody", "tfoot", "thead"};
            z.u = new String[]{"td", "th", "tr"};
            z.v = new String[]{"script", "style", "template"};
            z.w = new String[]{"td", "th"};
            z.x = new String[]{"body", "caption", "col", "colgroup", "html"};
            z.y = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            z.z = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
            z.A = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            z.B = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            z.C = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
            z.D = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
            z.E = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
            z.F = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
            z.G = new String[]{"input", "keygen", "textarea"};
            z.H = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
            z.I = new String[]{"tbody", "tfoot", "thead"};
            z.J = new String[]{"head", "noscript"};
            z.K = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            z.L = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
            z.M = new String[]{"caption", "colgroup", "tbody", "tfoot", "thead"};
            z.N = new String[]{"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
        }
    }

    Initial /* 警告！未生成枚举子类：org.jsoup.parser.c$k */,
    BeforeHtml /* 警告！未生成枚举子类：org.jsoup.parser.c$r */,
    BeforeHead /* 警告！未生成枚举子类：org.jsoup.parser.c$s */,
    InHead /* 警告！未生成枚举子类：org.jsoup.parser.c$t */,
    InHeadNoscript /* 警告！未生成枚举子类：org.jsoup.parser.c$u */,
    AfterHead /* 警告！未生成枚举子类：org.jsoup.parser.c$v */,
    InBody /* 警告！未生成枚举子类：org.jsoup.parser.c$w */,
    Text /* 警告！未生成枚举子类：org.jsoup.parser.c$x */,
    InTable /* 警告！未生成枚举子类：org.jsoup.parser.c$y */,
    InTableText /* 警告！未生成枚举子类：org.jsoup.parser.c$a */,
    InCaption /* 警告！未生成枚举子类：org.jsoup.parser.c$b */,
    InColumnGroup /* 警告！未生成枚举子类：org.jsoup.parser.c$c */,
    InTableBody /* 警告！未生成枚举子类：org.jsoup.parser.c$d */,
    InRow /* 警告！未生成枚举子类：org.jsoup.parser.c$e */,
    InCell /* 警告！未生成枚举子类：org.jsoup.parser.c$f */,
    InSelect /* 警告！未生成枚举子类：org.jsoup.parser.c$g */,
    InSelectInTable /* 警告！未生成枚举子类：org.jsoup.parser.c$h */,
    InTemplate /* 警告！未生成枚举子类：org.jsoup.parser.c$i */,
    AfterBody /* 警告！未生成枚举子类：org.jsoup.parser.c$j */,
    InFrameset /* 警告！未生成枚举子类：org.jsoup.parser.c$l */,
    AfterFrameset /* 警告！未生成枚举子类：org.jsoup.parser.c$m */,
    AfterAfterBody /* 警告！未生成枚举子类：org.jsoup.parser.c$n */,
    AfterAfterFrameset /* 警告！未生成枚举子类：org.jsoup.parser.c$o */,
    ForeignContent /* 警告！未生成枚举子类：org.jsoup.parser.c$p */;

    private static final String y;

    static {
        c.y = "\u0000";
    }

    private c() {
    }

    private static c[] a() [...] // Inlined contents

    // 去混淆评级： 低(20)
    static String e() [...] // 潜在的解密器

    private static void f(h r$h0, b b0) {
        b0.c.B(u.e);
        b0.E0();
        b0.k1(c.h);
        b0.p0(r$h0);
    }

    private static void g(h r$h0, b b0) {
        b0.c.B(u.c);
        b0.E0();
        b0.k1(c.h);
        b0.p0(r$h0);
    }

    // 去混淆评级： 低(20)
    private static boolean h(r r0) {
        return r0.j() ? n.i(((org.jsoup.parser.r.c)r0).w()) : false;
    }

    abstract boolean i(r arg1, b arg2);
}

