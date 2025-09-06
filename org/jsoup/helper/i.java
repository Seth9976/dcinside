package org.jsoup.helper;

public final class i {
    static boolean a(String s) {
        i.d(s);
        return false;
    }

    public static Object b(Object object0) {
        if(object0 == null) {
            throw new j("Object must not be null");
        }
        return object0;
    }

    public static Object c(Object object0, String s, Object[] arr_object) {
        if(object0 == null) {
            throw new j(String.format(s, arr_object));
        }
        return object0;
    }

    public static void d(String s) {
        throw new j(s);
    }

    public static void e(String s, Object[] arr_object) {
        throw new j(String.format(s, arr_object));
    }

    public static void f(boolean z) {
        if(z) {
            throw new j("Must be false");
        }
    }

    public static void g(boolean z, String s) {
        if(z) {
            throw new j(s);
        }
    }

    public static void h(boolean z) {
        if(!z) {
            throw new j("Must be true");
        }
    }

    public static void i(boolean z, String s) {
        if(!z) {
            throw new j(s);
        }
    }

    public static void j(Object[] arr_object) {
        i.k(arr_object, "Array must not contain any null objects");
    }

    public static void k(Object[] arr_object, String s) {
        for(int v = 0; v < arr_object.length; ++v) {
            if(arr_object[v] == null) {
                throw new j(s);
            }
        }
    }

    public static void l(String s) {
        if(s == null || s.length() == 0) {
            throw new j("String must not be empty");
        }
    }

    public static void m(String s, String s1) {
        if(s == null || s.length() == 0) {
            throw new j(s1);
        }
    }

    public static void n(String s, String s1) {
        if(s == null || s.length() == 0) {
            throw new j(String.format("The \'%s\' parameter must not be empty.", s1));
        }
    }

    public static void o(Object object0) {
        if(object0 == null) {
            throw new j("Object must not be null");
        }
    }

    public static void p(Object object0, String s) {
        if(object0 == null) {
            throw new j(s);
        }
    }

    public static void q(Object object0, String s) {
        if(object0 == null) {
            throw new j(String.format("The parameter \'%s\' must not be null.", s));
        }
    }

    public static void r(String s) {
        throw new IllegalStateException(s);
    }
}

