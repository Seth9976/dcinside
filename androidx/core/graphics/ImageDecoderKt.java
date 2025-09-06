package androidx.core.graphics;

import A3.p;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import y4.l;

public final class ImageDecoderKt {
    @RequiresApi(28)
    @l
    public static final Bitmap a(@l ImageDecoder.Source imageDecoder$Source0, @l p p0) {
        return ImageDecoder.decodeBitmap(imageDecoder$Source0, s.a(new ImageDecoder.OnHeaderDecodedListener() {
            @Override  // android.graphics.ImageDecoder$OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder0, ImageDecoder.ImageInfo imageDecoder$ImageInfo0, ImageDecoder.Source imageDecoder$Source0) {
                p0.invoke(imageDecoder0, imageDecoder$ImageInfo0, imageDecoder$Source0);
            }
        }));
    }

    @RequiresApi(28)
    @l
    public static final Drawable b(@l ImageDecoder.Source imageDecoder$Source0, @l p p0) {
        return ImageDecoder.decodeDrawable(imageDecoder$Source0, s.a(new ImageDecoder.OnHeaderDecodedListener() {
            @Override  // android.graphics.ImageDecoder$OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder0, ImageDecoder.ImageInfo imageDecoder$ImageInfo0, ImageDecoder.Source imageDecoder$Source0) {
                p0.invoke(imageDecoder0, imageDecoder$ImageInfo0, imageDecoder$Source0);
            }
        }));
    }
}

