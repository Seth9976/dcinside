package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Build.VERSION;
import android.os.Looper;
import com.google.firebase.crashlytics.internal.g;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import z3.n;

public final class l {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        // 去混淆评级： 低(20)
        public static final String a(a l$a0) [...] // 潜在的解密器

        @n
        public final void e() {
            final class com.google.firebase.crashlytics.internal.concurrency.l.a.a extends H implements A3.a {
                com.google.firebase.crashlytics.internal.concurrency.l.a.a(Object object0) {
                    super(0, object0, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
                }

                @y4.l
                public final Boolean e() {
                    return Boolean.valueOf(((a)this.receiver).l());
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.e();
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

                // 去混淆评级： 低(40)
                @y4.l
                public final String b() [...] // 潜在的解密器

                // 去混淆评级： 低(20)
                @Override  // A3.a
                public Object invoke() {
                    return "Must be called on a background thread, was called on jeb-dexdec-sb-st-10208.";
                }
            }

            this.h(new com.google.firebase.crashlytics.internal.concurrency.l.a.a(this), b.e);
        }

        @n
        public final void f() {
            final class c extends H implements A3.a {
                c(Object object0) {
                    super(0, object0, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
                }

                @y4.l
                public final Boolean e() {
                    return Boolean.valueOf(((a)this.receiver).m());
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.e();
                }
            }


            static final class d extends N implements A3.a {
                public static final d e;

                static {
                    d.e = new d();
                }

                d() {
                    super(0);
                }

                // 去混淆评级： 低(40)
                @y4.l
                public final String b() [...] // 潜在的解密器

                // 去混淆评级： 低(20)
                @Override  // A3.a
                public Object invoke() {
                    return "Must be called on a blocking thread, was called on jeb-dexdec-sb-st-10247.";
                }
            }

            this.h(new c(this), d.e);
        }

        @n
        public final void g() {
            final class e extends H implements A3.a {
                e(Object object0) {
                    super(0, object0, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
                }

                @y4.l
                public final Boolean e() {
                    return Boolean.valueOf(((a)this.receiver).n());
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.e();
                }
            }


            static final class f extends N implements A3.a {
                public static final f e;

                static {
                    f.e = new f();
                }

                f() {
                    super(0);
                }

                // 去混淆评级： 低(40)
                @y4.l
                public final String b() [...] // 潜在的解密器

                // 去混淆评级： 低(20)
                @Override  // A3.a
                public Object invoke() {
                    return "Must not be called on a main thread, was called on jeb-dexdec-sb-st-10210.";
                }
            }

            this.h(new e(this), f.e);
        }

        private final void h(A3.a a0, A3.a a1) {
            if(!((Boolean)a0.invoke()).booleanValue()) {
                g.f().b(((String)a1.invoke()));
            }
        }

        // 去混淆评级： 低(20)
        public final boolean i() [...] // 潜在的解密器

        @n
        public static void j() {
        }

        // 去混淆评级： 低(20)
        private final String k() [...] // 潜在的解密器

        // 去混淆评级： 低(30)
        private final boolean l() {
            L.o("jeb-dexdec-sb-st-10244", "threadName");
            return v.W2("jeb-dexdec-sb-st-10244", "Firebase Background Thread #", false, 2, null);
        }

        // 去混淆评级： 低(30)
        private final boolean m() {
            L.o("jeb-dexdec-sb-st-10196", "threadName");
            return v.W2("jeb-dexdec-sb-st-10196", "Firebase Blocking Thread #", false, 2, null);
        }

        // 去混淆评级： 低(20)
        private final boolean n() {
            return Build.VERSION.SDK_INT < 23 ? !L.g(Looper.getMainLooper(), Looper.myLooper()) : !Looper.getMainLooper().isCurrentThread();
        }

        public final void o(boolean z) {
            l.f = z;
        }
    }

    @y4.l
    @z3.f
    public final j a;
    @y4.l
    @z3.f
    public final j b;
    @y4.l
    @z3.f
    public final j c;
    @y4.l
    @z3.f
    public final j d;
    @y4.l
    public static final a e;
    private static boolean f;

    static {
        l.e = new a(null);
    }

    public l(@y4.l ExecutorService executorService0, @y4.l ExecutorService executorService1) {
        L.p(executorService0, "backgroundExecutorService");
        L.p(executorService1, "blockingExecutorService");
        super();
        this.a = new j(executorService0);
        this.b = new j(executorService0);
        this.c = new j(executorService0);
        this.d = new j(executorService1);
    }

    public static final boolean a() [...] // 潜在的解密器

    @n
    public static final void c() {
        l.e.e();
    }

    @n
    public static final void d() {
        l.e.f();
    }

    @n
    public static final void e() {
        l.e.g();
    }

    // 去混淆评级： 低(20)
    public static final boolean f() {
        return false;
    }

    public static final void g(boolean z) {
        l.e.o(z);
    }
}

