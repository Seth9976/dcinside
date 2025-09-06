package com.unity3d.ads.adplayer;

import A3.o;
import android.app.Activity;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.ScarEvent.Show;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge.BannerEvent;
import com.unity3d.services.core.misc.ViewUtilities;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidEmbeddableWebViewAdPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidEmbeddableWebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/AndroidEmbeddableWebViewAdPlayer\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,126:1\n96#2,2:127\n120#2,13:129\n99#2,10:142\n96#2,2:152\n120#2,13:154\n99#2,10:167\n*S KotlinDebug\n*F\n+ 1 AndroidEmbeddableWebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/AndroidEmbeddableWebViewAdPlayer\n*L\n67#1:127,2\n79#1:129,13\n67#1:142,10\n93#1:152,2\n98#1:154,13\n93#1:167,10\n*E\n"})
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    @l
    private final OpenMeasurementRepository openMeasurementRepository;
    @l
    private final String opportunityId;
    @l
    private final ScarManager scarManager;
    @l
    private final WebViewAdPlayer webViewAdPlayer;
    @l
    private final AndroidWebViewContainer webViewContainer;

    public AndroidEmbeddableWebViewAdPlayer(@l WebViewAdPlayer webViewAdPlayer0, @l String s, @l AndroidWebViewContainer androidWebViewContainer0, @l OpenMeasurementRepository openMeasurementRepository0, @l ScarManager scarManager0) {
        L.p(webViewAdPlayer0, "webViewAdPlayer");
        L.p(s, "opportunityId");
        L.p(androidWebViewContainer0, "webViewContainer");
        L.p(openMeasurementRepository0, "openMeasurementRepository");
        L.p(scarManager0, "scarManager");
        super();
        this.webViewAdPlayer = webViewAdPlayer0;
        this.opportunityId = s;
        this.webViewContainer = androidWebViewContainer0;
        this.openMeasurementRepository = openMeasurementRepository0;
        this.scarManager = scarManager0;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object destroy(@l d d0) {
        AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer0;
        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy.1 androidEmbeddableWebViewAdPlayer$destroy$10;
        if(d0 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy.1) {
            androidEmbeddableWebViewAdPlayer$destroy$10 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy.1)d0;
            int v = androidEmbeddableWebViewAdPlayer$destroy$10.label;
            if((v & 0x80000000) == 0) {
                androidEmbeddableWebViewAdPlayer$destroy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                androidEmbeddableWebViewAdPlayer$destroy$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidEmbeddableWebViewAdPlayer$destroy$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = androidEmbeddableWebViewAdPlayer$destroy$10.result;
        Object object1 = b.l();
        switch(androidEmbeddableWebViewAdPlayer$destroy$10.label) {
            case 0: {
                f0.n(object0);
                this.webViewAdPlayer.dispatchShowCompleted();
                ByteString byteString0 = ByteStringsKt.toByteStringUtf8(this.opportunityId);
                if(this.openMeasurementRepository.hasSessionFinished(byteString0)) {
                    androidEmbeddableWebViewAdPlayer$destroy$10.L$0 = this;
                    androidEmbeddableWebViewAdPlayer$destroy$10.label = 1;
                    if(a0.b(1000L, androidEmbeddableWebViewAdPlayer$destroy$10) == object1) {
                        return object1;
                    }
                }
                androidEmbeddableWebViewAdPlayer0 = this;
                goto label_27;
            }
            case 1: {
                androidEmbeddableWebViewAdPlayer0 = (AndroidEmbeddableWebViewAdPlayer)androidEmbeddableWebViewAdPlayer$destroy$10.L$0;
                f0.n(object0);
            label_27:
                androidEmbeddableWebViewAdPlayer$destroy$10.L$0 = androidEmbeddableWebViewAdPlayer0;
                androidEmbeddableWebViewAdPlayer$destroy$10.label = 2;
                if(androidEmbeddableWebViewAdPlayer0.getWebViewContainer().destroy(androidEmbeddableWebViewAdPlayer$destroy$10) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                androidEmbeddableWebViewAdPlayer0 = (AndroidEmbeddableWebViewAdPlayer)androidEmbeddableWebViewAdPlayer$destroy$10.L$0;
                f0.n(object0);
                break;
            }
            case 3: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        androidEmbeddableWebViewAdPlayer$destroy$10.L$0 = null;
        androidEmbeddableWebViewAdPlayer$destroy$10.label = 3;
        return DefaultImpls.destroy(androidEmbeddableWebViewAdPlayer0, androidEmbeddableWebViewAdPlayer$destroy$10) == object1 ? object1 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
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
        Object object0 = ((AndroidShowOptions)showOptions0).getActivity().get();
        if(((Activity)object0) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BannerViewCache bannerViewCache0 = BannerViewCache.getInstance();
        BannerView bannerView0 = bannerViewCache0.getBannerView(this.opportunityId);
        if(bannerView0 == null) {
            throw new IllegalStateException((bannerViewCache0.isBannerViewDeleted(this.opportunityId) ? "BannerView has been deleted" : "BannerView not found").toString());
        }
        if(((AndroidShowOptions)showOptions0).isScarAd()) {
            String s = ((AndroidShowOptions)showOptions0).getPlacementId();
            String s1 = ((AndroidShowOptions)showOptions0).getScarQueryId();
            String s2 = ((AndroidShowOptions)showOptions0).getScarAdUnitId();
            String s3 = ((AndroidShowOptions)showOptions0).getScarAdString();
            P2.d d0 = new P2.d((s == null ? "" : s), (s1 == null ? "" : s1), (s2 == null ? "" : s2), (s3 == null ? "" : s3), 0);
            UnityBannerSize unityBannerSize0 = bannerView0.getSize();
            L.o(unityBannerSize0, "bannerView.size");
            I i0 = k.F1(this.scarManager.loadBannerAd(((Activity)object0), bannerView0, d0, unityBannerSize0, this.opportunityId), this.getScope(), kotlinx.coroutines.flow.O.a.c(), 10);
            if(ViewCompat.T0(bannerView0)) {
                kotlinx.coroutines.k.f(this.getScope(), null, null, new o(i0, showOptions0, null) {
                    final I $scarEvents;
                    final ShowOptions $showOptions;
                    int label;

                    {
                        AndroidEmbeddableWebViewAdPlayer.this = androidEmbeddableWebViewAdPlayer0;
                        this.$scarEvents = i0;
                        this.$showOptions = showOptions0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1(AndroidEmbeddableWebViewAdPlayer.this, this.$scarEvents, this.$showOptions, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                i i0 = k.l1(AndroidEmbeddableWebViewAdPlayer.this.getOnScarEvent(), new o(this.$showOptions, null) {
                                    final ShowOptions $showOptions;
                                    int label;

                                    {
                                        AndroidEmbeddableWebViewAdPlayer.this = androidEmbeddableWebViewAdPlayer0;
                                        this.$showOptions = showOptions0;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.1(AndroidEmbeddableWebViewAdPlayer.this, this.$showOptions, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((j)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l j j0, @m d d0) {
                                        return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.1)this.create(j0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.label) {
                                            case 0: {
                                                f0.n(object0);
                                                Map map0 = ((AndroidShowOptions)this.$showOptions).getUnityAdsShowOptions();
                                                this.label = 1;
                                                return AndroidEmbeddableWebViewAdPlayer.this.webViewAdPlayer.requestShow(map0, this) == object1 ? object1 : S0.a;
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
                                com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.2 androidEmbeddableWebViewAdPlayer$show$1$1$20 = new o() {
                                    Object L$0;
                                    int label;

                                    {
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        d d1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.2(d0);
                                        d1.L$0 = object0;
                                        return d1;
                                    }

                                    @m
                                    public final Object invoke(@l ScarEvent scarEvent0, @m d d0) {
                                        return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.2)this.create(scarEvent0, d0)).invokeSuspend(S0.a);
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
                                if(k.u0(i0, androidEmbeddableWebViewAdPlayer$show$1$1$20, this) == object1) {
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
                        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.invokeSuspend..inlined.mapNotNull.1 androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$10 = new i() {
                            @Override  // kotlinx.coroutines.flow.i
                            @m
                            public Object collect(@l j j0, @l d d0) {
                                com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.invokeSuspend..inlined.mapNotNull.1.2 androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$20 = new j() {
                                    @Override  // kotlinx.coroutines.flow.j
                                    @m
                                    public final Object emit(Object object0, @l d d0) {
                                        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.invokeSuspend..inlined.mapNotNull.1.2.1 androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10;
                                        if(d0 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.invokeSuspend..inlined.mapNotNull.1.2.1) {
                                            androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.invokeSuspend..inlined.mapNotNull.1.2.1)d0;
                                            int v = androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10.label;
                                            if((v & 0x80000000) == 0) {
                                                androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                                androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10.label = v ^ 0x80000000;
                                            }
                                        }
                                        else {
                                            androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                        Object object1 = androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10.result;
                                        Object object2 = b.l();
                                        switch(androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10.label) {
                                            case 0: {
                                                f0.n(object1);
                                                j j0 = this.$this_unsafeFlow;
                                                BannerEvent bannerBridge$BannerEvent0 = ((GmaEventData)object0).getBannerEvent();
                                                if(bannerBridge$BannerEvent0 != null) {
                                                    androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10.label = 1;
                                                    if(j0.emit(bannerBridge$BannerEvent0, androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$2$10) == object2) {
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
                                Object object0 = this.$this_unsafeTransform$inlined.collect(androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1$20, d0);
                                return object0 == b.l() ? object0 : S0.a;
                            }
                        };
                        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1.4 androidEmbeddableWebViewAdPlayer$show$1$1$40 = new Object() {
                            @m
                            public final Object emit(@l BannerEvent bannerBridge$BannerEvent0, @l d d0) {
                                Object object0 = this.$tmp0.sendScarBannerEvent(bannerBridge$BannerEvent0, d0);
                                return object0 == b.l() ? object0 : S0.a;
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            public Object emit(Object object0, d d0) {
                                return this.emit(((BannerEvent)object0), d0);
                            }

                            // 去混淆评级： 低(20)
                            @Override
                            public final boolean equals(@m Object object0) {
                                return !(object0 instanceof j) || !(object0 instanceof D) ? false : L.g(this.getFunctionDelegate(), ((D)object0).getFunctionDelegate());
                            }

                            @Override  // kotlin.jvm.internal.D
                            @l
                            public final v getFunctionDelegate() {
                                return new H(2, this.$tmp0, WebViewAdPlayer.class, "sendScarBannerEvent", "sendScarBannerEvent(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                            }

                            @Override
                            public final int hashCode() {
                                return this.getFunctionDelegate().hashCode();
                            }
                        };
                        this.label = 2;
                        return androidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$10.collect(androidEmbeddableWebViewAdPlayer$show$1$1$40, this) == object1 ? object1 : S0.a;
                    }
                }, 3, null);
                if(!ViewCompat.T0(bannerView0)) {
                    kotlinx.coroutines.k.f(this.webViewAdPlayer.getScope(), null, null, new o(null) {
                        int label;

                        {
                            AndroidEmbeddableWebViewAdPlayer.this = androidEmbeddableWebViewAdPlayer0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.2.1(AndroidEmbeddableWebViewAdPlayer.this, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.label) {
                                case 0: {
                                    f0.n(object0);
                                    this.label = 1;
                                    return AndroidEmbeddableWebViewAdPlayer.this.destroy(this) == object1 ? object1 : S0.a;
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
                    }, 3, null);
                    return;
                }
                bannerView0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    @Override  // android.view.View$OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@l View view0) {
                        L.p(view0, "view");
                    }

                    @Override  // android.view.View$OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@l View view0) {
                        L.p(view0, "view");
                        this.removeOnAttachStateChangeListener(this);
                        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.2.1 androidEmbeddableWebViewAdPlayer$show$1$2$10 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.2.1(AndroidEmbeddableWebViewAdPlayer.this, null);
                        kotlinx.coroutines.k.f(AndroidEmbeddableWebViewAdPlayer.this.webViewAdPlayer.getScope(), null, null, androidEmbeddableWebViewAdPlayer$show$1$2$10, 3, null);
                    }
                });
                return;
            }
            bannerView0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@l View view0) {
                    L.p(view0, "view");
                    this.removeOnAttachStateChangeListener(this);
                    kotlinx.coroutines.k.f(bannerView0.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.1(bannerView0, showOptions0, this.$showOptions$inlined, null), 3, null);
                    BannerView bannerView0 = i0;
                    if(!ViewCompat.T0(bannerView0)) {
                        kotlinx.coroutines.k.f(bannerView0.webViewAdPlayer.getScope(), null, null, new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.1.2.1(bannerView0, null), 3, null);
                        return;
                    }
                    bannerView0.addOnAttachStateChangeListener(new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.lambda.2..inlined.doOnDetach.1(bannerView0, bannerView0));
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@l View view0) {
                    L.p(view0, "view");
                }
            });
            return;
        }
        kotlinx.coroutines.k.f(P.b(), null, null, new o(((Activity)object0), bannerView0, null) {
            final BannerView $bannerView;
            final Activity $context;
            int label;

            {
                AndroidEmbeddableWebViewAdPlayer.this = androidEmbeddableWebViewAdPlayer0;
                this.$context = activity0;
                this.$bannerView = bannerView0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.2(AndroidEmbeddableWebViewAdPlayer.this, this.$context, this.$bannerView, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(((int)ViewUtilities.pxFromDp(this.$context, ((float)this.$bannerView.getSize().getWidth()))), ((int)ViewUtilities.pxFromDp(this.$context, ((float)this.$bannerView.getSize().getHeight()))));
                AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView().setLayoutParams(viewGroup$LayoutParams0);
                return S0.a;
            }
        }, 3, null);
        WebView webView0 = this.getWebViewContainer().getWebView();
        if(ViewCompat.T0(webView0)) {
            kotlinx.coroutines.k.f(this.webViewAdPlayer.getScope(), null, null, new o(showOptions0, null) {
                final ShowOptions $showOptions;
                int label;

                {
                    AndroidEmbeddableWebViewAdPlayer.this = androidEmbeddableWebViewAdPlayer0;
                    this.$showOptions = showOptions0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.1(AndroidEmbeddableWebViewAdPlayer.this, this.$showOptions, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.label) {
                        case 0: {
                            f0.n(object0);
                            Map map0 = ((AndroidShowOptions)this.$showOptions).getUnityAdsShowOptions();
                            this.label = 1;
                            return AndroidEmbeddableWebViewAdPlayer.this.webViewAdPlayer.requestShow(map0, this) == object1 ? object1 : S0.a;
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
            }, 3, null);
            if(ViewCompat.T0(webView0)) {
                webView0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    @Override  // android.view.View$OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@l View view0) {
                        L.p(view0, "view");
                    }

                    @Override  // android.view.View$OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@l View view0) {
                        L.p(view0, "view");
                        this.removeOnAttachStateChangeListener(this);
                        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.2.1 androidEmbeddableWebViewAdPlayer$show$3$2$10 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.2.1(AndroidEmbeddableWebViewAdPlayer.this, null);
                        kotlinx.coroutines.k.f(AndroidEmbeddableWebViewAdPlayer.this.webViewAdPlayer.getScope(), null, null, androidEmbeddableWebViewAdPlayer$show$3$2$10, 3, null);
                    }
                });
            }
            else {
                kotlinx.coroutines.k.f(this.webViewAdPlayer.getScope(), null, null, new o(null) {
                    int label;

                    {
                        AndroidEmbeddableWebViewAdPlayer.this = androidEmbeddableWebViewAdPlayer0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.2.1(AndroidEmbeddableWebViewAdPlayer.this, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                this.label = 1;
                                return AndroidEmbeddableWebViewAdPlayer.this.destroy(this) == object1 ? object1 : S0.a;
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
                }, 3, null);
            }
        }
        else {
            webView0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@l View view0) {
                    L.p(view0, "view");
                    this.removeOnAttachStateChangeListener(this);
                    com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.1 androidEmbeddableWebViewAdPlayer$show$3$10 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.1(showOptions0, this.$showOptions$inlined, null);
                    kotlinx.coroutines.k.f(showOptions0.webViewAdPlayer.getScope(), null, null, androidEmbeddableWebViewAdPlayer$show$3$10, 3, null);
                    if(!ViewCompat.T0(view0)) {
                        com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.2.1 androidEmbeddableWebViewAdPlayer$show$3$2$10 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.3.2.1(showOptions0, null);
                        kotlinx.coroutines.k.f(showOptions0.webViewAdPlayer.getScope(), null, null, androidEmbeddableWebViewAdPlayer$show$3$2$10, 3, null);
                        return;
                    }
                    view0.addOnAttachStateChangeListener(new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.lambda.4..inlined.doOnDetach.1(view0, showOptions0));
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@l View view0) {
                    L.p(view0, "view");
                }
            });
        }
        kotlinx.coroutines.k.f(P.b(), null, null, new o(this, null) {
            final BannerView $bannerView;
            int label;

            {
                this.$bannerView = bannerView0;
                AndroidEmbeddableWebViewAdPlayer.this = androidEmbeddableWebViewAdPlayer0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.4(this.$bannerView, AndroidEmbeddableWebViewAdPlayer.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.show.4)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.$bannerView.addView(AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView());
                return S0.a;
            }
        }, 3, null);
    }
}

