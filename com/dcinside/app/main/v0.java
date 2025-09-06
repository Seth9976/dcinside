package com.dcinside.app.main;

import A3.o;
import A3.q;
import com.dcinside.app.model.C;
import com.dcinside.app.realm.e;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.uk;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.g;
import y4.l;
import y4.m;
import z3.n;

public final class v0 {
    public static final class a {
        @m
        private final e a;
        @m
        private final e b;

        public a() {
            this(null, null, 3, null);
        }

        public a(@m e e0, @m e e1) {
            this.a = e0;
            this.b = e1;
        }

        public a(e e0, e e1, int v, w w0) {
            if((v & 1) != 0) {
                e0 = null;
            }
            if((v & 2) != 0) {
                e1 = null;
            }
            this(e0, e1);
        }

        @m
        public final e a() {
            return this.a;
        }

        @m
        public final e b() {
            return this.b;
        }

        @l
        public final a c(@m e e0, @m e e1) {
            return new a(e0, e1);
        }

        public static a d(a v0$a0, e e0, e e1, int v, Object object0) {
            if((v & 1) != 0) {
                e0 = v0$a0.a;
            }
            if((v & 2) != 0) {
                e1 = v0$a0.b;
            }
            return v0$a0.c(e0, e1);
        }

        @m
        public final e e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            return L.g(this.a, ((a)object0).a) ? L.g(this.b, ((a)object0).b) : false;
        }

