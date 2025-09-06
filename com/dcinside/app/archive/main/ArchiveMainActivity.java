package com.dcinside.app.archive.main;

import Y.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.Application;
import com.dcinside.app.archive.search.ArchiveSearchActivity;
import com.dcinside.app.backup.BackupActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.s;
import com.dcinside.app.model.l0;
import com.dcinside.app.perform.e;
import com.dcinside.app.post.fragments.L4;
import com.dcinside.app.read.T0;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.d0;
import com.dcinside.app.rx.bus.q0;
import com.dcinside.app.rx.bus.t0;
import com.dcinside.app.rx.bus.u0;
import com.dcinside.app.type.m;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Fk;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.uk;
import com.google.android.material.tabs.TabLayout;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import io.realm.F0;
import io.realm.RealmQuery;
import j..time.LocalDateTime;
import java.io.Closeable;
import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import rx.o;
import rx.subscriptions.b;
import y4.l;

@s0({"SMAP\nArchiveMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveMainActivity.kt\ncom/dcinside/app/archive/main/ArchiveMainActivity\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,416:1\n177#2,9:417\n192#2,7:431\n1#3:426\n60#4:427\n60#4:428\n60#4:429\n60#4:430\n257#5,2:438\n255#5:440\n257#5,2:441\n37#6:443\n37#6:444\n*S KotlinDebug\n*F\n+ 1 ArchiveMainActivity.kt\ncom/dcinside/app/archive/main/ArchiveMainActivity\n*L\n121#1:417,9\n235#1:431,7\n184#1:427\n187#1:428\n190#1:429\n193#1:430\n246#1:438,2\n248#1:440\n259#1:441,2\n372#1:443\n385#1:444\n*E\n"})
public final class ArchiveMainActivity extends g implements PermissionListener {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            try {
                arr_v[m.i.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.j.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.h.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @y4.m
    private L4 A;
    private d B;
    @y4.m
    private A0 C;
    @y4.m
    private Dialog D;
    private int w;
    @y4.m
    private I0 x;
    @y4.m
    private o y;
    @y4.m
    private b z;

    private final void Z1(String s) {
        static final class com.dcinside.app.archive.main.ArchiveMainActivity.b extends N implements Function1 {
            final String e;

            com.dcinside.app.archive.main.ArchiveMainActivity.b(String s) {
                this.e = s;
                super(1);
            }

            @y4.m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        if(s == null) {
            s = "데이터를 읽을 수 없습니다.";
            L.o("데이터를 읽을 수 없습니다.", "getString(...)");
        }
        e.e.a(this).n(new com.dcinside.app.archive.main.ArchiveMainActivity.b(s)).z(0x7F15034A).b().x5((Object object0) -> {
            L.p(c.e, "$tmp0");
            c.e.invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void a2(Function1 function10, Object object0) [...]

    private final void b2(String s) {
        static final class com.dcinside.app.archive.main.ArchiveMainActivity.d extends N implements Function1 {
            final ArchiveMainActivity e;

            com.dcinside.app.archive.main.ArchiveMainActivity.d(ArchiveMainActivity archiveMainActivity0) {
                this.e = archiveMainActivity0;
                super(1);
            }

            public final void a(l0 l00) {
                this.e.s2(false);
                L.m(l00);
                this.e.w2(l00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((l0)object0));
                return S0.a;
            }
        }

        if(s == null) {
            return;
        }
        this.s2(true);
        o o0 = this.y;
        if(o0 != null) {
            o0.l();
        }
        this.y = uk.mk(s).y5((Object object0) -> {
            L.p(new com.dcinside.app.archive.main.ArchiveMainActivity.d(this), "$tmp0");
            new com.dcinside.app.archive.main.ArchiveMainActivity.d(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.s2(false);
            this.Z1(throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void c2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void d2(ArchiveMainActivity archiveMainActivity0, Throwable throwable0) [...]

    private final void e2(int v, int v1, String s, A3.o o0) {
        @f(c = "com.dcinside.app.archive.main.ArchiveMainActivity$export$1", f = "ArchiveMainActivity.kt", i = {}, l = {354, 358, 363}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.main.ArchiveMainActivity.e extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final ArchiveMainActivity l;
            final int m;
            final String n;
            final A3.o o;

            com.dcinside.app.archive.main.ArchiveMainActivity.e(ArchiveMainActivity archiveMainActivity0, int v, String s, A3.o o0, kotlin.coroutines.d d0) {
                this.l = archiveMainActivity0;
                this.m = v;
                this.n = s;
                this.o = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.archive.main.ArchiveMainActivity.e(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.archive.main.ArchiveMainActivity.e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.archive.main.ArchiveMainActivity$export$1$1", f = "ArchiveMainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.archive.main.ArchiveMainActivity.e.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final ArchiveMainActivity l;

                    com.dcinside.app.archive.main.ArchiveMainActivity.e.a(ArchiveMainActivity archiveMainActivity0, kotlin.coroutines.d d0) {
                        this.l = archiveMainActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.archive.main.ArchiveMainActivity.e.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.archive.main.ArchiveMainActivity.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.s2(true);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.archive.main.ArchiveMainActivity$export$1$2", f = "ArchiveMainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.archive.main.ArchiveMainActivity.e.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final ArchiveMainActivity l;
                    final File m;

                    com.dcinside.app.archive.main.ArchiveMainActivity.e.b(ArchiveMainActivity archiveMainActivity0, File file0, kotlin.coroutines.d d0) {
                        this.l = archiveMainActivity0;
                        this.m = file0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.archive.main.ArchiveMainActivity.e.b(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @y4.m
                    public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.archive.main.ArchiveMainActivity.e.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.v2(this.m);
                        this.l.s2(false);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.archive.main.ArchiveMainActivity$export$1$writtenFile$1", f = "ArchiveMainActivity.kt", i = {}, l = {360}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.archive.main.ArchiveMainActivity.e.c extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    Object l;
                    final A3.o m;

                    com.dcinside.app.archive.main.ArchiveMainActivity.e.c(A3.o o0, kotlin.coroutines.d d0) {
                        this.m = o0;
                        super(2, d0);
                    }

                    @y4.m
                    public final Object a(@l OutputStream outputStream0, @y4.m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.archive.main.ArchiveMainActivity.e.c)this.create(outputStream0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.archive.main.ArchiveMainActivity.e.c(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((OutputStream)object0), ((kotlin.coroutines.d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @y4.m
                    public final Object invokeSuspend(@l Object object0) {
                        Closeable closeable0;
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(((OutputStream)this.l), kotlin.text.f.b);
                                try {
                                    this.l = outputStreamWriter0;
                                    this.k = 1;
                                    if(this.m.invoke(outputStreamWriter0, this) == object1) {
                                        return object1;
                                    }
                                }
                                catch(Throwable throwable0) {
                                    closeable0 = outputStreamWriter0;
                                    throw throwable0;
                                }
                                closeable0 = outputStreamWriter0;
                                break;
                            }
                            case 1: {
                                closeable0 = (Closeable)this.l;
                                try {
                                    f0.n(object0);
                                    break;
                                }
                                catch(Throwable throwable0) {
                                }
                                try {
                                    throw throwable0;
                                }
                                catch(Throwable throwable1) {
                                    kotlin.io.c.a(closeable0, throwable0);
                                    throw throwable1;
                                }
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        kotlin.io.c.a(closeable0, null);
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.archive.main.ArchiveMainActivity.e.a archiveMainActivity$e$a0 = new com.dcinside.app.archive.main.ArchiveMainActivity.e.a(this.l, null);
                        this.k = 1;
                        if(i.h(h0.e(), archiveMainActivity$e$a0, this) == object1) {
                            return object1;
                        }
                        goto label_11;
                    }
                    case 1: {
                        f0.n(object0);
                    label_11:
                        String s = this.l.getString(this.m, new Object[]{this.n});
                        L.o(s, "getString(...)");
                        com.dcinside.app.archive.main.ArchiveMainActivity.e.c archiveMainActivity$e$c0 = new com.dcinside.app.archive.main.ArchiveMainActivity.e.c(this.o, null);
                        this.k = 2;
                        object0 = Fk.a.j(s, "text/html", archiveMainActivity$e$c0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.dcinside.app.archive.main.ArchiveMainActivity.e.b archiveMainActivity$e$b0 = new com.dcinside.app.archive.main.ArchiveMainActivity.e.b(this.l, ((File)object0), null);
                this.k = 3;
                return i.h(h0.e(), archiveMainActivity$e$b0, this) == object1 ? object1 : S0.a;
            }
        }

        if(this.x != null && this.x.isActive()) {
            return;
        }
        if(cl.i(this, this)) {
            this.w = v;
            return;
        }
        this.x = k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.archive.main.ArchiveMainActivity.e(this, v1, s, o0, null), 2, null);
    }

    private final String f2(String s, boolean z) {
        A0 a00 = this.C;
        if(a00 == null) {
            return null;
        }
        String s1 = a00.S5();
        int v = a00.V5();
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").authority("m.dcinside.com").appendPath("voice").appendPath("share").appendQueryParameter("vr", s).appendQueryParameter("id", s1).appendQueryParameter("no", String.valueOf(v)).appendQueryParameter("type", (z ? "w" : "r"));
        switch(m.d.b(s1)) {
            case 1: {
                uri$Builder0.appendQueryParameter("_GALLTYPE_", "MI");
                return uri$Builder0.toString();
            }
            case 2: {
                uri$Builder0.appendQueryParameter("_GALLTYPE_", "P");
                return uri$Builder0.toString();
            }
            default: {
                return uri$Builder0.toString();
            }
        }
    }

    private final void g2() {
        static final class com.dcinside.app.archive.main.ArchiveMainActivity.f extends N implements Function1 {
            final ArchiveMainActivity e;

            com.dcinside.app.archive.main.ArchiveMainActivity.f(ArchiveMainActivity archiveMainActivity0) {
                this.e = archiveMainActivity0;
                super(1);
            }

            public final void a(q0 q00) {
                L.m(q00);
                this.e.p2(q00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((q0)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.archive.main.ArchiveMainActivity.g extends N implements Function1 {
            final ArchiveMainActivity e;

            com.dcinside.app.archive.main.ArchiveMainActivity.g(ArchiveMainActivity archiveMainActivity0) {
                this.e = archiveMainActivity0;
                super(1);
            }

            public final void a(t0 t00) {
                L.m(t00);
                this.e.n2(t00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((t0)object0));
                return S0.a;
            }
        }


        static final class h extends N implements Function1 {
            final ArchiveMainActivity e;

            h(ArchiveMainActivity archiveMainActivity0) {
                this.e = archiveMainActivity0;
                super(1);
            }

            public final void a(u0 u00) {
                L.m(u00);
                this.e.o2(u00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((u0)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.archive.main.ArchiveMainActivity.i extends N implements Function1 {
            final ArchiveMainActivity e;

            com.dcinside.app.archive.main.ArchiveMainActivity.i(ArchiveMainActivity archiveMainActivity0) {
                this.e = archiveMainActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.s0 s00) {
                L.m(s00);
                this.e.m2(s00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.s0)object0));
                return S0.a;
            }
        }

        o o0 = com.dcinside.app.rx.bus.c.c(this, q0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.archive.main.ArchiveMainActivity.f(this), "$tmp0");
            new com.dcinside.app.archive.main.ArchiveMainActivity.f(this).invoke(object0);
        });
        b b0 = this.z;
        if(b0 != null) {
            b0.a(o0);
        }
        o o1 = com.dcinside.app.rx.bus.c.c(this, t0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.archive.main.ArchiveMainActivity.g(this), "$tmp0");
            new com.dcinside.app.archive.main.ArchiveMainActivity.g(this).invoke(object0);
        });
        b b1 = this.z;
        if(b1 != null) {
            b1.a(o1);
        }
        o o2 = com.dcinside.app.rx.bus.c.c(this, u0.class).x5((Object object0) -> {
            L.p(new h(this), "$tmp0");
            new h(this).invoke(object0);
        });
        b b2 = this.z;
        if(b2 != null) {
            b2.a(o2);
        }
        o o3 = com.dcinside.app.rx.bus.c.c(this, com.dcinside.app.rx.bus.s0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.archive.main.ArchiveMainActivity.i(this), "$tmp0");
            new com.dcinside.app.archive.main.ArchiveMainActivity.i(this).invoke(object0);
        });
        b b3 = this.z;
        if(b3 != null) {
            b3.a(o3);
        }
    }

    // 检测为 Lambda 实现
    private static final void h2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void i2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void j2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k2(Function1 function10, Object object0) [...]

    private final void l2() {
        this.startActivity(new Intent(this, BackupActivity.class));
    }

    private final void m2(com.dcinside.app.rx.bus.s0 s00) {
        this.C = s00.a();
    }

    private final void n2(t0 t00) {
        Dialog dialog0 = this.D;
        if(dialog0 != null) {
            dialog0.dismiss();
        }
        T0 t01 = new T0(this, t00.a(), t00.b());
        t01.show();
        this.D = t01;
    }

    private final void o2(u0 u00) {
        Dialog dialog0 = this.D;
        if(dialog0 != null) {
            dialog0.dismiss();
        }
        switch(u00.a()) {
            case 0: {
                this.u2();
                return;
            }
            case 1: {
                this.t2(u00.b(), u00.c());
            }
        }
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        d d0 = this.B;
        if(d0 == null) {
            L.S("binding");
            d0 = null;
        }
        L.m(d0.b);
        Fragment fragment0 = fragmentManager0.s0(s.l(d0.b, d0.b.getCurrentItem()));
        if(fragment0 instanceof com.dcinside.app.archive.page.e) {
            switch(((com.dcinside.app.archive.page.e)fragment0).A0()) {
                case 0: {
                    super.onBackPressed();
                    return;
                }
                case 2: {
                    ((com.dcinside.app.archive.page.e)fragment0).K0();
                    return;
                }
                default: {
                    ((com.dcinside.app.archive.page.e)fragment0).G0();
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@y4.m Bundle bundle0) {
        public static final class j implements com.google.android.material.tabs.TabLayout.f {
            @Override  // com.google.android.material.tabs.TabLayout$c
            public void N(@l com.google.android.material.tabs.TabLayout.i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void R(@l com.google.android.material.tabs.TabLayout.i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void j(@l com.google.android.material.tabs.TabLayout.i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
                ll.g0(tabLayout$i0.k());
            }
        }

        super.onCreate(bundle0);
        d d0 = d.c(this.getLayoutInflater());
        L.o(d0, "inflate(...)");
        this.B = d0;
        d d1 = null;
        if(d0 == null) {
            L.S("binding");
            d0 = null;
        }
        this.setContentView(d0.b());
        d d2 = this.B;
        if(d2 == null) {
            L.S("binding");
            d2 = null;
        }
        this.S0(d2.f);
        kr.bhbfhfb.designcompat.a.d(this);
        d d3 = this.B;
        if(d3 == null) {
            L.S("binding");
            d3 = null;
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        com.dcinside.app.archive.main.h h0 = new com.dcinside.app.archive.main.h(fragmentManager0, false);
        d3.b.setAdapter(h0);
        d d4 = this.B;
        if(d4 == null) {
            L.S("binding");
            d4 = null;
        }
        TabLayout tabLayout0 = d4.d;
        d d5 = this.B;
        if(d5 == null) {
            L.S("binding");
            d5 = null;
        }
        tabLayout0.setupWithViewPager(d5.b);
        d d6 = this.B;
        if(d6 == null) {
            L.S("binding");
            d6 = null;
        }
        j archiveMainActivity$j0 = new j();
        d6.d.h(archiveMainActivity$j0);
        d d7 = this.B;
        if(d7 == null) {
            L.S("binding");
        }
        else {
            d1 = d7;
        }
        int v = ll.m();
        d1.b.setCurrentItem(v);
        this.g2();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100000, menu0);  // mipmap:gall_base_icon
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        L4 l40 = this.A;
        if(l40 != null) {
            l40.dismissAllowingStateLoss();
        }
        super.onDestroy();
        try {
            I0 i00 = this.x;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.x = null;
        b b0 = this.z;
        if(b0 != null) {
            b0.l();
        }
        o o0 = this.y;
        if(o0 != null) {
            o0.l();
        }
        this.z = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B004C: {  // id:action_backup_export_post
                this.q2();
                return true;
            }
            case 0x7F0B004D: {  // id:action_backup_export_voice
                this.r2();
                return true;
            }
            case 0x7F0B004E: {  // id:action_backup_n_restore
                this.l2();
                return true;
            }
            case 0x7F0B0071: {  // id:action_search
                this.startActivity(new Intent(this, ArchiveSearchActivity.class));
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@y4.m PermissionDeniedResponse permissionDeniedResponse0) {
        String s = permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName();
        Dl.D(Application.e.c(), cl.b(s));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@y4.m PermissionGrantedResponse permissionGrantedResponse0) {
        String s = permissionGrantedResponse0 == null ? null : permissionGrantedResponse0.getPermissionName();
        Dl.D(Application.e.c(), cl.c(s));
        switch(this.w) {
            case 0x73: {
                this.q2();
                return;
            }
            case 0x74: {
                this.r2();
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @y4.m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    private final void p2(q0 q00) {
        if(q00.b() == 2) {
            Object[] arr_object = q00.a();
            if(arr_object.length != 0) {
                Object object0 = arr_object[0];
                if(object0 instanceof String) {
                    L.n(object0, "null cannot be cast to non-null type kotlin.String");
                    this.b2(((String)object0));
                }
            }
        }
    }

    private final void q2() {
        @f(c = "com.dcinside.app.archive.main.ArchiveMainActivity$onExportPost$1", f = "ArchiveMainActivity.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.main.ArchiveMainActivity.k extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            Object l;
            final ArchiveMainActivity m;
            final String n;

            com.dcinside.app.archive.main.ArchiveMainActivity.k(ArchiveMainActivity archiveMainActivity0, String s, kotlin.coroutines.d d0) {
                this.m = archiveMainActivity0;
                this.n = s;
                super(2, d0);
            }

            @y4.m
            public final Object a(@l Writer writer0, @y4.m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.archive.main.ArchiveMainActivity.k)this.create(writer0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.archive.main.ArchiveMainActivity.k(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Writer)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return com.dcinside.app.backup.process.h.e.a(this.m, this.n, ((Writer)this.l), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        F0 f00 = this.F1();
        if(f00 == null) {
            return;
        }
        RealmQuery realmQuery0 = f00.C4(d0.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        if(realmQuery0.N() == 0L) {
            return;
        }
        LocalDateTime localDateTime0 = LocalDateTime.now();
        L.o(localDateTime0, "now(...)");
        String s = Bk.a.d(localDateTime0);
        this.e2(0x73, 0x7F1502EB, s, new com.dcinside.app.archive.main.ArchiveMainActivity.k(this, s, null));  // string:export_post_file_name "dc_contents_%1$s.html"
    }

    private final void r2() {
        @f(c = "com.dcinside.app.archive.main.ArchiveMainActivity$onExportVoice$1", f = "ArchiveMainActivity.kt", i = {}, l = {390}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.main.ArchiveMainActivity.l extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            Object l;
            final ArchiveMainActivity m;
            final String n;

            com.dcinside.app.archive.main.ArchiveMainActivity.l(ArchiveMainActivity archiveMainActivity0, String s, kotlin.coroutines.d d0) {
                this.m = archiveMainActivity0;
                this.n = s;
                super(2, d0);
            }

            @y4.m
            public final Object a(@l Writer writer0, @y4.m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.archive.main.ArchiveMainActivity.l)this.create(writer0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.archive.main.ArchiveMainActivity.l(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Writer)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return com.dcinside.app.backup.process.h.e.b(this.m, this.n, ((Writer)this.l), this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        F0 f00 = this.F1();
        if(f00 == null) {
            return;
        }
        RealmQuery realmQuery0 = f00.C4(A0.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        if(realmQuery0.N() == 0L) {
            return;
        }
        LocalDateTime localDateTime0 = LocalDateTime.now();
        L.o(localDateTime0, "now(...)");
        String s = Bk.a.d(localDateTime0);
        this.e2(0x74, 0x7F1502EE, s, new com.dcinside.app.archive.main.ArchiveMainActivity.l(this, s, null));  // string:export_voice_file_name "dc_voice_%1$s.html"
    }

    private final void s2(boolean z) {
        @s0({"SMAP\nArchiveMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveMainActivity.kt\ncom/dcinside/app/archive/main/ArchiveMainActivity$setProgress$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,416:1\n257#2,2:417\n*S KotlinDebug\n*F\n+ 1 ArchiveMainActivity.kt\ncom/dcinside/app/archive/main/ArchiveMainActivity$setProgress$1\n*L\n253#1:417,2\n*E\n"})
        public static final class com.dcinside.app.archive.main.ArchiveMainActivity.m extends AnimatorListenerAdapter {
            final ArchiveMainActivity a;

            com.dcinside.app.archive.main.ArchiveMainActivity.m(ArchiveMainActivity archiveMainActivity0) {
                this.a = archiveMainActivity0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(@l Animator animator0) {
                L.p(animator0, "animation");
                d d0 = this.a.B;
                if(d0 == null) {
                    L.S("binding");
                    d0 = null;
                }
                L.o(d0.c, "postArchiveProgress");
                d0.c.setVisibility(8);
            }
        }

        d d0 = null;
        if(z) {
            d d1 = this.B;
            if(d1 == null) {
                L.S("binding");
                d1 = null;
            }
            d1.c.animate().cancel();
            d d2 = this.B;
            if(d2 == null) {
                L.S("binding");
                d2 = null;
            }
            L.o(d2.c, "postArchiveProgress");
            d2.c.setVisibility(0);
            d d3 = this.B;
            if(d3 == null) {
                L.S("binding");
                d3 = null;
            }
            d3.c.animate().alpha(1.0f).setListener(null);
            return;
        }
        d d4 = this.B;
        if(d4 == null) {
            L.S("binding");
            d4 = null;
        }
        L.o(d4.c, "postArchiveProgress");
        if(d4.c.getVisibility() == 0) {
            d d5 = this.B;
            if(d5 == null) {
                L.S("binding");
                d5 = null;
            }
            d5.c.animate().cancel();
            d d6 = this.B;
            if(d6 == null) {
                L.S("binding");
                d6 = null;
            }
            d6.c.setAlpha(1.0f);
            d d7 = this.B;
            if(d7 == null) {
                L.S("binding");
            }
            else {
                d0 = d7;
            }
            d0.c.animate().alpha(0.0f).setListener(new com.dcinside.app.archive.main.ArchiveMainActivity.m(this));
            return;
        }
        d d8 = this.B;
        if(d8 == null) {
            L.S("binding");
            d8 = null;
        }
        d8.c.animate().cancel();
        d d9 = this.B;
        if(d9 == null) {
            L.S("binding");
            d9 = null;
        }
        d9.c.setAlpha(0.0f);
        d d10 = this.B;
        if(d10 == null) {
            L.S("binding");
        }
        else {
            d0 = d10;
        }
        L.o(d0.c, "postArchiveProgress");
        d0.c.setVisibility(8);
    }

    private final void t2(String s, boolean z) {
        String s1 = this.f2(s, z);
        if(s1 == null) {
            return;
        }
        try {
            Intent intent0 = new Intent("android.intent.action.SEND");
            intent0.setType("text/plain");
            intent0.putExtra("android.intent.extra.TEXT", s1);
            intent0.setPackage("com.kakao.talk");
            this.startActivity(intent0);
        }
        catch(Exception unused_ex) {
            Dl.r("com.kakao.talk");
        }
    }

    private final void u2() {
        A0 a00 = this.C;
        if(a00 == null) {
            return;
        }
        String s = a00.S5();
        m m0 = m.d.b(s);
        Clipboards clipboards0 = Clipboards.a;
        String s1 = a00.X5();
        if(s1 == null) {
            s1 = "";
        }
        String s2 = uk.TG(a00.S5(), a00.V5(), m0);
        L.o(s2, "url(...)");
        clipboards0.b(0x7F15021E, s1, s2);  // string:copy_post_url_to_clipboard "URL이 복사되었습니다."
    }

    private final void v2(File file0) {
        String s = Fk.i(file0.getPath());
        String s1 = Build.VERSION.SDK_INT < 29 ? this.getString(0x7F1502EC, new Object[]{s}) : "/내장 메모리/Download/dcinside 폴더에 저장 완료";  // string:export_success "%1$s 폴더에 저장 완료"
        L.m(s1);
        Dl.H(this, s1, 1);
    }

    private final void w2(l0 l00) {
        L4 l40 = this.A;
        if(l40 != null) {
            l40.dismissAllowingStateLoss();
        }
        V[] arr_v = {r0.a("com.dcinside.app_voice_download_subject", l00.e()), r0.a("com.dcinside.app_voice_download_nickname", l00.c()), r0.a("com.dcinside.app_voice_download_album", l00.d()), r0.a("com.dcinside.app_voice_download_link", l00.b())};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = L4.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.post.fragments.L4");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.post.fragments.VoiceDownloadFragment");
        }
        ((L4)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 4))));
        ((L4)fragment0).show(fragmentManager0, "com.dcinside.app.post.fragments.L4");
        this.A = (L4)fragment0;
    }
}

