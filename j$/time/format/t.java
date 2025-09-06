package j$.time.format;

import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.b;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.zone.j;
import java.text.ParsePosition;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Set;

class t implements f {
    private final TemporalQuery a;
    private final String b;
    private static volatile AbstractMap.SimpleImmutableEntry c;
    private static volatile AbstractMap.SimpleImmutableEntry d;

    t(TemporalQuery temporalQuery0, String s) {
        this.a = temporalQuery0;
        this.b = s;
    }

    protected n a(w w0) {
        Set set0 = j.a();
        int v = set0.size();
        AbstractMap.SimpleImmutableEntry abstractMap$SimpleImmutableEntry0 = w0.k() ? t.c : t.d;
        if(abstractMap$SimpleImmutableEntry0 == null || ((int)(((Integer)abstractMap$SimpleImmutableEntry0.getKey()))) != v) {
            synchronized(this) {
                abstractMap$SimpleImmutableEntry0 = w0.k() ? t.c : t.d;
                if(abstractMap$SimpleImmutableEntry0 == null || ((int)(((Integer)abstractMap$SimpleImmutableEntry0.getKey()))) != v) {
                    abstractMap$SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry(v, n.g(set0, w0));
                    if(w0.k()) {
                        t.c = abstractMap$SimpleImmutableEntry0;
                    }
                    else {
                        t.d = abstractMap$SimpleImmutableEntry0;
                    }
                }
            }
        }
        return (n)abstractMap$SimpleImmutableEntry0.getValue();
    }

    private static int b(w w0, CharSequence charSequence0, int v, int v1, k k0) {
        String s = charSequence0.subSequence(v, v1).toString().toUpperCase();
        if(v1 >= charSequence0.length()) {
            w0.n(ZoneId.of(s));
            return v1;
        }
        if(charSequence0.charAt(v1) != 0x30 && !w0.b(charSequence0.charAt(v1), 'Z')) {
            w w1 = w0.d();
            int v2 = k0.n(w1, charSequence0, v1);
            try {
                if(v2 < 0) {
                    if(k0 == k.e) {
                        return ~v;
                    }
                    w0.n(ZoneId.of(s));
                    return v1;
                }
                w0.n(ZoneId.S(s, ZoneOffset.Z(((int)(((long)w1.j(a.OFFSET_SECONDS)))))));
                return v2;
            }
            catch(b unused_ex) {
                return ~v;
            }
        }
        w0.n(ZoneId.of(s));
        return v1;
    }

    @Override  // j$.time.format.f
    public boolean l(y y0, StringBuilder stringBuilder0) {
        ZoneId zoneId0 = (ZoneId)y0.f(this.a);
        if(zoneId0 == null) {
            return false;
        }
        stringBuilder0.append(zoneId0.k());
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        if(v > v1) {
            throw new IndexOutOfBoundsException();
        }
        if(v == v1) {
            return ~v;
        }
        int v2 = charSequence0.charAt(v);
        if(v2 != 43 && v2 != 45) {
            if(v1 >= v + 2) {
                int v3 = charSequence0.charAt(v + 1);
                if(w0.b(((char)v2), 'U') && w0.b(((char)v3), 'T')) {
                    return v1 < v + 3 || !w0.b(charSequence0.charAt(v + 2), 'C') ? t.b(w0, charSequence0, v, v + 2, k.f) : t.b(w0, charSequence0, v, v + 3, k.f);
                }
                if(w0.b(((char)v2), 'G') && v1 >= v + 3 && w0.b(((char)v3), 'M') && w0.b(charSequence0.charAt(v + 2), 'T')) {
                    if(v1 >= v + 4 && w0.b(charSequence0.charAt(v + 3), '0')) {
                        w0.n(ZoneId.of("GMT0"));
                        return v + 4;
                    }
                    return t.b(w0, charSequence0, v, v + 3, k.f);
                }
            }
            n n0 = this.a(w0);
            ParsePosition parsePosition0 = new ParsePosition(v);
            String s = n0.d(charSequence0, parsePosition0);
            if(s == null) {
                if(w0.b(((char)v2), 'Z')) {
                    w0.n(ZoneOffset.UTC);
                    return v + 1;
                }
                return ~v;
            }
            w0.n(ZoneId.of(s));
            return parsePosition0.getIndex();
        }
        return t.b(w0, charSequence0, v, v, k.e);
    }

    @Override
    public final String toString() {
        return this.b;
    }
}

