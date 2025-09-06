package com.unity3d.ads.core.domain;

import A3.o;
import A3.p;
import A3.s;
import android.app.Activity;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.EmbeddableAdPlayer;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout;
import com.unity3d.ads.core.data.model.ShowEvent.Clicked;
import com.unity3d.ads.core.data.model.ShowEvent.Completed;
import com.unity3d.ads.core.data.model.ShowEvent.Error;
import com.unity3d.ads.core.data.model.ShowEvent.LeftApplication;
import com.unity3d.ads.core.data.model.ShowEvent.Started;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.FlowExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType;
import gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType;
import java.util.Map;
import java.util.UUID;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.time.r;
import kotlin.time.s.b.a;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import org.json.JSONObject;
import y4.l;
import y4.m;

@s0({"SMAP\nLegacyShowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyShowUseCase.kt\ncom/unity3d/ads/core/domain/LegacyShowUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OperativeEventErrorDataKt.kt\ngatewayprotocol/v1/OperativeEventErrorDataKtKt\n*L\n1#1,325:1\n1#2:326\n1#2:328\n10#3:327\n*S KotlinDebug\n*F\n+ 1 LegacyShowUseCase.kt\ncom/unity3d/ads/core/domain/LegacyShowUseCase\n*L\n195#1:328\n195#1:327\n*E\n"})
public final class LegacyShowUseCase {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String KEY_OBJECT_ID = "objectId";
    @l
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    @l
    public static final String MESSAGE_ALREADY_SHOWING = "Can\'t show a new ad unit when ad unit is already open";
    @l
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    @l
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    @l
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    @l
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    @l
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    @m
    private AdObject adObject;
    @l
    private final AdRepository adRepository;
    @l
    private final K dispatcher;
    @l
    private final GetInitializationState getInitializationState;
    @l
    private final GetOperativeEventApi getOperativeEventApi;
    @l
    private final E hasStarted;
    private static volatile boolean isFullscreenAdShowing;
    @m
    private String placement;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final Show show;
    @l
    private final E timeoutCancellationRequested;
    @m
    private UnityAdsShowOptions unityAdsShowOptions;

    static {
        LegacyShowUseCase.Companion = new Companion(null);
    }

    public LegacyShowUseCase(@l K k0, @l Show show0, @l AdRepository adRepository0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l GetOperativeEventApi getOperativeEventApi0, @l GetInitializationState getInitializationState0, @l SessionRepository sessionRepository0) {
        L.p(k0, "dispatcher");
        L.p(show0, "show");
        L.p(adRepository0, "adRepository");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(getOperativeEventApi0, "getOperativeEventApi");
        L.p(getInitializationState0, "getInitializationState");
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.dispatcher = k0;
        this.show = show0;
        this.adRepository = adRepository0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.getOperativeEventApi = getOperativeEventApi0;
        this.getInitializationState = getInitializationState0;
        this.sessionRepository = sessionRepository0;
        this.hasStarted = W.a(Boolean.FALSE);
        this.timeoutCancellationRequested = W.a(Boolean.FALSE);
    }

    private final void bannerLeftApplication(r r0, String s, Listeners listeners0) {
        DeviceLog.debug(("Unity Ads Show Left Application for placement " + s));
        Double double0 = TimeExtensionsKt.elapsedMillis(r0);
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", double0, null, null, this.adObject, 12, null);
        listeners0.onLeftApplication(s);
    }

