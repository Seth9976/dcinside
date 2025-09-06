package kotlinx.coroutines;

import kotlin.e0;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class z {
    @l
    public static final x a(Object object0) {
        x x0 = new y(null);
        ((y)x0).Q(object0);
        return x0;
    }

    @l
    public static final x b(@m I0 i00) {
        return new y(i00);
    }

    public static x c(I0 i00, int v, Object object0) {
        if((v & 1) != 0) {
            i00 = null;
        }
        return z.b(i00);
    }

    public static final boolean d(@l x x0, @l Object object0) {
        Throwable throwable0 = e0.e(object0);
        return throwable0 == null ? x0.Q(object0) : x0.f(throwable0);
    }
}

