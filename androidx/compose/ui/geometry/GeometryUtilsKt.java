package androidx.compose.ui.geometry;

import y4.l;

public final class GeometryUtilsKt {
    @l
    public static final String a(float f, int v) {
        int v1 = Math.max(v, 0);
        float f1 = (float)Math.pow(10.0, v1);
        float f2 = f * f1;
        int v2 = (int)f2;
        float f3 = ((float)(f2 - ((float)v2) >= 0.5f ? v2 + 1 : ((int)f2))) / f1;
        return v1 <= 0 ? String.valueOf(((int)f3)) : String.valueOf(f3);
    }
}

