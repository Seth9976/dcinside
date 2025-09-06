package _COROUTINE;

import y4.l;

public final class a {
    // 去混淆评级： 低(20)
    @l
    public final StackTraceElement a() {
        return b.b(new Exception(), "c");
    }

    // 去混淆评级： 低(20)
    @l
    public final StackTraceElement b() {
        return b.b(new Exception(), "d");
    }
}

