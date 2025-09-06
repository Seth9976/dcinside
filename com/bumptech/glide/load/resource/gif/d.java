package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.m;
import com.bumptech.glide.util.a;
import java.io.File;
import java.io.IOException;

public class d implements m {
    private static final String a = "GifEncoder";

    @Override  // com.bumptech.glide.load.d
    public boolean a(@NonNull Object object0, @NonNull File file0, @NonNull j j0) {
        return this.c(((v)object0), file0, j0);
    }

    @Override  // com.bumptech.glide.load.m
    @NonNull
    public c b(@NonNull j j0) {
        return c.a;
    }

    public boolean c(@NonNull v v0, @NonNull File file0, @NonNull j j0) {
        com.bumptech.glide.load.resource.gif.c c0 = (com.bumptech.glide.load.resource.gif.c)v0.get();
        try {
            a.f(c0.f(), file0);
            return true;
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", iOException0);
            }
            return false;
        }
    }
}

