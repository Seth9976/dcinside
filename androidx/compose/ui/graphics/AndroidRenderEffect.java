package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import y4.l;

@Immutable
public final class AndroidRenderEffect extends RenderEffect {
    @l
    private final android.graphics.RenderEffect b;

    public AndroidRenderEffect(@l android.graphics.RenderEffect renderEffect0) {
        L.p(renderEffect0, "androidRenderEffect");
        super(null);
        this.b = renderEffect0;
    }

    @Override  // androidx.compose.ui.graphics.RenderEffect
    @l
    protected android.graphics.RenderEffect b() {
        return this.b;
    }

    @l
    public final android.graphics.RenderEffect d() {
        return this.b;
    }
}

