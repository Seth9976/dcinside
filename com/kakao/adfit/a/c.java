package com.kakao.adfit.a;

import android.content.Context;
import com.kakao.adfit.m.D;
import com.kakao.adfit.m.m;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;

public final class c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public static void a(a c$a0, b c$b0, Context context0, e e0, int v, Object object0) {
            if((v & 2) != 0) {
                e0 = null;
            }
            c$a0.a(c$b0, context0, e0);
        }

        public final void a(b c$b0, Context context0, e e0) {
            static final class com.kakao.adfit.a.c.a.a extends N implements Function1 {
                final b a;
                final Context b;
                final e c;

                com.kakao.adfit.a.c.a.a(b c$b0, Context context0, e e0) {
                    this.a = c$b0;
                    this.b = context0;
                    this.c = e0;
                    super(1);
                }

                public final void a(com.kakao.adfit.a.d.c d$c0) {
                    List list0 = this.a.d();
                    if(list0.isEmpty()) {
                        list0 = null;
                    }
                    if(list0 != null) {
                        b c$b0 = this.a;
                        Context context0 = this.b;
                        e e0 = this.c;
                        if(c$b0 instanceof com.kakao.adfit.a.c.c) {
                            c$b0.a(u.H());
                        }
                        h.c.a(context0).a(list0, d$c0, e0);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((com.kakao.adfit.a.d.c)object0));
                    return S0.a;
                }
            }

            L.p(c$b0, "<this>");
            L.p(context0, "context");
            if(!c$b0.e() && !c$b0.d().isEmpty()) {
                c$b0.b(new com.kakao.adfit.a.c.a.a(c$b0, context0, e0));
            }
        }
    }

    public static class b {
        private List a;
        private long b;
        private CopyOnWriteArrayList c;

        public b() {
            this.a = u.H();
            this.c = new CopyOnWriteArrayList();
        }

        private final boolean a(Function1 function10) {
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.c;
            if(copyOnWriteArrayList0 == null) {
                return false;
            }
            copyOnWriteArrayList0.add(function10);
            return true;
        }

        public void a() {
            this.c = null;
        }

        public final void a(A3.a a0) {
            L.p(a0, "provider");
            this.a(new com.kakao.adfit.a.d.c(a0));
        }

        public void a(com.kakao.adfit.a.d.c d$c0) {
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.c;
            if(copyOnWriteArrayList0 == null) {
                return;
            }
            this.b = D.a.b().a();
            for(Object object0: copyOnWriteArrayList0) {
                ((Function1)object0).invoke(d$c0);
            }
        }

        public final void a(List list0) {
            L.p(list0, "value");
            if(!list0.isEmpty() && this.e()) {
                return;
            }
            this.a = list0;
        }

        public final long b() {
            return this.b;
        }

        public final m b(Function1 function10) {
            public static final class com.kakao.adfit.a.c.b.a implements m {
                private boolean b;
                final kotlin.jvm.internal.l0.h c;
                final Function1 d;

                public com.kakao.adfit.a.c.b.a(kotlin.jvm.internal.l0.h l0$h0, Function1 function10) {
                    this.c = l0$h0;
                    this.d = function10;
                    super();
                }

                public boolean a() {
                    return this.b;
                }

                @Override  // com.kakao.adfit.m.m
                public void dispose() {
                    if(this.a()) {
                        return;
                    }
                    this.b = true;
                    b c$b0 = (b)this.c.a;
                    if(c$b0 != null) {
                        c$b0.c(this.d);
                    }
                    this.c.a = null;
                }
            }

            L.p(function10, "observer");
            if(this.a(function10)) {
                kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
                l0$h0.a = this;
                return new com.kakao.adfit.a.c.b.a(l0$h0, function10);
            }
            return m.a.a();
        }

        private final boolean c(Function1 function10) {
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.c;
            if(copyOnWriteArrayList0 == null) {
                return false;
            }
            copyOnWriteArrayList0.remove(function10);
            return true;
        }

        public final boolean c() {
            return this.b != 0L;
        }

        public final List d() {
            return this.a;
        }

        public final boolean e() {
            return this.c == null;
        }
    }

    public static final class com.kakao.adfit.a.c.c extends b {
        @Override  // com.kakao.adfit.a.c$b
        public void a() {
            super.a();
            this.a(u.H());
        }

        @Override  // com.kakao.adfit.a.c$b
        public void a(com.kakao.adfit.a.d.c d$c0) {
            super.a(d$c0);
            this.a();
        }
    }

    private final com.kakao.adfit.a.c.c a;
    private final com.kakao.adfit.a.c.c b;
    private final com.kakao.adfit.a.c.c c;
    private final b d;
    public static final a e;

    static {
        c.e = new a(null);
    }

    public c() {
        this.a = new com.kakao.adfit.a.c.c();
        this.b = new com.kakao.adfit.a.c.c();
        this.c = new com.kakao.adfit.a.c.c();
        this.d = new b();
    }

    public c(Context context0, com.kakao.adfit.a.a a0, e e0) {
        L.p(context0, "context");
        L.p(a0, "ad");
        L.p(e0, "reporter");
        this(context0, a0.a(), e0);
    }

    public c(Context context0, f f0, e e0) {
        L.p(context0, "context");
        L.p(f0, "tracker");
        L.p(e0, "reporter");
        this(f0);
        Context context1 = context0.getApplicationContext();
        L.o(context1, "context");
        c.e.a(this.a, context1, e0);
        c.e.a(this.b, context1, e0);
        a.a(c.e, this.c, context1, null, 2, null);
        this.d.a(f0.a());
    }

    public c(f f0) {
        L.p(f0, "tracker");
        this();
        this.a.a(f0.c());
        this.b.a(f0.d());
        this.c.a(f0.b());
        this.d.a(f0.a());
    }

    public final b a() {
        return this.d;
    }

    public final com.kakao.adfit.a.c.c b() {
        return this.c;
    }

    public final com.kakao.adfit.a.c.c c() {
        return this.a;
    }

    public final com.kakao.adfit.a.c.c d() {
        return this.b;
    }
}

