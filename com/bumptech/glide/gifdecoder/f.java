package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class f implements a {
    private static final String A = "f";
    private static final int B = 0x1000;
    private static final int C = -1;
    private static final int D = -1;
    private static final int E = 4;
    private static final int F = 0xFF;
    @ColorInt
    private static final int G;
    @ColorInt
    private int[] f;
    @ColorInt
    private final int[] g;
    private final com.bumptech.glide.gifdecoder.a.a h;
    private ByteBuffer i;
    private byte[] j;
    private d k;
    private short[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    @ColorInt
    private int[] p;
    private int q;
    private c r;
    private Bitmap s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    @Nullable
    private Boolean y;
    @NonNull
    private Bitmap.Config z;

    static {
    }

    public f(@NonNull com.bumptech.glide.gifdecoder.a.a a$a0) {
        this.g = new int[0x100];
        this.z = Bitmap.Config.ARGB_8888;
        this.h = a$a0;
        this.r = new c();
    }

    public f(@NonNull com.bumptech.glide.gifdecoder.a.a a$a0, c c0, ByteBuffer byteBuffer0) {
        this(a$a0, c0, byteBuffer0, 1);
    }

    public f(@NonNull com.bumptech.glide.gifdecoder.a.a a$a0, c c0, ByteBuffer byteBuffer0, int v) {
        this(a$a0);
        this.o(c0, byteBuffer0, v);
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    @Deprecated
    public int a() {
        int v = this.r.m;
        return v == -1 ? 1 : v;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int b() {
        return this.r.c;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int c(@Nullable InputStream inputStream0, int v) {
        if(inputStream0 == null) {
            this.u = 2;
        }
        else {
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((v <= 0 ? 0x4000 : v + 0x1000));
                byte[] arr_b = new byte[0x4000];
                int v1;
                while((v1 = inputStream0.read(arr_b, 0, 0x4000)) != -1) {
                    byteArrayOutputStream0.write(arr_b, 0, v1);
                }
                byteArrayOutputStream0.flush();
                this.read(byteArrayOutputStream0.toByteArray());
                goto label_14;
            }
            catch(IOException iOException0) {
            }
            Log.w("f", "Error reading data from stream", iOException0);
        }
    label_14:
        if(inputStream0 != null) {
            try {
                inputStream0.close();
                return this.u;
            }
            catch(IOException iOException1) {
                Log.w("f", "Error closing stream", iOException1);
            }
        }
        return this.u;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.r = null;
        byte[] arr_b = this.o;
        if(arr_b != null) {
            this.h.e(arr_b);
        }
        int[] arr_v = this.p;
        if(arr_v != null) {
            this.h.f(arr_v);
        }
        Bitmap bitmap0 = this.s;
        if(bitmap0 != null) {
            this.h.c(bitmap0);
        }
        this.s = null;
        this.i = null;
        this.y = null;
        byte[] arr_b1 = this.j;
        if(arr_b1 != null) {
            this.h.e(arr_b1);
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void d(@NonNull Bitmap.Config bitmap$Config0) {
        Bitmap.Config bitmap$Config1 = Bitmap.Config.ARGB_8888;
        if(bitmap$Config0 != bitmap$Config1) {
            Bitmap.Config bitmap$Config2 = Bitmap.Config.RGB_565;
            if(bitmap$Config0 != bitmap$Config2) {
                throw new IllegalArgumentException("Unsupported format: " + bitmap$Config0 + ", must be one of " + bitmap$Config1 + " or " + bitmap$Config2);
            }
        }
        this.z = bitmap$Config0;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void e(@NonNull c c0, @NonNull byte[] arr_b) {
        synchronized(this) {
            this.n(c0, ByteBuffer.wrap(arr_b));
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void f() {
        this.q = -1;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int g() {
        return this.q;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    @NonNull
    public ByteBuffer getData() {
        return this.i;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int getHeight() {
        return this.r.g;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int getStatus() {
        return this.u;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int getWidth() {
        return this.r.f;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int h() {
        return this.i.limit() + this.o.length + this.p.length * 4;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    @Nullable
    public Bitmap i() {
        synchronized(this) {
            if(this.r.c <= 0 || this.q < 0) {
                if(Log.isLoggable("f", 3)) {
                    Log.d("f", "Unable to decode frame, frameCount=" + this.r.c + ", framePointer=" + this.q);
                }
                this.u = 1;
            }
            if(this.u != 1 && this.u != 2) {
                this.u = 0;
                if(this.j == null) {
                    this.j = this.h.a(0xFF);
                }
                b b0 = (b)this.r.e.get(this.q);
                int v1 = this.q - 1;
                b b1 = v1 < 0 ? null : ((b)this.r.e.get(v1));
                int[] arr_v = b0.k == null ? this.r.a : b0.k;
                this.f = arr_v;
                if(arr_v == null) {
                    if(Log.isLoggable("f", 3)) {
                        Log.d("f", "No valid color table found for frame #" + this.q);
                    }
                    this.u = 1;
                    return null;
                }
                if(b0.f) {
                    System.arraycopy(arr_v, 0, this.g, 0, arr_v.length);
                    this.f = this.g;
                    this.g[b0.h] = 0;
                    if(b0.g == 2 && this.q == 0) {
                        this.y = Boolean.TRUE;
                    }
                }
                return this.y(b0, b1);
            }
            if(Log.isLoggable("f", 3)) {
                Log.d("f", "Unable to decode frame, status=" + this.u);
            }
            return null;
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void j() {
        this.q = (this.q + 1) % this.r.c;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int k(int v) {
        if(v >= 0) {
            return v >= this.r.c ? -1 : ((b)this.r.e.get(v)).i;
        }
        return -1;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int l() {
        int v = this.r.m;
        if(v == -1) {
            return 1;
        }
        return v == 0 ? 0 : v + 1;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int m() {
        if(this.r.c > 0) {
            return this.q < 0 ? 0 : this.k(this.q);
        }
        return 0;
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void n(@NonNull c c0, @NonNull ByteBuffer byteBuffer0) {
        synchronized(this) {
            this.o(c0, byteBuffer0, 1);
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public void o(@NonNull c c0, @NonNull ByteBuffer byteBuffer0, int v) {
        synchronized(this) {
            if(v > 0) {
                int v2 = Integer.highestOneBit(v);
                this.u = 0;
                this.r = c0;
                this.q = -1;
                ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
                this.i = byteBuffer1;
                byteBuffer1.position(0);
                this.i.order(ByteOrder.LITTLE_ENDIAN);
                this.t = false;
                for(Object object0: c0.e) {
                    if(((b)object0).g == 3) {
                        this.t = true;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                this.v = v2;
                int v3 = c0.f;
                this.x = v3 / v2;
                int v4 = c0.g;
                this.w = v4 / v2;
                this.o = this.h.a(v3 * v4);
                this.p = this.h.d(this.x * this.w);
                return;
            }
        }
        throw new IllegalArgumentException("Sample size must be >=0, not: " + v);
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int p() {
        return this.r.m;
    }

    @ColorInt
    private int q(int v, int v1, int v2) {
        int v3 = v;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        while(v3 < this.v + v) {
            byte[] arr_b = this.o;
            if(v3 >= arr_b.length || v3 >= v1) {
                break;
            }
            int v9 = this.f[arr_b[v3] & 0xFF];
            if(v9 != 0) {
                v4 += v9 >> 24 & 0xFF;
                v5 += v9 >> 16 & 0xFF;
                v6 += v9 >> 8 & 0xFF;
                v7 += v9 & 0xFF;
                ++v8;
            }
            ++v3;
        }
        int v10 = v + v2;
        for(int v11 = v10; v11 < this.v + v10; ++v11) {
            byte[] arr_b1 = this.o;
            if(v11 >= arr_b1.length || v11 >= v1) {
                break;
            }
            int v12 = this.f[arr_b1[v11] & 0xFF];
            if(v12 != 0) {
                v4 += v12 >> 24 & 0xFF;
                v5 += v12 >> 16 & 0xFF;
                v6 += v12 >> 8 & 0xFF;
                v7 += v12 & 0xFF;
                ++v8;
            }
        }
        return v8 == 0 ? 0 : v4 / v8 << 24 | v5 / v8 << 16 | v6 / v8 << 8 | v7 / v8;
    }

    private void r(b b0) {
        int v17;
        int v11;
        int[] arr_v = this.p;
        int v = this.v;
        int v1 = b0.d / v;
        int v2 = b0.b / v;
        int v3 = b0.c / v;
        int v4 = b0.a / v;
        boolean z = this.q == 0;
        int v5 = this.x;
        int v6 = this.w;
        byte[] arr_b = this.o;
        int[] arr_v1 = this.f;
        Boolean boolean0 = this.y;
        int v7 = 8;
        int v9 = 0;
        int v10 = 1;
        for(int v8 = 0; v9 < v1; v8 = v17) {
            Boolean boolean1 = boolean0;
            if(b0.e) {
                if(v8 >= v1) {
                    switch(v10 + 1) {
                        case 2: {
                            v10 = 2;
                            v8 = 4;
                            break;
                        }
                        case 3: {
                            v10 = 3;
                            v8 = 2;
                            v7 = 4;
                            break;
                        }
                        case 4: {
                            v10 = 4;
                            v8 = 1;
                            v7 = 2;
                            break;
                        }
                        default: {
                            ++v10;
                        }
                    }
                }
                v11 = v8 + v7;
            }
            else {
                v11 = v8;
                v8 = v9;
            }
            int v12 = v8 + v2;
            if(v12 < v6) {
                int v13 = v12 * v5;
                int v14 = v13 + v4;
                int v15 = v14 + v3;
                int v16 = v13 + v5;
                if(v16 < v15) {
                    v15 = v16;
                }
                v17 = v11;
                int v18 = v9 * v * b0.c;
                if(v == 1) {
                    for(int v19 = v14; v19 < v15; ++v19) {
                        int v20 = arr_v1[arr_b[v18] & 0xFF];
                        if(v20 != 0) {
                            arr_v[v19] = v20;
                        }
                        else if(z && boolean1 == null) {
                            boolean1 = Boolean.TRUE;
                        }
                        ++v18;
                    }
                }
                else {
                    int v21 = (v15 - v14) * v + v18;
                    for(int v22 = v14; v22 < v15; ++v22) {
                        int v23 = this.q(v18, v21, b0.c);
                        if(v23 != 0) {
                            arr_v[v22] = v23;
                        }
                        else if(z && boolean1 == null) {
                            boolean1 = Boolean.TRUE;
                        }
                        v18 += v;
                    }
                }
            }
            else {
                v17 = v11;
            }
            boolean0 = boolean1;
            ++v9;
        }
        if(this.y == null) {
            this.y = Boolean.valueOf((boolean0 == null ? false : boolean0.booleanValue()));
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.a
    public int read(@Nullable byte[] arr_b) {
        synchronized(this) {
            c c0 = this.u().r(arr_b).d();
            this.r = c0;
            if(arr_b != null) {
                this.e(c0, arr_b);
            }
            return this.u;
        }
    }

    private void s(b b0) {
        int[] arr_v = this.p;
        int v = b0.d;
        int v1 = b0.b;
        int v2 = b0.c;
        int v3 = b0.a;
        boolean z = this.q == 0;
        int v4 = this.x;
        byte[] arr_b = this.o;
        int[] arr_v1 = this.f;
        int v6 = -1;
        for(int v5 = 0; v5 < v; ++v5) {
            int v7 = (v5 + v1) * v4;
            int v8 = v7 + v3;
            int v9 = v8 + v2;
            int v10 = v7 + v4;
            if(v10 < v9) {
                v9 = v10;
            }
            int v11 = b0.c * v5;
            for(int v12 = v8; v12 < v9; ++v12) {
                int v13 = arr_b[v11];
                int v14 = v13 & 0xFF;
                if(v14 != v6) {
                    int v15 = arr_v1[v14];
                    if(v15 == 0) {
                        v6 = v13;
                    }
                    else {
                        arr_v[v12] = v15;
                    }
                }
                ++v11;
            }
        }
        this.y = Boolean.valueOf(this.y != null && this.y.booleanValue() || this.y == null && z && v6 != -1);
    }

    private void t(b b0) {
        int v25;
        int v1;
        int v;
        if(b0 != null) {
            this.i.position(b0.j);
        }
        if(b0 == null) {
            v = this.r.f;
            v1 = this.r.g;
        }
        else {
            v = b0.c;
            v1 = b0.d;
        }
        int v2 = v * v1;
        if(this.o == null || this.o.length < v2) {
            this.o = this.h.a(v2);
        }
        byte[] arr_b = this.o;
        if(this.l == null) {
            this.l = new short[0x1000];
        }
        short[] arr_v = this.l;
        if(this.m == null) {
            this.m = new byte[0x1000];
        }
        byte[] arr_b1 = this.m;
        if(this.n == null) {
            this.n = new byte[0x1001];
        }
        byte[] arr_b2 = this.n;
        int v3 = this.x();
        int v4 = (1 << v3) + 2;
        int v5 = (1 << v3 + 1) - 1;
        int v6 = 0;
        for(int v7 = 0; v7 < 1 << v3; ++v7) {
            arr_v[v7] = 0;
            arr_b1[v7] = (byte)v7;
        }
        byte[] arr_b3 = this.j;
        int v8 = v3 + 1;
        int v9 = v4;
        int v10 = v5;
        int v11 = 0;
        int v12 = 0;
        int v13 = 0;
        int v14 = 0;
        int v15 = 0;
        int v16 = -1;
        int v17 = 0;
        int v18 = 0;
    label_43:
        while(v6 < v2) {
            if(v11 == 0) {
                v11 = this.w();
                if(v11 <= 0) {
                    this.u = 3;
                    break;
                }
                v12 = 0;
            }
            v14 += (arr_b3[v12] & 0xFF) << v13;
            ++v12;
            --v11;
            int v19 = v13 + 8;
            int v20 = v9;
            int v21 = v16;
            int v22 = v8;
            int v23 = v18;
            while(v19 >= v22) {
                int v24 = v14 & v10;
                v14 >>= v22;
                v19 -= v22;
                if(v24 == 1 << v3) {
                    v10 = v5;
                    v22 = v3 + 1;
                    v20 = v4;
                    v4 = v20;
                    v21 = -1;
                }
                else {
                    if(v24 == (1 << v3) + 1) {
                        v13 = v19;
                        v18 = v23;
                        v9 = v20;
                        v16 = v21;
                        v8 = v22;
                        continue label_43;
                    }
                    if(v21 == -1) {
                        arr_b[v15] = arr_b1[v24];
                        ++v15;
                        ++v6;
                        v21 = v24;
                        v23 = v21;
                    }
                    else {
                        if(v24 >= v20) {
                            arr_b2[v17] = (byte)v23;
                            ++v17;
                            v25 = v21;
                        }
                        else {
                            v25 = v24;
                        }
                        while(v25 >= 1 << v3) {
                            arr_b2[v17] = arr_b1[v25];
                            ++v17;
                            v25 = arr_v[v25];
                        }
                        v23 = arr_b1[v25] & 0xFF;
                        byte b1 = (byte)v23;
                        arr_b[v15] = b1;
                        while(true) {
                            ++v15;
                            ++v6;
                            if(v17 <= 0) {
                                break;
                            }
                            --v17;
                            arr_b[v15] = arr_b2[v17];
                        }
                        if(v20 < 0x1000) {
                            arr_v[v20] = (short)v21;
                            arr_b1[v20] = b1;
                            ++v20;
                            if((v20 & v10) == 0 && v20 < 0x1000) {
                                ++v22;
                                v10 += v20;
                            }
                        }
                        v21 = v24;
                    }
                }
            }
            v9 = v20;
            v8 = v22;
            v13 = v19;
            v18 = v23;
            v16 = v21;
        }
        Arrays.fill(arr_b, v15, v2, 0);
    }

    @NonNull
    private d u() {
        if(this.k == null) {
            this.k = new d();
        }
        return this.k;
    }

    private Bitmap v() {
        Bitmap bitmap0 = this.h.b(this.x, this.w, (this.y == null || this.y.booleanValue() ? Bitmap.Config.ARGB_8888 : this.z));
        bitmap0.setHasAlpha(true);
        return bitmap0;
    }

    private int w() {
        int v = this.x();
        if(v <= 0) {
            return v;
        }
        this.i.get(this.j, 0, Math.min(v, this.i.remaining()));
        return v;
    }

    private int x() {
        return this.i.get() & 0xFF;
    }

    private Bitmap y(b b0, b b1) {
        int[] arr_v = this.p;
        int v = 0;
        if(b1 == null) {
            Bitmap bitmap0 = this.s;
            if(bitmap0 != null) {
                this.h.c(bitmap0);
            }
            this.s = null;
            Arrays.fill(arr_v, 0);
        }
        if(b1 != null && b1.g == 3 && this.s == null) {
            Arrays.fill(arr_v, 0);
        }
        if(b1 != null) {
            int v1 = b1.g;
            if(v1 > 0) {
                switch(v1) {
                    case 2: {
                        if(!b0.f) {
                            int v2 = this.r.l;
                            if(b0.k == null || this.r.j != b0.h) {
                                v = v2;
                            }
                        }
                        int v3 = this.v;
                        int v4 = b1.d / v3;
                        int v5 = b1.b / v3;
                        int v6 = b1.c / v3;
                        int v7 = this.x;
                        int v8 = v5 * v7 + b1.a / v3;
                        int v9 = v4 * v7 + v8;
                        while(v8 < v9) {
                            int v10 = v8 + v6;
                            for(int v11 = v8; v11 < v10; ++v11) {
                                arr_v[v11] = v;
                            }
                            v8 += this.x;
                        }
                        break;
                    }
                    case 3: {
                        Bitmap bitmap1 = this.s;
                        if(bitmap1 != null) {
                            bitmap1.getPixels(arr_v, 0, this.x, 0, 0, this.x, this.w);
                        }
                    }
                }
            }
        }
        this.t(b0);
        if(b0.e || this.v != 1) {
            this.r(b0);
        }
        else {
            this.s(b0);
        }
        if(this.t && (b0.g == 0 || b0.g == 1)) {
            if(this.s == null) {
                this.s = this.v();
            }
            this.s.setPixels(arr_v, 0, this.x, 0, 0, this.x, this.w);
        }
        Bitmap bitmap2 = this.v();
        bitmap2.setPixels(arr_v, 0, this.x, 0, 0, this.x, this.w);
        return bitmap2;
    }
}

