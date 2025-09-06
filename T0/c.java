package t0;

import java.io.Closeable;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class c {
    @l
    private static final Function1 a;

    static {
        c.a = (Closeable closeable0) -> {
            L.p(closeable0, "it");
            closeable0.close();
            return S0.a;
        };
    }

    // 检测为 Lambda 实现
    private static final S0 c(Closeable closeable0) [...]
}

