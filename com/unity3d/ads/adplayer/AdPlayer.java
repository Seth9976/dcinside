package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge.BannerEvent;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.K;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public interface AdPlayer {
    public static final class Companion {
        static final Companion $$INSTANCE = null;
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        @l
        private static final D broadcastEventChannel;

        static {
            Companion.$$INSTANCE = new Companion();
            Companion.broadcastEventChannel = K.b(0, 0, null, 7, null);
        }

        @l
        public final D getBroadcastEventChannel() {
            return Companion.broadcastEventChannel;
        }
    }

    public static final class DefaultImpls {
        @CallSuper
        @m
        public static Object destroy(@l AdPlayer adPlayer0, @l d d0) {
            P.f(adPlayer0.getScope(), null, 1, null);
            return S0.a;
        }

        public static void show(@l AdPlayer adPlayer0, @l ShowOptions showOptions0) {
            L.p(showOptions0, "showOptions");
            throw new kotlin.K(null, 1, null);
        }
    }

    @l
    public static final Companion Companion = null;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    static {
        AdPlayer.Companion = Companion.$$INSTANCE;
    }

    @CallSuper
    @m
    Object destroy(@l d arg1);

    void dispatchShowCompleted();

    @l
    i getOnLoadEvent();

    @l
    i getOnOfferwallEvent();

    @l
    i getOnScarEvent();

    @l
    i getOnShowEvent();

    @l
    O getScope();

    @l
    i getUpdateCampaignState();

    @l
    WebViewContainer getWebViewContainer();

    @m
    Object onAllowedPiiChange(@l byte[] arg1, @l d arg2);

    @m
    Object onBroadcastEvent(@l String arg1, @l d arg2);

    @m
    Object requestShow(@m Map arg1, @l d arg2);

    @m
    Object sendActivityDestroyed(@l d arg1);

    @m
    Object sendFocusChange(boolean arg1, @l d arg2);

    @m
    Object sendGmaEvent(@l c arg1, @l d arg2);

    @m
    Object sendMuteChange(boolean arg1, @l d arg2);

    @m
    Object sendOfferwallEvent(@l OfferwallEvent arg1, @l d arg2);

    @m
    Object sendPrivacyFsmChange(@l byte[] arg1, @l d arg2);

    @m
    Object sendScarBannerEvent(@l BannerEvent arg1, @l d arg2);

    @m
    Object sendUserConsentChange(@l byte[] arg1, @l d arg2);

    @m
    Object sendVisibilityChange(boolean arg1, @l d arg2);

    @m
    Object sendVolumeChange(double arg1, @l d arg2);

    void show(@l ShowOptions arg1);
}

