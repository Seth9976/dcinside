package j$.time.format;

import j..time.chrono.l;
import j..time.chrono.s;
import j..time.temporal.a;
import j..time.temporal.m;
import j..time.temporal.q;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;

final class r implements f {
    private final q a;
    private final G b;
    private final B c;
    private volatile j d;

    r(q q0, G g0, B b0) {
        this.a = q0;
        this.b = g0;
        this.c = b0;
    }

    @Override  // j$.time.format.f
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        String s;
        Long long0 = y0.e(this.a);
        if(long0 == null) {
            return false;
        }
        Object object0 = y0.d().y(m.e());
        if(((l)object0) == null || ((l)object0) == s.d) {
            Locale locale1 = y0.c();
            s = this.c.f(this.a, ((long)long0), this.b, locale1);
        }
        else {
            Locale locale0 = y0.c();
            s = this.c.e(((l)object0), this.a, ((long)long0), this.b, locale0);
        }
        if(s == null) {
            if(this.d == null) {
                this.d = new j(this.a, 1, 19, F.NORMAL);
            }
            return this.d.l(y0, stringBuilder0);
        }
        stringBuilder0.append(s);
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        if(v < 0 || v > charSequence0.length()) {
            throw new IndexOutOfBoundsException();
        }
        G g0 = w0.l() ? this.b : null;
        l l0 = w0.h();
        q q0 = this.a;
        Iterator iterator0 = l0 == null || l0 == s.d ? this.c.h(q0, g0, w0.i()) : this.c.g(l0, q0, g0, w0.i());
        if(iterator0 != null) {
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(w0.s(s, 0, charSequence0, v, s.length())) {
                    long v1 = (long)(((Long)map$Entry0.getValue()));
                    return w0.o(this.a, v1, v, s.length() + v);
                }
                if(false) {
                    break;
                }
            }
            if(q0 == a.ERA && !w0.l()) {
                for(Object object1: l0.K()) {
                    j..time.chrono.m m0 = (j..time.chrono.m)object1;
                    String s1 = m0.toString();
                    if(w0.s(s1, 0, charSequence0, v, s1.length())) {
                        long v2 = (long)m0.getValue();
                        return w0.o(this.a, v2, v, s1.length() + v);
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(w0.l()) {
                return ~v;
            }
        }
        if(this.d == null) {
            this.d = new j(this.a, 1, 19, F.NORMAL);
        }
        return this.d.n(w0, charSequence0, v);
    }

    @Override
    public final String toString() {
        return this.b == G.FULL ? "Text(" + this.a + ")" : "Text(" + this.a + "," + this.b + ")";
    }
}

