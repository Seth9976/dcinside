package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import com.bumptech.glide.load.a;
import java.io.IOException;

public abstract class b implements d {
    private final String a;
    private final AssetManager b;
    private Object c;
    private static final String d = "AssetPathFetcher";

    public b(AssetManager assetManager0, String s) {
        this.b = assetManager0;
        this.a = s;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void b() {
        Object object0 = this.c;
        if(object0 == null) {
            return;
        }
        try {
            this.e(object0);
        }
        catch(IOException unused_ex) {
        }
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public a c() {
        return a.a;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.d
    public void d(@NonNull j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
        try {
            Object object0 = this.f(this.b, this.a);
            this.c = object0;
            d$a0.e(object0);
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", iOException0);
            }
            d$a0.f(iOException0);
        }
    }

    protected abstract void e(Object arg1) throws IOException;

    protected abstract Object f(AssetManager arg1, String arg2) throws IOException;
}

