package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.w;
import kotlin.k;

@StabilityInferred(parameters = 0)
@k(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
public final class ConsumedData {
    private boolean a;
    private boolean b;
    public static final int c = 8;

    static {
    }

    public ConsumedData() {
        this(false, false, 3, null);
    }

    public ConsumedData(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public ConsumedData(boolean z, boolean z1, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        this(z, z1);
    }

    public final boolean a() {
        return this.b;
    }

    @k(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static void b() {
    }

    public final boolean c() {
        return this.a;
    }

    @k(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static void d() {
    }

    public final void e(boolean z) {
        this.b = z;
    }

    public final void f(boolean z) {
        this.a = z;
    }
}

