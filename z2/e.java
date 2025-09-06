package Z2;

import X2.a;
import X2.b;
import Y2.c;
import android.graphics.Bitmap;

public class e implements c {
    private b[] a;
    private b[] b;
    private b[] c;
    private b[] d;
    private int[] e;
    private int[] f;
    private int[] g;
    private int[] h;
    private static String i = "";

    static {
    }

    public e(b[] arr_b, b[] arr_b1, b[] arr_b2, b[] arr_b3) {
        b[] arr_b4 = {new b(0.0f, 0.0f), new b(255.0f, 255.0f)};
        this.a = arr_b == null ? arr_b4 : arr_b;
        this.c = arr_b1 == null ? arr_b4 : arr_b1;
        this.b = arr_b2 == null ? arr_b4 : arr_b2;
        if(arr_b3 == null) {
            this.d = arr_b4;
            return;
        }
        this.d = arr_b3;
    }

    @Override  // Y2.c
    public Bitmap a(Bitmap bitmap0) {
        this.a = this.d(this.a);
        this.c = this.d(this.c);
        this.b = this.d(this.b);
        this.d = this.d(this.d);
        if(this.e == null) {
            this.e = a.b(this.a);
        }
        if(this.f == null) {
            this.f = a.b(this.c);
        }
        if(this.g == null) {
            this.g = a.b(this.b);
        }
        if(this.h == null) {
            this.h = a.b(this.d);
        }
        return Y2.b.a(this.e, this.f, this.g, this.h, bitmap0);
    }

    @Override  // Y2.c
    public void b(Object object0) {
        e.i = (String)object0;
    }

    // 去混淆评级： 低(20)
    public String c() [...] // 潜在的解密器

    public b[] d(b[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        for(int v = 1; v < arr_b.length - 1; ++v) {
            int v1 = 0;
            while(v1 <= arr_b.length - 2) {
                b b0 = arr_b[v1];
                float f = b0.a;
                ++v1;
                b b1 = arr_b[v1];
                float f1 = b1.a;
                if(f > f1) {
                    b0.a = f1;
                    b1.a = f;
                }
            }
        }
        return arr_b;
    }

    // 去混淆评级： 低(20)
    @Override  // Y2.c
    public Object getTag() {
        return "";
    }
}

