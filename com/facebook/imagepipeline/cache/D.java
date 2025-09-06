package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class d implements a {
    public static final class com.facebook.imagepipeline.cache.d.a {
        private com.facebook.imagepipeline.cache.d.a() {
        }

        public com.facebook.imagepipeline.cache.d.a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            try {
                arr_v[c.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    public static final com.facebook.imagepipeline.cache.d.a a = null;
    @l
    private static final String b = "BitmapMemoryCacheTrimStrategy";

    static {
        d.a = new com.facebook.imagepipeline.cache.d.a(null);
    }

    @Override  // com.facebook.imagepipeline.cache.B$a
    public double a(@l c c0) {
        L.p(c0, "trimType");
        switch(c0) {
            case 1: {
                return c.b.b();
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 1.0;
            }
            default: {
                x0.a.y0("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", new Object[]{c0});
                return 0.0;
            }
        }
    }
}

