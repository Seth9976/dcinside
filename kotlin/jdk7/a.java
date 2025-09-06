package kotlin.jdk7;

import kotlin.b0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.o;
import y4.m;
import z3.i;

@i(name = "AutoCloseableKt")
public final class a {
    @h0(version = "2.0")
    @f
    private static final AutoCloseable a(A3.a a0) {
        public static final class kotlin.jdk7.a.a implements AutoCloseable {
            final A3.a a;

            public kotlin.jdk7.a.a(A3.a a0) {
                this.a = a0;
                super();
            }

            @Override
            public final void close() {
                this.a.invoke();
            }
        }

        L.p(a0, "closeAction");
        return new kotlin.jdk7.a.a(a0);
    }

    @h0(version = "2.0")
    public static void b() {
    }

    @b0
    @h0(version = "1.2")
    public static final void c(@m AutoCloseable autoCloseable0, @m Throwable throwable0) {
        if(autoCloseable0 != null) {
            if(throwable0 == null) {
                autoCloseable0.close();
                return;
            }
            try {
                autoCloseable0.close();
            }
            catch(Throwable throwable1) {
                o.a(throwable0, throwable1);
            }
        }
    }

    @h0(version = "1.2")
    @f
    private static final Object d(AutoCloseable autoCloseable0, Function1 function10) {
        Object object0;
        L.p(function10, "block");
        try {
            object0 = function10.invoke(autoCloseable0);
        }
        catch(Throwable throwable0) {
            a.c(autoCloseable0, throwable0);
            throw throwable0;
        }
        a.c(autoCloseable0, null);
        return object0;
    }
}

