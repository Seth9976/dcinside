package com.fsn.cauly.Y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.fsn.cauly.CaulySpreadUtil;
import com.fsn.cauly.blackdragoncore.utils.d;
import com.fsn.cauly.blackdragoncore.utils.f;

public class a0 extends View {
    public static int a;
    private boolean b;
    private boolean c;
    private Bitmap d;
    private Context e;
    private int f;
    private i0 g;
    private int h;
    private int i;
    private int j;

    static {
    }

    public a0(Context context0, int v, i0 i00) {
        super(context0);
        this.b = false;
        this.c = false;
        this.d = null;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.e = context0;
        this.f = v;
        this.g = i00;
    }

    private void a(int v, int v1) {
        a0.a = v;
        if(v1 > 0 && this.b) {
            a0.a = this.getWidth();
        }
    }

    public void a(Bitmap bitmap0) {
        if(bitmap0 == null) {
            return;
        }
        if(this.c) {
            this.h = bitmap0.getWidth();
            this.i = bitmap0.getHeight();
            return;
        }
        c i0$c0 = this.g.q;
        if(i0$c0 == c.e || i0$c0 == c.b && !this.g.r.D) {
            Point point0 = d.a(bitmap0.getWidth(), bitmap0.getHeight(), d.b(this.g.b));
            this.i = point0.y;
            this.h = point0.x;
        }
        else {
            this.i = this.getHeight();
            this.h = bitmap0.getWidth() * this.i / bitmap0.getHeight();
        }
        if(this.h > this.getWidth()) {
            this.h = this.getWidth();
        }
        int v = a0.b(this.getWidth(), this.h);
        this.j = v;
        this.a(this.h, v);
    }

    public static int b(int v, int v1) {
        int v2 = (v - v1) / 2;
        return v2 >= 0 ? v2 : 0;
    }

    private void b(Canvas canvas0, int v, int v1) {
        float f = CaulySpreadUtil.DptoPx(this.e, ((float)this.f));
        if(f > 0.0f) {
            Path path0 = new Path();
            path0.addRoundRect(new RectF(0.0f, 0.0f, ((float)v), ((float)v1)), f, f, Path.Direction.CW);
            canvas0.clipPath(path0);
        }
    }

    public void b() {
        if(this.d != null && !this.d.isRecycled()) {
            this.d.recycle();
            this.d = null;
        }
    }

    private void c(Canvas canvas0, int v, int v1, Paint paint0) {
        paint0.setColor(0);
        canvas0.drawRect(new Rect(0, 0, this.j, v1), paint0);
        canvas0.drawRect(new Rect(this.j + this.h, 0, v, v1), paint0);
    }

    private void d(Canvas canvas0, Bitmap bitmap0, int v, int v1, Paint paint0) {
        c i0$c0 = this.g.q;
        c i0$c1 = c.a;
        if(i0$c0 != i0$c1 && i0$c0 != c.c) {
            if(i0$c0 == c.e) {
                canvas0.drawBitmap(bitmap0, new Rect(0, 0, 1, this.i), new Rect(0, 0, this.j, v1), paint0);
                canvas0.drawBitmap(bitmap0, new Rect(this.h - 1, 0, this.h, this.i), new Rect(this.j + this.h, 0, v, v1), paint0);
                return;
            }
            if(i0$c0 == c.b) {
                canvas0.drawBitmap(bitmap0, new Rect(0, 0, 1, this.i), new Rect(0, 0, this.j, v1), paint0);
                canvas0.drawBitmap(bitmap0, new Rect(this.h - 1, 0, this.h, this.i), new Rect(this.j + this.h, 0, v, v1), paint0);
            }
        }
        else if(i0$c0 == i0$c1) {
            canvas0.drawBitmap(bitmap0, new Rect(0, 0, 1, this.i), new Rect(0, 0, this.j, v1), paint0);
            canvas0.drawBitmap(bitmap0, new Rect(this.h - 1, 0, this.h, this.i), new Rect(this.j + this.h, 0, v, v1), paint0);
        }
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        Bitmap bitmap0 = this.d;
        if(bitmap0 == null) {
            super.draw(canvas0);
            return;
        }
        int v = this.getWidth();
        int v1 = this.getHeight();
        Paint paint0 = new Paint();
        this.b(canvas0, v, v1);
        if(this.e()) {
            this.a(bitmap0);
            if(this.e()) {
                Log.e("CAULY", "a0: dstWidth or dstHeight is not valid. dstWidth & dstHeight is below 0.");
                return;
            }
        }
        if(this.c) {
            canvas0.drawBitmap(bitmap0, new Rect(0, 0, this.h, this.i), new Rect(0, 0, v, v1), paint0);
            return;
        }
        Bitmap bitmap1 = f.a(bitmap0, this.h, this.i, true);
        canvas0.drawBitmap(bitmap1, new Rect(0, 0, this.h, this.i), new Rect(this.j, 0, this.h + this.j, v1), paint0);
        if(this.j > 0) {
            if(this.b) {
                this.d(canvas0, bitmap1, v, v1, paint0);
                return;
            }
            this.c(canvas0, v, v1, paint0);
        }
    }

    private boolean e() {
        return this.h <= 0 || this.i <= 0;
    }

    public void setAutoFill(boolean z) {
        this.b = z;
    }

    public void setBitmap(Bitmap bitmap0) {
        this.d = bitmap0;
        this.invalidate();
    }

    public void setFullMode(boolean z) {
        this.c = z;
    }
}

