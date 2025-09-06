package com.dcinside.app.image.edit.blur;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.dcinside.app.Application;
import com.dcinside.app.util.ol;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditBlurUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditBlurUtil.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public final class c {
    static final class a {
        @l
        private final Bitmap a;
        private final int b;
        private final int c;

        public a(@l Bitmap bitmap0, int v, int v1) {
            L.p(bitmap0, "bitmap");
            super();
            this.a = bitmap0;
            this.b = v;
            this.c = v1;
        }

        @l
        public final Bitmap a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        @l
        public final a d(@l Bitmap bitmap0, int v, int v1) {
            L.p(bitmap0, "bitmap");
            return new a(bitmap0, v, v1);
        }

        public static a e(a c$a0, Bitmap bitmap0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                bitmap0 = c$a0.a;
            }
            if((v2 & 2) != 0) {
                v = c$a0.b;
            }
            if((v2 & 4) != 0) {
                v1 = c$a0.c;
            }
            return c$a0.d(bitmap0, v, v1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(!L.g(this.a, ((a)object0).a)) {
                return false;
            }
            return this.b == ((a)object0).b ? this.c == ((a)object0).c : false;
        }

        @l
        public final Bitmap f() {
            return this.a;
        }

        public final int g() {
            return this.b;
        }

        public final int h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c;
        }

        @Override
        @l
        public String toString() {
            return "BlurMask(bitmap=" + this.a + ", sx=" + this.b + ", sy=" + this.c + ")";
        }
    }

    @l
    public static final c a;

    static {
        c.a = new c();
    }

    @l
    public final Bitmap a(float f, @l Bitmap bitmap0) {
        L.p(bitmap0, "source");
        return this.e(bitmap0, Application.e.c(), f);
    }

    private final a b(Bitmap bitmap0, float f, float f1) {
        Bitmap bitmap1 = this.c(Application.e.c(), 0x7F080377);  // drawable:image_edit_blur_mask_circle
        bitmap0.setHasAlpha(true);
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        int v2 = (int)(((float)Math.min(v, v1)) * 0.5f);
        int v3 = bitmap1.getWidth();
        int v4 = bitmap1.getHeight();
        ol ol0 = ol.e.k(v3, v4, v2, v2);
        int v5 = ol0.a();
        int v6 = ol0.b();
        if(ol0.c()) {
            Bitmap bitmap2 = Bitmap.createScaledBitmap(bitmap1, v5, v6, false);
            bitmap1.recycle();
            bitmap1 = bitmap2;
        }
        L.m(bitmap1);
        int v7 = bitmap1.getWidth();
        int v8 = bitmap1.getHeight();
        int v9 = (int)(((float)v) * f - ((float)(v7 / 2)));
        int v10 = (int)(((float)v1) * f1 - ((float)(v8 / 2)));
        V v11 = v9 >= 0 ? r0.a(v9, v7) : r0.a(0, ((int)(v7 + v9)));
        int v12 = ((Number)v11.a()).intValue();
        V v13 = v10 >= 0 ? r0.a(v10, v8) : r0.a(0, ((int)(v8 + v10)));
        int v14 = ((Number)v13.a()).intValue();
        Bitmap bitmap3 = Bitmap.createBitmap(bitmap0, v12, v14, ((Number)v11.b()).intValue(), ((Number)v13.b()).intValue());
        L.o(bitmap3, "createBitmap(...)");
        Canvas canvas0 = new Canvas(bitmap3);
        Paint paint0 = new Paint();
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas0.drawBitmap(bitmap1, (v9 >= 0 ? 0.0f : ((float)v9) + 0.0f), (v10 >= 0 ? 0.0f : 0.0f + ((float)v10)), paint0);
        bitmap1.recycle();
        return new a(bitmap3, v12, v14);
    }

    private final Bitmap c(Context context0, int v) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inMutable = true;
        bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap0 = BitmapFactory.decodeResource(context0.getResources(), v, bitmapFactory$Options0);
        L.o(bitmap0, "decodeResource(...)");
        return bitmap0;
    }

    public final void d(@l Canvas canvas0, @l Bitmap bitmap0, float f, float f1) {
        L.p(canvas0, "canvas");
        L.p(bitmap0, "source");
        Paint paint0 = new Paint();
        a c$a0 = this.b(bitmap0, f, f1);
        Bitmap bitmap1 = c$a0.a();
        canvas0.drawBitmap(bitmap1, ((float)c$a0.b()), ((float)c$a0.c()), paint0);
        bitmap1.recycle();
    }

    private final Bitmap e(Bitmap bitmap0, Context context0, float f) {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
        L.o(bitmap1, "createBitmap(...)");
        RenderScript renderScript0 = RenderScript.create(context0);
        ScriptIntrinsicBlur scriptIntrinsicBlur0 = ScriptIntrinsicBlur.create(renderScript0, Element.U8_4(renderScript0));
        Allocation allocation0 = Allocation.createFromBitmap(renderScript0, bitmap1);
        scriptIntrinsicBlur0.setRadius(f);
        scriptIntrinsicBlur0.setInput(Allocation.createFromBitmap(renderScript0, bitmap0));
        scriptIntrinsicBlur0.forEach(allocation0);
        allocation0.copyTo(bitmap1);
        renderScript0.destroy();
        return bitmap1;
    }
}

