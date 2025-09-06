package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.signature.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RequiresApi(29)
public final class f implements o {
    static abstract class a implements p {
        private final Context a;
        private final Class b;

        a(Context context0, Class class0) {
            this.a = context0;
            this.b = class0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public final void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public final o e(@NonNull s s0) {
            o o0 = s0.d(File.class, this.b);
            o o1 = s0.d(Uri.class, this.b);
            return new f(this.a, o0, o1, this.b);
        }
    }

    @RequiresApi(29)
    public static final class b extends a {
        public b(Context context0) {
            super(context0, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    public static final class c extends a {
        public c(Context context0) {
            super(context0, InputStream.class);
        }
    }

    static final class d implements com.bumptech.glide.load.data.d {
        private final Context a;
        private final o b;
        private final o c;
        private final Uri d;
        private final int e;
        private final int f;
        private final j g;
        private final Class h;
        private volatile boolean i;
        @Nullable
        private volatile com.bumptech.glide.load.data.d j;
        private static final String[] k;

        static {
            d.k = new String[]{"_data"};
        }

        d(Context context0, o o0, o o1, Uri uri0, int v, int v1, j j0, Class class0) {
            this.a = context0.getApplicationContext();
            this.b = o0;
            this.c = o1;
            this.d = uri0;
            this.e = v;
            this.f = v1;
            this.g = j0;
            this.h = class0;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return this.h;
        }

        @Override  // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d d0 = this.j;
            if(d0 != null) {
                d0.b();
            }
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.a;
        }

        @Override  // com.bumptech.glide.load.data.d
        public void cancel() {
            this.i = true;
            com.bumptech.glide.load.data.d d0 = this.j;
            if(d0 != null) {
                d0.cancel();
            }
        }

        @Override  // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
            try {
                com.bumptech.glide.load.data.d d0 = this.f();
                if(d0 == null) {
                    d$a0.f(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
                    return;
                }
                this.j = d0;
                if(this.i) {
                    this.cancel();
                    return;
                }
                d0.d(j0, d$a0);
                return;
            }
            catch(FileNotFoundException fileNotFoundException0) {
            }
            d$a0.f(fileNotFoundException0);
        }

        @Nullable
        private com.bumptech.glide.load.model.o.a e() throws FileNotFoundException {
            if(Environment.isExternalStorageLegacy()) {
                File file0 = this.h(this.d);
                return this.b.a(file0, this.e, this.f, this.g);
            }
            if(com.bumptech.glide.load.data.mediastore.b.a(this.d)) {
                return this.c.a(this.d, this.e, this.f, this.g);
            }
            if(this.g()) {
                Uri uri0 = MediaStore.setRequireOriginal(this.d);
                return this.c.a(uri0, this.e, this.f, this.g);
            }
            return this.c.a(this.d, this.e, this.f, this.g);
        }

        @Nullable
        private com.bumptech.glide.load.data.d f() throws FileNotFoundException {
            com.bumptech.glide.load.model.o.a o$a0 = this.e();
            return o$a0 == null ? null : o$a0.c;
        }

        private boolean g() {
            return this.a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @NonNull
        private File h(Uri uri0) throws FileNotFoundException {
            try(Cursor cursor0 = this.a.getContentResolver().query(uri0, d.k, null, null, null)) {
                if(cursor0 == null || !cursor0.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri0);
                }
                String s = cursor0.getString(cursor0.getColumnIndexOrThrow("_data"));
                if(TextUtils.isEmpty(s)) {
                    throw new FileNotFoundException("File path was empty in media store for: " + uri0);
                }
                return new File(s);
            }
        }
    }

    private final Context a;
    private final o b;
    private final o c;
    private final Class d;

    f(Context context0, o o0, o o1, Class class0) {
        this.a = context0.getApplicationContext();
        this.b = o0;
        this.c = o1;
        this.d = class0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        return this.c(((Uri)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((Uri)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull Uri uri0, int v, int v1, @NonNull j j0) {
        return new com.bumptech.glide.load.model.o.a(new e(uri0), new d(this.a, this.b, this.c, uri0, v, v1, j0, this.d));
    }

    public boolean d(@NonNull Uri uri0) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.mediastore.b.c(uri0);
    }
}

