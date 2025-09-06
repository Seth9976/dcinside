package com.kakao.adfit.l;

import A3.o;
import android.content.Context;
import android.view.Surface;

public interface b {
    public static abstract class a {
        public static boolean a(b b0) {
            return b0.d() == d.e;
        }

        public static boolean b(b b0) {
            switch(b0.d()) {
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    public static enum com.kakao.adfit.l.b.b {
        CONNECTION_ERROR,
        TIMEOUT_ERROR,
        UNKNOWN_INPUT_FORMAT_ERROR,
        UNKNOWN_ERROR;

        private static final com.kakao.adfit.l.b.b[] a() [...] // Inlined contents
    }

    public interface c {
        b a(Context arg1, String arg2);
    }

    public static enum d {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED,
        STARTED,
        PAUSED,
        COMPLETED,
        STOPPED,
        RELEASED,
        ERROR;

        private static final d[] a() [...] // Inlined contents
    }

    public abstract class e {
        public static final int[] a;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[d.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            e.a = arr_v;
        }
    }

    int a();

    void a(float arg1);

    void a(int arg1);

    void a(o arg1);

    void a(Surface arg1);

    void b();

    void b(o arg1);

    int c();

    void c(o arg1);

    d d();

    void e();

    Surface f();

    boolean g();

    void h();

    boolean i();

    void j();

    int k();

    boolean l();

    boolean m();
}

