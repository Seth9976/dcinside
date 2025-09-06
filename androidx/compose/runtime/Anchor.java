package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import y4.l;

public final class Anchor {
    private int a;

    public Anchor(int v) {
        this.a = v;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.a != 0x80000000;
    }

    public final void c(int v) {
        this.a = v;
    }

    public final int d(@l SlotTable slotTable0) {
        L.p(slotTable0, "slots");
        return slotTable0.d(this);
    }

    public final int e(@l SlotWriter slotWriter0) {
        L.p(slotWriter0, "writer");
        return slotWriter0.D(this);
    }
}

