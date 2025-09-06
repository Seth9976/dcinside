package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.mediastore.b;
import com.bumptech.glide.load.data.mediastore.c;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.resource.bitmap.S;

public class e implements o {
    public static class a implements p {
        private final Context a;

        public a(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            return new e(this.a);
        }
    }

    private final Context a;

    public e(Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Override  // com.bumptech.glide.load.model.o
    @Nullable
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((Uri)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((Uri)object0));
    }

    // 去混淆评级： 低(20)
    @Nullable
    public com.bumptech.glide.load.model.o.a c(@NonNull Uri uri0, int v, int v1, @NonNull j j0) {
        return !b.e(v, v1) || !this.e(j0) ? null : new com.bumptech.glide.load.model.o.a(new com.bumptech.glide.signature.e(uri0), c.g(this.a, uri0));
    }

    public boolean d(@NonNull Uri uri0) {
        return b.d(uri0);
    }

    private boolean e(j j0) {
        Long long0 = (Long)j0.c(S.g);
        return long0 != null && ((long)long0) == -1L;
    }
}

