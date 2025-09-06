package com.dcinside.app.util;

import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import androidx.compose.foundation.c;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ol {
    public static final class a {
        public static final class com.dcinside.app.util.ol.a.a {
            private com.dcinside.app.util.ol.a.a() {
            }

            public com.dcinside.app.util.ol.a.a(w w0) {
            }

            @l
            public final a a(int v, int v1) {
                return new a(v, v1, null);
            }

            @l
            public final a b(@l String s) {
                L.p(s, "path");
                ol ol0 = b.c(ol.e, s, false, 2, null);
                return ol.e.a(s) % 180 == 0 ? new a(ol0.j(), ol0.g(), null) : new a(ol0.g(), ol0.j(), null);
            }
        }

        private final int a;
        private final int b;
        private int c;
        private int d;
        private int e;
        @l
        public static final com.dcinside.app.util.ol.a.a f;

        static {
            a.f = new com.dcinside.app.util.ol.a.a(null);
        }

        private a(int v, int v1) {
            this.a = v;
            this.b = v1;
            this.c = 0x7FFFFFFF;
        }

        a(int v, int v1, int v2, w w0) {
            if((v2 & 1) != 0) {
                v = 0;
            }
            if((v2 & 2) != 0) {
                v1 = 0;
            }
            this(v, v1);
        }

        public a(int v, int v1, w w0) {
            this(v, v1);
        }

        @l
        public final ol a() {
            return this.d == 0 ? ol.e.k(this.a, this.b, this.e, this.c) : ol.e.h(this.a, this.b, this.e, this.c);
        }

        @l
        public final a b(int v) {
            this.e = v;
            this.d = 1;
            return this;
        }

        @l
        public final a c(int v) {
            this.c = v;
            return this;
        }

        @l
        public final a d(int v) {
            this.e = v;
            this.d = 0;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        public final int a(@l String s) {
            L.p(s, "path");
            try {
                switch(new ExifInterface(s).l("Orientation", 1)) {
                    case 3: {
                        return 180;
                    }
                    case 6: {
                        return 90;
                    }
                    case 8: {
                        return 270;
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            return 0;
        }

        @l
        public final ol b(@l String s, boolean z) {
            L.p(s, "path");
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(s, bitmapFactory$Options0);
            return z && this.a(s) % 180 != 0 ? new ol(bitmapFactory$Options0.outHeight, bitmapFactory$Options0.outWidth, false, false, 12, null) : new ol(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight, false, false, 12, null);
        }

        public static ol c(b ol$b0, String s, boolean z, int v, Object object0) {
            if((v & 2) != 0) {
                z = false;
            }
            return ol$b0.b(s, z);
        }

        @l
        public final ol d(int v, int v1, int v2, int v3) {
            float f = this.f(v, v1, v2, v3);
            return f == 1.0f ? new ol(v, v1, false, false, 12, null) : new ol(Math.max(((int)(((float)v) * f)), 10), Math.max(((int)(((float)v1) * f)), 10), true, false, 8, null);
        }

        public static ol e(b ol$b0, int v, int v1, int v2, int v3, int v4, Object object0) {
            if((v4 & 8) != 0) {
                v3 = v2;
            }
            return ol$b0.d(v, v1, v2, v3);
        }

        private final float f(int v, int v1, int v2, int v3) {
            return Math.min((v2 < v ? ((float)v2) / ((float)v) : 1.0f), (v3 >= v1 ? 1.0f : ((float)v3) / ((float)v1)));
        }

        private final ol g(int v, int v1, int v2, int v3, boolean z) {
            float f1;
            float f = z ? this.j(v, v2, v3) : this.j(v1, v2, v3);
            if(f == 1.0f) {
                return new ol(v, v1, false, false, 12, null);
            }
            int v4 = (int)(((float)Math.rint(((float)v) * f)));
            int v5 = (int)(((float)Math.rint(((float)v1) * f)));
            if(v4 > v3) {
                f1 = this.j(v4, v3, v3);
                return f1 == 1.0f ? new ol(v4, v5, true, false, 8, null) : new ol(((int)(((float)Math.rint(((float)v4) * f1)))), ((int)(((float)Math.rint(((float)v5) * f1)))), true, true);
            }
            f1 = v5 <= v3 ? 1.0f : this.j(v5, v3, v3);
            return f1 == 1.0f ? new ol(v4, v5, true, false, 8, null) : new ol(((int)(((float)Math.rint(((float)v4) * f1)))), ((int)(((float)Math.rint(((float)v5) * f1)))), true, true);
        }

        @l
        public final ol h(int v, int v1, int v2, int v3) {
            return this.g(v, v1, v2, v3, false);
        }

        public static ol i(b ol$b0, int v, int v1, int v2, int v3, int v4, Object object0) {
            if((v4 & 8) != 0) {
                v3 = 0x7FFFFFFF;
            }
            return ol$b0.h(v, v1, v2, v3);
        }

        private final float j(int v, int v1, int v2) {
            return ((float)Math.min(v1, v2)) / ((float)v);
        }

        @l
        public final ol k(int v, int v1, int v2, int v3) {
            return this.g(v, v1, v2, v3, true);
        }

        public static ol l(b ol$b0, int v, int v1, int v2, int v3, int v4, Object object0) {
            if((v4 & 8) != 0) {
                v3 = 0x7FFFFFFF;
            }
            return ol$b0.k(v, v1, v2, v3);
        }
    }

    private final int a;
    private final int b;
    private final boolean c;
    private final boolean d;
    @l
    public static final b e;

    static {
        ol.e = new b(null);
    }

    public ol(int v, int v1, boolean z, boolean z1) {
        this.a = v;
        this.b = v1;
        this.c = z;
        this.d = z1;
    }

    public ol(int v, int v1, boolean z, boolean z1, int v2, w w0) {
        if((v2 & 4) != 0) {
            z = false;
        }
        if((v2 & 8) != 0) {
            z1 = false;
        }
        this(v, v1, z, z1);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @l
    public final ol e(int v, int v1, boolean z, boolean z1) {
        return new ol(v, v1, z, z1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ol)) {
            return false;
        }
        if(this.a != ((ol)object0).a) {
            return false;
        }
        if(this.b != ((ol)object0).b) {
            return false;
        }
        return this.c == ((ol)object0).c ? this.d == ((ol)object0).d : false;
    }

    public static ol f(ol ol0, int v, int v1, boolean z, boolean z1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = ol0.a;
        }
        if((v2 & 2) != 0) {
            v1 = ol0.b;
        }
        if((v2 & 4) != 0) {
            z = ol0.c;
        }
        if((v2 & 8) != 0) {
            z1 = ol0.d;
        }
        return ol0.e(v, v1, z, z1);
    }

    public final int g() {
        return this.b;
    }

    public final boolean h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + c.a(this.c)) * 0x1F + c.a(this.d);
    }

    public final boolean i() {
        return this.c;
    }

    public final int j() {
        return this.a;
    }

    public final int k(int v, int v1) {
        int v2 = this.a;
        int v3 = 1;
        if(v2 > v || this.b > v1) {
            int v4 = this.b / 2;
            while(v2 / 2 / v3 > v && v4 / v3 > v1) {
                v3 *= 2;
            }
        }
        return v3;
    }

    @Override
    @l
    public String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ", resized=" + this.c + ", over=" + this.d + ")";
    }
}

