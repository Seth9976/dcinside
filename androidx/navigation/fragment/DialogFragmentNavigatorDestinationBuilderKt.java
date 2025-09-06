package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavGraphBuilder;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.k;

public final class DialogFragmentNavigatorDestinationBuilderKt {
    @k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @c0(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final void a(NavGraphBuilder navGraphBuilder0, @IdRes int v) {
        L.p(navGraphBuilder0, "<this>");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.n().e(DialogFragmentNavigator.class);
        L.y(4, "F");
        navGraphBuilder0.m(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, v, m0.d(DialogFragment.class)));
    }

    @k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @c0(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void b(NavGraphBuilder navGraphBuilder0, @IdRes int v, Function1 function10) {
        L.p(navGraphBuilder0, "<this>");
        L.p(function10, "builder");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.n().e(DialogFragmentNavigator.class);
        L.y(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder0 = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, v, m0.d(DialogFragment.class));
        function10.invoke(dialogFragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.m(dialogFragmentNavigatorDestinationBuilder0);
    }

    public static final void c(NavGraphBuilder navGraphBuilder0, String s) {
        L.p(navGraphBuilder0, "<this>");
        L.p(s, "route");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.n().e(DialogFragmentNavigator.class);
        L.y(4, "F");
        navGraphBuilder0.m(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, s, m0.d(DialogFragment.class)));
    }

    public static final void d(NavGraphBuilder navGraphBuilder0, String s, Function1 function10) {
        L.p(navGraphBuilder0, "<this>");
        L.p(s, "route");
        L.p(function10, "builder");
        DialogFragmentNavigator dialogFragmentNavigator0 = (DialogFragmentNavigator)navGraphBuilder0.n().e(DialogFragmentNavigator.class);
        L.y(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder0 = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator0, s, m0.d(DialogFragment.class));
        function10.invoke(dialogFragmentNavigatorDestinationBuilder0);
        navGraphBuilder0.m(dialogFragmentNavigatorDestinationBuilder0);
    }
}

