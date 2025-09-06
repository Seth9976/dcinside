package androidx.navigation;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import y4.l;

public final class NavArgsLazyKt {
    @l
    private static final Class[] a;
    @l
    private static final ArrayMap b;

    static {
        NavArgsLazyKt.a = new Class[]{Bundle.class};
        NavArgsLazyKt.b = new ArrayMap();
    }

    @l
    public static final ArrayMap a() {
        return NavArgsLazyKt.b;
    }

    @l
    public static final Class[] b() {
        return NavArgsLazyKt.a;
    }
}

