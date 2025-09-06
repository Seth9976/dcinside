package androidx.compose.runtime;

import A3.a;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;

@Stable
public abstract class CompositionLocal {
    @l
    private final LazyValueHolder a;
    public static final int b;

    static {
    }

    private CompositionLocal(a a0) {
        this.a = new LazyValueHolder(a0);
    }

    public CompositionLocal(a a0, w w0) {
        this(a0);
    }

    @Composable
    @ReadOnlyComposable
    @i(name = "getCurrent")
    public final Object a(@m Composer composer0, int v) {
        return composer0.L(this);
    }

    public static void b() {
    }

    @l
    public final LazyValueHolder c() {
        return this.a;
    }

    public static void d() {
    }

    @Composable
    @l
    public abstract State e(Object arg1, @m Composer arg2, int arg3);
}

