package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;

interface f {
    public interface a {
        void b(g arg1, Exception arg2, d arg3, com.bumptech.glide.load.a arg4);

        void c();

        void d(g arg1, @Nullable Object arg2, d arg3, com.bumptech.glide.load.a arg4, g arg5);
    }

    boolean a();

    void cancel();
}

