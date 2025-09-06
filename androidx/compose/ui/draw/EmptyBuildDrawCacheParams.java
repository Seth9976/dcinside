package androidx.compose.ui.draw;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import y4.l;

final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {
    @l
    public static final EmptyBuildDrawCacheParams a;
    private static final long b;
    @l
    private static final LayoutDirection c;
    @l
    private static final Density d;

    static {
        EmptyBuildDrawCacheParams.a = new EmptyBuildDrawCacheParams();
        EmptyBuildDrawCacheParams.b = 0x7FC000007FC00000L;
        EmptyBuildDrawCacheParams.c = LayoutDirection.a;
        EmptyBuildDrawCacheParams.d = DensityKt.a(1.0f, 1.0f);
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public long b() {
        return EmptyBuildDrawCacheParams.b;
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    @l
    public Density getDensity() {
        return EmptyBuildDrawCacheParams.d;
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    @l
    public LayoutDirection getLayoutDirection() {
        return EmptyBuildDrawCacheParams.c;
    }
}

