package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface g {
    public static final String a = "UTF-8";
    public static final Charset b;

    static {
        g.b = Charset.forName("UTF-8");
    }

    void b(@NonNull MessageDigest arg1);

    @Override
    boolean equals(Object arg1);

    @Override
    int hashCode();
}

