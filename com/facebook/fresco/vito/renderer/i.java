package com.facebook.fresco.vito.renderer;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nImageRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRenderer.kt\ncom/facebook/fresco/vito/renderer/ImageRenderer\n*L\n1#1,133:1\n47#1,2:134\n115#1,4:136\n49#1,3:140\n128#1,3:143\n120#1,3:146\n53#1:149\n115#1,4:150\n56#1:154\n128#1,3:155\n120#1,3:158\n58#1:161\n62#1,2:162\n120#1,3:164\n73#1,2:167\n96#1:169\n115#1,4:170\n128#1,3:174\n120#1,3:177\n115#1,4:180\n128#1,3:184\n120#1,3:187\n115#1,4:190\n128#1,3:194\n120#1,3:197\n115#1,4:200\n128#1,3:204\n120#1,3:207\n120#1,3:210\n*S KotlinDebug\n*F\n+ 1 ImageRenderer.kt\ncom/facebook/fresco/vito/renderer/ImageRenderer\n*L\n36#1:134,2\n36#1:136,4\n36#1:140,3\n36#1:143,3\n36#1:146,3\n36#1:149\n36#1:150,4\n36#1:154\n36#1:155,3\n36#1:158,3\n36#1:161\n37#1:162,2\n37#1:164,3\n38#1:167,2\n38#1:169\n48#1:170,4\n51#1:174,3\n51#1:177,3\n53#1:180,4\n56#1:184,3\n56#1:187,3\n48#1:190,4\n51#1:194,3\n51#1:197,3\n53#1:200,4\n56#1:204,3\n56#1:207,3\n63#1:210,3\n*E\n"})
public final class i {
    @l
    public static final i a;

    static {
        i.a = new i();
    }

