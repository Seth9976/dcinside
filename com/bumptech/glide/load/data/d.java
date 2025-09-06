package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.j;

public interface d {
    public interface a {
        void e(@Nullable Object arg1);

        void f(@NonNull Exception arg1);
    }

    @NonNull
    Class a();

    void b();

    @NonNull
    com.bumptech.glide.load.a c();

    void cancel();

    void d(@NonNull j arg1, @NonNull a arg2);
}

