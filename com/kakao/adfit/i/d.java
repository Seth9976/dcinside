package com.kakao.adfit.i;

import com.kakao.adfit.m.D;
import com.kakao.adfit.m.f;
import j..util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        static String a(a d$a0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = D.a.a().a();
            }
            return d$a0.b(v);
        }

        public final d a() {
            return new d(a.a(this, 0L, 1, null), null);
        }

        public final d a(long v) {
            return new d(this.b(v), null);
        }

        public final d a(String s) {
            if(s != null) {
                return (d.b.b(s) ? s : null) == null ? null : new d(s, null);
            }
            return null;
        }

        private final String b(long v) {
            String s = this.b().format(v);
            L.o(s, "getIsoFormat().format(millis)");
            return s;
        }

        private final SimpleDateFormat b() {
            TimeZone timeZone0 = DesugarTimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.US);
            simpleDateFormat0.setTimeZone(timeZone0);
            return simpleDateFormat0;
        }

        private final boolean b(String s) {
            try {
                this.b().parse(s);
                return true;
            }
            catch(ParseException unused_ex) {
                f.e(("MatrixDate timestamp is not ISO format. [timestamp = " + s + ']'));
                return false;
            }
        }
    }

    private final String a;
    public static final a b;

    static {
        d.b = new a(null);
    }

    private d(String s) {
        this.a = s;
    }

    public d(String s, w w0) {
        this(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof d ? L.g(((d)object0).a, this.a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a;
    }
}

