package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.k;

public final class FragmentNavigatorDestinationBuilderKt {
    @k(message = "Use routes to create your FragmentDestination instead", replaceWith = @c0(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final void a(NavGraphBuilder navGraphBuilder0, @IdRes int v) {
        L.p(navGraphBuilder0, "<this>");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.n().e(FragmentNavigator.class);
        L.y(4, "F");
        navGraphBuilder0.m(new FragmentNavigatorDestinationBuilder(fragmentNavigator0, v, m0.d(Fragment.class)));
    }

    @k(message = "Use routes to create your FragmentDestination instead", replaceWith = @c0(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void b(NavGraphBuilder navGraphBuilder0, @IdRes int v, Function1 function10) {
        L.p(navGraphBuilder0, "<this>");
        L.p(function10, "builder");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.n().e(FragmentNavigator.class);
        L.y(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder0 = new FragmentNavigatorDestinationBuilder(fragmentNavigator0, v, m0.d(Fragment.class));
        function10.invoke(fragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.m(fragmentNavigatorDestinationBuilder0);
    }

    public static final void c(NavGraphBuilder navGraphBuilder0, String s) {
        L.p(navGraphBuilder0, "<this>");
        L.p(s, "route");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.n().e(FragmentNavigator.class);
        L.y(4, "F");
        navGraphBuilder0.m(new FragmentNavigatorDestinationBuilder(fragmentNavigator0, s, m0.d(Fragment.class)));
    }

    public static final void d(NavGraphBuilder navGraphBuilder0, String s, Function1 function10) {
        L.p(navGraphBuilder0, "<this>");
        L.p(s, "route");
        L.p(function10, "builder");
        FragmentNavigator fragmentNavigator0 = (FragmentNavigator)navGraphBuilder0.n().e(FragmentNavigator.class);
        L.y(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder0 = new FragmentNavigatorDestinationBuilder(fragmentNavigator0, s, m0.d(Fragment.class));
        function10.invoke(fragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.m(fragmentNavigatorDestinationBuilder0);
    }
}

