package androidx.navigation;

import androidx.core.os.BundleKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@NavDestinationDsl
public final class NavActionBuilder {
    private int a;
    @l
    private final Map b;
    @m
    private NavOptions c;

    public NavActionBuilder() {
        this.b = new LinkedHashMap();
    }

    @l
    public final NavAction a() {
        int v = this.a;
        NavOptions navOptions0 = this.c;
        if(this.b.isEmpty()) {
            return new NavAction(v, navOptions0, null);
        }
        Object[] arr_object = Y.J1(this.b).toArray(new V[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return new NavAction(v, navOptions0, BundleKt.b(((V[])Arrays.copyOf(((V[])arr_object), ((V[])arr_object).length))));
    }

    @l
    public final Map b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final void d(@l Function1 function10) {
        L.p(function10, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder0 = new NavOptionsBuilder();
        function10.invoke(navOptionsBuilder0);
        this.c = navOptionsBuilder0.b();
    }

    public final void e(int v) {
        this.a = v;
    }
}

