package com.fasterxml.jackson.annotation;

import j..util.DesugarTimeZone;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
public @interface n {
    public static enum com.fasterxml.jackson.annotation.n.a {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        READ_UNKNOWN_ENUM_VALUES_AS_NULL,
        READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE,
        READ_DATE_TIMESTAMPS_AS_NANOSECONDS,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE;

    }

    public static class b {
        private final int a;
        private final int b;
        private static final b c;

        static {
            b.c = new b(0, 0);
        }

        private b(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public static b a(n n0) {
            return b.b(n0.with(), n0.without());
        }

        public static b b(com.fasterxml.jackson.annotation.n.a[] arr_n$a, com.fasterxml.jackson.annotation.n.a[] arr_n$a1) {
            int v2 = 0;
            for(int v1 = 0; v1 < arr_n$a.length; ++v1) {
                v2 |= 1 << arr_n$a[v1].ordinal();
            }
            int v3 = 0;
            for(int v = 0; v < arr_n$a1.length; ++v) {
                v3 |= 1 << arr_n$a1[v].ordinal();
            }
            return new b(v2, v3);
        }

        public static b c() {
            return b.c;
        }

        public Boolean d(com.fasterxml.jackson.annotation.n.a n$a0) {
            int v = n$a0.ordinal();
            if((this.b & 1 << v) != 0) {
                return false;
            }
            return (1 << v & this.a) == 0 ? null : true;
        }

        public b e(com.fasterxml.jackson.annotation.n.a[] arr_n$a) {
            int v = this.a;
            for(int v1 = 0; v1 < arr_n$a.length; ++v1) {
                v |= 1 << arr_n$a[v1].ordinal();
            }
            return v == this.a ? this : new b(v, this.b);
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            return object0.getClass() == this.getClass() ? ((b)object0).a == this.a && ((b)object0).b == this.b : false;
        }

        public b f(b n$b0) {
            if(n$b0 == null) {
                return this;
            }
            int v = n$b0.b;
            int v1 = n$b0.a;
            if(v == 0 && v1 == 0) {
                return this;
            }
            int v2 = this.a;
            if(v2 == 0 && this.b == 0) {
                return n$b0;
            }
            int v3 = ~v & v2 | v1;
            int v4 = v | ~v1 & this.b;
            return v3 != v2 || v4 != this.b ? new b(v3, v4) : this;
        }

        public b g(com.fasterxml.jackson.annotation.n.a[] arr_n$a) {
            int v = this.b;
            for(int v1 = 0; v1 < arr_n$a.length; ++v1) {
                v |= 1 << arr_n$a[v1].ordinal();
            }
            return v == this.b ? this : new b(this.a, v);
        }

        @Override
        public int hashCode() {
            return this.b + this.a;
        }

        @Override
        public String toString() {
            return this == b.c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", this.a, this.b);
        }
    }

    public static enum c {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean a() [...] // 潜在的解密器

        public boolean b() {
            return this == c.e || this == c.d;
        }
    }

    public static class d implements com.fasterxml.jackson.annotation.b, Serializable {
        private final String a;
        private final c b;
        private final Locale c;
        private final String d;
        private final Boolean e;
        private final b f;
        private transient TimeZone g;
        private static final long h = 1L;
        private static final d i;

        static {
            d.i = new d();
        }

        public d() {
            this("", c.a, "", "", b.c(), null);
        }

        public d(n n0) {
            this(n0.pattern(), n0.shape(), n0.locale(), n0.timezone(), b.a(n0), n0.lenient().a());
        }

        @Deprecated
        public d(String s, c n$c0, String s1, String s2, b n$b0) {
            this(s, n$c0, s1, s2, n$b0, null);
        }

        public d(String s, c n$c0, String s1, String s2, b n$b0, Boolean boolean0) {
            this(s, n$c0, (s1 == null || s1.length() == 0 || "##default".equals(s1) ? null : new Locale(s1)), (s2 == null || s2.length() == 0 || "##default".equals(s2) ? null : s2), null, n$b0, boolean0);
        }

        @Deprecated
        public d(String s, c n$c0, Locale locale0, String s1, TimeZone timeZone0, b n$b0) {
            this(s, n$c0, locale0, s1, timeZone0, n$b0, null);
        }

        public d(String s, c n$c0, Locale locale0, String s1, TimeZone timeZone0, b n$b0, Boolean boolean0) {
            if(s == null) {
                s = "";
            }
            this.a = s;
            if(n$c0 == null) {
                n$c0 = c.a;
            }
            this.b = n$c0;
            this.c = locale0;
            this.g = timeZone0;
            this.d = s1;
            if(n$b0 == null) {
                n$b0 = b.c();
            }
            this.f = n$b0;
            this.e = boolean0;
        }

        @Deprecated
        public d(String s, c n$c0, Locale locale0, TimeZone timeZone0, b n$b0) {
            this(s, n$c0, locale0, timeZone0, n$b0, null);
        }

        public d(String s, c n$c0, Locale locale0, TimeZone timeZone0, b n$b0, Boolean boolean0) {
            if(s == null) {
                s = "";
            }
            this.a = s;
            if(n$c0 == null) {
                n$c0 = c.a;
            }
            this.b = n$c0;
            this.c = locale0;
            this.g = timeZone0;
            this.d = null;
            if(n$b0 == null) {
                n$b0 = b.c();
            }
            this.f = n$b0;
            this.e = boolean0;
        }

        public d A(Boolean boolean0) {
            return boolean0 == this.e ? this : new d(this.a, this.b, this.c, this.d, this.g, this.f, boolean0);
        }

        public d B(Locale locale0) {
            return new d(this.a, this.b, locale0, this.d, this.g, this.f, this.e);
        }

