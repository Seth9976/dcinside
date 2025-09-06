package androidx.work.impl.utils;

import java.util.WeakHashMap;
import y4.l;

final class WakeLocksHolder {
    @l
    public static final WakeLocksHolder a;
    @l
    private static final WeakHashMap b;

    static {
        WakeLocksHolder.a = new WakeLocksHolder();
        WakeLocksHolder.b = new WeakHashMap();
    }

    @l
    public final WeakHashMap a() {
        return WakeLocksHolder.b;
    }
}

