package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.signature.e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b implements o {
    public static class a implements p {
        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            class com.bumptech.glide.load.model.b.a.a implements com.bumptech.glide.load.model.b.b {
                final a a;

                @Override  // com.bumptech.glide.load.model.b$b
                public Class a() {
                    return ByteBuffer.class;
                }

                @Override  // com.bumptech.glide.load.model.b$b
                public Object b(byte[] arr_b) {
                    return this.c(arr_b);
                }

                public ByteBuffer c(byte[] arr_b) {
                    return ByteBuffer.wrap(arr_b);
                }
            }

            return new b(new com.bumptech.glide.load.model.b.a.a(this));
        }
    }

    public interface com.bumptech.glide.load.model.b.b {
        Class a();

        Object b(byte[] arg1);
    }

    static class c implements d {
        private final byte[] a;
        private final com.bumptech.glide.load.model.b.b b;

        c(byte[] arr_b, com.bumptech.glide.load.model.b.b b$b0) {
            this.a = arr_b;
            this.b = b$b0;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return this.b.a();
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
            d$a0.e(this.b.b(this.a));
        }
    }

    public static class com.bumptech.glide.load.model.b.d implements p {
        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            class com.bumptech.glide.load.model.b.d.a implements com.bumptech.glide.load.model.b.b {
                final com.bumptech.glide.load.model.b.d a;

                @Override  // com.bumptech.glide.load.model.b$b
                public Class a() {
                    return InputStream.class;
                }

                @Override  // com.bumptech.glide.load.model.b$b
                public Object b(byte[] arr_b) {
                    return this.c(arr_b);
                }

                public InputStream c(byte[] arr_b) {
                    return new ByteArrayInputStream(arr_b);
                }
            }

            return new b(new com.bumptech.glide.load.model.b.d.a(this));
        }
    }

    private final com.bumptech.glide.load.model.b.b a;

    public b(com.bumptech.glide.load.model.b.b b$b0) {
        this.a = b$b0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return this.c(((byte[])object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((byte[])object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull byte[] arr_b, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return new com.bumptech.glide.load.model.o.a(new e(arr_b), new c(arr_b, this.a));
    }

    public boolean d(@NonNull byte[] arr_b) {
        return true;
    }
}

