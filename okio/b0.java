package okio;

import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.o;
import y4.l;
import z3.i;

final class b0 {
    @l
    @i(name = "blackhole")
    public static final m0 a() {
        return new k();
    }

    @l
    public static final m b(@l m0 m00) {
        L.p(m00, "<this>");
        return new h0(m00);
    }

    @l
    public static final n c(@l o0 o00) {
        L.p(o00, "<this>");
        return new i0(o00);
    }

    public static final Object d(Closeable closeable0, @l Function1 function10) {
        Object object0;
        L.p(function10, "block");
        Throwable throwable0 = null;
        try {
            object0 = function10.invoke(closeable0);
        }
        catch(Throwable throwable1) {
            if(closeable0 != null) {
                try {
                    closeable0.close();
                }
                catch(Throwable throwable2) {
                    o.a(throwable1, throwable2);
                }
            }
            throwable0 = throwable1;
            object0 = null;
            goto label_17;
        }
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(Throwable throwable0) {
            }
        }
    label_17:
        if(throwable0 != null) {
            throw throwable0;
        }
        L.m(object0);
        return object0;
    }
}

