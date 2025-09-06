package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds.UnityAdsInitializationError;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.services.core.configuration.EnvironmentCheck;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.InitMetric;
import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class CommonShouldAllowInitialization implements ShouldAllowInitialization {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[InitializationState.values().length];
            try {
                arr_v[InitializationState.INITIALIZING.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[InitializationState.INITIALIZED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[InitializationState.FAILED.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    private final AlternativeFlowReader alternativeFlowReader;
    @l
    private final CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges;
    @l
    private final GetInitializationState getInitializationState;
    @l
    private final SetInitializationState setInitializationState;
    @l
    private final ValidateGameId validateGameId;

    public CommonShouldAllowInitialization(@l AlternativeFlowReader alternativeFlowReader0, @l CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges0, @l GetInitializationState getInitializationState0, @l SetInitializationState setInitializationState0, @l ValidateGameId validateGameId0) {
        L.p(alternativeFlowReader0, "alternativeFlowReader");
        L.p(checkForGameIdAndTestModeChanges0, "checkForGameIdAndTestModeChanges");
        L.p(getInitializationState0, "getInitializationState");
        L.p(setInitializationState0, "setInitializationState");
        L.p(validateGameId0, "validateGameId");
        super();
        this.alternativeFlowReader = alternativeFlowReader0;
        this.checkForGameIdAndTestModeChanges = checkForGameIdAndTestModeChanges0;
        this.getInitializationState = getInitializationState0;
        this.setInitializationState = setInitializationState0;
        this.validateGameId = validateGameId0;
    }

    @l
    public final AlternativeFlowReader getAlternativeFlowReader() {
        return this.alternativeFlowReader;
    }

    @l
    public final CheckForGameIdAndTestModeChanges getCheckForGameIdAndTestModeChanges() {
        return this.checkForGameIdAndTestModeChanges;
    }

    @l
    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    @l
    public final SetInitializationState getSetInitializationState() {
        return this.setInitializationState;
    }

    @l
    public final ValidateGameId getValidateGameId() {
        return this.validateGameId;
    }

    @Override  // com.unity3d.ads.core.domain.ShouldAllowInitialization
    public boolean invoke(@m String s) {
        if(!this.validateGameId.invoke(s)) {
            return false;
        }
        if(this.alternativeFlowReader.invoke()) {
            switch(this.getInitializationState.invoke(false)) {
                case 1: {
                    break;
                }
                case 2: {
                    SdkProperties.notifyInitializationComplete();
                    break;
                }
                case 3: 
                case 4: {
                    this.checkForGameIdAndTestModeChanges.invoke(false);
                    this.setInitializationState.invoke(InitializationState.INITIALIZING, false);
                    return true;
                }
                default: {
                    throw new J();
                }
            }
            return false;
        }
        switch(this.getInitializationState.invoke(true)) {
            case 1: {
                break;
            }
            case 2: {
                SdkProperties.notifyInitializationComplete();
                break;
            }
            case 3: {
                if(!EnvironmentCheck.isEnvironmentOk()) {
                    DeviceLog.error("Error during Unity Services environment check, halting Unity Services init");
                    SdkProperties.notifyInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
                    InitializeEventsMetricSender.getInstance().sendMetric(InitMetric.newInitEnvironmentNotOk());
                    return false;
                }
                DeviceLog.info("Unity Services environment check OK");
                InitializeEventsMetricSender.getInstance().sendMetric(InitMetric.newInitEnvironmentOk());
                this.checkForGameIdAndTestModeChanges.invoke(true);
                this.setInitializationState.invoke(InitializationState.INITIALIZING, true);
                return true;
            }
            case 4: {
                SdkProperties.notifyInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
                return false;
            }
            default: {
                throw new J();
            }
        }
        return false;
    }
}

