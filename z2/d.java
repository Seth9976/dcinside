package Z2;

import Y2.b;
import Y2.c;
import android.graphics.Bitmap;

public class d implements c {
    private float a;
    private static String b = "";

    static {
    }

    public d(float f) {
        this.a = f;
    }

    @Override  // Y2.c
    public Bitmap a(Bitmap bitmap0) {
        return b.e(bitmap0, this.a);
    }

    @Override  // Y2.c
    public void b(Object object0) {
        d.b = (String)object0;
    }

    public float c() {
        return this.a;
    }

    public void d(float f) {
        this.a = f;
    }

    // 去混淆评级： 低(20)
    @Override  // Y2.c
    public Object getTag() {
        return "";
    }
}

