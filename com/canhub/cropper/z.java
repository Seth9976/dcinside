package com.canhub.cropper;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.J;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class z {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final float a(float f, float f1, float f2, float f3) [...] // Inlined contents
    }

    public static enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER;

        private static final b[] j;
        private static final kotlin.enums.a k;

        static {
            b.j = arr_z$b;
            L.p(arr_z$b, "entries");
            b.k = new d(arr_z$b);
        }

        private static final b[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return b.k;
        }
    }

    public final class c {
        public static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.g.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.h.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.i.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            c.a = arr_v;
        }
    }

    @l
    private final b a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    @l
    private final PointF f;
    @l
    public static final a g;

    static {
        z.g = new a(null);
    }

    public z(@l b z$b0, @l y y0, float f, float f1) {
        L.p(z$b0, "type");
        L.p(y0, "cropWindowHandler");
        super();
        this.a = z$b0;
        this.b = y0.f();
        this.c = y0.e();
        this.d = y0.d();
        this.e = y0.c();
        this.f = new PointF(0.0f, 0.0f);
        this.k(y0.i(), f, f1);
    }

    private final void a(RectF rectF0, float f, RectF rectF1, int v, float f1, float f2, boolean z, boolean z1) {
        if(f > ((float)v)) {
            f = (f - ((float)v)) / 1.05f + ((float)v);
            this.f.y -= (f - ((float)v)) / 1.1f;
        }
        float f3 = rectF1.bottom;
        if(f > f3) {
            this.f.y -= (f - f3) / 2.0f;
        }
        if(f3 - f < f1) {
            f = f3;
        }
        float f4 = rectF0.top;
        float f5 = this.c;
        if(f - f4 < f5) {
            f = f4 + f5;
        }
        float f6 = this.e;
        if(f - f4 > f6) {
            f = f4 + f6;
        }
        if(f3 - f < f1) {
            f = f3;
        }
        if(f2 > 0.0f) {
            float f7 = (f - f4) * f2;
            float f8 = this.b;
            if(f7 < f8) {
                f = Math.min(f3, f4 + f8 / f2);
                f7 = (f - rectF0.top) * f2;
            }
            float f9 = this.d;
            if(f7 > f9) {
                f = Math.min(rectF1.bottom, rectF0.top + f9 / f2);
                f7 = (f - rectF0.top) * f2;
            }
            if(!z || !z1) {
                if(z) {
                    float f10 = rectF0.right;
                    float f11 = rectF1.left;
                    if(f10 - f7 < f11) {
                        f = Math.min(rectF1.bottom, rectF0.top + (f10 - f11) / f2);
                        f7 = (f - rectF0.top) * f2;
                    }
                }
                if(z1) {
                    float f12 = rectF0.left;
                    float f13 = rectF1.right;
                    if(f7 + f12 > f13) {
                        f = Math.min(f, Math.min(rectF1.bottom, rectF0.top + (f13 - f12) / f2));
                    }
                }
            }
            else {
                f = Math.min(f, Math.min(rectF1.bottom, rectF0.top + rectF1.width() / f2));
            }
        }
        rectF0.bottom = f;
    }

    private final void b(RectF rectF0, float f) {
        rectF0.bottom = rectF0.top + rectF0.width() / f;
    }

    private final void c(RectF rectF0, float f, RectF rectF1, float f1, float f2, boolean z, boolean z1) {
        if(f < 0.0f) {
            f /= 1.05f;
            this.f.x -= f / 1.1f;
        }
        float f3 = rectF1.left;
        if(f < f3) {
            this.f.x -= (f - f3) / 2.0f;
        }
        if(f - f3 < f1) {
            f = f3;
        }
        float f4 = rectF0.right;
        float f5 = this.b;
        if(f4 - f < f5) {
            f = f4 - f5;
        }
        float f6 = this.d;
        if(f4 - f > f6) {
            f = f4 - f6;
        }
        if(f - f3 < f1) {
            f = f3;
        }
        if(f2 > 0.0f) {
            float f7 = (f4 - f) / f2;
            float f8 = this.c;
            if(f7 < f8) {
                f = Math.max(f3, f4 - f8 * f2);
                f7 = (rectF0.right - f) / f2;
            }
            float f9 = this.e;
            if(f7 > f9) {
                f = Math.max(rectF1.left, rectF0.right - f9 * f2);
                f7 = (rectF0.right - f) / f2;
            }
            if(!z || !z1) {
                if(z) {
                    float f10 = rectF0.bottom;
                    float f11 = rectF1.top;
                    if(f10 - f7 < f11) {
                        f = Math.max(rectF1.left, rectF0.right - (f10 - f11) * f2);
                        f7 = (rectF0.right - f) / f2;
                    }
                }
                if(z1) {
                    float f12 = rectF0.top;
                    float f13 = rectF1.bottom;
                    if(f7 + f12 > f13) {
                        f = Math.max(f, Math.max(rectF1.left, rectF0.right - (f13 - f12) * f2));
                    }
                }
            }
            else {
                f = Math.max(f, Math.max(rectF1.left, rectF0.right - rectF1.height() * f2));
            }
        }
        rectF0.left = f;
    }

    private final void d(RectF rectF0, float f) {
        rectF0.left = rectF0.right - rectF0.height() * f;
    }

    private final void e(RectF rectF0, RectF rectF1, float f) {
        rectF0.inset((rectF0.width() - rectF0.height() * f) / 2.0f, 0.0f);
        float f1 = rectF0.left;
        float f2 = rectF1.left;
        if(f1 < f2) {
            rectF0.offset(f2 - f1, 0.0f);
        }
        float f3 = rectF0.right;
        float f4 = rectF1.right;
        if(f3 > f4) {
            rectF0.offset(f4 - f3, 0.0f);
        }
    }

    private final void f(RectF rectF0, float f, RectF rectF1, int v, float f1, float f2, boolean z, boolean z1) {
        if(f > ((float)v)) {
            f = (f - ((float)v)) / 1.05f + ((float)v);
            this.f.x -= (f - ((float)v)) / 1.1f;
        }
        float f3 = rectF1.right;
        if(f > f3) {
            this.f.x -= (f - f3) / 2.0f;
        }
        if(f3 - f < f1) {
            f = f3;
        }
        float f4 = rectF0.left;
        float f5 = this.b;
        if(f - f4 < f5) {
            f = f4 + f5;
        }
        float f6 = this.d;
        if(f - f4 > f6) {
            f = f4 + f6;
        }
        if(f3 - f < f1) {
            f = f3;
        }
        if(f2 > 0.0f) {
            float f7 = (f - f4) / f2;
            float f8 = this.c;
            if(f7 < f8) {
                f = Math.min(f3, f4 + f8 * f2);
                f7 = (f - rectF0.left) / f2;
            }
            float f9 = this.e;
            if(f7 > f9) {
                f = Math.min(rectF1.right, rectF0.left + f9 * f2);
                f7 = (f - rectF0.left) / f2;
            }
            if(!z || !z1) {
                if(z) {
                    float f10 = rectF0.bottom;
                    float f11 = rectF1.top;
                    if(f10 - f7 < f11) {
                        f = Math.min(rectF1.right, rectF0.left + (f10 - f11) * f2);
                        f7 = (f - rectF0.left) / f2;
                    }
                }
                if(z1) {
                    float f12 = rectF0.top;
                    float f13 = rectF1.bottom;
                    if(f7 + f12 > f13) {
                        f = Math.min(f, Math.min(rectF1.right, rectF0.left + (f13 - f12) * f2));
                    }
                }
            }
            else {
                f = Math.min(f, Math.min(rectF1.right, rectF0.left + rectF1.height() * f2));
            }
        }
        rectF0.right = f;
    }

    private final void g(RectF rectF0, float f) {
        rectF0.right = rectF0.left + rectF0.height() * f;
    }

    private final void h(RectF rectF0, float f, RectF rectF1, float f1, float f2, boolean z, boolean z1) {
        if(f < 0.0f) {
            f /= 1.05f;
            this.f.y -= f / 1.1f;
        }
        float f3 = rectF1.top;
        if(f < f3) {
            this.f.y -= (f - f3) / 2.0f;
        }
        if(f - f3 < f1) {
            f = f3;
        }
        float f4 = rectF0.bottom;
        float f5 = this.c;
        if(f4 - f < f5) {
            f = f4 - f5;
        }
        float f6 = this.e;
        if(f4 - f > f6) {
            f = f4 - f6;
        }
        if(f - f3 < f1) {
            f = f3;
        }
        if(f2 > 0.0f) {
            float f7 = (f4 - f) * f2;
            float f8 = this.b;
            if(f7 < f8) {
                f = Math.max(f3, f4 - f8 / f2);
                f7 = (rectF0.bottom - f) * f2;
            }
            float f9 = this.d;
            if(f7 > f9) {
                f = Math.max(rectF1.top, rectF0.bottom - f9 / f2);
                f7 = (rectF0.bottom - f) * f2;
            }
            if(!z || !z1) {
                if(z) {
                    float f10 = rectF0.right;
                    float f11 = rectF1.left;
                    if(f10 - f7 < f11) {
                        f = Math.max(rectF1.top, rectF0.bottom - (f10 - f11) / f2);
                        f7 = (rectF0.bottom - f) * f2;
                    }
                }
                if(z1) {
                    float f12 = rectF0.left;
                    float f13 = rectF1.right;
                    if(f7 + f12 > f13) {
                        f = Math.max(f, Math.max(rectF1.top, rectF0.bottom - (f13 - f12) / f2));
                    }
                }
            }
            else {
                f = Math.max(f, Math.max(rectF1.top, rectF0.bottom - rectF1.width() / f2));
            }
        }
        rectF0.top = f;
    }

    private final void i(RectF rectF0, RectF rectF1, float f) {
        rectF0.inset(0.0f, (rectF0.height() - rectF0.width() / f) / 2.0f);
        float f1 = rectF0.top;
        float f2 = rectF1.top;
        if(f1 < f2) {
            rectF0.offset(0.0f, f2 - f1);
        }
        float f3 = rectF0.bottom;
        float f4 = rectF1.bottom;
        if(f3 > f4) {
            rectF0.offset(0.0f, f4 - f3);
        }
    }

    private final void j(RectF rectF0, float f) {
        rectF0.top = rectF0.bottom - rectF0.width() / f;
    }

    private final void k(RectF rectF0, float f, float f1) {
        float f3;
        float f2 = 0.0f;
        switch(this.a) {
            case 1: {
                f2 = rectF0.left - f;
                f3 = rectF0.top - f1;
                break;
            }
            case 2: {
                f2 = rectF0.right - f;
                f3 = rectF0.top - f1;
                break;
            }
            case 3: {
                f2 = rectF0.left - f;
                f3 = rectF0.bottom - f1;
                break;
            }
            case 4: {
                f2 = rectF0.right - f;
                f3 = rectF0.bottom - f1;
                break;
            }
            case 5: {
                f2 = rectF0.left - f;
                f3 = 0.0f;
                break;
            }
            case 6: {
                f3 = rectF0.top - f1;
                break;
            }
            case 7: {
                f2 = rectF0.right - f;
                f3 = 0.0f;
                break;
            }
            case 8: {
                f3 = rectF0.bottom - f1;
                break;
            }
            case 9: {
                f2 = rectF0.centerX() - f;
                f3 = rectF0.centerY() - f1;
                break;
            }
            default: {
                throw new J();
            }
        }
        this.f.x = f2;
        this.f.y = f3;
    }

    public final void l(@l RectF rectF0, float f, float f1, @l RectF rectF1, int v, int v1, float f2, boolean z, float f3) {
        L.p(rectF0, "rect");
        L.p(rectF1, "bounds");
        float f4 = this.f.x + f;
        float f5 = f1 + this.f.y;
        if(this.a == b.i) {
            this.m(rectF0, f4, f5, rectF1, v, v1, f2);
            return;
        }
        if(z) {
            this.n(rectF0, f4, f5, rectF1, v, v1, f2, f3);
            return;
        }
        this.o(rectF0, f4, f5, rectF1, v, v1, f2);
    }

    private final void m(RectF rectF0, float f, float f1, RectF rectF1, int v, int v1, float f2) {
        float f3 = f - rectF0.centerX();
        float f4 = f1 - rectF0.centerY();
        if(rectF0.left + f3 < 0.0f || (rectF0.right + f3 > ((float)v) || rectF0.left + f3 < rectF1.left || rectF0.right + f3 > rectF1.right)) {
            f3 /= 1.05f;
            this.f.x -= f3 / 2.0f;
        }
        if(rectF0.top + f4 < 0.0f || (rectF0.bottom + f4 > ((float)v1) || rectF0.top + f4 < rectF1.top || rectF0.bottom + f4 > rectF1.bottom)) {
            f4 /= 1.05f;
            this.f.y -= f4 / 2.0f;
        }
        rectF0.offset(f3, f4);
        this.p(rectF0, rectF1, f2);
    }

    private final void n(RectF rectF0, float f, float f1, RectF rectF1, int v, int v1, float f2, float f3) {
        switch(c.a[this.a.ordinal()]) {
            case 1: {
                if((rectF0.right - f) / (rectF0.bottom - f1) < f3) {
                    this.h(rectF0, f1, rectF1, f2, f3, true, false);
                    this.d(rectF0, f3);
                    return;
                }
                this.c(rectF0, f, rectF1, f2, f3, true, false);
                this.j(rectF0, f3);
                break;
            }
            case 2: {
                if((f - rectF0.left) / (rectF0.bottom - f1) < f3) {
                    this.h(rectF0, f1, rectF1, f2, f3, false, true);
                    this.g(rectF0, f3);
                    return;
                }
                this.f(rectF0, f, rectF1, v, f2, f3, true, false);
                this.j(rectF0, f3);
                return;
            }
            case 3: {
                if((rectF0.right - f) / (f1 - rectF0.top) < f3) {
                    this.a(rectF0, f1, rectF1, v1, f2, f3, true, false);
                    this.d(rectF0, f3);
                    return;
                }
                this.c(rectF0, f, rectF1, f2, f3, false, true);
                this.b(rectF0, f3);
                return;
            }
            case 4: {
                if((f - rectF0.left) / (f1 - rectF0.top) < f3) {
                    this.a(rectF0, f1, rectF1, v1, f2, f3, false, true);
                    this.g(rectF0, f3);
                    return;
                }
                this.f(rectF0, f, rectF1, v, f2, f3, false, true);
                this.b(rectF0, f3);
                return;
            }
            case 5: {
                this.c(rectF0, f, rectF1, f2, f3, true, true);
                this.i(rectF0, rectF1, f3);
                return;
            }
            case 6: {
                this.h(rectF0, f1, rectF1, f2, f3, true, true);
                this.e(rectF0, rectF1, f3);
                return;
            }
            case 7: {
                this.f(rectF0, f, rectF1, v, f2, f3, true, true);
                this.i(rectF0, rectF1, f3);
                return;
            }
            case 8: {
                this.a(rectF0, f1, rectF1, v1, f2, f3, true, true);
                this.e(rectF0, rectF1, f3);
                return;
            }
            case 9: {
                break;
            }
            default: {
                throw new J();
            }
        }
    }

    private final void o(RectF rectF0, float f, float f1, RectF rectF1, int v, int v1, float f2) {
        switch(c.a[this.a.ordinal()]) {
            case 1: {
                this.h(rectF0, f1, rectF1, f2, 0.0f, false, false);
                this.c(rectF0, f, rectF1, f2, 0.0f, false, false);
                break;
            }
            case 2: {
                this.h(rectF0, f1, rectF1, f2, 0.0f, false, false);
                this.f(rectF0, f, rectF1, v, f2, 0.0f, false, false);
                return;
            }
            case 3: {
                this.a(rectF0, f1, rectF1, v1, f2, 0.0f, false, false);
                this.c(rectF0, f, rectF1, f2, 0.0f, false, false);
                return;
            }
            case 4: {
                this.a(rectF0, f1, rectF1, v1, f2, 0.0f, false, false);
                this.f(rectF0, f, rectF1, v, f2, 0.0f, false, false);
                return;
            }
            case 5: {
                this.c(rectF0, f, rectF1, f2, 0.0f, false, false);
                return;
            }
            case 6: {
                this.h(rectF0, f1, rectF1, f2, 0.0f, false, false);
                return;
            }
            case 7: {
                this.f(rectF0, f, rectF1, v, f2, 0.0f, false, false);
                return;
            }
            case 8: {
                this.a(rectF0, f1, rectF1, v1, f2, 0.0f, false, false);
                return;
            }
            case 9: {
                break;
            }
            default: {
                throw new J();
            }
        }
    }

    private final void p(RectF rectF0, RectF rectF1, float f) {
        float f1 = rectF0.left;
        float f2 = rectF1.left;
        if(f1 < f2 + f) {
            rectF0.offset(f2 - f1, 0.0f);
        }
        float f3 = rectF0.top;
        float f4 = rectF1.top;
        if(f3 < f4 + f) {
            rectF0.offset(0.0f, f4 - f3);
        }
        float f5 = rectF0.right;
        float f6 = rectF1.right;
        if(f5 > f6 - f) {
            rectF0.offset(f6 - f5, 0.0f);
        }
        float f7 = rectF0.bottom;
        float f8 = rectF1.bottom;
        if(f7 > f8 - f) {
            rectF0.offset(0.0f, f8 - f7);
        }
    }
}

