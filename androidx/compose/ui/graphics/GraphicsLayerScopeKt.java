package androidx.compose.ui.graphics;

import y4.l;

public final class GraphicsLayerScopeKt {
    public static final float a = 8.0f;
    private static final long b;

    static {
        GraphicsLayerScopeKt.b = 0xFF00000000000000L;
    }

    @l
    public static final GraphicsLayerScope a() {
        return new ReusableGraphicsLayerScope();
    }

    public static final long b() [...] // 潜在的解密器
}

