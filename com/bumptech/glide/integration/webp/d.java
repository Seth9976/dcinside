package com.bumptech.glide.integration.webp;

import com.bumptech.glide.load.resource.bitmap.I;
import com.bumptech.glide.util.m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class d {
    static final class a implements c {
        private final byte[] a;
        private final int b;
        private final int c;
        private int d;

        a(byte[] arr_b, int v, int v1) {
            this.a = arr_b;
            this.b = v;
            this.c = v1;
            this.d = v;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int a() throws IOException {
            return this.d() << 8 & 0xFF00 | this.d() & 0xFF;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int b(byte[] arr_b, int v) throws IOException {
            int v1 = Math.min(this.b + this.c - this.d, v);
            if(v1 == 0) {
                return -1;
            }
            System.arraycopy(this.a, this.d, arr_b, 0, v1);
            return v1;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public short c() throws IOException {
            return (short)(this.d() & 0xFF);
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int d() throws IOException {
            int v = this.d;
            if(v >= this.b + this.c) {
                return -1;
            }
            this.d = v + 1;
            return this.a[v];
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public long skip(long v) throws IOException {
            int v1 = (int)Math.min(this.b + this.c - this.d, v);
            this.d += v1;
            return (long)v1;
        }
    }

    static final class b implements c {
        private final ByteBuffer a;

        b(ByteBuffer byteBuffer0) {
            this.a = byteBuffer0;
            byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int a() throws IOException {
            return this.d() << 8 & 0xFF00 | this.d() & 0xFF;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int b(byte[] arr_b, int v) throws IOException {
            int v1 = Math.min(v, this.a.remaining());
            if(v1 == 0) {
                return -1;
            }
            this.a.get(arr_b, 0, v1);
            return v1;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public short c() throws IOException {
            return (short)(this.d() & 0xFF);
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int d() throws IOException {
            return this.a.remaining() >= 1 ? this.a.get() : -1;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public long skip(long v) throws IOException {
            int v1 = (int)Math.min(this.a.remaining(), v);
            this.a.position(this.a.position() + v1);
            return (long)v1;
        }
    }

    interface c {
        int a() throws IOException;

        int b(byte[] arg1, int arg2) throws IOException;

        short c() throws IOException;

        int d() throws IOException;

        long skip(long arg1) throws IOException;
    }

    static final class com.bumptech.glide.integration.webp.d.d implements c {
        private final InputStream a;

        com.bumptech.glide.integration.webp.d.d(InputStream inputStream0) {
            this.a = inputStream0;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int a() throws IOException {
            return this.a.read() << 8 & 0xFF00 | this.a.read() & 0xFF;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int b(byte[] arr_b, int v) throws IOException {
            int v1;
            for(v1 = v; v1 > 0; v1 -= v2) {
                int v2 = this.a.read(arr_b, v - v1, v1);
                if(v2 == -1) {
                    break;
                }
            }
            return v - v1;
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public short c() throws IOException {
            return (short)(this.a.read() & 0xFF);
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
        public int d() throws IOException {
            return this.a.read();
        }

        @Override  // com.bumptech.glide.integration.webp.d$c
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

    public static enum e {
        WEBP_SIMPLE(false, false),
        WEBP_LOSSLESS(false, false),
        WEBP_LOSSLESS_WITH_ALPHA(true, false),
        WEBP_EXTENDED(false, false),
        WEBP_EXTENDED_WITH_ALPHA(true, false),
        WEBP_EXTENDED_ANIMATED(false, true),
        NONE_WEBP(false, false);

        private final boolean a;
        private final boolean b;

        private e(boolean z, boolean z1) {
            this.a = z;
            this.b = z1;
        }

        public boolean a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    public static final int a = 21;
    private static final int b = 1380533830;
    private static final int c = 0x57454250;
    private static final int d = 0x56503820;
    private static final int e = 0x5650384C;
    private static final int f = 1448097880;
    private static final int g = 16;
    private static final int h = 2;
    private static final int i = 8;
    private static final String j = "UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==";
    public static final boolean k;

    static {
        d.k = true;
    }

    private static e a(c d$c0) throws IOException {
        if((d$c0.a() << 16 & 0xFFFF0000 | d$c0.a() & 0xFFFF) != 1380533830) {
            return e.i;
        }
        d$c0.skip(4L);
        if((d$c0.a() << 16 & 0xFFFF0000 | d$c0.a() & 0xFFFF) != 0x57454250) {
            return e.i;
        }
        int v = d$c0.a() << 16 & 0xFFFF0000 | d$c0.a() & 0xFFFF;
        if(v == 0x56503820) {
            return e.c;
        }
        switch(v) {
            case 0x5650384C: {
                d$c0.skip(4L);
                return (d$c0.d() & 8) == 0 ? e.d : e.e;
            }
            case 1448097880: {
                d$c0.skip(4L);
                int v1 = d$c0.d();
                if((v1 & 2) != 0) {
                    return e.h;
                }
                return (v1 & 16) == 0 ? e.f : e.g;
            }
            default: {
                return e.i;
            }
        }
    }

    public static e b(InputStream inputStream0, com.bumptech.glide.load.engine.bitmap_recycle.b b0) throws IOException {
        if(inputStream0 == null) {
            return e.i;
        }
        if(!inputStream0.markSupported()) {
            inputStream0 = new I(inputStream0, b0);
        }
        inputStream0.mark(21);
        try {
            return d.a(new com.bumptech.glide.integration.webp.d.d(((InputStream)m.e(inputStream0))));
        }
        finally {
            inputStream0.reset();
        }
    }

    public static e c(ByteBuffer byteBuffer0) throws IOException {
        return byteBuffer0 == null ? e.i : d.a(new b(((ByteBuffer)m.e(byteBuffer0))));
    }

    public static e d(byte[] arr_b) throws IOException {
        return d.e(arr_b, 0, arr_b.length);
    }

    public static e e(byte[] arr_b, int v, int v1) throws IOException {
        return d.a(new a(arr_b, v, v1));
    }

    public static boolean f(e d$e0) {
        return d$e0 == e.h;
    }

    public static boolean g() [...] // Inlined contents

    public static boolean h(e d$e0) {
        return d$e0 != e.i && d$e0 != e.c;
    }

    public static boolean i(e d$e0) [...] // 潜在的解密器
}

