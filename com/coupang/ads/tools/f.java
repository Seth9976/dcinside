package com.coupang.ads.tools;

import P.d;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import com.coupang.ads.R.bool;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.N;
import y4.l;

public final class f {
    private final String a;
    private final String b;
    private final String c;
    @l
    private final String d;
    private final String e;
    @l
    private final D f;
    @l
    private final D g;
    @l
    private final D h;
    @l
    private final D i;

    public f() {
        static final class a extends N implements A3.a {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(0);
            }

            @l
            public final Float b() {
                return com.coupang.ads.a.o.b().m().getResources().getDisplayMetrics().density;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
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

            @l
            public final Point b() {
                Context context0 = com.coupang.ads.a.o.b().m();
                return d.d(d.a, context0, false, 2, null);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements A3.a {
            final f e;

            c(f f0) {
                this.e = f0;
                super(0);
            }

            @l
            public final String b() {
                return this.e.d().x + 'x' + this.e.d().y;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.coupang.ads.tools.f.d extends N implements A3.a {
            public static final com.coupang.ads.tools.f.d e;

            static {
                com.coupang.ads.tools.f.d.e = new com.coupang.ads.tools.f.d();
            }

            com.coupang.ads.tools.f.d() {
                super(0);
            }

            @l
            public final String b() {
                Context context0 = com.coupang.ads.a.o.b().m();
                Object object0 = context0.getSystemService("uimode");
                if(object0 != null) {
                    switch(((UiModeManager)object0).getCurrentModeType()) {
                        case 2: {
                            return "desk";
                        }
                        case 4: {
                            return "tv";
                        }
                        case 5: {
                            return "appliance";
                        }
                        case 6: {
                            return "watch";
                        }
                        case 7: {
                            return "vr";
                        }
                        default: {
                            return context0.getResources().getBoolean(bool.tablet) ? "tablet" : "mobile phone";
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.UiModeManager");
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        this.a = d.a.e();
        this.b = d.a.a();
        this.c = d.a.b();
        this.d = "Android";
        this.e = d.a.f();
        this.f = E.a(com.coupang.ads.tools.f.d.e);
        this.g = E.a(new c(this));
        this.h = E.a(b.e);
        this.i = E.a(a.e);
    }

    public final float a() {
        return ((Number)this.i.getValue()).floatValue();
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    @l
    public final Point d() {
        return (Point)this.h.getValue();
    }

    @l
    public final String e() {
        return (String)this.g.getValue();
    }

    @l
    public final String f() {
        return (String)this.f.getValue();
    }

    public final String g() {
        return this.a;
    }

    @l
    public final String h() [...] // 潜在的解密器

    public final String i() {
        return this.e;
    }
}

