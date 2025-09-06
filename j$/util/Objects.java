package j$.util;

import java.util.Arrays;

public final class Objects {
    // 去混淆评级： 低(20)
    public static boolean equals(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static int hash(Object[] arr_object) {
        return Arrays.hashCode(arr_object);
    }

    public static int hashCode(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public static boolean isNull(Object object0) {
        return object0 == null;
    }

    public static Object requireNonNull(Object object0) [...] // 潜在的解密器

    public static Object requireNonNull(Object object0, String s) [...] // 潜在的解密器

    public static String toString(Object object0) {
        return String.valueOf(object0);
    }

    public static String toString(Object object0, String s) {
        return object0 == null ? s : object0.toString();
    }
}

