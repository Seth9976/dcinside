package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.f;
import com.iab.omid.library.unity3d.adsession.j;
import com.iab.omid.library.unity3d.adsession.l;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.jvm.internal.L;
import org.json.JSONObject;
import y4.m;

public abstract class AndroidOmInteraction implements OmInteraction {
    private final f getCreativeType(JSONObject jSONObject0) {
        switch(jSONObject0.optInt("creativeType")) {
            case 1: {
                return f.b;
            }
            case 2: {
                return f.c;
            }
            case 3: {
                return f.d;
            }
            case 4: {
                return f.e;
            }
            case 5: {
                return f.f;
            }
            default: {
                throw new IllegalArgumentException("Invalid creativeType");
            }
        }
    }

    private final j getImpressionType(JSONObject jSONObject0) {
        switch(jSONObject0.optInt("impressionType")) {
            case 1: {
                return j.b;
            }
            case 2: {
                return j.c;
            }
            case 3: {
                return j.d;
            }
            case 4: {
                return j.e;
            }
            case 5: {
                return j.f;
            }
            case 6: {
                return j.g;
            }
            case 7: {
                return j.h;
            }
            case 8: {
                return j.i;
            }
            default: {
                throw new IllegalArgumentException("Invalid impressionType");
            }
        }
    }

    private final l getImpressionsOwner(JSONObject jSONObject0) {
        try {
            switch(jSONObject0.optInt("impressionOwner")) {
                case 1: {
                    return l.c;
                }
                case 2: {
                    return l.b;
                }
                case 3: {
                    return l.d;
                }
                default: {
                    return l.d;
                }
            }
        }
        catch(IllegalArgumentException unused_ex) {
            return l.d;
        }
    }

    private final l getMediaEventsOwner(JSONObject jSONObject0) {
        try {
            switch(jSONObject0.optInt("mediaEventsOwner")) {
                case 1: {
                    return l.c;
                }
                case 2: {
                    return l.b;
                }
                case 3: {
                    return l.d;
                }
                default: {
                    return l.d;
                }
            }
        }
        catch(IllegalArgumentException unused_ex) {
            return l.d;
        }
    }

    @Override  // com.unity3d.ads.core.domain.om.OmInteraction
    @y4.l
    public OmidOptions getOMidOptions(@y4.l JSONObject jSONObject0) {
        L.p(jSONObject0, "options");
        return new OmidOptions(jSONObject0.optBoolean("isolateVerificationScripts"), this.getImpressionsOwner(jSONObject0), this.getVideoEventsOwner(jSONObject0), jSONObject0.optString("customReferenceData"), this.getImpressionType(jSONObject0), this.getCreativeType(jSONObject0), this.getMediaEventsOwner(jSONObject0));
    }

    private final l getVideoEventsOwner(JSONObject jSONObject0) {
        try {
            switch(jSONObject0.optInt("videoEventsOwner")) {
                case 1: {
                    return l.c;
                }
                case 2: {
                    return l.b;
                }
                case 3: {
                    return l.d;
                }
                default: {
                    return l.d;
                }
            }
        }
        catch(IllegalArgumentException unused_ex) {
            return l.d;
        }
    }

    @Override  // com.unity3d.ads.core.domain.om.OmInteraction
    @m
    public WebView getWebview(@y4.l AdObject adObject0) {
        L.p(adObject0, "adObject");
        AdPlayer adPlayer0 = adObject0.getAdPlayer();
        if(adPlayer0 instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer)adPlayer0).getWebViewContainer().getWebView();
        }
        return adPlayer0 instanceof AndroidEmbeddableWebViewAdPlayer ? ((AndroidEmbeddableWebViewAdPlayer)adPlayer0).getWebViewContainer().getWebView() : null;
    }
}

