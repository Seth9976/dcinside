package com.dcinside.app.read;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.t;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.c;
import com.dcinside.app.realm.d0;
import com.dcinside.app.rx.bus.w0;
import com.dcinside.app.util.Dl;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import io.realm.X0;
import io.realm.d1;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.X;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,536:1\n147#2:537\n112#3,3:538\n129#3,3:542\n132#3,12:548\n116#3:560\n129#3,15:561\n192#3,7:576\n177#3,9:583\n177#3,9:592\n1#4:541\n1#4:547\n37#5:545\n37#5:546\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager\n*L\n40#1:537\n140#1:538,3\n140#1:542,3\n140#1:548,12\n140#1:560\n140#1:561,15\n355#1:576,7\n492#1:583,9\n494#1:592,9\n140#1:541\n143#1:545\n151#1:546\n*E\n"})
public final class ArchiveQuickManager implements LifecycleObserver {
    @s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$AutoDismiss\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,536:1\n147#2:537\n142#2:538\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$AutoDismiss\n*L\n513#1:537\n513#1:538\n*E\n"})
    public static final class a extends OnScrollListener {
        @l
        private final t a;

        public a(@m Activity activity0) {
            d d0 = activity0 instanceof d ? ((d)activity0) : null;
            this.a = d0 == null ? new t(null) : new t(d0);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
        public void onScrollStateChanged(@l RecyclerView recyclerView0, int v) {
            L.p(recyclerView0, "recyclerView");
            if(v == 1) {
                d d0 = (d)this.a.a();
                if(d0 != null) {
                    ArchiveQuickManager archiveQuickManager0 = d0.k1();
                    if(archiveQuickManager0 != null) {
                        archiveQuickManager0.A();
                    }
                }
            }
        }
    }