    @l
    public final Function1 a(@l Paint paint0, @l Bitmap bitmap0, @m Matrix matrix0) {
        public static final class a implements Function1 {
            final Matrix a;
            final Bitmap b;
            final Paint c;

            public a(Matrix matrix0, Bitmap bitmap0, Paint paint0) {
                this.a = matrix0;
                this.b = bitmap0;
                this.c = paint0;
                super();
            }

            public final void a(Canvas canvas0) {
                L.p(canvas0, "canvas");
                canvas0.concat(this.a);
                canvas0.drawBitmap(this.b, 0.0f, 0.0f, this.c);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Canvas)object0));
                return S0.a;
            }
        }

        L.p(paint0, "paint");
        L.p(bitmap0, "bitmap");
        return new a(matrix0, bitmap0, paint0);
    }

    @l
    public final Function1 b(@l h h0, @l o o0, @l Paint paint0, @m Matrix matrix0) {
        L.p(h0, "model");
        L.p(o0, "shape");
        L.p(paint0, "paint");
        if(h0 instanceof b) {
            if(o0 instanceof com.facebook.fresco.vito.renderer.m) {
                return new a(matrix0, ((b)h0).g(), paint0);
            }
            if(o0 instanceof e) {
                if(!((b)h0).h()) {
                    paint0.setShader(new BitmapShader(((b)h0).g(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
                    paint0.getShader().setLocalMatrix(matrix0);
                    return new d(o0, paint0);
                }
                return new a(matrix0, ((b)h0).g(), paint0);
            }
            paint0.setShader(new BitmapShader(((b)h0).g(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
            paint0.getShader().setLocalMatrix(matrix0);
            return new d(o0, paint0);
        }
        if(h0 instanceof f) {
            int v = ((f)h0).g();
            int v1 = paint0.getAlpha();
            paint0.setColor(V0.a.a.a(v, v1));
            return new d(o0, paint0);
        }
        if(!(h0 instanceof g)) {
            throw new J();
        }
        return o0 instanceof com.facebook.fresco.vito.renderer.m ? new com.facebook.fresco.vito.renderer.i.b(((g)h0), matrix0, o0, paint0) : new c(((g)h0), paint0, matrix0, o0);
    }

    public static Function1 c(i i0, h h0, o o0, Paint paint0, Matrix matrix0, int v, Object object0) {
        if((v & 8) != 0) {
            matrix0 = null;
        }
        return i0.b(h0, o0, paint0, matrix0);
    }

    @l
    public final Function1 d(@l b b0, @l o o0, @l Paint paint0, @m Matrix matrix0) {
        L.p(b0, "<this>");
        L.p(o0, "shape");
        L.p(paint0, "paint");
        if(o0 instanceof com.facebook.fresco.vito.renderer.m) {
            return new a(matrix0, b0.g(), paint0);
        }
        if(o0 instanceof e) {
            if(!b0.h()) {
                paint0.setShader(new BitmapShader(b0.g(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
                paint0.getShader().setLocalMatrix(matrix0);
                return new d(o0, paint0);
            }
            return new a(matrix0, b0.g(), paint0);
        }
        paint0.setShader(new BitmapShader(b0.g(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint0.getShader().setLocalMatrix(matrix0);
        return new d(o0, paint0);
    }

    @l
    public final Function1 e(@l f f0, @l o o0, @l Paint paint0) {
        L.p(f0, "<this>");
        L.p(o0, "shape");
        L.p(paint0, "paint");
        int v = paint0.getAlpha();
        paint0.setColor(V0.a.a.a(f0.g(), v));
        return new d(o0, paint0);
    }

    @l
    public final Function1 f(@l g g0, @l o o0, @l Paint paint0, @m Matrix matrix0) {
        public static final class com.facebook.fresco.vito.renderer.i.b implements Function1 {
            final g a;
            final Matrix b;
            final o c;
            final Paint d;

            public com.facebook.fresco.vito.renderer.i.b(g g0, Matrix matrix0, o o0, Paint paint0) {
                this.a = g0;
                this.b = matrix0;
                this.c = o0;
                this.d = paint0;
                super();
            }

            public final void a(Canvas canvas0) {
                L.p(canvas0, "canvas");
                if(this.a.c() <= 0 || this.a.b() <= 0) {
                    this.a.g().setBounds(((int)((com.facebook.fresco.vito.renderer.m)this.c).b().left), ((int)((com.facebook.fresco.vito.renderer.m)this.c).b().top), ((int)((com.facebook.fresco.vito.renderer.m)this.c).b().right), ((int)((com.facebook.fresco.vito.renderer.m)this.c).b().bottom));
                }
                else {
                    this.a.g().setBounds(0, 0, this.a.c(), this.a.b());
                    canvas0.concat(this.b);
                }
                if(!L.g(this.a.g().getColorFilter(), this.d.getColorFilter())) {
                    this.a.g().setColorFilter(this.d.getColorFilter());
                }
                this.a.g().setAlpha(this.d.getAlpha());
                this.a.g().draw(canvas0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Canvas)object0));
                return S0.a;
            }
        }


        @s0({"SMAP\nImageRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRenderer.kt\ncom/facebook/fresco/vito/renderer/ImageRenderer$createRenderCommand$2\n+ 2 ImageRenderer.kt\ncom/facebook/fresco/vito/renderer/ImageRenderer\n*L\n1#1,133:1\n128#2,3:134\n*S KotlinDebug\n*F\n+ 1 ImageRenderer.kt\ncom/facebook/fresco/vito/renderer/ImageRenderer$createRenderCommand$2\n*L\n104#1:134,3\n*E\n"})
        public static final class c implements Function1 {
            final g a;
            final Paint b;
            final Matrix c;
            final o d;

            public c(g g0, Paint paint0, Matrix matrix0, o o0) {
                this.a = g0;
                this.b = paint0;
                this.c = matrix0;
                this.d = o0;
                super();
            }

            public final void a(Canvas canvas0) {
                L.p(canvas0, "canvas");
                this.a.g().setBounds(0, 0, this.a.c(), this.a.b());
                if(this.a.g().getColorFilter() != null) {
                    this.a.g().setColorFilter(null);
                }
                Bitmap bitmap0 = Bitmap.createBitmap(this.a.c(), this.a.b(), Bitmap.Config.ARGB_8888);
                L.o(bitmap0, "createBitmap(...)");
                Canvas canvas1 = new Canvas(bitmap0);
                this.a.g().draw(canvas1);
                BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                this.b.setShader(bitmapShader0);
                this.b.getShader().setLocalMatrix(this.c);
                this.d.a(canvas0, this.b);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Canvas)object0));
                return S0.a;
            }
        }

        L.p(g0, "<this>");
        L.p(o0, "shape");
        L.p(paint0, "paint");
        return o0 instanceof com.facebook.fresco.vito.renderer.m ? new com.facebook.fresco.vito.renderer.i.b(g0, matrix0, o0, paint0) : new c(g0, paint0, matrix0, o0);
    }

    public static Function1 g(i i0, b b0, o o0, Paint paint0, Matrix matrix0, int v, Object object0) {
        if((v & 4) != 0) {
            matrix0 = null;
        }
        L.p(b0, "<this>");
        L.p(o0, "shape");
        L.p(paint0, "paint");
        if(o0 instanceof com.facebook.fresco.vito.renderer.m) {
            return new a(matrix0, b0.g(), paint0);
        }
        if(o0 instanceof e) {
            if(!b0.h()) {
                paint0.setShader(new BitmapShader(b0.g(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
                paint0.getShader().setLocalMatrix(matrix0);
                return new d(o0, paint0);
            }
            return new a(matrix0, b0.g(), paint0);
        }
        paint0.setShader(new BitmapShader(b0.g(), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint0.getShader().setLocalMatrix(matrix0);
        return new d(o0, paint0);
    }

    public static Function1 h(i i0, g g0, o o0, Paint paint0, Matrix matrix0, int v, Object object0) {
        if((v & 4) != 0) {
            matrix0 = null;
        }
        L.p(g0, "<this>");
        L.p(o0, "shape");
        L.p(paint0, "paint");
        return o0 instanceof com.facebook.fresco.vito.renderer.m ? new com.facebook.fresco.vito.renderer.i.b(g0, matrix0, o0, paint0) : new c(g0, paint0, matrix0, o0);
    }

    @l
    public final Function1 i(@l o o0, @l Paint paint0) {
        public static final class d implements Function1 {
            final o a;
            final Paint b;

            public d(o o0, Paint paint0) {
                this.a = o0;
                this.b = paint0;
                super();
            }

            public final void a(Canvas canvas0) {
                L.p(canvas0, "canvas");
                this.a.a(canvas0, this.b);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Canvas)object0));
                return S0.a;
            }
        }

        L.p(o0, "shape");
        L.p(paint0, "paint");
        return new d(o0, paint0);
    }

    @l
    public final Paint j(@l Paint paint0, @l Bitmap bitmap0, @m Matrix matrix0) {
        L.p(paint0, "<this>");
        L.p(bitmap0, "bitmap");
        paint0.setShader(new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint0.getShader().setLocalMatrix(matrix0);
        return paint0;
    }

    public static Paint k(i i0, Paint paint0, Bitmap bitmap0, Matrix matrix0, int v, Object object0) {
        if((v & 2) != 0) {
            matrix0 = null;
        }
        L.p(paint0, "<this>");
        L.p(bitmap0, "bitmap");
        paint0.setShader(new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint0.getShader().setLocalMatrix(matrix0);
        return paint0;
    }
}

