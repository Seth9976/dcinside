package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class ModifierInfo {
    @l
    private final Modifier a;
    @l
    private final LayoutCoordinates b;
    @m
    private final Object c;
    public static final int d = 8;

    static {
    }

    public ModifierInfo(@l Modifier modifier0, @l LayoutCoordinates layoutCoordinates0, @m Object object0) {
        L.p(modifier0, "modifier");
        L.p(layoutCoordinates0, "coordinates");
        super();
        this.a = modifier0;
        this.b = layoutCoordinates0;
        this.c = object0;
    }

    public ModifierInfo(Modifier modifier0, LayoutCoordinates layoutCoordinates0, Object object0, int v, w w0) {
        if((v & 4) != 0) {
            object0 = null;
        }
        this(modifier0, layoutCoordinates0, object0);
    }

    @l
    public final LayoutCoordinates a() {
        return this.b;
    }

    @m
    public final Object b() {
        return this.c;
    }

    @l
    public final Modifier c() {
        return this.a;
    }
}