    private final void cancelTimeout(r r0) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        Double double0 = TimeExtensionsKt.elapsedMillis(r0);
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", double0, null, null, this.adObject, 12, null);
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions0) {
        String s;
        JSONObject jSONObject0 = unityAdsShowOptions0.getData();
        if(jSONObject0 == null) {
            s = null;
        }
        else {
            Object object0 = jSONObject0.opt("objectId");
            s = object0 == null ? null : object0.toString();
        }
        try {
            return UUID.fromString(s).toString();
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private final Map getTags(String s, Integer integer0, String s1) {
        Map map0 = Y.j0(new V[]{r0.a("operation", OperationType.SHOW.toString()), r0.a("reason", s), r0.a("show_has_started", String.valueOf(((Boolean)this.hasStarted.getValue()).booleanValue()))});
        if(integer0 != null) {
            String s2 = (String)map0.put("reason_code", String.valueOf(integer0.intValue()));
        }
        if(s1 != null) {
            map0.put("reason_debug", s1);
        }
        return map0;
    }

    private final Object getTmpAdObject(d d0) {
        ByteString byteString1;
        LegacyShowUseCase legacyShowUseCase0;
        ByteString byteString0;
        com.unity3d.ads.core.domain.LegacyShowUseCase.getTmpAdObject.1 legacyShowUseCase$getTmpAdObject$10;
        if(d0 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase.getTmpAdObject.1) {
            legacyShowUseCase$getTmpAdObject$10 = (com.unity3d.ads.core.domain.LegacyShowUseCase.getTmpAdObject.1)d0;
            int v = legacyShowUseCase$getTmpAdObject$10.label;
            if((v & 0x80000000) == 0) {
                legacyShowUseCase$getTmpAdObject$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.getTmpAdObject(this);
                    }
                };
            }
            else {
                legacyShowUseCase$getTmpAdObject$10.label = v ^ 0x80000000;
            }
        }
        else {
            legacyShowUseCase$getTmpAdObject$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.getTmpAdObject(this);
                }
            };
        }
        Object object0 = legacyShowUseCase$getTmpAdObject$10.result;
        Object object1 = b.l();
        switch(legacyShowUseCase$getTmpAdObject$10.label) {
            case 0: {
                f0.n(object0);
                String s = this.unityAdsShowOptions == null ? null : this.getOpportunityId(this.unityAdsShowOptions);
                if(s == null) {
                    byteString0 = ByteString.EMPTY;
                }
                else {
                    UUID uUID0 = UUID.fromString(s);
                    L.o(uUID0, "fromString(opportunityId)");
                    byteString0 = ProtobufExtensionsKt.toByteString(uUID0);
                }
                L.o(byteString0, "opportunityIdByteString");
                legacyShowUseCase$getTmpAdObject$10.L$0 = this;
                legacyShowUseCase$getTmpAdObject$10.label = 1;
                object0 = this.adRepository.getAd(byteString0, legacyShowUseCase$getTmpAdObject$10);
                if(object0 == object1) {
                    return object1;
                }
                legacyShowUseCase0 = this;
                break;
            }
            case 1: {
                legacyShowUseCase0 = (LegacyShowUseCase)legacyShowUseCase$getTmpAdObject$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((AdObject)object0) != null) {
            return (AdObject)object0;
        }
        String s1 = legacyShowUseCase0.getOpportunityId((legacyShowUseCase0.unityAdsShowOptions == null ? new UnityAdsShowOptions() : legacyShowUseCase0.unityAdsShowOptions));
        if(s1 == null) {
            byteString1 = ByteString.EMPTY;
        }
        else {
            byteString1 = ByteStringsKt.toByteStringUtf8(s1);
            if(byteString1 == null) {
                byteString1 = ByteString.EMPTY;
            }
        }
        L.o(byteString1, "getOpportunityId(showOpt…tf8() ?: ByteString.EMPTY");
        String s2 = legacyShowUseCase0.placement == null ? "" : legacyShowUseCase0.placement;
        L.o(ByteString.EMPTY, "EMPTY");
        UnityAdsLoadOptions unityAdsLoadOptions0 = new UnityAdsLoadOptions();
        return new AdObject(byteString1, s2, ByteString.EMPTY, false, null, null, null, false, null, null, null, unityAdsLoadOptions0, false, DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, 0x5F8, null);
    }

    @m
    public final Object invoke(@l Activity activity0, @m String s, @m UnityAdsShowOptions unityAdsShowOptions0, @l Listeners listeners0, @l d d0) {
        int v6;
        UnityAdsShowOptions unityAdsShowOptions2;
        Activity activity2;
        String s6;
        long v3;
        Listeners listeners2;
        s s5;
        String s4;
        String s1;
        long v1;
        Activity activity1;
        LegacyShowUseCase legacyShowUseCase0;
        Listeners listeners1;
        com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.1 legacyShowUseCase$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.1) {
            legacyShowUseCase$invoke$10 = (com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.1)d0;
            int v = legacyShowUseCase$invoke$10.label;
            if((v & 0x80000000) == 0) {
                legacyShowUseCase$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int I$0;
                    long J$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, null, null, this);
                    }
                };
            }
            else {
                legacyShowUseCase$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            legacyShowUseCase$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int I$0;
                long J$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                Object L$6;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, null, null, this);
                }
            };
        }
        Object object0 = legacyShowUseCase$invoke$10.result;
        Object object1 = b.l();
        switch(legacyShowUseCase$invoke$10.label) {
            case 0: {
                f0.n(object0);
                this.placement = s;
                this.unityAdsShowOptions = unityAdsShowOptions0;
                DeviceLog.debug(("Unity Ads Show Start for placement " + s));
                legacyShowUseCase$invoke$10.L$0 = this;
                legacyShowUseCase$invoke$10.L$1 = activity0;
                legacyShowUseCase$invoke$10.L$2 = s;
                legacyShowUseCase$invoke$10.L$3 = unityAdsShowOptions0;
                listeners1 = listeners0;
                legacyShowUseCase$invoke$10.L$4 = listeners1;
                legacyShowUseCase$invoke$10.J$0 = 2299700L;
                legacyShowUseCase$invoke$10.label = 1;
                if(this.showStart(legacyShowUseCase$invoke$10) == object1) {
                    return object1;
                }
                legacyShowUseCase0 = this;
                activity1 = activity0;
                v1 = 2299700L;
                s1 = s;
                goto label_56;
            }
            case 1: {
                long v2 = legacyShowUseCase$invoke$10.J$0;
                listeners1 = (Listeners)legacyShowUseCase$invoke$10.L$4;
                UnityAdsShowOptions unityAdsShowOptions1 = (UnityAdsShowOptions)legacyShowUseCase$invoke$10.L$3;
                s1 = (String)legacyShowUseCase$invoke$10.L$2;
                activity1 = (Activity)legacyShowUseCase$invoke$10.L$1;
                LegacyShowUseCase legacyShowUseCase1 = (LegacyShowUseCase)legacyShowUseCase$invoke$10.L$0;
                f0.n(object0);
                legacyShowUseCase0 = legacyShowUseCase1;
                v1 = v2;
                unityAdsShowOptions0 = unityAdsShowOptions1;
            label_56:
                s s2 = legacyShowUseCase0.showError(a.d(v1), (s1 == null ? "" : s1), listeners1);
                if(s1 == null) {
                    legacyShowUseCase$invoke$10.L$0 = null;
                    legacyShowUseCase$invoke$10.L$1 = null;
                    legacyShowUseCase$invoke$10.L$2 = null;
                    legacyShowUseCase$invoke$10.L$3 = null;
                    legacyShowUseCase$invoke$10.L$4 = null;
                    legacyShowUseCase$invoke$10.label = 2;
                    return s2.invoke("placement_null", UnityAdsShowError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", null, null, legacyShowUseCase$invoke$10) == object1 ? object1 : S0.a;
                }
                if(com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(legacyShowUseCase0.getInitializationState, false, 1, null) != InitializationState.INITIALIZED) {
                    legacyShowUseCase$invoke$10.L$0 = null;
                    legacyShowUseCase$invoke$10.L$1 = null;
                    legacyShowUseCase$invoke$10.L$2 = null;
                    legacyShowUseCase$invoke$10.L$3 = null;
                    legacyShowUseCase$invoke$10.L$4 = null;
                    legacyShowUseCase$invoke$10.label = 3;
                    return s2.invoke("not_initialized", UnityAdsShowError.NOT_INITIALIZED, "[UnityAds] SDK not initialized", null, null, legacyShowUseCase$invoke$10) == object1 ? object1 : S0.a;
                }
                String s3 = unityAdsShowOptions0 == null ? null : legacyShowUseCase0.getOpportunityId(unityAdsShowOptions0);
                if(s3 == null) {
                    if(unityAdsShowOptions0 == null) {
                        s4 = null;
                    }
                    else {
                        JSONObject jSONObject0 = unityAdsShowOptions0.getData();
                        if(jSONObject0 == null) {
                            s4 = null;
                        }
                        else {
                            Object object2 = jSONObject0.opt("objectId");
                            s4 = object2 == null ? null : object2.toString();
                        }
                    }
                    legacyShowUseCase$invoke$10.L$0 = null;
                    legacyShowUseCase$invoke$10.L$1 = null;
                    legacyShowUseCase$invoke$10.L$2 = null;
                    legacyShowUseCase$invoke$10.L$3 = null;
                    legacyShowUseCase$invoke$10.L$4 = null;
                    legacyShowUseCase$invoke$10.label = 4;
                    return s2.invoke("no_opportunity_id", UnityAdsShowError.INVALID_ARGUMENT, "No valid opportunity id provided", null, s4, legacyShowUseCase$invoke$10) == object1 ? object1 : S0.a;
                }
                UUID uUID0 = UUID.fromString(s3);
                L.o(uUID0, "fromString(opportunityId)");
                ByteString byteString0 = ProtobufExtensionsKt.toByteString(uUID0);
                legacyShowUseCase$invoke$10.L$0 = legacyShowUseCase0;
                legacyShowUseCase$invoke$10.L$1 = activity1;
                legacyShowUseCase$invoke$10.L$2 = s1;
                legacyShowUseCase$invoke$10.L$3 = unityAdsShowOptions0;
                legacyShowUseCase$invoke$10.L$4 = listeners1;
                legacyShowUseCase$invoke$10.L$5 = s2;
                legacyShowUseCase$invoke$10.L$6 = s3;
                legacyShowUseCase$invoke$10.J$0 = v1;
                legacyShowUseCase$invoke$10.label = 5;
                Object object3 = legacyShowUseCase0.adRepository.getAd(byteString0, legacyShowUseCase$invoke$10);
                if(object3 == object1) {
                    return object1;
                }
                s5 = s2;
                listeners2 = listeners1;
                v3 = v1;
                s6 = s3;
                object0 = object3;
                activity2 = activity1;
                unityAdsShowOptions2 = unityAdsShowOptions0;
                goto label_135;
            }
            case 2: {
                f0.n(object0);
                return S0.a;
            }
            case 3: {
                f0.n(object0);
                return S0.a;
            }
            case 4: {
                f0.n(object0);
                return S0.a;
            }
            case 5: {
                long v4 = legacyShowUseCase$invoke$10.J$0;
                s6 = (String)legacyShowUseCase$invoke$10.L$6;
                s5 = (s)legacyShowUseCase$invoke$10.L$5;
                Listeners listeners3 = (Listeners)legacyShowUseCase$invoke$10.L$4;
                unityAdsShowOptions2 = (UnityAdsShowOptions)legacyShowUseCase$invoke$10.L$3;
                String s7 = (String)legacyShowUseCase$invoke$10.L$2;
                activity2 = (Activity)legacyShowUseCase$invoke$10.L$1;
                legacyShowUseCase0 = (LegacyShowUseCase)legacyShowUseCase$invoke$10.L$0;
                f0.n(object0);
                v3 = v4;
                listeners2 = listeners3;
                s1 = s7;
            label_135:
                legacyShowUseCase0.adObject = (AdObject)object0;
                if(((AdObject)object0) == null) {
                    legacyShowUseCase$invoke$10.L$0 = null;
                    legacyShowUseCase$invoke$10.L$1 = null;
                    legacyShowUseCase$invoke$10.L$2 = null;
                    legacyShowUseCase$invoke$10.L$3 = null;
                    legacyShowUseCase$invoke$10.L$4 = null;
                    legacyShowUseCase$invoke$10.L$5 = null;
                    legacyShowUseCase$invoke$10.L$6 = null;
                    legacyShowUseCase$invoke$10.label = 6;
                    return s5.invoke("ad_object_not_found", UnityAdsShowError.INTERNAL_ERROR, "No ad object found for opportunity id: " + s6, null, null, legacyShowUseCase$invoke$10) == object1 ? object1 : S0.a;
                }
                AdPlayer adPlayer0 = ((AdObject)object0).getAdPlayer();
                if(adPlayer0 != null) {
                    O o0 = adPlayer0.getScope();
                    if(o0 != null && !P.k(o0)) {
                        legacyShowUseCase$invoke$10.L$0 = null;
                        legacyShowUseCase$invoke$10.L$1 = null;
                        legacyShowUseCase$invoke$10.L$2 = null;
                        legacyShowUseCase$invoke$10.L$3 = null;
                        legacyShowUseCase$invoke$10.L$4 = null;
                        legacyShowUseCase$invoke$10.L$5 = null;
                        legacyShowUseCase$invoke$10.L$6 = null;
                        legacyShowUseCase$invoke$10.label = 7;
                        return s5.invoke("ad_player_scope_not_active", UnityAdsShowError.INTERNAL_ERROR, "Ad player is unavailable.", null, null, legacyShowUseCase$invoke$10) == object1 ? object1 : S0.a;
                    }
                }
                AdPlayer adPlayer1 = ((AdObject)object0).getAdPlayer();
                if(!(adPlayer1 instanceof EmbeddableAdPlayer) && LegacyShowUseCase.isFullscreenAdShowing) {
                    legacyShowUseCase$invoke$10.L$0 = null;
                    legacyShowUseCase$invoke$10.L$1 = null;
                    legacyShowUseCase$invoke$10.L$2 = null;
                    legacyShowUseCase$invoke$10.L$3 = null;
                    legacyShowUseCase$invoke$10.L$4 = null;
                    legacyShowUseCase$invoke$10.L$5 = null;
                    legacyShowUseCase$invoke$10.L$6 = null;
                    legacyShowUseCase$invoke$10.label = 8;
                    return s5.invoke("already_showing", UnityAdsShowError.ALREADY_SHOWING, "Can\'t show a new ad unit when ad unit is already open", null, null, legacyShowUseCase$invoke$10) == object1 ? object1 : S0.a;
                }
                if(legacyShowUseCase0.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation() && !L.g(((AdObject)object0).getPlacementId(), s1)) {
                    legacyShowUseCase$invoke$10.L$0 = null;
                    legacyShowUseCase$invoke$10.L$1 = null;
                    legacyShowUseCase$invoke$10.L$2 = null;
                    legacyShowUseCase$invoke$10.L$3 = null;
                    legacyShowUseCase$invoke$10.L$4 = null;
                    legacyShowUseCase$invoke$10.L$5 = null;
                    legacyShowUseCase$invoke$10.L$6 = null;
                    legacyShowUseCase$invoke$10.label = 9;
                    return s5.invoke("placement_validation", UnityAdsShowError.INVALID_ARGUMENT, "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad", null, null, legacyShowUseCase$invoke$10) == object1 ? object1 : S0.a;
                }
                long v5 = (long)legacyShowUseCase0.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                if(!(adPlayer1 instanceof EmbeddableAdPlayer)) {
                    LegacyShowUseCase.isFullscreenAdShowing = true;
                }
                i i0 = k.u(FlowExtensionsKt.timeoutAfter$default(legacyShowUseCase0.show.invoke(activity2, ((AdObject)object0), unityAdsShowOptions2), v5, false, new o(adPlayer1 instanceof EmbeddableAdPlayer, ((AdObject)object0), true, s5, s1, null) {
                    final AdObject $adObject;
                    final boolean $isBanner;
                    final String $placement;
                    final s $reportShowError;
                    final boolean $useTimeout;
                    Object L$0;
                    int label;

                    {
                        LegacyShowUseCase.this = legacyShowUseCase0;
                        this.$isBanner = z;
                        this.$adObject = adObject0;
                        this.$useTimeout = z1;
                        this.$reportShowError = s0;
                        this.$placement = s1;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.2(LegacyShowUseCase.this, this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @m
                    public final Object invoke(@l A3.a a0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.2)this.create(a0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((A3.a)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        A3.a a0;
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                a0 = (A3.a)this.L$0;
                                if(((Boolean)LegacyShowUseCase.this.hasStarted.getValue()).booleanValue() || ((Boolean)LegacyShowUseCase.this.timeoutCancellationRequested.getValue()).booleanValue() || this.$isBanner) {
                                    return S0.a;
                                }
                                this.L$0 = a0;
                                this.label = 1;
                                if(LegacyShowUseCase.this.sendOperativeError(OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT, "timeout", this.$adObject, this) == object1) {
                                    return object1;
                                }
                                goto label_13;
                            }
                            case 1: {
                                a0 = (A3.a)this.L$0;
                                f0.n(object0);
                            label_13:
                                if(this.$useTimeout) {
                                    this.L$0 = a0;
                                    this.label = 2;
                                    if(LegacyShowUseCase.this.show.terminate(this.$adObject, this) == object1) {
                                        return object1;
                                    }
                                    goto label_20;
                                }
                                break;
                            }
                            case 2: {
                                a0 = (A3.a)this.L$0;
                                f0.n(object0);
                            label_20:
                                this.L$0 = a0;
                                this.label = 3;
                                if(this.$reportShowError.invoke("timeout", UnityAdsShowError.TIMEOUT, "[UnityAds] Timeout while trying to show " + this.$placement, null, null, this) == object1) {
                                    return object1;
                                }
                                a0.invoke();
                                return S0.a;
                            }
                            case 3: {
                                A3.a a1 = (A3.a)this.L$0;
                                f0.n(object0);
                                a1.invoke();
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        return S0.a;
                    }
                }, 2, null), new p(adPlayer1 instanceof EmbeddableAdPlayer, null) {
                    final boolean $isBanner;
                    final s $reportShowError;
                    Object L$0;
                    int label;

                    {
                        this.$reportShowError = s0;
                        this.$isBanner = z;
                        super(3, d0);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.invoke(((j)object0), ((Throwable)object1), ((d)object2));
                    }

                    @m
                    public final Object invoke(@l j j0, @l Throwable throwable0, @m d d0) {
                        com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.3 legacyShowUseCase$invoke$30 = new com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.3(this.$reportShowError, this.$isBanner, d0);
                        legacyShowUseCase$invoke$30.L$0 = throwable0;
                        return legacyShowUseCase$invoke$30.invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                String s = ExceptionExtensionsKt.getShortenedStackTrace$default(((Throwable)this.L$0), 0, 1, null);
                                this.label = 1;
                                if(this.$reportShowError.invoke("uncaught_exception", UnityAdsShowError.INTERNAL_ERROR, "Internal error", null, s, this) == object1) {
                                    return object1;
                                }
                                break;
                            }
                            case 1: {
                                f0.n(object0);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(!this.$isBanner) {
                            LegacyShowUseCase.isFullscreenAdShowing = false;
                        }
                        return S0.a;
                    }
                });
                com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.4 legacyShowUseCase$invoke$40 = new j() {
                    @m
                    public final Object emit(@l ShowEvent showEvent0, @l d d0) {
                        com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.4 legacyShowUseCase$invoke$40;
                        com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.4.emit.1 legacyShowUseCase$invoke$4$emit$10;
                        if(d0 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.4.emit.1) {
                            legacyShowUseCase$invoke$4$emit$10 = (com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.4.emit.1)d0;
                            int v = legacyShowUseCase$invoke$4$emit$10.label;
                            if((v & 0x80000000) == 0) {
                                legacyShowUseCase$invoke$4$emit$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    Object L$1;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return d0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                legacyShowUseCase$invoke$4$emit$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            legacyShowUseCase$invoke$4$emit$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    this.result = object0;
                                    this.label |= 0x80000000;
                                    return d0.emit(null, this);
                                }
                            };
                        }
                        Object object0 = legacyShowUseCase$invoke$4$emit$10.result;
                        Object object1 = b.l();
                        switch(legacyShowUseCase$invoke$4$emit$10.label) {
                            case 0: {
                                f0.n(object0);
                                if(showEvent0 instanceof Started) {
                                    a s$b$a0 = a.d(s1);
                                    legacyShowUseCase$invoke$4$emit$10.label = 1;
                                    return v3.showStarted(s$b$a0, listeners2, ((AdObject)object0), legacyShowUseCase$invoke$4$emit$10) == object1 ? object1 : S0.a;
                                }
                                if(showEvent0 instanceof Clicked) {
                                    a s$b$a1 = a.d(s1);
                                    legacyShowUseCase$invoke$4$emit$10.label = 2;
                                    return v3.showClicked(s$b$a1, listeners2, ((AdObject)object0), legacyShowUseCase$invoke$4$emit$10) == object1 ? object1 : S0.a;
                                }
                                if(showEvent0 instanceof Completed) {
                                    a s$b$a2 = a.d(s1);
                                    ShowStatus showStatus0 = ((Completed)showEvent0).getStatus();
                                    legacyShowUseCase$invoke$4$emit$10.label = 3;
                                    return v3.showCompleted(s$b$a2, listeners2, showStatus0, ((AdObject)object0), legacyShowUseCase$invoke$4$emit$10) == object1 ? object1 : S0.a;
                                }
                                if(showEvent0 instanceof Error) {
                                    legacyShowUseCase$invoke$4$emit$10.L$0 = this;
                                    legacyShowUseCase$invoke$4$emit$10.L$1 = showEvent0;
                                    legacyShowUseCase$invoke$4$emit$10.label = 4;
                                    if(v3.sendOperativeError(OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED, ((Error)showEvent0).getMessage(), s5, legacyShowUseCase$invoke$4$emit$10) == object1) {
                                        return object1;
                                    }
                                    legacyShowUseCase$invoke$40 = this;
                                label_52:
                                    String s = ((Error)showEvent0).getReason();
                                    Integer integer0 = kotlin.coroutines.jvm.internal.b.f(((Error)showEvent0).getErrorCode());
                                    legacyShowUseCase$invoke$4$emit$10.L$0 = null;
                                    legacyShowUseCase$invoke$4$emit$10.L$1 = null;
                                    legacyShowUseCase$invoke$4$emit$10.label = 5;
                                    return legacyShowUseCase$invoke$40.$reportShowError.invoke(s, UnityAdsShowError.INTERNAL_ERROR, ((Error)showEvent0).getMessage(), integer0, ((Error)showEvent0).getMessage(), legacyShowUseCase$invoke$4$emit$10) == object1 ? object1 : S0.a;
                                }
                                if(showEvent0 instanceof CancelTimeout) {
                                    a s$b$a3 = a.d(s1);
                                    v3.cancelTimeout(s$b$a3);
                                    return S0.a;
                                }
                                if(showEvent0 instanceof LeftApplication) {
                                    a s$b$a4 = a.d(s1);
                                    v3.bannerLeftApplication(s$b$a4, listeners2, ((AdObject)object0));
                                }
                                return S0.a;
                            }
                            case 1: {
                                f0.n(object0);
                                return S0.a;
                            }
                            case 2: {
                                f0.n(object0);
                                return S0.a;
                            }
                            case 3: {
                                f0.n(object0);
                                return S0.a;
                            }
                            case 4: {
                                showEvent0 = (ShowEvent)legacyShowUseCase$invoke$4$emit$10.L$1;
                                legacyShowUseCase$invoke$40 = (com.unity3d.ads.core.domain.LegacyShowUseCase.invoke.4)legacyShowUseCase$invoke$4$emit$10.L$0;
                                f0.n(object0);
                                goto label_52;
                            }
                            case 5: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    public Object emit(Object object0, d d0) {
                        return this.emit(((ShowEvent)object0), d0);
                    }
                };
                legacyShowUseCase$invoke$10.L$0 = null;
                legacyShowUseCase$invoke$10.L$1 = null;
                legacyShowUseCase$invoke$10.L$2 = null;
                legacyShowUseCase$invoke$10.L$3 = null;
                legacyShowUseCase$invoke$10.L$4 = null;
                legacyShowUseCase$invoke$10.L$5 = null;
                legacyShowUseCase$invoke$10.L$6 = null;
                legacyShowUseCase$invoke$10.I$0 = adPlayer1 instanceof EmbeddableAdPlayer;
                legacyShowUseCase$invoke$10.label = 10;
                if(i0.collect(legacyShowUseCase$invoke$40, legacyShowUseCase$invoke$10) == object1) {
                    return object1;
                }
                v6 = adPlayer1 instanceof EmbeddableAdPlayer;
                break;
            }
            case 6: {
                f0.n(object0);
                return S0.a;
            }
            case 7: {
                f0.n(object0);
                return S0.a;
            }
            case 8: {
                f0.n(object0);
                return S0.a;
            }
            case 9: {
                f0.n(object0);
                return S0.a;
            }
            case 10: {
                v6 = legacyShowUseCase$invoke$10.I$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(v6 == 0) {
            LegacyShowUseCase.isFullscreenAdShowing = false;
        }
        return S0.a;
    }

    private final Object sendOperativeError(OperativeEventErrorType operativeEventRequestOuterClass$OperativeEventErrorType0, String s, AdObject adObject0, d d0) {
        Builder operativeEventRequestOuterClass$OperativeEventErrorData$Builder0 = OperativeEventErrorData.newBuilder();
        L.o(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0, "newBuilder()");
        Dsl operativeEventErrorDataKt$Dsl0 = Dsl.Companion._create(operativeEventRequestOuterClass$OperativeEventErrorData$Builder0);
        operativeEventErrorDataKt$Dsl0.setErrorType(operativeEventRequestOuterClass$OperativeEventErrorType0);
        operativeEventErrorDataKt$Dsl0.setMessage(s);
        ByteString byteString0 = operativeEventErrorDataKt$Dsl0._build().toByteString();
        L.o(byteString0, "errorData.toByteString()");
        Object object0 = this.getOperativeEventApi.invoke(OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR, adObject0, byteString0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final Object showClicked(r r0, String s, Listeners listeners0, d d0) {
        DeviceLog.debug(("Unity Ads Show Clicked for placement " + s));
        Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(r0));
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", double0, null, null, this.adObject, 12, null);
        com.unity3d.ads.core.domain.LegacyShowUseCase.showClicked.2 legacyShowUseCase$showClicked$20 = new o(s, null) {
            final Listeners $listeners;
            final String $placement;
            int label;

            {
                this.$listeners = listeners0;
                this.$placement = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.LegacyShowUseCase.showClicked.2(this.$listeners, this.$placement, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.LegacyShowUseCase.showClicked.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.$listeners.onClick(this.$placement);
                return S0.a;
            }
        };
        Object object0 = kotlinx.coroutines.i.h(this.dispatcher, legacyShowUseCase$showClicked$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final Object showCompleted(r r0, String s, ShowStatus showStatus0, Listeners listeners0, d d0) {
        DeviceLog.debug(("Unity Ads Show Completed for placement " + s));
        Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(r0));
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", double0, null, null, this.adObject, 12, null);
        com.unity3d.ads.core.domain.LegacyShowUseCase.showCompleted.2 legacyShowUseCase$showCompleted$20 = new o(s, showStatus0, null) {
            final Listeners $listeners;
            final String $placement;
            final ShowStatus $status;
            int label;

            {
                this.$listeners = listeners0;
                this.$placement = s;
                this.$status = showStatus0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.LegacyShowUseCase.showCompleted.2(this.$listeners, this.$placement, this.$status, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.LegacyShowUseCase.showCompleted.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0 = ShowStatusExtensionsKt.toUnityAdsShowCompletionState(this.$status);
                this.$listeners.onComplete(this.$placement, unityAds$UnityAdsShowCompletionState0);
                return S0.a;
            }
        };
        Object object0 = kotlinx.coroutines.i.h(this.dispatcher, legacyShowUseCase$showCompleted$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final s showError(r r0, String s, Listeners listeners0) {
        return new s(this, r0, listeners0, null) {
            final Listeners $listeners;
            final String $placement;
            final r $startTime;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;

            {
                this.$placement = s;
                LegacyShowUseCase.this = legacyShowUseCase0;
                this.$startTime = r0;
                this.$listeners = listeners0;
                super(6, d0);
            }

            @Override  // A3.s
            public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
                return this.invoke(((String)object0), ((UnityAdsShowError)object1), ((String)object2), ((Integer)object3), ((String)object4), ((d)object5));
            }

            @m
            public final Object invoke(@l String s, @l UnityAdsShowError unityAds$UnityAdsShowError0, @l String s1, @m Integer integer0, @m String s2, @m d d0) {
                com.unity3d.ads.core.domain.LegacyShowUseCase.showError.1 legacyShowUseCase$showError$10 = new com.unity3d.ads.core.domain.LegacyShowUseCase.showError.1(this.$placement, LegacyShowUseCase.this, this.$startTime, this.$listeners, d0);
                legacyShowUseCase$showError$10.L$0 = s;
                legacyShowUseCase$showError$10.L$1 = unityAds$UnityAdsShowError0;
                legacyShowUseCase$showError$10.L$2 = s1;
                legacyShowUseCase$showError$10.L$3 = integer0;
                legacyShowUseCase$showError$10.L$4 = s2;
                return legacyShowUseCase$showError$10.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        String s = (String)this.L$0;
                        UnityAdsShowError unityAds$UnityAdsShowError0 = (UnityAdsShowError)this.L$1;
                        String s1 = (String)this.L$2;
                        Integer integer0 = (Integer)this.L$3;
                        String s2 = (String)this.L$4;
                        DeviceLog.debug(("Unity Ads Show Failed for placement " + this.$placement));
                        DefaultImpls.invoke$default(LegacyShowUseCase.this.sendDiagnosticEvent, "native_show_failure_time", kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(this.$startTime)), LegacyShowUseCase.this.getTags(s, integer0, s2), null, LegacyShowUseCase.this.adObject, 8, null);
                        com.unity3d.ads.core.domain.LegacyShowUseCase.showError.1.1 legacyShowUseCase$showError$1$10 = new o(this.$placement, unityAds$UnityAdsShowError0, s1, null) {
                            final Listeners $listeners;
                            final String $message;
                            final String $placement;
                            final UnityAdsShowError $reason;
                            int label;

                            {
                                this.$listeners = listeners0;
                                this.$placement = s;
                                this.$reason = unityAds$UnityAdsShowError0;
                                this.$message = s1;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new com.unity3d.ads.core.domain.LegacyShowUseCase.showError.1.1(this.$listeners, this.$placement, this.$reason, this.$message, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((com.unity3d.ads.core.domain.LegacyShowUseCase.showError.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.label != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                this.$listeners.onError(this.$placement, this.$reason, this.$message);
                                return S0.a;
                            }
                        };
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 1;
                        return kotlinx.coroutines.i.h(LegacyShowUseCase.this.dispatcher, legacyShowUseCase$showError$1$10, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        };
    }

    private final Object showStart(d d0) {
        SendDiagnosticEvent sendDiagnosticEvent1;
        String s;
        com.unity3d.ads.core.domain.LegacyShowUseCase.showStart.1 legacyShowUseCase$showStart$10;
        if(d0 instanceof com.unity3d.ads.core.domain.LegacyShowUseCase.showStart.1) {
            legacyShowUseCase$showStart$10 = (com.unity3d.ads.core.domain.LegacyShowUseCase.showStart.1)d0;
            int v = legacyShowUseCase$showStart$10.label;
            if((v & 0x80000000) == 0) {
                legacyShowUseCase$showStart$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.showStart(this);
                    }
                };
            }
            else {
                legacyShowUseCase$showStart$10.label = v ^ 0x80000000;
            }
        }
        else {
            legacyShowUseCase$showStart$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.showStart(this);
                }
            };
        }
        Object object0 = legacyShowUseCase$showStart$10.result;
        Object object1 = b.l();
        switch(legacyShowUseCase$showStart$10.label) {
            case 0: {
                f0.n(object0);
                SendDiagnosticEvent sendDiagnosticEvent0 = this.sendDiagnosticEvent;
                legacyShowUseCase$showStart$10.L$0 = sendDiagnosticEvent0;
                legacyShowUseCase$showStart$10.L$1 = "native_show_started";
                legacyShowUseCase$showStart$10.label = 1;
                Object object2 = this.getTmpAdObject(legacyShowUseCase$showStart$10);
                if(object2 == object1) {
                    return object1;
                }
                s = "native_show_started";
                sendDiagnosticEvent1 = sendDiagnosticEvent0;
                object0 = object2;
                break;
            }
            case 1: {
                s = (String)legacyShowUseCase$showStart$10.L$1;
                sendDiagnosticEvent1 = (SendDiagnosticEvent)legacyShowUseCase$showStart$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        DefaultImpls.invoke$default(sendDiagnosticEvent1, s, null, null, null, ((AdObject)object0), 14, null);
        return S0.a;
    }

    private final Object showStarted(r r0, String s, Listeners listeners0, d d0) {
        DeviceLog.debug(("Unity Ads Show WV Start for placement " + s));
        this.hasStarted.setValue(kotlin.coroutines.jvm.internal.b.a(true));
        Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(r0));
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", double0, null, null, this.adObject, 12, null);
        com.unity3d.ads.core.domain.LegacyShowUseCase.showStarted.2 legacyShowUseCase$showStarted$20 = new o(s, null) {
            final Listeners $listeners;
            final String $placement;
            int label;

            {
                this.$listeners = listeners0;
                this.$placement = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.LegacyShowUseCase.showStarted.2(this.$listeners, this.$placement, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.LegacyShowUseCase.showStarted.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.$listeners.onStart(this.$placement);
                return S0.a;
            }
        };
        Object object0 = kotlinx.coroutines.i.h(this.dispatcher, legacyShowUseCase$showStarted$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

