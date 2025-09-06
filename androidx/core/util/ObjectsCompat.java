package androidx.core.util;

import j..util.Objects;

public class ObjectsCompat {
    public static boolean a(Object object0, Object object1) {
        return Objects.equals(object0, object1);
    }

    public static int b(Object[] arr_object) {
        return Objects.hash(arr_object);
    }

    public static int c(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public static Object d(Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object e(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    public static String f(Object object0, String s) {
        return object0 == null ? s : object0.toString();
    }
}

