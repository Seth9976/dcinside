package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.util.m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class q implements ImageHeaderParser {
    static final class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer0) {
            this.a = byteBuffer0;
            byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.q$c
        public int a() throws com.bumptech.glide.load.resource.bitmap.q.c.a {
            return this.c() << 8 | this.c();
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.q$c
        public int b(byte[] arr_b, int v) {
            int v1 = Math.min(v, this.a.remaining());
            if(v1 == 0) {
                return -1;
            }
            this.a.get(arr_b, 0, v1);
            return v1;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.q$c
        public short c() throws com.bumptech.glide.load.resource.bitmap.q.c.a {
            if(this.a.remaining() < 1) {
                throw new com.bumptech.glide.load.resource.bitmap.q.c.a();
            }
            return (short)(this.a.get() & 0xFF);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.q$c
        public long skip(long v) {
            int v1 = (int)Math.min(this.a.remaining(), v);
            this.a.position(this.a.position() + v1);
            return (long)v1;
        }
    }

    static final class b {
        private final ByteBuffer a;

        b(byte[] arr_b, int v) {
            this.a = (ByteBuffer)ByteBuffer.wrap(arr_b).order(ByteOrder.BIG_ENDIAN).limit(v);
        }

        short a(int v) {
            return this.c(v, 2) ? this.a.getShort(v) : -1;
        }

        // 去混淆评级： 低(20)
        int b(int v) {
            return this.c(v, 4) ? this.a.getInt(v) : -1;
        }

        private boolean c(int v, int v1) {
            return this.a.remaining() - v >= v1;
        }

        int d() {
            return this.a.remaining();
        }

        void e(ByteOrder byteOrder0) {
            this.a.order(byteOrder0);
        }
    }

    interface c {
        public static final class com.bumptech.glide.load.resource.bitmap.q.c.a extends IOException {
            private static final long a = 1L;

            com.bumptech.glide.load.resource.bitmap.q.c.a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] arg1, int arg2) throws IOException;

        short c() throws IOException;

        long skip(long arg1) throws IOException;
    }

    static final class d implements c {
        private final InputStream a;

        d(InputStream inputStream0) {
            this.a = inputStream0;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.q$c
        public int a() throws IOException {
            return this.c() << 8 | this.c();
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.q$c
        public int b(byte[] arr_b, int v) throws IOException {
            int v1 = 0;
            int v2 = 0;
            while(v1 < v) {
                v2 = this.a.read(arr_b, v1, v - v1);
                if(v2 == -1) {
                    break;
                }
                v1 += v2;
            }
            if(v1 == 0 && v2 == -1) {
                throw new com.bumptech.glide.load.resource.bitmap.q.c.a();
            }
            return v1;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.q$c
        public short c() throws IOException {
            int v = this.a.read();
            if(v == -1) {
                throw new com.bumptech.glide.load.resource.bitmap.q.c.a();
            }
            return (short)v;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.q$c
        public long skip(long v) throws IOException {
            if(v < 0L) {
                return 0L;
            }
            long v1;
            for(v1 = v; v1 > 0L; v1 -= v2) {
                long v2 = this.a.skip(v1);
                if(v2 <= 0L) {
                    if(this.a.read() == -1) {
                        break;
                    }
                    v2 = 1L;
                }
            }
            return v - v1;
        }
    }

    private static final int A = 1635150182;
    private static final int B = 1635150195;
    private static final String b = "DfltImageHeaderParser";
    private static final int c = 0x474946;
    private static final int d = 0x89504E47;
    static final int e = 0xFFD8;
    private static final int f = 0x4D4D;
    private static final int g = 0x4949;
    private static final String h = "Exif\u0000\u0000";
    static final byte[] i = null;
    private static final int j = 0xDA;
    private static final int k = 0xD9;
    static final int l = 0xFF;
    static final int m = 0xE1;
    private static final int n = 274;
    private static final int[] o = null;
    private static final int p = 1380533830;
    private static final int q = 0x57454250;
    private static final int r = 0x56503800;
    private static final int s = 0xFFFFFF00;
    private static final int t = 0xFF;
    private static final int u = 88;
    private static final int v = 76;
    private static final int w = 2;
    private static final int x = 16;
    private static final int y = 8;
    private static final int z = 0x66747970;

    static {
        q.i = new byte[]{69, 120, 105, 102, 0, 0};
        q.o = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    public int a(@NonNull ByteBuffer byteBuffer0, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b b0) throws IOException {
        return this.f(new a(((ByteBuffer)m.e(byteBuffer0))), ((com.bumptech.glide.load.engine.bitmap_recycle.b)m.e(b0)));
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageType b(@NonNull InputStream inputStream0) throws IOException {
        return this.g(new d(((InputStream)m.e(inputStream0))));
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    public int c(@NonNull InputStream inputStream0, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b b0) throws IOException {
        return this.f(new d(((InputStream)m.e(inputStream0))), ((com.bumptech.glide.load.engine.bitmap_recycle.b)m.e(b0)));
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageType d(@NonNull ByteBuffer byteBuffer0) throws IOException {
        return this.g(new a(((ByteBuffer)m.e(byteBuffer0))));
    }

    private static int e(int v, int v1) [...] // Inlined contents

    private int f(c q$c0, com.bumptech.glide.load.engine.bitmap_recycle.b b0) throws IOException {
        try {
            int v = q$c0.a();
            if(!q.h(v)) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn\'t handle magic number: " + v);
                }
                return -1;
            }
            int v1 = this.j(q$c0);
            if(v1 == -1) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] arr_b = (byte[])b0.d(v1, byte[].class);
            try {
                return this.l(q$c0, arr_b, v1);
            }
            finally {
                b0.put(arr_b);
            }
        }
        catch(com.bumptech.glide.load.resource.bitmap.q.c.a unused_ex) {
            return -1;
        }
    }

    @NonNull
    private ImageType g(c q$c0) throws IOException {
        try {
            int v = q$c0.a();
            if(v == 0xFFD8) {
                return ImageType.JPEG;
            }
            int v1 = v << 8 | q$c0.c();
            if(v1 == 0x474946) {
                return ImageType.GIF;
            }
            int v2 = v1 << 8 | q$c0.c();
            switch(v2) {
                case 0x89504E47: {
                    q$c0.skip(21L);
                    try {
                        return q$c0.c() < 3 ? ImageType.PNG : ImageType.PNG_A;
                    }
                    catch(com.bumptech.glide.load.resource.bitmap.q.c.a unused_ex) {
                        return ImageType.PNG;
                    }
                }
                case 1380533830: {
                    q$c0.skip(4L);
                    if((q$c0.a() << 16 | q$c0.a()) != 0x57454250) {
                        return ImageType.UNKNOWN;
                    }
                    int v3 = q$c0.a() << 16 | q$c0.a();
                    if((v3 & 0xFFFFFF00) != 0x56503800) {
                        return ImageType.UNKNOWN;
                    }
                    switch(v3 & 0xFF) {
                        case 76: {
                            q$c0.skip(4L);
                            return (q$c0.c() & 8) == 0 ? ImageType.WEBP : ImageType.WEBP_A;
                        }
                        case 88: {
                            q$c0.skip(4L);
                            int v4 = q$c0.c();
                            if((v4 & 2) != 0) {
                                return ImageType.ANIMATED_WEBP;
                            }
                            return (v4 & 16) == 0 ? ImageType.WEBP : ImageType.WEBP_A;
                        }
                        default: {
                            return ImageType.WEBP;
                        }
                    }
                }
                default: {
                    return this.m(q$c0, v2);
                }
            }
        }
        catch(com.bumptech.glide.load.resource.bitmap.q.c.a unused_ex) {
            return ImageType.UNKNOWN;
        }
    }

    private static boolean h(int v) {
        return (v & 0xFFD8) == 0xFFD8 || (v == 0x4949 || v == 0x4D4D);
    }

    private boolean i(byte[] arr_b, int v) {
        boolean z = arr_b != null && v > q.i.length;
        if(z) {
            int v1 = 0;
            while(true) {
                byte[] arr_b1 = q.i;
                if(v1 >= arr_b1.length) {
                    break;
                }
                if(arr_b[v1] == arr_b1[v1]) {
                    ++v1;
                    continue;
                }
                return false;
            }
        }
        return z;
    }

    private int j(c q$c0) throws IOException {
        int v2;
        while(true) {
            int v = q$c0.c();
            if(v != 0xFF) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + v);
                }
                return -1;
            }
            int v1 = q$c0.c();
            if(v1 == 0xDA) {
                return -1;
            }
            if(v1 == 0xD9) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            v2 = q$c0.a() - 2;
            if(v1 == 0xE1) {
                break;
            }
            long v3 = q$c0.skip(((long)v2));
            if(v3 != ((long)v2)) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + v1 + ", wanted to skip: " + v2 + ", but actually skipped: " + v3);
                }
                return -1;
            }
        }
        return v2;
    }

    private static int k(b q$b0) {
        ByteOrder byteOrder0;
        int v = q$b0.a(6);
        switch(v) {
            case 0x4949: {
                byteOrder0 = ByteOrder.LITTLE_ENDIAN;
                break;
            }
            case 0x4D4D: {
                byteOrder0 = ByteOrder.BIG_ENDIAN;
                break;
            }
            default: {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + v);
                }
                byteOrder0 = ByteOrder.BIG_ENDIAN;
            }
        }
        q$b0.e(byteOrder0);
        int v1 = q$b0.b(10);
        int v2 = q$b0.a(v1 + 6);
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = v1 + 8 + v3 * 12;
            if(q$b0.a(v4) == 274) {
                int v5 = q$b0.a(v4 + 2);
                if(v5 >= 1 && v5 <= 12) {
                    int v6 = q$b0.b(v4 + 4);
                    if(v6 >= 0) {
                        if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + v3 + " tagType=" + 274 + " formatCode=" + v5 + " componentCount=" + v6);
                        }
                        int v7 = v6 + q.o[v5];
                        if(v7 <= 4) {
                            if(v4 + 8 >= 0 && v4 + 8 <= q$b0.d()) {
                                if(v7 >= 0 && v7 + (v4 + 8) <= q$b0.d()) {
                                    return q$b0.a(v4 + 8);
                                }
                                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + 274);
                                }
                            }
                            else if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + (v4 + 8) + " tagType=" + 274);
                            }
                        }
                        else if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + v5);
                        }
                    }
                    else if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                }
                else if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + v5);
                }
            }
        }
        return -1;
    }

    private int l(c q$c0, byte[] arr_b, int v) throws IOException {
        int v1 = q$c0.b(arr_b, v);
        if(v1 != v) {
            if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + v + ", actually read: " + v1);
            }
            return -1;
        }
        if(this.i(arr_b, v)) {
            return q.k(new b(arr_b, v));
        }
        if(Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    private ImageType m(c q$c0, int v) throws IOException {
        if((q$c0.a() << 16 | q$c0.a()) != 0x66747970) {
            return ImageType.UNKNOWN;
        }
        int v1 = 0;
        int v2 = q$c0.a() << 16 | q$c0.a();
        if(v2 == 1635150195) {
            return ImageType.ANIMATED_AVIF;
        }
        boolean z = v2 == 1635150182;
        q$c0.skip(4L);
        int v3 = v - 16;
        if(v3 % 4 == 0) {
            while(v1 < 5 && v3 > 0) {
                int v4 = q$c0.a() << 16 | q$c0.a();
                if(v4 == 1635150195) {
                    return ImageType.ANIMATED_AVIF;
                }
                if(v4 == 1635150182) {
                    z = true;
                }
                ++v1;
                v3 -= 4;
            }
        }
        return z ? ImageType.AVIF : ImageType.UNKNOWN;
    }
}

