package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.p;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public final class Navigation {
    @l
    public static final Navigation a;

    static {
        Navigation.a = new Navigation();
    }

    @l
    @j
    @n
    public static final View.OnClickListener d(@IdRes int v) {
        return Navigation.g(v, null, 2, null);
    }

    @l
    @j
    @n
    public static final View.OnClickListener e(@IdRes int v, @m Bundle bundle0) {
        return (View view0) -> {
            L.o(view0, "view");
            Navigation.k(view0).W(v, bundle0);
        };
    }

    @l
    @n
    public static final View.OnClickListener f(@l NavDirections navDirections0) {
        L.p(navDirections0, "directions");
        return (View view0) -> {
            L.p(navDirections0, "$directions");
            L.o(view0, "view");
            Navigation.k(view0).g0(navDirections0);
        };
    }

    public static View.OnClickListener g(int v, Bundle bundle0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            bundle0 = null;
        }
        return Navigation.e(v, bundle0);
    }

    // 检测为 Lambda 实现
    private static final void h(int v, Bundle bundle0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void i(NavDirections navDirections0, View view0) [...]

    @l
    @n
    public static final NavController j(@l Activity activity0, @IdRes int v) {
        L.p(activity0, "activity");
        View view0 = ActivityCompat.n(activity0, v);
        L.o(view0, "requireViewById<View>(activity, viewId)");
        NavController navController0 = Navigation.a.l(view0);
        if(navController0 == null) {
            throw new IllegalStateException("Activity " + activity0 + " does not have a NavController set on " + v);
        }
        return navController0;
    }

    @l
    @n
    public static final NavController k(@l View view0) {
        L.p(view0, "view");
        NavController navController0 = Navigation.a.l(view0);
        if(navController0 == null) {
            throw new IllegalStateException("View " + view0 + " does not have a NavController set");
        }
        return navController0;
    }

    private final NavController l(View view0) {
        return (NavController)p.F0(p.p1(p.n(view0, androidx.navigation.Navigation.findViewNavController.1.e), androidx.navigation.Navigation.findViewNavController.2.e));

        final class androidx.navigation.Navigation.findViewNavController.1 extends N implements Function1 {
            public static final androidx.navigation.Navigation.findViewNavController.1 e;

            static {
                androidx.navigation.Navigation.findViewNavController.1.e = new androidx.navigation.Navigation.findViewNavController.1();
            }

            androidx.navigation.Navigation.findViewNavController.1() {
                super(1);
            }

            @m
            public final View b(@l View view0) {
                L.p(view0, "it");
                ViewParent viewParent0 = view0.getParent();
                return viewParent0 instanceof View ? ((View)viewParent0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }


        final class androidx.navigation.Navigation.findViewNavController.2 extends N implements Function1 {
            public static final androidx.navigation.Navigation.findViewNavController.2 e;

            static {
                androidx.navigation.Navigation.findViewNavController.2.e = new androidx.navigation.Navigation.findViewNavController.2();
            }

            androidx.navigation.Navigation.findViewNavController.2() {
                super(1);
            }

            @m
            public final NavController b(@l View view0) {
                L.p(view0, "it");
                return Navigation.a.m(view0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }

    }

    private final NavController m(View view0) {
        Object object0 = view0.getTag(id.nav_controller_view_tag);
        if(object0 instanceof WeakReference) {
            return (NavController)((WeakReference)object0).get();
        }
        return object0 instanceof NavController ? ((NavController)object0) : null;
    }

    @n
    public static final void n(@l View view0, @m NavController navController0) {
        L.p(view0, "view");
        view0.setTag(id.nav_controller_view_tag, navController0);
    }
}

