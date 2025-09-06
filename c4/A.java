package C4;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Shader;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

public class a implements b {
    private float a;
    private Shader b;
    private final RectF c;

    public a(@FloatRange(from = 0.0) float f) {
        this.c = new RectF();
        this.f(f);
    }

    @Override  // C4.b
    public void a(Canvas canvas0, Paint paint0, Bitmap bitmap0) {
        if(this.a == 0.0f) {
            canvas0.drawBitmap(bitmap0, null, this.c, paint0);
            return;
        }
        if(this.b == null) {
            this.b = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Matrix matrix0 = new Matrix();
            matrix0.setTranslate(this.c.left, this.c.top);
            matrix0.preScale(this.c.width() / ((float)bitmap0.getWidth()), this.c.height() / ((float)bitmap0.getHeight()));
            this.b.setLocalMatrix(matrix0);
        }
        paint0.setShader(this.b);
        canvas0.drawRoundRect(this.c, this.a, this.a, paint0);
    }

    @Override  // C4.b
    public void b(Rect rect0) {
        this.c.set(rect0);
        this.b = null;
    }

    @NonNull
    public RectF c() {
        return this.c;
    }

    @FloatRange(from = 0.0)
    public float d() {
        return this.a;
    }

    public void e(@FloatRange(from = 0.0) float f) {
        this.f(f);
    }

    private void f(@FloatRange(from = 0.0) float f) {
        float f1 = Math.max(0.0f, f);
        if(f1 != this.a) {
            this.a = f1;
            this.b = null;
        }
    }
}

