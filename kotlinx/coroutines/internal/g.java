package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.jvm.internal.s0;
import kotlin.y;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.U0;
import y4.l;

@s0({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class G {
    @l
    private static final String a = "kotlinx.coroutines.fast.service.loader";
    private static final boolean b;

    static {
    }

    private static final H a(Throwable throwable0, String s) {
        if(throwable0 != null) {
            throw throwable0;
        }
        G.e();
        throw new y();
    }

    static H b(Throwable throwable0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            throwable0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        return G.a(throwable0, s);
    }

    private static void c() {
    }

    @E0
    public static final boolean d(@l U0 u00) {
        return u00.u1() instanceof H;
    }

    @l
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'");
    }

    @E0
    @l
    public static final U0 f(@l MainDispatcherFactory mainDispatcherFactory0, @l List list0) {
        try {
            return mainDispatcherFactory0.c(list0);
        }
        catch(Throwable throwable0) {
            return G.a(throwable0, mainDispatcherFactory0.b());
        }
    }
}

