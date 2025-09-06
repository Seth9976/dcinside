package org.bson.codecs.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.codecs.N;
import org.bson.internal.i;

public final class c {
    public static d a(List list0) {
        return c.d(new b[]{new e(list0)});
    }

    public static d b(N[] arr_n) {
        return c.a(Arrays.asList(arr_n));
    }

    public static d c(List list0) {
        return new i(list0);
    }

    public static d d(b[] arr_b) {
        return c.c(Arrays.asList(arr_b));
    }

    public static d e(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(c.g(((d)object0)));
        }
        return new i(arrayList0);
    }

    public static d f(d[] arr_d) {
        return c.e(Arrays.asList(arr_d));
    }

    private static b g(d d0) {
        class a implements b {
            final d a;

            a(d d0) {
            }

            @Override  // org.bson.codecs.configuration.b
            public N b(Class class0, d d0) {
                try {
                    return this.a.a(class0);
                }
                catch(org.bson.codecs.configuration.a unused_ex) {
                    return null;
                }
            }
        }

        return d0 instanceof b ? ((b)d0) : new a(d0);
    }
}

