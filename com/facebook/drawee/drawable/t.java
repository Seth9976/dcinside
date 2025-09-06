package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.widget.ImageView.ScaleType;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class t {
    static class com.facebook.drawee.drawable.t.a {
        static final int[] a;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            com.facebook.drawee.drawable.t.a.a = arr_v;
            try {
                arr_v[ImageView.ScaleType.CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.drawable.t.a.a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.drawable.t.a.a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.drawable.t.a.a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.drawable.t.a.a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.drawable.t.a.a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.drawable.t.a.a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.facebook.drawee.drawable.t.a.a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static abstract class b implements d {
        @Override  // com.facebook.drawee.drawable.t$d
        public Matrix a(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1) {
            this.b(matrix0, rect0, v, v1, f, f1, ((float)rect0.width()) / ((float)v), ((float)rect0.height()) / ((float)v1));
            return matrix0;
        }

        public abstract void b(Matrix arg1, Rect arg2, int arg3, int arg4, float arg5, float arg6, float arg7, float arg8);
    }

    public static class c implements d, p {
        private final d l;
        private final d m;
        @h
        private final Rect n;
        @h
        private final Rect o;
        @h
        private final PointF p;
        @h
        private final PointF q;
        private final float[] r;
        private final float[] s;
        private final float[] t;
        private float u;

        public c(d t$d0, d t$d1) {
            this(t$d0, t$d1, null, null);
        }

        public c(d t$d0, d t$d1, @h Rect rect0, @h Rect rect1) {
            this(t$d0, t$d1, rect0, rect1, null, null);
        }

        public c(d t$d0, d t$d1, @h Rect rect0, @h Rect rect1, @h PointF pointF0, @h PointF pointF1) {
            this.r = new float[9];
            this.s = new float[9];
            this.t = new float[9];
            this.l = t$d0;
            this.m = t$d1;
            this.n = rect0;
            this.o = rect1;
            this.p = pointF0;
            this.q = pointF1;
        }

        @Override  // com.facebook.drawee.drawable.t$d
        public Matrix a(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1) {
            this.l.a(matrix0, (this.n == null ? rect0 : this.n), v, v1, (this.p == null ? f : this.p.x), (this.p == null ? f1 : this.p.y));
            matrix0.getValues(this.r);
            this.m.a(matrix0, (this.o == null ? rect0 : this.o), v, v1, (this.q == null ? f : this.q.x), (this.q == null ? f1 : this.q.y));
            matrix0.getValues(this.s);
            for(int v2 = 0; v2 < 9; ++v2) {
                this.t[v2] = this.r[v2] * (1.0f - this.u) + this.s[v2] * this.u;
            }
            matrix0.setValues(this.t);
            return matrix0;
        }

        @h
        public Rect b() {
            return this.n;
        }

        @h
        public Rect c() {
            return this.o;
        }

        @h
        public PointF d() {
            return this.p;
        }

        @h
        public PointF e() {
            return this.q;
        }

        public d f() {
            return this.l;
        }

        public d g() {
            return this.m;
        }

        @Override  // com.facebook.drawee.drawable.t$p
        public Object getState() {
            return this.u;
        }

        public float h() {
            return this.u;
        }

        public void i(float f) {
            this.u = f;
        }

        @Override
        public String toString() {
            return String.format("InterpolatingScaleType(%s (%s) -> %s (%s))", String.valueOf(this.l), String.valueOf(this.p), String.valueOf(this.m), String.valueOf(this.q));
        }
    }

    public interface d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        public static final d g;
        public static final d h;
        public static final d i;
        public static final d j;
        public static final d k;

        static {
            d.a = m.l;
            d.b = l.l;
            d.c = com.facebook.drawee.drawable.t.n.l;
            d.d = k.l;
            d.e = i.l;
            d.f = j.l;
            d.g = e.l;
            d.h = g.l;
            d.i = f.l;
            d.j = o.l;
            d.k = com.facebook.drawee.drawable.t.h.l;
        }

        Matrix a(Matrix arg1, Rect arg2, int arg3, int arg4, float arg5, float arg6);
    }

    static class e extends b {
        public static final d l;

        static {
            e.l = new e();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            matrix0.setTranslate(((float)(((int)(((float)rect0.left) + ((float)(rect0.width() - v)) * 0.5f + 0.5f)))), ((float)(((int)(((float)rect0.top) + ((float)(rect0.height() - v1)) * 0.5f + 0.5f)))));
        }

        @Override
        public String toString() {
            return "center";
        }
    }

    static class f extends b {
        public static final d l;

        static {
            f.l = new f();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f5;
            float f4;
            if(f3 > f2) {
                f4 = ((float)rect0.left) + (((float)rect0.width()) - ((float)v) * f3) * 0.5f;
                f5 = (float)rect0.top;
                f2 = f3;
            }
            else {
                float f6 = (float)rect0.left;
                float f7 = (float)rect0.top;
                f5 = (((float)rect0.height()) - ((float)v1) * f2) * 0.5f + f7;
                f4 = f6;
            }
            matrix0.setScale(f2, f2);
            matrix0.postTranslate(((float)(((int)(f4 + 0.5f)))), ((float)(((int)(f5 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "center_crop";
        }
    }

    static class g extends b {
        public static final d l;

        static {
            g.l = new g();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f4 = Math.min(Math.min(f2, f3), 1.0f);
            float f5 = ((float)rect0.left) + (((float)rect0.width()) - ((float)v) * f4) * 0.5f;
            float f6 = ((float)rect0.top) + (((float)rect0.height()) - ((float)v1) * f4) * 0.5f;
            matrix0.setScale(f4, f4);
            matrix0.postTranslate(((float)(((int)(f5 + 0.5f)))), ((float)(((int)(f6 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "center_inside";
        }
    }

    static class com.facebook.drawee.drawable.t.h extends b {
        public static final d l;

        static {
            com.facebook.drawee.drawable.t.h.l = new com.facebook.drawee.drawable.t.h();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f4 = Math.min(f2, f3);
            float f5 = (float)rect0.left;
            float f6 = ((float)rect0.top) + (((float)rect0.height()) - ((float)v1) * f4);
            matrix0.setScale(f4, f4);
            matrix0.postTranslate(((float)(((int)(f5 + 0.5f)))), ((float)(((int)(f6 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "fit_bottom_start";
        }
    }

    static class i extends b {
        public static final d l;

        static {
            i.l = new i();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f4 = Math.min(f2, f3);
            float f5 = ((float)rect0.left) + (((float)rect0.width()) - ((float)v) * f4) * 0.5f;
            float f6 = ((float)rect0.top) + (((float)rect0.height()) - ((float)v1) * f4) * 0.5f;
            matrix0.setScale(f4, f4);
            matrix0.postTranslate(((float)(((int)(f5 + 0.5f)))), ((float)(((int)(f6 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "fit_center";
        }
    }

    static class j extends b {
        public static final d l;

        static {
            j.l = new j();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f4 = Math.min(f2, f3);
            float f5 = ((float)rect0.left) + (((float)rect0.width()) - ((float)v) * f4);
            float f6 = ((float)rect0.top) + (((float)rect0.height()) - ((float)v1) * f4);
            matrix0.setScale(f4, f4);
            matrix0.postTranslate(((float)(((int)(f5 + 0.5f)))), ((float)(((int)(f6 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "fit_end";
        }
    }

    static class k extends b {
        public static final d l;

        static {
            k.l = new k();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f4 = Math.min(f2, f3);
            float f5 = (float)rect0.left;
            float f6 = (float)rect0.top;
            matrix0.setScale(f4, f4);
            matrix0.postTranslate(((float)(((int)(f5 + 0.5f)))), ((float)(((int)(f6 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "fit_start";
        }
    }

    static class l extends b {
        public static final d l;

        static {
            l.l = new l();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f4 = (float)rect0.left;
            float f5 = ((float)rect0.top) + (((float)rect0.height()) - ((float)v1) * f2) * 0.5f;
            matrix0.setScale(f2, f2);
            matrix0.postTranslate(((float)(((int)(f4 + 0.5f)))), ((float)(((int)(f5 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "fit_x";
        }
    }

    static class m extends b {
        public static final d l;

        static {
            m.l = new m();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f4 = (float)rect0.left;
            float f5 = (float)rect0.top;
            matrix0.setScale(f2, f3);
            matrix0.postTranslate(((float)(((int)(f4 + 0.5f)))), ((float)(((int)(f5 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "fit_xy";
        }
    }

    static class com.facebook.drawee.drawable.t.n extends b {
        public static final d l;

        static {
            com.facebook.drawee.drawable.t.n.l = new com.facebook.drawee.drawable.t.n();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f4 = ((float)rect0.left) + (((float)rect0.width()) - ((float)v) * f3) * 0.5f;
            float f5 = (float)rect0.top;
            matrix0.setScale(f3, f3);
            matrix0.postTranslate(((float)(((int)(f4 + 0.5f)))), ((float)(((int)(f5 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "fit_y";
        }
    }

    static class o extends b {
        public static final d l;

        static {
            o.l = new o();
        }

        @Override  // com.facebook.drawee.drawable.t$b
        public void b(Matrix matrix0, Rect rect0, int v, int v1, float f, float f1, float f2, float f3) {
            float f7;
            float f6;
            if(f3 > f2) {
                float f4 = ((float)v) * f3;
                float f5 = ((float)rect0.width()) * 0.5f - f * f4;
                f6 = ((float)rect0.left) + Math.max(Math.min(f5, 0.0f), ((float)rect0.width()) - f4);
                f7 = (float)rect0.top;
                f2 = f3;
            }
            else {
                f6 = (float)rect0.left;
                float f8 = ((float)v1) * f2;
                float f9 = ((float)rect0.height()) * 0.5f - f1 * f8;
                float f10 = (float)rect0.top;
                f7 = Math.max(Math.min(f9, 0.0f), ((float)rect0.height()) - f8) + f10;
            }
            matrix0.setScale(f2, f2);
            matrix0.postTranslate(((float)(((int)(f6 + 0.5f)))), ((float)(((int)(f7 + 0.5f)))));
        }

        @Override
        public String toString() {
            return "focus_crop";
        }
    }

    public interface p {
        Object getState();
    }

    @h
    public static d a(ImageView.ScaleType imageView$ScaleType0) {
        switch(com.facebook.drawee.drawable.t.a.a[imageView$ScaleType0.ordinal()]) {
            case 1: {
                return d.g;
            }
            case 2: {
                return d.i;
            }
            case 3: {
                return d.h;
            }
            case 4: {
                return d.e;
            }
            case 5: {
                return d.d;
            }
            case 6: {
                return d.f;
            }
            case 7: {
                return d.a;
            }
            default: {
                return null;
            }
        }
    }
}

