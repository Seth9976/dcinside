package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.internal.L;
import y4.l;

public final class NavGraphKt {
    public static final boolean a(@l NavGraph navGraph0, @IdRes int v) {
        L.p(navGraph0, "<this>");
        return navGraph0.U(v) != null;
    }

    public static final boolean b(@l NavGraph navGraph0, @l String s) {
        L.p(navGraph0, "<this>");
        L.p(s, "route");
        return navGraph0.W(s) != null;
    }

    @l
    public static final NavDestination c(@l NavGraph navGraph0, @IdRes int v) {
        L.p(navGraph0, "<this>");
        NavDestination navDestination0 = navGraph0.U(v);
        if(navDestination0 == null) {
            throw new IllegalArgumentException("No destination for " + v + " was found in " + navGraph0);
        }
        return navDestination0;
    }

    @l
    public static final NavDestination d(@l NavGraph navGraph0, @l String s) {
        L.p(navGraph0, "<this>");
        L.p(s, "route");
        NavDestination navDestination0 = navGraph0.W(s);
        if(navDestination0 == null) {
            throw new IllegalArgumentException("No destination for " + s + " was found in " + navGraph0);
        }
        return navDestination0;
    }

    public static final void e(@l NavGraph navGraph0, @l NavDestination navDestination0) {
        L.p(navGraph0, "<this>");
        L.p(navDestination0, "node");
        navGraph0.g0(navDestination0);
    }

    public static final void f(@l NavGraph navGraph0, @l NavDestination navDestination0) {
        L.p(navGraph0, "<this>");
        L.p(navDestination0, "node");
        navGraph0.O(navDestination0);
    }

    public static final void g(@l NavGraph navGraph0, @l NavGraph navGraph1) {
        L.p(navGraph0, "<this>");
        L.p(navGraph1, "other");
        navGraph0.N(navGraph1);
    }
}

