package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class ActivityNavigatorDestinationBuilderKt {
    @k(message = "Use routes to build your ActivityDestination instead", replaceWith = @c0(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void a(@l NavGraphBuilder navGraphBuilder0, @IdRes int v, @l Function1 function10) {
        L.p(navGraphBuilder0, "<this>");
        L.p(function10, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder0 = new ActivityNavigatorDestinationBuilder(((ActivityNavigator)navGraphBuilder0.n().e(ActivityNavigator.class)), v);
        function10.invoke(activityNavigatorDestinationBuilder0);
        navGraphBuilder0.m(activityNavigatorDestinationBuilder0);
    }

    public static final void b(@l NavGraphBuilder navGraphBuilder0, @l String s, @l Function1 function10) {
        L.p(navGraphBuilder0, "<this>");
        L.p(s, "route");
        L.p(function10, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder0 = new ActivityNavigatorDestinationBuilder(((ActivityNavigator)navGraphBuilder0.n().e(ActivityNavigator.class)), s);
        function10.invoke(activityNavigatorDestinationBuilder0);
        navGraphBuilder0.m(activityNavigatorDestinationBuilder0);
    }
}

