package androidx.compose.foundation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.m;

final class ScrollState.Companion.Saver.2 extends N implements Function1 {
    public static final ScrollState.Companion.Saver.2 e;

    static {
        ScrollState.Companion.Saver.2.e = new ScrollState.Companion.Saver.2();
    }

    ScrollState.Companion.Saver.2() {
        super(1);
    }

    @m
    public final ScrollState a(int v) {
        return new ScrollState(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((Number)object0).intValue());
    }
}

