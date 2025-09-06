package Z2;

import Y2.c;
import android.graphics.Bitmap;

public class b implements c {
    private final int a;
    private final float b;
    private final float c;
    private final float d;
    private static String e = "";

    static {
    }

    public b(int v, float f, float f1, float f2) {
        this.a = v;
        this.b = f;
        this.d = f2;
        this.c = f1;
    }

    @Override  // Y2.c
    public Bitmap a(Bitmap bitmap0) {
        return Y2.b.c(this.a, this.b, this.c, this.d, bitmap0);
    }

    @Override  // Y2.c
    public void b(Object object0) {
        b.e = (String)object0;
    }

    // 去混淆评级： 低(20)
    public String c() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @Override  // Y2.c
    public Object getTag() {
        return "";
    }
}

