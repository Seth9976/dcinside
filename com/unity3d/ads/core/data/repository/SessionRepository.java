package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags;
import gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration;
import gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters;
import java.util.List;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int arg1);

    @l
    FeatureFlags getFeatureFlags();

    @m
    String getGameId();

    @m
    Object getGatewayCache(@l d arg1);

    @l
    ByteString getGatewayState();

    @l
    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    @l
    InitializationState getInitializationState();

    @l
    NativeConfiguration getNativeConfiguration();

    @l
    i getObserveInitializationState();

    @l
    I getOnChange();

    @m
    Object getPrivacy(@l d arg1);

    @m
    Object getPrivacyFsm(@l d arg1);

    @l
    List getScarEligibleFormats();

    @l
    SessionCounters getSessionCounters();

    @l
    ByteString getSessionId();

    @l
    ByteString getSessionToken();

    boolean getShouldInitialize();

    @l
    TokenCounters getTokenCounters();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    @m
    Object persistNativeConfiguration(@l d arg1);

    void resetTokenCounters();

    void setGameId(@m String arg1);

    @m
    Object setGatewayCache(@l ByteString arg1, @l d arg2);

    void setGatewayState(@l ByteString arg1);

    void setGatewayUrl(@l String arg1);

    void setInitializationState(@l InitializationState arg1);

    void setNativeConfiguration(@l NativeConfiguration arg1);

    @m
    Object setPrivacy(@l ByteString arg1, @l d arg2);

    @m
    Object setPrivacyFsm(@l ByteString arg1, @l d arg2);

    void setSessionCounters(@l SessionCounters arg1);

    void setSessionToken(@l ByteString arg1);

    void setShouldInitialize(boolean arg1);

    void setTokenCounters(@l TokenCounters arg1);
}

