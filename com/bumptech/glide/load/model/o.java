package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import com.bumptech.glide.util.m;
import java.util.Collections;
import java.util.List;

public interface o {
    public static class a {
        public final g a;
        public final List b;
        public final d c;

        public a(@NonNull g g0, @NonNull d d0) {
            this(g0, Collections.emptyList(), d0);
        }

        public a(@NonNull g g0, @NonNull List list0, @NonNull d d0) {
            this.a = (g)m.e(g0);
            this.b = (List)m.e(list0);
            this.c = (d)m.e(d0);
        }
    }

    @Nullable
    a a(@NonNull Object arg1, int arg2, int arg3, @NonNull j arg4);

    boolean b(@NonNull Object arg1);
}

