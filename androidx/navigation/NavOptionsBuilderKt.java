package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class NavOptionsBuilderKt {
    @l
    public static final NavOptions a(@l Function1 function10) {
        L.p(function10, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder0 = new NavOptionsBuilder();
        function10.invoke(navOptionsBuilder0);
        return navOptionsBuilder0.b();
    }
}

