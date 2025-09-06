package com.kakao.adfit.ads.na;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.kakao.adfit.e.k;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;

public final class j extends k {
    private final ImageView b;
    private final int c;

    public j(ImageView imageView0, b m$b0, int v, int v1, d d0) {
        static final class a extends o implements A3.o {
            int a;
            final d b;
            final b c;
            final j d;

            a(d d0, b m$b0, j j0, kotlin.coroutines.d d1) {
                this.b = d0;
                this.c = m$b0;
                this.d = j0;
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
        if(m$b0 != null) {
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
        if(v != 0) {
            imageView0.setImageResource(v);
        }
    }

    private final void a(Bitmap bitmap0) {
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

