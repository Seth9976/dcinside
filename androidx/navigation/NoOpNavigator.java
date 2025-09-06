package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
@Name("NoOp")
public final class NoOpNavigator extends Navigator {
    @Override  // androidx.navigation.Navigator
    @l
    public NavDestination a() {
        return new NavDestination(this);
    }

    @Override  // androidx.navigation.Navigator
    @l
    public NavDestination d(@l NavDestination navDestination0, @m Bundle bundle0, @m NavOptions navOptions0, @m Extras navigator$Extras0) {
        L.p(navDestination0, "destination");
        return navDestination0;
    }

    @Override  // androidx.navigation.Navigator
    public boolean k() {
        return true;
    }
}

