package androidx.core.splashscreen;

import A3.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import androidx.annotation.RequiresApi;
import j..time.Duration;
import j..time.Instant;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import y4.l;

@SuppressLint({"ViewConstructor"})
public final class SplashScreenViewProvider {
    @RequiresApi(0x1F)
    static final class ViewImpl31 extends ViewImpl {
        public SplashScreenView c;

        public ViewImpl31(@l Activity activity0) {
            L.p(activity0, "activity");
            super(activity0);
        }

        @Override  // androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl
        public void a() {
        }

        @Override  // androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl
        public long c() {
            Duration duration0 = m.a(this.i());
            return duration0 == null ? 0L : duration0.toMillis();
        }

        @Override  // androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl
        public long d() {
            Instant instant0 = androidx.core.splashscreen.l.a(this.i());
            return instant0 == null ? 0L : instant0.toEpochMilli();
        }

        @Override  // androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl
        @l
        public View e() {
            View view0 = this.i().getIconView();
            L.m(view0);
            return view0;
        }

        @Override  // androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl
        public ViewGroup f() {
            return this.j();
        }

        @Override  // androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl
        public void h() {
            this.i().remove();
            Resources.Theme resources$Theme0 = this.b().getTheme();
            L.o(resources$Theme0, "activity.theme");
            View view0 = this.b().getWindow().getDecorView();
            L.o(view0, "activity.window.decorView");
            Api31.c(resources$Theme0, view0, null, 4, null);
        }

        @l
        public final SplashScreenView i() {
            SplashScreenView splashScreenView0 = this.c;
            if(splashScreenView0 != null) {
                return splashScreenView0;
            }
            L.S("platformView");
            return null;
        }

        @l
        public SplashScreenView j() {
            return this.i();
        }

        public final void k(@l SplashScreenView splashScreenView0) {
            L.p(splashScreenView0, "<set-?>");
            this.c = splashScreenView0;
        }
    }

    static class ViewImpl {
        @l
        private final Activity a;
        @l
        private final D b;

        public ViewImpl(@l Activity activity0) {
            L.p(activity0, "activity");
            super();
            this.a = activity0;
            this.b = E.a(new a() {
                final ViewImpl e;

                {
                    this.e = splashScreenViewProvider$ViewImpl0;
                    super(0);
                }

                @l
                public final ViewGroup b() {
                    View view0 = View.inflate(this.e.b(), layout.splash_screen_view, null);
                    if(view0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    return (ViewGroup)view0;
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            });
        }

        public void a() {
            View view0 = ((ViewGroup)this.a.findViewById(0x1020002)).getRootView();
            ViewGroup viewGroup0 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
            if(viewGroup0 != null) {
                viewGroup0.addView(this.g());
            }
        }

        @l
        public final Activity b() {
            return this.a;
        }

        public long c() {
            return 0L;
        }

        public long d() {
            return 0L;
        }

        @l
        public View e() {
            View view0 = this.f().findViewById(id.splashscreen_icon_view);
            L.o(view0, "splashScreenView.findVie…d.splashscreen_icon_view)");
            return view0;
        }

        @l
        public ViewGroup f() {
            return this.g();
        }

        private final ViewGroup g() {
            return (ViewGroup)this.b.getValue();
        }

        public void h() {
            ViewParent viewParent0 = this.f().getParent();
            ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
            if(viewGroup0 != null) {
                viewGroup0.removeView(this.f());
            }
        }
    }

    @l
    private final ViewImpl a;

    public SplashScreenViewProvider(@l Activity activity0) {
        L.p(activity0, "ctx");
        super();
        ViewImpl splashScreenViewProvider$ViewImpl0 = Build.VERSION.SDK_INT >= 0x1F ? new ViewImpl31(activity0) : new ViewImpl(activity0);
        splashScreenViewProvider$ViewImpl0.a();
        this.a = splashScreenViewProvider$ViewImpl0;
    }

    @RequiresApi(0x1F)
    public SplashScreenViewProvider(@l SplashScreenView splashScreenView0, @l Activity activity0) {
        L.p(splashScreenView0, "platformView");
        L.p(activity0, "ctx");
        this(activity0);
        ((ViewImpl31)this.a).k(splashScreenView0);
    }

    public final long a() {
        return this.a.c();
    }

    public final long b() {
        return this.a.d();
    }

    @l
    public final View c() {
        return this.a.e();
    }

    @l
    public final View d() {
        return this.a.f();
    }

    public final void e() {
        this.a.h();
    }
}

