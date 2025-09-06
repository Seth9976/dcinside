package com.vungle.ads.internal.platform;

import androidx.core.util.Consumer;
import com.vungle.ads.internal.model.c;
import y4.l;
import y4.m;

public interface d {
    public static final class a {
        static final a $$INSTANCE = null;
        @l
        public static final String MANUFACTURER_AMAZON = "Amazon";

        static {
            a.$$INSTANCE = new a();
        }
    }

    @l
    public static final a Companion = null;
    @l
    public static final String MANUFACTURER_AMAZON = "Amazon";

    static {
        d.Companion = a.$$INSTANCE;
    }

    @m
    c getAdvertisingInfo();

    @m
    String getAppSetId();

    @m
    Integer getAppSetIdScope();

    @l
    String getCarrierName();

    @m
    String getUserAgent();

    void getUserAgentLazy(@l Consumer arg1);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}

