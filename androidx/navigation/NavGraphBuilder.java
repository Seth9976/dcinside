package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.ArrayList;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

@NavDestinationDsl
public class NavGraphBuilder extends NavDestinationBuilder {
    @l
    private final NavigatorProvider h;
    @IdRes
    private int i;
    @m
    private String j;
    @l
    private final List k;

    @k(message = "Use routes to build your NavGraph instead", replaceWith = @c0(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public NavGraphBuilder(@l NavigatorProvider navigatorProvider0, @IdRes int v, @IdRes int v1) {
        L.p(navigatorProvider0, "provider");
        super(navigatorProvider0.e(NavGraphNavigator.class), v);
        this.k = new ArrayList();
        this.h = navigatorProvider0;
        this.i = v1;
    }

    public NavGraphBuilder(@l NavigatorProvider navigatorProvider0, @l String s, @m String s1) {
        L.p(navigatorProvider0, "provider");
        L.p(s, "startDestination");
        super(navigatorProvider0.e(NavGraphNavigator.class), s1);
        this.k = new ArrayList();
        this.h = navigatorProvider0;
        this.j = s;
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination c() {
        return this.l();
    }

    public final void k(@l NavDestination navDestination0) {
        L.p(navDestination0, "destination");
        this.k.add(navDestination0);
    }

    @l
    public NavGraph l() {
        NavGraph navGraph0 = (NavGraph)super.c();
        navGraph0.P(this.k);
        int v = this.i;
        if(v == 0 && this.j == null) {
            throw this.i() == null ? new IllegalStateException("You must set a start destination id") : new IllegalStateException("You must set a start destination route");
        }
        String s = this.j;
        if(s != null) {
            L.m(s);
            navGraph0.i0(s);
            return navGraph0;
        }
        navGraph0.h0(v);
        return navGraph0;
    }

    public final void m(@l NavDestinationBuilder navDestinationBuilder0) {
        L.p(navDestinationBuilder0, "navDestination");
        NavDestination navDestination0 = navDestinationBuilder0.c();
        this.k.add(navDestination0);
    }

    @l
    public final NavigatorProvider n() {
        return this.h;
    }

    public final void o(@l NavDestination navDestination0) {
        L.p(navDestination0, "<this>");
        this.k(navDestination0);
    }
}

