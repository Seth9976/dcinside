package javassist.tools.reflect;

public class k {
    private i a;
    private static d b;

    public Object a(Object[] arr_object, int v) throws Throwable {
        return this.a == null ? d.i(this, v, arr_object) : this.a.j(v, arr_object);
    }

    public static Object b(Object[] arr_object, String s) {
        Object object0 = arr_object[0];
        return object0 == null ? k.b.m(s) : ((h)object0).a().h(s);
    }

    public static Object c(Object[] arr_object, int v) throws Throwable {
        return k.b.o(v, arr_object);
    }

    public static Object d(Object[] arr_object, String s) {
        h h0 = (h)arr_object[0];
        if(h0 == null) {
            k.b.n(s, arr_object[1]);
            return null;
        }
        h0.a().i(s, arr_object[1]);
        return null;
    }
}

