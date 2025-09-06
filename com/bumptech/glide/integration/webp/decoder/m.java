package com.bumptech.glide.integration.webp.decoder;

import android.util.Log;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.util.a;
import java.io.File;
import java.io.IOException;

public class m implements com.bumptech.glide.load.m {
    private static final String a = "WebpEncoder";

    @Override  // com.bumptech.glide.load.d
    public boolean a(Object object0, File file0, j j0) {
        return this.c(((v)object0), file0, j0);
    }

    @Override  // com.bumptech.glide.load.m
    public c b(j j0) {
        return c.a;
    }

    public boolean c(v v0, File file0, j j0) {
        l l0 = (l)v0.get();
        try {
            a.f(l0.f(), file0);
            return true;
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("WebpEncoder", 5)) {
                Log.w("WebpEncoder", "Failed to encode WebP drawable data", iOException0);
            }
            return false;
        }
    }
}

