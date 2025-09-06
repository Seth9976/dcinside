package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.resource.bitmap.I;
import com.bumptech.glide.util.a;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class f {
    interface g {
        int a(ImageHeaderParser arg1) throws IOException;
    }

    interface h {
        ImageType a(ImageHeaderParser arg1) throws IOException;
    }

    private static final int a = 0x500000;

    @RequiresApi(21)
    public static int a(@NonNull List list0, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder0, @NonNull b b0) throws IOException {
        class com.bumptech.glide.load.f.f implements g {
            final ParcelFileDescriptorRewinder a;
            final b b;

            com.bumptech.glide.load.f.f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder0, b b0) {
                this.b = b0;
                super();
            }

            @Override  // com.bumptech.glide.load.f$g
            public int a(ImageHeaderParser imageHeaderParser0) throws IOException {
                int v;
                I i0 = null;
                try {
                    i0 = new I(new FileInputStream(this.a.d().getFileDescriptor()), this.b);
                    v = imageHeaderParser0.c(i0, this.b);
                }
                catch(Throwable throwable0) {
                    if(i0 != null) {
                        i0.release();
                    }
                    this.a.d();
                    throw throwable0;
                }
                i0.release();
                this.a.d();
                return v;
            }
        }

        return f.d(list0, new com.bumptech.glide.load.f.f(parcelFileDescriptorRewinder0, b0));
    }

    public static int b(@NonNull List list0, @Nullable InputStream inputStream0, @NonNull b b0) throws IOException {
        class e implements g {
            final InputStream a;
            final b b;

            e(InputStream inputStream0, b b0) {
                this.b = b0;
                super();
            }

            @Override  // com.bumptech.glide.load.f$g
            public int a(ImageHeaderParser imageHeaderParser0) throws IOException {
                try {
                    return imageHeaderParser0.c(this.a, this.b);
                }
                finally {
                    this.a.reset();
                }
            }
        }

        if(inputStream0 == null) {
            return -1;
        }
        if(!inputStream0.markSupported()) {
            inputStream0 = new I(inputStream0, b0);
        }
        inputStream0.mark(0x500000);
        return f.d(list0, new e(inputStream0, b0));
    }

    public static int c(@NonNull List list0, @Nullable ByteBuffer byteBuffer0, @NonNull b b0) throws IOException {
        class d implements g {
            final ByteBuffer a;
            final b b;

            d(ByteBuffer byteBuffer0, b b0) {
                this.b = b0;
                super();
            }

            @Override  // com.bumptech.glide.load.f$g
            public int a(ImageHeaderParser imageHeaderParser0) throws IOException {
                try {
                    return imageHeaderParser0.a(this.a, this.b);
                }
                finally {
                    a.d(this.a);
                }
            }
        }

        return byteBuffer0 == null ? -1 : f.d(list0, new d(byteBuffer0, b0));
    }

    private static int d(@NonNull List list0, g f$g0) throws IOException {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = f$g0.a(((ImageHeaderParser)list0.get(v1)));
            if(v2 != -1) {
                return v2;
            }
        }
        return -1;
    }

    @NonNull
    @RequiresApi(21)
    public static ImageType e(@NonNull List list0, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder0, @NonNull b b0) throws IOException {
        class c implements h {
            final ParcelFileDescriptorRewinder a;
            final b b;

            c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder0, b b0) {
                this.b = b0;
                super();
            }

            @Override  // com.bumptech.glide.load.f$h
            public ImageType a(ImageHeaderParser imageHeaderParser0) throws IOException {
                ImageType imageHeaderParser$ImageType0;
                I i0 = null;
                try {
                    i0 = new I(new FileInputStream(this.a.d().getFileDescriptor()), this.b);
                    imageHeaderParser$ImageType0 = imageHeaderParser0.b(i0);
                }
                catch(Throwable throwable0) {
                    if(i0 != null) {
                        i0.release();
                    }
                    this.a.d();
                    throw throwable0;
                }
                i0.release();
                this.a.d();
                return imageHeaderParser$ImageType0;
            }
        }

        return f.h(list0, new c(parcelFileDescriptorRewinder0, b0));
    }

    @NonNull
    public static ImageType f(@NonNull List list0, @Nullable InputStream inputStream0, @NonNull b b0) throws IOException {
        class com.bumptech.glide.load.f.a implements h {
            final InputStream a;

            com.bumptech.glide.load.f.a(InputStream inputStream0) {
            }

            @Override  // com.bumptech.glide.load.f$h
            public ImageType a(ImageHeaderParser imageHeaderParser0) throws IOException {
                try {
                    return imageHeaderParser0.b(this.a);
                }
                finally {
                    this.a.reset();
                }
            }
        }

        if(inputStream0 == null) {
            return ImageType.UNKNOWN;
        }
        if(!inputStream0.markSupported()) {
            inputStream0 = new I(inputStream0, b0);
        }
        inputStream0.mark(0x500000);
        return f.h(list0, new com.bumptech.glide.load.f.a(inputStream0));
    }

    @NonNull
    public static ImageType g(@NonNull List list0, @Nullable ByteBuffer byteBuffer0) throws IOException {
        class com.bumptech.glide.load.f.b implements h {
            final ByteBuffer a;

            com.bumptech.glide.load.f.b(ByteBuffer byteBuffer0) {
            }

            @Override  // com.bumptech.glide.load.f$h
            public ImageType a(ImageHeaderParser imageHeaderParser0) throws IOException {
                try {
                    return imageHeaderParser0.d(this.a);
                }
                finally {
                    a.d(this.a);
                }
            }
        }

        return byteBuffer0 == null ? ImageType.UNKNOWN : f.h(list0, new com.bumptech.glide.load.f.b(byteBuffer0));
    }

    @NonNull
    private static ImageType h(@NonNull List list0, h f$h0) throws IOException {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ImageType imageHeaderParser$ImageType0 = f$h0.a(((ImageHeaderParser)list0.get(v1)));
            if(imageHeaderParser$ImageType0 != ImageType.UNKNOWN) {
                return imageHeaderParser$ImageType0;
            }
        }
        return ImageType.UNKNOWN;
    }
}

