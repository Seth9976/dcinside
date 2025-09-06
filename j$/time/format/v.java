package j$.time.format;

import j..time.temporal.i;
import j..time.temporal.k;
import j..time.temporal.m;
import j..time.temporal.q;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class v {
    private v a;
    private final v b;
    private final ArrayList c;
    private final boolean d;
    private int e;
    private char f;
    private int g;
    private static final a h;
    private static final HashMap i;

    static {
        v.h = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        HashMap hashMap0 = new HashMap();
        v.i = hashMap0;
        hashMap0.put(Character.valueOf('G'), j..time.temporal.a.ERA);
        hashMap0.put(Character.valueOf('y'), j..time.temporal.a.YEAR_OF_ERA);
        hashMap0.put(Character.valueOf('u'), j..time.temporal.a.YEAR);
        hashMap0.put(Character.valueOf('Q'), i.a);
        hashMap0.put(Character.valueOf('q'), i.a);
        hashMap0.put(Character.valueOf('M'), j..time.temporal.a.MONTH_OF_YEAR);
        hashMap0.put(Character.valueOf('L'), j..time.temporal.a.MONTH_OF_YEAR);
        hashMap0.put(Character.valueOf('D'), j..time.temporal.a.DAY_OF_YEAR);
        hashMap0.put(Character.valueOf('d'), j..time.temporal.a.DAY_OF_MONTH);
        hashMap0.put(Character.valueOf('F'), j..time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        hashMap0.put(Character.valueOf('E'), j..time.temporal.a.DAY_OF_WEEK);
        hashMap0.put(Character.valueOf('c'), j..time.temporal.a.DAY_OF_WEEK);
        hashMap0.put(Character.valueOf('e'), j..time.temporal.a.DAY_OF_WEEK);
        hashMap0.put(Character.valueOf('a'), j..time.temporal.a.AMPM_OF_DAY);
        hashMap0.put(Character.valueOf('H'), j..time.temporal.a.HOUR_OF_DAY);
        hashMap0.put(Character.valueOf('k'), j..time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap0.put(Character.valueOf('K'), j..time.temporal.a.HOUR_OF_AMPM);
        hashMap0.put(Character.valueOf('h'), j..time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap0.put(Character.valueOf('m'), j..time.temporal.a.MINUTE_OF_HOUR);
        hashMap0.put(Character.valueOf('s'), j..time.temporal.a.SECOND_OF_MINUTE);
        hashMap0.put(Character.valueOf('S'), j..time.temporal.a.NANO_OF_SECOND);
        hashMap0.put(Character.valueOf('A'), j..time.temporal.a.MILLI_OF_DAY);
        hashMap0.put(Character.valueOf('n'), j..time.temporal.a.NANO_OF_SECOND);
        hashMap0.put(Character.valueOf('N'), j..time.temporal.a.NANO_OF_DAY);
        hashMap0.put(Character.valueOf('g'), k.a);
    }

    public v() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    private v(v v0) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = v0;
        this.d = true;
    }

    public final void a(DateTimeFormatter dateTimeFormatter0) {
        Objects.requireNonNull(dateTimeFormatter0, "formatter");
        this.d(dateTimeFormatter0.f());
    }

    public final void b(j..time.temporal.a a0, int v, int v1, boolean z) {
        if(v == v1 && !z) {
            this.m(new g(a0, v, v1, false));
            return;
        }
        this.d(new g(a0, v, v1, z));
    }

    public final void c() {
        this.d(new h());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    private int d(f f0) {
        Objects.requireNonNull(f0, "pp");
        v v0 = this.a;
        int v1 = v0.e;
        if(v1 > 0) {
            if(f0 != null) {
                f0 = new l(f0, v1, v0.f);
            }
            v0.e = 0;
            v0.f = '\u0000';
        }
        v0.c.add(f0);
        this.a.g = -1;
        return this.a.c.size() - 1;
    }

    public final void e(char c) {
        this.d(new d(c));
    }

    public final void f(String s) {
        Objects.requireNonNull(s, "literal");
        if(!s.isEmpty()) {
            if(s.length() == 1) {
                this.d(new d(s.charAt(0)));
                return;
            }
            this.d(new j..time.format.i(1, s));
        }
    }

    public final void g(G g0) {
        Objects.requireNonNull(g0, "style");
        if(g0 != G.FULL && g0 != G.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        this.d(new j..time.format.i(0, g0));
    }

    public final void h(String s, String s1) {
        this.d(new j..time.format.k(s, s1));
    }

    public final void i() {
        this.d(j..time.format.k.e);
    }

    public final void j(String s) {
        boolean z;
        int v6;
        int v5;
        Objects.requireNonNull(s, "pattern");
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if((v1 < 65 || v1 > 90) && (v1 < 97 || v1 > 0x7A)) {
            label_178:
                switch(v1) {
                    case 39: {
                        int v7;
                        for(v7 = v + 1; v7 < s.length(); ++v7) {
                            if(s.charAt(v7) == 39) {
                                if(v7 + 1 >= s.length() || s.charAt(v7 + 1) != 39) {
                                    break;
                                }
                                else {
                                    ++v7;
                                }
                            }
                        }
                        if(v7 >= s.length()) {
                            throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + s);
                        }
                        String s2 = s.substring(v + 1, v7);
                        if(s2.isEmpty()) {
                            this.e('\'');
                        }
                        else {
                            this.f(s2.replace("\'\'", "\'"));
                        }
                        v = v7;
                        break;
                    }
                    case 91: {
                        this.s();
                        break;
                    }
                    case 93: {
                        if(this.a.b == null) {
                            throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                        }
                        this.r();
                        break;
                    }
                    case 35: 
                    case 0x7B: 
                    case 0x7D: {
                        throw new IllegalArgumentException("Pattern includes reserved character: \'" + ((char)v1) + "\'");
                    }
                    default: {
                        this.e(((char)v1));
                        break;
                    }
                }
            }
            else {
                int v2;
                for(v2 = v + 1; v2 < s.length() && s.charAt(v2) == v1; ++v2) {
                }
                int v3 = v2 - v;
                if(v1 == 0x70) {
                    if(v2 < s.length()) {
                        v1 = s.charAt(v2);
                        if(v1 >= 65 && v1 <= 90 || v1 >= 97 && v1 <= 0x7A) {
                            int v4;
                            for(v4 = v2 + 1; v4 < s.length() && s.charAt(v4) == v1; ++v4) {
                            }
                            v5 = v4 - v2;
                        }
                    }
                    else {
                        v4 = v2;
                        v5 = v3;
                        v3 = 0;
                    }
                    if(v3 == 0) {
                        throw new IllegalArgumentException("Pad letter \'p\' must be followed by valid pad pattern: " + s);
                    }
                    if(v3 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + v3);
                    }
                    this.a.e = v3;
                    this.a.f = ' ';
                    this.a.g = -1;
                    v3 = v5;
                    v6 = v4;
                }
                else {
                    v6 = v2;
                }
                String s1 = "+0000";
                q q0 = (q)v.i.get(Character.valueOf(((char)v1)));
                if(q0 == null) {
                    switch(v1) {
                        case 86: {
                            if(v3 != 2) {
                                throw new IllegalArgumentException("Pattern letter count must be 2: " + 'V');
                            }
                            this.d(new t(m.l(), "ZoneId()"));
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 87: {
                            if(v3 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'W');
                            }
                            this.m(new s('W', v3, v3, v3, 0));
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 88: {
                            if(v3 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'X');
                            }
                            this.h(j..time.format.k.d[v3 + (v3 == 1 ? 0 : 1)], "Z");
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 89: {
                            if(v3 == 2) {
                                this.m(new s('Y', 2, 2, 2, 0));
                            }
                            else {
                                this.m(new s('Y', v3, v3, 19, 0));
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 90: {
                            if(v3 < 4) {
                                this.h("+HHMM", "+0000");
                            }
                            else if(v3 == 4) {
                                this.g(G.FULL);
                            }
                            else {
                                if(v3 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + 'Z');
                                }
                                this.h("+HH:MM:ss", "Z");
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 0x76: {
                            if(v3 == 1) {
                                this.d(new u(G.SHORT, true));
                            }
                            else {
                                if(v3 != 4) {
                                    throw new IllegalArgumentException("Wrong number of  pattern letters: " + 'v');
                                }
                                this.d(new u(G.FULL, true));
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 0x77: {
                            if(v3 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'w');
                            }
                            this.m(new s('w', v3, v3, 2, 0));
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 120: {
                            if(v3 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'x');
                            }
                            if(v3 == 1) {
                                s1 = "+00";
                            }
                            else if(v3 % 2 != 0) {
                                s1 = "+00:00";
                            }
                            this.h(j..time.format.k.d[v3 + (v3 == 1 ? 0 : 1)], s1);
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 0x7A: {
                            if(v3 > 4) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'z');
                            }
                            if(v3 == 4) {
                                this.d(new u(G.FULL, false));
                            }
                            else {
                                this.d(new u(G.SHORT, false));
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown pattern letter: " + ((char)v1));
                        }
                    }
                }
                else {
                    switch(v1) {
                        case 68: {
                            if(v3 == 1) {
                                this.n(q0);
                            }
                            else {
                                if(v3 != 2 && v3 != 3) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + 'D');
                                }
                                this.p(q0, v3, 3, F.NOT_NEGATIVE);
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 70: {
                            if(v3 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'F');
                            }
                            this.n(q0);
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 71: {
                            switch(v3) {
                                case 1: 
                                case 2: 
                                case 3: {
                                    this.l(q0, G.SHORT);
                                    break;
                                }
                                case 4: {
                                    this.l(q0, G.FULL);
                                    break;
                                }
                                case 5: {
                                    this.l(q0, G.NARROW);
                                    break;
                                }
                                default: {
                                    throw new IllegalArgumentException("Too many pattern letters: " + 'G');
                                }
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 83: {
                            this.b(j..time.temporal.a.NANO_OF_SECOND, v3, v3, false);
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 97: {
                            if(v3 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'a');
                            }
                            this.l(q0, G.SHORT);
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 99: {
                            if(v3 == 1) {
                                this.m(new s('c', 1, 1, 1, 0));
                                v = v6 - 1;
                                goto label_203;
                            }
                            else {
                                if(v3 == 2) {
                                    throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                }
                                z = true;
                            }
                        label_88:
                            switch(v3) {
                                case 1: 
                                case 2: {
                                    switch(v1) {
                                        case 69: {
                                            this.l(q0, G.SHORT);
                                            break;
                                        }
                                        case 101: {
                                            this.m(new s('e', v3, v3, v3, 0));
                                            break;
                                        }
                                        default: {
                                            if(v3 == 1) {
                                                this.n(q0);
                                            }
                                            else {
                                                this.o(q0, 2);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 3: {
                                    this.l(q0, (z ? G.SHORT_STANDALONE : G.SHORT));
                                    break;
                                }
                                case 4: {
                                    this.l(q0, (z ? G.FULL_STANDALONE : G.FULL));
                                    break;
                                }
                                case 5: {
                                    this.l(q0, (z ? G.NARROW_STANDALONE : G.NARROW));
                                    break;
                                }
                                default: {
                                    throw new IllegalArgumentException("Too many pattern letters: " + ((char)v1));
                                }
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 69: 
                        case 77: 
                        case 81: 
                        case 101: {
                            z = false;
                            goto label_88;
                        }
                        case 103: {
                            this.p(q0, v3, 19, F.NORMAL);
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 65: 
                        case 78: 
                        case 110: {
                            this.p(q0, v3, 19, F.NOT_NEGATIVE);
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 76: 
                        case 0x71: {
                            z = true;
                            goto label_88;
                        }
                        case 72: 
                        case 75: 
                        case 100: 
                        case 104: 
                        case 107: 
                        case 109: 
                        case 0x73: {
                            if(v3 == 1) {
                                this.n(q0);
                            }
                            else {
                                if(v3 != 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + ((char)v1));
                                }
                                this.o(q0, 2);
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        case 0x75: 
                        case 0x79: {
                            if(v3 == 2) {
                                Objects.requireNonNull(q0, "field");
                                Objects.requireNonNull(p.h, "baseDate");
                                this.m(new p(q0, p.h));
                            }
                            else if(v3 < 4) {
                                this.p(q0, v3, 19, F.NORMAL);
                            }
                            else {
                                this.p(q0, v3, 19, F.EXCEEDS_PAD);
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                        default: {
                            if(v3 == 1) {
                                this.n(q0);
                            }
                            else {
                                this.o(q0, v3);
                            }
                            v = v6 - 1;
                            goto label_203;
                        }
                    }
                }
                goto label_178;
            }
        label_203:
            ++v;
        }
    }

    public final void k(j..time.temporal.a a0, HashMap hashMap0) {
        Objects.requireNonNull(a0, "field");
        Objects.requireNonNull(hashMap0, "textLookup");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(hashMap0);
        b b0 = new b(new A(Collections.singletonMap(G.FULL, linkedHashMap0)));
        this.d(new r(a0, G.FULL, b0));
    }

    public final void l(q q0, G g0) {
        Objects.requireNonNull(q0, "field");
        Objects.requireNonNull(g0, "textStyle");
        this.d(new r(q0, g0, B.d()));
    }

    private void m(j j0) {
        j j2;
        v v0 = this.a;
        int v1 = v0.g;
        if(v1 >= 0) {
            j j1 = (j)v0.c.get(v1);
            int v2 = j0.c;
            if(j0.b != v2 || j0.d != F.NOT_NEGATIVE) {
                j2 = j1.e();
                v v3 = this.a;
                v3.g = this.d(j0);
            }
            else {
                j2 = j1.f(v2);
                this.d(j0.e());
                this.a.g = v1;
            }
            this.a.c.set(v1, j2);
            return;
        }
        v0.g = this.d(j0);
    }

    public final void n(q q0) {
        Objects.requireNonNull(q0, "field");
        this.m(new j(q0, 1, 19, F.NORMAL));
    }

    public final void o(q q0, int v) {
        Objects.requireNonNull(q0, "field");
        if(v < 1 || v > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + v);
        }
        this.m(new j(q0, v, v, F.NOT_NEGATIVE));
    }

    public final void p(q q0, int v, int v1, F f0) {
        if(v == v1 && f0 == F.NOT_NEGATIVE) {
            this.o(q0, v1);
            return;
        }
        Objects.requireNonNull(q0, "field");
        Objects.requireNonNull(f0, "signStyle");
        if(v < 1 || v > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + v);
        }
        if(v1 < 1 || v1 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + v1);
        }
        if(v1 < v) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + v1 + " < " + v);
        }
        this.m(new j(q0, v, v1, f0));
    }

    public final void q() {
        this.d(new t(v.h, "ZoneRegionId()"));
    }

    public final void r() {
        v v0 = this.a;
        if(v0.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if(v0.c.size() > 0) {
            e e0 = new e(this.a.c, this.a.d);
            this.a = this.a.b;
            this.d(e0);
            return;
        }
        this.a = this.a.b;
    }

    public final void s() {
        this.a.g = -1;
        this.a = new v(this.a);
    }

    public final void t() {
        this.d(j..time.format.q.INSENSITIVE);
    }

    public final void u() {
        this.d(j..time.format.q.SENSITIVE);
    }

    public final void v() {
        this.d(j..time.format.q.LENIENT);
    }

    public final void w() {
        this.d(j..time.format.q.STRICT);
    }

    public final DateTimeFormatter x() {
        return this.z(Locale.getDefault(), E.SMART, null);
    }

    final DateTimeFormatter y(E e0, j..time.chrono.s s0) {
        return this.z(Locale.getDefault(), e0, s0);
    }

    private DateTimeFormatter z(Locale locale0, E e0, j..time.chrono.s s0) {
        Objects.requireNonNull(locale0, "locale");
        while(this.a.b != null) {
            this.r();
        }
        return new DateTimeFormatter(new e(this.c, false), locale0, C.a, e0, s0);
    }
}

