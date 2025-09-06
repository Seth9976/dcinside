package com.unity3d.ads.adplayer;

import A3.o;
import android.app.Activity;
import android.content.Intent;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange.MuteChange;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange.VolumeChange;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent.Show;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange;
import com.unity3d.ads.core.data.model.SessionChange.UserConsentChange;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent.Completed;
import com.unity3d.ads.core.data.model.ShowEvent.Error;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge.BannerEvent;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.v;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.K;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import org.json.JSONObject;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidFullscreenWebViewAdPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFullscreenWebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,194:1\n20#2:195\n22#2:199\n20#2:200\n22#2:204\n50#3:196\n55#3:198\n50#3:201\n55#3:203\n106#4:197\n106#4:202\n*S KotlinDebug\n*F\n+ 1 AndroidFullscreenWebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer\n*L\n71#1:195\n71#1:199\n80#1:200\n80#1:204\n71#1:196\n71#1:198\n80#1:201\n80#1:203\n71#1:197\n80#1:202\n*E\n"})
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final D getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }

    @l
    public static final Companion Companion;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private static final D displayMessages;
    @l
    private final OfferwallManager offerwallManager;
    @l
    private final OpenMeasurementRepository openMeasurementRepository;
    @l
    private final String opportunityId;
    @l
    private final ScarManager scarManager;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final WebViewAdPlayer webViewAdPlayer;
    @l
    private final AndroidWebViewContainer webViewContainer;

    static {
        AndroidFullscreenWebViewAdPlayer.Companion = new Companion(null);
        AndroidFullscreenWebViewAdPlayer.displayMessages = K.b(0, 0, null, 7, null);
    }

    public AndroidFullscreenWebViewAdPlayer(@l WebViewAdPlayer webViewAdPlayer0, @l String s, @l AndroidWebViewContainer androidWebViewContainer0, @l DeviceInfoRepository deviceInfoRepository0, @l SessionRepository sessionRepository0, @l OpenMeasurementRepository openMeasurementRepository0, @l ScarManager scarManager0, @l OfferwallManager offerwallManager0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(webViewAdPlayer0, "webViewAdPlayer");
        L.p(s, "opportunityId");
        L.p(androidWebViewContainer0, "webViewContainer");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(sessionRepository0, "sessionRepository");
        L.p(openMeasurementRepository0, "openMeasurementRepository");
        L.p(scarManager0, "scarManager");
        L.p(offerwallManager0, "offerwallManager");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.webViewAdPlayer = webViewAdPlayer0;
        this.opportunityId = s;
        this.webViewContainer = androidWebViewContainer0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.sessionRepository = sessionRepository0;
        this.openMeasurementRepository = openMeasurementRepository0;
        this.scarManager = scarManager0;
        this.offerwallManager = offerwallManager0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object destroy(@l d d0) {
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer0;
        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy.1 androidFullscreenWebViewAdPlayer$destroy$10;
        if(d0 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy.1) {
            androidFullscreenWebViewAdPlayer$destroy$10 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy.1)d0;
            int v = androidFullscreenWebViewAdPlayer$destroy$10.label;
            if((v & 0x80000000) == 0) {
                androidFullscreenWebViewAdPlayer$destroy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.destroy(this);
                    }
                };
            }
            else {
                androidFullscreenWebViewAdPlayer$destroy$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidFullscreenWebViewAdPlayer$destroy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.destroy(this);
                }
            };
        }
        Object object0 = androidFullscreenWebViewAdPlayer$destroy$10.result;
        Object object1 = b.l();
        switch(androidFullscreenWebViewAdPlayer$destroy$10.label) {
            case 0: {
                f0.n(object0);
                DisplayFinishRequest displayMessage$DisplayFinishRequest0 = new DisplayFinishRequest(this.opportunityId);
                androidFullscreenWebViewAdPlayer$destroy$10.L$0 = this;
                androidFullscreenWebViewAdPlayer$destroy$10.label = 1;
                if(AndroidFullscreenWebViewAdPlayer.displayMessages.emit(displayMessage$DisplayFinishRequest0, androidFullscreenWebViewAdPlayer$destroy$10) == object1) {
                    return object1;
                }
                androidFullscreenWebViewAdPlayer0 = this;
            label_31:
                ByteString byteString0 = ByteStringsKt.toByteStringUtf8(androidFullscreenWebViewAdPlayer0.opportunityId);
                if(androidFullscreenWebViewAdPlayer0.openMeasurementRepository.hasSessionFinished(byteString0)) {
                    androidFullscreenWebViewAdPlayer$destroy$10.L$0 = androidFullscreenWebViewAdPlayer0;
                    androidFullscreenWebViewAdPlayer$destroy$10.label = 2;
                    if(a0.b(1000L, androidFullscreenWebViewAdPlayer$destroy$10) == object1) {
                        return object1;
                    }
                }
            label_37:
                androidFullscreenWebViewAdPlayer$destroy$10.L$0 = androidFullscreenWebViewAdPlayer0;
                androidFullscreenWebViewAdPlayer$destroy$10.label = 3;
                if(androidFullscreenWebViewAdPlayer0.getWebViewContainer().destroy(androidFullscreenWebViewAdPlayer$destroy$10) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                androidFullscreenWebViewAdPlayer0 = (AndroidFullscreenWebViewAdPlayer)androidFullscreenWebViewAdPlayer$destroy$10.L$0;
                f0.n(object0);
                goto label_31;
            }
            case 2: {
                androidFullscreenWebViewAdPlayer0 = (AndroidFullscreenWebViewAdPlayer)androidFullscreenWebViewAdPlayer$destroy$10.L$0;
                f0.n(object0);
                goto label_37;
            }
            case 3: {
                androidFullscreenWebViewAdPlayer0 = (AndroidFullscreenWebViewAdPlayer)androidFullscreenWebViewAdPlayer$destroy$10.L$0;
                f0.n(object0);
                break;
            }
            case 4: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        androidFullscreenWebViewAdPlayer$destroy$10.L$0 = null;
        androidFullscreenWebViewAdPlayer$destroy$10.label = 4;
        return DefaultImpls.destroy(androidFullscreenWebViewAdPlayer0, androidFullscreenWebViewAdPlayer$destroy$10) == object1 ? object1 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    private final I0 displayEventsRouter(DisplayMessage displayMessage0) {
        return k.f(this.getScope(), null, null, new o(displayMessage0, null) {
            final DisplayMessage $displayMessage;
            int label;

            {
                AndroidFullscreenWebViewAdPlayer.this = androidFullscreenWebViewAdPlayer0;
                this.$displayMessage = displayMessage0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayEventsRouter.1(AndroidFullscreenWebViewAdPlayer.this, this.$displayMessage, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayEventsRouter.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFullscreenWebViewAdPlayer.this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen_activity_event", null, Y.k(r0.a("eventType", m0.d(this.$displayMessage.getClass()).u())), null, null, 26, null);
                        DisplayMessage displayMessage0 = this.$displayMessage;
                        if(displayMessage0 instanceof DisplayReady) {
                            Map map0 = ((DisplayReady)this.$displayMessage).getShowOptions();
                            this.label = 1;
                            if(AndroidFullscreenWebViewAdPlayer.this.webViewAdPlayer.requestShow(map0, this) == object1) {
                                return object1;
                            }
                        }
                        else if(displayMessage0 instanceof WebViewInstanceRequest) {
                            D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                            WebViewInstanceResponse displayMessage$WebViewInstanceResponse0 = new WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), AndroidFullscreenWebViewAdPlayer.this.getWebViewContainer().getWebView());
                            this.label = 2;
                            if(d0.emit(displayMessage$WebViewInstanceResponse0, this) == object1) {
                                return object1;
                            }
                        }
                        else if(displayMessage0 instanceof VisibilityChanged) {
                            boolean z = ((VisibilityChanged)this.$displayMessage).isVisible();
                            this.label = 3;
                            if(AndroidFullscreenWebViewAdPlayer.this.webViewAdPlayer.sendVisibilityChange(z, this) == object1) {
                                return object1;
                            }
                        }
                        else if(displayMessage0 instanceof FocusChanged) {
                            boolean z1 = ((FocusChanged)this.$displayMessage).isFocused();
                            this.label = 4;
                            if(AndroidFullscreenWebViewAdPlayer.this.webViewAdPlayer.sendFocusChange(z1, this) == object1) {
                                return object1;
                            }
                        }
                        else if(displayMessage0 instanceof DisplayDestroyed) {
                            this.label = 5;
                            if(AndroidFullscreenWebViewAdPlayer.this.webViewAdPlayer.sendActivityDestroyed(this) == object1) {
                                return object1;
                            }
                        }
                        else if(displayMessage0 instanceof DisplayError) {
                            this.label = 6;
                            if(AndroidFullscreenWebViewAdPlayer.this.destroy(this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 3, null);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public O getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getUpdateCampaignState() {
        return this.webViewAdPlayer.getUpdateCampaignState();
    }

    @l
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.getWebViewContainer();
    }

    private final Object handleSessionChange(SessionChange sessionChange0, d d0) {
        if(sessionChange0 instanceof UserConsentChange) {
            byte[] arr_b = ((UserConsentChange)sessionChange0).getValue().toByteArray();
            L.o(arr_b, "change.value.toByteArray()");
            Object object0 = this.webViewAdPlayer.sendUserConsentChange(arr_b, d0);
            return object0 == b.l() ? object0 : S0.a;
        }
        if(sessionChange0 instanceof PrivacyFsmChange) {
            byte[] arr_b1 = ((PrivacyFsmChange)sessionChange0).getValue().toByteArray();
            L.o(arr_b1, "change.value.toByteArray()");
            Object object1 = this.webViewAdPlayer.sendPrivacyFsmChange(arr_b1, d0);
            return object1 == b.l() ? object1 : S0.a;
        }
        return S0.a;
    }

    private final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange0, d d0) {
        if(volumeSettingsChange0 instanceof MuteChange) {
            boolean z = ((MuteChange)volumeSettingsChange0).isMuted();
            Object object0 = this.webViewAdPlayer.sendMuteChange(z, d0);
            return object0 == b.l() ? object0 : S0.a;
        }
        if(volumeSettingsChange0 instanceof VolumeChange) {
            double f = ((VolumeChange)volumeSettingsChange0).getVolume();
            Object object1 = this.webViewAdPlayer.sendVolumeChange(f, d0);
            return object1 == b.l() ? object1 : S0.a;
        }
        return S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object onAllowedPiiChange(@l byte[] arr_b, @l d d0) {
        return this.webViewAdPlayer.onAllowedPiiChange(arr_b, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object onBroadcastEvent(@l String s, @l d d0) {
        return this.webViewAdPlayer.onBroadcastEvent(s, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object requestShow(@m Map map0, @l d d0) {
        return this.webViewAdPlayer.requestShow(map0, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendActivityDestroyed(@l d d0) {
        return this.webViewAdPlayer.sendActivityDestroyed(d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendFocusChange(boolean z, @l d d0) {
        return this.webViewAdPlayer.sendFocusChange(z, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendGmaEvent(@l c c0, @l d d0) {
        return this.webViewAdPlayer.sendGmaEvent(c0, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendMuteChange(boolean z, @l d d0) {
        return this.webViewAdPlayer.sendMuteChange(z, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendOfferwallEvent(@l OfferwallEvent offerwallEvent0, @l d d0) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent0, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendPrivacyFsmChange(@l byte[] arr_b, @l d d0) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(arr_b, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendScarBannerEvent(@l BannerEvent bannerBridge$BannerEvent0, @l d d0) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerBridge$BannerEvent0, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendUserConsentChange(@l byte[] arr_b, @l d d0) {
        return this.webViewAdPlayer.sendUserConsentChange(arr_b, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendVisibilityChange(boolean z, @l d d0) {
        return this.webViewAdPlayer.sendVisibilityChange(z, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendVolumeChange(double f, @l d d0) {
        return this.webViewAdPlayer.sendVolumeChange(f, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    public void show(@l ShowOptions showOptions0) {
        L.p(showOptions0, "showOptions");
        if(!(showOptions0 instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Activity activity0 = (Activity)((AndroidShowOptions)showOptions0).getActivity().get();
        if(activity0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String s = "";
        boolean z = ((AndroidShowOptions)showOptions0).isScarAd();
        boolean z1 = ((AndroidShowOptions)showOptions0).isOfferwallAd();
        kotlinx.coroutines.flow.k.U0(kotlinx.coroutines.flow.k.e1(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show..inlined.filter.1.2 androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show..inlined.filter.1.2.1 androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show..inlined.filter.1.2.1) {
                            androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show..inlined.filter.1.2.1)d0;
                            int v = androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10.result;
                        Object object2 = b.l();
                        switch(androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = AndroidFullscreenWebViewAdPlayer.this;
                                if(L.g(((DisplayMessage)object0).getOpportunityId(), AndroidFullscreenWebViewAdPlayer.this.opportunityId)) {
                                    androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10.label = 1;
                                    if(j0.emit(object0, androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return S0.a;
                            }
                            case 1: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.collect(androidFullscreenWebViewAdPlayer$show$$inlined$filter$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }, new a() {
            {
                super(2, object0, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
            }

            @m
            public final Object invoke(@l DisplayMessage displayMessage0, @l d d0) {
                return AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter(((AndroidFullscreenWebViewAdPlayer)this.receiver), displayMessage0, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((DisplayMessage)object0), ((d)object1));
            }
        }), this.getScope());
        kotlinx.coroutines.flow.k.U0(kotlinx.coroutines.flow.k.e1(this.deviceInfoRepository.getVolumeSettingsChange(), new H() {
            {
                super(2, object0, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @m
            public final Object invoke(@l VolumeSettingsChange volumeSettingsChange0, @l d d0) {
                return ((AndroidFullscreenWebViewAdPlayer)this.receiver).handleVolumeSettingsChange(volumeSettingsChange0, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((VolumeSettingsChange)object0), ((d)object1));
            }
        }), this.getScope());
        kotlinx.coroutines.flow.k.U0(kotlinx.coroutines.flow.k.e1(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show..inlined.filter.2.2 androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show..inlined.filter.2.2.1 androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show..inlined.filter.2.2.1) {
                            androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show..inlined.filter.2.2.1)d0;
                            int v = androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10.label;
                            if((v & 0x80000000) == 0) {
                                androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10.result;
                        Object object2 = b.l();
                        switch(androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(((ShowEvent)object0) instanceof Completed || ((ShowEvent)object0) instanceof Error) {
                                    androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10.label = 1;
                                    if(j0.emit(object0, androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return S0.a;
                            }
                            case 1: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(androidFullscreenWebViewAdPlayer$show$$inlined$filter$2$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }, new o(null) {
            int label;

            {
                AndroidFullscreenWebViewAdPlayer.this = androidFullscreenWebViewAdPlayer0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.5(AndroidFullscreenWebViewAdPlayer.this, d0);
            }

            @m
            public final Object invoke(@l ShowEvent showEvent0, @m d d0) {
                return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.5)this.create(showEvent0, d0)).invokeSuspend(S0.a);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((ShowEvent)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        return AndroidFullscreenWebViewAdPlayer.this.destroy(this) == object1 ? object1 : S0.a;
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
        }), this.getScope());
        kotlinx.coroutines.flow.k.U0(kotlinx.coroutines.flow.k.e1(this.sessionRepository.getOnChange(), new H() {
            {
                super(2, object0, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @m
            public final Object invoke(@l SessionChange sessionChange0, @l d d0) {
                return ((AndroidFullscreenWebViewAdPlayer)this.receiver).handleSessionChange(sessionChange0, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((SessionChange)object0), ((d)object1));
            }
        }), this.getScope());
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, null, 30, null);
        if(!z && !z1) {
            Intent intent0 = new Intent(activity0, FullScreenWebViewDisplay.class);
            intent0.putExtra("opportunityId", this.opportunityId);
            Map map0 = ((AndroidShowOptions)showOptions0).getUnityAdsShowOptions();
            if(map0 != null) {
                intent0.putExtra("showOptions", new JSONObject(map0).toString());
            }
            intent0.addFlags(0x10010000);
            intent0.putExtra("orientation", activity0.getRequestedOrientation());
            activity0.startActivity(intent0);
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen_intent", null, null, null, null, 30, null);
            return;
        }
        if(z) {
            ScarManager scarManager0 = this.scarManager;
            String s1 = ((AndroidShowOptions)showOptions0).getPlacementId();
            if(s1 == null) {
                s1 = "";
            }
            String s2 = ((AndroidShowOptions)showOptions0).getScarQueryId();
            if(s2 != null) {
                s = s2;
            }
            k.f(this.getScope(), null, null, new o(kotlinx.coroutines.flow.k.F1(scarManager0.show(s1, s), this.getScope(), kotlinx.coroutines.flow.O.a.c(), 10), showOptions0, null) {
                final I $scarEvents;
                final ShowOptions $showOptions;
                int label;

                {
                    AndroidFullscreenWebViewAdPlayer.this = androidFullscreenWebViewAdPlayer0;
                    this.$scarEvents = i0;
                    this.$showOptions = showOptions0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7(AndroidFullscreenWebViewAdPlayer.this, this.$scarEvents, this.$showOptions, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            i i0 = kotlinx.coroutines.flow.k.l1(AndroidFullscreenWebViewAdPlayer.this.getOnScarEvent(), new o(this.$showOptions, null) {
                                final ShowOptions $showOptions;
                                int label;

                                {
                                    AndroidFullscreenWebViewAdPlayer.this = androidFullscreenWebViewAdPlayer0;
                                    this.$showOptions = showOptions0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.1(AndroidFullscreenWebViewAdPlayer.this, this.$showOptions, d0);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((j)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l j j0, @m d d0) {
                                    return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.1)this.create(j0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    Object object1 = b.l();
                                    switch(this.label) {
                                        case 0: {
                                            f0.n(object0);
                                            D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                                            Map map0 = ((AndroidShowOptions)this.$showOptions).getUnityAdsShowOptions();
                                            DisplayReady displayMessage$DisplayReady0 = new DisplayReady(AndroidFullscreenWebViewAdPlayer.this.opportunityId, map0);
                                            this.label = 1;
                                            return d0.emit(displayMessage$DisplayReady0, this) == object1 ? object1 : S0.a;
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
                            });
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.2 androidFullscreenWebViewAdPlayer$show$7$20 = new o() {
                                Object L$0;
                                int label;

                                {
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    d d1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.2(d0);
                                    d1.L$0 = object0;
                                    return d1;
                                }

                                @m
                                public final Object invoke(@l ScarEvent scarEvent0, @m d d0) {
                                    return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.2)this.create(scarEvent0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((ScarEvent)object0), ((d)object1));
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    if(this.label != 0) {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                    f0.n(object0);
                                    return kotlin.coroutines.jvm.internal.b.a(L.g(((ScarEvent)this.L$0), Show.INSTANCE));
                                }
                            };
                            this.label = 1;
                            if(kotlinx.coroutines.flow.k.u0(i0, androidFullscreenWebViewAdPlayer$show$7$20, this) == object1) {
                                return object1;
                            }
                            break;
                        }
                        case 1: {
                            f0.n(object0);
                            break;
                        }
                        case 2: {
                            f0.n(object0);
                            return S0.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.invokeSuspend..inlined.mapNotNull.1 androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$10 = new i() {
                        @Override  // kotlinx.coroutines.flow.i
                        @m
                        public Object collect(@l j j0, @l d d0) {
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.invokeSuspend..inlined.mapNotNull.1.2 androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$20 = new j() {
                                @Override  // kotlinx.coroutines.flow.j
                                @m
                                public final Object emit(Object object0, @l d d0) {
                                    com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.invokeSuspend..inlined.mapNotNull.1.2.1 androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10;
                                    if(d0 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.invokeSuspend..inlined.mapNotNull.1.2.1) {
                                        androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.invokeSuspend..inlined.mapNotNull.1.2.1)d0;
                                        int v = androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10.label;
                                        if((v & 0x80000000) == 0) {
                                            androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                Object L$0;
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
                                            androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10.label = v ^ 0x80000000;
                                        }
                                    }
                                    else {
                                        androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                            Object L$0;
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
                                    Object object1 = androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10.result;
                                    Object object2 = b.l();
                                    switch(androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10.label) {
                                        case 0: {
                                            f0.n(object1);
                                            j j0 = this.$this_unsafeFlow;
                                            c c0 = ((GmaEventData)object0).getGmaEvent();
                                            if(c0 != null) {
                                                androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10.label = 1;
                                                if(j0.emit(c0, androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$10) == object2) {
                                                    return object2;
                                                }
                                            }
                                            return S0.a;
                                        }
                                        case 1: {
                                            f0.n(object1);
                                            return S0.a;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                }
                            };
                            Object object0 = this.$this_unsafeTransform$inlined.collect(androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$20, d0);
                            return object0 == b.l() ? object0 : S0.a;
                        }
                    };
                    com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.7.4 androidFullscreenWebViewAdPlayer$show$7$40 = new Object() {
                        @m
                        public final Object emit(@l c c0, @l d d0) {
                            Object object0 = this.$tmp0.sendGmaEvent(c0, d0);
                            return object0 == b.l() ? object0 : S0.a;
                        }

                        @Override  // kotlinx.coroutines.flow.j
                        public Object emit(Object object0, d d0) {
                            return this.emit(((c)object0), d0);
                        }

                        // 去混淆评级： 低(20)
                        @Override
                        public final boolean equals(@m Object object0) {
                            return !(object0 instanceof j) || !(object0 instanceof kotlin.jvm.internal.D) ? false : L.g(this.getFunctionDelegate(), ((kotlin.jvm.internal.D)object0).getFunctionDelegate());
                        }

                        @Override  // kotlin.jvm.internal.D
                        @l
                        public final v getFunctionDelegate() {
                            return new H(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        }

                        @Override
                        public final int hashCode() {
                            return this.getFunctionDelegate().hashCode();
                        }
                    };
                    this.label = 2;
                    return androidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$10.collect(androidFullscreenWebViewAdPlayer$show$7$40, this) == object1 ? object1 : S0.a;
                }
            }, 3, null);
            return;
        }
        OfferwallManager offerwallManager0 = this.offerwallManager;
        String s3 = ((AndroidShowOptions)showOptions0).getOfferwallPlacementName();
        if(s3 != null) {
            s = s3;
        }
        k.f(this.getScope(), null, null, new o(kotlinx.coroutines.flow.k.F1(offerwallManager0.showAd(s), this.getScope(), kotlinx.coroutines.flow.O.a.c(), 5), showOptions0, null) {
            final I $offerwallevents;
            final ShowOptions $showOptions;
            int label;

            {
                AndroidFullscreenWebViewAdPlayer.this = androidFullscreenWebViewAdPlayer0;
                this.$offerwallevents = i0;
                this.$showOptions = showOptions0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8(AndroidFullscreenWebViewAdPlayer.this, this.$offerwallevents, this.$showOptions, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        i i0 = kotlinx.coroutines.flow.k.l1(AndroidFullscreenWebViewAdPlayer.this.getOnOfferwallEvent(), new o(this.$showOptions, null) {
                            final ShowOptions $showOptions;
                            int label;

                            {
                                AndroidFullscreenWebViewAdPlayer.this = androidFullscreenWebViewAdPlayer0;
                                this.$showOptions = showOptions0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.1(AndroidFullscreenWebViewAdPlayer.this, this.$showOptions, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((j)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l j j0, @m d d0) {
                                return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.1)this.create(j0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.label) {
                                    case 0: {
                                        f0.n(object0);
                                        D d0 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                                        Map map0 = ((AndroidShowOptions)this.$showOptions).getUnityAdsShowOptions();
                                        DisplayReady displayMessage$DisplayReady0 = new DisplayReady(AndroidFullscreenWebViewAdPlayer.this.opportunityId, map0);
                                        this.label = 1;
                                        return d0.emit(displayMessage$DisplayReady0, this) == object1 ? object1 : S0.a;
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
                        });
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.2 androidFullscreenWebViewAdPlayer$show$8$20 = new o() {
                            Object L$0;
                            int label;

                            {
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.2(d0);
                                d1.L$0 = object0;
                                return d1;
                            }

                            @m
                            public final Object invoke(@l OfferwallShowEvent offerwallShowEvent0, @m d d0) {
                                return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.2)this.create(offerwallShowEvent0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((OfferwallShowEvent)object0), ((d)object1));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.label != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                return kotlin.coroutines.jvm.internal.b.a(L.g(((OfferwallShowEvent)this.L$0), com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE));
                            }
                        };
                        this.label = 1;
                        if(kotlinx.coroutines.flow.k.u0(i0, androidFullscreenWebViewAdPlayer$show$8$20, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.invokeSuspend..inlined.mapNotNull.1 androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$10 = new i() {
                    @Override  // kotlinx.coroutines.flow.i
                    @m
                    public Object collect(@l j j0, @l d d0) {
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.invokeSuspend..inlined.mapNotNull.1.2 androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$20 = new j() {
                            @Override  // kotlinx.coroutines.flow.j
                            @m
                            public final Object emit(Object object0, @l d d0) {
                                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.invokeSuspend..inlined.mapNotNull.1.2.1 androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10;
                                if(d0 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.invokeSuspend..inlined.mapNotNull.1.2.1) {
                                    androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.invokeSuspend..inlined.mapNotNull.1.2.1)d0;
                                    int v = androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10.label;
                                    if((v & 0x80000000) == 0) {
                                        androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                            Object L$0;
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
                                        androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10.label = v ^ 0x80000000;
                                    }
                                }
                                else {
                                    androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                        Object L$0;
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
                                Object object1 = androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10.result;
                                Object object2 = b.l();
                                switch(androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10.label) {
                                    case 0: {
                                        f0.n(object1);
                                        j j0 = this.$this_unsafeFlow;
                                        OfferwallEvent offerwallEvent0 = ((OfferwallEventData)object0).getOfferwallEvent();
                                        if(offerwallEvent0 != null) {
                                            androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10.label = 1;
                                            if(j0.emit(offerwallEvent0, androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$2$10) == object2) {
                                                return object2;
                                            }
                                        }
                                        return S0.a;
                                    }
                                    case 1: {
                                        f0.n(object1);
                                        return S0.a;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        };
                        Object object0 = this.$this_unsafeTransform$inlined.collect(androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$1$20, d0);
                        return object0 == b.l() ? object0 : S0.a;
                    }
                };
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8.4 androidFullscreenWebViewAdPlayer$show$8$40 = new Object() {
                    @m
                    public final Object emit(@l OfferwallEvent offerwallEvent0, @l d d0) {
                        Object object0 = this.$tmp0.sendOfferwallEvent(offerwallEvent0, d0);
                        return object0 == b.l() ? object0 : S0.a;
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    public Object emit(Object object0, d d0) {
                        return this.emit(((OfferwallEvent)object0), d0);
                    }

                    // 去混淆评级： 低(20)
                    @Override
                    public final boolean equals(@m Object object0) {
                        return !(object0 instanceof j) || !(object0 instanceof kotlin.jvm.internal.D) ? false : L.g(this.getFunctionDelegate(), ((kotlin.jvm.internal.D)object0).getFunctionDelegate());
                    }

                    @Override  // kotlin.jvm.internal.D
                    @l
                    public final v getFunctionDelegate() {
                        return new H(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    }

                    @Override
                    public final int hashCode() {
                        return this.getFunctionDelegate().hashCode();
                    }
                };
                this.label = 2;
                return androidFullscreenWebViewAdPlayer$show$8$invokeSuspend$$inlined$mapNotNull$10.collect(androidFullscreenWebViewAdPlayer$show$8$40, this) == object1 ? object1 : S0.a;
            }
        }, 3, null);
    }

    private static final Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer0, DisplayMessage displayMessage0, d d0) {
        androidFullscreenWebViewAdPlayer0.displayEventsRouter(displayMessage0);
        return S0.a;
    }
}

