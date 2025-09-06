package com.kakao.adfit.m;

import android.content.Context;
import android.util.Log;
import com.kakao.adfit.common.matrix.MatrixLevel;
import kotlin.jvm.internal.L;

public final class f {
    static final class a implements c {
        @Override  // com.kakao.adfit.m.f$c
        public void a(int v, String s, String s1) {
            L.p(s, "tag");
            L.p(s1, "message");
            switch(v) {
                case 2: {
                    Log.v(s, s1);
                    return;
                }
                case 3: {
                    Log.d(s, s1);
                    return;
                }
                case 4: {
                    Log.i(s, s1);
                    return;
                }
                case 5: {
                    Log.w(s, s1);
                    return;
                }
                case 6: {
                    Log.e(s, s1);
                }
            }
        }

        @Override  // com.kakao.adfit.m.f$c
        public void a(int v, String s, String s1, Throwable throwable0) {
            L.p(s, "tag");
            L.p(s1, "message");
            switch(v) {
                case 2: {
                    Log.v(s, s1, throwable0);
                    return;
                }
                case 3: {
                    Log.d(s, s1, throwable0);
                    return;
                }
                case 4: {
                    Log.i(s, s1, throwable0);
                    return;
                }
                case 5: {
                    Log.w(s, s1, throwable0);
                    return;
                }
                case 6: {
                    Log.e(s, s1, throwable0);
                }
            }
        }
    }

    static final class b implements c {
        @Override  // com.kakao.adfit.m.f$c
        public void a(int v, String s, String s1) {
            L.p(s, "tag");
            L.p(s1, "message");
            switch(v) {
                case 4: {
                    Log.i(s, s1);
                    return;
                }
                case 5: {
                    Log.w(s, s1);
                    return;
                }
                case 6: {
                    Log.e(s, s1);
                }
            }
        }

        @Override  // com.kakao.adfit.m.f$c
        public void a(int v, String s, String s1, Throwable throwable0) {
            L.p(s, "tag");
            L.p(s1, "message");
            switch(v) {
                case 4: {
                    Log.i(s, s1, throwable0);
                    return;
                }
                case 5: {
                    Log.w(s, s1, throwable0);
                    return;
                }
                case 6: {
                    Log.e(s, s1, throwable0);
                }
            }
        }
    }

    interface c {
        void a(int arg1, String arg2, String arg3);

        void a(int arg1, String arg2, String arg3, Throwable arg4);
    }

    static final class d implements e {
        private final MatrixLevel a(int v) {
            switch(v) {
                case 2: {
                    return MatrixLevel.LOG;
                }
                case 3: {
                    return MatrixLevel.DEBUG;
                }
                case 4: {
                    return MatrixLevel.INFO;
                }
                case 5: {
                    return MatrixLevel.WARNING;
                }
                case 6: {
                    return MatrixLevel.ERROR;
                }
                default: {
                    return null;
                }
            }
        }

        @Override  // com.kakao.adfit.m.f$e
        public void a(int v, String s, String s1) {
            L.p(s, "tag");
            MatrixLevel matrixLevel0 = this.a(v);
            com.kakao.adfit.i.b b0 = com.kakao.adfit.i.b.a.a(com.kakao.adfit.i.b.g, s1, null, matrixLevel0, 2, null);
            com.kakao.adfit.common.matrix.c.a.a(b0);
        }

        @Override  // com.kakao.adfit.m.f$e
        public void a(int v, String s, String s1, Throwable throwable0) {
            L.p(s, "tag");
            MatrixLevel matrixLevel0 = this.a(v);
            com.kakao.adfit.i.b b0 = com.kakao.adfit.i.b.a.a(com.kakao.adfit.i.b.g, s1 + '\n' + throwable0, null, matrixLevel0, 2, null);
            com.kakao.adfit.common.matrix.c.a.a(b0);
        }
    }

    interface e {
        void a(int arg1, String arg2, String arg3);

        void a(int arg1, String arg2, String arg3, Throwable arg4);
    }

    public static final f a;
    private static final e b;
    private static boolean c;
    private static c d;
    private static boolean e;

    static {
        f.a = new f();
        f.b = new d();
        f.d = new b();
        f.e = false;
    }

    private final void a(int v, String s) {
        f.b.a(v, "AdFit3.17.2", s);
        f.d.a(v, "AdFit3.17.2", s);
    }

    private final void a(int v, String s, Throwable throwable0) {
        f.b.a(v, "AdFit3.17.2", s, throwable0);
        f.d.a(v, "AdFit3.17.2", s, throwable0);
    }

    public static final void a(String s) {
        L.p(s, "message");
        f.a.a(3, s);
    }

    public static final void a(String s, Throwable throwable0) {
        L.p(s, "message");
        f.a.a(3, s, throwable0);
    }

    private final boolean a(Context context0) {
        return x.c(context0, "com.kakao.adfit.libraryqa") == 0xEC9A1727;
    }

    public final boolean a() [...] // 潜在的解密器

    public static final void b(String s) {
        L.p(s, "message");
        f.a.a(6, s);
    }

    public static final void b(String s, Throwable throwable0) {
        L.p(s, "message");
        f.a.a(6, s, throwable0);
    }

    public final void b(Context context0) {
        L.p(context0, "context");
        if(!f.c) {
            if(this.a(context0) && !(f.d instanceof a)) {
                f.d = new a();
                f.e = true;
            }
            f.c = true;
        }
    }

    public static final void c(String s) {
        L.p(s, "message");
        f.a.a(4, s);
    }

    public static final void c(String s, Throwable throwable0) {
        L.p(s, "message");
        f.a.a(5, s, throwable0);
    }

    public static final void d(String s) {
        L.p(s, "message");
        f.a.a(2, s);
    }

    public static final void e(String s) {
        L.p(s, "message");
        f.a.a(5, s);
    }
}

