package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import com.bumptech.glide.load.a;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l implements d {
    private final Uri a;
    private final ContentResolver b;
    private Object c;
    private static final String d = "LocalUriFetcher";

    public l(ContentResolver contentResolver0, Uri uri0) {
        this.b = contentResolver0;
        this.a = uri0;
    }

    @Override  // com.bumptech.glide.load.data.d
    public void b() {
        Object object0 = this.c;
        if(object0 != null) {
            try {
                this.e(object0);
            }
            catch(IOException unused_ex) {
            }
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
    public final void d(@NonNull j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
        try {
            Object object0 = this.f(this.a, this.b);
            this.c = object0;
            d$a0.e(object0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", fileNotFoundException0);
            }
            d$a0.f(fileNotFoundException0);
        }
    }

    protected abstract void e(Object arg1) throws IOException;

    protected abstract Object f(Uri arg1, ContentResolver arg2) throws FileNotFoundException;
}

