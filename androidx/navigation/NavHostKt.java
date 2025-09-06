package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

public final class NavHostKt {
    @k(message = "Use routes to create your NavGraph instead", replaceWith = @c0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @l
    public static final NavGraph a(@l NavHost navHost0, @IdRes int v, @IdRes int v1, @l Function1 function10) {
        L.p(navHost0, "<this>");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.U().N(), v, v1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.l();
    }

    @l
    public static final NavGraph b(@l NavHost navHost0, @l String s, @m String s1, @l Function1 function10) {
        L.p(navHost0, "<this>");
        L.p(s, "startDestination");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.U().N(), s, s1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.l();
    }

    public static NavGraph c(NavHost navHost0, int v, int v1, Function1 function10, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        L.p(navHost0, "<this>");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.U().N(), v, v1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.l();
    }

    public static NavGraph d(NavHost navHost0, String s, String s1, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        L.p(navHost0, "<this>");
        L.p(s, "startDestination");
        L.p(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.U().N(), s, s1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.l();
    }
}

