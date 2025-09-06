package com.coupang.ads.tools;

import android.content.Context;
import kotlin.D;
import kotlin.E;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;

public final class c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final D a;
    @l
    private final D b;
    @l
    private final D c;
    @l
    public static final a d = null;
    @l
    public static final String e = "AppInfo";

    static {
        c.d = new a(null);
    }

    public c() {
        static final class b extends N implements A3.a {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(0);
            }

            @l
            public final String b() {
                Object object0;
                try {
                    Context context0 = com.coupang.ads.a.o.b().m();
                    object0 = e0.b(((String)context0.getPackageManager().getApplicationLabel(context0.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0))));
                }
                catch(Throwable throwable0) {
                    object0 = e0.b(f0.a(throwable0));
                }
                String s = (String)com.coupang.ads.tools.l.a(object0, "AppInfo");
                return s == null ? "unknown" : s;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.coupang.ads.tools.c.c extends N implements A3.a {
            public static final com.coupang.ads.tools.c.c e;

            static {
                com.coupang.ads.tools.c.c.e = new com.coupang.ads.tools.c.c();
            }

            com.coupang.ads.tools.c.c() {
                super(0);
            }

            public final String b() {
                return "com.dcinside.app.android";
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
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

            @l
            public final String b() {
                Object object0;
                try {
                    object0 = e0.b(com.coupang.ads.a.o.b().m().getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionName);
                }
                catch(Throwable throwable0) {
                    object0 = e0.b(f0.a(throwable0));
                }
                String s = (String)com.coupang.ads.tools.l.a(object0, "AppInfo");
                return s == null ? "unknown" : s;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        this.a = E.a(b.e);
        this.b = E.a(com.coupang.ads.tools.c.c.e);
        this.c = E.a(d.e);
    }

    @l
    public final String a() {
        return (String)this.a.getValue();
    }

    public final String b() {
        return (String)this.b.getValue();
    }

    @l
    public final String c() {
        return (String)this.c.getValue();
    }
}

