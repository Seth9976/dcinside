package top.defaults.colorpicker;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class a extends Drawable {
    public static final class top.defaults.colorpicker.a.a {
        private int a;
        private int b;
        private int c;

        public top.defaults.colorpicker.a.a() {
            this.a = 40;
            this.b = -4013374;
            this.c = 0xFFF3F3F3;
        }

        public a d() {
            return new a(this, null);
        }

        public top.defaults.colorpicker.a.a e(int v) {
            this.c = v;
            return this;
        }

        public top.defaults.colorpicker.a.a f(int v) {
            this.b = v;
            return this;
        }

        public top.defaults.colorpicker.a.a g(int v) {
            this.a = v;
            return this;
        }
    }

    private Paint a;
    private int b;
    private int c;
    private int d;

    private a(top.defaults.colorpicker.a.a a$a0) {
        this.a = new Paint(1);
        this.b = a$a0.a;
        this.c = a$a0.b;
        this.d = a$a0.c;
        this.a();
    }

    a(top.defaults.colorpicker.a.a a$a0, b b0) {
        this(a$a0);
    }

    private void a() {
        Bitmap bitmap0 = Bitmap.createBitmap(this.b * 2, this.b * 2, Bitmap.Config.ARGB_8888);
        Paint paint0 = new Paint(1);
        paint0.setStyle(Paint.Style.FILL);
        Canvas canvas0 = new Canvas(bitmap0);
        Rect rect0 = new Rect(0, 0, this.b, this.b);
        paint0.setColor(this.c);
        canvas0.drawRect(rect0, paint0);
        rect0.offset(this.b, this.b);
        canvas0.drawRect(rect0, paint0);
        paint0.setColor(this.d);
        rect0.offset(-this.b, 0);
        canvas0.drawRect(rect0, paint0);
        rect0.offset(this.b, -this.b);
        canvas0.drawRect(rect0, paint0);
        this.a.setShader(new BitmapShader(bitmap0, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
    }

    public static a b() {
        return new a(new top.defaults.colorpicker.a.a());
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        canvas0.drawPaint(this.a);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
    }
}

