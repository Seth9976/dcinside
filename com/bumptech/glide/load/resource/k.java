package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.n;
import java.security.MessageDigest;

public final class k implements n {
    private static final n c;

    static {
        k.c = new k();
    }

    @Override  // com.bumptech.glide.load.n
    @NonNull
    public v a(@NonNull Context context0, @NonNull v v0, int v1, int v2) {
        return v0;
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
    }

    @NonNull
    public static k c() {
        return (k)k.c;
    }
}

