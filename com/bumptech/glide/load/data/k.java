package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.resource.bitmap.I;
import java.io.IOException;
import java.io.InputStream;

public final class k implements e {
    public static final class a implements com.bumptech.glide.load.data.e.a {
        private final b a;

        public a(b b0) {
            this.a = b0;
        }

        @Override  // com.bumptech.glide.load.data.e$a
        @NonNull
        public Class a() {
            return InputStream.class;
        }

        @Override  // com.bumptech.glide.load.data.e$a
        @NonNull
        public e b(Object object0) {
            return this.c(((InputStream)object0));
        }

        @NonNull
        public e c(InputStream inputStream0) {
            return new k(inputStream0, this.a);
        }
    }

    private final I a;
    private static final int b = 0x500000;

    public k(InputStream inputStream0, b b0) {
        I i0 = new I(inputStream0, b0);
        this.a = i0;
        i0.mark(0x500000);
    }

    @Override  // com.bumptech.glide.load.data.e
    @NonNull
    public Object a() throws IOException {
        return this.d();
    }

    @Override  // com.bumptech.glide.load.data.e
    public void b() {
        this.a.release();
    }

    public void c() {
        this.a.b();
    }

    @NonNull
    public InputStream d() throws IOException {
        this.a.reset();
        return this.a;
    }
}

