package d1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class d {
    @l
    public static final d a;

    static {
        d.a = new d();
    }

    @n
    public static final void a(@l Bitmap bitmap0, @l Bitmap bitmap1, boolean z) {
        Paint paint1;
        Paint paint0;
        L.p(bitmap0, "output");
        L.p(bitmap1, "source");
        bitmap0.setHasAlpha(true);
        if(z) {
            paint0 = new Paint(1);
            paint1 = new Paint(1);
        }
        else {
            paint0 = new Paint();
            paint1 = new Paint();
        }
        paint0.setColor(0xFF000000);
        paint1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        float f = ((float)bitmap1.getWidth()) / 2.0f;
        float f1 = ((float)bitmap1.getHeight()) / 2.0f;
        Canvas canvas0 = new Canvas(bitmap0);
        canvas0.drawCircle(f, f1, Math.min(f, f1), paint0);
        canvas0.drawBitmap(bitmap1, 0.0f, 0.0f, paint1);
    }
}

