package androidx.compose.ui.graphics;

import android.graphics.Canvas.VertexMode;
import y4.l;

public final class AndroidVertexMode_androidKt {
    // 去混淆评级： 低(20)
    @l
    public static final Canvas.VertexMode a(int v) {
        if(VertexMode.g(v, 0)) {
            return Canvas.VertexMode.TRIANGLES;
        }
        if(VertexMode.g(v, 1)) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        return VertexMode.g(v, 2) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}

