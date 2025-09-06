package com.dcinside.app.voice;

import android.net.Uri;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Mk;
import com.dcinside.app.util.Yk;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class a {
    static final class com.dcinside.app.voice.a.a extends N implements Function1 {
        public static final com.dcinside.app.voice.a.a e;

        static {
            com.dcinside.app.voice.a.a.e = new com.dcinside.app.voice.a.a();
        }

        com.dcinside.app.voice.a.a() {
            super(1);
        }

        @l
        public final Boolean b(@l String s) {
            L.p(s, "url");
            if(Yk.a.t().matcher(s).find()) {
                String s1 = Uri.parse(s).getQueryParameter("no");
                return s1 == null || s1.length() <= 0 ? false : true;
            }
            return false;
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.b(((String)object0));
        }
    }

    static final class b extends N implements Function1 {
        public static final b e;

        static {
            b.e = new b();
        }

        b() {
            super(1);
        }

        @l
        public final Boolean b(@l String s) {
            L.p(s, "url");
            if(Yk.a.u().matcher(s).find()) {
                String s1 = Uri.parse(s).getQueryParameter("no");
                return s1 == null || s1.length() <= 0 ? false : true;
            }
            return false;
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.b(((String)object0));
        }
    }

    static final class c extends N implements Function1 {
        public static final c e;

        static {
            c.e = new c();
        }

        c() {
            super(1);
        }

        @l
        public final Boolean b(@l String s) {
            L.p(s, "url");
            if(Yk.a.v().matcher(s).find()) {
                String s1 = Uri.parse(s).getQueryParameter("vr");
                return s1 == null || s1.length() <= 0 ? false : true;
            }
            return false;
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.b(((String)object0));
        }
    }

    static final class d extends N implements Function1 {
        public static final d e;

        static {
            d.e = new d();
        }

        d() {
            super(1);
        }

        @l
        public final Boolean b(@l String s) {
            L.p(s, "url");
            return Boolean.valueOf(Yk.a.w().matcher(s).find());
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.b(((String)object0));
        }
    }

    public static final class e {
        private e() {
        }

        public e(w w0) {
        }

        @m
        @n
        public final a a(@m String s, @l Function1 function10, boolean z) {
            L.p(function10, "uriChecker");
            if(s != null && s.length() != 0) {
                Matcher matcher0 = (z ? Yk.a.o() : Yk.a.n()).matcher(s);
                if(matcher0.find()) {
                    String s1 = matcher0.group(0);
                    if(s1 != null && s1.length() != 0) {
                        String s2 = matcher0.group(1);
                        if(s2 == null || s2.length() == 0 || !((Boolean)function10.invoke(s2)).booleanValue()) {
                            return null;
                        }
                        StringBuffer stringBuffer0 = new StringBuffer();
                        matcher0.appendReplacement(stringBuffer0, "");
                        String s3 = stringBuffer0.toString();
                        L.o(s3, "toString(...)");
                        stringBuffer0.setLength(0);
                        matcher0.appendTail(stringBuffer0);
                        String s4 = stringBuffer0.toString();
                        L.o(s4, "toString(...)");
                        return new a(s3, s4, s1, null);
                    }
                }
            }
            return null;
        }

        public static a b(e a$e0, String s, Function1 function10, boolean z, int v, Object object0) {
            if((v & 4) != 0) {
                z = false;
            }
            return a$e0.a(s, function10, z);
        }

        @l
        public final String c() {
            String s = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(System.currentTimeMillis());
            String s1 = B.E.m0();
            if(s1 == null) {
                s1 = Mk.b();
            }
            String s2 = String.format("%s_Vc_%s.m4a", Arrays.copyOf(new Object[]{s, s1}, 2));
            L.o(s2, "format(...)");
            return s2;
        }
    }

    @m
    private final String a;
    @m
    private final String b;
    @m
    private final String c;
    @l
    public static final e d;
    @l
    @f
    public static final Function1 e;
    @l
    @f
    public static final Function1 f;
    @l
    @f
    public static final Function1 g;
    @l
    @f
    public static final Function1 h;

    static {
        a.d = new e(null);
        a.e = c.e;
        a.f = com.dcinside.app.voice.a.a.e;
        a.g = b.e;
        a.h = d.e;
    }

    private a(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    public a(String s, String s1, String s2, w w0) {
        this(s, s1, s2);
    }

    @m
    @n
    public static final a a(@m String s, @l Function1 function10, boolean z) {
        return a.d.a(s, function10, z);
    }

    @m
    public final String b() {
        return this.c;
    }

    @m
    public final String c() {
        return this.a;
    }

    @m
    public final String d() {
        return this.b;
    }
}

