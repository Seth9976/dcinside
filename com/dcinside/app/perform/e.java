package com.dcinside.app.perform;

import A3.o;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.util.Dl;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.g;
import rx.n;
import y4.l;

@s0({"SMAP\nAlertDialogPerformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialogPerformer.kt\ncom/dcinside/app/perform/AlertDialogPerformer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
public final class e implements m {
    public static final class a {
        @l
        private final e a;
        @l
        private final com.dcinside.app.perform.p.a b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private boolean h;
        @y4.m
        private A3.a i;
        @y4.m
        private Function1 j;
        @y4.m
        private Object[] k;
        @y4.m
        private o l;
        @y4.m
        private Function1 m;
        private int n;

        public a(@l e e0, @l com.dcinside.app.perform.p.a p$a0) {
            L.p(e0, "mPerformer");
            L.p(p$a0, "mBuilder");
            super();
            this.a = e0;
            this.b = p$a0;
            this.c = -2;
            this.n = -1;
        }

        @l
        public final a A(@l A3.a a0) {
            L.p(a0, "inProgressSubscribe");
            this.h = true;
            this.i = a0;
            return this;
        }

        public final void B(int v) {
            this.c = v;
        }

        public final void C(@y4.m A3.a a0) {
            this.i = a0;
        }

        public final void D(@y4.m Function1 function10) {
            this.m = function10;
        }

        public final void E(@y4.m o o0) {
            this.l = o0;
        }

        public final void F(@y4.m Object[] arr_object) {
            this.k = arr_object;
        }

        public final void G(int v) {
            this.g = v;
        }

        public final void H(int v) {
            this.e = v;
        }

        public final void I(int v) {
            this.f = v;
        }

        public final void J(@y4.m Function1 function10) {
            this.j = function10;
        }

        public final void K(int v) {
            this.d = v;
        }

        public final void L(boolean z) {
            this.h = z;
        }

        public final void M(int v) {
            this.n = v;
        }

        @l
        public final a N(@l Function1 function10) {
            L.p(function10, "l");
            this.j = function10;
            return this;
        }

        @l
        public final g b() {
            static final class com.dcinside.app.perform.e.a.a extends N implements Function1 {
                public static final com.dcinside.app.perform.e.a.a e;

                static {
                    com.dcinside.app.perform.e.a.a.e = new com.dcinside.app.perform.e.a.a();
                }

                com.dcinside.app.perform.e.a.a() {
                    super(1);
                }

                public final Boolean a(Integer integer0) {
                    return integer0 == null || ((int)integer0) != -1 ? false : true;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Integer)object0));
                }
            }

            g g0 = this.d().g3((Object object0) -> {
                L.p(com.dcinside.app.perform.e.a.a.e, "$tmp0");
                return (Boolean)com.dcinside.app.perform.e.a.a.e.invoke(object0);
            });
            L.o(g0, "map(...)");
            return g0;
        }

        // 检测为 Lambda 实现
        private static final Boolean c(Function1 function10, Object object0) [...]

        @l
        public final g d() {
            return this.a.t(this.b, this);
        }

        @l
        public final a e(int v) {
            this.c = v;
            return this;
        }

        public final int f() {
            return this.c;
        }

        @y4.m
        public final A3.a g() {
            return this.i;
        }

        @y4.m
        public final Function1 h() {
            return this.m;
        }

        @y4.m
        public final o i() {
            return this.l;
        }

        @y4.m
        public final Object[] j() {
            return this.k;
        }

        public final int k() {
            return this.g;
        }

        public final int l() {
            return this.e;
        }

        public final int m() {
            return this.f;
        }

        @y4.m
        public final Function1 n() {
            return this.j;
        }

        public final int o() {
            return this.d;
        }

        public final boolean p() {
            return this.h;
        }

        public final int q() {
            return this.n;
        }

        @l
        public final a r(@l Function1 function10) {
            L.p(function10, "itemClickFilter");
            this.m = function10;
            return this;
        }

        @l
        public final a s(@l o o0) {
            L.p(o0, "styles");
            this.l = o0;
            return this;
        }

        @l
        public final a t(@ArrayRes int v, int v1) {
            this.k = null;
            this.g = v;
            this.n = v1;
            return this;
        }

        @l
        public final a u(@l CharSequence[] arr_charSequence, int v) {
            L.p(arr_charSequence, "items");
            this.g = 0;
            this.k = arr_charSequence;
            this.n = v;
            return this;
        }

        public static a v(a e$a0, int v, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v1 = -1;
            }
            return e$a0.t(v, v1);
        }

        public static a w(a e$a0, CharSequence[] arr_charSequence, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = -1;
            }
            return e$a0.u(arr_charSequence, v);
        }

        @l
        public final a x(int v) {
            this.e = v;
            return this;
        }

        @l
        public final a y(int v) {
            this.f = v;
            return this;
        }

        @l
        public final a z(int v) {
            this.d = v;
            return this;
        }
    }

    static final class b implements DialogInterface.OnCancelListener {
        private final int a;
        @y4.m
        private n b;

        public b(int v, @y4.m n n0) {
            this.a = v;
            this.b = n0;
        }

        public final int a() {
            return this.a;
        }

        @y4.m
        public final n b() {
            return this.b;
        }

        public final void c(@y4.m n n0) {
            this.b = n0;
        }

        @Override  // android.content.DialogInterface$OnCancelListener
        public void onCancel(@y4.m DialogInterface dialogInterface0) {
            n n0 = this.b;
            if(n0 != null) {
                n0.onNext(this.a);
            }
            n n1 = this.b;
            if(n1 != null) {
                n1.d();
            }
            this.b = null;
        }
    }

    public static final class c {
        private c() {
        }

        public c(w w0) {
        }

        @l
        @z3.n
        public final e a(@l AppCompatActivity appCompatActivity0) {
            L.p(appCompatActivity0, "activity");
            d e$d0 = d.a.a();
            return (e)q.c.a(appCompatActivity0, e$d0);
        }
    }

    static final class d implements com.dcinside.app.perform.n {
        public static final class com.dcinside.app.perform.e.d.a {
            private com.dcinside.app.perform.e.d.a() {
            }

            public com.dcinside.app.perform.e.d.a(w w0) {
            }

            @l
            public final d a() {
                return d.b;
            }
        }

        @l
        public static final com.dcinside.app.perform.e.d.a a;
        @l
        private static final d b;

        static {
            d.a = new com.dcinside.app.perform.e.d.a(null);
            d.b = new d();
        }

        @Override  // com.dcinside.app.perform.n
        public Object a(AppCompatActivity appCompatActivity0) {
            return this.c(appCompatActivity0);
        }

        @l
        public e c(@l AppCompatActivity appCompatActivity0) {
            L.p(appCompatActivity0, "activity");
            return new e(appCompatActivity0, null);
        }

        @Override  // com.dcinside.app.perform.n
        @l
        public Class type() {
            return e.class;
        }
    }

    static final class com.dcinside.app.perform.e.e extends ArrayAdapter {
        @y4.m
        private final o a;

        public com.dcinside.app.perform.e.e(@l Context context0, @l Object[] arr_object, @y4.m o o0, int v) {
            L.p(context0, "context");
            L.p(arr_object, "items");
            super(context0, v, arr_object);
            this.a = o0;
        }

        public com.dcinside.app.perform.e.e(Context context0, Object[] arr_object, o o0, int v, int v1, w w0) {
            if((v1 & 8) != 0) {
                v = 0x7F0E00DC;  // layout:dialog_list_item_basic
            }
            this(context0, arr_object, o0, v);
        }

        @y4.m
        public final o a() {
            return this.a;
        }

        @Override  // android.widget.ArrayAdapter
        @l
        public View getView(int v, @y4.m View view0, @l ViewGroup viewGroup0) {
            L.p(viewGroup0, "parent");
            View view1 = super.getView(v, view0, viewGroup0);
            L.o(view1, "getView(...)");
            o o0 = this.a;
            if(o0 != null) {
                TextView textView0 = view1 instanceof TextView ? ((TextView)view1) : null;
                if(textView0 != null) {
                    o0.invoke(textView0, v);
                }
            }
            return view1;
        }
    }

    private boolean a;
    private double b;
    @y4.m
    private p c;
    @l
    private final WeakReference d;
    @l
    public static final c e;

    static {
        e.e = new c(null);
    }

    private e(AppCompatActivity appCompatActivity0) {
        this.d = new WeakReference(appCompatActivity0);
    }

    public e(AppCompatActivity appCompatActivity0, w w0) {
        this(appCompatActivity0);
    }

    @Override  // com.dcinside.app.perform.m
    public void a(@y4.m Context context0) {
        this.a = true;
        this.o();
    }

    @Override  // com.dcinside.app.perform.m
    public void b(@y4.m Context context0) {
        this.a = true;
        this.o();
    }

    @Override  // com.dcinside.app.perform.m
    public void c(@y4.m Context context0) {
        this.o();
    }

    @Override  // com.dcinside.app.perform.m
    public void d(@y4.m Context context0) {
        this.a = false;
    }

    private final g j(a e$a0, Function1 function10) {
        this.o();
        double f = Dl.v(0.0, 10000.0);
        this.b = f;
        g g0 = g.M6((n n0) -> {
            L.p(this, "this$0");
            L.p(function10, "$inCall");
            n0.onStart();
            try {
                if(this.a) {
                    n0.d();
                    return;
                }
                L.m(n0);
                Object object0 = function10.invoke(n0);
                ((p)object0).setOnCancelListener(new b((e$a0 == null ? -2 : e$a0.f()), n0));
                ((p)object0).show();
                this.c = (p)object0;
                return;
            }
            catch(Exception exception0) {
            }
            n0.onError(exception0);
            n0.d();
        }).M3(rx.android.schedulers.a.c()).T1(() -> {
            L.p(this, "this$0");
            if(f == this.b) {
                this.o();
            }
        });
        L.o(g0, "doOnUnsubscribe(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void k(e e0, Function1 function10, a e$a0, n n0) [...]

    // 检测为 Lambda 实现
    private static final void l(double f, e e0) [...]

    @l
    public final a m() {
        Object object0 = this.d.get();
        L.m(object0);
        return new a(this, new com.dcinside.app.perform.p.a(((Context)object0), 0, 2, null));
    }

    @l
    public final a n(@l Function1 function10) {
        L.p(function10, "alertBuilderCallback");
        Object object0 = this.d.get();
        L.m(object0);
        com.dcinside.app.perform.p.a p$a0 = new com.dcinside.app.perform.p.a(((Context)object0), 0, 2, null);
        function10.invoke(p$a0);
        return new a(this, p$a0);
    }

    public final void o() {
        p p0 = this.c;
        if(p0 != null) {
            if(!p0.isShowing()) {
                p0 = null;
            }
            if(p0 != null) {
                p0.cancel();
            }
        }
    }

    @l
    public final g p(@l Function1 function10) {
        L.p(function10, "inCall");
        return this.j(null, function10);
    }

    @l
    public final rx.o q(@l Throwable throwable0) {
        static final class f extends N implements Function1 {
            final Throwable e;

            f(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @y4.m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.perform.e.g extends N implements Function1 {
            public static final com.dcinside.app.perform.e.g e;

            static {
                com.dcinside.app.perform.e.g.e = new com.dcinside.app.perform.e.g();
            }

            com.dcinside.app.perform.e.g() {
                super(1);
            }

            public final Boolean a(Throwable throwable0) {
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        L.p(throwable0, "error");
        rx.o o0 = this.n(new f(throwable0)).x(0x104000A).b().a4((Object object0) -> {
            L.p(com.dcinside.app.perform.e.g.e, "$tmp0");
            return (Boolean)com.dcinside.app.perform.e.g.e.invoke(object0);
        }).t5();
        L.o(o0, "subscribe(...)");
        return o0;
    }

    // 检测为 Lambda 实现
    private static final Boolean r(Function1 function10, Object object0) [...]

    @l
    @z3.n
    public static final e s(@l AppCompatActivity appCompatActivity0) {
        return e.e.a(appCompatActivity0);
    }

    private final g t(com.dcinside.app.perform.p.a p$a0, a e$a0) {
        static final class h extends N implements Function1 {
            final a e;
            final com.dcinside.app.perform.p.a f;
            final e g;

            h(a e$a0, com.dcinside.app.perform.p.a p$a0, e e0) {
                this.e = e$a0;
                this.f = p$a0;
                this.g = e0;
                super(1);
            }

            @l
            public final p h(@l n n0) {
                public static final class com.dcinside.app.perform.e.h.a implements View.OnAttachStateChangeListener {
                    @y4.m
                    private rx.o a;
                    final a b;

                    com.dcinside.app.perform.e.h.a(a e$a0) {
                        this.b = e$a0;
                        super();
                    }

                    @Override  // android.view.View$OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@l View view0) {
                        L.p(view0, "v");
                        A3.a a0 = this.b.g();
                        this.a = a0 == null ? null : ((rx.o)a0.invoke());
                    }

                    @Override  // android.view.View$OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@l View view0) {
                        L.p(view0, "v");
                        rx.o o0 = this.a;
                        if(o0 != null) {
                            o0.l();
                        }
                    }
                }

                com.dcinside.app.perform.e.e e$e0;
                L.p(n0, "subscriber");
                if(this.e.o() != 0) {
                    com.dcinside.app.perform.f f0 = (DialogInterface dialogInterface0, int v) -> {
                        L.p(n0, "$subscriber");
                        n0.onNext(v);
                        n0.d();
                    };
                    this.f.B(this.e.o(), f0);
                }
                if(this.e.l() != 0) {
                    com.dcinside.app.perform.g g0 = (DialogInterface dialogInterface0, int v) -> {
                        L.p(n0, "$subscriber");
                        n0.onNext(v);
                        n0.d();
                    };
                    this.f.r(this.e.l(), g0);
                }
                if(this.e.m() != 0) {
                    com.dcinside.app.perform.h h0 = (DialogInterface dialogInterface0, int v) -> {
                        L.p(n0, "$subscriber");
                        n0.onNext(v);
                        n0.d();
                    };
                    this.f.u(this.e.m(), h0);
                }
                Context context0 = this.f.b();
                Resources resources0 = context0.getResources();
                int v = this.e.q();
                if(this.e.k() != 0) {
                    String[] arr_s = resources0.getStringArray(this.e.k());
                    this.e.F(arr_s);
                }
                if(this.e.j() == null) {
                    e$e0 = null;
                }
                else {
                    Object[] arr_object = this.e.j();
                    L.m(arr_object);
                    e$e0 = new com.dcinside.app.perform.e.e(context0, arr_object, this.e.i(), (v < 0 ? 0x7F0E00DC : 0x7F0E00DD));  // layout:dialog_list_item_basic
                }
                Function1 function10 = this.e.h();
                if(e$e0 != null) {
                    if(v >= 0) {
                        i i0 = (DialogInterface dialogInterface0, int v) -> {
                            L.p(n0, "$subscriber");
                            n0.onNext(v);
                            n0.d();
                        };
                        this.f.H(e$e0, v, i0);
                    }
                    else if(function10 == null) {
                        j j0 = (DialogInterface dialogInterface0, int v) -> {
                            L.p(n0, "$subscriber");
                            n0.onNext(v);
                            n0.d();
                        };
                        this.f.c(e$e0, j0);
                    }
                    else {
                        this.f.c(e$e0, null);
                    }
                }
                if(this.e.p()) {
                    this.g.u(this.f);
                    ProgressBar progressBar0 = new ProgressBar(this.f.b());
                    progressBar0.setBackgroundResource(0x7F0605A2);  // color:transparent
                    progressBar0.addOnAttachStateChangeListener(new com.dcinside.app.perform.e.h.a(this.e));
                    this.f.M(progressBar0);
                }
                p p0 = this.f.a();
                if(function10 != null && v == -1) {
                    p0.n().setOnItemClickListener((AdapterView adapterView0, View view0, int v, long v1) -> {
                        L.p(n0, "$subscriber");
                        L.p(p0, "$dialog");
                        if(((Boolean)function10.invoke(v)).booleanValue()) {
                            n0.onNext(v);
                            n0.d();
                            p0.dismiss();
                        }
                    });
                }
                if(this.e.p()) {
                    Window window0 = p0.getWindow();
                    if(window0 != null) {
                        window0.setBackgroundDrawable(new ColorDrawable(0));
                    }
                }
                p0.setOnShowListener((DialogInterface dialogInterface0) -> {
                    L.p(this.e, "$bi");
                    L.p(p0, "$dialog");
                    Function1 function10 = this.e.n();
                    if(function10 != null) {
                        function10.invoke(p0);
                    }
                });
                return p0;
            }

            // 检测为 Lambda 实现
            private static final void i(n n0, DialogInterface dialogInterface0, int v) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.h(((n)object0));
            }

            // 检测为 Lambda 实现
            private static final void j(n n0, DialogInterface dialogInterface0, int v) [...]

            // 检测为 Lambda 实现
            private static final void k(n n0, DialogInterface dialogInterface0, int v) [...]

            // 检测为 Lambda 实现
            private static final void l(n n0, DialogInterface dialogInterface0, int v) [...]

            // 检测为 Lambda 实现
            private static final void m(n n0, DialogInterface dialogInterface0, int v) [...]

            // 检测为 Lambda 实现
            private static final void n(Function1 function10, n n0, p p0, AdapterView adapterView0, View view0, int v, long v1) [...]

            // 检测为 Lambda 实现
            private static final void o(a e$a0, p p0, DialogInterface dialogInterface0) [...]
        }

        return this.j(e$a0, new h(e$a0, p$a0, this));
    }

    private final void u(com.dcinside.app.perform.p.a p$a0) {
        try {
            com.dcinside.app.perform.p.a.class.getDeclaredField("b").setAccessible(true);
            p$a0.b = 0x7F1601C3;
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
    }
}

