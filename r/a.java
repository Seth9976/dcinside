package R;

import com.dcinside.app.wv.f;
import com.kakao.adfit.ads.ba.BannerAdView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a implements f {
    @m
    private WeakReference a;

    public a(@l BannerAdView bannerAdView0) {
        L.p(bannerAdView0, "view");
        super();
        this.a = new WeakReference(bannerAdView0);
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
                BannerAdView bannerAdView0 = (BannerAdView)weakReference0.get();
                if(bannerAdView0 != null) {
                    bannerAdView0.destroy();
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
                BannerAdView bannerAdView0 = (BannerAdView)weakReference0.get();
                if(bannerAdView0 != null) {
                    bannerAdView0.pause();
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
                BannerAdView bannerAdView0 = (BannerAdView)weakReference0.get();
                if(bannerAdView0 != null) {
                    bannerAdView0.resume();
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }
}

