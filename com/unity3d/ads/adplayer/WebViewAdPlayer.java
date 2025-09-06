package com.unity3d.ads.adplayer;

import A3.a;
import A3.o;
import A3.p;
import android.util.Base64;
import androidx.annotation.CallSuper;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.OnWebRequestComplete;
import com.unity3d.ads.adplayer.model.OnWebRequestFailed;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.ScarEvent.Show;
import com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout;
import com.unity3d.ads.core.data.model.ShowEvent.Clicked;
import com.unity3d.ads.core.data.model.ShowEvent.Completed;
import com.unity3d.ads.core.data.model.ShowEvent.Error;
import com.unity3d.ads.core.data.model.ShowEvent.LeftApplication;
import com.unity3d.ads.core.data.model.ShowEvent.Started;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge.BannerEvent;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.text.f;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import org.json.JSONObject;
import y4.l;
import y4.m;

@s0({"SMAP\nWebViewAdPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,337:1\n49#2,4:338\n20#3:342\n22#3:346\n47#3:347\n49#3:351\n20#3:352\n22#3:356\n47#3:357\n49#3:361\n20#3:362\n22#3:366\n47#3:367\n49#3:371\n20#3:372\n22#3:376\n47#3:377\n49#3:381\n20#3:382\n22#3:386\n47#3:387\n49#3:391\n20#3:392\n22#3:396\n47#3:397\n49#3:401\n20#3:402\n22#3:406\n47#3:407\n49#3:411\n50#4:343\n55#4:345\n50#4:348\n55#4:350\n50#4:353\n55#4:355\n50#4:358\n55#4:360\n50#4:363\n55#4:365\n50#4:368\n55#4:370\n50#4:373\n55#4:375\n50#4:378\n55#4:380\n50#4:383\n55#4:385\n50#4:388\n55#4:390\n50#4:393\n55#4:395\n50#4:398\n55#4:400\n50#4:403\n55#4:405\n50#4:408\n55#4:410\n106#5:344\n106#5:349\n106#5:354\n106#5:359\n106#5:364\n106#5:369\n106#5:374\n106#5:379\n106#5:384\n106#5:389\n106#5:394\n106#5:399\n106#5:404\n106#5:409\n515#6:412\n500#6,6:413\n*S KotlinDebug\n*F\n+ 1 WebViewAdPlayer.kt\ncom/unity3d/ads/adplayer/WebViewAdPlayer\n*L\n85#1:338,4\n92#1:342\n92#1:346\n93#1:347\n93#1:351\n102#1:352\n102#1:356\n103#1:357\n103#1:361\n112#1:362\n112#1:366\n113#1:367\n113#1:371\n145#1:372\n145#1:376\n146#1:377\n146#1:381\n162#1:382\n162#1:386\n163#1:387\n163#1:391\n173#1:392\n173#1:396\n174#1:397\n174#1:401\n180#1:402\n180#1:406\n181#1:407\n181#1:411\n92#1:343\n92#1:345\n93#1:348\n93#1:350\n102#1:353\n102#1:355\n103#1:358\n103#1:360\n112#1:363\n112#1:365\n113#1:368\n113#1:370\n145#1:373\n145#1:375\n146#1:378\n146#1:380\n162#1:383\n162#1:385\n163#1:388\n163#1:390\n173#1:393\n173#1:395\n174#1:398\n174#1:400\n180#1:403\n180#1:405\n181#1:408\n181#1:410\n92#1:344\n93#1:349\n102#1:354\n103#1:359\n112#1:364\n113#1:369\n145#1:374\n146#1:379\n162#1:384\n163#1:389\n173#1:394\n174#1:399\n180#1:404\n181#1:409\n244#1:412\n244#1:413,6\n*E\n"})
public final class WebViewAdPlayer implements AdPlayer {
    @l
    private final WebViewBridge bridge;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final K dispatcher;
    @l
    private final ExecuteAdViewerRequest executeAdViewerRequest;
    @l
    private final E isCompletedManually;
    @l
    private final i onBroadcastEvents;
    @l
    private final i onLoadEvent;
    @l
    private final i onOfferwallEvent;
    @l
    private final i onRequestEvents;
    @l
    private final i onScarEvent;
    @l
    private final i onShowEvent;
    @l
    private final O scope;
    @l
    private final CoroutineExceptionHandler scopeCancellationHandler;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final Function1 storageEventCallback;
    @l
    private final i updateCampaignState;
    @l
    private final WebViewContainer webViewContainer;

