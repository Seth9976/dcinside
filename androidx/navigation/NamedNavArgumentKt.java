package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class NamedNavArgumentKt {
    @l
    public static final NamedNavArgument a(@l String s, @l Function1 function10) {
        L.p(s, "name");
        L.p(function10, "builder");
        NavArgumentBuilder navArgumentBuilder0 = new NavArgumentBuilder();
        function10.invoke(navArgumentBuilder0);
        return new NamedNavArgument(s, navArgumentBuilder0.a());
    }
}

