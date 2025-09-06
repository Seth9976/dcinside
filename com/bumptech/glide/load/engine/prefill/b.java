package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap.Config;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.util.o;
import java.util.HashMap;

public final class b {
    private final j a;
    private final e b;
    private final com.bumptech.glide.load.b c;
    private a d;

    public b(j j0, e e0, com.bumptech.glide.load.b b0) {
        this.a = j0;
        this.b = e0;
        this.c = b0;
    }

    @VisibleForTesting
    c a(d[] arr_d) {
        long v = this.a.a();
        long v1 = this.a.e();
        long v2 = this.b.a();
        int v5 = 0;
        for(int v4 = 0; v4 < arr_d.length; ++v4) {
            v5 += arr_d[v4].c();
        }
        HashMap hashMap0 = new HashMap();
        for(int v3 = 0; v3 < arr_d.length; ++v3) {
            d d0 = arr_d[v3];
            hashMap0.put(d0, ((int)(Math.round(((float)d0.c()) * (((float)(v - v1 + v2)) / ((float)v5))) / b.b(d0))));
        }
        return new c(hashMap0);
    }

    private static int b(d d0) {
        return o.h(d0.d(), d0.b(), d0.a());
    }

    public void c(com.bumptech.glide.load.engine.prefill.d.a[] arr_d$a) {
        a a0 = this.d;
        if(a0 != null) {
            a0.b();
        }
        d[] arr_d = new d[arr_d$a.length];
        for(int v = 0; v < arr_d$a.length; ++v) {
            com.bumptech.glide.load.engine.prefill.d.a d$a0 = arr_d$a[v];
            if(d$a0.b() == null) {
                d$a0.c((this.c == com.bumptech.glide.load.b.a ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565));
            }
            arr_d[v] = d$a0.a();
        }
        c c0 = this.a(arr_d);
        a a1 = new a(this.b, this.a, c0);
        this.d = a1;
        o.y(a1);
    }
}

