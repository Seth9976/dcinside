package kotlinx.coroutines.internal;

import kotlin.coroutines.g;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/DiagnosticCoroutineContextException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,46:1\n26#2:47\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/DiagnosticCoroutineContextException\n*L\n42#1:47\n*E\n"})
public final class m extends RuntimeException {
    @l
    private final transient g a;

    public m(@l g g0) {
        this.a = g0;
    }

    @Override
    @l
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    @l
    public String getLocalizedMessage() {
        return this.a.toString();
    }
}

