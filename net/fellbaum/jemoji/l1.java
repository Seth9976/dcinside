package net.fellbaum.jemoji;

import j..util.Optional;
import java.util.Map;

class L1 {
    // 去混淆评级： 低(20)
    public static String a(String s) {
        return s.startsWith(":") && s.endsWith(":") ? s : ":" + s + ":";
    }

    public static Optional b(Map map0, Object object0, Object object1) {
        Object object2 = map0.get(object0);
        if(object2 != null) {
            return Optional.of(object2);
        }
        Object object3 = map0.get(object1);
        return object3 == null ? Optional.empty() : Optional.of(object3);
    }

    public static int c(String s) {
        return s.codePointCount(0, s.length());
    }

    public static boolean d(String s) {
        return s == null || s.isEmpty();
    }

    // 去混淆评级： 低(20)
    public static String e(String s) {
        return !s.startsWith(":") || !s.endsWith(":") ? s : s.substring(1, s.length() - 1);
    }

    public static int[] f(String s) {
        int[] arr_v = new int[L1.c(s)];
        int v = 0;
        for(int v1 = 0; v < s.length(); ++v1) {
            int v2 = s.codePointAt(v);
            arr_v[v1] = v2;
            v += Character.charCount(v2);
        }
        return arr_v;
    }
}

