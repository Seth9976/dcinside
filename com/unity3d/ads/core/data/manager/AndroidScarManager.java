package com.unity3d.ads.core.data.manager;

import A3.o;
import android.content.Context;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensionsKt;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.p;
import kotlinx.coroutines.u1;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidScarManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScarManager.kt\ncom/unity3d/ads/core/data/manager/AndroidScarManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,129:1\n1#2:130\n20#3:131\n22#3:135\n50#4:132\n55#4:134\n106#5:133\n*S KotlinDebug\n*F\n+ 1 AndroidScarManager.kt\ncom/unity3d/ads/core/data/manager/AndroidScarManager\n*L\n113#1:131\n113#1:135\n113#1:132\n113#1:134\n113#1:133\n*E\n"})
public final class AndroidScarManager implements ScarManager {
    @l
    private final GMAScarAdapterBridge gmaBridge;
    @l
    private final CommonScarEventReceiver scarEventReceiver;
    @l
    private final ScarTimeHackFixer scarTimeHackFixer;

    public AndroidScarManager(@l CommonScarEventReceiver commonScarEventReceiver0, @l GMAScarAdapterBridge gMAScarAdapterBridge0, @l ScarTimeHackFixer scarTimeHackFixer0) {
        L.p(commonScarEventReceiver0, "scarEventReceiver");
        L.p(gMAScarAdapterBridge0, "gmaBridge");
        L.p(scarTimeHackFixer0, "scarTimeHackFixer");
        super();
        this.scarEventReceiver = commonScarEventReceiver0;
        this.gmaBridge = gMAScarAdapterBridge0;
        this.scarTimeHackFixer = scarTimeHackFixer0;
    }

