package androidx.compose.runtime;

public final class BitwiseOperatorsKt {
    public static final int a(int v, int v1) {
        return Integer.rotateLeft(v, v1);
    }

    public static final int b(int v, int v1) {
        return Integer.rotateRight(v, v1);
    }
}

