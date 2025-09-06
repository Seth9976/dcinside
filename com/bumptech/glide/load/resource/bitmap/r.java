package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.i;

public abstract class r {
    static class a extends r {
        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public g a(int v, int v1, int v2, int v3) {
            return g.b;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public float b(int v, int v1, int v2, int v3) {
            int v4 = Math.min(v1 / v3, v / v2);
            return v4 == 0 ? 1.0f : 1.0f / ((float)Integer.highestOneBit(v4));
        }
    }

    static class b extends r {
        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public g a(int v, int v1, int v2, int v3) {
            return g.a;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public float b(int v, int v1, int v2, int v3) {
            int v4 = (int)Math.ceil(Math.max(((float)v1) / ((float)v3), ((float)v) / ((float)v2)));
            int v5 = 1;
            int v6 = Math.max(1, Integer.highestOneBit(v4));
            if(v6 >= v4) {
                v5 = 0;
            }
            return 1.0f / ((float)(v6 << v5));
        }
    }

    static class c extends r {
        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public g a(int v, int v1, int v2, int v3) {
            return this.b(v, v1, v2, v3) == 1.0f ? g.b : r.c.a(v, v1, v2, v3);
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public float b(int v, int v1, int v2, int v3) {
            return Math.min(1.0f, r.c.b(v, v1, v2, v3));
        }
    }

    static class d extends r {
        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public g a(int v, int v1, int v2, int v3) {
            return g.b;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public float b(int v, int v1, int v2, int v3) {
            return Math.max(((float)v2) / ((float)v), ((float)v3) / ((float)v1));
        }
    }

    static class e extends r {
        // 去混淆评级： 低(20)
        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public g a(int v, int v1, int v2, int v3) {
            return r.i ? g.b : g.a;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public float b(int v, int v1, int v2, int v3) {
            if(r.i) {
                return Math.min(((float)v2) / ((float)v), ((float)v3) / ((float)v1));
            }
            int v4 = Math.max(v1 / v3, v / v2);
            return v4 == 0 ? 1.0f : 1.0f / ((float)Integer.highestOneBit(v4));
        }
    }

    static class f extends r {
        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public g a(int v, int v1, int v2, int v3) {
            return g.b;
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.r
        public float b(int v, int v1, int v2, int v3) {
            return 1.0f;
        }
    }

    public static enum g {
        MEMORY,
        QUALITY;

        private static g[] a() [...] // Inlined contents
    }

    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;
    public static final i h;
    static final boolean i;

    static {
        r.a = new a();
        r.b = new b();
        r.c = new e();
        r.d = new c();
        d r$d0 = new d();
        r.e = r$d0;
        r.f = new f();
        r.g = r$d0;
        r.h = i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", r$d0);
        r.i = true;
    }

    public abstract g a(int arg1, int arg2, int arg3, int arg4);

    public abstract float b(int arg1, int arg2, int arg3, int arg4);
}

