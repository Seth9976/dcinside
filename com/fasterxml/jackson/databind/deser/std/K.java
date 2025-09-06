package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.cfg.c;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.G;
import com.fasterxml.jackson.databind.util.h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;

public class k {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            a.a = arr_v;
            try {
                arr_v[c.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    @b
    public static class com.fasterxml.jackson.databind.deser.std.k.b extends com.fasterxml.jackson.databind.deser.std.k.c {
        protected final Constructor i;

        public com.fasterxml.jackson.databind.deser.std.k.b() {
            super(Calendar.class);
            this.i = null;
        }

        public com.fasterxml.jackson.databind.deser.std.k.b(com.fasterxml.jackson.databind.deser.std.k.b k$b0, DateFormat dateFormat0, String s) {
            super(k$b0, dateFormat0, s);
            this.i = k$b0.i;
        }

        public com.fasterxml.jackson.databind.deser.std.k.b(Class class0) {
            super(class0);
            this.i = h.s(class0, false);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        public n a(com.fasterxml.jackson.databind.h h0, d d0) throws o {
            return super.a(h0, d0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException, f {
            return this.s1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object o(com.fasterxml.jackson.databind.h h0) {
            GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
            gregorianCalendar0.setTimeInMillis(0L);
            return gregorianCalendar0;
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        protected com.fasterxml.jackson.databind.deser.std.k.c r1(DateFormat dateFormat0, String s) {
            return this.t1(dateFormat0, s);
        }

        public Calendar s1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
            Date date0 = this.x0(n0, h0);
            if(date0 == null) {
                return null;
            }
            Constructor constructor0 = this.i;
            if(constructor0 == null) {
                return h0.Q(date0);
            }
            try {
                Calendar calendar0 = (Calendar)constructor0.newInstance(null);
                calendar0.setTimeInMillis(date0.getTime());
                TimeZone timeZone0 = h0.w();
                if(timeZone0 != null) {
                    calendar0.setTimeZone(timeZone0);
                    return calendar0;
                }
                return calendar0;
            }
            catch(Exception exception0) {
                return (Calendar)h0.o0(this.s(), date0, exception0);
            }
        }

        protected com.fasterxml.jackson.databind.deser.std.k.b t1(DateFormat dateFormat0, String s) {
            return new com.fasterxml.jackson.databind.deser.std.k.b(this, dateFormat0, s);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        public com.fasterxml.jackson.databind.type.h w() {
            return super.w();
        }
    }

    public static abstract class com.fasterxml.jackson.databind.deser.std.k.c extends I implements j {
        protected final DateFormat g;
        protected final String h;

        protected com.fasterxml.jackson.databind.deser.std.k.c(com.fasterxml.jackson.databind.deser.std.k.c k$c0, DateFormat dateFormat0, String s) {
            super(k$c0.a);
            this.g = dateFormat0;
            this.h = s;
        }

        protected com.fasterxml.jackson.databind.deser.std.k.c(Class class0) {
            super(class0);
            this.g = null;
            this.h = null;
        }

        @Override  // com.fasterxml.jackson.databind.deser.j
        public n a(com.fasterxml.jackson.databind.h h0, d d0) throws o {
            DateFormat dateFormat3;
            DateFormat dateFormat1;
            com.fasterxml.jackson.annotation.n.d n$d0 = this.h1(h0, d0, this.s());
            if(n$d0 != null) {
                TimeZone timeZone0 = n$d0.n();
                Boolean boolean0 = n$d0.j();
                if(n$d0.q()) {
                    SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("", (n$d0.p() ? n$d0.k() : h0.u()));
                    if(timeZone0 == null) {
                        timeZone0 = h0.w();
                    }
                    simpleDateFormat0.setTimeZone(timeZone0);
                    if(boolean0 != null) {
                        simpleDateFormat0.setLenient(boolean0.booleanValue());
                    }
                    return this.r1(simpleDateFormat0, "");
                }
                Class class0 = G.class;
                if(timeZone0 != null) {
                    DateFormat dateFormat0 = h0.g0().w();
                    if(dateFormat0.getClass() == class0) {
                        Locale locale0 = n$d0.p() ? n$d0.k() : h0.u();
                        dateFormat1 = ((G)dateFormat0).D(timeZone0).C(locale0);
                        return boolean0 == null ? this.r1(dateFormat1, this.h) : this.r1(((G)dateFormat1).B(boolean0), this.h);
                    }
                    dateFormat1 = (DateFormat)dateFormat0.clone();
                    dateFormat1.setTimeZone(timeZone0);
                    if(boolean0 != null) {
                        dateFormat1.setLenient(boolean0.booleanValue());
                    }
                    return this.r1(dateFormat1, this.h);
                }
                if(boolean0 != null) {
                    DateFormat dateFormat2 = h0.g0().w();
                    String s = this.h;
                    if(dateFormat2.getClass() == class0) {
                        dateFormat3 = ((G)dateFormat2).B(boolean0);
                        s = "[one of: \'yyyy-MM-dd\'T\'HH:mm:ss.SSSX\', \'EEE, dd MMM yyyy HH:mm:ss zzz\' (lenient)]";
                    }
                    else {
                        dateFormat3 = (DateFormat)dateFormat2.clone();
                        dateFormat3.setLenient(boolean0.booleanValue());
                        if(dateFormat3 instanceof SimpleDateFormat) {
                            ((SimpleDateFormat)dateFormat3).toPattern();
                        }
                    }
                    if(s == null) {
                        s = "[unknown]";
                    }
                    return this.r1(dateFormat3, s);
                }
            }
            return this;
        }

        protected abstract com.fasterxml.jackson.databind.deser.std.k.c r1(DateFormat arg1, String arg2);

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public com.fasterxml.jackson.databind.type.h w() {
            return com.fasterxml.jackson.databind.type.h.l;
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.D
        protected Date x0(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
            if(this.g != null && n0.Y3(r.q)) {
                String s = n0.R2().trim();
                if(s.isEmpty()) {
                    return a.a[this.H(h0, s).ordinal()] == 1 ? new Date(0L) : null;
                }
                synchronized(this.g) {
                    try {
                        return this.g.parse(s);
                    }
                    catch(ParseException unused_ex) {
                        return (Date)h0.C0(this.s(), s, "expected format \"%s\"", new Object[]{this.h});
                    }
                }
            }
            return super.x0(n0, h0);
        }
    }

    @b
    public static class com.fasterxml.jackson.databind.deser.std.k.d extends com.fasterxml.jackson.databind.deser.std.k.c {
        public static final com.fasterxml.jackson.databind.deser.std.k.d i;

        static {
            com.fasterxml.jackson.databind.deser.std.k.d.i = new com.fasterxml.jackson.databind.deser.std.k.d();
        }

        public com.fasterxml.jackson.databind.deser.std.k.d() {
            super(Date.class);
        }

        public com.fasterxml.jackson.databind.deser.std.k.d(com.fasterxml.jackson.databind.deser.std.k.d k$d0, DateFormat dateFormat0, String s) {
            super(k$d0, dateFormat0, s);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        public n a(com.fasterxml.jackson.databind.h h0, d d0) throws o {
            return super.a(h0, d0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException, f {
            return this.s1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object o(com.fasterxml.jackson.databind.h h0) {
            return new Date(0L);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        protected com.fasterxml.jackson.databind.deser.std.k.c r1(DateFormat dateFormat0, String s) {
            return this.t1(dateFormat0, s);
        }

        public Date s1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
            return this.x0(n0, h0);
        }

        protected com.fasterxml.jackson.databind.deser.std.k.d t1(DateFormat dateFormat0, String s) {
            return new com.fasterxml.jackson.databind.deser.std.k.d(this, dateFormat0, s);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        public com.fasterxml.jackson.databind.type.h w() {
            return super.w();
        }
    }

    public static class e extends com.fasterxml.jackson.databind.deser.std.k.c {
        public e() {
            super(java.sql.Date.class);
        }

        public e(e k$e0, DateFormat dateFormat0, String s) {
            super(k$e0, dateFormat0, s);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        public n a(com.fasterxml.jackson.databind.h h0, d d0) throws o {
            return super.a(h0, d0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException, f {
            return this.s1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object o(com.fasterxml.jackson.databind.h h0) {
            return new java.sql.Date(0L);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        protected com.fasterxml.jackson.databind.deser.std.k.c r1(DateFormat dateFormat0, String s) {
            return this.t1(dateFormat0, s);
        }

        public java.sql.Date s1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
            Date date0 = this.x0(n0, h0);
            return date0 == null ? null : new java.sql.Date(date0.getTime());
        }

        protected e t1(DateFormat dateFormat0, String s) {
            return new e(this, dateFormat0, s);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        public com.fasterxml.jackson.databind.type.h w() {
            return super.w();
        }
    }

    public static class com.fasterxml.jackson.databind.deser.std.k.f extends com.fasterxml.jackson.databind.deser.std.k.c {
        public com.fasterxml.jackson.databind.deser.std.k.f() {
            super(Timestamp.class);
        }

        public com.fasterxml.jackson.databind.deser.std.k.f(com.fasterxml.jackson.databind.deser.std.k.f k$f0, DateFormat dateFormat0, String s) {
            super(k$f0, dateFormat0, s);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        public n a(com.fasterxml.jackson.databind.h h0, d d0) throws o {
            return super.a(h0, d0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException, f {
            return this.s1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object o(com.fasterxml.jackson.databind.h h0) {
            return new Timestamp(0L);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        protected com.fasterxml.jackson.databind.deser.std.k.c r1(DateFormat dateFormat0, String s) {
            return this.t1(dateFormat0, s);
        }

        public Timestamp s1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
            Date date0 = this.x0(n0, h0);
            return date0 == null ? null : new Timestamp(date0.getTime());
        }

        protected com.fasterxml.jackson.databind.deser.std.k.f t1(DateFormat dateFormat0, String s) {
            return new com.fasterxml.jackson.databind.deser.std.k.f(this, dateFormat0, s);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.k$c
        public com.fasterxml.jackson.databind.type.h w() {
            return super.w();
        }
    }

    private static final HashSet a;

    static {
        HashSet hashSet0 = new HashSet();
        k.a = hashSet0;
        hashSet0.add("java.util.Calendar");
        hashSet0.add("java.util.GregorianCalendar");
        hashSet0.add("java.util.Date");
    }

    public static n a(Class class0, String s) {
        if(k.a.contains(s)) {
            if(class0 == Calendar.class) {
                return new com.fasterxml.jackson.databind.deser.std.k.b();
            }
            if(class0 == Date.class) {
                return com.fasterxml.jackson.databind.deser.std.k.d.i;
            }
            Class class1 = GregorianCalendar.class;
            if(class0 == class1) {
                return new com.fasterxml.jackson.databind.deser.std.k.b(class1);
            }
        }
        return null;
    }

    public static boolean b(Class class0) {
        return k.a.contains(class0.getName());
    }
}

