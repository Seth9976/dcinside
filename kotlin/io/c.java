package kotlin.io;

import java.io.Closeable;
import kotlin.b0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.o;
import y4.m;
import z3.i;

@i(name = "CloseableKt")
public final class c {
    @b0
    @h0(version = "1.1")
    public static final void a(@m Closeable closeable0, @m Throwable throwable0) {
        if(closeable0 != null) {
            if(throwable0 == null) {
                closeable0.close();
                return;
            }
            try {
                closeable0.close();
            }
            catch(Throwable throwable1) {
                o.a(throwable0, throwable1);
            }
        }
    }

    @f
    private static final Object b(Closeable closeable0, Function1 function10) {
        Object object0;
        L.p(function10, "block");
        try {
            object0 = function10.invoke(closeable0);
        }
        catch(Throwable throwable0) {
            c.a(closeable0, throwable0);
            throw throwable0;
        }
        c.a(closeable0, null);
        return object0;
    }
}

