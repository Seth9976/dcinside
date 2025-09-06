package _COROUTINE;

import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nCoroutineDebugging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDebugging.kt\n_COROUTINE/CoroutineDebuggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class b {
    @l
    private static final String a = "_COROUTINE";

    static {
    }

    private static final StackTraceElement b(Throwable throwable0, String s) {
        StackTraceElement stackTraceElement0 = throwable0.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE" + '.' + s, "_", stackTraceElement0.getFileName(), stackTraceElement0.getLineNumber());
    }

    @l
    public static final String c() [...] // 潜在的解密器
}

