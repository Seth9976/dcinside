package com.dcinside.app.barcode;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class GraphicOverlay extends View {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private boolean a;
    @m
    private Bitmap b;
    @l
    public static final a c = null;
    private static final int d = 16;
    private static final int e = 40;

    static {
        GraphicOverlay.c = new a(null);
    }

    public GraphicOverlay(@m Context context0, @m AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public final void a() {
        this.a = true;
        this.invalidate();
    }

    @Override  // android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(!this.a) {
            return;
        }
        int v = this.getWidth();
        int v1 = this.getHeight();
        Rect rect0 = g.c(v, v1);
        if(this.b == null) {
            this.b = BitmapFactory.decodeResource(this.getContext().getResources(), 0x7F08010F);  // drawable:barcode_scanner_image
        }
        Paint paint0 = new Paint(1);
        paint0.setColor(ContextCompat.getColor(this.getContext(), 0x7F06008A));  // color:barcode_scanner_border_background
        canvas0.drawRect(0.0f, 0.0f, ((float)v), ((float)rect0.top), paint0);
        canvas0.drawRect(0.0f, ((float)rect0.top), ((float)rect0.left), ((float)rect0.bottom) + 1.0f, paint0);
        canvas0.drawRect(((float)rect0.right) + 1.0f, ((float)rect0.top), ((float)v), ((float)rect0.bottom) + 1.0f, paint0);
        canvas0.drawRect(0.0f, ((float)rect0.bottom) + 1.0f, ((float)v), ((float)v1), paint0);
        paint0.setAlpha(0xFF);
        Rect rect1 = g.b(v, v1);
        Bitmap bitmap0 = this.b;
        L.m(bitmap0);
        L.m(rect1);
        canvas0.drawBitmap(bitmap0, null, rect1, paint0);
        Paint paint1 = new Paint(1);
        paint1.setColor(-1);
        paint1.setTypeface(Typeface.create("sans-serif", 0));
        paint1.setTextAlign(Paint.Align.CENTER);
        paint1.setTextSize(TypedValue.applyDimension(2, 16.0f, this.getResources().getDisplayMetrics()));
        float f = TypedValue.applyDimension(2, 40.0f, this.getResources().getDisplayMetrics());
        canvas0.drawText("붉은 선 안에 바코드를 위치시키세요.", ((float)v) / 2.0f, ((float)rect0.bottom) + f + (paint1.ascent() + paint1.descent()) / 2.0f, paint1);
    }
}

