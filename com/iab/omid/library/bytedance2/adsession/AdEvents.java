package com.iab.omid.library.bytedance2.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONObject;

public final class AdEvents {
    private final a adSession;

    private AdEvents(a a0) {
        this.adSession = a0;
    }

    public static AdEvents createAdEvents(AdSession adSession0) {
        g.a(adSession0, "AdSession is null");
        g.g(((a)adSession0));
        g.b(((a)adSession0));
        AdEvents adEvents0 = new AdEvents(((a)adSession0));
        ((a)adSession0).getAdSessionStatePublisher().a(adEvents0);
        return adEvents0;
    }

    public void impressionOccurred() {
        g.b(this.adSession);
        g.e(this.adSession);
        if(!this.adSession.f()) {
            try {
                this.adSession.start();
            }
            catch(Exception unused_ex) {
            }
        }
        if(this.adSession.f()) {
            this.adSession.k();
        }
    }

    public void loaded() {
        g.a(this.adSession);
        g.e(this.adSession);
        this.adSession.l();
    }

    public void loaded(@NonNull VastProperties vastProperties0) {
        g.a(vastProperties0, "VastProperties is null");
        g.a(this.adSession);
        g.e(this.adSession);
        JSONObject jSONObject0 = vastProperties0.a();
        this.adSession.a(jSONObject0);
    }
}

