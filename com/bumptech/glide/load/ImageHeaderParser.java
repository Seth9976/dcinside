package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {
    public static enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean a;

        private ImageType(boolean z) {
            this.a = z;
        }

        private static ImageType[] a() [...] // Inlined contents

        public boolean hasAlpha() {
            return this.a;
        }

        public boolean isWebp() {
            switch(this) {
                case 1: 
                case 2: 
                case 3: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[ImageType.values().length];
            a.a = arr_v;
            try {
                arr_v[ImageType.WEBP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageType.WEBP_A.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final int a = -1;

    int a(@NonNull ByteBuffer arg1, @NonNull b arg2) throws IOException;

    @NonNull
    ImageType b(@NonNull InputStream arg1) throws IOException;

    int c(@NonNull InputStream arg1, @NonNull b arg2) throws IOException;

    @NonNull
    ImageType d(@NonNull ByteBuffer arg1) throws IOException;
}

