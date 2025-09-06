package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

public class h implements n {
    private final Collection c;

    public h(@NonNull Collection collection0) {
        if(collection0.isEmpty()) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.c = collection0;
    }

    @SafeVarargs
    public h(@NonNull n[] arr_n) {
        if(arr_n.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.c = Arrays.asList(arr_n);
    }

    @Override  // com.bumptech.glide.load.n
    @NonNull
    public v a(@NonNull Context context0, @NonNull v v0, int v1, int v2) {
        v v3 = v0;
        for(Object object0: this.c) {
            v v4 = ((n)object0).a(context0, v3, v1, v2);
            if(v3 != null && !v3.equals(v0) && !v3.equals(v4)) {
                v3.recycle();
            }
            v3 = v4;
        }
        return v3;
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        for(Object object0: this.c) {
            ((n)object0).b(messageDigest0);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof h ? this.c.equals(((h)object0).c) : false;
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return this.c.hashCode();
    }
}

