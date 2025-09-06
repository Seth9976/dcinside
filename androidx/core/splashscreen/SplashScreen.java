package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreenView;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@SuppressLint({"CustomSplashScreen"})
public final class SplashScreen {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final SplashScreen a(@l Activity activity0) {
            L.p(activity0, "<this>");
            SplashScreen splashScreen0 = new SplashScreen(activity0, null);
            splashScreen0.b();
            return splashScreen0;
        }
    }

    @RequiresApi(0x1F)
    static final class Impl31 extends Impl {
        @m
        private ViewTreeObserver.OnPreDrawListener j;
        private boolean k;
        @l
        private final ViewGroup.OnHierarchyChangeListener l;

        public Impl31(@l Activity activity0) {
            L.p(activity0, "activity");
            super(activity0);
            this.k = true;
            this.l = new ViewGroup.OnHierarchyChangeListener() {
                @Override  // android.view.ViewGroup$OnHierarchyChangeListener
                public void onChildViewAdded(@m View view0, @m View view1) {
                    if(j.a(view1)) {
                        boolean z = activity0.B(((SplashScreenView)view1));
                        activity0.F(z);
                        ((ViewGroup)this.b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    }
                }

                @Override  // android.view.ViewGroup$OnHierarchyChangeListener
                public void onChildViewRemoved(@m View view0, @m View view1) {
                }
            };
        }

        private final void A() {
            TypedValue typedValue0 = new TypedValue();
            Resources.Theme resources$Theme0 = this.h().getTheme();
            Window window0 = this.h().getWindow();
            boolean z = true;
            if(resources$Theme0.resolveAttribute(0x1010451, typedValue0, true)) {
                window0.setStatusBarColor(typedValue0.data);
            }
            if(resources$Theme0.resolveAttribute(0x1010452, typedValue0, true)) {
                window0.setNavigationBarColor(typedValue0.data);
            }
            if(resources$Theme0.resolveAttribute(0x1010450, typedValue0, true)) {
                if(typedValue0.data == 0) {
                    window0.clearFlags(0x80000000);
                }
                else {
                    window0.addFlags(0x80000000);
                }
            }
            if(resources$Theme0.resolveAttribute(0x1010605, typedValue0, true)) {
                window0.setNavigationBarContrastEnforced(typedValue0.data != 0);
            }
            if(resources$Theme0.resolveAttribute(0x1010604, typedValue0, true)) {
                if(typedValue0.data == 0) {
                    z = false;
                }
                window0.setStatusBarContrastEnforced(z);
            }
            ViewGroup viewGroup0 = (ViewGroup)window0.getDecorView();
            L.o(resources$Theme0, "theme");
            Api31.b(resources$Theme0, viewGroup0, typedValue0);
            viewGroup0.setOnHierarchyChangeListener(null);
            window0.setDecorFitsSystemWindows(this.k);
        }

        public final boolean B(@l SplashScreenView splashScreenView0) {
            L.p(splashScreenView0, "child");
            WindowInsets windowInsets0 = h.a().build();
            L.o(windowInsets0, "Builder().build()");
            Rect rect0 = new Rect(0x80000000, 0x80000000, 0x7FFFFFFF, 0x7FFFFFFF);
            return windowInsets0 != splashScreenView0.getRootView().computeSystemWindowInsets(windowInsets0, rect0) || !rect0.isEmpty();
        }

        @l
        public final ViewGroup.OnHierarchyChangeListener C() {
            return this.l;
        }

        public final boolean D() {
            return this.k;
        }

        @m
        public final ViewTreeObserver.OnPreDrawListener E() {
            return this.j;
        }

        public final void F(boolean z) {
            this.k = z;
        }

        // 检测为 Lambda 实现
        private static final void G(Impl31 splashScreen$Impl310, OnExitAnimationListener splashScreen$OnExitAnimationListener0, SplashScreenView splashScreenView0) [...]

        public final void H(@m ViewTreeObserver.OnPreDrawListener viewTreeObserver$OnPreDrawListener0) {
            this.j = viewTreeObserver$OnPreDrawListener0;
        }

        @Override  // androidx.core.splashscreen.SplashScreen$Impl
        public void o() {
            Resources.Theme resources$Theme0 = this.h().getTheme();
            L.o(resources$Theme0, "activity.theme");
            this.w(resources$Theme0, new TypedValue());
            ((ViewGroup)this.h().getWindow().getDecorView()).setOnHierarchyChangeListener(this.l);
        }

        @Override  // androidx.core.splashscreen.SplashScreen$Impl
        public void u(@l KeepOnScreenCondition splashScreen$KeepOnScreenCondition0) {
            L.p(splashScreen$KeepOnScreenCondition0, "keepOnScreenCondition");
            this.x(splashScreen$KeepOnScreenCondition0);
            View view0 = this.h().findViewById(0x1020002);
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(this.j != null && viewTreeObserver0.isAlive()) {
                viewTreeObserver0.removeOnPreDrawListener(this.j);
            }
            androidx.core.splashscreen.SplashScreen.Impl31.setKeepOnScreenCondition.1 splashScreen$Impl31$setKeepOnScreenCondition$10 = new ViewTreeObserver.OnPreDrawListener() {
                @Override  // android.view.ViewTreeObserver$OnPreDrawListener
                public boolean onPreDraw() {
                    if(view0.n().a()) {
                        return false;
                    }
                    this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            };
            this.j = splashScreen$Impl31$setKeepOnScreenCondition$10;
            viewTreeObserver0.addOnPreDrawListener(splashScreen$Impl31$setKeepOnScreenCondition$10);
        }

        @Override  // androidx.core.splashscreen.SplashScreen$Impl
        public void v(@l OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
            L.p(splashScreen$OnExitAnimationListener0, "exitAnimationListener");
            this.h().getSplashScreen().setOnExitAnimationListener((SplashScreenView splashScreenView0) -> {
                L.p(this, "this$0");
                L.p(splashScreen$OnExitAnimationListener0, "$exitAnimationListener");
                L.p(splashScreenView0, "splashScreenView");
                this.A();
                splashScreen$OnExitAnimationListener0.a(new SplashScreenViewProvider(splashScreenView0, this.h()));
            });
        }
    }

    static class Impl {
        @l
        private final Activity a;
        private int b;
        @m
        private Integer c;
        @m
        private Integer d;
        @m
        private Drawable e;
        private boolean f;
        @l
        private KeepOnScreenCondition g;
        @m
        private OnExitAnimationListener h;
        @m
        private SplashScreenViewProvider i;

        public Impl(@l Activity activity0) {
            L.p(activity0, "activity");
            super();
            this.a = activity0;
            this.g = new a();
        }

        public static boolean a() [...] // 潜在的解密器

        public final void e(@l SplashScreenViewProvider splashScreenViewProvider0) {
            L.p(splashScreenViewProvider0, "splashScreenViewProvider");
            OnExitAnimationListener splashScreen$OnExitAnimationListener0 = this.h;
            if(splashScreen$OnExitAnimationListener0 == null) {
                return;
            }
            this.h = null;
            splashScreenViewProvider0.d().postOnAnimation(() -> {
                L.p(splashScreenViewProvider0, "$splashScreenViewProvider");
                L.p(splashScreen$OnExitAnimationListener0, "$finalListener");
                splashScreenViewProvider0.d().bringToFront();
                splashScreen$OnExitAnimationListener0.a(splashScreenViewProvider0);
            });
        }

        // 检测为 Lambda 实现
        private static final void f(SplashScreenViewProvider splashScreenViewProvider0, OnExitAnimationListener splashScreen$OnExitAnimationListener0) [...]

        private final void g(View view0, Drawable drawable0) {
            float f;
            ImageView imageView0 = (ImageView)view0.findViewById(id.splashscreen_icon_view);
            if(this.f) {
                Drawable drawable1 = imageView0.getContext().getDrawable(drawable.icon_background);
                f = imageView0.getResources().getDimension(dimen.splashscreen_icon_size_with_background) * 0.666667f;
                if(drawable1 != null) {
                    imageView0.setBackground(new MaskedDrawable(drawable1, f));
                }
            }
            else {
                f = imageView0.getResources().getDimension(dimen.splashscreen_icon_size_no_background) * 0.666667f;
            }
            imageView0.setImageDrawable(new MaskedDrawable(drawable0, f));
        }

        @l
        public final Activity h() {
            return this.a;
        }

        @m
        public final Integer i() {
            return this.d;
        }

        @m
        public final Integer j() {
            return this.c;
        }

        public final int k() {
            return this.b;
        }

        public final boolean l() {
            return this.f;
        }

        @m
        public final Drawable m() {
            return this.e;
        }

        @l
        public final KeepOnScreenCondition n() {
            return this.g;
        }

        public void o() {
            TypedValue typedValue0 = new TypedValue();
            Resources.Theme resources$Theme0 = this.a.getTheme();
            boolean z = true;
            if(resources$Theme0.resolveAttribute(attr.windowSplashScreenBackground, typedValue0, true)) {
                this.c = typedValue0.resourceId;
                this.d = typedValue0.data;
            }
            if(resources$Theme0.resolveAttribute(attr.windowSplashScreenAnimatedIcon, typedValue0, true)) {
                this.e = resources$Theme0.getDrawable(typedValue0.resourceId);
            }
            if(resources$Theme0.resolveAttribute(attr.splashScreenIconSize, typedValue0, true)) {
                if(typedValue0.resourceId != dimen.splashscreen_icon_size_with_background) {
                    z = false;
                }
                this.f = z;
            }
            L.o(resources$Theme0, "currentTheme");
            this.w(resources$Theme0, typedValue0);
        }

        public final void p(@m Integer integer0) {
            this.d = integer0;
        }

        public final void q(@m Integer integer0) {
            this.c = integer0;
        }

        public final void r(int v) {
            this.b = v;
        }

        public final void s(boolean z) {
            this.f = z;
        }

        public final void t(@m Drawable drawable0) {
            this.e = drawable0;
        }

        public void u(@l KeepOnScreenCondition splashScreen$KeepOnScreenCondition0) {
            L.p(splashScreen$KeepOnScreenCondition0, "keepOnScreenCondition");
            this.g = splashScreen$KeepOnScreenCondition0;
            View view0 = this.a.findViewById(0x1020002);
            view0.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override  // android.view.ViewTreeObserver$OnPreDrawListener
                public boolean onPreDraw() {
                    if(view0.n().a()) {
                        return false;
                    }
                    this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                    SplashScreenViewProvider splashScreenViewProvider0 = view0.i;
                    if(splashScreenViewProvider0 != null) {
                        view0.e(splashScreenViewProvider0);
                    }
                    return true;
                }
            });
        }

        public void v(@l OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
            L.p(splashScreen$OnExitAnimationListener0, "exitAnimationListener");
            this.h = splashScreen$OnExitAnimationListener0;
            SplashScreenViewProvider splashScreenViewProvider0 = new SplashScreenViewProvider(this.a);
            Integer integer0 = this.c;
            Integer integer1 = this.d;
            View view0 = splashScreenViewProvider0.d();
            if(integer0 != null && ((int)integer0) != 0) {
                view0.setBackgroundResource(((int)integer0));
            }
            else if(integer1 == null) {
                view0.setBackground(this.a.getWindow().getDecorView().getBackground());
            }
            else {
                view0.setBackgroundColor(((int)integer1));
            }
            Drawable drawable0 = this.e;
            if(drawable0 != null) {
                this.g(view0, drawable0);
            }
            view0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override  // android.view.View$OnLayoutChangeListener
                public void onLayoutChange(@l View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                    L.p(view0, "view");
                    if(!view0.isAttachedToWindow()) {
                        return;
                    }
                    view0.removeOnLayoutChangeListener(this);
                    if(!splashScreenViewProvider0.n().a()) {
                        splashScreenViewProvider0.e(this.b);
                        return;
                    }
                    splashScreenViewProvider0.i = this.b;
                }
            });
        }

        protected final void w(@l Resources.Theme resources$Theme0, @l TypedValue typedValue0) {
            L.p(resources$Theme0, "currentTheme");
            L.p(typedValue0, "typedValue");
            if(resources$Theme0.resolveAttribute(attr.postSplashScreenTheme, typedValue0, true)) {
                int v = typedValue0.resourceId;
                this.b = v;
                if(v != 0) {
                    this.a.setTheme(v);
                }
            }
        }

        public final void x(@l KeepOnScreenCondition splashScreen$KeepOnScreenCondition0) {
            L.p(splashScreen$KeepOnScreenCondition0, "<set-?>");
            this.g = splashScreen$KeepOnScreenCondition0;
        }

        private static final boolean y() [...] // Inlined contents
    }

    public interface KeepOnScreenCondition {
        @MainThread
        boolean a();
    }

    public interface OnExitAnimationListener {
        @MainThread
        void a(@l SplashScreenViewProvider arg1);
    }

    @l
    private final Impl a;
    @l
    public static final Companion b = null;
    private static final float c = 0.666667f;

    static {
        SplashScreen.b = new Companion(null);
    }

    private SplashScreen(Activity activity0) {
        Impl splashScreen$Impl0 = Build.VERSION.SDK_INT >= 0x1F ? new Impl31(activity0) : new Impl(activity0);
        this.a = splashScreen$Impl0;
    }

    public SplashScreen(Activity activity0, w w0) {
        this(activity0);
    }

    private final void b() {
        this.a.o();
    }

    @l
    @n
    public static final SplashScreen c(@l Activity activity0) {
        return SplashScreen.b.a(activity0);
    }

    public final void d(@l KeepOnScreenCondition splashScreen$KeepOnScreenCondition0) {
        L.p(splashScreen$KeepOnScreenCondition0, "condition");
        this.a.u(splashScreen$KeepOnScreenCondition0);
    }

    public final void e(@l OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
        L.p(splashScreen$OnExitAnimationListener0, "listener");
        this.a.v(splashScreen$OnExitAnimationListener0);
    }
}

