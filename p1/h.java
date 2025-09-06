package p1;

import com.facebook.soloader.E;
import com.facebook.soloader.F;
import com.facebook.soloader.H;
import com.facebook.soloader.c;
import com.facebook.soloader.p;

public class h implements f {
    @Override  // p1.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError0, H[] arr_h) {
        if(!(unsatisfiedLinkError0 instanceof F)) {
            return false;
        }
        if(unsatisfiedLinkError0 instanceof E) {
            return false;
        }
        String s = ((F)unsatisfiedLinkError0).getMessage();
        if(s != null && (s.contains("/app/") || s.contains("/mnt/"))) {
            String s1 = ((F)unsatisfiedLinkError0).a();
            p.c("SoLoader", "Reunpacking BackupSoSources due to " + unsatisfiedLinkError0 + (s1 == null ? "" : ", retrying for specific library " + s1));
            for(int v = 0; v < arr_h.length; ++v) {
                H h0 = arr_h[v];
                if(h0 instanceof c) {
                    c c0 = (c)h0;
                    try {
                        p.c("SoLoader", "Runpacking BackupSoSource BackupSoSource");
                        c0.x();
                    }
                    catch(Exception exception0) {
                        p.d("SoLoader", "Encountered an exception while reunpacking BackupSoSource BackupSoSource for library " + s1 + ": ", exception0);
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}

