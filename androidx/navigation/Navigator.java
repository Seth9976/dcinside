package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.p;
import s3.a;
import s3.b;
import s3.e;
import s3.f;
import y4.l;
import y4.m;

public abstract class Navigator {
    public interface Extras {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @e(a.c)
    @f(allowedTargets = {b.b, b.a})
    public @interface Name {
        String value();
    }

    @m
    private NavigatorState a;
    private boolean b;

    @l
    public abstract NavDestination a();

    @l
    protected final NavigatorState b() {
        NavigatorState navigatorState0 = this.a;
        if(navigatorState0 == null) {
            throw new IllegalStateException("You cannot access the Navigator\'s state until the Navigator is attached");
        }
        return navigatorState0;
    }

    public final boolean c() {
        return this.b;
    }

    @m
    public NavDestination d(@l NavDestination navDestination0, @m Bundle bundle0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        L.p(navDestination0, "destination");
        return navDestination0;
    }

    public void e(@l List list0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        L.p(list0, "entries");
        for(Object object0: p.v0(p.k1(u.A1(list0), new Function1(navOptions0, navigator$Extras0) {
            final Navigator e;
            final NavOptions f;
            final Extras g;

            {
                this.e = navigator0;
                this.f = navOptions0;
                this.g = navigator$Extras0;
                super(1);
            }

            @m
            public final NavBackStackEntry a(@l NavBackStackEntry navBackStackEntry0) {
                L.p(navBackStackEntry0, "backStackEntry");
                NavDestination navDestination0 = navBackStackEntry0.f();
                if(!(navDestination0 instanceof NavDestination)) {
                    navDestination0 = null;
                }
                if(navDestination0 == null) {
                    return null;
                }
                NavDestination navDestination1 = this.e.d(navDestination0, navBackStackEntry0.d(), this.f, this.g);
                if(navDestination1 == null) {
                    return null;
                }
                return L.g(navDestination1, navDestination0) ? navBackStackEntry0 : this.e.b().a(navDestination1, navDestination1.g(navBackStackEntry0.d()));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((NavBackStackEntry)object0));
            }
        }))) {
            this.b().i(((NavBackStackEntry)object0));
        }
    }

    @CallSuper
    public void f(@l NavigatorState navigatorState0) {
        L.p(navigatorState0, "state");
        this.a = navigatorState0;
        this.b = true;
    }

    public void g(@l NavBackStackEntry navBackStackEntry0) {
        L.p(navBackStackEntry0, "backStackEntry");
        NavDestination navDestination0 = navBackStackEntry0.f();
        if(!(navDestination0 instanceof NavDestination)) {
            navDestination0 = null;
        }
        if(navDestination0 == null) {
            return;
        }
        this.d(navDestination0, null, NavOptionsBuilderKt.a(androidx.navigation.Navigator.onLaunchSingleTop.1.e), null);
        this.b().f(navBackStackEntry0);

        final class androidx.navigation.Navigator.onLaunchSingleTop.1 extends N implements Function1 {
            public static final androidx.navigation.Navigator.onLaunchSingleTop.1 e;

            static {
                androidx.navigation.Navigator.onLaunchSingleTop.1.e = new androidx.navigation.Navigator.onLaunchSingleTop.1();
            }

            androidx.navigation.Navigator.onLaunchSingleTop.1() {
                super(1);
            }

            public final void a(@l NavOptionsBuilder navOptionsBuilder0) {
                L.p(navOptionsBuilder0, "$this$navOptions");
                navOptionsBuilder0.m(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((NavOptionsBuilder)object0));
                return S0.a;
            }
        }

    }

    public void h(@l Bundle bundle0) {
        L.p(bundle0, "savedState");
    }

    @m
    public Bundle i() {
        return null;
    }

    public void j(@l NavBackStackEntry navBackStackEntry0, boolean z) {
        L.p(navBackStackEntry0, "popUpTo");
        List list0 = (List)this.b().b().getValue();
        if(!list0.contains(navBackStackEntry0)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry0 + " which does not exist in back stack " + list0).toString());
        }
        ListIterator listIterator0 = list0.listIterator(list0.size());
        NavBackStackEntry navBackStackEntry1 = null;
        while(this.k()) {
            navBackStackEntry1 = (NavBackStackEntry)listIterator0.previous();
            if(L.g(navBackStackEntry1, navBackStackEntry0)) {
                break;
            }
        }
        if(navBackStackEntry1 != null) {
            this.b().g(navBackStackEntry1, z);
        }
    }

    public boolean k() {
        return true;
    }
}

