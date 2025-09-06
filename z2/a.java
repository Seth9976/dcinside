package Z2;

import Y2.b;
import Y2.c;
import android.graphics.Bitmap;

public class a implements c {
    private int a;
    private static String b = "";

    static {
    }

    public a(int v) {
        this.a = v;
    }

    @Override  // Y2.c
    public Bitmap a(Bitmap bitmap0) {
        return b.b(this.a, bitmap0);
    }

    @Override  // Y2.c
    public void b(Object object0) {
        a.b = (String)object0;
    }

    public void c(int v) {
        this.a += v;
    }

    public int d() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    public String e() [...] // 潜在的解密器

    public void f(int v) {
        this.a = v;
    }

    // 去混淆评级： 低(20)
    @Override  // Y2.c
    public Object getTag() {
        return "";
    }
}

