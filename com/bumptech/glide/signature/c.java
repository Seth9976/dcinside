package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

public final class c implements g {
    private static final c c;

    static {
        c.c = new c();
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
    }

    @NonNull
    public static c c() {
        return c.c;
    }

    @Override
    public String toString() {
        return "EmptySignature";
    }
}

