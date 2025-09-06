package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class InspectorInfo {
    @m
    private String a;
    @m
    private Object b;
    @l
    private final ValueElementSequence c;
    public static final int d = 8;

    static {
    }

    public InspectorInfo() {
        this.c = new ValueElementSequence();
    }

    @m
    public final String a() {
        return this.a;
    }

    @l
    public final ValueElementSequence b() {
        return this.c;
    }

    @m
    public final Object c() {
        return this.b;
    }

    public final void d(@m String s) {
        this.a = s;
    }

    public final void e(@m Object object0) {
        this.b = object0;
    }
}

