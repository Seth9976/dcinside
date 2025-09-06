package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Name("navigation")
public class NavGraphNavigator extends Navigator {
    @l
    private final NavigatorProvider c;

    public NavGraphNavigator(@l NavigatorProvider navigatorProvider0) {
        L.p(navigatorProvider0, "navigatorProvider");
        super();
        this.c = navigatorProvider0;
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination a() {
        return this.l();
    }

    @Override  // androidx.navigation.Navigator
    public void e(@l List list0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        L.p(list0, "entries");
        for(Object object0: list0) {
            this.m(((NavBackStackEntry)object0), navOptions0, navigator$Extras0);
        }
    }

    @l
    public NavGraph l() {
        return new NavGraph(this);
    }

    private final void m(NavBackStackEntry navBackStackEntry0, NavOptions navOptions0, Extras navigator$Extras0) {
        NavGraph navGraph0 = (NavGraph)navBackStackEntry0.f();
        Bundle bundle0 = navBackStackEntry0.d();
        int v = navGraph0.c0();
        String s = navGraph0.d0();
        if(v == 0 && s == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph0.m()).toString());
        }
        NavDestination navDestination0 = s == null ? navGraph0.V(v, false) : navGraph0.X(s, false);
        if(navDestination0 == null) {
            throw new IllegalArgumentException("navigation destination " + navGraph0.a0() + " is not a direct child of this NavGraph");
        }
        this.c.f(navDestination0.t()).e(u.k(this.b().a(navDestination0, navDestination0.g(bundle0))), navOptions0, navigator$Extras0);
    }
}

