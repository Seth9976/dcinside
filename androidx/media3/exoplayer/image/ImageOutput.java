package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface ImageOutput {
    public static final ImageOutput a;

    static {
        ImageOutput.a = new ImageOutput() {
            @Override  // androidx.media3.exoplayer.image.ImageOutput
            public void a() {
            }

            @Override  // androidx.media3.exoplayer.image.ImageOutput
            public void onImageAvailable(long v, Bitmap bitmap0) {
            }
        };
    }

    void a();

    void onImageAvailable(long arg1, Bitmap arg2);
}

