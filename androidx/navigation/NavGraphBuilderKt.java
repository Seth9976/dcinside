package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

public final class NavGraphBuilderKt {
    @k(message = "Use routes to build your NavGraph instead", replaceWith = @c0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @l
    public static final NavGraph a(@l NavigatorProvider navigatorProvider0, @IdRes int v, @IdRes int v1, @l Function1 function10) {
        L.p(navigatorProvider0, "<this>");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, v, v1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.l();
    }

    @l
    public static final NavGraph b(@l NavigatorProvider navigatorProvider0, @l String s, @m String s1, @l Function1 function10) {
        L.p(navigatorProvider0, "<this>");
        L.p(s, "startDestination");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, s, s1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.l();
    }

    @k(message = "Use routes to build your nested NavGraph instead", replaceWith = @c0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void c(@l NavGraphBuilder navGraphBuilder0, @IdRes int v, @IdRes int v1, @l Function1 function10) {
        L.p(navGraphBuilder0, "<this>");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.n(), v, v1);
        function10.invoke(navGraphBuilder1);
        navGraphBuilder0.m(navGraphBuilder1);
    }

    public static final void d(@l NavGraphBuilder navGraphBuilder0, @l String s, @l String s1, @l Function1 function10) {
        L.p(navGraphBuilder0, "<this>");
        L.p(s, "startDestination");
        L.p(s1, "route");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.n(), s, s1);
        function10.invoke(navGraphBuilder1);
        navGraphBuilder0.m(navGraphBuilder1);
    }

    public static NavGraph e(NavigatorProvider navigatorProvider0, int v, int v1, Function1 function10, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        L.p(navigatorProvider0, "<this>");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, v, v1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.l();
    }

    public static NavGraph f(NavigatorProvider navigatorProvider0, String s, String s1, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        L.p(navigatorProvider0, "<this>");
        L.p(s, "startDestination");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, s, s1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.l();
    }
}

