package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.TextDecoration;

public final class a {
    public static int a(Paragraph paragraph0, int v, boolean z, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        return paragraph0.j(v, z);
    }

    public static void b(Paragraph paragraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v1, int v2, Object object0) {
        DrawStyle drawStyle1 = null;
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        if((v2 & 16) == 0) {
            drawStyle1 = drawStyle0;
        }
        paragraph0.p(canvas0, ((v2 & 2) == 0 ? v : 16L), ((v2 & 4) == 0 ? shadow0 : null), ((v2 & 8) == 0 ? textDecoration0 : null), drawStyle1, ((v2 & 0x20) == 0 ? v1 : 3));
    }

    public static void c(Paragraph paragraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if((v1 & 2) != 0) {
            v = 16L;
        }
        paragraph0.C(canvas0, v, ((v1 & 4) == 0 ? shadow0 : null), ((v1 & 8) == 0 ? textDecoration0 : null));
    }

    public static void d(Paragraph paragraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        paragraph0.w(canvas0, brush0, ((v1 & 4) == 0 ? f : NaNf), ((v1 & 8) == 0 ? shadow0 : null), ((v1 & 16) == 0 ? textDecoration0 : null), ((v1 & 0x20) == 0 ? drawStyle0 : null), ((v1 & 0x40) == 0 ? v : 3));
    }
}

