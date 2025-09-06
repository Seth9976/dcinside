package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(api = 28)
public final class m implements l {
    private final g a;

    public m() {
        this.a = new g();
    }

    @Override  // com.bumptech.glide.load.l
    public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
        return this.d(((ByteBuffer)object0), j0);
    }

    @Override  // com.bumptech.glide.load.l
    public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
        return this.c(((ByteBuffer)object0), v, v1, j0);
    }

    public v c(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull j j0) throws IOException {
        ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(byteBuffer0);
        return this.a.c(imageDecoder$Source0, v, v1, j0);
    }

    public boolean d(@NonNull ByteBuffer byteBuffer0, @NonNull j j0) throws IOException {
        return true;
    }
}

