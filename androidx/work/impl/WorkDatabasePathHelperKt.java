package androidx.work.impl;

import kotlin.jvm.internal.L;
import y4.l;

public final class WorkDatabasePathHelperKt {
    @l
    private static final String a = null;
    @l
    public static final String b = "androidx.work.workdb";
    @l
    private static final String[] c;

    static {
        L.o("WM-WrkDbPathHelper", "tagWithPrefix(\"WrkDbPathHelper\")");
        WorkDatabasePathHelperKt.a = "WM-WrkDbPathHelper";
        WorkDatabasePathHelperKt.c = new String[]{"-journal", "-shm", "-wal"};
    }

    // 去混淆评级： 低(20)
    public static final String b() [...] // 潜在的解密器
}

