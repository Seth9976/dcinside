package androidx.compose.runtime;

import A3.o;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public abstract class CompositionContext {
    public static final int a;

    static {
    }

    public abstract void a(@l ControlledComposition arg1, @l o arg2);

    public abstract void b(@l MovableContentStateReference arg1);

    public void c() {
    }

    public abstract boolean d();

    @l
    public PersistentMap e() {
        return CompositionContextKt.a;
    }

    public abstract int f();

    @l
    public abstract g g();

    @l
    public abstract g h();

    public abstract void i(@l MovableContentStateReference arg1);

    public abstract void j(@l ControlledComposition arg1);

    public abstract void k(@l RecomposeScopeImpl arg1);

    public abstract void l(@l MovableContentStateReference arg1, @l MovableContentState arg2);

    @m
    public MovableContentState m(@l MovableContentStateReference movableContentStateReference0) {
        L.p(movableContentStateReference0, "reference");
        return null;
    }

    public void n(@l Set set0) {
        L.p(set0, "table");
    }

    public void o(@l Composer composer0) {
        L.p(composer0, "composer");
    }

    public abstract void p(@l ControlledComposition arg1);

    public void q() {
    }

    public void r(@l Composer composer0) {
        L.p(composer0, "composer");
    }

    public abstract void s(@l ControlledComposition arg1);
}

