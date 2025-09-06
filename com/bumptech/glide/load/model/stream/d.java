package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.mediastore.b;
import com.bumptech.glide.load.data.mediastore.c;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.signature.e;

public class d implements o {
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
            return new d(this.a);
        }
    }

    private final Context a;

    public d(Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((Uri)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((Uri)object0));
    }

    // 去混淆评级： 低(20)
    public com.bumptech.glide.load.model.o.a c(@NonNull Uri uri0, int v, int v1, @NonNull j j0) {
        return b.e(v, v1) ? new com.bumptech.glide.load.model.o.a(new e(uri0), c.f(this.a, uri0)) : null;
    }

    public boolean d(@NonNull Uri uri0) {
        return b.b(uri0);
    }
}

