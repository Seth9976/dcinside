package com.unity3d.ads.core.data.manager;

import A3.o;
import A3.p;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidOfferwallManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOfferwallManager.kt\ncom/unity3d/ads/core/data/manager/AndroidOfferwallManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class AndroidOfferwallManager implements OfferwallManager {
    @l
    private final OfferwallAdapterBridge offerwallBridge;

    public AndroidOfferwallManager(@l OfferwallAdapterBridge offerwallAdapterBridge0) {
        L.p(offerwallAdapterBridge0, "offerwallBridge");
        super();
        this.offerwallBridge = offerwallAdapterBridge0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.ads.core.data.manager.OfferwallManager
    @m
    public Object getVersion(@l d d0) {
        return "0.0.0";
    }

    @Override  // com.unity3d.ads.core.data.manager.OfferwallManager
    @m
    public Object isConnected(@l d d0) {
        return b.a(this.offerwallBridge.isConnected());
    }

    @Override  // com.unity3d.ads.core.data.manager.OfferwallManager
    @m
    public Object isContentReady(@l d d0) {
        return b.a(this.offerwallBridge.isContentReady());
    }

    @Override  // com.unity3d.ads.core.data.manager.OfferwallManager
    @m
    public Object loadAd(@l String s, @l d d0) {
        com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.1 androidOfferwallManager$loadAd$10;
        if(d0 instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.1) {
            androidOfferwallManager$loadAd$10 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.1)d0;
            int v = androidOfferwallManager$loadAd$10.label;
            if((v & 0x80000000) == 0) {
                androidOfferwallManager$loadAd$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.loadAd(null, this);
                    }
                };
            }
            else {
                androidOfferwallManager$loadAd$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidOfferwallManager$loadAd$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.loadAd(null, this);
                }
            };
        }
        Object object0 = androidOfferwallManager$loadAd$10.result;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        Object object2 = null;
        switch(androidOfferwallManager$loadAd$10.label) {
            case 0: {
                f0.n(object0);
                DeviceLog.debug(("Offerwall Manager - loadAd: " + s));
                I i0 = k.m1(this.offerwallBridge.getOfferwallEventFlow(), new o(s, null) {
                    final String $placementName;
                    int label;

                    {
                        AndroidOfferwallManager.this = androidOfferwallManager0;
                        this.$placementName = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.2(AndroidOfferwallManager.this, this.$placementName, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((j)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l j j0, @m d d0) {
                        return ((com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.2)this.create(j0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
                        return S0.a;
                    }
                });
                com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.3 androidOfferwallManager$loadAd$30 = new o(null) {
                    final String $placementName;
                    Object L$0;
                    int label;

                    {
                        this.$placementName = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.3(this.$placementName, d0);
                        d1.L$0 = object0;
                        return d1;
                    }

                    @m
                    public final Object invoke(@l OfferwallEventData offerwallEventData0, @m d d0) {
                        return ((com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd.3)this.create(offerwallEventData0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((OfferwallEventData)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        boolean z = true;
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        OfferwallEventData offerwallEventData0 = (OfferwallEventData)this.L$0;
                        if(!u.O(new OfferwallEvent[]{OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED}).contains(offerwallEventData0.getOfferwallEvent()) || !L.g(offerwallEventData0.getPlacementName(), this.$placementName)) {
                            z = false;
                        }
                        return b.a(z);
                    }
                };
                androidOfferwallManager$loadAd$10.label = 1;
                object0 = k.u0(i0, androidOfferwallManager$loadAd$30, androidOfferwallManager$loadAd$10);
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
        if(((OfferwallEventData)object0).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS) {
            object2 = object0;
        }
        if(((OfferwallEventData)object2) != null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Error loading offerwall ad: ");
            String s1 = ((OfferwallEventData)object2).getErrorMessage();
            if(s1 == null) {
                s1 = ((OfferwallEventData)object2).getOfferwallEvent();
            }
            stringBuilder0.append(s1);
            throw new LoadException(0, stringBuilder0.toString());
        }
        return S0.a;
    }

    @Override  // com.unity3d.ads.core.data.manager.OfferwallManager
    @l
    public i showAd(@l String s) {
        L.p(s, "placementName");
        DeviceLog.debug(("Offerwall Manager - showAd: " + s));
        com.unity3d.ads.core.data.manager.AndroidOfferwallManager.showAd.1 androidOfferwallManager$showAd$10 = new o(s, null) {
            final String $placementName;
            int label;

            {
                AndroidOfferwallManager.this = androidOfferwallManager0;
                this.$placementName = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.manager.AndroidOfferwallManager.showAd.1(AndroidOfferwallManager.this, this.$placementName, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((com.unity3d.ads.core.data.manager.AndroidOfferwallManager.showAd.1)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
                return S0.a;
            }
        };
        return k.d2(k.m1(this.offerwallBridge.getOfferwallEventFlow(), androidOfferwallManager$showAd$10), new p() {
            private Object L$0;
            Object L$1;
            int label;

            {
                super(3, d0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((j)object0), ((OfferwallEventData)object1), ((d)object2));
            }

            @m
            public final Object invoke(@l j j0, @l OfferwallEventData offerwallEventData0, @m d d0) {
                com.unity3d.ads.core.data.manager.AndroidOfferwallManager.showAd.2 androidOfferwallManager$showAd$20 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager.showAd.2(d0);
                androidOfferwallManager$showAd$20.L$0 = j0;
                androidOfferwallManager$showAd$20.L$1 = offerwallEventData0;
                return androidOfferwallManager$showAd$20.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        j j0 = (j)this.L$0;
                        OfferwallEventData offerwallEventData0 = (OfferwallEventData)this.L$1;
                        this.L$0 = offerwallEventData0;
                        this.label = 1;
                        return j0.emit(offerwallEventData0, this) == object1 ? object1 : b.a(!kotlin.collections.l.s8(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData0.getOfferwallEvent()));
                    }
                    case 1: {
                        OfferwallEventData offerwallEventData1 = (OfferwallEventData)this.L$0;
                        f0.n(object0);
                        return b.a(!kotlin.collections.l.s8(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData1.getOfferwallEvent()));
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        });
    }
}

