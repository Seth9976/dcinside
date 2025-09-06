package com.bytedance.sdk.openadsdk.core.qj;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

public class XX {
    private final AdSession JQp;
    protected boolean PjT;
    protected String ReZ;
    private boolean XX;
    protected int Zh;
    protected VastProperties cr;
    private final AdEvents cz;

    public XX(AdSession adSession0, AdEvents adEvents0, View view0) {
        this.XX = false;
        this.PjT = false;
        this.Zh = 0;
        this.JQp = adSession0;
        this.cz = adEvents0;
        this.ReZ = adSession0.getAdSessionId();
        this.PjT(view0);
    }

    void PjT(float f, boolean z) {
    }

    // 去混淆评级： 低(40)
    public void PjT(int v) {
    }

    void PjT(View view0) {
        if(view0 == null) {
            return;
        }
        AdSession adSession0 = this.JQp;
        if(adSession0 != null) {
            adSession0.registerAdView(view0);
        }
    }

    public void PjT(View view0, FriendlyObstructionPurpose friendlyObstructionPurpose0) {
        AdSession adSession0 = this.JQp;
        if(adSession0 != null) {
            adSession0.addFriendlyObstruction(view0, friendlyObstructionPurpose0, null);
        }
    }

    public void PjT(Set set0) {
        for(Object object0: set0) {
            this.PjT(((View)((Pair)object0).first), ((FriendlyObstructionPurpose)((Pair)object0).second));
        }
    }

    public void PjT(boolean z) {
    }

    public void PjT(boolean z, float f) {
    }

    boolean PjT() {
        return this.PjT;
    }

    void ReZ() {
        this.PjT(4);
    }

    void Zh() {
        this.PjT(1);
    }

    void Zh(int v) {
    }

    public void cr() {
        this.PjT(3);
    }
}

