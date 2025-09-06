package androidx.navigation;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@NavDestinationDsl
public final class NavArgumentBuilder {
    @l
    private final Builder a;
    @m
    private NavType b;
    private boolean c;
    @m
    private Object d;

    public NavArgumentBuilder() {
        this.a = new Builder();
    }

    @l
    public final NavArgument a() {
        return this.a.a();
    }

    @m
    public final Object b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    @l
    public final NavType d() {
        NavType navType0 = this.b;
        if(navType0 == null) {
            throw new IllegalStateException("NavType has not been set on this builder.");
        }
        return navType0;
    }

    public final void e(@m Object object0) {
        this.d = object0;
        this.a.b(object0);
    }

    public final void f(boolean z) {
        this.c = z;
        this.a.c(z);
    }

    public final void g(@l NavType navType0) {
        L.p(navType0, "value");
        this.b = navType0;
        this.a.d(navType0);
    }
}

