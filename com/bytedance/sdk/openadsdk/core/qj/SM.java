package com.bytedance.sdk.openadsdk.core.qj;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

public class SM extends XX {
    @NonNull
    private final MediaEvents JQp;
    private boolean cz;

    public SM(@NonNull AdSession adSession0, @NonNull AdEvents adEvents0, @NonNull View view0, @NonNull MediaEvents mediaEvents0) {
        super(adSession0, adEvents0, view0);
        this.JQp = mediaEvents0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.qj.XX
    public void PjT(float f, boolean z) {
        if(!this.PjT()) {
            return;
        }
        this.JQp.start(f, (z ? 0.0f : 1.0f));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.qj.XX
    public void PjT(boolean z) {
        this.cz = z;
        this.Zh(12);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.qj.XX
    public void PjT(boolean z, float f) {
        this.cr = z ? VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        this.PjT(2);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.qj.XX
    public void Zh(int v) {
        if(!this.PjT()) {
            return;
        }
        switch(v) {
            case 0: {
                this.JQp.pause();
                return;
            }
            case 1: {
                this.JQp.resume();
                return;
            }
            case 4: {
                this.JQp.bufferStart();
                return;
            }
            case 5: {
                this.JQp.bufferFinish();
                return;
            }
            case 6: {
                this.JQp.firstQuartile();
                return;
            }
            case 7: {
                this.JQp.midpoint();
                return;
            }
            case 8: {
                this.JQp.thirdQuartile();
                return;
            }
            case 9: {
                this.JQp.complete();
                return;
            }
            case 10: {
                this.JQp.playerStateChange(PlayerState.FULLSCREEN);
                return;
            }
            case 11: {
                this.JQp.playerStateChange(PlayerState.NORMAL);
                return;
            }
            case 12: {
                this.JQp.volumeChange((this.cz ? 0.0f : 1.0f));
                return;
            }
            case 13: {
                this.JQp.adUserInteraction(InteractionType.CLICK);
                return;
            }
            case 2: 
            case 14: {
                this.JQp.skipped();
            }
        }
    }
}

