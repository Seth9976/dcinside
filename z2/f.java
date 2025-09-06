package Z2;

import Y2.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.zomato.photofilters.R.drawable;

public class f implements c {
    private Context a;
    private int b;
    private static String c = "";

    static {
    }

    public f(Context context0, int v) {
        this.a = context0;
        this.b = v;
    }

    @Override  // Y2.c
    public Bitmap a(Bitmap bitmap0) {
        Bitmap bitmap1 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.a.getResources(), drawable.vignette), bitmap0.getWidth(), bitmap0.getHeight(), true);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setAlpha(this.b);
        new Canvas(bitmap0).drawBitmap(bitmap1, 0.0f, 0.0f, paint0);
        return bitmap0;
    }

    @Override  // Y2.c
    public void b(Object object0) {
        f.c = (String)object0;
    }

    public void c(int v) {
        int v1 = this.b + v;
        this.b = v1;
        if(v1 > 0xFF) {
            this.b = 0xFF;
            return;
        }
        if(v1 < 0) {
            this.b = 0;
        }
    }

    public void d(int v) {
        this.b = v;
    }

    // 去混淆评级： 低(20)
    @Override  // Y2.c
    public Object getTag() {
        return "";
    }
}

