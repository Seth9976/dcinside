package com.kakao.adfit.ads.na;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.kakao.adfit.ads.R.string;
import com.kakao.adfit.e.k;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;

public final class e extends k {
    private final ImageView b;
    private final int c;
    private final int d;
    private final int e;

    public e(ImageView imageView0, b m$b0, int v, int v1, d d0) {
        static final class a extends o implements A3.o {
            int a;
            final d b;
            final b c;
            final e d;

            a(d d0, b m$b0, e e0, kotlin.coroutines.d d1) {
                this.b = d0;
                this.c = m$b0;
                this.d = e0;
                super(2, d1);
            }

            public final Object a(O o0, kotlin.coroutines.d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                return new a(this.b, this.c, this.d, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.a) {
                    case 0: {
                        f0.n(object0);
                        this.a = 1;
                        object0 = d.a(this.b, this.c.b(), 0L, this, 2, null);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(this.d.f()) {
                    if(((Bitmap)object0) == null) {
                        this.d.i();
                        return S0.a;
                    }
                    this.d.a(((Bitmap)object0));
                }
                return S0.a;
            }
        }

        L.p(imageView0, "view");
        L.p(d0, "imageContainer");
        super();
        this.b = imageView0;
        this.c = v1;
        imageView0.setContentDescription(imageView0.getResources().getString(string.adfit_ad_info_description));
        if(m$b0 != null) {
            this.d = m$b0.c();
            this.e = m$b0.a();
            Bitmap bitmap0 = d0.a(m$b0.b());
            if(bitmap0 != null) {
                this.a(bitmap0);
                return;
            }
            if(v != 0) {
                imageView0.setImageResource(v);
            }
            kotlinx.coroutines.k.f(P.a(j1.c(null, 1, null).plus(h0.e().u1())), null, null, new a(d0, m$b0, this, null), 3, null);
            return;
        }
        this.d = 0;
        this.e = 0;
        if(v != 0) {
            imageView0.setImageResource(v);
        }
    }

    private final void a(Bitmap bitmap0) {
        public static final class com.kakao.adfit.ads.na.e.b extends BitmapDrawable {
            final int a;
            final int b;

            com.kakao.adfit.ads.na.e.b(Bitmap bitmap0, int v, int v1, Resources resources0) {
                this.a = v;
                this.b = v1;
                super(resources0, bitmap0);
            }

            @Override  // android.graphics.drawable.BitmapDrawable
            public int getIntrinsicHeight() {
                return this.b;
            }

            @Override  // android.graphics.drawable.BitmapDrawable
            public int getIntrinsicWidth() {
                return this.a;
            }
        }

        if(this.d > 0 && (this.e > 0 && ((float)this.d) / ((float)this.e) == ((float)bitmap0.getWidth()) / ((float)bitmap0.getHeight()))) {
            float f = this.b.getContext().getResources().getDisplayMetrics().density;
            com.kakao.adfit.ads.na.e.b e$b0 = new com.kakao.adfit.ads.na.e.b(bitmap0, kotlin.math.b.L0(((float)this.d) * f), kotlin.math.b.L0(((float)this.e) * f), this.b.getResources());
            this.b.setImageDrawable(e$b0);
            return;
        }
        this.b.setImageBitmap(bitmap0);
    }

    @Override  // com.kakao.adfit.e.k
    protected void g() {
    }

    private final void i() {
        int v = this.c;
        if(v != 0) {
            this.b.setImageResource(v);
        }
    }
}

