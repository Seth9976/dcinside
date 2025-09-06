package com.dcinside.app.read.reply.more;

import Y.q1;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.read.Q0;
import com.dcinside.app.read.T0;
import com.dcinside.app.rx.bus.q0;
import com.dcinside.app.rx.bus.t0;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dk;
import io.realm.F0;
import kotlin.S0;
import kotlin.V;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nReplyMoreDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreDialogFragment.kt\ncom/dcinside/app/read/reply/more/ReplyMoreDialogFragment\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n*L\n1#1,196:1\n35#2:197\n27#3:198\n120#4,3:199\n124#4:204\n1#5:202\n1#5:203\n60#6:205\n60#6:206\n*S KotlinDebug\n*F\n+ 1 ReplyMoreDialogFragment.kt\ncom/dcinside/app/read/reply/more/ReplyMoreDialogFragment\n*L\n43#1:197\n61#1:198\n73#1:199,3\n73#1:204\n73#1:202\n109#1:205\n112#1:206\n*E\n"})
public final class j extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private q1 a;
    @m
    private b b;
    @m
    private Dialog c;
    private boolean d;
    @l
    public static final a e = null;
    @l
    public static final String f = "com.dcinside.app.read.reply.more.ReplyMoreDialogFragment";
    @l
    public static final String g = "com.dcinside.app.read.reply.more.extra.REPLY_ITEM";
    @l
    public static final String h = "com.dcinside.app.read.reply.more.EXTRA_REPLY_MODE";
    @l
    public static final String i = "com.dcinside.app.read.reply.more.EXTRA_RESULT_ID";
    @l
    public static final String j = "com.dcinside.app.read.reply.more.EXTRA_DATA";

    static {
        j.e = new a(null);
    }

    private final void A0(String s) {
        FragmentKt.d(this, "com.dcinside.app.read.reply.more.ReplyMoreDialogFragment", BundleKt.b(new V[]{r0.a("com.dcinside.app.read.reply.more.EXTRA_RESULT_ID", com.dcinside.app.read.reply.more.a.d.c()), r0.a("com.dcinside.app.read.reply.more.EXTRA_DATA", s)}));
        this.dismissAllowingStateLoss();
    }

    static void B0(j j0, com.dcinside.app.read.reply.more.a a0, int v, Q0 q00, int v1, Object object0) {
        if((v1 & 4) != 0) {
            q00 = Q0.b;
        }
        j0.z0(a0, v, q00);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = q1.d(layoutInflater0, viewGroup0, false);
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        View view0 = this.s0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        if(this.d) {
            j.B0(this, com.dcinside.app.read.reply.more.a.i, 0, null, 4, null);
        }
        b b0 = this.b;
        if(b0 != null) {
            b0.l();
        }
        Dialog dialog0 = this.c;
        if(dialog0 != null) {
            dialog0.dismiss();
        }
        this.c = null;
        this.s0().c.setAdapter(null);
        FragmentKt.b(this, "com.dcinside.app.read.reply.more.ReplyMoreDialogFragment");
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        int v;
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 == null) {
            v = 0;
        }
        else {
            Context context0 = dialog0.getContext();
            if(context0 == null) {
                v = 0;
            }
            else {
                Configuration configuration0 = context0.getResources().getConfiguration();
                L.o(configuration0, "getConfiguration(...)");
                v = configuration0 == null ? 0 : Dk.d(Math.min(configuration0.smallestScreenWidthDp - 20, 310));
            }
        }
        Dialog dialog1 = this.getDialog();
        if(dialog1 != null) {
            Window window0 = dialog1.getWindow();
            if(window0 != null) {
                window0.setLayout(v, -2);
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                windowManager$LayoutParams0.gravity = 17;
                window0.setAttributes(windowManager$LayoutParams0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        static final class d extends N implements A3.a {
            final ReplyMoreItem e;
            final j f;

            d(ReplyMoreItem replyMoreItem0, j j0) {
                this.e = replyMoreItem0;
                this.f = j0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            // 去混淆评级： 中等(50)
            public final void invoke() {
            }
        }


        static final class e extends N implements A3.a {
            final j e;
            final ReplyMoreItem f;

            e(j j0, ReplyMoreItem replyMoreItem0) {
                this.e = j0;
                this.f = replyMoreItem0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                int v = this.f.K();
                j.B0(this.e, com.dcinside.app.read.reply.more.a.e, v, null, 4, null);
            }
        }


        static final class f extends N implements A3.a {
            final j e;
            final ReplyMoreItem f;

            f(j j0, ReplyMoreItem replyMoreItem0) {
                this.e = j0;
                this.f = replyMoreItem0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                Q0 q00 = this.f.M();
                this.e.z0(com.dcinside.app.read.reply.more.a.f, this.f.K(), q00);
            }
        }


        static final class g extends N implements A3.a {
            final j e;
            final ReplyMoreItem f;

            g(j j0, ReplyMoreItem replyMoreItem0) {
                this.e = j0;
                this.f = replyMoreItem0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.z0(com.dcinside.app.read.reply.more.a.g, this.f.K(), this.f.M());
            }
        }


        static final class h extends N implements A3.a {
            final j e;
            final ReplyMoreItem f;

            h(j j0, ReplyMoreItem replyMoreItem0) {
                this.e = j0;
                this.f = replyMoreItem0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.z0(com.dcinside.app.read.reply.more.a.h, this.f.K(), this.f.M());
            }
        }


        static final class i extends N implements A3.a {
            final j e;
            final ReplyMoreItem f;

            i(j j0, ReplyMoreItem replyMoreItem0) {
                this.e = j0;
                this.f = replyMoreItem0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.z0(com.dcinside.app.read.reply.more.a.j, this.f.K(), this.f.M());
            }
        }


        static final class com.dcinside.app.read.reply.more.j.j extends N implements A3.a {
            final j e;
            final ReplyMoreItem f;

            com.dcinside.app.read.reply.more.j.j(j j0, ReplyMoreItem replyMoreItem0) {
                this.e = j0;
                this.f = replyMoreItem0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.z0(com.dcinside.app.read.reply.more.a.k, this.f.K(), this.f.M());
            }
        }


        static final class k extends N implements A3.a {
            final j e;
            final com.dcinside.app.read.reply.more.f f;
            final BlockState g;
            final BlockState h;
            final com.dcinside.app.realm.f i;
            final com.dcinside.app.realm.f j;

            k(j j0, com.dcinside.app.read.reply.more.f f0, BlockState blockState0, BlockState blockState1, com.dcinside.app.realm.f f1, com.dcinside.app.realm.f f2) {
                this.e = j0;
                this.f = f0;
                this.g = blockState0;
                this.h = blockState1;
                this.i = f1;
                this.j = f2;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                boolean z = this.f.K(this.g, this.h, this.i, this.j);
                this.e.d = z;
            }
        }

        V v0;
        V v1;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            return;
        }
        ReplyMoreItem replyMoreItem0 = (ReplyMoreItem)BundleCompat.b(bundle1, "com.dcinside.app.read.reply.more.extra.REPLY_ITEM", ReplyMoreItem.class);
        if(replyMoreItem0 == null) {
            return;
        }
        com.dcinside.app.read.reply.more.f f0 = new com.dcinside.app.read.reply.more.f();
        q1 q10 = this.s0();
        com.dcinside.app.read.reply.more.g g0 = (View view0) -> {
            L.p(this, "this$0");
            this.dismissAllowingStateLoss();
        };
        q10.b.setOnClickListener(g0);
        q1 q11 = this.s0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this.getContext(), 1, false);
        q11.c.setLayoutManager(linearLayoutManager0);
        this.s0().c.setAdapter(f0);
        switch(replyMoreItem0.O()) {
            case 10000004: 
            case 10000022: {
                F0 f00 = F0.g4();
                try {
                    L.m(f00);
                    com.dcinside.app.realm.f f1 = com.dcinside.app.realm.f.i.c(f00, ((Number)replyMoreItem0.D().f()).longValue());
                    com.dcinside.app.realm.f f2 = com.dcinside.app.realm.f.i.c(f00, ((Number)replyMoreItem0.N().f()).longValue());
                    f0.Z(f1, f2);
                    v1 = r0.a((f1 == null ? null : ((com.dcinside.app.realm.f)f00.d2(f1))), (f2 == null ? null : ((com.dcinside.app.realm.f)f00.d2(f2))));
                    goto label_31;
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    c.a(f00, throwable0);
                    throw throwable1;
                }
            label_31:
                c.a(f00, null);
                v0 = v1;
                break;
            }
            default: {
                v0 = r0.a(null, null);
            }
        }
        BlockState blockState0 = BlockState.d.a("", "", "", "");
        BlockState blockState1 = BlockState.d.a("", "", "", "");
        f0.a0(blockState0, blockState1);
        f0.b0(replyMoreItem0);
        f0.f0(new d(replyMoreItem0, this));
        f0.i0(new e(this, replyMoreItem0));
        f0.d0(new f(this, replyMoreItem0));
        f0.j0(new g(this, replyMoreItem0));
        f0.h0(new h(this, replyMoreItem0));
        f0.e0(new i(this, replyMoreItem0));
        f0.g0(new com.dcinside.app.read.reply.more.j.j(this, replyMoreItem0));
        f0.c0(new k(this, f0, blockState0, blockState1, ((com.dcinside.app.realm.f)v0.a()), ((com.dcinside.app.realm.f)v0.b())));
        this.t0();
    }

    public static final void r0(j j0, String s) {
        j0.A0(s);
    }

    private final q1 s0() {
        q1 q10 = this.a;
        L.m(q10);
        return q10;
    }

    private final void t0() {
        static final class com.dcinside.app.read.reply.more.j.b extends N implements Function1 {
            final j e;
            final AppCompatActivity f;

            com.dcinside.app.read.reply.more.j.b(j j0, AppCompatActivity appCompatActivity0) {
                this.e = j0;
                this.f = appCompatActivity0;
                super(1);
            }

            public final void a(t0 t00) {
                L.m(t00);
                this.e.w0(this.f, t00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((t0)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.read.reply.more.j.c extends N implements Function1 {
            final j e;

            com.dcinside.app.read.reply.more.j.c(j j0) {
                this.e = j0;
                super(1);
            }

            public final void a(q0 q00) {
                L.m(q00);
                this.e.x0(q00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((q0)object0));
                return S0.a;
            }
        }

        Context context0 = Al.h(this.getContext());
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        b b0 = this.b;
        if(b0 != null) {
            b0.l();
        }
        this.b = new b();
        o o0 = com.dcinside.app.rx.bus.c.c(appCompatActivity0, t0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.read.reply.more.j.b(this, appCompatActivity0), "$tmp0");
            new com.dcinside.app.read.reply.more.j.b(this, appCompatActivity0).invoke(object0);
        });
        b b1 = this.b;
        if(b1 != null) {
            b1.a(o0);
        }
        o o1 = com.dcinside.app.rx.bus.c.c(appCompatActivity0, q0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.read.reply.more.j.c(this), "$tmp0");
            new com.dcinside.app.read.reply.more.j.c(this).invoke(object0);
        });
        b b2 = this.b;
        if(b2 != null) {
            b2.a(o1);
        }
    }

    // 检测为 Lambda 实现
    private static final void u0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void v0(Function1 function10, Object object0) [...]

    private final void w0(Context context0, t0 t00) {
        Dialog dialog0 = this.c;
        if(dialog0 != null) {
            dialog0.dismiss();
        }
        T0 t01 = new T0(context0, t00.a(), t00.b());
        t01.show();
        this.c = t01;
    }

    private final void x0(q0 q00) {
        switch(q00.b()) {
            case 1: {
                Object[] arr_object = q00.a();
                if(arr_object.length != 0) {
                    Object object0 = arr_object[0];
                    if(object0 instanceof String) {
                        L.n(object0, "null cannot be cast to non-null type kotlin.String");
                        FragmentKt.d(this, "com.dcinside.app.read.reply.more.ReplyMoreDialogFragment", BundleKt.b(new V[]{r0.a("com.dcinside.app.read.reply.more.EXTRA_RESULT_ID", com.dcinside.app.read.reply.more.a.m.c()), r0.a("com.dcinside.app.read.reply.more.EXTRA_DATA", ((String)object0))}));
                    }
                }
                break;
            }
            case 2: {
                Object[] arr_object1 = q00.a();
                if(arr_object1.length != 0) {
                    Object object1 = arr_object1[0];
                    if(object1 instanceof String) {
                        L.n(object1, "null cannot be cast to non-null type kotlin.String");
                        FragmentKt.d(this, "com.dcinside.app.read.reply.more.ReplyMoreDialogFragment", BundleKt.b(new V[]{r0.a("com.dcinside.app.read.reply.more.EXTRA_RESULT_ID", com.dcinside.app.read.reply.more.a.l.c()), r0.a("com.dcinside.app.read.reply.more.EXTRA_DATA", ((String)object1))}));
                    }
                }
            }
        }
        this.dismissAllowingStateLoss();
    }

    // 检测为 Lambda 实现
    private static final void y0(j j0, View view0) [...]

    private final void z0(com.dcinside.app.read.reply.more.a a0, int v, Q0 q00) {
        if(v < 0) {
            return;
        }
        FragmentKt.d(this, "com.dcinside.app.read.reply.more.ReplyMoreDialogFragment", BundleKt.b(new V[]{r0.a("com.dcinside.app.read.reply.more.EXTRA_RESULT_ID", a0.c()), r0.a("com.dcinside.app.read.reply.more.EXTRA_DATA", v), r0.a("com.dcinside.app.read.reply.more.EXTRA_REPLY_MODE", q00.c())}));
        this.dismissAllowingStateLoss();
    }
}

