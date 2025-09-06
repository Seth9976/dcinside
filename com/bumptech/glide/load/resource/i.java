package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder.DecodeException;
import android.graphics.ImageDecoder.ImageInfo;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.OnPartialImageListener;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.x;

@RequiresApi(api = 28)
public final class i implements ImageDecoder.OnHeaderDecodedListener {
    private final D a;
    private final int b;
    private final int c;
    private final b d;
    private final r e;
    private final boolean f;
    private final k g;
    private static final String h = "ImageDecoder";

    public i(int v, int v1, @NonNull j j0) {
        this.a = D.c();
        this.b = v;
        this.c = v1;
        this.d = (b)j0.c(x.g);
        this.e = (r)j0.c(r.h);
        this.f = j0.c(x.k) != null && ((Boolean)j0.c(x.k)).booleanValue();
        this.g = (k)j0.c(x.h);
    }

    @Override  // android.graphics.ImageDecoder$OnHeaderDecodedListener
    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder0, @NonNull ImageDecoder.ImageInfo imageDecoder$ImageInfo0, @NonNull ImageDecoder.Source imageDecoder$Source0) {
        class a implements ImageDecoder.OnPartialImageListener {
            final i a;

            @Override  // android.graphics.ImageDecoder$OnPartialImageListener
            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException imageDecoder$DecodeException0) {
                return false;
            }
        }

        if(this.a.g(this.b, this.c, this.f, false)) {
            imageDecoder0.setAllocator(3);
        }
        else {
            imageDecoder0.setAllocator(1);
        }
        if(this.d == b.b) {
            imageDecoder0.setMemorySizePolicy(0);
        }
        imageDecoder0.setOnPartialImageListener(new a(this));
        Size size0 = imageDecoder$ImageInfo0.getSize();
        int v = this.b == 0x80000000 ? size0.getWidth() : this.b;
        int v1 = this.c == 0x80000000 ? size0.getHeight() : this.c;
        int v2 = size0.getWidth();
        int v3 = size0.getHeight();
        float f = this.e.b(v2, v3, v, v1);
        int v4 = Math.round(((float)size0.getWidth()) * f);
        int v5 = Math.round(((float)size0.getHeight()) * f);
        if(Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size0.getWidth() + "x" + size0.getHeight() + "] to [" + v4 + "x" + v5 + "] scaleFactor: " + f);
        }
        imageDecoder0.setTargetSize(v4, v5);
        k k0 = this.g;
        if(k0 != null) {
            int v6 = Build.VERSION.SDK_INT;
            if(v6 >= 28) {
                imageDecoder0.setTargetColorSpace(ColorSpace.get((k0 != k.b || imageDecoder$ImageInfo0.getColorSpace() == null || !imageDecoder$ImageInfo0.getColorSpace().isWideGamut() ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3)));
                return;
            }
            if(v6 >= 26) {
                imageDecoder0.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}

