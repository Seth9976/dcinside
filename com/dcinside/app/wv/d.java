package com.dcinside.app.wv;

import android.content.Context;
import android.graphics.Typeface;
import com.dcinside.app.Application;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nContentIntercept.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentIntercept.kt\ncom/dcinside/app/wv/ContentIntercept\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n177#2,9:57\n1#3:66\n*S KotlinDebug\n*F\n+ 1 ContentIntercept.kt\ncom/dcinside/app/wv/ContentIntercept\n*L\n45#1:57,9\n*E\n"})
public final class d {
    static enum a {
        FALLBACK("DroidSansFallback.ttf"),
        DEFAULT("DroidSans.ttf");

        @l
        private final String a;
        private static final a[] d;
        private static final kotlin.enums.a e;

        static {
            a.d = arr_d$a;
            L.p(arr_d$a, "entries");
            a.e = new kotlin.enums.d(arr_d$a);
        }

        private a(String s1) {
            this.a = s1;
        }

        private static final a[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return a.e;
        }

        @l
        public final String c() {
            return this.a;
        }
    }

    static final class b extends N implements A3.a {
        public static final b e;

        static {
            b.e = new b();
        }

        b() {
            super(0);
        }

        @m
        public final Method b() {
            Method method0 = b.c(Typeface.class, "getFontPathFlipFont");
            return method0 == null ? b.c(Typeface.class, "semGetFontPathOfCurrentFontStyle") : method0;
        }

        private static final Method c(Class class0, String s) {
            try {
                return class0.getDeclaredMethod(s, Context.class, Integer.TYPE);
            }
            catch(Exception unused_ex) {
                return null;
            }
        }

        @Override  // A3.a
        public Object invoke() {
            return this.b();
        }
    }

    @l
    public static final d a;
    @l
    private static final D b;

    static {
        d.a = new d();
        d.b = E.a(b.e);
    }

    private static final File a(String s, String s1) {
        File file0 = new File(s, s1);
        return file0.exists() ? file0 : null;
    }

    private static final String b() {
        Context context0 = Application.e.c();
        Method method0 = d.a.c();
        if(method0 != null) {
            Object object0 = method0.invoke(null, context0, 1);
            if(object0 != null) {
                String s = object0.toString();
                return s == null || L.g(s, "default") ? null : s;
            }
        }
        return null;
    }

    private final Method c() {
        return (Method)d.b.getValue();
    }

    @m
    public final InputStream d() {
        File file0 = this.e();
        return file0 != null ? new FileInputStream(file0) : null;
    }

    private final File e() {
        String s = null;
        try {
            s = d.b();
        }
        catch(Exception unused_ex) {
        }
        if(s == null) {
            return null;
        }
        a[] arr_d$a = a.values();
        for(int v = 0; v < arr_d$a.length; ++v) {
            File file0 = d.a(s, arr_d$a[v].c());
            if(file0 != null) {
                return file0;
            }
        }
        return null;
    }
}

