package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import h4.m;

final class SubtitlePainter {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;
    private static final String K = "SubtitlePainter";
    private static final float L = 0.125f;
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final TextPaint f;
    private final Paint g;
    private final Paint h;
    @Nullable
    private CharSequence i;
    @Nullable
    private Layout.Alignment j;
    @Nullable
    private Bitmap k;
    private float l;
    private int m;
    private int n;
    private float o;
    private int p;
    private float q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private float x;
    private float y;
    private float z;

    public SubtitlePainter(Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, new int[]{0x1010217, 0x1010218}, 0, 0);
        this.e = (float)typedArray0.getDimensionPixelSize(0, 0);
        this.d = typedArray0.getFloat(1, 1.0f);
        typedArray0.recycle();
        float f = (float)Math.round(((float)context0.getResources().getDisplayMetrics().densityDpi) * 2.0f / 160.0f);
        this.a = f;
        this.b = f;
        this.c = f;
        TextPaint textPaint0 = new TextPaint();
        this.f = textPaint0;
        textPaint0.setAntiAlias(true);
        textPaint0.setSubpixelText(true);
        Paint paint0 = new Paint();
        this.g = paint0;
        paint0.setAntiAlias(true);
        paint0.setStyle(Paint.Style.FILL);
        Paint paint1 = new Paint();
        this.h = paint1;
        paint1.setAntiAlias(true);
        paint1.setFilterBitmap(true);
    }

    // 去混淆评级： 低(20)
    private static boolean a(@Nullable CharSequence charSequence0, @Nullable CharSequence charSequence1) {
        return charSequence0 == charSequence1 || charSequence0 != null && charSequence0.equals(charSequence1);
    }

    public void b(Cue cue0, CaptionStyleCompat captionStyleCompat0, float f, float f1, float f2, Canvas canvas0, int v, int v1, int v2, int v3) {
        int v4;
        boolean z = cue0.d == null;
        if(z) {
            if(TextUtils.isEmpty(cue0.a)) {
                return;
            }
            v4 = cue0.l ? cue0.m : captionStyleCompat0.c;
        }
        else {
            v4 = 0xFF000000;
        }
        if(SubtitlePainter.a(this.i, cue0.a) && Util.g(this.j, cue0.b) && this.k == cue0.d && this.l == cue0.e && this.m == cue0.f && Util.g(this.n, cue0.g) && this.o == cue0.h && Util.g(this.p, cue0.i) && this.q == cue0.j && this.r == cue0.k && this.s == captionStyleCompat0.a && this.t == captionStyleCompat0.b && this.u == v4 && this.w == captionStyleCompat0.d && this.v == captionStyleCompat0.e && Util.g(this.f.getTypeface(), captionStyleCompat0.f) && this.x == f && this.y == f1 && this.z == f2 && this.A == v && this.B == v1 && this.C == v2 && this.D == v3) {
            this.d(canvas0, z);
            return;
        }
        this.i = cue0.a;
        this.j = cue0.b;
        this.k = cue0.d;
        this.l = cue0.e;
        this.m = cue0.f;
        this.n = cue0.g;
        this.o = cue0.h;
        this.p = cue0.i;
        this.q = cue0.j;
        this.r = cue0.k;
        this.s = captionStyleCompat0.a;
        this.t = captionStyleCompat0.b;
        this.u = v4;
        this.w = captionStyleCompat0.d;
        this.v = captionStyleCompat0.e;
        this.f.setTypeface(captionStyleCompat0.f);
        this.x = f;
        this.y = f1;
        this.z = f2;
        this.A = v;
        this.B = v1;
        this.C = v2;
        this.D = v3;
        if(z) {
            Assertions.g(this.i);
            this.g();
        }
        else {
            Assertions.g(this.k);
            this.f();
        }
        this.d(canvas0, z);
    }

    @m({"cueBitmap", "bitmapRect"})
    private void c(Canvas canvas0) {
        canvas0.drawBitmap(this.k, null, this.J, this.h);
    }

    private void d(Canvas canvas0, boolean z) {
        if(z) {
            this.e(canvas0);
            return;
        }
        Assertions.g(this.J);
        Assertions.g(this.k);
        this.c(canvas0);
    }

    private void e(Canvas canvas0) {
        StaticLayout staticLayout0 = this.E;
        StaticLayout staticLayout1 = this.F;
        if(staticLayout0 != null && staticLayout1 != null) {
            int v = canvas0.save();
            canvas0.translate(((float)this.G), ((float)this.H));
            if(Color.alpha(this.u) > 0) {
                this.g.setColor(this.u);
                canvas0.drawRect(((float)(-this.I)), 0.0f, ((float)(staticLayout0.getWidth() + this.I)), ((float)staticLayout0.getHeight()), this.g);
            }
            int v1 = this.w;
            boolean z = true;
            if(v1 == 1) {
                this.f.setStrokeJoin(Paint.Join.ROUND);
                this.f.setStrokeWidth(this.a);
                this.f.setColor(this.v);
                this.f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout1.draw(canvas0);
            }
            else {
                switch(v1) {
                    case 2: {
                        this.f.setShadowLayer(this.b, this.c, this.c, this.v);
                        break;
                    }
                    case 3: 
                    case 4: {
                        if(v1 != 3) {
                            z = false;
                        }
                        int v2 = -1;
                        int v3 = z ? -1 : this.v;
                        if(z) {
                            v2 = this.v;
                        }
                        float f = this.b / 2.0f;
                        this.f.setColor(this.s);
                        this.f.setStyle(Paint.Style.FILL);
                        this.f.setShadowLayer(this.b, -f, -f, v3);
                        staticLayout1.draw(canvas0);
                        this.f.setShadowLayer(this.b, f, f, v2);
                    }
                }
            }
            this.f.setColor(this.s);
            this.f.setStyle(Paint.Style.FILL);
            staticLayout0.draw(canvas0);
            this.f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas0.restoreToCount(v);
        }
    }

    @m({"cueBitmap"})
    private void f() {
        Bitmap bitmap0 = this.k;
        float f = (float)(this.C - this.A);
        float f1 = ((float)this.A) + this.o * f;
        float f2 = (float)(this.D - this.B);
        float f3 = ((float)this.B) + this.l * f2;
        int v = Math.round(f * this.q);
        float f4 = this.r;
        int v1 = f4 == -3.402823E+38f ? Math.round(((float)v) * (((float)bitmap0.getHeight()) / ((float)bitmap0.getWidth()))) : Math.round(f2 * f4);
        int v2 = this.p;
        if(v2 == 2) {
            f1 -= (float)v;
        }
        else if(v2 == 1) {
            f1 -= (float)(v / 2);
        }
        int v3 = Math.round(f1);
        int v4 = this.n;
        if(v4 == 2) {
            f3 -= (float)v1;
        }
        else if(v4 == 1) {
            f3 -= (float)(v1 / 2);
        }
        int v5 = Math.round(f3);
        this.J = new Rect(v3, v5, v + v3, v1 + v5);
    }

    @m({"cueText"})
    private void g() {
        int v19;
        int v16;
        int v14;
        int v13;
        SpannableStringBuilder spannableStringBuilder0 = this.i instanceof SpannableStringBuilder ? ((SpannableStringBuilder)this.i) : new SpannableStringBuilder(this.i);
        int v = this.C - this.A;
        int v1 = this.D - this.B;
        this.f.setTextSize(this.x);
        int v2 = (int)(this.x * 0.125f + 0.5f);
        int v3 = v - v2 * 2;
        float f = this.q;
        if(f != -3.402823E+38f) {
            v3 = (int)(((float)v3) * f);
        }
        int v4 = v3;
        if(v4 <= 0) {
            Log.n("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if(this.y > 0.0f) {
            spannableStringBuilder0.setSpan(new AbsoluteSizeSpan(((int)this.y)), 0, spannableStringBuilder0.length(), 0xFF0000);
        }
        SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder(spannableStringBuilder0);
        if(this.w == 1) {
            ForegroundColorSpan[] arr_foregroundColorSpan = (ForegroundColorSpan[])spannableStringBuilder1.getSpans(0, spannableStringBuilder1.length(), ForegroundColorSpan.class);
            for(int v5 = 0; v5 < arr_foregroundColorSpan.length; ++v5) {
                spannableStringBuilder1.removeSpan(arr_foregroundColorSpan[v5]);
            }
        }
        if(Color.alpha(this.t) > 0) {
            if(this.w == 0 || this.w == 2) {
                spannableStringBuilder0.setSpan(new BackgroundColorSpan(this.t), 0, spannableStringBuilder0.length(), 0xFF0000);
            }
            else {
                spannableStringBuilder1.setSpan(new BackgroundColorSpan(this.t), 0, spannableStringBuilder1.length(), 0xFF0000);
            }
        }
        Layout.Alignment layout$Alignment0 = this.j == null ? Layout.Alignment.ALIGN_CENTER : this.j;
        StaticLayout staticLayout0 = new StaticLayout(spannableStringBuilder0, this.f, v4, layout$Alignment0, this.d, this.e, true);
        this.E = staticLayout0;
        int v6 = staticLayout0.getHeight();
        int v7 = this.E.getLineCount();
        int v8 = 0;
        for(int v9 = 0; v9 < v7; ++v9) {
            v8 = Math.max(((int)Math.ceil(this.E.getLineWidth(v9))), v8);
        }
        if(this.q == -3.402823E+38f || v8 >= v4) {
            v4 = v8;
        }
        int v10 = v4 + v2 * 2;
        float f1 = this.o;
        if(f1 == -3.402823E+38f) {
            v13 = (v - v10) / 2 + this.A;
            v14 = v13 + v10;
        }
        else {
            int v11 = this.A;
            int v12 = Math.round(((float)v) * f1) + v11;
            switch(this.p) {
                case 1: {
                    v12 = (v12 * 2 - v10) / 2;
                    break;
                }
                case 2: {
                    v12 -= v10;
                }
            }
            v13 = Math.max(v12, v11);
            v14 = Math.min(v10 + v13, this.C);
        }
        int v15 = v14 - v13;
        if(v15 <= 0) {
            Log.n("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f2 = this.l;
        if(f2 == -3.402823E+38f) {
            v19 = this.D - v6 - ((int)(((float)v1) * this.z));
        }
        else {
            if(this.m == 0) {
                v16 = Math.round(((float)v1) * f2) + this.B;
                switch(this.n) {
                    case 1: {
                        v16 = (v16 * 2 - v6) / 2;
                        break;
                    }
                    case 2: {
                        v16 -= v6;
                    }
                }
            }
            else {
                int v17 = this.E.getLineBottom(0) - this.E.getLineTop(0);
                v16 = this.l >= 0.0f ? Math.round(this.l * ((float)v17)) + this.B : Math.round((this.l + 1.0f) * ((float)v17)) + this.D - v6;
            }
            int v18 = this.D;
            if(v16 + v6 > v18) {
                v19 = v18 - v6;
            }
            else {
                int v20 = this.B;
                v19 = v16 < v20 ? v20 : v16;
            }
        }
        this.E = new StaticLayout(spannableStringBuilder0, this.f, v15, layout$Alignment0, this.d, this.e, true);
        this.F = new StaticLayout(spannableStringBuilder1, this.f, v15, layout$Alignment0, this.d, this.e, true);
        this.G = v13;
        this.H = v19;
        this.I = v2;
    }
}

