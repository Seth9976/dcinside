package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

public final class a implements BitmapDecoder {
    @Override  // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder$BitmapDecoder
    public final Bitmap a(byte[] arr_b, int v) {
        return Factory.c(arr_b, v);
    }
}

