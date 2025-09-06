package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class g implements o {
    public static class a implements p {
        private final d a;

        public a(d g$d0) {
            this.a = g$d0;
        }

        @Override  // com.bumptech.glide.load.model.p
        public final void d() {
        }

        @Override  // com.bumptech.glide.load.model.p
        @NonNull
        public final o e(@NonNull s s0) {
            return new g(this.a);
        }
    }

    public static class b extends a {
        public b() {
            class com.bumptech.glide.load.model.g.b.a implements d {
                com.bumptech.glide.load.model.g.b.a() {
                    super();
                }

                @Override  // com.bumptech.glide.load.model.g$d
                public Class a() {
                    return ParcelFileDescriptor.class;
                }

                @Override  // com.bumptech.glide.load.model.g$d
                public void b(Object object0) throws IOException {
                    this.d(((ParcelFileDescriptor)object0));
                }

                @Override  // com.bumptech.glide.load.model.g$d
                public Object c(File file0) throws FileNotFoundException {
                    return this.e(file0);
                }

                public void d(ParcelFileDescriptor parcelFileDescriptor0) throws IOException {
                    parcelFileDescriptor0.close();
                }

                public ParcelFileDescriptor e(File file0) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file0, 0x10000000);
                }
            }

            super(new com.bumptech.glide.load.model.g.b.a());
        }
    }

    static final class c implements com.bumptech.glide.load.data.d {
        private final File a;
        private final d b;
        private Object c;

        c(File file0, d g$d0) {
            this.a = file0;
            this.b = g$d0;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return this.b.a();
        }

        @Override  // com.bumptech.glide.load.data.d
        public void b() {
            Object object0 = this.c;
            if(object0 != null) {
                try {
                    this.b.b(object0);
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
                Object object0 = this.b.c(this.a);
                this.c = object0;
                d$a0.e(object0);
            }
            catch(FileNotFoundException fileNotFoundException0) {
                if(Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", fileNotFoundException0);
                }
                d$a0.f(fileNotFoundException0);
            }
        }
    }

    public interface d {
        Class a();

        void b(Object arg1) throws IOException;

        Object c(File arg1) throws FileNotFoundException;
    }

    public static class e extends a {
        public e() {
            class com.bumptech.glide.load.model.g.e.a implements d {
                com.bumptech.glide.load.model.g.e.a() {
                    super();
                }

                @Override  // com.bumptech.glide.load.model.g$d
                public Class a() {
                    return InputStream.class;
                }

                @Override  // com.bumptech.glide.load.model.g$d
                public void b(Object object0) throws IOException {
                    this.d(((InputStream)object0));
                }

                @Override  // com.bumptech.glide.load.model.g$d
                public Object c(File file0) throws FileNotFoundException {
                    return this.e(file0);
                }

                public void d(InputStream inputStream0) throws IOException {
                    inputStream0.close();
                }

                public InputStream e(File file0) throws FileNotFoundException {
                    return new FileInputStream(file0);
                }
            }

            super(new com.bumptech.glide.load.model.g.e.a());
        }
    }

    private final d a;
    private static final String b = "FileLoader";

    public g(d g$d0) {
        this.a = g$d0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return this.c(((File)object0), v, v1, j0);
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        return this.d(((File)object0));
    }

    public com.bumptech.glide.load.model.o.a c(@NonNull File file0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        return new com.bumptech.glide.load.model.o.a(new com.bumptech.glide.signature.e(file0), new c(file0, this.a));
    }

    public boolean d(@NonNull File file0) {
        return true;
    }
}

