package com.bumptech.glide.load.resource.drawable;

import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(28)
public final class g {
    static final class a implements v {
        private final AnimatedImageDrawable a;
        private static final int b = 2;

        a(AnimatedImageDrawable animatedImageDrawable0) {
            this.a = animatedImageDrawable0;
        }

        @Override  // com.bumptech.glide.load.engine.v
        @NonNull
        public Class a() {
            return Drawable.class;
        }

        @NonNull
        public AnimatedImageDrawable b() {
            return this.a;
        }

        @Override  // com.bumptech.glide.load.engine.v
        @NonNull
        public Object get() {
            return this.b();
        }

        // 去混淆评级： 低(20)
        @Override  // com.bumptech.glide.load.engine.v
        public int getSize() {
            return this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 8;
        }

        @Override  // com.bumptech.glide.load.engine.v
        public void recycle() {
            this.a.stop();
            this.a.clearAnimationCallbacks();
        }
    }

    static final class b implements l {
        private final g a;

        b(g g0) {
            this.a = g0;
        }

        @Override  // com.bumptech.glide.load.l
        public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
            return this.d(((ByteBuffer)object0), j0);
        }

        @Override  // com.bumptech.glide.load.l
        public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
            return this.c(((ByteBuffer)object0), v, v1, j0);
        }

        public v c(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull j j0) throws IOException {
            ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(byteBuffer0);
            return this.a.b(imageDecoder$Source0, v, v1, j0);
        }

        public boolean d(@NonNull ByteBuffer byteBuffer0, @NonNull j j0) throws IOException {
            return this.a.d(byteBuffer0);
        }
    }

    static final class c implements l {
        private final g a;

        c(g g0) {
            this.a = g0;
        }

        @Override  // com.bumptech.glide.load.l
        public boolean a(@NonNull Object object0, @NonNull j j0) throws IOException {
            return this.d(((InputStream)object0), j0);
        }

        @Override  // com.bumptech.glide.load.l
        public v b(@NonNull Object object0, int v, int v1, @NonNull j j0) throws IOException {
            return this.c(((InputStream)object0), v, v1, j0);
        }

        public v c(@NonNull InputStream inputStream0, int v, int v1, @NonNull j j0) throws IOException {
            ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream0));
            return this.a.b(imageDecoder$Source0, v, v1, j0);
        }

        public boolean d(@NonNull InputStream inputStream0, @NonNull j j0) throws IOException {
            return this.a.c(inputStream0);
        }
    }

    private final List a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b b;

    private g(List list0, com.bumptech.glide.load.engine.bitmap_recycle.b b0) {
        this.a = list0;
        this.b = b0;
    }

    public static l a(List list0, com.bumptech.glide.load.engine.bitmap_recycle.b b0) {
        return new b(new g(list0, b0));
    }

    v b(@NonNull ImageDecoder.Source imageDecoder$Source0, int v, int v1, @NonNull j j0) throws IOException {
        Drawable drawable0 = ImageDecoder.decodeDrawable(imageDecoder$Source0, new i(v, v1, j0));
        if(!com.bumptech.glide.load.resource.drawable.a.a(drawable0)) {
            throw new IOException("Received unexpected drawable type for animated image, failing: " + drawable0);
        }
        return new a(((AnimatedImageDrawable)drawable0));
    }

    boolean c(InputStream inputStream0) throws IOException {
        return this.e(f.f(this.a, inputStream0, this.b));
    }

    boolean d(ByteBuffer byteBuffer0) throws IOException {
        return this.e(f.g(this.a, byteBuffer0));
    }

    private boolean e(ImageType imageHeaderParser$ImageType0) {
        return imageHeaderParser$ImageType0 == ImageType.ANIMATED_WEBP || Build.VERSION.SDK_INT >= 0x1F && imageHeaderParser$ImageType0 == ImageType.ANIMATED_AVIF;
    }

    public static l f(List list0, com.bumptech.glide.load.engine.bitmap_recycle.b b0) {
        return new c(new g(list0, b0));
    }
}

