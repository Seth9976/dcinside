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
public final class FragmentNavigatorDestinationBuilder extends NavDestinationBuilder {
    @l
    private d h;

    @k(message = "Use routes to build your FragmentNavigatorDestination instead", replaceWith = @c0(expression = "FragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public FragmentNavigatorDestinationBuilder(@l FragmentNavigator fragmentNavigator0, @IdRes int v, @l d d0) {
        L.p(fragmentNavigator0, "navigator");
        L.p(d0, "fragmentClass");
        super(fragmentNavigator0, v);
        this.h = d0;
    }

    public FragmentNavigatorDestinationBuilder(@l FragmentNavigator fragmentNavigator0, @l String s, @l d d0) {
        L.p(fragmentNavigator0, "navigator");
        L.p(s, "route");
        L.p(d0, "fragmentClass");
        super(fragmentNavigator0, s);
        this.h = d0;
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination c() {
        return this.k();
    }

    @l
    public Destination k() {
        Destination fragmentNavigator$Destination0 = (Destination)super.c();
        String s = b.e(this.h).getName();
        L.o(s, "fragmentClass.java.name");
        fragmentNavigator$Destination0.O(s);
        return fragmentNavigator$Destination0;
    }
}

