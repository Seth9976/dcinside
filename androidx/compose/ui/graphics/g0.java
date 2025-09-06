package androidx.compose.ui.graphics;

public final class g0 {
    static {
    }

    public static void a(ImageBitmap imageBitmap0, int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5, int v6, Object object0) {
        int v7 = 0;
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        int v8 = (v6 & 8) == 0 ? v2 : imageBitmap0.getWidth();
        int v9 = (v6 & 16) == 0 ? v3 : imageBitmap0.getHeight();
        if((v6 & 0x20) == 0) {
            v7 = v4;
        }
        imageBitmap0.a(arr_v, ((v6 & 2) == 0 ? v : 0), ((v6 & 4) == 0 ? v1 : 0), v8, v9, v7, ((v6 & 0x40) == 0 ? v5 : v8));
    }
}

