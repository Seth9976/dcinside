package androidx.work;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class InputMergerKt {
    @l
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-InputMerger", "tagWithPrefix(\"InputMerger\")");
        InputMergerKt.a = "WM-InputMerger";
    }

    @m
    public static final InputMerger a(@l String s) {
        L.p(s, "className");
        try {
            Object object0 = Class.forName(s).getDeclaredConstructor(null).newInstance(null);
            L.n(object0, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (InputMerger)object0;
        }
        catch(Exception exception0) {
            Logger.e().d("WM-InputMerger", "Trouble instantiating " + s, exception0);
            return null;
        }
    }
}

