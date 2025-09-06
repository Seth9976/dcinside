package androidx.compose.foundation.layout;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.R.id;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class WindowInsetsHolder {
    @s0({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n76#2:768\n361#3,7:769\n1#4:776\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n610#1:768\n628#1:769,7\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @Composable
        @l
        public final WindowInsetsHolder c(@m Composer composer0, int v) {
            composer0.V(0xAE8C36EA);
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xAE8C36EA, v, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)");
            }
            View view0 = (View)composer0.L(AndroidCompositionLocals_androidKt.k());
            WindowInsetsHolder windowInsetsHolder0 = this.d(view0);
            EffectsKt.c(windowInsetsHolder0, new Function1(view0) {
                final WindowInsetsHolder e;
                final View f;

                {
                    this.e = windowInsetsHolder0;
                    this.f = view0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    this.e.y(this.f);
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.f.c(this.b);
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            }, composer0, 8);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            return windowInsetsHolder0;
        }

        private final WindowInsetsHolder d(View view0) {
            synchronized(WindowInsetsHolder.y) {
                WeakHashMap weakHashMap1 = WindowInsetsHolder.y;
                WindowInsetsHolder windowInsetsHolder0 = weakHashMap1.get(view0);
                if(windowInsetsHolder0 == null) {
                    windowInsetsHolder0 = new WindowInsetsHolder(null, view0, null);
                    weakHashMap1.put(view0, windowInsetsHolder0);
                }
                return windowInsetsHolder0;
            }
        }

        public final void e(boolean z) {
            WindowInsetsHolder.z = z;
        }

        private final AndroidWindowInsets f(WindowInsetsCompat windowInsetsCompat0, int v, String s) {
            AndroidWindowInsets androidWindowInsets0 = new AndroidWindowInsets(v, s);
            if(windowInsetsCompat0 != null) {
                androidWindowInsets0.j(windowInsetsCompat0, v);
            }
            return androidWindowInsets0;
        }

        private final ValueInsets g(WindowInsetsCompat windowInsetsCompat0, int v, String s) {
            Insets insets0;
            if(windowInsetsCompat0 == null) {
                insets0 = Insets.e;
            }
            else {
                insets0 = windowInsetsCompat0.g(v);
                if(insets0 == null) {
                    insets0 = Insets.e;
                }
            }
            L.o(insets0, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return WindowInsets_androidKt.a(insets0, s);
        }
    }

    @l
    private final AndroidWindowInsets a;
    @l
    private final AndroidWindowInsets b;
    @l
    private final AndroidWindowInsets c;
    @l
    private final AndroidWindowInsets d;
    @l
    private final AndroidWindowInsets e;
    @l
    private final AndroidWindowInsets f;
    @l
    private final AndroidWindowInsets g;
    @l
    private final AndroidWindowInsets h;
    @l
    private final AndroidWindowInsets i;
    @l
    private final ValueInsets j;
    @l
    private final WindowInsets k;
    @l
    private final WindowInsets l;
    @l
    private final WindowInsets m;
    @l
    private final ValueInsets n;
    @l
    private final ValueInsets o;
    @l
    private final ValueInsets p;
    @l
    private final ValueInsets q;
    @l
    private final ValueInsets r;
    @l
    private final ValueInsets s;
    @l
    private final ValueInsets t;
    private final boolean u;
    private int v;
    @l
    private final InsetsListener w;
    @l
    public static final Companion x;
    @l
    private static final WeakHashMap y;
    private static boolean z;

    static {
        WindowInsetsHolder.x = new Companion(null);
        WindowInsetsHolder.y = new WeakHashMap();
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat0, View view0) {
        Insets insets0;
        Companion windowInsetsHolder$Companion0 = WindowInsetsHolder.x;
        this.a = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 4, "captionBar");
        AndroidWindowInsets androidWindowInsets0 = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 0x80, "displayCutout");
        this.b = androidWindowInsets0;
        AndroidWindowInsets androidWindowInsets1 = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 8, "ime");
        this.c = androidWindowInsets1;
        AndroidWindowInsets androidWindowInsets2 = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 0x20, "mandatorySystemGestures");
        this.d = androidWindowInsets2;
        this.e = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 2, "navigationBars");
        this.f = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 1, "statusBars");
        AndroidWindowInsets androidWindowInsets3 = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 0x207, "systemBars");
        this.g = androidWindowInsets3;
        AndroidWindowInsets androidWindowInsets4 = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 16, "systemGestures");
        this.h = androidWindowInsets4;
        AndroidWindowInsets androidWindowInsets5 = windowInsetsHolder$Companion0.f(windowInsetsCompat0, 0x40, "tappableElement");
        this.i = androidWindowInsets5;
        if(windowInsetsCompat0 == null) {
            insets0 = Insets.e;
        }
        else {
            DisplayCutoutCompat displayCutoutCompat0 = windowInsetsCompat0.e();
            if(displayCutoutCompat0 == null) {
                insets0 = Insets.e;
            }
            else {
                insets0 = displayCutoutCompat0.h();
                if(insets0 == null) {
                    insets0 = Insets.e;
                }
            }
        }
        L.o(insets0, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        ValueInsets valueInsets0 = WindowInsets_androidKt.a(insets0, "waterfall");
        this.j = valueInsets0;
        WindowInsets windowInsets0 = WindowInsetsKt.k(WindowInsetsKt.k(androidWindowInsets3, androidWindowInsets1), androidWindowInsets0);
        this.k = windowInsets0;
        WindowInsets windowInsets1 = WindowInsetsKt.k(WindowInsetsKt.k(WindowInsetsKt.k(androidWindowInsets5, androidWindowInsets2), androidWindowInsets4), valueInsets0);
        this.l = windowInsets1;
        this.m = WindowInsetsKt.k(windowInsets0, windowInsets1);
        this.n = windowInsetsHolder$Companion0.g(windowInsetsCompat0, 4, "captionBarIgnoringVisibility");
        this.o = windowInsetsHolder$Companion0.g(windowInsetsCompat0, 2, "navigationBarsIgnoringVisibility");
        this.p = windowInsetsHolder$Companion0.g(windowInsetsCompat0, 1, "statusBarsIgnoringVisibility");
        this.q = windowInsetsHolder$Companion0.g(windowInsetsCompat0, 0x207, "systemBarsIgnoringVisibility");
        this.r = windowInsetsHolder$Companion0.g(windowInsetsCompat0, 0x40, "tappableElementIgnoringVisibility");
        this.s = windowInsetsHolder$Companion0.g(windowInsetsCompat0, 8, "imeAnimationTarget");
        this.t = windowInsetsHolder$Companion0.g(windowInsetsCompat0, 8, "imeAnimationSource");
        ViewParent viewParent0 = view0.getParent();
        Boolean boolean0 = null;
        View view1 = viewParent0 instanceof View ? ((View)viewParent0) : null;
        Object object0 = view1 == null ? null : view1.getTag(id.consume_window_insets_tag);
        if(object0 instanceof Boolean) {
            boolean0 = (Boolean)object0;
        }
        this.u = boolean0 == null ? true : boolean0.booleanValue();
        this.w = new InsetsListener(this);
    }

    public WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat0, View view0, w w0) {
        this(windowInsetsCompat0, view0);
    }

    public static void A(WindowInsetsHolder windowInsetsHolder0, WindowInsetsCompat windowInsetsCompat0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        windowInsetsHolder0.z(windowInsetsCompat0, v);
    }

    public final void B(@l WindowInsetsCompat windowInsetsCompat0) {
        L.p(windowInsetsCompat0, "windowInsets");
        Insets insets0 = windowInsetsCompat0.f(8);
        L.o(insets0, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        InsetsValues insetsValues0 = WindowInsets_androidKt.Q(insets0);
        this.t.g(insetsValues0);
    }

    public final void C(@l WindowInsetsCompat windowInsetsCompat0) {
        L.p(windowInsetsCompat0, "windowInsets");
        Insets insets0 = windowInsetsCompat0.f(8);
        L.o(insets0, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        InsetsValues insetsValues0 = WindowInsets_androidKt.Q(insets0);
        this.s.g(insetsValues0);
    }

    public final void c(@l View view0) {
        L.p(view0, "view");
        int v = this.v - 1;
        this.v = v;
        if(v == 0) {
            ViewCompat.m2(view0, null);
            ViewCompat.J2(view0, null);
            view0.removeOnAttachStateChangeListener(this.w);
        }
    }

    @l
    public final AndroidWindowInsets d() {
        return this.a;
    }

    @l
    public final ValueInsets e() {
        return this.n;
    }

    public final boolean f() {
        return this.u;
    }

    @l
    public final AndroidWindowInsets g() {
        return this.b;
    }

    @l
    public final AndroidWindowInsets h() {
        return this.c;
    }

    @l
    public final ValueInsets i() {
        return this.t;
    }

    @l
    public final ValueInsets j() {
        return this.s;
    }

    @l
    public final AndroidWindowInsets k() {
        return this.d;
    }

    @l
    public final AndroidWindowInsets l() {
        return this.e;
    }

    @l
    public final ValueInsets m() {
        return this.o;
    }

    @l
    public final WindowInsets n() {
        return this.m;
    }

    @l
    public final WindowInsets o() {
        return this.k;
    }

    @l
    public final WindowInsets p() {
        return this.l;
    }

    @l
    public final AndroidWindowInsets q() {
        return this.f;
    }

    @l
    public final ValueInsets r() {
        return this.p;
    }

    @l
    public final AndroidWindowInsets s() {
        return this.g;
    }

    @l
    public final ValueInsets t() {
        return this.q;
    }

    @l
    public final AndroidWindowInsets u() {
        return this.h;
    }

    @l
    public final AndroidWindowInsets v() {
        return this.i;
    }

    @l
    public final ValueInsets w() {
        return this.r;
    }

    @l
    public final ValueInsets x() {
        return this.j;
    }

    public final void y(@l View view0) {
        L.p(view0, "view");
        if(this.v == 0) {
            ViewCompat.m2(view0, this.w);
            if(view0.isAttachedToWindow()) {
                view0.requestApplyInsets();
            }
            view0.addOnAttachStateChangeListener(this.w);
            ViewCompat.J2(view0, this.w);
        }
        ++this.v;
    }

    public final void z(@l WindowInsetsCompat windowInsetsCompat0, int v) {
        L.p(windowInsetsCompat0, "windowInsets");
        if(WindowInsetsHolder.z) {
            android.view.WindowInsets windowInsets0 = windowInsetsCompat0.K();
            L.m(windowInsets0);
            windowInsetsCompat0 = WindowInsetsCompat.L(windowInsets0);
        }
        L.o(windowInsetsCompat0, "if (testInsets) {\n      …   windowInsets\n        }");
        this.a.j(windowInsetsCompat0, v);
        this.c.j(windowInsetsCompat0, v);
        this.b.j(windowInsetsCompat0, v);
        this.e.j(windowInsetsCompat0, v);
        this.f.j(windowInsetsCompat0, v);
        this.g.j(windowInsetsCompat0, v);
        this.h.j(windowInsetsCompat0, v);
        this.i.j(windowInsetsCompat0, v);
        this.d.j(windowInsetsCompat0, v);
        if(v == 0) {
            Insets insets0 = windowInsetsCompat0.g(4);
            L.o(insets0, "insets.getInsetsIgnoring…aptionBar()\n            )");
            InsetsValues insetsValues0 = WindowInsets_androidKt.Q(insets0);
            this.n.g(insetsValues0);
            Insets insets1 = windowInsetsCompat0.g(2);
            L.o(insets1, "insets.getInsetsIgnoring…ationBars()\n            )");
            InsetsValues insetsValues1 = WindowInsets_androidKt.Q(insets1);
            this.o.g(insetsValues1);
            Insets insets2 = windowInsetsCompat0.g(1);
            L.o(insets2, "insets.getInsetsIgnoring…tatusBars()\n            )");
            InsetsValues insetsValues2 = WindowInsets_androidKt.Q(insets2);
            this.p.g(insetsValues2);
            Insets insets3 = windowInsetsCompat0.g(0x207);
            L.o(insets3, "insets.getInsetsIgnoring…ystemBars()\n            )");
            InsetsValues insetsValues3 = WindowInsets_androidKt.Q(insets3);
            this.q.g(insetsValues3);
            Insets insets4 = windowInsetsCompat0.g(0x40);
            L.o(insets4, "insets.getInsetsIgnoring…leElement()\n            )");
            InsetsValues insetsValues4 = WindowInsets_androidKt.Q(insets4);
            this.r.g(insetsValues4);
            DisplayCutoutCompat displayCutoutCompat0 = windowInsetsCompat0.e();
            if(displayCutoutCompat0 != null) {
                Insets insets5 = displayCutoutCompat0.h();
                L.o(insets5, "cutout.waterfallInsets");
                InsetsValues insetsValues5 = WindowInsets_androidKt.Q(insets5);
                this.j.g(insetsValues5);
            }
        }
        Snapshot.e.l();
    }
}

