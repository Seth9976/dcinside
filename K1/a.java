package k1;

import java.util.List;
import java.util.Map;
import o3.h;

public class a {
    public static void a(boolean z) {
        if(!z) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z, String s) {
        if(!z) {
            throw new AssertionError(s);
        }
    }

    public static Object c(int v, List list0) {
        a.b(v >= 0 && v < list0.size(), "Index not in bound");
        return a.f(list0.get(v), "Null value");
    }

    public static Object d(Object object0, Map map0) {
        a.b(map0.containsKey(object0), "Key not found");
        return a.f(map0.get(object0), "Null value");
    }

    public static Object e(@h Object object0) {
        if(object0 == null) {
            throw new AssertionError();
        }
        return object0;
    }

    public static Object f(@h Object object0, String s) {
        if(object0 == null) {
            throw new AssertionError(s);
        }
        return object0;
    }

    public static AssertionError g() {
        throw new AssertionError();
    }

    public static AssertionError h(Exception exception0) {
        throw new AssertionError(exception0);
    }

    public static AssertionError i(String s) {
        throw new AssertionError(s);
    }

    public static void j(boolean z) {
    }

    public static void k(boolean z, String s) {
    }

    public static Object l(@h Object object0) [...] // Inlined contents

    public static Object m(@h Object object0, String s) {
        return object0;
    }

    public static Object n(@h Object object0, String s) {
        return object0;
    }
}

