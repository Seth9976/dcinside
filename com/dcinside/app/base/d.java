package com.dcinside.app.base;

import A3.p;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dcinside.app.Application;
import com.dcinside.app.auth.AuthenticatorActivity;
import com.dcinside.app.browser.AwesomeWebViewActivity;
import com.dcinside.app.image.ImageViewerActivity;
import com.dcinside.app.main.login.o.b;
import com.dcinside.app.main.login.o;
import com.dcinside.app.main.login.u;
import com.dcinside.app.read.ArchiveQuickManager;
import com.dcinside.app.rx.bus.a;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Cl;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.vk;
import java.util.Arrays;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.q0;
import kotlin.r0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nAppBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBaseActivity.kt\ncom/dcinside/app/base/AppBaseActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 6 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 7 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 8 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,443:1\n75#2,13:444\n177#3,9:457\n177#3,9:466\n192#3,7:475\n1#4:482\n35#5:483\n35#5:484\n35#5:485\n27#6:486\n70#7,2:487\n27#8:489\n*S KotlinDebug\n*F\n+ 1 AppBaseActivity.kt\ncom/dcinside/app/base/AppBaseActivity\n*L\n106#1:444,13\n144#1:457,9\n182#1:466,9\n183#1:475,7\n364#1:483\n368#1:484\n376#1:485\n399#1:486\n417#1:487,2\n418#1:489\n*E\n"})
public abstract class d extends AppCompatActivity implements b, a {
    public static final class com.dcinside.app.base.d.a {
        private com.dcinside.app.base.d.a() {
        }

        public com.dcinside.app.base.d.a(w w0) {
        }

        @n
        public final void a(@l Context context0, @l Intent intent0, int v, @l p p0) {
            L.p(context0, "context");
            L.p(intent0, "intent");
            L.p(p0, "l");
            Context context1 = Al.h(context0);
            d d0 = context1 instanceof d ? ((d)context1) : null;
            if(d0 == null) {
                return;
            }
            if(!d0.q1()) {
                return;
            }
            d0.A1(intent0, v, p0);
        }
    }

    @l
    private final D i;
    @l
    private final D j;
    @l
    private final D k;
    @m
    private Context l;
    private boolean m;
    @m
    private Menu n;
    @m
    private SparseArray o;
    @m
    private WindowInsetsControllerCompat p;
    @m
    private ActivityResultLauncher q;
    @l
    private final D r;
    @m
    private o s;
    @l
    public static final com.dcinside.app.base.d.a t;

    static {
        d.t = new com.dcinside.app.base.d.a(null);
    }

