package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.bitmap_recycle.f;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.i;
import java.io.IOException;

@RequiresApi(api = 28)
public final class g implements l {
    private final e a;
    private static final String b = "BitmapImageDecoder";

    public g() {
        this.a = new f();
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((ImageDecoder.Source)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(com.bumptech.glide.load.resource.bitmap.f.a(object0), v, v1, j0);
    }

    public v c(@NonNull ImageDecoder.Source imageDecoder$Source0, int v, int v1, @NonNull j j0) throws IOException {
        Bitmap bitmap0 = ImageDecoder.decodeBitmap(imageDecoder$Source0, new i(v, v1, j0));
        if(Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmap0.getWidth() + "x" + bitmap0.getHeight() + "] for [" + v + "x" + v1 + "]");
        }
        return new h(bitmap0, this.a);
    }

    public boolean d(@NonNull ImageDecoder.Source imageDecoder$Source0, @NonNull j j0) throws IOException {
        return true;
    }
}

