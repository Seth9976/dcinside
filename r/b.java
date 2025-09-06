package R;

import com.dcinside.app.wv.f;
import com.google.android.gms.ads.AdView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b implements f {
    @m
    private WeakReference a;

    public b(@l AdView adView0) {
        L.p(adView0, "view");
        super();
        this.a = new WeakReference(adView0);
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        try {
            WeakReference weakReference0 = this.a;
            if(weakReference0 != null) {
                AdView adView0 = (AdView)weakReference0.get();
                if(adView0 != null) {
                    adView0.destroy();
                }
            }
        }
        catch(Exception unused_ex) {
        }
        WeakReference weakReference1 = this.a;
        if(weakReference1 != null) {
            weakReference1.clear();
        }
        this.a = null;
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        try {
            WeakReference weakReference0 = this.a;
            if(weakReference0 != null) {
                AdView adView0 = (AdView)weakReference0.get();
                if(adView0 != null) {
                    adView0.pause();
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        try {
            WeakReference weakReference0 = this.a;
            if(weakReference0 != null) {
                AdView adView0 = (AdView)weakReference0.get();
                if(adView0 != null) {
                    adView0.resume();
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

