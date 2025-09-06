package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.j;
import com.bumptech.glide.load.resource.drawable.i;
import com.bumptech.glide.load.resource.drawable.m;
import java.io.IOException;
import java.io.InputStream;

public final class f implements o {
    static final class a implements e, p {
        private final Context a;

        a(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public void b(Object object0) throws IOException {
            this.f(((AssetFileDescriptor)object0));
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public Object c(@Nullable Resources.Theme resources$Theme0, Resources resources0, int v) {
            return this.g(resources$Theme0, resources0, v);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            return new f(this.a, this);
        }

        public void f(AssetFileDescriptor assetFileDescriptor0) throws IOException {
            assetFileDescriptor0.close();
        }

        public AssetFileDescriptor g(@Nullable Resources.Theme resources$Theme0, Resources resources0, int v) {
            return resources0.openRawResourceFd(v);
        }
    }

    static final class b implements e, p {
        private final Context a;

        b(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public Class a() {
            return Drawable.class;
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public void b(Object object0) throws IOException {
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public Object c(@Nullable Resources.Theme resources$Theme0, Resources resources0, int v) {
            return this.g(resources$Theme0, resources0, v);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            return new f(this.a, this);
        }

        public void f(Drawable drawable0) throws IOException {
        }

        public Drawable g(@Nullable Resources.Theme resources$Theme0, Resources resources0, int v) {
            return i.a(this.a, v, resources$Theme0);
        }
    }

    static final class c implements e, p {
        private final Context a;

        c(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public Class a() {
            return InputStream.class;
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public void b(Object object0) throws IOException {
            this.f(((InputStream)object0));
        }

        @Override  // com.bumptech.glide.load.model.f$e
        public Object c(@Nullable Resources.Theme resources$Theme0, Resources resources0, int v) {
            return this.g(resources$Theme0, resources0, v);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            return new f(this.a, this);
        }

        public void f(InputStream inputStream0) throws IOException {
            inputStream0.close();
        }

        public InputStream g(@Nullable Resources.Theme resources$Theme0, Resources resources0, int v) {
            return resources0.openRawResource(v);
        }
    }

    static final class d implements com.bumptech.glide.load.data.d {
        @Nullable
        private final Resources.Theme a;
        private final Resources b;
        private final e c;
        private final int d;
        @Nullable
        private Object e;

        d(@Nullable Resources.Theme resources$Theme0, Resources resources0, e f$e0, int v) {
            this.a = resources$Theme0;
            this.b = resources0;
            this.c = f$e0;
            this.d = v;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return this.c.a();
        }

        @Override  // com.bumptech.glide.load.data.d
        public void b() {
            Object object0 = this.e;
            if(object0 != null) {
                try {
                    this.c.b(object0);
                }
                catch(IOException unused_ex) {
                }
            }
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.a;
        }

        @Override  // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override  // com.bumptech.glide.load.data.d
        public void d(@NonNull j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
            try {
                Object object0 = this.c.c(this.a, this.b, this.d);
                this.e = object0;
                d$a0.e(object0);
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                d$a0.f(resources$NotFoundException0);
            }
        }
    }

    interface e {
        Class a();

        void b(Object arg1) throws IOException;

        Object c(@Nullable Resources.Theme arg1, Resources arg2, int arg3);
    }

    private final Context a;
    private final e b;

    f(Context context0, e f$e0) {
        this.a = context0.getApplicationContext();
        this.b = f$e0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return this.d(((Integer)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.f(((Integer)object0));
    }

    public static p c(Context context0) {
        return new a(context0);
    }

    public com.bumptech.glide.load.model.o.a d(@NonNull Integer integer0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        Resources resources0;
        Resources.Theme resources$Theme0 = (Resources.Theme)j0.c(m.b);
        if(resources$Theme0 != null) {
            resources0 = resources$Theme0.getResources();
            return new com.bumptech.glide.load.model.o.a(new com.bumptech.glide.signature.e(integer0), new d(resources$Theme0, resources0, this.b, ((int)integer0)));
        }
        resources0 = this.a.getResources();
        return new com.bumptech.glide.load.model.o.a(new com.bumptech.glide.signature.e(integer0), new d(null, resources0, this.b, ((int)integer0)));
    }

    public static p e(Context context0) {
        return new b(context0);
    }

    public boolean f(@NonNull Integer integer0) {
        return true;
    }

    public static p g(Context context0) {
        return new c(context0);
    }
}

