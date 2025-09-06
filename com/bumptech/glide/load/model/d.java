package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import com.bumptech.glide.signature.e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d implements o {
    static final class a implements com.bumptech.glide.load.data.d {
        private final File a;

        a(File file0) {
            this.a = file0;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return ByteBuffer.class;
        }

        @Override  // com.bumptech.glide.load.data.d
        public void b() {
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
                d$a0.e(com.bumptech.glide.util.a.a(this.a));
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", iOException0);
                }
                d$a0.f(iOException0);
            }
        }
    }

    public static class b implements p {
        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            return new d();
        }
    }

    private static final String a = "ByteBufferFileLoader";

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return this.c(((File)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((File)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull File file0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return new com.bumptech.glide.load.model.o.a(new e(file0), new a(file0));
    }

    public boolean d(@NonNull File file0) {
        return true;
    }
}

