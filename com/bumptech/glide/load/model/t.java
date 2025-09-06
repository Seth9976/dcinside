package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.j;
import java.io.InputStream;

public class t implements o {
    public static final class a implements p {
        private final Resources a;

        public a(Resources resources0) {
            this.a = resources0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        public o e(s s0) {
            o o0 = s0.d(Uri.class, AssetFileDescriptor.class);
            return new t(this.a, o0);
        }
    }

    @Deprecated
    public static class b implements p {
        private final Resources a;

        public b(Resources resources0) {
            this.a = resources0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            o o0 = s0.d(Uri.class, ParcelFileDescriptor.class);
            return new t(this.a, o0);
        }
    }

    public static class c implements p {
        private final Resources a;

        public c(Resources resources0) {
            this.a = resources0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            o o0 = s0.d(Uri.class, InputStream.class);
            return new t(this.a, o0);
        }
    }

    public static class d implements p {
        private final Resources a;

        public d(Resources resources0) {
            this.a = resources0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(s s0) {
            x x0 = x.c();
            return new t(this.a, x0);
        }
    }

    private final o a;
    private final Resources b;
    private static final String c = "ResourceLoader";

    public t(Resources resources0, o o0) {
        this.b = resources0;
        this.a = o0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((Integer)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.e(((Integer)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull Integer integer0, int v, int v1, @NonNull j j0) {
        Uri uri0 = this.d(integer0);
        return uri0 == null ? null : this.a.a(uri0, v, v1, j0);
    }

    @Nullable
    private Uri d(Integer integer0) {
        try {
            return Uri.parse(("android.resource://" + this.b.getResourcePackageName(((int)integer0)) + '/' + this.b.getResourceTypeName(((int)integer0)) + '/' + this.b.getResourceEntryName(((int)integer0))));
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            if(Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + integer0, resources$NotFoundException0);
            }
            return null;
        }
    }

    public boolean e(@NonNull Integer integer0) {
        return true;
    }
}