    @s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$Companion\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,536:1\n214#2:537\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$Companion\n*L\n526#1:537\n*E\n"})
    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0) {
            L.p(appCompatActivity0, "activity");
            FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
            L.o(fragmentManager0, "getSupportFragmentManager(...)");
            Fragment fragment0 = appCompatActivity0.getSupportFragmentManager().s0("com.dcinside.app.archive.quick.d");
            if(!(fragment0 instanceof com.dcinside.app.archive.quick.d)) {
                fragment0 = null;
            }
            Fragment fragment1 = fragmentManager0.r0(0x7F0B0145);  // id:archive_quick_place
            FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
            L.o(fragmentTransaction0, "beginTransaction(...)");
            if(((com.dcinside.app.archive.quick.d)fragment0) != null) {
                fragmentTransaction0.B(((com.dcinside.app.archive.quick.d)fragment0));
            }
            if(fragment1 != null) {
                fragmentTransaction0.B(fragment1);
            }
            fragmentTransaction0.q();
        }
    }

    @l
    private final t a;
    private int b;
    @l
    private List c;
    @m
    private I0 d;
    @m
    private I0 e;
    @m
    private AlertDialog f;
    @l
    public static final b g;

    static {
        ArchiveQuickManager.g = new b(null);
    }

    public ArchiveQuickManager(@l AppCompatActivity appCompatActivity0) {
        L.p(appCompatActivity0, "activity");
        super();
        this.a = new t(appCompatActivity0);
        appCompatActivity0.getLifecycle().a(this);
        this.c = u.H();
    }

    private final boolean A() {
        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.a.a();
        if(appCompatActivity0 == null) {
            return false;
        }
        FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        Fragment fragment0 = fragmentManager0.r0(0x7F0B0145);  // id:archive_quick_place
        if(fragment0 != null) {
            fragmentManager0.u().B(fragment0).q();
            return true;
        }
        return false;
    }

    public final void B(@l AppCompatActivity appCompatActivity0, long v) {
        L.p(appCompatActivity0, "activity");
        V[] arr_v = {r0.a("com.dcinside.app.extra.FOLDER_KEY", v), r0.a("com.dcinside.app.extra.ARCHIVE_TYPE", this.b)};
        FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = com.dcinside.app.archive.quick.d.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.archive.quick.d");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.archive.quick.ArchiveChangeDialogFragment");
        }
        ((com.dcinside.app.archive.quick.d)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 2))));
        ((com.dcinside.app.archive.quick.d)fragment0).show(fragmentManager0, "com.dcinside.app.archive.quick.d");
    }

    private final c C(F0 f00, int v, long v1) {
        c c0 = v1 >= 0L ? com.dcinside.app.realm.d.f.b(f00, v1) : ((c)u.G2(com.dcinside.app.realm.d.f.d(f00, v, 1L)));
        return c0 == null ? com.dcinside.app.realm.d.f.a(f00, v, null) : c0;
    }

    public final boolean D() {
        return this.A();
    }

    private final void E(AppCompatActivity appCompatActivity0) {
        static final class g extends N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F1500D6);  // string:archive_change_already_post "이미 저장된 글입니다. 보관함에서 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class h extends N implements Function1 {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class i extends N implements Function1 {
            final ArchiveQuickManager e;

            i(ArchiveQuickManager archiveQuickManager0) {
                this.e = archiveQuickManager0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertPost$3$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$onDeleteAlertPost$3$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,536:1\n112#2,3:537\n129#2,15:541\n116#2:556\n129#2,15:557\n1#3:540\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$onDeleteAlertPost$3$1\n*L\n219#1:537,3\n219#1:541,15\n219#1:556\n219#1:557,15\n219#1:540\n*E\n"})
                static final class com.dcinside.app.read.ArchiveQuickManager.i.a extends o implements Function1 {
                    int k;
                    final ArchiveQuickManager l;

                    com.dcinside.app.read.ArchiveQuickManager.i.a(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        super(1, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.i.a(this.l, d0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((kotlin.coroutines.d)object0));
                    }

                    @m
                    public final Object invoke(@m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.i.a)this.create(d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        List list0 = this.l.c;
                        List list1 = u.H();
                        this.l.c = list1;
                        F0 f00 = F0.g4();
                        L.m(f00);
                        if(f00.E0()) {
                            goto label_27;
                        }
                        else {
                            f00.beginTransaction();
                            goto label_9;
                        }
                        goto label_46;
                        try {
                        label_9:
                            for(Object object1: list0) {
                                d1 d10 = (d1)object1;
                                if(d10 instanceof d0) {
                                    String s = ((d0)d10).U5();
                                    if(s != null) {
                                        int v = ((d0)d10).X5();
                                        d0 d00 = com.dcinside.app.realm.helper.a.a.h(f00, s, v);
                                        if(d00 != null) {
                                            d00.z5();
                                        }
                                    }
                                }
                            }
                            f00.p();
                            goto label_46;
                        }
                        catch(Throwable throwable1) {
                        }
                        if(f00.E0()) {
                            f00.e();
                        }
                        throw throwable1;
                        try {
                        label_27:
                            Iterator iterator1 = list0.iterator();
                            while(true) {
                                if(!iterator1.hasNext()) {
                                    goto label_46;
                                }
                                Object object2 = iterator1.next();
                                d1 d11 = (d1)object2;
                                if(d11 instanceof d0) {
                                    String s1 = ((d0)d11).U5();
                                    if(s1 != null) {
                                        int v1 = ((d0)d11).X5();
                                        d0 d01 = com.dcinside.app.realm.helper.a.a.h(f00, s1, v1);
                                        if(d01 != null) {
                                            d01.z5();
                                        }
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable2) {
                        }
                        try {
                            throw throwable2;
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            throw throwable0;
                        }
                        catch(Throwable throwable3) {
                            kotlin.io.c.a(f00, throwable0);
                            throw throwable3;
                        }
                    label_46:
                        kotlin.io.c.a(f00, null);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertPost$3$2", f = "ArchiveQuickManager.kt", i = {}, l = {0xE7}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.i.b extends o implements A3.o {
                    int k;
                    final ArchiveQuickManager l;

                    com.dcinside.app.read.ArchiveQuickManager.i.b(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l S0 s00, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.i.b)this.create(s00, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.i.b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((S0)object0), ((kotlin.coroutines.d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertPost$3$2$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.read.ArchiveQuickManager.i.b.a extends o implements A3.o {
                            int k;
                            final ArchiveQuickManager l;

                            com.dcinside.app.read.ArchiveQuickManager.i.b.a(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                                this.l = archiveQuickManager0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.read.ArchiveQuickManager.i.b.a(this.l, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.read.ArchiveQuickManager.i.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                                if(appCompatActivity0 == null) {
                                    return S0.a;
                                }
                                Dl.D(appCompatActivity0, 0x7F1500D8);  // string:archive_change_deleted "보관함에서 삭제되었습니다."
                                com.dcinside.app.rx.bus.c.a(appCompatActivity0, new com.dcinside.app.rx.bus.g());
                                return S0.a;
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                com.dcinside.app.read.ArchiveQuickManager.i.b.a archiveQuickManager$i$b$a0 = new com.dcinside.app.read.ArchiveQuickManager.i.b.a(this.l, null);
                                this.k = 1;
                                return kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$i$b$a0, this) == object1 ? object1 : S0.a;
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


                @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertPost$3$3", f = "ArchiveQuickManager.kt", i = {}, l = {0xEF}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.i.c extends o implements A3.o {
                    int k;
                    Object l;
                    final ArchiveQuickManager m;

                    com.dcinside.app.read.ArchiveQuickManager.i.c(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                        this.m = archiveQuickManager0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l Throwable throwable0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.i.c)this.create(throwable0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.read.ArchiveQuickManager.i.c(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((Throwable)object0), ((kotlin.coroutines.d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertPost$3$3$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.read.ArchiveQuickManager.i.c.a extends o implements A3.o {
                            int k;
                            final ArchiveQuickManager l;
                            final Throwable m;

                            com.dcinside.app.read.ArchiveQuickManager.i.c.a(ArchiveQuickManager archiveQuickManager0, Throwable throwable0, kotlin.coroutines.d d0) {
                                this.l = archiveQuickManager0;
                                this.m = throwable0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.read.ArchiveQuickManager.i.c.a(this.l, this.m, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.read.ArchiveQuickManager.i.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                                if(appCompatActivity0 == null) {
                                    return S0.a;
                                }
                                Dl.G(appCompatActivity0, this.m.getMessage());
                                return S0.a;
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                com.dcinside.app.read.ArchiveQuickManager.i.c.a archiveQuickManager$i$c$a0 = new com.dcinside.app.read.ArchiveQuickManager.i.c.a(this.m, ((Throwable)this.l), null);
                                this.k = 1;
                                return kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$i$c$a0, this) == object1 ? object1 : S0.a;
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

                com.dcinside.app.read.ArchiveQuickManager.i.a archiveQuickManager$i$a0 = new com.dcinside.app.read.ArchiveQuickManager.i.a(this.e, null);
                com.dcinside.app.read.ArchiveQuickManager.i.b archiveQuickManager$i$b0 = new com.dcinside.app.read.ArchiveQuickManager.i.b(this.e, null);
                com.dcinside.app.read.ArchiveQuickManager.i.c archiveQuickManager$i$c0 = new com.dcinside.app.read.ArchiveQuickManager.i.c(this.e, null);
                I0 i00 = this.e.y(archiveQuickManager$i$a0, archiveQuickManager$i$b0, archiveQuickManager$i$c0);
                this.e.d = i00;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        if(this.c.isEmpty()) {
            return;
        }
        e.e.a(appCompatActivity0).n(g.e).z(0x7F150270).x(0x1040000).b().Z1((Object object0) -> {
            L.p(h.e, "$tmp0");
            return (Boolean)h.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new i(this), "$tmp0");
            new i(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean F(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void G(Function1 function10, Object object0) [...]

    private final void H(AppCompatActivity appCompatActivity0) {
        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F1500D7);  // string:archive_change_already_voice "이미 저장된 보이스입니다. 보관함에서 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class k extends N implements Function1 {
            public static final k e;

            static {
                k.e = new k();
            }

            k() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.read.ArchiveQuickManager.l extends N implements Function1 {
            final ArchiveQuickManager e;

            com.dcinside.app.read.ArchiveQuickManager.l(ArchiveQuickManager archiveQuickManager0) {
                this.e = archiveQuickManager0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertVoice$3$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$onDeleteAlertVoice$3$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,536:1\n112#2,3:537\n129#2,15:541\n116#2:556\n129#2,15:557\n1#3:540\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$onDeleteAlertVoice$3$1\n*L\n259#1:537,3\n259#1:541,15\n259#1:556\n259#1:557,15\n259#1:540\n*E\n"})
                static final class com.dcinside.app.read.ArchiveQuickManager.l.a extends o implements Function1 {
                    int k;
                    final ArchiveQuickManager l;

                    com.dcinside.app.read.ArchiveQuickManager.l.a(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        super(1, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.l.a(this.l, d0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((kotlin.coroutines.d)object0));
                    }

                    @m
                    public final Object invoke(@m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.l.a)this.create(d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        List list0 = this.l.c;
                        List list1 = u.H();
                        this.l.c = list1;
                        F0 f00 = F0.g4();
                        L.m(f00);
                        if(f00.E0()) {
                            goto label_26;
                        }
                        else {
                            f00.beginTransaction();
                            goto label_9;
                        }
                        goto label_44;
                        try {
                        label_9:
                            for(Object object1: list0) {
                                d1 d10 = (d1)object1;
                                if(d10 instanceof A0) {
                                    String s = ((A0)d10).W5();
                                    if(s != null) {
                                        A0 a00 = com.dcinside.app.realm.helper.a.a.i(f00, s);
                                        if(a00 != null) {
                                            a00.z5();
                                        }
                                    }
                                }
                            }
                            f00.p();
                            goto label_44;
                        }
                        catch(Throwable throwable1) {
                        }
                        if(f00.E0()) {
                            f00.e();
                        }
                        throw throwable1;
                        try {
                        label_26:
                            Iterator iterator1 = list0.iterator();
                            while(true) {
                                if(!iterator1.hasNext()) {
                                    goto label_44;
                                }
                                Object object2 = iterator1.next();
                                d1 d11 = (d1)object2;
                                if(d11 instanceof A0) {
                                    String s1 = ((A0)d11).W5();
                                    if(s1 != null) {
                                        A0 a01 = com.dcinside.app.realm.helper.a.a.i(f00, s1);
                                        if(a01 != null) {
                                            a01.z5();
                                        }
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable2) {
                        }
                        try {
                            throw throwable2;
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            throw throwable0;
                        }
                        catch(Throwable throwable3) {
                            kotlin.io.c.a(f00, throwable0);
                            throw throwable3;
                        }
                    label_44:
                        kotlin.io.c.a(f00, null);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertVoice$3$2", f = "ArchiveQuickManager.kt", i = {}, l = {0x10F}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.l.b extends o implements A3.o {
                    int k;
                    final ArchiveQuickManager l;

                    com.dcinside.app.read.ArchiveQuickManager.l.b(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l S0 s00, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.l.b)this.create(s00, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.l.b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((S0)object0), ((kotlin.coroutines.d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertVoice$3$2$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.read.ArchiveQuickManager.l.b.a extends o implements A3.o {
                            int k;
                            final ArchiveQuickManager l;

                            com.dcinside.app.read.ArchiveQuickManager.l.b.a(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                                this.l = archiveQuickManager0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.read.ArchiveQuickManager.l.b.a(this.l, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.read.ArchiveQuickManager.l.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                                if(appCompatActivity0 == null) {
                                    return S0.a;
                                }
                                Dl.D(appCompatActivity0, 0x7F1500D8);  // string:archive_change_deleted "보관함에서 삭제되었습니다."
                                com.dcinside.app.rx.bus.c.a(appCompatActivity0, new com.dcinside.app.rx.bus.g());
                                return S0.a;
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                com.dcinside.app.read.ArchiveQuickManager.l.b.a archiveQuickManager$l$b$a0 = new com.dcinside.app.read.ArchiveQuickManager.l.b.a(this.l, null);
                                this.k = 1;
                                return kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$l$b$a0, this) == object1 ? object1 : S0.a;
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


                @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertVoice$3$3", f = "ArchiveQuickManager.kt", i = {}, l = {279}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.l.c extends o implements A3.o {
                    int k;
                    Object l;
                    final ArchiveQuickManager m;

                    com.dcinside.app.read.ArchiveQuickManager.l.c(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                        this.m = archiveQuickManager0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l Throwable throwable0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.l.c)this.create(throwable0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.read.ArchiveQuickManager.l.c(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((Throwable)object0), ((kotlin.coroutines.d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        @f(c = "com.dcinside.app.read.ArchiveQuickManager$onDeleteAlertVoice$3$3$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.read.ArchiveQuickManager.l.c.a extends o implements A3.o {
                            int k;
                            final ArchiveQuickManager l;
                            final Throwable m;

                            com.dcinside.app.read.ArchiveQuickManager.l.c.a(ArchiveQuickManager archiveQuickManager0, Throwable throwable0, kotlin.coroutines.d d0) {
                                this.l = archiveQuickManager0;
                                this.m = throwable0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.read.ArchiveQuickManager.l.c.a(this.l, this.m, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.read.ArchiveQuickManager.l.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                                if(appCompatActivity0 == null) {
                                    return S0.a;
                                }
                                Dl.G(appCompatActivity0, this.m.getMessage());
                                return S0.a;
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                com.dcinside.app.read.ArchiveQuickManager.l.c.a archiveQuickManager$l$c$a0 = new com.dcinside.app.read.ArchiveQuickManager.l.c.a(this.m, ((Throwable)this.l), null);
                                this.k = 1;
                                return kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$l$c$a0, this) == object1 ? object1 : S0.a;
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

                com.dcinside.app.read.ArchiveQuickManager.l.a archiveQuickManager$l$a0 = new com.dcinside.app.read.ArchiveQuickManager.l.a(this.e, null);
                com.dcinside.app.read.ArchiveQuickManager.l.b archiveQuickManager$l$b0 = new com.dcinside.app.read.ArchiveQuickManager.l.b(this.e, null);
                com.dcinside.app.read.ArchiveQuickManager.l.c archiveQuickManager$l$c0 = new com.dcinside.app.read.ArchiveQuickManager.l.c(this.e, null);
                I0 i00 = this.e.y(archiveQuickManager$l$a0, archiveQuickManager$l$b0, archiveQuickManager$l$c0);
                this.e.d = i00;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        if(this.c.isEmpty()) {
            return;
        }
        e.e.a(appCompatActivity0).n(j.e).z(0x7F150270).x(0x1040000).b().Z1((Object object0) -> {
            L.p(k.e, "$tmp0");
            return (Boolean)k.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.read.ArchiveQuickManager.l(this), "$tmp0");
            new com.dcinside.app.read.ArchiveQuickManager.l(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean I(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void J(Function1 function10, Object object0) [...]

    private final Object K(int v, d1 d10, boolean z, kotlin.coroutines.d d0) {
        @f(c = "com.dcinside.app.read.ArchiveQuickManager$onQuickAfter$3", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$onQuickAfter$3\n+ 2 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager\n*L\n1#1,536:1\n500#2,10:537\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$onQuickAfter$3\n*L\n175#1:537,10\n*E\n"})
        static final class com.dcinside.app.read.ArchiveQuickManager.m extends o implements A3.o {
            int k;
            final ArchiveQuickManager l;
            final boolean m;
            final int n;
            final d1 o;

            com.dcinside.app.read.ArchiveQuickManager.m(ArchiveQuickManager archiveQuickManager0, boolean z, int v, d1 d10, kotlin.coroutines.d d0) {
                this.l = archiveQuickManager0;
                this.m = z;
                this.n = v;
                this.o = d10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.ArchiveQuickManager.m(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.ArchiveQuickManager.m)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                if(appCompatActivity0 == null) {
                    return S0.a;
                }
                if(this.m) {
                    V[] arr_v = {r0.a("com.dcinside.app.extra.ARCHIVE_TYPE", kotlin.coroutines.jvm.internal.b.f(this.n))};
                    FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
                    L.o(fragmentManager0, "getSupportFragmentManager(...)");
                    FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                    ClassLoader classLoader0 = com.dcinside.app.archive.quick.g.class.getClassLoader();
                    L.m(classLoader0);
                    Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.archive.quick.g");
                    if(fragment0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.archive.quick.ArchiveQuickFragment");
                    }
                    ((com.dcinside.app.archive.quick.g)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
                    fragmentManager0.u().M(0x7F010016, 0x7F010017).C(0x7F0B0145, ((com.dcinside.app.archive.quick.g)fragment0)).q();  // anim:archive_quick_enter
                    com.dcinside.app.rx.bus.c.a(appCompatActivity0, new com.dcinside.app.rx.bus.g());
                    return S0.a;
                }
                d1 d10 = this.o;
                if(d10 != null) {
                    if(d10 instanceof d0) {
                        this.l.E(appCompatActivity0);
                        return S0.a;
                    }
                    this.l.H(appCompatActivity0);
                }
                return S0.a;
            }
        }

        List list0;
        this.b = v;
        if(d10 == null) {
            list0 = u.H();
        }
        else {
            list0 = u.k(d10);
            if(list0 == null) {
                list0 = u.H();
            }
        }
        this.c = list0;
        Object object0 = kotlinx.coroutines.i.h(h0.e(), new com.dcinside.app.read.ArchiveQuickManager.m(this, z, v, d10, null), d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    private final V L(w0 w00) {
        V v2;
        V v1;
        V v0;
        Class class1;
        Class class0;
        F0 f00 = F0.g4();
        L.m(f00);
        boolean z = f00.E0();
        class0 = d0.class;
        class1 = A0.class;
        if(z) {
            goto label_31;
        }
        else {
            f00.beginTransaction();
            goto label_7;
        }
        goto label_57;
        try {
        label_7:
            switch(w00.a()) {
                case 0: {
                    RealmQuery realmQuery0 = f00.C4(class0);
                    L.o(realmQuery0, "this.where(T::class.java)");
                    if(realmQuery0.N() + 1L > 50000L) {
                        throw new com.dcinside.app.http.f(0x7F1500DE, new Object[]{50000});  // string:archive_change_max_limited_msg "보관함에는 최대 %1$d개의 글만 저장할 수 있습니다."
                    }
                    v0 = this.Q(f00, w00);
                    break;
                }
                case 1: {
                    RealmQuery realmQuery1 = f00.C4(class1);
                    L.o(realmQuery1, "this.where(T::class.java)");
                    if(realmQuery1.N() + 1L > 50000L) {
                        throw new com.dcinside.app.http.f(0x7F1500DE, new Object[]{50000});  // string:archive_change_max_limited_msg "보관함에는 최대 %1$d개의 글만 저장할 수 있습니다."
                    }
                    v0 = this.R(f00, w00);
                    break;
                }
                default: {
                    v0 = r0.a(null, Boolean.TRUE);
                }
            }
            d1 d10 = (d1)v0.a();
            Boolean boolean0 = (Boolean)v0.b();
            boolean0.booleanValue();
            v1 = r0.a((d10 == null ? null : ((d1)f00.d2(d10))), boolean0);
            f00.p();
            goto label_57;
        }
        catch(Throwable throwable1) {
        }
        if(f00.E0()) {
            f00.e();
        }
        throw throwable1;
        try {
        label_31:
            switch(w00.a()) {
                case 0: {
                    RealmQuery realmQuery2 = f00.C4(class0);
                    L.o(realmQuery2, "this.where(T::class.java)");
                    if(realmQuery2.N() + 1L > 50000L) {
                        throw new com.dcinside.app.http.f(0x7F1500DE, new Object[]{50000});  // string:archive_change_max_limited_msg "보관함에는 최대 %1$d개의 글만 저장할 수 있습니다."
                    }
                    v2 = this.Q(f00, w00);
                    break;
                }
                case 1: {
                    RealmQuery realmQuery3 = f00.C4(class1);
                    L.o(realmQuery3, "this.where(T::class.java)");
                    if(realmQuery3.N() + 1L > 50000L) {
                        throw new com.dcinside.app.http.f(0x7F1500DE, new Object[]{50000});  // string:archive_change_max_limited_msg "보관함에는 최대 %1$d개의 글만 저장할 수 있습니다."
                    }
                    v2 = this.R(f00, w00);
                    break;
                }
                default: {
                    v2 = r0.a(null, Boolean.TRUE);
                }
            }
            d1 d11 = (d1)v2.a();
            Boolean boolean1 = (Boolean)v2.b();
            boolean1.booleanValue();
            v1 = r0.a((d11 == null ? null : ((d1)f00.d2(d11))), boolean1);
            goto label_57;
        }
        catch(Throwable throwable2) {
        }
        try {
            throw throwable2;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable3) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable3;
        }
    label_57:
        kotlin.io.c.a(f00, null);
        return v1;
    }

    public final void M(@l w0 w00) {
        @f(c = "com.dcinside.app.read.ArchiveQuickManager$quick$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends o implements Function1 {
            int k;
            final ArchiveQuickManager l;
            final w0 m;

            n(ArchiveQuickManager archiveQuickManager0, w0 w00, kotlin.coroutines.d d0) {
                this.l = archiveQuickManager0;
                this.m = w00;
                super(1, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@l kotlin.coroutines.d d0) {
                return new n(this.l, this.m, d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((kotlin.coroutines.d)object0));
            }

            @m
            public final Object invoke(@m kotlin.coroutines.d d0) {
                return ((n)this.create(d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return this.l.L(this.m);
            }
        }


        @f(c = "com.dcinside.app.read.ArchiveQuickManager$quick$2", f = "ArchiveQuickManager.kt", i = {}, l = {0xC6}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.ArchiveQuickManager.o extends o implements A3.o {
            int k;
            Object l;
            final ArchiveQuickManager m;
            final int n;

            com.dcinside.app.read.ArchiveQuickManager.o(ArchiveQuickManager archiveQuickManager0, int v, kotlin.coroutines.d d0) {
                this.m = archiveQuickManager0;
                this.n = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.read.ArchiveQuickManager.o(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((V)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l V v0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.ArchiveQuickManager.o)this.create(v0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        V v0 = (V)this.l;
                        this.k = 1;
                        return this.m.K(this.n, ((d1)v0.a()), ((Boolean)v0.b()).booleanValue(), this) == object1 ? object1 : S0.a;
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


        @f(c = "com.dcinside.app.read.ArchiveQuickManager$quick$3", f = "ArchiveQuickManager.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
        static final class p extends o implements A3.o {
            int k;
            Object l;
            final ArchiveQuickManager m;

            p(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                this.m = archiveQuickManager0;
                super(2, d0);
            }

            @m
            public final Object a(@l Throwable throwable0, @m kotlin.coroutines.d d0) {
                return ((p)this.create(throwable0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new p(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Throwable)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.read.ArchiveQuickManager$quick$3$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.p.a extends o implements A3.o {
                    int k;
                    final ArchiveQuickManager l;
                    final Throwable m;

                    com.dcinside.app.read.ArchiveQuickManager.p.a(ArchiveQuickManager archiveQuickManager0, Throwable throwable0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        this.m = throwable0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.p.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.p.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                        if(appCompatActivity0 == null) {
                            return S0.a;
                        }
                        Dl.G(appCompatActivity0, this.m.getMessage());
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.read.ArchiveQuickManager.p.a archiveQuickManager$p$a0 = new com.dcinside.app.read.ArchiveQuickManager.p.a(this.m, ((Throwable)this.l), null);
                        this.k = 1;
                        return kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$p$a0, this) == object1 ? object1 : S0.a;
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

        L.p(w00, "event");
        if(this.d != null && this.d.isActive()) {
            return;
        }
        this.A();
        this.d = this.y(new n(this, w00, null), new com.dcinside.app.read.ArchiveQuickManager.o(this, w00.a(), null), new p(this, null));
    }

    public final void N(@l Function1 function10) {
        @f(c = "com.dcinside.app.read.ArchiveQuickManager$quickHistory$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$quickHistory$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,536:1\n112#2,3:537\n129#2,3:541\n132#2,12:549\n116#2:561\n129#2,15:562\n1#3:540\n37#4:544\n1557#5:545\n1628#5,3:546\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$quickHistory$1\n*L\n108#1:537,3\n108#1:541,3\n108#1:549,12\n108#1:561\n108#1:562,15\n108#1:540\n110#1:544\n115#1:545\n115#1:546,3\n*E\n"})
        static final class q extends o implements Function1 {
            int k;
            final Function1 l;
            final ArchiveQuickManager m;

            q(Function1 function10, ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                this.l = function10;
                this.m = archiveQuickManager0;
                super(1, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@l kotlin.coroutines.d d0) {
                return new q(this.l, this.m, d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((kotlin.coroutines.d)object0));
            }

            @m
            public final Object invoke(@m kotlin.coroutines.d d0) {
                return ((q)this.create(d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                List list0;
                Class class0;
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Function1 function10 = this.l;
                ArchiveQuickManager archiveQuickManager0 = this.m;
                F0 f00 = F0.g4();
                L.m(f00);
                boolean z = f00.E0();
                class0 = d0.class;
                if(z) {
                    goto label_32;
                }
                else {
                    f00.beginTransaction();
                    goto label_10;
                }
                goto label_56;
                try {
                label_10:
                    g1 g10 = (g1)function10.invoke(f00);
                    if(g10 == null) {
                        list0 = u.H();
                    }
                    else {
                        RealmQuery realmQuery0 = f00.C4(class0);
                        L.o(realmQuery0, "this.where(T::class.java)");
                        if(realmQuery0.N() + ((long)g10.size()) > 50000L) {
                            throw new com.dcinside.app.http.f(0x7F1500DE, new Object[]{kotlin.coroutines.jvm.internal.b.f(50000)});  // string:archive_change_max_limited_msg "보관함에는 최대 %1$d개의 글만 저장할 수 있습니다."
                        }
                        Iterable iterable0 = (List)archiveQuickManager0.P(f00, g10).b();
                        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
                        for(Object object1: iterable0) {
                            arrayList0.add(((d1)f00.d2(((d1)object1))));
                        }
                        list0 = arrayList0;
                    }
                    f00.p();
                    goto label_56;
                }
                catch(Throwable throwable1) {
                }
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable1;
                try {
                label_32:
                    g1 g11 = (g1)function10.invoke(f00);
                    if(g11 == null) {
                        list0 = u.H();
                    }
                    else {
                        RealmQuery realmQuery1 = f00.C4(class0);
                        L.o(realmQuery1, "this.where(T::class.java)");
                        if(realmQuery1.N() + ((long)g11.size()) > 50000L) {
                            throw new com.dcinside.app.http.f(0x7F1500DE, new Object[]{kotlin.coroutines.jvm.internal.b.f(50000)});  // string:archive_change_max_limited_msg "보관함에는 최대 %1$d개의 글만 저장할 수 있습니다."
                        }
                        Iterable iterable1 = (List)archiveQuickManager0.P(f00, g11).b();
                        ArrayList arrayList1 = new ArrayList(u.b0(iterable1, 10));
                        for(Object object2: iterable1) {
                            arrayList1.add(((d1)f00.d2(((d1)object2))));
                        }
                        list0 = arrayList1;
                    }
                    goto label_56;
                }
                catch(Throwable throwable2) {
                }
                try {
                    throw throwable2;
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable3) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable3;
                }
            label_56:
                kotlin.io.c.a(f00, null);
                return list0;
            }
        }


        @f(c = "com.dcinside.app.read.ArchiveQuickManager$quickHistory$2", f = "ArchiveQuickManager.kt", i = {}, l = {0x7A}, m = "invokeSuspend", n = {}, s = {})
        static final class r extends o implements A3.o {
            int k;
            Object l;
            final ArchiveQuickManager m;

            r(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                this.m = archiveQuickManager0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new r(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((List)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l List list0, @m kotlin.coroutines.d d0) {
                return ((r)this.create(list0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.read.ArchiveQuickManager$quickHistory$2$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$quickHistory$2$1\n+ 2 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager\n*L\n1#1,536:1\n500#2,10:537\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$quickHistory$2$1\n*L\n125#1:537,10\n*E\n"})
                static final class com.dcinside.app.read.ArchiveQuickManager.r.a extends o implements A3.o {
                    int k;
                    final ArchiveQuickManager l;

                    com.dcinside.app.read.ArchiveQuickManager.r.a(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.r.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.r.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                        if(appCompatActivity0 == null) {
                            return S0.a;
                        }
                        V[] arr_v = {r0.a("com.dcinside.app.extra.ARCHIVE_TYPE", kotlin.coroutines.jvm.internal.b.f(0))};
                        FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
                        L.o(fragmentManager0, "getSupportFragmentManager(...)");
                        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                        ClassLoader classLoader0 = com.dcinside.app.archive.quick.g.class.getClassLoader();
                        L.m(classLoader0);
                        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.archive.quick.g");
                        if(fragment0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.archive.quick.ArchiveQuickFragment");
                        }
                        ((com.dcinside.app.archive.quick.g)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
                        fragmentManager0.u().M(0x7F010016, 0x7F010017).C(0x7F0B0145, ((com.dcinside.app.archive.quick.g)fragment0)).q();  // anim:archive_quick_enter
                        com.dcinside.app.rx.bus.c.a(appCompatActivity0, new com.dcinside.app.rx.bus.g());
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        List list0 = (List)this.l;
                        this.m.b = 0;
                        this.m.c = list0;
                        if(!list0.isEmpty()) {
                            com.dcinside.app.read.ArchiveQuickManager.r.a archiveQuickManager$r$a0 = new com.dcinside.app.read.ArchiveQuickManager.r.a(this.m, null);
                            this.k = 1;
                            if(kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$r$a0, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
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


        @f(c = "com.dcinside.app.read.ArchiveQuickManager$quickHistory$3", f = "ArchiveQuickManager.kt", i = {}, l = {0x84}, m = "invokeSuspend", n = {}, s = {})
        static final class s extends o implements A3.o {
            int k;
            Object l;
            final ArchiveQuickManager m;

            s(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                this.m = archiveQuickManager0;
                super(2, d0);
            }

            @m
            public final Object a(@l Throwable throwable0, @m kotlin.coroutines.d d0) {
                return ((s)this.create(throwable0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new s(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Throwable)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.read.ArchiveQuickManager$quickHistory$3$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.s.a extends o implements A3.o {
                    int k;
                    final ArchiveQuickManager l;
                    final Throwable m;

                    com.dcinside.app.read.ArchiveQuickManager.s.a(ArchiveQuickManager archiveQuickManager0, Throwable throwable0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        this.m = throwable0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.s.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.s.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                        if(appCompatActivity0 == null) {
                            return S0.a;
                        }
                        Dl.G(appCompatActivity0, this.m.getMessage());
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.read.ArchiveQuickManager.s.a archiveQuickManager$s$a0 = new com.dcinside.app.read.ArchiveQuickManager.s.a(this.m, ((Throwable)this.l), null);
                        this.k = 1;
                        return kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$s$a0, this) == object1 ? object1 : S0.a;
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

        L.p(function10, "getHistory");
        if(this.d != null && this.d.isActive()) {
            return;
        }
        this.A();
        this.d = this.y(new q(function10, this, null), new r(this, null), new s(this, null));
    }

    private final V O(F0 f00, Function1 function10, Function1 function11) {
        d1 d10 = (d1)function10.invoke(f00);
        return d10 == null ? r0.a(f00.o2(((X0)function11.invoke(f00)), new W[0]), Boolean.TRUE) : r0.a(d10, Boolean.FALSE);
    }

    private final V P(F0 f00, List list0) {
        static final class com.dcinside.app.read.ArchiveQuickManager.t extends N implements Function1 {
            final com.dcinside.app.realm.f0 e;

            com.dcinside.app.read.ArchiveQuickManager.t(com.dcinside.app.realm.f0 f00) {
                this.e = f00;
                super(1);
            }

            @m
            public final d1 a(@l F0 f00) {
                L.p(f00, "it");
                String s = this.e.W5();
                if(s == null) {
                    return null;
                }
                int v = this.e.d6();
                return com.dcinside.app.realm.helper.a.a.h(f00, s, v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((F0)object0));
            }
        }


        static final class com.dcinside.app.read.ArchiveQuickManager.u extends N implements Function1 {
            final ArchiveQuickManager e;
            final com.dcinside.app.realm.f0 f;

            com.dcinside.app.read.ArchiveQuickManager.u(ArchiveQuickManager archiveQuickManager0, com.dcinside.app.realm.f0 f00) {
                this.e = archiveQuickManager0;
                this.f = f00;
                super(1);
            }

            @l
            public final d1 a(@l F0 f00) {
                L.p(f00, "r");
                c c0 = this.e.C(f00, 0, -1L);
                c0.V5(System.currentTimeMillis());
                d1 d10 = new d0();
                com.dcinside.app.realm.f0 f01 = this.f;
                com.dcinside.app.realm.d0.a d0$a0 = d0.m;
                String s = f01.W5();
                if(s == null) {
                    s = "";
                }
                ((d0)d10).g6(d0$a0.c(s, f01.d6()));
                ((d0)d10).e6(f01.W5());
                ((d0)d10).f6(f01.X5());
                ((d0)d10).h6(f01.d6());
                ((d0)d10).i6(f01.g6());
                ((d0)d10).c6(f01.T5());
                ((d0)d10).k6(f01.c6());
                ((d0)d10).j6(System.currentTimeMillis());
                ((d0)d10).d6(c0);
                return d10;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((F0)object0));
            }
        }

        ArrayList arrayList0 = new ArrayList();
        boolean z = false;
        for(Object object0: list0) {
            V v0 = this.O(f00, new com.dcinside.app.read.ArchiveQuickManager.t(((com.dcinside.app.realm.f0)object0)), new com.dcinside.app.read.ArchiveQuickManager.u(this, ((com.dcinside.app.realm.f0)object0)));
            d1 d10 = (d1)v0.a();
            if(((Boolean)v0.b()).booleanValue()) {
                z = true;
            }
            if(d10 != null) {
                arrayList0.add(d10);
            }
        }
        return r0.a(Boolean.valueOf(z), arrayList0);
    }

    private final V Q(F0 f00, w0 w00) {
        static final class v extends N implements Function1 {
            final w0 e;

            v(w0 w00) {
                this.e = w00;
                super(1);
            }

            @m
            public final d1 a(@l F0 f00) {
                L.p(f00, "it");
                String s = this.e.b();
                int v = this.e.g();
                return com.dcinside.app.realm.helper.a.a.h(f00, s, v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((F0)object0));
            }
        }


        static final class com.dcinside.app.read.ArchiveQuickManager.w extends N implements Function1 {
            final ArchiveQuickManager e;
            final w0 f;

            com.dcinside.app.read.ArchiveQuickManager.w(ArchiveQuickManager archiveQuickManager0, w0 w00) {
                this.e = archiveQuickManager0;
                this.f = w00;
                super(1);
            }

            @l
            public final d1 a(@l F0 f00) {
                L.p(f00, "r");
                c c0 = this.e.C(f00, this.f.a(), -1L);
                c0.V5(System.currentTimeMillis());
                d1 d10 = new d0();
                ((d0)d10).g6(d0.m.c(this.f.b(), this.f.g()));
                ((d0)d10).e6(this.f.b());
                ((d0)d10).f6(this.f.c());
                ((d0)d10).h6(this.f.g());
                ((d0)d10).i6(this.f.h());
                ((d0)d10).c6(this.f.e());
                ((d0)d10).k6(this.f.f());
                ((d0)d10).j6(System.currentTimeMillis());
                ((d0)d10).d6(c0);
                return d10;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((F0)object0));
            }
        }

        return this.O(f00, new v(w00), new com.dcinside.app.read.ArchiveQuickManager.w(this, w00));
    }

    private final V R(F0 f00, w0 w00) {
        static final class x extends N implements Function1 {
            final w0 e;

            x(w0 w00) {
                this.e = w00;
                super(1);
            }

            @m
            public final d1 a(@l F0 f00) {
                L.p(f00, "it");
                com.dcinside.app.realm.helper.a a0 = com.dcinside.app.realm.helper.a.a;
                String s = this.e.i();
                return s == null ? null : a0.i(f00, s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((F0)object0));
            }
        }


        static final class y extends N implements Function1 {
            final ArchiveQuickManager e;
            final w0 f;

            y(ArchiveQuickManager archiveQuickManager0, w0 w00) {
                this.e = archiveQuickManager0;
                this.f = w00;
                super(1);
            }

            @l
            public final d1 a(@l F0 f00) {
                L.p(f00, "r");
                c c0 = this.e.C(f00, this.f.a(), -1L);
                c0.V5(System.currentTimeMillis());
                d1 d10 = new A0();
                ((A0)d10).c6(this.f.b());
                ((A0)d10).d6(this.f.c());
                ((A0)d10).f6(this.f.g());
                ((A0)d10).h6(this.f.h());
                ((A0)d10).a6(this.f.e());
                ((A0)d10).j6(this.f.f());
                ((A0)d10).i6(System.currentTimeMillis());
                ((A0)d10).g6(this.f.i());
                ((A0)d10).e6(this.f.d());
                ((A0)d10).b6(c0);
                return d10;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((F0)object0));
            }
        }

        return this.O(f00, new x(w00), new y(this, w00));
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onDestroy() {
        AlertDialog alertDialog0 = this.f;
        if(alertDialog0 != null) {
            alertDialog0.dismiss();
        }
        try {
            this.f = null;
            I0 i00 = this.d;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.d = null;
        I0 i01 = this.e;
        if(i01 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i01, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.e = null;
        this.c = u.H();
    }

    private final void x(AppCompatActivity appCompatActivity0, V[] arr_v) {
        FragmentManager fragmentManager0 = appCompatActivity0.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        L.y(4, "T");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = Fragment.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "androidx.fragment.app.Fragment");
        L.y(1, "T");
        fragment0.setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, arr_v.length))));
        fragmentManager0.u().M(0x7F010016, 0x7F010017).C(0x7F0B0145, fragment0).q();  // anim:archive_quick_enter
    }

    private final I0 y(Function1 function10, A3.o o0, A3.o o1) {
        @f(c = "com.dcinside.app.read.ArchiveQuickManager$change$1", f = "ArchiveQuickManager.kt", i = {0, 1}, l = {81, 88, 0x60}, m = "invokeSuspend", n = {"jobProgress", "jobProgress"}, s = {"L$0", "L$0"})
        static final class com.dcinside.app.read.ArchiveQuickManager.c extends o implements A3.o {
            int k;
            private Object l;
            final O m;
            final ArchiveQuickManager n;
            final A3.o o;
            final A3.o p;
            final A q;
            final Function1 r;

            com.dcinside.app.read.ArchiveQuickManager.c(O o0, ArchiveQuickManager archiveQuickManager0, A3.o o1, A3.o o2, A a0, Function1 function10, kotlin.coroutines.d d0) {
                this.m = o0;
                this.n = archiveQuickManager0;
                this.o = o1;
                this.p = o2;
                this.q = a0;
                this.r = function10;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.read.ArchiveQuickManager.c(this.m, this.n, this.o, this.p, this.q, this.r, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.ArchiveQuickManager.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.read.ArchiveQuickManager$change$1$async$1", f = "ArchiveQuickManager.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.c.a extends o implements A3.o {
                    int k;
                    final Function1 l;

                    com.dcinside.app.read.ArchiveQuickManager.c.a(Function1 function10, kotlin.coroutines.d d0) {
                        this.l = function10;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.c.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                object0 = this.l.invoke(this);
                                return object0 == object1 ? object1 : object0;
                            }
                            case 1: {
                                f0.n(object0);
                                return object0;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }


                @f(c = "com.dcinside.app.read.ArchiveQuickManager$change$1$jobProgress$1", f = "ArchiveQuickManager.kt", i = {}, l = {0x40, 65}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.c.b extends o implements A3.o {
                    int k;
                    final ArchiveQuickManager l;

                    com.dcinside.app.read.ArchiveQuickManager.c.b(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.c.b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.c.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        @f(c = "com.dcinside.app.read.ArchiveQuickManager$change$1$jobProgress$1$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.read.ArchiveQuickManager.c.b.a extends o implements A3.o {
                            int k;
                            final ArchiveQuickManager l;

                            com.dcinside.app.read.ArchiveQuickManager.c.b.a(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                                this.l = archiveQuickManager0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.read.ArchiveQuickManager.c.b.a(this.l, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.read.ArchiveQuickManager.c.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                                if(appCompatActivity0 == null) {
                                    return S0.a;
                                }
                                Builder alertDialog$Builder0 = new Builder(appCompatActivity0);
                                ProgressBar progressBar0 = new ProgressBar(appCompatActivity0);
                                progressBar0.setBackgroundResource(0x7F0605A2);  // color:transparent
                                alertDialog$Builder0.setView(progressBar0);
                                AlertDialog alertDialog0 = alertDialog$Builder0.create();
                                L.o(alertDialog0, "create(...)");
                                Window window0 = alertDialog0.getWindow();
                                if(window0 != null) {
                                    window0.setBackgroundDrawable(new ColorDrawable(0));
                                }
                                AlertDialog alertDialog1 = this.l.f;
                                if(alertDialog1 != null) {
                                    alertDialog1.dismiss();
                                }
                                this.l.f = alertDialog0;
                                alertDialog0.show();
                                return S0.a;
                            }
                        }

                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                if(a0.b(500L, this) == object1) {
                                    return object1;
                                }
                                break;
                            }
                            case 1: {
                                f0.n(object0);
                                break;
                            }
                            case 2: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        com.dcinside.app.read.ArchiveQuickManager.c.b.a archiveQuickManager$c$b$a0 = new com.dcinside.app.read.ArchiveQuickManager.c.b.a(this.l, null);
                        this.k = 2;
                        return kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$c$b$a0, this) == object1 ? object1 : S0.a;
                    }
                }

                I0 i00;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        i00 = kotlinx.coroutines.k.f(((O)this.l), null, null, new com.dcinside.app.read.ArchiveQuickManager.c.b(this.n, null), 3, null);
                        try {
                            com.dcinside.app.read.ArchiveQuickManager.c.a archiveQuickManager$c$a0 = new com.dcinside.app.read.ArchiveQuickManager.c.a(this.r, null);
                            X x0 = kotlinx.coroutines.k.b(this.m, null, null, archiveQuickManager$c$a0, 3, null);
                            this.l = i00;
                            this.k = 1;
                            object0 = x0.o(this);
                            if(object0 == object1) {
                                return object1;
                            }
                            goto label_14;
                        }
                        catch(Exception exception0) {
                            goto label_26;
                        }
                        return object1;
                    }
                    case 1: {
                        i00 = (I0)this.l;
                        try {
                            f0.n(object0);
                        }
                        catch(Exception exception0) {
                            goto label_26;
                        }
                        try {
                        label_14:
                            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                            AlertDialog alertDialog0 = this.n.f;
                            if(alertDialog0 != null && alertDialog0.isShowing()) {
                                alertDialog0.dismiss();
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        try {
                            this.l = i00;
                            this.k = 2;
                            if(this.o.invoke(object0, this) == object1) {
                                return object1;
                            }
                            goto label_35;
                        }
                        catch(Exception exception0) {
                            goto label_26;
                        }
                        return object1;
                    }
                    case 2: {
                        i00 = (I0)this.l;
                        try {
                            f0.n(object0);
                        }
                        catch(Exception exception0) {
                            try {
                            label_26:
                                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                                AlertDialog alertDialog1 = this.n.f;
                                if(alertDialog1 != null && alertDialog1.isShowing()) {
                                    alertDialog1.dismiss();
                                }
                            }
                            catch(Exception unused_ex) {
                            }
                            this.l = null;
                            this.k = 3;
                            if(this.p.invoke(exception0, this) == object1) {
                                return object1;
                            }
                        }
                        goto label_35;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                f0.n(object0);
            label_35:
                this.q.a();
                return S0.a;
            }
        }

        I0 i00 = j1.c(null, 1, null);
        O o2 = P.a(h0.a().plus(i00));
        kotlinx.coroutines.k.f(o2, null, null, new com.dcinside.app.read.ArchiveQuickManager.c(o2, this, o0, o1, ((A)i00), function10, null), 3, null);
        return i00;
    }

    public final void z(long v, @m String s) {
        @f(c = "com.dcinside.app.read.ArchiveQuickManager$changeFolder$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nArchiveQuickManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$changeFolder$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,536:1\n112#2,3:537\n129#2,15:541\n116#2:556\n129#2,15:557\n112#2,3:572\n129#2,15:576\n116#2:591\n129#2,15:592\n1#3:540\n1#3:575\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickManager.kt\ncom/dcinside/app/read/ArchiveQuickManager$changeFolder$1\n*L\n299#1:537,3\n299#1:541,15\n299#1:556\n299#1:557,15\n314#1:572,3\n314#1:576,15\n314#1:591\n314#1:592,15\n299#1:540\n314#1:575\n*E\n"})
        static final class com.dcinside.app.read.ArchiveQuickManager.d extends o implements Function1 {
            int k;
            final ArchiveQuickManager l;
            final long m;
            final String n;

            com.dcinside.app.read.ArchiveQuickManager.d(ArchiveQuickManager archiveQuickManager0, long v, String s, kotlin.coroutines.d d0) {
                this.l = archiveQuickManager0;
                this.m = v;
                this.n = s;
                super(1, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@l kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.ArchiveQuickManager.d(this.l, this.m, this.n, d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((kotlin.coroutines.d)object0));
            }

            @m
            public final Object invoke(@m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.ArchiveQuickManager.d)this.create(d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                d0 d03;
                String s1;
                d0 d01;
                if(this.k == 0) {
                    f0.n(object0);
                    List list0 = this.l.c;
                    List list1 = u.H();
                    this.l.c = list1;
                    switch(this.l.b) {
                        case 0: {
                            ArchiveQuickManager archiveQuickManager0 = this.l;
                            long v = this.m;
                            F0 f00 = F0.g4();
                            L.m(f00);
                            if(f00.E0()) {
                                goto label_36;
                            }
                            else {
                                f00.beginTransaction();
                                goto label_13;
                            }
                            goto label_61;
                            try {
                            label_13:
                                c c0 = archiveQuickManager0.C(f00, 0, v);
                                c0.V5(System.currentTimeMillis());
                                for(Object object1: list0) {
                                    L.n(((d1)object1), "null cannot be cast to non-null type com.dcinside.app.realm.PostArchive");
                                    d0 d00 = (d0)(((d1)object1));
                                    String s = d00.U5();
                                    if(s == null) {
                                        d01 = null;
                                    }
                                    else {
                                        int v1 = d00.X5();
                                        d01 = com.dcinside.app.realm.helper.a.a.h(f00, s, v1);
                                    }
                                    if(d01 != null) {
                                        d01.d6(c0);
                                    }
                                }
                                s1 = c0.R5();
                                f00.p();
                                goto label_61;
                            }
                            catch(Throwable throwable1) {
                            }
                            if(f00.E0()) {
                                f00.e();
                            }
                            throw throwable1;
                            try {
                            label_36:
                                c c1 = archiveQuickManager0.C(f00, 0, v);
                                c1.V5(System.currentTimeMillis());
                                for(Object object2: list0) {
                                    L.n(((d1)object2), "null cannot be cast to non-null type com.dcinside.app.realm.PostArchive");
                                    d0 d02 = (d0)(((d1)object2));
                                    String s2 = d02.U5();
                                    if(s2 == null) {
                                        d03 = null;
                                    }
                                    else {
                                        int v2 = d02.X5();
                                        d03 = com.dcinside.app.realm.helper.a.a.h(f00, s2, v2);
                                    }
                                    if(d03 != null) {
                                        d03.d6(c1);
                                    }
                                }
                                s1 = c1.R5();
                                goto label_61;
                            }
                            catch(Throwable throwable2) {
                            }
                            try {
                                throw throwable2;
                            }
                            catch(Throwable throwable0) {
                            }
                            try {
                                throw throwable0;
                            }
                            catch(Throwable throwable3) {
                                kotlin.io.c.a(f00, throwable0);
                                throw throwable3;
                            }
                        label_61:
                            kotlin.io.c.a(f00, null);
                            return s1;
                        }
                        case 1: {
                            ArchiveQuickManager archiveQuickManager1 = this.l;
                            long v3 = this.m;
                            String s3 = this.n;
                            F0 f01 = F0.g4();
                            L.m(f01);
                            if(f01.E0()) {
                                goto label_90;
                            }
                            else {
                                f01.beginTransaction();
                                goto label_70;
                            }
                            goto label_112;
                            try {
                            label_70:
                                c c2 = archiveQuickManager1.C(f01, 1, v3);
                                c2.V5(System.currentTimeMillis());
                                for(Object object3: list0) {
                                    L.n(((d1)object3), "null cannot be cast to non-null type com.dcinside.app.realm.VoiceArchive");
                                    String s4 = ((A0)(((d1)object3))).W5();
                                    A0 a00 = s4 == null ? null : com.dcinside.app.realm.helper.a.a.i(f01, s4);
                                    if(a00 != null) {
                                        a00.b6(c2);
                                        if(s3 != null) {
                                            a00.e6(s3);
                                        }
                                    }
                                }
                                s1 = c2.R5();
                                f01.p();
                                goto label_112;
                            }
                            catch(Throwable throwable5) {
                            }
                            if(f01.E0()) {
                                f01.e();
                            }
                            throw throwable5;
                            try {
                            label_90:
                                c c3 = archiveQuickManager1.C(f01, 1, v3);
                                c3.V5(System.currentTimeMillis());
                                for(Object object4: list0) {
                                    L.n(((d1)object4), "null cannot be cast to non-null type com.dcinside.app.realm.VoiceArchive");
                                    String s5 = ((A0)(((d1)object4))).W5();
                                    A0 a01 = s5 == null ? null : com.dcinside.app.realm.helper.a.a.i(f01, s5);
                                    if(a01 != null) {
                                        a01.b6(c3);
                                        if(s3 != null) {
                                            a01.e6(s3);
                                        }
                                    }
                                }
                                s1 = c3.R5();
                                goto label_112;
                            }
                            catch(Throwable throwable6) {
                            }
                            try {
                                throw throwable6;
                            }
                            catch(Throwable throwable4) {
                            }
                            try {
                                throw throwable4;
                            }
                            catch(Throwable throwable7) {
                                kotlin.io.c.a(f01, throwable4);
                                throw throwable7;
                            }
                        label_112:
                            kotlin.io.c.a(f01, null);
                            return s1;
                        }
                        default: {
                            return null;
                        }
                    }
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }


        @f(c = "com.dcinside.app.read.ArchiveQuickManager$changeFolder$2", f = "ArchiveQuickManager.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.ArchiveQuickManager.e extends o implements A3.o {
            int k;
            Object l;
            final ArchiveQuickManager m;

            com.dcinside.app.read.ArchiveQuickManager.e(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                this.m = archiveQuickManager0;
                super(2, d0);
            }

            @m
            public final Object a(@m String s, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.ArchiveQuickManager.e)this.create(s, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.read.ArchiveQuickManager.e(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((String)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.read.ArchiveQuickManager$changeFolder$2$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.e.a extends o implements A3.o {
                    int k;
                    final ArchiveQuickManager l;
                    final String m;

                    com.dcinside.app.read.ArchiveQuickManager.e.a(ArchiveQuickManager archiveQuickManager0, String s, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        this.m = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.e.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                        if(appCompatActivity0 == null) {
                            return S0.a;
                        }
                        String s = appCompatActivity0.getString(0x7F1500E2, new Object[]{this.m});  // string:archive_change_write_msg1 "%1$s 보관함 폴더에 저장 완료"
                        L.o(s, "getString(...)");
                        Dl.G(appCompatActivity0, s);
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        String s = (String)this.l;
                        if(s != null) {
                            com.dcinside.app.read.ArchiveQuickManager.e.a archiveQuickManager$e$a0 = new com.dcinside.app.read.ArchiveQuickManager.e.a(this.m, s, null);
                            this.k = 1;
                            if(kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$e$a0, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
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


        @f(c = "com.dcinside.app.read.ArchiveQuickManager$changeFolder$3", f = "ArchiveQuickManager.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.ArchiveQuickManager.f extends o implements A3.o {
            int k;
            Object l;
            final ArchiveQuickManager m;

            com.dcinside.app.read.ArchiveQuickManager.f(ArchiveQuickManager archiveQuickManager0, kotlin.coroutines.d d0) {
                this.m = archiveQuickManager0;
                super(2, d0);
            }

            @m
            public final Object a(@l Throwable throwable0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.ArchiveQuickManager.f)this.create(throwable0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.read.ArchiveQuickManager.f(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Throwable)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.read.ArchiveQuickManager$changeFolder$3$1", f = "ArchiveQuickManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.ArchiveQuickManager.f.a extends o implements A3.o {
                    int k;
                    final ArchiveQuickManager l;
                    final Throwable m;

                    com.dcinside.app.read.ArchiveQuickManager.f.a(ArchiveQuickManager archiveQuickManager0, Throwable throwable0, kotlin.coroutines.d d0) {
                        this.l = archiveQuickManager0;
                        this.m = throwable0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.ArchiveQuickManager.f.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.ArchiveQuickManager.f.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        AppCompatActivity appCompatActivity0 = (AppCompatActivity)this.l.a.a();
                        if(appCompatActivity0 == null) {
                            return S0.a;
                        }
                        Dl.G(appCompatActivity0, this.m.getMessage());
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.read.ArchiveQuickManager.f.a archiveQuickManager$f$a0 = new com.dcinside.app.read.ArchiveQuickManager.f.a(this.m, ((Throwable)this.l), null);
                        this.k = 1;
                        return kotlinx.coroutines.i.h(h0.e(), archiveQuickManager$f$a0, this) == object1 ? object1 : S0.a;
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

        if(this.c.isEmpty()) {
            return;
        }
        if(this.e != null && this.e.isActive()) {
            return;
        }
        this.e = this.y(new com.dcinside.app.read.ArchiveQuickManager.d(this, v, s, null), new com.dcinside.app.read.ArchiveQuickManager.e(this, null), new com.dcinside.app.read.ArchiveQuickManager.f(this, null));
    }
}

