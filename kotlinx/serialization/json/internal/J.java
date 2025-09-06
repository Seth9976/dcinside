package kotlinx.serialization.json.internal;

import kotlin.collections.k;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;

public final class j {
    @l
    public static final j a;
    @l
    private static final k b;
    private static int c;
    private static final int d;

    static {
        Object object0;
        j.a = new j();
        j.b = new k();
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
        j.d = ((Integer)object0) == null ? 0x200000 : ((int)(((Integer)object0)));
    }

    public final void a(@l byte[] arr_b) {
        L.p(arr_b, "array");
        synchronized(this) {
            int v1 = j.c;
            if(arr_b.length + v1 < j.d) {
                j.c = v1 + arr_b.length;
                j.b.addLast(arr_b);
            }
        }
    }

    @l
    public final byte[] b() [...] // 潜在的解密器
}

