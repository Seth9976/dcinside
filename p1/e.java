package p1;

import android.content.Context;
import com.facebook.soloader.H;
import com.facebook.soloader.p;
import com.facebook.soloader.z;
import java.io.File;

public class e implements f {
    private final Context a;
    private final a b;
    private final int c;
    private static final String d = "soloader.recovery.DetectDataAppMove";

    public e(Context context0, a a0) {
        this.a = context0;
        this.b = a0;
        this.c = a0.d();
    }

    @Override  // p1.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError0, H[] arr_h) {
        if(this.b()) {
            this.d(arr_h);
            return true;
        }
        int v = this.b.d();
        if(this.c != v) {
            p.j("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
            return true;
        }
        return false;
    }

    private boolean b() {
        String s = this.c();
        return new File(s).exists() && this.b.a(s);
    }

    private String c() {
        return this.a.getApplicationInfo().sourceDir;
    }

    private void d(H[] arr_h) {
        for(int v = 0; v < arr_h.length; ++v) {
            H h0 = arr_h[v];
            if(h0 instanceof z) {
                arr_h[v] = ((z)h0).b(this.a);
            }
        }
    }
}