    public WebViewAdPlayer(@l WebViewBridge webViewBridge0, @l DeviceInfoRepository deviceInfoRepository0, @l SessionRepository sessionRepository0, @l ExecuteAdViewerRequest executeAdViewerRequest0, @l K k0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l WebViewContainer webViewContainer0, @l O o0) {
        L.p(webViewBridge0, "bridge");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(sessionRepository0, "sessionRepository");
        L.p(executeAdViewerRequest0, "executeAdViewerRequest");
        L.p(k0, "dispatcher");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(webViewContainer0, "webViewContainer");
        L.p(o0, "adPlayerScope");
        super();
        this.bridge = webViewBridge0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.sessionRepository = sessionRepository0;
        this.executeAdViewerRequest = executeAdViewerRequest0;
        this.dispatcher = k0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.webViewContainer = webViewContainer0;
        E e0 = W.a(Boolean.FALSE);
        this.isCompletedManually = e0;
        com.unity3d.ads.adplayer.WebViewAdPlayer.storageEventCallback.1 webViewAdPlayer$storageEventCallback$10 = new Function1() {
            {
                WebViewAdPlayer.this = webViewAdPlayer0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((StorageEventInfo)object0));
                return S0.a;
            }

            public final void invoke(@l StorageEventInfo storageEventInfo0) {
                L.p(storageEventInfo0, "it");
                com.unity3d.ads.adplayer.WebViewAdPlayer.storageEventCallback.1.1 webViewAdPlayer$storageEventCallback$1$10 = new o(storageEventInfo0, null) {
                    final StorageEventInfo $it;
                    int label;

                    {
                        WebViewAdPlayer.this = webViewAdPlayer0;
                        this.$it = storageEventInfo0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.adplayer.WebViewAdPlayer.storageEventCallback.1.1(WebViewAdPlayer.this, this.$it, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.adplayer.WebViewAdPlayer.storageEventCallback.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                OnStorageEvent onStorageEvent0 = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                                this.label = 1;
                                return WebViewAdPlayer.this.bridge.sendEvent(onStorageEvent0, this) == object1 ? object1 : S0.a;
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
                k.f(WebViewAdPlayer.this.getScope(), null, null, webViewAdPlayer$storageEventCallback$1$10, 3, null);
            }
        };
        this.storageEventCallback = webViewAdPlayer$storageEventCallback$10;
        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.CoroutineExceptionHandler.1 webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$10 = new CoroutineExceptionHandler(this) {
            @Override  // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(@l g g0, @l Throwable throwable0) {
                Function1 function10 = WebViewAdPlayer.this.storageEventCallback;
                Storage.Companion.removeStorageEventCallback(function10);
            }
        };
        this.scopeCancellationHandler = webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$10;
        this.scope = P.m(P.m(P.m(o0, k0), new N("WebViewAdPlayer")), webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$10);
        this.onScarEvent = new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.1.2 webViewAdPlayer$special$$inlined$map$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        Invocation invocation0;
                        j j0;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.1.2.1 webViewAdPlayer$special$$inlined$map$1$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.1.2.1) {
                            webViewAdPlayer$special$$inlined$map$1$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.1.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$map$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$map$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$map$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$map$1$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$map$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j0 = this.$this_unsafeFlow;
                                invocation0 = (Invocation)object0;
                                webViewAdPlayer$special$$inlined$map$1$2$10.L$0 = j0;
                                webViewAdPlayer$special$$inlined$map$1$2$10.L$1 = invocation0;
                                webViewAdPlayer$special$$inlined$map$1$2$10.label = 1;
                                if(Invocation.handle$default(invocation0, null, webViewAdPlayer$special$$inlined$map$1$2$10, 1, null) == object2) {
                                    return object2;
                                }
                                break;
                            }
                            case 1: {
                                invocation0 = (Invocation)webViewAdPlayer$special$$inlined$map$1$2$10.L$1;
                                j0 = (j)webViewAdPlayer$special$$inlined$map$1$2$10.L$0;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(!L.g(invocation0.getLocation(), "com.unity3d.services.ads.api.AdViewer.showScarAd")) {
                            throw new IllegalStateException(("Unexpected location: " + invocation0.getLocation()).toString());
                        }
                        webViewAdPlayer$special$$inlined$map$1$2$10.L$0 = null;
                        webViewAdPlayer$special$$inlined$map$1$2$10.L$1 = null;
                        webViewAdPlayer$special$$inlined$map$1$2$10.label = 2;
                        return j0.emit(Show.INSTANCE, webViewAdPlayer$special$$inlined$map$1$2$10) == object2 ? object2 : S0.a;
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$map$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        };
        this.onOfferwallEvent = new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.2.2 webViewAdPlayer$special$$inlined$map$2$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        Invocation invocation0;
                        j j0;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.2.2.1 webViewAdPlayer$special$$inlined$map$2$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.2.2.1) {
                            webViewAdPlayer$special$$inlined$map$2$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.2.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$map$2$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$map$2$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$map$2$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$map$2$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$map$2$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$map$2$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j0 = this.$this_unsafeFlow;
                                invocation0 = (Invocation)object0;
                                webViewAdPlayer$special$$inlined$map$2$2$10.L$0 = j0;
                                webViewAdPlayer$special$$inlined$map$2$2$10.L$1 = invocation0;
                                webViewAdPlayer$special$$inlined$map$2$2$10.label = 1;
                                if(Invocation.handle$default(invocation0, null, webViewAdPlayer$special$$inlined$map$2$2$10, 1, null) == object2) {
                                    return object2;
                                }
                                break;
                            }
                            case 1: {
                                invocation0 = (Invocation)webViewAdPlayer$special$$inlined$map$2$2$10.L$1;
                                j0 = (j)webViewAdPlayer$special$$inlined$map$2$2$10.L$0;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(!L.g(invocation0.getLocation(), "com.unity3d.services.ads.api.AdViewer.showOfferwallAd")) {
                            throw new IllegalStateException(("Unexpected location: " + invocation0.getLocation()).toString());
                        }
                        webViewAdPlayer$special$$inlined$map$2$2$10.L$0 = null;
                        webViewAdPlayer$special$$inlined$map$2$2$10.L$1 = null;
                        webViewAdPlayer$special$$inlined$map$2$2$10.label = 2;
                        return j0.emit(com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE, webViewAdPlayer$special$$inlined$map$2$2$10) == object2 ? object2 : S0.a;
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$map$2$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        };
        this.onShowEvent = kotlinx.coroutines.flow.k.J0(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.3.2 webViewAdPlayer$special$$inlined$map$3$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        ShowEvent showEvent0;
                        ShowStatus showStatus0;
                        CancelTimeout showEvent$CancelTimeout0;
                        j j0;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.3.2.1 webViewAdPlayer$special$$inlined$map$3$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.3.2.1) {
                            webViewAdPlayer$special$$inlined$map$3$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.3.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$map$3$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$map$3$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$map$3$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$map$3$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$map$3$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$map$3$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j0 = this.$this_unsafeFlow;
                                switch(((Invocation)object0).getLocation()) {
                                    case "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout": {
                                        showEvent$CancelTimeout0 = CancelTimeout.INSTANCE;
                                        break;
                                    }
                                    case "com.unity3d.services.ads.api.AdViewer.clicked": {
                                        showEvent$CancelTimeout0 = Clicked.INSTANCE;
                                        break;
                                    }
                                    case "com.unity3d.services.ads.api.AdViewer.completed": {
                                        Object object3 = kotlin.collections.l.Rb(((Invocation)object0).getParameters());
                                        String s = object3 instanceof String ? ((String)object3) : null;
                                        if(L.g(s, "COMPLETED")) {
                                            showStatus0 = ShowStatus.COMPLETED;
                                        }
                                        else {
                                            showStatus0 = L.g(s, "SKIPPED") ? ShowStatus.SKIPPED : ShowStatus.ERROR;
                                        }
                                        showEvent$CancelTimeout0 = new Completed(showStatus0);
                                        break;
                                    }
                                    case "com.unity3d.services.ads.api.AdViewer.failed": {
                                        Object object4 = kotlin.collections.l.Rb(((Invocation)object0).getParameters());
                                        L.n(object4, "null cannot be cast to non-null type org.json.JSONObject");
                                        int v1 = ((JSONObject)object4).optInt("code");
                                        String s1 = ((JSONObject)object4).optString("message");
                                        L.o(s1, "errorMessage");
                                        showEvent$CancelTimeout0 = new Error(s1, v1, "adviewer");
                                        break;
                                    }
                                    case "com.unity3d.services.ads.api.AdViewer.leftApplication": {
                                        showEvent$CancelTimeout0 = LeftApplication.INSTANCE;
                                        break;
                                    }
                                    case "com.unity3d.services.ads.api.AdViewer.started": {
                                        showEvent$CancelTimeout0 = Started.INSTANCE;
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("Unexpected location: " + ((Invocation)object0).getLocation());
                                    }
                                }
                                webViewAdPlayer$special$$inlined$map$3$2$10.L$0 = j0;
                                webViewAdPlayer$special$$inlined$map$3$2$10.L$1 = showEvent$CancelTimeout0;
                                webViewAdPlayer$special$$inlined$map$3$2$10.label = 1;
                                if(Invocation.handle$default(((Invocation)object0), null, webViewAdPlayer$special$$inlined$map$3$2$10, 1, null) == object2) {
                                    return object2;
                                }
                                showEvent0 = showEvent$CancelTimeout0;
                                break;
                            }
                            case 1: {
                                showEvent0 = (ShowEvent)webViewAdPlayer$special$$inlined$map$3$2$10.L$1;
                                j0 = (j)webViewAdPlayer$special$$inlined$map$3$2$10.L$0;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        webViewAdPlayer$special$$inlined$map$3$2$10.L$0 = null;
                        webViewAdPlayer$special$$inlined$map$3$2$10.L$1 = null;
                        webViewAdPlayer$special$$inlined$map$3$2$10.label = 2;
                        return j0.emit(showEvent0, webViewAdPlayer$special$$inlined$map$3$2$10) == object2 ? object2 : S0.a;
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$map$3$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }, e0, new p() {
            Object L$0;
            boolean Z$0;
            int label;

            {
                super(3, d0);
            }

            @m
            public final Object invoke(@l ShowEvent showEvent0, boolean z, @m d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.onShowEvent.3 webViewAdPlayer$onShowEvent$30 = new com.unity3d.ads.adplayer.WebViewAdPlayer.onShowEvent.3(d0);
                webViewAdPlayer$onShowEvent$30.L$0 = showEvent0;
                webViewAdPlayer$onShowEvent$30.Z$0 = z;
                return webViewAdPlayer$onShowEvent$30.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((ShowEvent)object0), ((Boolean)object1).booleanValue(), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ShowEvent showEvent0 = (ShowEvent)this.L$0;
                return this.Z$0 ? new Completed(ShowStatus.COMPLETED) : showEvent0;
            }
        });
        this.onLoadEvent = kotlinx.coroutines.flow.k.T1(kotlinx.coroutines.flow.k.F1(new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.4.2 webViewAdPlayer$special$$inlined$map$4$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.model.LoadEvent.Error loadEvent$Error0;
                        Invocation invocation0;
                        j j0;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.4.2.1 webViewAdPlayer$special$$inlined$map$4$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.4.2.1) {
                            webViewAdPlayer$special$$inlined$map$4$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.4.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$map$4$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$map$4$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$map$4$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$map$4$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$map$4$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$map$4$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j0 = this.$this_unsafeFlow;
                                invocation0 = (Invocation)object0;
                                webViewAdPlayer$special$$inlined$map$4$2$10.L$0 = j0;
                                webViewAdPlayer$special$$inlined$map$4$2$10.L$1 = invocation0;
                                webViewAdPlayer$special$$inlined$map$4$2$10.label = 1;
                                if(Invocation.handle$default(invocation0, null, webViewAdPlayer$special$$inlined$map$4$2$10, 1, null) == object2) {
                                    return object2;
                                }
                                break;
                            }
                            case 1: {
                                invocation0 = (Invocation)webViewAdPlayer$special$$inlined$map$4$2$10.L$1;
                                j0 = (j)webViewAdPlayer$special$$inlined$map$4$2$10.L$0;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(L.g(invocation0.getLocation(), "com.unity3d.services.ads.api.AdViewer.loadError")) {
                            Object object3 = kotlin.collections.l.Rb(invocation0.getParameters());
                            L.n(object3, "null cannot be cast to non-null type org.json.JSONObject");
                            int v1 = ((JSONObject)object3).optInt("code");
                            String s = ((JSONObject)object3).optString("message");
                            L.o(s, "errorMessage");
                            loadEvent$Error0 = new com.unity3d.ads.adplayer.model.LoadEvent.Error(s, v1);
                        }
                        else {
                            loadEvent$Error0 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE;
                        }
                        webViewAdPlayer$special$$inlined$map$4$2$10.L$0 = null;
                        webViewAdPlayer$special$$inlined$map$4$2$10.L$1 = null;
                        webViewAdPlayer$special$$inlined$map$4$2$10.label = 2;
                        return j0.emit(loadEvent$Error0, webViewAdPlayer$special$$inlined$map$4$2$10) == object2 ? object2 : S0.a;
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$map$4$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }, this.getScope(), kotlinx.coroutines.flow.O.a.c(), 1), 1);
        this.updateCampaignState = new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.5.2 webViewAdPlayer$special$$inlined$map$5$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        Invocation invocation0;
                        j j0;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.5.2.1 webViewAdPlayer$special$$inlined$map$5$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.5.2.1) {
                            webViewAdPlayer$special$$inlined$map$5$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.5.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$map$5$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$map$5$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$map$5$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$map$5$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$map$5$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$map$5$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j0 = this.$this_unsafeFlow;
                                invocation0 = (Invocation)object0;
                                webViewAdPlayer$special$$inlined$map$5$2$10.L$0 = j0;
                                webViewAdPlayer$special$$inlined$map$5$2$10.L$1 = invocation0;
                                webViewAdPlayer$special$$inlined$map$5$2$10.label = 1;
                                if(Invocation.handle$default(invocation0, null, webViewAdPlayer$special$$inlined$map$5$2$10, 1, null) == object2) {
                                    return object2;
                                }
                                break;
                            }
                            case 1: {
                                invocation0 = (Invocation)webViewAdPlayer$special$$inlined$map$5$2$10.L$1;
                                j0 = (j)webViewAdPlayer$special$$inlined$map$5$2$10.L$0;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        Object object3 = kotlin.collections.l.Rb(invocation0.getParameters());
                        L.n(object3, "null cannot be cast to non-null type org.json.JSONObject");
                        String s = ((JSONObject)object3).optString("data");
                        L.o(s, "data");
                        byte[] arr_b = s.getBytes(f.b);
                        L.o(arr_b, "this as java.lang.String).getBytes(charset)");
                        V v1 = r0.a(arr_b, kotlin.coroutines.jvm.internal.b.f(((JSONObject)object3).optInt("dataVersion")));
                        webViewAdPlayer$special$$inlined$map$5$2$10.L$0 = null;
                        webViewAdPlayer$special$$inlined$map$5$2$10.L$1 = null;
                        webViewAdPlayer$special$$inlined$map$5$2$10.label = 2;
                        return j0.emit(v1, webViewAdPlayer$special$$inlined$map$5$2$10) == object2 ? object2 : S0.a;
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$map$5$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        };
        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.6 webViewAdPlayer$special$$inlined$map$60 = new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.6.2 webViewAdPlayer$special$$inlined$map$6$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        Invocation invocation0;
                        j j0;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.6.2.1 webViewAdPlayer$special$$inlined$map$6$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.6.2.1) {
                            webViewAdPlayer$special$$inlined$map$6$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.6.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$map$6$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$map$6$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$map$6$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$map$6$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$map$6$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$map$6$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j0 = this.$this_unsafeFlow;
                                invocation0 = (Invocation)object0;
                                webViewAdPlayer$special$$inlined$map$6$2$10.L$0 = j0;
                                webViewAdPlayer$special$$inlined$map$6$2$10.L$1 = invocation0;
                                webViewAdPlayer$special$$inlined$map$6$2$10.label = 1;
                                if(Invocation.handle$default(invocation0, null, webViewAdPlayer$special$$inlined$map$6$2$10, 1, null) == object2) {
                                    return object2;
                                }
                                break;
                            }
                            case 1: {
                                invocation0 = (Invocation)webViewAdPlayer$special$$inlined$map$6$2$10.L$1;
                                j0 = (j)webViewAdPlayer$special$$inlined$map$6$2$10.L$0;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        String s = kotlin.collections.l.Rb(invocation0.getParameters()).toString();
                        webViewAdPlayer$special$$inlined$map$6$2$10.L$0 = null;
                        webViewAdPlayer$special$$inlined$map$6$2$10.L$1 = null;
                        webViewAdPlayer$special$$inlined$map$6$2$10.label = 2;
                        return j0.emit(s, webViewAdPlayer$special$$inlined$map$6$2$10) == object2 ? object2 : S0.a;
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$map$6$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        };
        this.onBroadcastEvents = webViewAdPlayer$special$$inlined$map$60;
        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7 webViewAdPlayer$special$$inlined$map$70 = new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2 webViewAdPlayer$special$$inlined$map$7$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        String s6;
                        RequestType requestType0;
                        j j0;
                        j j2;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2 webViewAdPlayer$special$$inlined$map$7$20;
                        j j1;
                        String s1;
                        String s;
                        String s5;
                        String s4;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2 webViewAdPlayer$special$$inlined$map$7$22;
                        Invocation invocation0;
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2.1 webViewAdPlayer$special$$inlined$map$7$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2.1) {
                            webViewAdPlayer$special$$inlined$map$7$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$map$7$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$map$7$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    Object L$1;
                                    Object L$2;
                                    Object L$3;
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
                                webViewAdPlayer$special$$inlined$map$7$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$map$7$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
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
                        Object object1 = webViewAdPlayer$special$$inlined$map$7$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$map$7$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j2 = WebViewAdPlayer.this;
                                invocation0 = (Invocation)object0;
                                webViewAdPlayer$special$$inlined$map$7$2$10.L$0 = this;
                                webViewAdPlayer$special$$inlined$map$7$2$10.L$1 = j2;
                                webViewAdPlayer$special$$inlined$map$7$2$10.L$2 = invocation0;
                                webViewAdPlayer$special$$inlined$map$7$2$10.label = 1;
                                if(Invocation.handle$default(invocation0, null, webViewAdPlayer$special$$inlined$map$7$2$10, 1, null) == object2) {
                                    return object2;
                                }
                                webViewAdPlayer$special$$inlined$map$7$22 = this;
                                break;
                            }
                            case 1: {
                                invocation0 = (Invocation)webViewAdPlayer$special$$inlined$map$7$2$10.L$2;
                                j2 = (j)webViewAdPlayer$special$$inlined$map$7$2$10.L$1;
                                webViewAdPlayer$special$$inlined$map$7$22 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2)webViewAdPlayer$special$$inlined$map$7$2$10.L$0;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                String s2 = (String)webViewAdPlayer$special$$inlined$map$7$2$10.L$3;
                                String s3 = (String)webViewAdPlayer$special$$inlined$map$7$2$10.L$2;
                                j j3 = (j)webViewAdPlayer$special$$inlined$map$7$2$10.L$1;
                                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2 webViewAdPlayer$special$$inlined$map$7$21 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2)webViewAdPlayer$special$$inlined$map$7$2$10.L$0;
                                try {
                                    f0.n(object1);
                                    s4 = s3;
                                    j2 = j3;
                                    s5 = s2;
                                    webViewAdPlayer$special$$inlined$map$7$20 = webViewAdPlayer$special$$inlined$map$7$21;
                                    goto label_82;
                                }
                                catch(Exception exception0) {
                                    s = s2;
                                    s1 = s3;
                                    j2 = j3;
                                    webViewAdPlayer$special$$inlined$map$7$20 = webViewAdPlayer$special$$inlined$map$7$21;
                                    goto label_98;
                                }
                            }
                            case 3: {
                                s = (String)webViewAdPlayer$special$$inlined$map$7$2$10.L$3;
                                s1 = (String)webViewAdPlayer$special$$inlined$map$7$2$10.L$2;
                                j1 = (j)webViewAdPlayer$special$$inlined$map$7$2$10.L$1;
                                webViewAdPlayer$special$$inlined$map$7$20 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.map.7.2)webViewAdPlayer$special$$inlined$map$7$2$10.L$0;
                                try {
                                    f0.n(object1);
                                    goto label_110;
                                }
                                catch(Exception exception0) {
                                    j2 = j1;
                                    goto label_98;
                                }
                            }
                            case 4: {
                                j0 = (j)webViewAdPlayer$special$$inlined$map$7$2$10.L$0;
                                f0.n(object1);
                                goto label_111;
                            }
                            case 5: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        Object object3 = kotlin.collections.l.Rb(invocation0.getParameters());
                        L.n(object3, "null cannot be cast to non-null type kotlin.String");
                        s5 = (String)object3;
                        s4 = (String)kotlin.collections.l.Pe(invocation0.getParameters(), 1);
                        switch(invocation0.getLocation()) {
                            case "com.unity3d.services.core.api.Request.get": {
                                requestType0 = RequestType.GET;
                                break;
                            }
                            case "com.unity3d.services.core.api.Request.head": {
                                requestType0 = RequestType.HEAD;
                                break;
                            }
                            case "com.unity3d.services.core.api.Request.post": {
                                requestType0 = RequestType.POST;
                                break;
                            }
                            default: {
                                throw new IllegalStateException("Unexpected location: " + invocation0.getLocation());
                            }
                        }
                        try {
                            webViewAdPlayer$special$$inlined$map$7$2$10.L$0 = webViewAdPlayer$special$$inlined$map$7$22;
                            webViewAdPlayer$special$$inlined$map$7$2$10.L$1 = j2;
                            webViewAdPlayer$special$$inlined$map$7$2$10.L$2 = s4;
                            webViewAdPlayer$special$$inlined$map$7$2$10.L$3 = s5;
                            webViewAdPlayer$special$$inlined$map$7$2$10.label = 2;
                            object1 = WebViewAdPlayer.this.executeAdViewerRequest.invoke(requestType0, invocation0.getParameters(), webViewAdPlayer$special$$inlined$map$7$2$10);
                        }
                        catch(Exception exception0) {
                            webViewAdPlayer$special$$inlined$map$7$20 = webViewAdPlayer$special$$inlined$map$7$22;
                            s = s5;
                            s1 = s4;
                            goto label_98;
                        }
                        if(object1 == object2) {
                            return object2;
                        }
                        webViewAdPlayer$special$$inlined$map$7$20 = webViewAdPlayer$special$$inlined$map$7$22;
                        try {
                        label_82:
                            Object object4 = ((HttpResponse)object1).getBody();
                            if(object4 instanceof String) {
                                s6 = (String)object4;
                            }
                            else {
                                s6 = object4 instanceof byte[] ? new String(((byte[])object4), f.b) : null;
                            }
                            OnWebRequestComplete onWebRequestComplete0 = new OnWebRequestComplete(u.O(new Object[]{s5, ((HttpResponse)object1).getUrlString(), s6, kotlin.coroutines.jvm.internal.b.f(((HttpResponse)object1).getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(((HttpResponse)object1).getHeaders())}));
                            webViewAdPlayer$special$$inlined$map$7$2$10.L$0 = webViewAdPlayer$special$$inlined$map$7$20;
                            webViewAdPlayer$special$$inlined$map$7$2$10.L$1 = j2;
                            webViewAdPlayer$special$$inlined$map$7$2$10.L$2 = s4;
                            webViewAdPlayer$special$$inlined$map$7$2$10.L$3 = s5;
                            webViewAdPlayer$special$$inlined$map$7$2$10.label = 3;
                            if(WebViewAdPlayer.this.bridge.sendEvent(onWebRequestComplete0, webViewAdPlayer$special$$inlined$map$7$2$10) == object2) {
                                return object2;
                            }
                            goto label_109;
                        }
                        catch(Exception exception0) {
                            s = s5;
                            s1 = s4;
                        }
                    label_98:
                        OnWebRequestFailed onWebRequestFailed0 = new OnWebRequestFailed(u.O(new String[]{s, s1, (exception0.getMessage() == null ? "" : exception0.getMessage())}));
                        webViewAdPlayer$special$$inlined$map$7$2$10.L$0 = j2;
                        webViewAdPlayer$special$$inlined$map$7$2$10.L$1 = null;
                        webViewAdPlayer$special$$inlined$map$7$2$10.L$2 = null;
                        webViewAdPlayer$special$$inlined$map$7$2$10.L$3 = null;
                        webViewAdPlayer$special$$inlined$map$7$2$10.label = 4;
                        if(WebViewAdPlayer.this.bridge.sendEvent(onWebRequestFailed0, webViewAdPlayer$special$$inlined$map$7$2$10) == object2) {
                            return object2;
                        }
                        j0 = j2;
                        goto label_111;
                    label_109:
                        j1 = j2;
                    label_110:
                        j0 = j1;
                    label_111:
                        webViewAdPlayer$special$$inlined$map$7$2$10.L$0 = null;
                        webViewAdPlayer$special$$inlined$map$7$2$10.L$1 = null;
                        webViewAdPlayer$special$$inlined$map$7$2$10.L$2 = null;
                        webViewAdPlayer$special$$inlined$map$7$2$10.L$3 = null;
                        webViewAdPlayer$special$$inlined$map$7$2$10.label = 5;
                        return j0.emit(S0.a, webViewAdPlayer$special$$inlined$map$7$2$10) == object2 ? object2 : S0.a;
                    }
                };
                Object object0 = this.collect(webViewAdPlayer$special$$inlined$map$7$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        };
        this.onRequestEvents = webViewAdPlayer$special$$inlined$map$70;
        Storage.Companion.addStorageEventCallback(webViewAdPlayer$storageEventCallback$10);
        kotlinx.coroutines.flow.k.U0(kotlinx.coroutines.flow.k.e1(webViewAdPlayer$special$$inlined$map$60, new H() {
            {
                super(2, object0, D.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((String)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l String s, @l d d0) {
                return ((D)this.receiver).emit(s, d0);
            }
        }), this.getScope());
        kotlinx.coroutines.flow.k.U0(webViewAdPlayer$special$$inlined$map$70, this.getScope());
        kotlinx.coroutines.flow.k.U0(kotlinx.coroutines.flow.k.e1(AdPlayer.Companion.getBroadcastEventChannel(), new H() {
            {
                super(2, object0, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((String)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l String s, @l d d0) {
                return ((WebViewAdPlayer)this.receiver).onBroadcastEvent(s, d0);
            }
        }), this.getScope());

        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.1 implements i {
            public com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.1(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.1.2 webViewAdPlayer$special$$inlined$filter$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.1.2.1 webViewAdPlayer$special$$inlined$filter$1$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.1.2.1) {
                            webViewAdPlayer$special$$inlined$filter$1$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.1.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$filter$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$filter$1$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$filter$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(kotlin.collections.l.s8(new String[]{"com.unity3d.services.ads.api.AdViewer.showScarAd"}, ((Invocation)object0).getLocation())) {
                                    webViewAdPlayer$special$$inlined$filter$1$2$10.label = 1;
                                    if(j0.emit(object0, webViewAdPlayer$special$$inlined$filter$1$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$filter$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }


        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.2 implements i {
            public com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.2(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.2.2 webViewAdPlayer$special$$inlined$filter$2$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.2.2.1 webViewAdPlayer$special$$inlined$filter$2$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.2.2.1) {
                            webViewAdPlayer$special$$inlined$filter$2$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.2.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$filter$2$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$filter$2$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$filter$2$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$filter$2$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$filter$2$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$filter$2$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(kotlin.collections.l.s8(new String[]{"com.unity3d.services.ads.api.AdViewer.showOfferwallAd"}, ((Invocation)object0).getLocation())) {
                                    webViewAdPlayer$special$$inlined$filter$2$2$10.label = 1;
                                    if(j0.emit(object0, webViewAdPlayer$special$$inlined$filter$2$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$filter$2$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }


        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.3 implements i {
            public com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.3(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.3.2 webViewAdPlayer$special$$inlined$filter$3$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.3.2.1 webViewAdPlayer$special$$inlined$filter$3$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.3.2.1) {
                            webViewAdPlayer$special$$inlined$filter$3$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.3.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$filter$3$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$filter$3$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$filter$3$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$filter$3$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$filter$3$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$filter$3$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(kotlin.collections.l.s8(WebViewAdPlayerKt.SHOW_EVENTS, ((Invocation)object0).getLocation())) {
                                    webViewAdPlayer$special$$inlined$filter$3$2$10.label = 1;
                                    if(j0.emit(object0, webViewAdPlayer$special$$inlined$filter$3$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$filter$3$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }


        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.4 implements i {
            public com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.4(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.4.2 webViewAdPlayer$special$$inlined$filter$4$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.4.2.1 webViewAdPlayer$special$$inlined$filter$4$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.4.2.1) {
                            webViewAdPlayer$special$$inlined$filter$4$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.4.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$filter$4$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$filter$4$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$filter$4$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$filter$4$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$filter$4$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$filter$4$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(kotlin.collections.l.s8(WebViewAdPlayerKt.LOAD_EVENTS, ((Invocation)object0).getLocation())) {
                                    webViewAdPlayer$special$$inlined$filter$4$2$10.label = 1;
                                    if(j0.emit(object0, webViewAdPlayer$special$$inlined$filter$4$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$filter$4$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }


        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.5 implements i {
            public com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.5(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.5.2 webViewAdPlayer$special$$inlined$filter$5$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.5.2.1 webViewAdPlayer$special$$inlined$filter$5$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.5.2.1) {
                            webViewAdPlayer$special$$inlined$filter$5$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.5.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$filter$5$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$filter$5$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$filter$5$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$filter$5$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$filter$5$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$filter$5$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(L.g(((Invocation)object0).getLocation(), "com.unity3d.services.ads.api.AdViewer.updateCampaignState")) {
                                    webViewAdPlayer$special$$inlined$filter$5$2$10.label = 1;
                                    if(j0.emit(object0, webViewAdPlayer$special$$inlined$filter$5$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$filter$5$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }


        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.6 implements i {
            public com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.6(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.6.2 webViewAdPlayer$special$$inlined$filter$6$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.6.2.1 webViewAdPlayer$special$$inlined$filter$6$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.6.2.1) {
                            webViewAdPlayer$special$$inlined$filter$6$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.6.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$filter$6$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$filter$6$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$filter$6$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$filter$6$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$filter$6$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$filter$6$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(L.g(((Invocation)object0).getLocation(), "com.unity3d.services.ads.api.AdViewer.broadcastEvent")) {
                                    webViewAdPlayer$special$$inlined$filter$6$2$10.label = 1;
                                    if(j0.emit(object0, webViewAdPlayer$special$$inlined$filter$6$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$filter$6$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }


        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.7 implements i {
            public com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.7(i i0) {
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.7.2 webViewAdPlayer$special$$inlined$filter$7$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.7.2.1 webViewAdPlayer$special$$inlined$filter$7$2$10;
                        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.7.2.1) {
                            webViewAdPlayer$special$$inlined$filter$7$2$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.special..inlined.filter.7.2.1)d0;
                            int v = webViewAdPlayer$special$$inlined$filter$7$2$10.label;
                            if((v & 0x80000000) == 0) {
                                webViewAdPlayer$special$$inlined$filter$7$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                webViewAdPlayer$special$$inlined$filter$7$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            webViewAdPlayer$special$$inlined$filter$7$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = webViewAdPlayer$special$$inlined$filter$7$2$10.result;
                        Object object2 = b.l();
                        switch(webViewAdPlayer$special$$inlined$filter$7$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$this_unsafeFlow;
                                if(kotlin.collections.l.s8(WebViewAdPlayerKt.REQUEST_EVENTS, ((Invocation)object0).getLocation())) {
                                    webViewAdPlayer$special$$inlined$filter$7$2$10.label = 1;
                                    if(j0.emit(object0, webViewAdPlayer$special$$inlined$filter$7$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(webViewAdPlayer$special$$inlined$filter$7$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }

    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @CallSuper
    @m
    public Object destroy(@l d d0) {
        return DefaultImpls.destroy(this, d0);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(Boolean.TRUE);
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @l
    public final i getOnRequestEvents() {
        return this.onRequestEvents;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public O getScope() {
        return this.scope;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public i getUpdateCampaignState() {
        return this.updateCampaignState;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @l
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object onAllowedPiiChange(@l byte[] arr_b, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final byte[] $value;

            {
                this.$value = arr_b;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                String s = Base64.encodeToString(this.$value, 2);
                L.o(s, "encodeToString(value, Base64.NO_WRAP)");
                return new OnAllowedPiiChangeEvent(s);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object onBroadcastEvent(@l String s, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final String $event;

            {
                this.$event = s;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                JSONObject jSONObject0 = new JSONObject(this.$event);
                String s = jSONObject0.getString("eventType");
                String s1 = jSONObject0.optString("data");
                L.o(s, "eventType");
                return new OnBroadcastEvent(s, s1);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object requestShow(@m Map map0, @l d d0) {
        JSONObject jSONObject6;
        String s2;
        WebViewAdPlayer webViewAdPlayer1;
        Map map2;
        JSONObject jSONObject5;
        JSONObject jSONObject4;
        JSONObject jSONObject2;
        JSONObject jSONObject1;
        Map map1;
        WebViewAdPlayer webViewAdPlayer0;
        String s;
        JSONObject jSONObject0;
        com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow.1 webViewAdPlayer$requestShow$10;
        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow.1) {
            webViewAdPlayer$requestShow$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow.1)d0;
            int v = webViewAdPlayer$requestShow$10.label;
            if((v & 0x80000000) == 0) {
                webViewAdPlayer$requestShow$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.requestShow(null, this);
                    }
                };
            }
            else {
                webViewAdPlayer$requestShow$10.label = v ^ 0x80000000;
            }
        }
        else {
            webViewAdPlayer$requestShow$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.requestShow(null, this);
                }
            };
        }
        Object object0 = webViewAdPlayer$requestShow$10.result;
        Object object1 = b.l();
        switch(webViewAdPlayer$requestShow$10.label) {
            case 0: {
                f0.n(object0);
                DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 = this.deviceInfoRepository.getDynamicDeviceInfo();
                jSONObject0 = new JSONObject();
                jSONObject0.put("orientation", this.deviceInfoRepository.getOrientation());
                jSONObject0.put("connectionType", this.deviceInfoRepository.getConnectionTypeStr());
                jSONObject0.put("isMuted", this.deviceInfoRepository.getRingerMode() != 2);
                jSONObject0.put("volume", dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getAndroid().getVolume());
                webViewAdPlayer$requestShow$10.L$0 = this;
                webViewAdPlayer$requestShow$10.L$1 = map0;
                webViewAdPlayer$requestShow$10.L$2 = jSONObject0;
                webViewAdPlayer$requestShow$10.L$3 = jSONObject0;
                s = "privacy";
                webViewAdPlayer$requestShow$10.L$4 = "privacy";
                webViewAdPlayer$requestShow$10.L$5 = jSONObject0;
                webViewAdPlayer$requestShow$10.label = 1;
                object0 = this.sessionRepository.getPrivacy(webViewAdPlayer$requestShow$10);
                if(object0 == object1) {
                    return object1;
                }
                webViewAdPlayer0 = this;
                map1 = map0;
                jSONObject1 = jSONObject0;
                jSONObject2 = jSONObject1;
                goto label_47;
            }
            case 1: {
                jSONObject1 = (JSONObject)webViewAdPlayer$requestShow$10.L$5;
                String s1 = (String)webViewAdPlayer$requestShow$10.L$4;
                JSONObject jSONObject3 = (JSONObject)webViewAdPlayer$requestShow$10.L$3;
                jSONObject2 = (JSONObject)webViewAdPlayer$requestShow$10.L$2;
                map1 = (Map)webViewAdPlayer$requestShow$10.L$1;
                webViewAdPlayer0 = (WebViewAdPlayer)webViewAdPlayer$requestShow$10.L$0;
                f0.n(object0);
                s = s1;
                jSONObject0 = jSONObject3;
            label_47:
                jSONObject1.put(s, ProtobufExtensionsKt.toBase64$default(((ByteString)object0), false, 1, null));
                webViewAdPlayer$requestShow$10.L$0 = webViewAdPlayer0;
                webViewAdPlayer$requestShow$10.L$1 = map1;
                webViewAdPlayer$requestShow$10.L$2 = jSONObject2;
                webViewAdPlayer$requestShow$10.L$3 = jSONObject0;
                webViewAdPlayer$requestShow$10.L$4 = "privacyFsm";
                webViewAdPlayer$requestShow$10.L$5 = jSONObject0;
                webViewAdPlayer$requestShow$10.label = 2;
                Object object2 = webViewAdPlayer0.sessionRepository.getPrivacyFsm(webViewAdPlayer$requestShow$10);
                if(object2 == object1) {
                    return object1;
                }
                jSONObject4 = jSONObject0;
                jSONObject5 = jSONObject2;
                map2 = map1;
                webViewAdPlayer1 = webViewAdPlayer0;
                s2 = "privacyFsm";
                object0 = object2;
                jSONObject6 = jSONObject4;
                break;
            }
            case 2: {
                jSONObject6 = (JSONObject)webViewAdPlayer$requestShow$10.L$5;
                s2 = (String)webViewAdPlayer$requestShow$10.L$4;
                jSONObject4 = (JSONObject)webViewAdPlayer$requestShow$10.L$3;
                jSONObject5 = (JSONObject)webViewAdPlayer$requestShow$10.L$2;
                map2 = (Map)webViewAdPlayer$requestShow$10.L$1;
                webViewAdPlayer1 = (WebViewAdPlayer)webViewAdPlayer$requestShow$10.L$0;
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
        jSONObject6.put(s2, ProtobufExtensionsKt.toBase64$default(((ByteString)object0), false, 1, null));
        ByteString byteString0 = ((AllowedPii)webViewAdPlayer1.deviceInfoRepository.getAllowedPii().getValue()).toByteString();
        L.o(byteString0, "deviceInfoRepository.all…dPii.value.toByteString()");
        jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString0, false, 1, null));
        if(map2 != null) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object3: map2.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object3;
                if(!L.g(map$Entry0.getKey(), "objectId")) {
                    linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
            }
            if(!linkedHashMap0.isEmpty()) {
                jSONObject4.put("showOptions", new JSONObject(linkedHashMap0));
            }
        }
        webViewAdPlayer$requestShow$10.L$0 = null;
        webViewAdPlayer$requestShow$10.L$1 = null;
        webViewAdPlayer$requestShow$10.L$2 = null;
        webViewAdPlayer$requestShow$10.L$3 = null;
        webViewAdPlayer$requestShow$10.L$4 = null;
        webViewAdPlayer$requestShow$10.L$5 = null;
        webViewAdPlayer$requestShow$10.label = 3;
        return webViewAdPlayer1.bridge.request("webview", "show", new Object[]{jSONObject5}, webViewAdPlayer$requestShow$10) == object1 ? object1 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendActivityDestroyed(@l d d0) {
        Object object0 = this.sendEvent(com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2.INSTANCE, d0);
        return object0 == b.l() ? object0 : S0.a;

        final class com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2 extends kotlin.jvm.internal.N implements a {
            public static final com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2 INSTANCE;

            static {
                com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2.INSTANCE = new com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2();
            }

            com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2() {
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                return new OnActivityDestroyedEvent();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

    }

    private final Object sendEvent(a a0, d d0) {
        WebViewAdPlayer webViewAdPlayer0;
        a a1;
        com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent.1 webViewAdPlayer$sendEvent$10;
        if(d0 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent.1) {
            webViewAdPlayer$sendEvent$10 = (com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent.1)d0;
            int v = webViewAdPlayer$sendEvent$10.label;
            if((v & 0x80000000) == 0) {
                webViewAdPlayer$sendEvent$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.sendEvent(null, this);
                    }
                };
            }
            else {
                webViewAdPlayer$sendEvent$10.label = v ^ 0x80000000;
            }
        }
        else {
            webViewAdPlayer$sendEvent$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.sendEvent(null, this);
                }
            };
        }
        Object object0 = webViewAdPlayer$sendEvent$10.result;
        Object object1 = b.l();
        switch(webViewAdPlayer$sendEvent$10.label) {
            case 0: {
                f0.n(object0);
                webViewAdPlayer$sendEvent$10.L$0 = this;
                a1 = a0;
                webViewAdPlayer$sendEvent$10.L$1 = a1;
                webViewAdPlayer$sendEvent$10.label = 1;
                object0 = kotlinx.coroutines.flow.k.H1(this.getOnLoadEvent(), webViewAdPlayer$sendEvent$10);
                if(object0 == object1) {
                    return object1;
                }
                webViewAdPlayer0 = this;
                break;
            }
            case 1: {
                a1 = (a)webViewAdPlayer$sendEvent$10.L$1;
                webViewAdPlayer0 = (WebViewAdPlayer)webViewAdPlayer$sendEvent$10.L$0;
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
        if(((LoadEvent)object0) instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error) {
            Map map0 = Y.W(new V[]{r0.a("reason", "adviewer"), r0.a("reason_debug", ((com.unity3d.ads.adplayer.model.LoadEvent.Error)(((LoadEvent)object0))).getMessage()), r0.a("reason_code", String.valueOf(((com.unity3d.ads.adplayer.model.LoadEvent.Error)(((LoadEvent)object0))).getErrorCode()))});
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(webViewAdPlayer0.sendDiagnosticEvent, "bridge_send_event_failed", null, map0, null, null, 26, null);
            return S0.a;
        }
        WebViewEvent webViewEvent0 = (WebViewEvent)a1.invoke();
        webViewAdPlayer$sendEvent$10.L$0 = null;
        webViewAdPlayer$sendEvent$10.L$1 = null;
        webViewAdPlayer$sendEvent$10.label = 2;
        return webViewAdPlayer0.bridge.sendEvent(webViewEvent0, webViewAdPlayer$sendEvent$10) == object1 ? object1 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendFocusChange(boolean z, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final boolean $isFocused;

            {
                this.$isFocused = z;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                return new OnFocusChangeEvent(this.$isFocused);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendGmaEvent(@l c c0, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final c $event;

            {
                this.$event = c0;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                return new OnGmaEvent(this.$event);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendMuteChange(boolean z, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final boolean $isMuted;

            {
                this.$isMuted = z;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                return new OnMuteChangeEvent(this.$isMuted);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendOfferwallEvent(@l OfferwallEvent offerwallEvent0, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final OfferwallEvent $event;

            {
                this.$event = offerwallEvent0;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                return new OnOfferwallEvent(this.$event);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendPrivacyFsmChange(@l byte[] arr_b, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final byte[] $value;

            {
                this.$value = arr_b;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                String s = Base64.encodeToString(this.$value, 2);
                L.o(s, "encodeToString(value, Base64.NO_WRAP)");
                return new OnPrivacyFsmChangeEvent(s);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendScarBannerEvent(@l BannerEvent bannerBridge$BannerEvent0, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final BannerEvent $event;

            {
                this.$event = bannerBridge$BannerEvent0;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                return new OnScarBannerEvent(this.$event);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendUserConsentChange(@l byte[] arr_b, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final byte[] $value;

            {
                this.$value = arr_b;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                String s = Base64.encodeToString(this.$value, 2);
                L.o(s, "encodeToString(value, Base64.NO_WRAP)");
                return new OnUserConsentChangeEvent(s);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendVisibilityChange(boolean z, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final boolean $isVisible;

            {
                this.$isVisible = z;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                return new OnVisibilityChangeEvent(this.$isVisible);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    @m
    public Object sendVolumeChange(double f, @l d d0) {
        Object object0 = this.sendEvent(new a() {
            final double $volume;

            {
                this.$volume = f;
                super(0);
            }

            @l
            public final WebViewEvent invoke() {
                return new OnVolumeChangeEvent(this.$volume);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // com.unity3d.ads.adplayer.AdPlayer
    public void show(@l ShowOptions showOptions0) {
        DefaultImpls.show(this, showOptions0);
    }
}

