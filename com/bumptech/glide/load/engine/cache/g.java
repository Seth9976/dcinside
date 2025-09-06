package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.File;

public final class g extends d {
    public g(Context context0) {
        this(context0, "image_manager_disk_cache", 0xFA00000L);
    }

    public g(Context context0, long v) {
        this(context0, "image_manager_disk_cache", v);
    }

    public g(Context context0, String s, long v) {
        class a implements c {
            final Context a;
            final String b;

            a(Context context0, String s) {
                this.b = s;
                super();
            }

            @Override  // com.bumptech.glide.load.engine.cache.d$c
            public File a() {
                File file0 = this.b();
                if(file0 != null && file0.exists()) {
                    return file0;
                }
                File file1 = this.a.getExternalCacheDir();
                if(file1 != null && file1.canWrite()) {
                    return this.b == null ? file1 : new File(file1, this.b);
                }
                return file0;
            }

            @Nullable
            private File b() {
                File file0 = this.a.getCacheDir();
                if(file0 == null) {
                    return null;
                }
                return this.b == null ? file0 : new File(file0, this.b);
            }
        }

        super(new a(context0, s), v);
    }
}

