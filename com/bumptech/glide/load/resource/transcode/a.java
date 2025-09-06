package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import java.io.ByteArrayOutputStream;
import q.b;

public class a implements e {
    private final Bitmap.CompressFormat a;
    private final int b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0, int v) {
        this.a = bitmap$CompressFormat0;
        this.b = v;
    }

    @Override  // com.bumptech.glide.load.resource.transcode.e
    @Nullable
    public v a(@NonNull v v0, @NonNull j j0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ((Bitmap)v0.get()).compress(this.a, this.b, byteArrayOutputStream0);
        v0.recycle();
        return new b(byteArrayOutputStream0.toByteArray());
    }
}

