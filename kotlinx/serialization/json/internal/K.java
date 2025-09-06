package kotlinx.serialization.json.internal;

import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;

public final class k {
    @l
    public static final k a;
    @l
    private static final kotlin.collections.k b;
    private static int c;
    private static final int d;

    static {
        Object object0;
        k.a = new k();
        k.b = new kotlin.collections.k();
        try {
            String s = System.getProperty("kotlinx.serialization.json.pool.size");
            L.o(s, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            object0 = e0.b(v.b1(s));
        }
        catch(Throwable throwable0) {
            object0 = e0.b(f0.a(throwable0));
        }
        if(e0.i(object0)) {
            object0 = null;
        }
        k.d = ((Integer)object0) == null ? 0x100000 : ((int)(((Integer)object0)));
    }

    public final void a(@l char[] arr_c) {
        L.p(arr_c, "array");
        synchronized(this) {
            int v1 = k.c;
            if(arr_c.length + v1 < k.d) {
                k.c = v1 + arr_c.length;
                k.b.addLast(arr_c);
            }
        }
    }

    @l
    public final char[] b() {
        char[] arr_c;
        synchronized(this) {
            arr_c = (char[])k.b.z();
            if(arr_c == null) {
                arr_c = null;
            }
            else {
                k.c -= arr_c.length;
            }
        }
        return arr_c == null ? new char[0x80] : arr_c;
    }
}