    public d() {
        static final class com.dcinside.app.base.d.b extends N implements A3.a {
            final d e;

            com.dcinside.app.base.d.b(d d0) {
                this.e = d0;
                super(0);
            }

            @l
            public final ArchiveQuickManager b() {
                return new ArchiveQuickManager(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements A3.a {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(0);
            }

            @l
            public final com.dcinside.app.rx.bus.b b() {
                return new com.dcinside.app.rx.bus.b();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nAppBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBaseActivity.kt\ncom/dcinside/app/base/AppBaseActivity$clipboardManager$2\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,443:1\n31#2:444\n*S KotlinDebug\n*F\n+ 1 AppBaseActivity.kt\ncom/dcinside/app/base/AppBaseActivity$clipboardManager$2\n*L\n78#1:444\n*E\n"})
        static final class e extends N implements A3.a {
            final d e;

            e(d d0) {
                this.e = d0;
                super(0);
            }

            @m
            public final ClipboardManager b() {
                return (ClipboardManager)ContextCompat.getSystemService(this.e, ClipboardManager.class);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
        public static final class g extends N implements A3.a {
            final ComponentActivity e;

            public g(ComponentActivity componentActivity0) {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final Factory b() {
                return this.e.getDefaultViewModelProviderFactory();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
        public static final class h extends N implements A3.a {
            final ComponentActivity e;

            public h(ComponentActivity componentActivity0) {
                this.e = componentActivity0;
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return this.e.getViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
        public static final class i extends N implements A3.a {
            final A3.a e;
            final ComponentActivity f;

            public i(A3.a a0, ComponentActivity componentActivity0) {
                this.e = a0;
                this.f = componentActivity0;
                super(0);
            }

            @l
            public final CreationExtras b() {
                A3.a a0 = this.e;
                if(a0 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)a0.invoke();
                    return creationExtras0 == null ? this.f.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.f.getDefaultViewModelCreationExtras();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        this.i = E.a(new e(this));
        this.j = E.a(new com.dcinside.app.base.d.b(this));
        this.k = E.a(c.e);
        this.m = true;
        g d$g0 = new g(this);
        this.r = new ViewModelLazy(m0.d(u.class), new h(this), d$g0, new i(null, this));
    }

    public final void A1(@l Intent intent0, int v, @l p p0) {
        L.p(intent0, "intent");
        L.p(p0, "l");
        SparseArray sparseArray0 = this.o;
        if(sparseArray0 != null) {
            sparseArray0.put(v, p0);
        }
        super.startActivityForResult(intent0, v);
    }

    private final void B1() {
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = this.p;
        if(windowInsetsControllerCompat0 != null) {
            if(this.m) {
                windowInsetsControllerCompat0 = null;
            }
            if(windowInsetsControllerCompat0 != null) {
                if(Build.VERSION.SDK_INT < 30) {
                    View view0 = this.getWindow().getDecorView();
                    L.o(view0, "getDecorView(...)");
                    view0.postDelayed(() -> {
                        L.p(windowInsetsControllerCompat0, "$controller");
                        windowInsetsControllerCompat0.j(2);
                        windowInsetsControllerCompat0.d(1);
                    }, 50L);
                    return;
                }
                windowInsetsControllerCompat0.j(2);
                windowInsetsControllerCompat0.d(1);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void C1(WindowInsetsControllerCompat windowInsetsControllerCompat0) [...]

    protected boolean D1() {
        return false;
    }

    @Override  // com.dcinside.app.main.login.o$b
    public void T() {
        Intent intent0 = new Intent(this, AuthenticatorActivity.class);
        ActivityResultLauncher activityResultLauncher0 = this.q;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.b(intent0);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void addContentView(@m View view0, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addContentView(view0, viewGroup$LayoutParams0);
        this.v1();
    }

    @Override  // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(@m Configuration configuration0) {
        if(configuration0 != null) {
            int v = configuration0.uiMode;
            Context context0 = this.getBaseContext();
            L.o(context0, "getBaseContext(...)");
            Configuration configuration1 = context0.getResources().getConfiguration();
            L.o(configuration1, "getConfiguration(...)");
            configuration0.setTo(configuration1);
            configuration0.uiMode = v;
        }
        super.applyOverrideConfiguration(configuration0);
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    protected void attachBaseContext(@m Context context0) {
        this.l = context0;
        if(context0 == null) {
            super.attachBaseContext(null);
            return;
        }
        Configuration configuration0 = context0.getResources().getConfiguration();
        L.o(configuration0, "getConfiguration(...)");
        if(dl.a.d0()) {
            configuration0.fontScale = 1.0f;
        }
        else {
            Configuration configuration1 = Application.e.c().getResources().getConfiguration();
            L.o(configuration1, "getConfiguration(...)");
            configuration0.fontScale = configuration1.fontScale;
        }
        super.attachBaseContext(context0.createConfigurationContext(configuration0));
    }

    @Override  // com.dcinside.app.rx.bus.a
    @l
    public rx.g e(@l Class class0) {
        L.p(class0, "eventType");
        return this.l1().e(class0);
    }

    public void f1() {
        ActionBar actionBar0 = this.I0();
        if(actionBar0 == null) {
            return;
        }
        boolean z = dl.a.w1() > 0;
        int v = !dl.a.v2() || !z ? 0x7F0802E6 : 0x7F0802E7;  // drawable:ic_side_menu_push_normal
        if(ContextCompat.getDrawable(this, v) != null) {
            int v1 = Dk.b(0x7F0703EA);  // dimen:side_nav_icon_size
            Bitmap bitmap0 = BitmapFactory.decodeResource(this.getResources(), v);
            L.m(bitmap0);
            Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v1, v1, true);
            Resources resources0 = this.getResources();
            L.o(resources0, "getResources(...)");
            actionBar0.k0(new BitmapDrawable(resources0, bitmap1));
        }
    }

    @m
    public final Object g1(@l kotlin.coroutines.d d0) {
        @f(c = "com.dcinside.app.base.AppBaseActivity$clipboardCheckout$2", f = "AppBaseActivity.kt", i = {}, l = {312, 317}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.base.d.d extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final d l;

            com.dcinside.app.base.d.d(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.base.d.d(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.base.d.d)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.base.AppBaseActivity$clipboardCheckout$2$1", f = "AppBaseActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nAppBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBaseActivity.kt\ncom/dcinside/app/base/AppBaseActivity$clipboardCheckout$2$1\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,443:1\n38#2:444\n*S KotlinDebug\n*F\n+ 1 AppBaseActivity.kt\ncom/dcinside/app/base/AppBaseActivity$clipboardCheckout$2$1\n*L\n321#1:444\n*E\n"})
                static final class com.dcinside.app.base.d.d.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final String l;
                    final d m;
                    final String n;
                    final String o;
                    final com.dcinside.app.type.m p;

                    com.dcinside.app.base.d.d.a(String s, d d0, String s1, String s2, com.dcinside.app.type.m m0, kotlin.coroutines.d d1) {
                        this.l = s;
                        this.m = d0;
                        this.n = s1;
                        this.o = s2;
                        this.p = m0;
                        super(2, d1);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.base.d.d.a(this.l, this.m, this.n, this.o, this.p, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.base.d.d.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        static final class com.dcinside.app.base.d.d.a.a extends N implements A3.a {
                            final Cl e;
                            final d f;
                            final String g;
                            final String h;
                            final com.dcinside.app.type.m i;

                            com.dcinside.app.base.d.d.a.a(Cl cl0, d d0, String s, String s1, com.dcinside.app.type.m m0) {
                                this.e = cl0;
                                this.f = d0;
                                this.g = s;
                                this.h = s1;
                                this.i = m0;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                this.e.b();
                                Clipboards.a.e(this.f, this.g, this.h, this.i);
                            }
                        }

                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        dl.a.x4(this.l);
                        ViewGroup viewGroup0 = (ViewGroup)this.m.findViewById(0x1020002);
                        View view0 = viewGroup0 == null ? null : viewGroup0.getChildAt(0);
                        if(view0 == null) {
                            return S0.a;
                        }
                        Cl cl0 = new Cl(view0, this.l);
                        cl0.d();
                        cl0.c(new com.dcinside.app.base.d.d.a.a(cl0, this.m, this.n, this.o, this.p));
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.base.AppBaseActivity$clipboardCheckout$2$cm$1", f = "AppBaseActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.base.d.d.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final d l;

                    com.dcinside.app.base.d.d.b(d d0, kotlin.coroutines.d d1) {
                        this.l = d0;
                        super(2, d1);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.base.d.d.b(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.base.d.d.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        return this.l.n1();
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.base.d.d.b d$d$b0 = new com.dcinside.app.base.d.d.b(this.l, null);
                        this.k = 1;
                        object0 = kotlinx.coroutines.i.h(h0.e(), d$d$b0, this);
                        if(object0 == object1) {
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
                Clipboards clipboards0 = Clipboards.a;
                String s = clipboards0.c(((ClipboardManager)object0));
                if(s == null) {
                    return S0.a;
                }
                q0 q00 = clipboards0.d(s);
                if(q00 == null) {
                    return S0.a;
                }
                com.dcinside.app.base.d.d.a d$d$a0 = new com.dcinside.app.base.d.d.a(s, this.l, ((String)q00.a()), ((String)q00.b()), ((com.dcinside.app.type.m)q00.c()), null);
                this.k = 2;
                return kotlinx.coroutines.i.h(h0.e(), d$d$a0, this) == object1 ? object1 : S0.a;
            }
        }

        Object object0 = kotlinx.coroutines.i.h(h0.a(), new com.dcinside.app.base.d.d(this, null), d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    protected boolean h1() {
        return !dl.a.q2().m();
    }

    protected boolean i1() {
        return dl.a.q2().l();
    }

    protected int j1() {
        return vk.b(this, 0x7F04013F);  // attr:colorNavigationBar
    }

    @Override  // com.dcinside.app.rx.bus.a
    public void k(@l Object object0) {
        L.p(object0, "event");
        this.l1().k(object0);
    }

    @l
    public final ArchiveQuickManager k1() {
        return (ArchiveQuickManager)this.j.getValue();
    }

    private final com.dcinside.app.rx.bus.b l1() {
        return (com.dcinside.app.rx.bus.b)this.k.getValue();
    }

    @m
    public final Context m1() {
        return this.l;
    }

    private final ClipboardManager n1() {
        return (ClipboardManager)this.i.getValue();
    }

    @l
    protected final u o1() {
        return (u)this.r.getValue();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        p p0 = this.o == null ? null : ((p)this.o.get(v));
        if(p0 == null) {
            return;
        }
        SparseArray sparseArray0 = this.o;
        if(sparseArray0 != null) {
            sparseArray0.remove(v);
        }
        p0.invoke(v, v1, intent0);
    }

    @Override  // androidx.activity.ComponentActivity
    public void onBackPressed() {
        try {
            super.onBackPressed();
        }
        catch(Exception unused_ex) {
            this.finish();
        }
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onCreate(@m Bundle bundle0) {
        this.o = new SparseArray();
        this.setTheme(this.p1());
        super.onCreate(bundle0);
        this.q = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            if(activityResult0.c() == 0) {
                d.y1(this, 0, null, null, 0, false, 0x1F, null);
            }
        });
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    protected void onDestroy() {
        super.onDestroy();
        this.l1().c();
        this.l = null;
        this.n = null;
        SparseArray sparseArray0 = this.o;
        if(sparseArray0 != null) {
            sparseArray0.clear();
        }
        try {
            this.o = null;
            o o0 = this.s;
            if(o0 != null) {
                o0.dismissAllowingStateLoss();
            }
        }
        catch(Exception unused_ex) {
        }
        this.s = null;
        ActivityResultLauncher activityResultLauncher0 = this.q;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.d();
        }
        this.q = null;
    }

    @Override  // android.app.Activity
    public boolean onKeyUp(int v, @l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        Menu menu0 = this.n;
        if(menu0 == null) {
            return super.onKeyUp(v, keyEvent0);
        }
        if(82 == v) {
            menu0.performIdentifierAction(0x7F0B0069, 0);  // id:action_more
            return true;
        }
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.app.Activity
    public boolean onPrepareOptionsMenu(@m Menu menu0) {
        if((menu0 == null ? null : menu0.findItem(0x7F0B0069)) != null) {  // id:action_more
            this.n = menu0;
        }
        return super.onPrepareOptionsMenu(menu0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onResume() {
        super.onResume();
        if(this.t1() && (!dl.a.f2() && dl.a.T0())) {
            d.y1(this, 0, null, null, 0, false, 0x1F, null);
        }
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean z) {
        @f(c = "com.dcinside.app.base.AppBaseActivity$onWindowFocusChanged$1", f = "AppBaseActivity.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.base.d.f extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final d l;

            com.dcinside.app.base.d.f(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.base.d.f(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.base.d.f)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.g1(this) == object1 ? object1 : S0.a;
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

        super.onWindowFocusChanged(z);
        if(!z) {
            return;
        }
        this.B1();
        if(this.r1() && Clipboards.a.a()) {
            k.f(LifecycleOwnerKt.a(this), null, null, new com.dcinside.app.base.d.f(this, null), 3, null);
        }
    }

    private final int p1() {
        if(this instanceof AwesomeWebViewActivity) {
            return 0x7F16001A;
        }
        if(this instanceof ImageViewerActivity) {
            dl dl0 = dl.a;
            if(dl0.q2().n()) {
                return dl0.q2().m() ? com.dcinside.app.type.g.j.j() : com.dcinside.app.type.g.d.j();
            }
            return dl0.q2().j();
        }
        if(this.D1()) {
            this.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return dl.a.q2().k();
        }
        return dl.a.q2().j();
    }

    public final boolean q1() {
        return !Dl.n(this);
    }

    protected boolean r1() {
        return true;
    }

    public final boolean s1() {
        return Dl.n(this);
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void setContentView(int v) {
        super.setContentView(v);
        this.v1();
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void setContentView(@m View view0) {
        super.setContentView(view0);
        this.v1();
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void setContentView(@m View view0, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(view0, viewGroup$LayoutParams0);
        this.v1();
    }

    public boolean t1() {
        return true;
    }

    // 检测为 Lambda 实现
    private static final void u1(d d0, ActivityResult activityResult0) [...]

    private final void v1() {
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
        if(viewGroup0 != null) {
            kotlin.sequences.m m0 = ViewGroupKt.e(viewGroup0);
            if(m0 != null) {
                View view0 = (View)kotlin.sequences.p.F0(m0);
                if(view0 != null) {
                    WindowInsetsControllerCompat windowInsetsControllerCompat0 = new WindowInsetsControllerCompat(this.getWindow(), this.getWindow().getDecorView());
                    this.p = windowInsetsControllerCompat0;
                    boolean z = ll.x();
                    if(this.m != z) {
                        this.m = z;
                        if(!z) {
                            WindowCompat.c(this.getWindow(), false);
                            this.B1();
                            ViewCompat.m2(view0, (View view0, WindowInsetsCompat windowInsetsCompat0) -> {
                                L.p(this, "this$0");
                                Insets insets0 = windowInsetsCompat0.f(0x20F);
                                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0) : null;
                                if(viewGroup$MarginLayoutParams0 == null) {
                                    return windowInsetsCompat0;
                                }
                                int v = insets0.d;
                                if(viewGroup$MarginLayoutParams0.bottomMargin != v || viewGroup$MarginLayoutParams0.leftMargin != insets0.a || viewGroup$MarginLayoutParams0.rightMargin != insets0.c) {
                                    viewGroup$MarginLayoutParams0.leftMargin = insets0.a;
                                    viewGroup$MarginLayoutParams0.rightMargin = insets0.c;
                                    viewGroup$MarginLayoutParams0.bottomMargin = v;
                                    view0.setLayoutParams(viewGroup$MarginLayoutParams0);
                                    Context context0 = view0.getContext();
                                    if(context0 instanceof com.dcinside.app.post.fragments.O) {
                                        int v1 = windowInsetsCompat0.f(8).d;
                                        int v2 = windowInsetsCompat0.f(2).d;
                                        if(v1 > v2) {
                                            v1 -= v2;
                                        }
                                        Insets insets1 = Insets.d(0, 0, 0, v1);
                                        L.o(insets1, "of(...)");
                                        ((com.dcinside.app.post.fragments.O)context0).f(insets1);
                                    }
                                    if(this.hasWindowFocus()) {
                                        this.B1();
                                    }
                                }
                                return WindowInsetsCompat.c;
                            });
                        }
                    }
                    this.getWindow().addFlags(0x80000000);
                    this.getWindow().setNavigationBarColor(this.j1());
                    windowInsetsControllerCompat0.i(this.i1());
                    windowInsetsControllerCompat0.h(this.h1());
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final WindowInsetsCompat w1(d d0, View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    public final void x1(int v, @m String s, @l com.dcinside.app.type.m m0, int v1, boolean z) {
        L.p(m0, "galleryGrade");
        o o0 = this.s;
        if(o0 != null) {
            try {
                o0.dismissAllowingStateLoss();
            }
            catch(Exception unused_ex) {
            }
        }
        V[] arr_v = {r0.a("com.dcinside.app.extra.TYPE", v), r0.a("com.dcinside.app.extra.GALLERY_ID ", s), r0.a("com.dcinside.app.extra.GALLERY_GRADE", m0.c()), r0.a("com.dcinside.app.extra.POST_HEAD_LEVEL", v1), r0.a("com.dcinside.app.extra.LOGOUT_ENABLE", Boolean.valueOf(z))};
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = o.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.main.login.o");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.main.login.SettingSimpleLoginFragment");
        }
        ((o)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 5))));
        ((o)fragment0).show(fragmentManager0, "com.dcinside.app.main.login.o");
        this.s = (o)fragment0;
    }

    public static void y1(d d0, int v, String s, com.dcinside.app.type.m m0, int v1, boolean z, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSimpleLoginDialog");
        }
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            s = null;
        }
        if((v2 & 4) != 0) {
            m0 = com.dcinside.app.type.m.g;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        if((v2 & 16) != 0) {
            z = true;
        }
        d0.x1(v, s, m0, v1, z);
    }

    @n
    public static final void z1(@l Context context0, @l Intent intent0, int v, @l p p0) {
        d.t.a(context0, intent0, v, p0);
    }
}