    @Override  // com.unity3d.ads.core.data.manager.ScarManager
    @m
    public Object getSignals(@m List list0, @l d d0) {
        return u1.e(50000L, new o(this, null) {
            final List $adFormat;
            Object L$0;
            Object L$1;
            int label;

            {
                this.$adFormat = list0;
                AndroidScarManager.this = androidScarManager0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.manager.AndroidScarManager.getSignals.2(this.$adFormat, AndroidScarManager.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.manager.AndroidScarManager.getSignals.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                ArrayList arrayList0;
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        List list0 = this.$adFormat;
                        AndroidScarManager androidScarManager0 = AndroidScarManager.this;
                        this.L$0 = list0;
                        this.L$1 = androidScarManager0;
                        this.label = 1;
                        p p0 = new p(b.e(this), 1);
                        p0.c0();
                        if(list0 == null) {
                            arrayList0 = null;
                        }
                        else {
                            arrayList0 = new ArrayList(u.b0(list0, 10));
                            for(Object object2: list0) {
                                arrayList0.add(AdFormatExtensionsKt.toUnityAdFormat(((AdFormat)object2)));
                            }
                        }
                        androidScarManager0.gmaBridge.getSCARBiddingSignals(arrayList0, new BiddingSignalsHandler(true, new IBiddingSignalsListener() {
                            @Override  // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                            public void onSignalsFailure(@m String s) {
                                Object object0 = e0.b(f0.a(new Exception(s)));
                                this.$continuation.resumeWith(object0);
                            }

                            @Override  // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                            public void onSignalsReady(@m BiddingSignals biddingSignals0) {
                                this.$continuation.resumeWith(biddingSignals0);
                            }
                        }));
                        object0 = p0.x();
                        if(object0 == b.l()) {
                            h.c(this);
                        }
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        AndroidScarManager androidScarManager1 = (AndroidScarManager)this.L$1;
                        List list1 = (List)this.L$0;
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, d0);
    }

    @Override  // com.unity3d.ads.core.data.manager.ScarManager
    @m
    public Object getVersion(@l d d0) {
        return u1.e(5000L, new o(null) {
            int label;

            {
                AndroidScarManager.this = androidScarManager0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.manager.AndroidScarManager.getVersion.2(AndroidScarManager.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.manager.AndroidScarManager.getVersion.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        I i0 = k.m1(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new o(null) {
                            int label;

                            {
                                AndroidScarManager.this = androidScarManager0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new com.unity3d.ads.core.data.manager.AndroidScarManager.getVersion.2.1(AndroidScarManager.this, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((j)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l j j0, @m d d0) {
                                return ((com.unity3d.ads.core.data.manager.AndroidScarManager.getVersion.2.1)this.create(j0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.label != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                AndroidScarManager.this.gmaBridge.getVersion();
                                return S0.a;
                            }
                        });
                        this.label = 1;
                        object0 = k.v0(i0, this);
                        return object0 == object1 ? object1 : object0;
                    }
                    case 1: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, d0);
    }

    @Override  // com.unity3d.ads.core.data.manager.ScarManager
    @m
    public Object loadAd(@l String s, @l String s1, @l String s2, @l String s3, @l String s4, int v, @l d d0) {
        com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.1 androidScarManager$loadAd$10;
        if(d0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.1) {
            androidScarManager$loadAd$10 = (com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.1)d0;
            int v1 = androidScarManager$loadAd$10.label;
            if((v1 & 0x80000000) == 0) {
                androidScarManager$loadAd$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.loadAd(null, null, null, null, null, 0, this);
                    }
                };
            }
            else {
                androidScarManager$loadAd$10.label = v1 ^ 0x80000000;
            }
        }
        else {
            androidScarManager$loadAd$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.loadAd(null, null, null, null, null, 0, this);
                }
            };
        }
        Object object0 = androidScarManager$loadAd$10.result;
        Object object1 = b.l();
        Object object2 = null;
        switch(androidScarManager$loadAd$10.label) {
            case 0: {
                f0.n(object0);
                boolean z = v.O1(s, "INTERSTITIAL", true);
                I i0 = k.m1(this.scarEventReceiver.getGmaEventFlow(), new o(z, s1, s4, s2, s3, v, null) {
                    final String $adString;
                    final String $adUnitId;
                    final boolean $canSkip;
                    final String $placementId;
                    final String $queryId;
                    final int $videoLength;
                    int label;

                    {
                        AndroidScarManager.this = androidScarManager0;
                        this.$canSkip = z;
                        this.$placementId = s;
                        this.$queryId = s1;
                        this.$adString = s2;
                        this.$adUnitId = s3;
                        this.$videoLength = v;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.2(AndroidScarManager.this, this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((j)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l j j0, @m d d0) {
                        return ((com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.2)this.create(j0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        int v = AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength);
                        AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, v);
                        return S0.a;
                    }
                });
                com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.3 androidScarManager$loadAd$30 = new o(null) {
                    final String $placementId;
                    Object L$0;
                    int label;

                    {
                        this.$placementId = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.3(this.$placementId, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @m
                    public final Object invoke(@l GmaEventData gmaEventData0, @m d d0) {
                        return ((com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd.3)this.create(gmaEventData0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((GmaEventData)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        boolean z = true;
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        GmaEventData gmaEventData0 = (GmaEventData)this.L$0;
                        if((!u.O(new c[]{c.k, c.p}).contains(gmaEventData0.getGmaEvent()) || !L.g(gmaEventData0.getPlacementId(), this.$placementId)) && !u.O(new c[]{c.F, c.b, c.n}).contains(gmaEventData0.getGmaEvent())) {
                            z = false;
                        }
                        return kotlin.coroutines.jvm.internal.b.a(z);
                    }
                };
                androidScarManager$loadAd$10.label = 1;
                object0 = k.u0(i0, androidScarManager$loadAd$30, androidScarManager$loadAd$10);
                if(object0 == object1) {
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
        if(((GmaEventData)object0).getGmaEvent() != c.k) {
            object2 = object0;
        }
        if(((GmaEventData)object2) != null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Error loading SCAR ad: ");
            String s5 = ((GmaEventData)object2).getErrorMessage();
            if(s5 == null) {
                s5 = ((GmaEventData)object2).getGmaEvent();
            }
            stringBuilder0.append(s5);
            throw new LoadException(0, stringBuilder0.toString());
        }
        return S0.a;
    }

    @Override  // com.unity3d.ads.core.data.manager.ScarManager
    @l
    public i loadBannerAd(@l Context context0, @l BannerView bannerView0, @l P2.d d0, @l UnityBannerSize unityBannerSize0, @l String s) {
        L.p(context0, "context");
        L.p(bannerView0, "bannerView");
        L.p(d0, "scarAdMetadata");
        L.p(unityBannerSize0, "bannerSize");
        L.p(s, "opportunityId");
        com.unity3d.ads.core.data.manager.AndroidScarManager.loadBannerAd.1 androidScarManager$loadBannerAd$10 = new o(context0, bannerView0, s, d0, unityBannerSize0, null) {
            final UnityBannerSize $bannerSize;
            final BannerView $bannerView;
            final Context $context;
            final String $opportunityId;
            final P2.d $scarAdMetadata;
            int label;

            {
                AndroidScarManager.this = androidScarManager0;
                this.$context = context0;
                this.$bannerView = bannerView0;
                this.$opportunityId = s;
                this.$scarAdMetadata = d0;
                this.$bannerSize = unityBannerSize0;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.manager.AndroidScarManager.loadBannerAd.1(AndroidScarManager.this, this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((com.unity3d.ads.core.data.manager.AndroidScarManager.loadBannerAd.1)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
                return S0.a;
            }
        };
        return new i() {
            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                com.unity3d.ads.core.data.manager.AndroidScarManager.loadBannerAd..inlined.filter.1.2 androidScarManager$loadBannerAd$$inlined$filter$1$20 = new j() {
                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        com.unity3d.ads.core.data.manager.AndroidScarManager.loadBannerAd..inlined.filter.1.2.1 androidScarManager$loadBannerAd$$inlined$filter$1$2$10;
                        if(d0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager.loadBannerAd..inlined.filter.1.2.1) {
                            androidScarManager$loadBannerAd$$inlined$filter$1$2$10 = (com.unity3d.ads.core.data.manager.AndroidScarManager.loadBannerAd..inlined.filter.1.2.1)d0;
                            int v = androidScarManager$loadBannerAd$$inlined$filter$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                androidScarManager$loadBannerAd$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                                androidScarManager$loadBannerAd$$inlined$filter$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            androidScarManager$loadBannerAd$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = androidScarManager$loadBannerAd$$inlined$filter$1$2$10.result;
                        Object object2 = b.l();
                        switch(androidScarManager$loadBannerAd$$inlined$filter$1$2$10.label) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.$opportunityId$inlined;
                                if(((GmaEventData)object0).getGmaEvent() == c.G && L.g(((GmaEventData)object0).getOpportunityId(), this.$opportunityId$inlined)) {
                                    androidScarManager$loadBannerAd$$inlined$filter$1$2$10.label = 1;
                                    if(j0.emit(object0, androidScarManager$loadBannerAd$$inlined$filter$1$2$10) == object2) {
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
                Object object0 = s.collect(androidScarManager$loadBannerAd$$inlined$filter$1$20, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        };
    }

    @Override  // com.unity3d.ads.core.data.manager.ScarManager
    @l
    public i show(@l String s, @l String s1) {
        L.p(s, "placementId");
        L.p(s1, "queryId");
        com.unity3d.ads.core.data.manager.AndroidScarManager.show.1 androidScarManager$show$10 = new o(s, s1, null) {
            final String $placementId;
            final String $queryId;
            int label;

            {
                AndroidScarManager.this = androidScarManager0;
                this.$placementId = s;
                this.$queryId = s1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.manager.AndroidScarManager.show.1(AndroidScarManager.this, this.$placementId, this.$queryId, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((com.unity3d.ads.core.data.manager.AndroidScarManager.show.1)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
                return S0.a;
            }
        };
        return k.d2(k.m1(this.scarEventReceiver.getGmaEventFlow(), androidScarManager$show$10), new A3.p() {
            private Object L$0;
            Object L$1;
            int label;

            {
                super(3, d0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((j)object0), ((GmaEventData)object1), ((d)object2));
            }

            @m
            public final Object invoke(@l j j0, @l GmaEventData gmaEventData0, @m d d0) {
                com.unity3d.ads.core.data.manager.AndroidScarManager.show.2 androidScarManager$show$20 = new com.unity3d.ads.core.data.manager.AndroidScarManager.show.2(d0);
                androidScarManager$show$20.L$0 = j0;
                androidScarManager$show$20.L$1 = gmaEventData0;
                return androidScarManager$show$20.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        j j0 = (j)this.L$0;
                        GmaEventData gmaEventData0 = (GmaEventData)this.L$1;
                        this.L$0 = gmaEventData0;
                        this.label = 1;
                        return j0.emit(gmaEventData0, this) == object1 ? object1 : kotlin.coroutines.jvm.internal.b.a(!kotlin.collections.l.s8(new c[]{c.E, c.q, c.v, c.u}, gmaEventData0.getGmaEvent()));
                    }
                    case 1: {
                        GmaEventData gmaEventData1 = (GmaEventData)this.L$0;
                        f0.n(object0);
                        return kotlin.coroutines.jvm.internal.b.a(!kotlin.collections.l.s8(new c[]{c.E, c.q, c.v, c.u}, gmaEventData1.getGmaEvent()));
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        });
    }
}

