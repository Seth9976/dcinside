package com.google.common.escape;

import J1.b;
import J1.e;
import com.google.common.base.H;
import java.util.Collections;
import java.util.Map;

@b
@f
public final class com.google.common.escape.b {
    private final char[][] a;
    private static final char[][] b;

    static {
        com.google.common.escape.b.b = new char[0][0];
    }

    private com.google.common.escape.b(char[][] arr2_c) {
        this.a = arr2_c;
    }

    public static com.google.common.escape.b a(Map map0) {
        return new com.google.common.escape.b(com.google.common.escape.b.b(map0));
    }

    @e
    static char[][] b(Map map0) {
        H.E(map0);
        if(map0.isEmpty()) {
            return com.google.common.escape.b.b;
        }
        char[][] arr2_c = new char[((Character)Collections.max(map0.keySet())).charValue() + 1][];
        for(Object object0: map0.keySet()) {
            arr2_c[((Character)object0).charValue()] = ((String)map0.get(((Character)object0))).toCharArray();
        }
        return arr2_c;
    }

    char[][] c() {
        return this.a;
    }
}

