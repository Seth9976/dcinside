package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.reflect.d;
import y4.l;
import z3.b;

@NavDestinationDsl
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder {
    @l
    private d h;

    @k(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @c0(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public DialogFragmentNavigatorDestinationBuilder(@l DialogFragmentNavigator dialogFragmentNavigator0, @IdRes int v, @l d d0) {
        L.p(dialogFragmentNavigator0, "navigator");
        L.p(d0, "fragmentClass");
        super(dialogFragmentNavigator0, v);
        this.h = d0;
    }

    public DialogFragmentNavigatorDestinationBuilder(@l DialogFragmentNavigator dialogFragmentNavigator0, @l String s, @l d d0) {
        L.p(dialogFragmentNavigator0, "navigator");
        L.p(s, "route");
        L.p(d0, "fragmentClass");
        super(dialogFragmentNavigator0, s);
        this.h = d0;
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination c() {
        return this.k();
    }

    @l
    public Destination k() {
        Destination dialogFragmentNavigator$Destination0 = (Destination)super.c();
        String s = b.e(this.h).getName();
        L.o(s, "fragmentClass.java.name");
        dialogFragmentNavigator$Destination0.O(s);
        return dialogFragmentNavigator$Destination0;
    }
}

