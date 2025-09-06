package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class e implements o {
    public interface a {
        Class a();

        void b(Object arg1) throws IOException;

        Object c(String arg1) throws IllegalArgumentException;
    }

    static final class b implements d {
        private final String a;
        private final a b;
        private Object c;

        b(String s, a e$a0) {
            this.a = s;
            this.b = e$a0;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return this.b.a();
        }

        @Override  // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.b.b(this.c);
            }
            catch(IOException unused_ex) {
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
                Object object0 = this.b.c(this.a);
                this.c = object0;
                d$a0.e(object0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                d$a0.f(illegalArgumentException0);
            }
        }
    }

    public static final class c implements p {
        private final a a;

        public c() {
            class com.bumptech.glide.load.model.e.c.a implements a {
                final c a;

                @Override  // com.bumptech.glide.load.model.e$a
                public Class a() {
                    return InputStream.class;
                }

                @Override  // com.bumptech.glide.load.model.e$a
                public void b(Object object0) throws IOException {
                    this.d(((InputStream)object0));
                }

                @Override  // com.bumptech.glide.load.model.e$a
                public Object c(String s) throws IllegalArgumentException {
                    return this.e(s);
                }

                public void d(InputStream inputStream0) throws IOException {
                    inputStream0.close();
                }

                public InputStream e(String s) {
                    if(!s.startsWith("data:image")) {
                        throw new IllegalArgumentException("Not a valid image data URL.");
                    }
                    int v = s.indexOf(44);
                    if(v == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    }
                    if(!s.substring(0, v).endsWith(";base64")) {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    return new ByteArrayInputStream(Base64.decode(s.substring(v + 1), 0));
                }
            }

            this.a = new com.bumptech.glide.load.model.e.c.a(this);
        }

        @Override  // com.bumptech.glide.load.model.p
        public void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public o e(@NonNull s s0) {
            return new e(this.a);
        }
    }

    private final a a;
    private static final String b = "data:image";
    private static final String c = ";base64";

    public e(a e$a0) {
        this.a = e$a0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return new com.bumptech.glide.load.model.o.a(new com.bumptech.glide.signature.e(object0), new b(object0.toString(), this.a));
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return object0.toString().startsWith("data:image");
    }
}

