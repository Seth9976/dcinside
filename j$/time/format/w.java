package j$.time.format;

import j..time.ZoneId;
import j..time.chrono.l;
import j..time.chrono.s;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.a;
import j..time.temporal.q;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Locale;

final class w {
    private DateTimeFormatter a;
    private boolean b;
    private boolean c;
    private final ArrayList d;
    private ArrayList e;

    w(DateTimeFormatter dateTimeFormatter0) {
        this.b = true;
        this.c = true;
        ArrayList arrayList0 = new ArrayList();
        this.d = arrayList0;
        this.e = null;
        this.a = dateTimeFormatter0;
        arrayList0.add(new D());
    }

    final void a(o o0) {
        if(this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(o0);
    }

    // 去混淆评级： 低(20)
    final boolean b(char c, char c1) {
        return this.b ? c == c1 : w.c(c, c1);
    }

    static boolean c(char c, char c1) {
        return c == c1 || Character.toUpperCase(c) == Character.toUpperCase(c1) || Character.toLowerCase(c) == Character.toLowerCase(c1);
    }

    final w d() {
        w w0 = new w(this.a);
        w0.b = this.b;
        w0.c = this.c;
        return w0;
    }

    private D e() {
        return (D)this.d.get(this.d.size() - 1);
    }

    final void f(boolean z) {
        ArrayList arrayList0 = this.d;
        if(z) {
            arrayList0.remove(arrayList0.size() - 2);
            return;
        }
        arrayList0.remove(arrayList0.size() - 1);
    }

    final C g() {
        return this.a.c();
    }

    final l h() {
        l l0 = this.e().c;
        if(l0 == null) {
            l0 = this.a.b();
            if(l0 == null) {
                return s.d;
            }
        }
        return l0;
    }

    final Locale i() {
        return this.a.d();
    }

    final Long j(a a0) {
        return (Long)this.e().a.get(a0);
    }

    final boolean k() {
        return this.b;
    }

    final boolean l() {
        return this.c;
    }

    final void m(boolean z) {
        this.b = z;
    }

    final void n(ZoneId zoneId0) {
        Objects.requireNonNull(zoneId0, "zone");
        this.e().b = zoneId0;
    }

    final int o(q q0, long v, int v1, int v2) {
        Objects.requireNonNull(q0, "field");
        Long long0 = (Long)this.e().a.put(q0, v);
        return long0 == null || ((long)long0) == v ? v2 : ~v1;
    }

    final void p() {
        this.e().d = true;
    }

    final void q(boolean z) {
        this.c = z;
    }

    final void r() {
        D d0 = this.e();
        d0.getClass();
        D d1 = new D();
        d1.a.putAll(d0.a);
        d1.b = d0.b;
        d1.c = d0.c;
        d1.d = d0.d;
        this.d.add(d1);
    }

    final boolean s(CharSequence charSequence0, int v, CharSequence charSequence1, int v1, int v2) {
        if(v + v2 <= charSequence0.length() && v1 + v2 <= charSequence1.length()) {
            if(this.b) {
                for(int v3 = 0; v3 < v2; ++v3) {
                    if(charSequence0.charAt(v + v3) != charSequence1.charAt(v1 + v3)) {
                        return false;
                    }
                }
                return true;
            }
            for(int v4 = 0; v4 < v2; ++v4) {
                int v5 = charSequence0.charAt(v + v4);
                int v6 = charSequence1.charAt(v1 + v4);
                if(v5 != v6 && Character.toUpperCase(((char)v5)) != Character.toUpperCase(((char)v6)) && Character.toLowerCase(((char)v5)) != Character.toLowerCase(((char)v6))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    final TemporalAccessor t(E e0) {
        TemporalAccessor temporalAccessor0 = this.e();
        temporalAccessor0.c = this.h();
        ZoneId zoneId0 = temporalAccessor0.b;
        if(zoneId0 == null) {
            this.a.getClass();
            zoneId0 = null;
        }
        temporalAccessor0.b = zoneId0;
        ((D)temporalAccessor0).j(e0);
        return temporalAccessor0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return "{},null";
    }
}

