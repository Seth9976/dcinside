package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.j;
import java.io.File;
import java.io.InputStream;

public class w implements o {
    public static final class a implements p {
        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        public o e(@NonNull s s0) {
            return new w(s0.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p {
        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            return new w(s0.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements p {
        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            return new w(s0.d(Uri.class, InputStream.class));
        }
    }

    private final o a;

    public w(o o0) {
        this.a = o0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((String)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((String)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull String s, int v, int v1, @NonNull j j0) {
        Uri uri0 = w.e(s);
        return uri0 == null || !this.a.b(uri0) ? null : this.a.a(uri0, v, v1, j0);
    }

    public boolean d(@NonNull String s) {
        return true;
    }

    @Nullable
    private static Uri e(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(s.charAt(0) == 0x2F) {
            return w.f(s);
        }
        Uri uri0 = Uri.parse(s);
        return uri0.getScheme() == null ? w.f(s) : uri0;
    }

    private static Uri f(String s) {
        return Uri.fromFile(new File(s));
    }
}

