package androidx.compose.runtime.saveable;

import A3.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SaverKt {
    @l
    private static final Saver a;

    static {
        SaverKt.a = SaverKt.a(SaverKt.AutoSaver.1.e, SaverKt.AutoSaver.2.e);
    }

    @l
    public static final Saver a(@l o o0, @l Function1 function10) {
        L.p(o0, "save");
        L.p(function10, "restore");
        return new Saver() {
            @Override  // androidx.compose.runtime.saveable.Saver
            @m
            public Object a(@l SaverScope saverScope0, Object object0) {
                L.p(saverScope0, "<this>");
                return o0.invoke(saverScope0, object0);
            }

            @Override  // androidx.compose.runtime.saveable.Saver
            @m
            public Object b(@l Object object0) {
                L.p(object0, "value");
                return function10.invoke(object0);
            }
        };
    }

    @l
    public static final Saver b() {
        L.n(SaverKt.a, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return SaverKt.a;
    }
}

