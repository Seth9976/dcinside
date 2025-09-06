package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.f;

@s0({"SMAP\nFlowExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,26:1\n26#2:27\n*S KotlinDebug\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n*L\n13#1:27\n*E\n"})
public final class a extends CancellationException {
    @l
    @f
    public final transient Object a;

    public a(@l Object object0) {
        super("Flow was aborted, no more elements needed");
        this.a = object0;
    }

    @Override
    @l
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

