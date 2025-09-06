package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.n;
import java.security.MessageDigest;

public class z implements n {
    private final n c;
    private final boolean d;

    public z(n n0, boolean z) {
        this.c = n0;
        this.d = z;
    }

    @Override  // com.bumptech.glide.load.n
    @NonNull
    public v a(@NonNull Context context0, @NonNull v v0, int v1, int v2) {
        e e0 = c.e(context0).h();
        Drawable drawable0 = (Drawable)v0.get();
        v v3 = y.a(e0, drawable0, v1, v2);
        if(v3 == null) {
            if(this.d) {
                throw new IllegalArgumentException("Unable to convert " + drawable0 + " to a Bitmap");
            }
            return v0;
        }
        v v4 = this.c.a(context0, v3, v1, v2);
        if(v4.equals(v3)) {
            v4.recycle();
            return v0;
        }
        return this.d(context0, v4);
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        this.c.b(messageDigest0);
    }

    public n c() [...] // Inlined contents

    private v d(Context context0, v v0) {
        return G.c(context0.getResources(), v0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof z ? this.c.equals(((z)object0).c) : false;
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return this.c.hashCode();
    }
}

