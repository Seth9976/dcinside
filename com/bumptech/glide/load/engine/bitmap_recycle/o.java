package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi(19)
public class o implements l {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[Bitmap.Config.values().length];
            a.a = arr_v;
            try {
                arr_v[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Bitmap.Config.RGB_565.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    @VisibleForTesting
    static final class b implements m {
        private final c a;
        int b;
        private Bitmap.Config c;

        public b(c o$c0) {
            this.a = o$c0;
        }

        @VisibleForTesting
        b(c o$c0, int v, Bitmap.Config bitmap$Config0) {
            this(o$c0);
            this.b(v, bitmap$Config0);
        }

        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.a.c(this);
        }

        public void b(int v, Bitmap.Config bitmap$Config0) {
            this.b = v;
            this.c = bitmap$Config0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof b && this.b == ((b)object0).b && com.bumptech.glide.util.o.e(this.c, ((b)object0).c);
        }

        @Override
        public int hashCode() {
            int v = this.b * 0x1F;
            return this.c == null ? v : v + this.c.hashCode();
        }

        @Override
        public String toString() {
            return "[" + this.b + "](" + this.c + ")";
        }
    }

    @VisibleForTesting
    static class c extends d {
        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.d
        protected m a() {
            return this.d();
        }

        protected b d() {
            return new b(this);
        }

        public b e(int v, Bitmap.Config bitmap$Config0) {
            b o$b0 = (b)this.b();
            o$b0.b(v, bitmap$Config0);
            return o$b0;
        }
    }

    private final c a;
    private final h b;
    private final Map c;
    private static final int d = 8;
    private static final Bitmap.Config[] e;
    private static final Bitmap.Config[] f;
    private static final Bitmap.Config[] g;
    private static final Bitmap.Config[] h;
    private static final Bitmap.Config[] i;

    static {
        Bitmap.Config[] arr_bitmap$Config = {Bitmap.Config.ARGB_8888, null};
        if(Build.VERSION.SDK_INT >= 26) {
            arr_bitmap$Config = (Bitmap.Config[])Arrays.copyOf(arr_bitmap$Config, 3);
            arr_bitmap$Config[arr_bitmap$Config.length - 1] = Bitmap.Config.RGBA_F16;
        }
        o.e = arr_bitmap$Config;
        o.f = arr_bitmap$Config;
        o.g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        o.h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        o.i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public o() {
        this.a = new c();
        this.b = new h();
        this.c = new HashMap();
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int v, int v1, Bitmap.Config bitmap$Config0) {
        return o.h(com.bumptech.glide.util.o.h(v, v1, bitmap$Config0), bitmap$Config0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap0) {
        return com.bumptech.glide.util.o.i(bitmap0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap0) {
        return o.h(com.bumptech.glide.util.o.i(bitmap0), bitmap0.getConfig());
    }

    private void d(Integer integer0, Bitmap bitmap0) {
        NavigableMap navigableMap0 = this.j(bitmap0.getConfig());
        Integer integer1 = (Integer)navigableMap0.get(integer0);
        if(integer1 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + integer0 + ", removed: " + this.c(bitmap0) + ", this: " + this);
        }
        if(((int)integer1) == 1) {
            navigableMap0.remove(integer0);
            return;
        }
        navigableMap0.put(integer0, ((int)(((int)integer1) - 1)));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap0) {
        int v = com.bumptech.glide.util.o.i(bitmap0);
        Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
        b o$b0 = this.a.e(v, bitmap$Config0);
        this.b.d(o$b0, bitmap0);
        NavigableMap navigableMap0 = this.j(bitmap0.getConfig());
        Integer integer0 = (Integer)navigableMap0.get(o$b0.b);
        navigableMap0.put(o$b0.b, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    @Nullable
    public Bitmap f(int v, int v1, Bitmap.Config bitmap$Config0) {
        b o$b0 = this.g(com.bumptech.glide.util.o.h(v, v1, bitmap$Config0), bitmap$Config0);
        Bitmap bitmap0 = (Bitmap)this.b.a(o$b0);
        if(bitmap0 != null) {
            this.d(o$b0.b, bitmap0);
            bitmap0.reconfigure(v, v1, bitmap$Config0);
        }
        return bitmap0;
    }

    private b g(int v, Bitmap.Config bitmap$Config0) {
        b o$b0 = this.a.e(v, bitmap$Config0);
        Bitmap.Config[] arr_bitmap$Config = o.i(bitmap$Config0);
        for(int v1 = 0; v1 < arr_bitmap$Config.length; ++v1) {
            Bitmap.Config bitmap$Config1 = arr_bitmap$Config[v1];
            Integer integer0 = (Integer)this.j(bitmap$Config1).ceilingKey(v);
            if(integer0 != null && ((int)integer0) <= v * 8) {
                if(((int)integer0) == v) {
                    if(bitmap$Config1 != null) {
                        if(!bitmap$Config1.equals(bitmap$Config0)) {
                            this.a.c(o$b0);
                            return this.a.e(((int)integer0), bitmap$Config1);
                        }
                        break;
                    }
                    else if(bitmap$Config0 == null) {
                        break;
                    }
                }
                this.a.c(o$b0);
                return this.a.e(((int)integer0), bitmap$Config1);
            }
        }
        return o$b0;
    }

    static String h(int v, Bitmap.Config bitmap$Config0) [...] // Inlined contents

    private static Bitmap.Config[] i(Bitmap.Config bitmap$Config0) {
        if(Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap$Config0)) {
            return o.f;
        }
        switch(a.a[bitmap$Config0.ordinal()]) {
            case 1: {
                return o.e;
            }
            case 2: {
                return o.g;
            }
            case 3: {
                return o.h;
            }
            case 4: {
                return o.i;
            }
            default: {
                return new Bitmap.Config[]{bitmap$Config0};
            }
        }
    }

    private NavigableMap j(Bitmap.Config bitmap$Config0) {
        NavigableMap navigableMap0 = (NavigableMap)this.c.get(bitmap$Config0);
        if(navigableMap0 == null) {
            navigableMap0 = new TreeMap();
            this.c.put(bitmap$Config0, navigableMap0);
        }
        return navigableMap0;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmap0 = (Bitmap)this.b.f();
        if(bitmap0 != null) {
            this.d(com.bumptech.glide.util.o.i(bitmap0), bitmap0);
        }
        return bitmap0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("SizeConfigStrategy{groupedMap=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", sortedSizes=(");
        for(Object object0: this.c.entrySet()) {
            stringBuilder0.append(((Map.Entry)object0).getKey());
            stringBuilder0.append('[');
            stringBuilder0.append(((Map.Entry)object0).getValue());
            stringBuilder0.append("], ");
        }
        if(!this.c.isEmpty()) {
            stringBuilder0.replace(stringBuilder0.length() - 2, stringBuilder0.length(), "");
        }
        stringBuilder0.append(")}");
        return stringBuilder0.toString();
    }
}