        @m
        public final e f() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            e e0 = this.b;
            if(e0 != null) {
                v = e0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "MainContentsBlock(galleryBlock=" + this.a + ", totalBlock=" + this.b + ")";
        }
    }

    public static final class b {
        @l
        private final C a;
        @l
        private final com.dcinside.app.main.view.a b;
        @l
        private final String c;
        @l
        private final a d;

        public b() {
            this(null, null, null, null, 15, null);
        }

        public b(@l C c0, @l com.dcinside.app.main.view.a a0, @l String s, @l a v0$a0) {
            L.p(c0, "contents");
            L.p(a0, "crowd");
            L.p(s, "errorMsg");
            L.p(v0$a0, "block");
            super();
            this.a = c0;
            this.b = a0;
            this.c = s;
            this.d = v0$a0;
        }

        public b(C c0, com.dcinside.app.main.view.a a0, String s, a v0$a0, int v, w w0) {
            if((v & 1) != 0) {
                c0 = new C();
            }
            if((v & 2) != 0) {
                a0 = new com.dcinside.app.main.view.a(u.H(), u.H(), u.H(), u.H());
            }
            if((v & 4) != 0) {
                s = "";
            }
            if((v & 8) != 0) {
                v0$a0 = new a(null, null, 3, null);
            }
            this(c0, a0, s, v0$a0);
        }

        @l
        public final C a() {
            return this.a;
        }

        @l
        public final com.dcinside.app.main.view.a b() {
            return this.b;
        }

        @l
        public final String c() {
            return this.c;
        }

        @l
        public final a d() {
            return this.d;
        }

        @l
        public final b e(@l C c0, @l com.dcinside.app.main.view.a a0, @l String s, @l a v0$a0) {
            L.p(c0, "contents");
            L.p(a0, "crowd");
            L.p(s, "errorMsg");
            L.p(v0$a0, "block");
            return new b(c0, a0, s, v0$a0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            if(!L.g(this.a, ((b)object0).a)) {
                return false;
            }
            if(!L.g(this.b, ((b)object0).b)) {
                return false;
            }
            return L.g(this.c, ((b)object0).c) ? L.g(this.d, ((b)object0).d) : false;
        }

        public static b f(b v0$b0, C c0, com.dcinside.app.main.view.a a0, String s, a v0$a0, int v, Object object0) {
            if((v & 1) != 0) {
                c0 = v0$b0.a;
            }
            if((v & 2) != 0) {
                a0 = v0$b0.b;
            }
            if((v & 4) != 0) {
                s = v0$b0.c;
            }
            if((v & 8) != 0) {
                v0$a0 = v0$b0.d;
            }
            return v0$b0.e(c0, a0, s, v0$a0);
        }

        @l
        public final a g() {
            return this.d;
        }

        @l
        public final C h() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        }

        @l
        public final com.dcinside.app.main.view.a i() {
            return this.b;
        }

        @l
        public final String j() {
            return this.c;
        }

        @Override
        @l
        public String toString() {
            return "MainContentsBundle(contents=" + this.a + ", crowd=" + this.b + ", errorMsg=" + this.c + ", block=" + this.d + ")";
        }
    }

    @s0({"SMAP\nMainContentHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainContentHelper.kt\ncom/dcinside/app/main/MainContentHelper$mainContent$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n120#2,3:76\n124#2:81\n1#3:79\n1#3:80\n*S KotlinDebug\n*F\n+ 1 MainContentHelper.kt\ncom/dcinside/app/main/MainContentHelper$mainContent$1\n*L\n45#1:76,3\n45#1:81\n45#1:79\n*E\n"})
    static final class c extends N implements A3.a {
        public static final c e;

        static {
            c.e = new c();
        }

        c() {
            super(0);
        }

        @l
        public final g d() {
            static final class com.dcinside.app.main.v0.c.a extends N implements o {
                final a e;

                com.dcinside.app.main.v0.c.a(a v0$a0) {
                    this.e = v0$a0;
                    super(2);
                }

                public final b a(C c0, com.dcinside.app.main.view.a a0) {
                    L.m(c0);
                    L.m(a0);
                    return new b(c0, a0, null, this.e, 4, null);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((C)object0), ((com.dcinside.app.main.view.a)object1));
                }
            }


            static final class com.dcinside.app.main.v0.c.b extends N implements q {
                public static final com.dcinside.app.main.v0.c.b e;

                static {
                    com.dcinside.app.main.v0.c.b.e = new com.dcinside.app.main.v0.c.b();
                }

                com.dcinside.app.main.v0.c.b() {
                    super(4);
                }

                @Override  // A3.q
                public Object T0(Object object0, Object object1, Object object2, Object object3) {
                    return this.a(((List)object0), ((List)object1), ((List)object2), ((List)object3));
                }

                public final com.dcinside.app.main.view.a a(List list0, List list1, List list2, List list3) {
                    L.m(list0);
                    L.m(list1);
                    L.m(list2);
                    L.m(list3);
                    return new com.dcinside.app.main.view.a(list0, list1, list2, list3);
                }
            }


            static final class com.dcinside.app.main.v0.c.c extends N implements Function1 {
                public static final com.dcinside.app.main.v0.c.c e;

                static {
                    com.dcinside.app.main.v0.c.c.e = new com.dcinside.app.main.v0.c.c();
                }

                com.dcinside.app.main.v0.c.c() {
                    super(1);
                }

                public final com.dcinside.app.main.view.a a(Throwable throwable0) {
                    return new com.dcinside.app.main.view.a(u.H(), u.H(), u.H(), u.H());
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Throwable)object0));
                }
            }

            g g0 = g.u0(uk.JF(), g.s0(uk.KF(), uk.YF(), uk.UF(), uk.eG(), (Object object0, Object object1, Object object2, Object object3) -> {
                L.p(com.dcinside.app.main.v0.c.b.e, "$tmp0");
                return (com.dcinside.app.main.view.a)com.dcinside.app.main.v0.c.b.e.T0(object0, object1, object2, object3);
            }).a4((Object object0) -> {
                L.p(com.dcinside.app.main.v0.c.c.e, "$tmp0");
                return (com.dcinside.app.main.view.a)com.dcinside.app.main.v0.c.c.e.invoke(object0);
            }), (Object object0, Object object1) -> {
                L.p(new com.dcinside.app.main.v0.c.a(new a(null, null, 3, null)), "$tmp0");
                return (b)new com.dcinside.app.main.v0.c.a(new a(null, null, 3, null)).invoke(object0, object1);
            });
            L.o(g0, "combineLatest(...)");
            return g0;
        }

        // 检测为 Lambda 实现
        private static final com.dcinside.app.main.view.a e(q q0, Object object0, Object object1, Object object2, Object object3) [...]

        // 检测为 Lambda 实现
        private static final com.dcinside.app.main.view.a f(Function1 function10, Object object0) [...]

        // 检测为 Lambda 实现
        private static final b g(o o0, Object object0, Object object1) [...]

        @Override  // A3.a
        public Object invoke() {
            return this.d();
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
        public final b a(@l Throwable throwable0) {
            L.p(throwable0, "it");
            String s = throwable0.getMessage();
            if(s == null) {
                s = "컨텐츠를 가져오기를 실패했습니다.";
                L.o("컨텐츠를 가져오기를 실패했습니다.", "getString(...)");
            }
            return new b(null, null, s, null, 11, null);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.a(((Throwable)object0));
        }
    }

    @l
    public static final v0 a;
    @l
    private static final com.dcinside.app.rx.g b;

    static {
        v0.a = new v0();
        v0.b = new com.dcinside.app.rx.g(TimeUnit.SECONDS.toMillis(jl.a.m0()), c.e, d.e);
    }

    @n
    public static final void a() {
        v0.b.c();
    }

    @l
    @n
    public static final g b() {
        return v0.b.d();
    }
}