        public final d C(d n$d0) {
            if(n$d0 != null) {
                d n$d1 = d.i;
                if(n$d0 != n$d1 && n$d0 != this) {
                    if(this == n$d1) {
                        return n$d0;
                    }
                    String s = n$d0.a != null && !n$d0.a.isEmpty() ? n$d0.a : this.a;
                    c n$c0 = n$d0.b == c.a ? this.b : n$d0.b;
                    Locale locale0 = n$d0.c == null ? this.c : n$d0.c;
                    b n$b0 = this.f == null ? n$d0.f : this.f.f(n$d0.f);
                    Boolean boolean0 = n$d0.e == null ? this.e : n$d0.e;
                    return n$d0.d == null || n$d0.d.isEmpty() ? new d(s, n$c0, locale0, this.d, this.g, n$b0, boolean0) : new d(s, n$c0, locale0, n$d0.d, n$d0.g, n$b0, boolean0);
                }
            }
            return this;
        }

        public d D(String s) {
            return new d(s, this.b, this.c, this.d, this.g, this.f, this.e);
        }

        public d E(c n$c0) {
            return n$c0 == this.b ? this : new d(this.a, n$c0, this.c, this.d, this.g, this.f, this.e);
        }

        public d F(TimeZone timeZone0) {
            return new d(this.a, this.b, this.c, null, timeZone0, this.f, this.e);
        }

        public d G(com.fasterxml.jackson.annotation.n.a n$a0) {
            b n$b0 = this.f.g(new com.fasterxml.jackson.annotation.n.a[]{n$a0});
            return n$b0 == this.f ? this : new d(this.a, this.b, this.c, this.d, this.g, n$b0, this.e);
        }

        @Override  // com.fasterxml.jackson.annotation.b
        public Class a() {
            return n.class;
        }

        private static boolean b(Object object0, Object object1) {
            if(object0 == null) {
                return object1 == null;
            }
            return object1 == null ? false : object0.equals(object1);
        }

        public static final d c() {
            return d.i;
        }

        public static d d(boolean z) {
            return new d("", null, null, null, null, b.c(), Boolean.valueOf(z));
        }

        public static d e(String s) {
            return new d(s, null, null, null, null, b.c(), null);
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            return object0.getClass() == this.getClass() ? this.b == ((d)object0).b && this.f.equals(((d)object0).f) && (d.b(this.e, ((d)object0).e) && d.b(this.d, ((d)object0).d) && d.b(this.a, ((d)object0).a) && d.b(this.g, ((d)object0).g) && d.b(this.c, ((d)object0).c)) : false;
        }

        public static d f(c n$c0) {
            return new d("", n$c0, null, null, null, b.c(), null);
        }

        public static final d g(n n0) {
            return n0 == null ? d.i : new d(n0);
        }

        public Boolean h(com.fasterxml.jackson.annotation.n.a n$a0) {
            return this.f.d(n$a0);
        }

        @Override
        public int hashCode() {
            int v = this.d == null ? 1 : this.d.hashCode();
            String s = this.a;
            if(s != null) {
                v ^= s.hashCode();
            }
            int v1 = v + this.b.hashCode();
            Boolean boolean0 = this.e;
            if(boolean0 != null) {
                v1 ^= boolean0.hashCode();
            }
            Locale locale0 = this.c;
            if(locale0 != null) {
                v1 += locale0.hashCode();
            }
            return v1 ^ this.f.hashCode();
        }

        public b i() {
            return this.f;
        }

        public Boolean j() {
            return this.e;
        }

        public Locale k() {
            return this.c;
        }

        public String l() [...] // 潜在的解密器

        public c m() {
            return this.b;
        }

        public TimeZone n() {
            TimeZone timeZone0 = this.g;
            if(timeZone0 == null) {
                String s = this.d;
                if(s == null) {
                    return null;
                }
                timeZone0 = DesugarTimeZone.getTimeZone(s);
                this.g = timeZone0;
            }
            return timeZone0;
        }

        public boolean o() {
            return this.e != null;
        }

        public boolean p() {
            return this.c != null;
        }

        public boolean q() {
            return this.a != null && this.a.length() > 0;
        }

        public boolean r() {
            return this.b != c.a;
        }

        // 去混淆评级： 低(20)
        public boolean s() {
            return this.g != null || this.d != null && !this.d.isEmpty();
        }

        @Override
        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.a, this.b, this.e, this.c, this.d, this.f);
        }

        public boolean u() {
            return Boolean.TRUE.equals(this.e);
        }

        public static d w(d n$d0, d n$d1) {
            return n$d0 == null ? n$d1 : n$d0.C(n$d1);
        }

        public static d x(d[] arr_n$d) {
            d n$d0 = null;
            for(int v = 0; v < arr_n$d.length; ++v) {
                d n$d1 = arr_n$d[v];
                if(n$d1 != null) {
                    if(n$d0 != null) {
                        n$d1 = n$d0.C(n$d1);
                    }
                    n$d0 = n$d1;
                }
            }
            return n$d0;
        }

        public String y() {
            return this.g == null ? this.d : this.g.getID();
        }

        public d z(com.fasterxml.jackson.annotation.n.a n$a0) {
            b n$b0 = this.f.e(new com.fasterxml.jackson.annotation.n.a[]{n$a0});
            return n$b0 == this.f ? this : new d(this.a, this.b, this.c, this.d, this.g, n$b0, this.e);
        }
    }

    public static final String C0 = "##default";
    public static final String D0 = "##default";

    Q lenient() default Q.c;

    String locale() default "##default";

    String pattern() default "";

    c shape() default c.a;

    String timezone() default "##default";

    com.fasterxml.jackson.annotation.n.a[] with() default {};

    com.fasterxml.jackson.annotation.n.a[] without() default {};
}

