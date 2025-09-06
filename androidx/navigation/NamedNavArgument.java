package androidx.navigation;

import kotlin.jvm.internal.L;
import y4.l;

public final class NamedNavArgument {
    @l
    private final String a;
    @l
    private final NavArgument b;

    public NamedNavArgument(@l String s, @l NavArgument navArgument0) {
        L.p(s, "name");
        L.p(navArgument0, "argument");
        super();
        this.a = s;
        this.b = navArgument0;
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final NavArgument b() {
        return this.b;
    }

    @l
    public final NavArgument c() {
        return this.b;
    }

    @l
    public final String d() {
        return this.a;
    }
}

