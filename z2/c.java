package Z2;

import Y2.b;
import android.graphics.Bitmap;

public class c implements Y2.c {
    private float a;
    private static String b = "";

    static {
    }

    public c(float f) {
        this.a = f;
    }

    @Override  // Y2.c
    public Bitmap a(Bitmap bitmap0) {
        return b.d(this.a, bitmap0);
    }

    @Override  // Y2.c
    public void b(Object object0) {
        c.b = (String)object0;
    }

    public void c(float f) {
        this.a += f;
    }

    public float d() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    public String e() [...] // 潜在的解密器

    public void f(float f) {
        this.a = f;
    }

    // 去混淆评级： 低(20)
    @Override  // Y2.c
    public Object getTag() {
        return "";
    }
}

