package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import java.security.MessageDigest;

public class p extends i {
    private static final int c = 1;
    private static final String d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
    private static final byte[] e;

    static {
        p.e = new byte[]{99, 0x6F, 109, 46, 98, 0x75, 109, 0x70, 0x74, 101, 99, 104, 46, 103, 108, 105, 100, 101, 46, 108, 0x6F, 97, 100, 46, 0x72, 101, 0x73, 0x6F, 0x75, 0x72, 99, 101, 46, 98, 105, 0x74, 109, 97, 0x70, 46, 67, 105, 0x72, 99, 108, 101, 67, 0x72, 0x6F, 0x70, 46, 49};
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        messageDigest0.update(p.e);
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.i
    protected Bitmap c(@NonNull e e0, @NonNull Bitmap bitmap0, int v, int v1) {
        return N.d(e0, bitmap0, v, v1);
    }

    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof p;
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return 1101716364;
    }
}

