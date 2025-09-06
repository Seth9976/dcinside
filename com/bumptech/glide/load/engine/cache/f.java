package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

@Deprecated
public final class f extends d {
    public f(Context context0) {
        this(context0, "image_manager_disk_cache", 0xFA00000);
    }

    public f(Context context0, int v) {
        this(context0, "image_manager_disk_cache", v);
    }

    public f(Context context0, String s, int v) {
        class a implements c {
            final Context a;
            final String b;

            a(Context context0, String s) {
                this.b = s;
                super();
            }

            @Override  // com.bumptech.glide.load.engine.cache.d$c
            public File a() {
                File file0 = this.a.getExternalCacheDir();
                if(file0 == null) {
                    return null;
                }
                return this.b == null ? file0 : new File(file0, this.b);
            }
        }

        super(new a(context0, s), ((long)v));
    }
}

