package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

abstract class e {
    final int a;

    private e(int v) {
        this.a = v;
    }

    e(int v, a e$a0) {
        this(v);
    }

    abstract void a(RectF arg1, RectF arg2, RectF arg3);

    private static e b(CarouselLayoutManager carouselLayoutManager0) {
        class b extends e {
            final CarouselLayoutManager b;

            b(int v, CarouselLayoutManager carouselLayoutManager0) {
                this.b = carouselLayoutManager0;
                super(v, null);
            }

            @Override  // com.google.android.material.carousel.e
            public void a(RectF rectF0, RectF rectF1, RectF rectF2) {
                float f = rectF1.left;
                float f1 = rectF2.left;
                if(f < f1 && rectF1.right > f1) {
                    float f2 = f1 - f;
                    rectF0.left += f2;
                    rectF1.left += f2;
                }
                float f3 = rectF1.right;
                float f4 = rectF2.right;
                if(f3 > f4 && rectF1.left < f4) {
                    float f5 = f3 - f4;
                    rectF0.right = Math.max(rectF0.right - f5, rectF0.left);
                    rectF1.right = Math.max(rectF1.right - f5, rectF1.left);
                }
            }

            @Override  // com.google.android.material.carousel.e
            int e(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.b.s0(view0) + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin;
            }

            @Override  // com.google.android.material.carousel.e
            public float f(LayoutParams recyclerView$LayoutParams0) {
                return (float)(recyclerView$LayoutParams0.rightMargin + recyclerView$LayoutParams0.leftMargin);
            }

            @Override  // com.google.android.material.carousel.e
            public RectF g(float f, float f1, float f2, float f3) {
                return new RectF(f3, 0.0f, f1 - f3, f);
            }

            @Override  // com.google.android.material.carousel.e
            int h() {
                int v = this.b.E0();
                return this.b.x0() - v;
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.android.material.carousel.e
            int i() {
                return this.b.t3() ? 0 : this.k();
            }

            @Override  // com.google.android.material.carousel.e
            int j() [...] // Inlined contents

            @Override  // com.google.android.material.carousel.e
            int k() {
                return this.b.R0();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.android.material.carousel.e
            int l() {
                return this.b.t3() ? this.k() : 0;
            }

            @Override  // com.google.android.material.carousel.e
            int m() {
                return this.b.J0();
            }

            @Override  // com.google.android.material.carousel.e
            public void n(View view0, int v, int v1) {
                int v2 = this.m();
                int v3 = this.e(view0);
                this.b.i1(view0, v, v2, v1, v2 + v3);
            }

            @Override  // com.google.android.material.carousel.e
            public void o(RectF rectF0, RectF rectF1, RectF rectF2) {
                if(rectF1.right <= rectF2.left) {
                    float f = ((float)Math.floor(rectF0.right)) - 1.0f;
                    rectF0.right = f;
                    rectF0.left = Math.min(rectF0.left, f);
                }
                if(rectF1.left >= rectF2.right) {
                    float f1 = ((float)Math.ceil(rectF0.left)) + 1.0f;
                    rectF0.left = f1;
                    rectF0.right = Math.max(f1, rectF0.right);
                }
            }

            @Override  // com.google.android.material.carousel.e
            public void p(View view0, Rect rect0, float f, float f1) {
                view0.offsetLeftAndRight(((int)(f1 - (((float)rect0.left) + f))));
            }
        }

        return new b(0, carouselLayoutManager0);
    }

    static e c(CarouselLayoutManager carouselLayoutManager0, int v) {
        switch(v) {
            case 0: {
                return e.b(carouselLayoutManager0);
            }
            case 1: {
                return e.d(carouselLayoutManager0);
            }
            default: {
                throw new IllegalArgumentException("invalid orientation");
            }
        }
    }

    private static e d(CarouselLayoutManager carouselLayoutManager0) {
        class a extends e {
            final CarouselLayoutManager b;

            a(int v, CarouselLayoutManager carouselLayoutManager0) {
                this.b = carouselLayoutManager0;
                super(v, null);
            }

            @Override  // com.google.android.material.carousel.e
            public void a(RectF rectF0, RectF rectF1, RectF rectF2) {
                float f = rectF1.top;
                float f1 = rectF2.top;
                if(f < f1 && rectF1.bottom > f1) {
                    float f2 = f1 - f;
                    rectF0.top += f2;
                    rectF2.top += f2;
                }
                float f3 = rectF1.bottom;
                float f4 = rectF2.bottom;
                if(f3 > f4 && rectF1.top < f4) {
                    float f5 = f3 - f4;
                    rectF0.bottom = Math.max(rectF0.bottom - f5, rectF0.top);
                    rectF1.bottom = Math.max(rectF1.bottom - f5, rectF1.top);
                }
            }

            @Override  // com.google.android.material.carousel.e
            int e(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.b.t0(view0) + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin;
            }

            @Override  // com.google.android.material.carousel.e
            public float f(LayoutParams recyclerView$LayoutParams0) {
                return (float)(recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin);
            }

            @Override  // com.google.android.material.carousel.e
            public RectF g(float f, float f1, float f2, float f3) {
                return new RectF(0.0f, f2, f1, f - f2);
            }

            @Override  // com.google.android.material.carousel.e
            int h() {
                return this.b.x0();
            }

            @Override  // com.google.android.material.carousel.e
            int i() {
                return this.h();
            }

            @Override  // com.google.android.material.carousel.e
            int j() {
                return this.b.G0();
            }

            @Override  // com.google.android.material.carousel.e
            int k() {
                int v = this.b.H0();
                return this.b.R0() - v;
            }

            @Override  // com.google.android.material.carousel.e
            int l() {
                return 0;
            }

            @Override  // com.google.android.material.carousel.e
            int m() [...] // Inlined contents

            @Override  // com.google.android.material.carousel.e
            public void n(View view0, int v, int v1) {
                int v2 = this.j();
                int v3 = this.e(view0);
                this.b.i1(view0, v2, v, v2 + v3, v1);
            }

            @Override  // com.google.android.material.carousel.e
            public void o(RectF rectF0, RectF rectF1, RectF rectF2) {
                if(rectF1.bottom <= rectF2.top) {
                    float f = ((float)Math.floor(rectF0.bottom)) - 1.0f;
                    rectF0.bottom = f;
                    rectF0.top = Math.min(rectF0.top, f);
                }
                if(rectF1.top >= rectF2.bottom) {
                    float f1 = ((float)Math.ceil(rectF0.top)) + 1.0f;
                    rectF0.top = f1;
                    rectF0.bottom = Math.max(f1, rectF0.bottom);
                }
            }

            @Override  // com.google.android.material.carousel.e
            public void p(View view0, Rect rect0, float f, float f1) {
                view0.offsetTopAndBottom(((int)(f1 - (((float)rect0.top) + f))));
            }
        }

        return new a(1, carouselLayoutManager0);
    }

    abstract int e(View arg1);

    abstract float f(LayoutParams arg1);

    abstract RectF g(float arg1, float arg2, float arg3, float arg4);

    abstract int h();

    abstract int i();

    abstract int j();

    abstract int k();

    abstract int l();

    abstract int m();

    abstract void n(View arg1, int arg2, int arg3);

    abstract void o(RectF arg1, RectF arg2, RectF arg3);

    abstract void p(View arg1, Rect arg2, float arg3, float arg4);
}

