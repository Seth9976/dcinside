package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class NavDeepLinkDslBuilderKt {
    @l
    public static final NavDeepLink a(@l Function1 function10) {
        L.p(function10, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder0 = new NavDeepLinkDslBuilder();
        function10.invoke(navDeepLinkDslBuilder0);
        return navDeepLinkDslBuilder0.a();
    }
}

