package p1;

import com.facebook.soloader.F;
import com.facebook.soloader.H;
import com.facebook.soloader.b;
import com.facebook.soloader.p;

public class j implements f {
    @Override  // p1.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError0, H[] arr_h) {
        String s = unsatisfiedLinkError0 instanceof F ? ((F)unsatisfiedLinkError0).a() : null;
        p.c("SoLoader", "Waiting on SoSources due to " + unsatisfiedLinkError0 + (s == null ? "" : ", retrying for specific library " + s));
        for(int v = 0; v < arr_h.length; ++v) {
            H h0 = arr_h[v];
            if(h0 instanceof b) {
                p.c("SoLoader", "Waiting on SoSource " + h0.f());
                ((b)h0).a();
            }
        }
        return true;
    }
}

