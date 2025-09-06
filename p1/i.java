package p1;

import com.facebook.soloader.E;
import com.facebook.soloader.F;
import com.facebook.soloader.H;
import com.facebook.soloader.L;
import com.facebook.soloader.c;
import com.facebook.soloader.p;

public class i implements f {
    @Override  // p1.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError0, H[] arr_h) {
        if(!(unsatisfiedLinkError0 instanceof F)) {
            return false;
        }
        if(unsatisfiedLinkError0 instanceof E) {
            return false;
        }
        String s = ((F)unsatisfiedLinkError0).a();
        p.c("SoLoader", "Reunpacking NonApk UnpackingSoSources due to " + unsatisfiedLinkError0 + (s == null ? "" : ", retrying for specific library " + s));
        for(int v = 0; v < arr_h.length; ++v) {
            H h0 = arr_h[v];
            if(h0 instanceof L) {
                L l0 = (L)h0;
                if(!(l0 instanceof c)) {
                    try {
                        p.c("SoLoader", "Runpacking DirectorySoSource");
                        l0.x();
                    }
                    catch(Exception exception0) {
                        p.d("SoLoader", "Encountered an exception while reunpacking DirectorySoSource for library " + s + ": ", exception0);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

