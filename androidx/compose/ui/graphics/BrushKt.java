package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.jvm.internal.L;
import y4.l;

public final class BrushKt {
    @l
    public static final ShaderBrush a(@l Shader shader0) {
        L.p(shader0, "shader");
        return new ShaderBrush() {
            @Override  // androidx.compose.ui.graphics.ShaderBrush
            @l
            public Shader c(long v) {
                return shader0;
            }
        };
    }
}

