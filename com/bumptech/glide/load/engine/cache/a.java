package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.g;
import java.io.File;

public interface a {
    public interface com.bumptech.glide.load.engine.cache.a.a {
        public static final int a = 0xFA00000;
        public static final String b = "image_manager_disk_cache";

        @Nullable
        a build();
    }

    public interface b {
        boolean a(@NonNull File arg1);
    }

    void a(g arg1, b arg2);

    @Nullable
    File b(g arg1);

    void c(g arg1);

    void clear();
}

