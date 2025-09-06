package androidx.compose.ui.node;

public final class HitTestResultKt {
    private static final long a(float f, boolean z) {
        long v = (long)Float.floatToIntBits(f);
        return z ? 1L | v << 0x20 : v << 0x20;
    }
}

