package dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class d {
    private static final int a = 0x40000000;

    private static int a(int v) {
        if(v < 3) {
            return v + 1;
        }
        return v >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v) / 0.75f + 1.0f));
    }

    public static boolean b(List list0) {
        return list0.size() >= 2 ? list0.size() != new HashSet(list0).size() : false;
    }

    static HashSet c(int v) {
        return new HashSet(d.a(v));
    }

    public static LinkedHashMap d(int v) {
        return new LinkedHashMap(d.a(v));
    }

    public static List e(int v) {
        return v == 0 ? Collections.emptyList() : new ArrayList(v);
    }
}

