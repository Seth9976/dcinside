package com.unity3d.ads.core.domain;

import A3.o;
import A3.p;
import android.app.Activity;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent.Completed;
import com.unity3d.ads.core.data.model.ShowEvent.Error;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.r0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import org.json.JSONObject;
import y4.l;
import y4.m;

public final class AndroidShow implements Show {
    @l
    private final AdRepository adRepository;
    @l
    private final GameServerIdReader gameServerIdReader;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidShow(@l AdRepository adRepository0, @l GameServerIdReader gameServerIdReader0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(adRepository0, "adRepository");
        L.p(gameServerIdReader0, "gameServerIdReader");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.adRepository = adRepository0;
        this.gameServerIdReader = gameServerIdReader0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.core.domain.Show
    @l
    public i invoke(@l Activity activity0, @l AdObject adObject0, @l UnityAdsShowOptions unityAdsShowOptions0) {
        L.p(activity0, "activity");
        L.p(adObject0, "adObject");
        L.p(unityAdsShowOptions0, "showOptions");
        return k.I0(new o(this, activity0, unityAdsShowOptions0, null) {
            final Activity $activity;
            final AdObject $adObject;
            final UnityAdsShowOptions $showOptions;
            private Object L$0;
            Object L$1;
            int label;

            {
                this.$adObject = adObject0;
                AndroidShow.this = androidShow0;
                this.$activity = activity0;
                this.$showOptions = unityAdsShowOptions0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new com.unity3d.ads.core.domain.AndroidShow.invoke.1(this.$adObject, AndroidShow.this, this.$activity, this.$showOptions, d0);
                d1.L$0 = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((com.unity3d.ads.core.domain.AndroidShow.invoke.1)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                ByteString byteString1;
                j j1;
                Object object2;
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        j j0 = (j)this.L$0;
                        if(this.$adObject.getOpportunityId().isEmpty()) {
                            throw new IllegalArgumentException("No opportunityId");
                        }
                        ByteString byteString0 = this.$adObject.getOpportunityId();
                        this.L$0 = j0;
                        this.L$1 = byteString0;
                        this.label = 1;
                        object2 = AndroidShow.this.adRepository.getAd(byteString0, this);
                        if(object2 == object1) {
                            return object1;
                        }
                        j1 = j0;
                        byteString1 = byteString0;
                        break;
                    }
                    case 1: {
                        byteString1 = (ByteString)this.L$1;
                        j j2 = (j)this.L$0;
                        f0.n(object0);
                        j1 = j2;
                        object2 = object0;
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
                if(((AdObject)object2) == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                DefaultImpls.invoke$default(AndroidShow.this.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, 14, null);
                AdPlayer adPlayer0 = ((AdObject)object2).getAdPlayer();
                if(adPlayer0 == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                i i0 = k.d2(k.d1(k.l1(adPlayer0.getOnShowEvent(), new o(AndroidShow.this, this.$adObject, this.$activity, this.$showOptions, null) {
                    final Activity $activity;
                    final AdObject $ad;
                    final AdObject $adObject;
                    final UnityAdsShowOptions $showOptions;
                    int label;

                    {
                        this.$ad = adObject0;
                        AndroidShow.this = androidShow0;
                        this.$adObject = adObject1;
                        this.$activity = activity0;
                        this.$showOptions = unityAdsShowOptions0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.core.domain.AndroidShow.invoke.1.2(this.$ad, AndroidShow.this, this.$adObject, this.$activity, this.$showOptions, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((j)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l j j0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.AndroidShow.invoke.1.2)this.create(j0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.label != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        AdObject adObject0 = this.$ad;
                        GameServerIdReader gameServerIdReader0 = AndroidShow.this.gameServerIdReader;
                        Object object1 = gameServerIdReader0.getJsonStorage().get(gameServerIdReader0.getKey());
                        Map map0 = null;
                        if(object1 == null) {
                            object1 = null;
                        }
                        else {
                            L.o(object1, "get(key)");
                            if(!(object1 instanceof String)) {
                                object1 = null;
                            }
                            if(object1 == null) {
                                object1 = null;
                            }
                        }
                        Object object2 = gameServerIdReader0.getJsonStorage().get(gameServerIdReader0.getKey());
                        if(object2 != null) {
                            L.o(object2, "get(key)");
                            gameServerIdReader0.getJsonStorage().delete(gameServerIdReader0.getKey());
                        }
                        adObject0.setPlayerServerId(((String)object1));
                        DefaultImpls.invoke$default(AndroidShow.this.sendDiagnosticEvent, "native_show_event_flow_started", null, null, null, this.$adObject, 14, null);
                        AdPlayer adPlayer0 = this.$ad.getAdPlayer();
                        WeakReference weakReference0 = new WeakReference(this.$activity);
                        JSONObject jSONObject0 = this.$showOptions.getData();
                        if(jSONObject0 != null) {
                            map0 = JSONObjectExtensionsKt.toBuiltInMap(jSONObject0);
                        }
                        adPlayer0.show(new AndroidShowOptions(weakReference0, map0, this.$ad.getPlacementId(), this.$ad.isScarAd(), this.$ad.getScarQueryId(), this.$ad.getScarAdString(), this.$ad.getScarAdUnitId(), this.$ad.isOfferwallAd(), this.$ad.getOfferwallPlacementName()));
                        return S0.a;
                    }
                }), new p(this.$adObject, byteString1, null) {
                    final AdObject $adObject;
                    final ByteString $opportunityId;
                    int label;

                    {
                        AndroidShow.this = androidShow0;
                        this.$adObject = adObject0;
                        this.$opportunityId = byteString0;
                        super(3, d0);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.invoke(((j)object0), ((Throwable)object1), ((d)object2));
                    }

                    @m
                    public final Object invoke(@l j j0, @m Throwable throwable0, @m d d0) {
                        return new com.unity3d.ads.core.domain.AndroidShow.invoke.1.3(AndroidShow.this, this.$adObject, this.$opportunityId, d0).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                DefaultImpls.invoke$default(AndroidShow.this.sendDiagnosticEvent, "native_show_event_flow_completed", null, null, null, this.$adObject, 14, null);
                                this.label = 1;
                                return AndroidShow.this.adRepository.removeAd(this.$opportunityId, this) == object1 ? object1 : S0.a;
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
                }), new p() {
                    private Object L$0;
                    Object L$1;
                    int label;

                    {
                        super(3, d0);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.invoke(((j)object0), ((ShowEvent)object1), ((d)object2));
                    }

                    @m
                    public final Object invoke(@l j j0, @l ShowEvent showEvent0, @m d d0) {
                        com.unity3d.ads.core.domain.AndroidShow.invoke.1.4 androidShow$invoke$1$40 = new com.unity3d.ads.core.domain.AndroidShow.invoke.1.4(d0);
                        androidShow$invoke$1$40.L$0 = j0;
                        androidShow$invoke$1$40.L$1 = showEvent0;
                        return androidShow$invoke$1$40.invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        ShowEvent showEvent1;
                        Object object1 = b.l();
                        boolean z = true;
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                j j0 = (j)this.L$0;
                                ShowEvent showEvent0 = (ShowEvent)this.L$1;
                                this.L$0 = showEvent0;
                                this.label = 1;
                                if(j0.emit(showEvent0, this) == object1) {
                                    return object1;
                                }
                                showEvent1 = showEvent0;
                                break;
                            }
                            case 1: {
                                showEvent1 = (ShowEvent)this.L$0;
                                f0.n(object0);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(showEvent1 instanceof Completed || showEvent1 instanceof Error) {
                            z = false;
                        }
                        return kotlin.coroutines.jvm.internal.b.a(z);
                    }
                });
                com.unity3d.ads.core.domain.AndroidShow.invoke.1.5 androidShow$invoke$1$50 = new j() {
                    @m
                    public final Object emit(@l ShowEvent showEvent0, @l d d0) {
                        Map map0 = Y.k(r0.a("event", showEvent0.getClass().getSimpleName()));
                        DefaultImpls.invoke$default(this.$adObject.sendDiagnosticEvent, "native_show_event_flow_collected", null, map0, null, j1, 10, null);
                        Object object0 = this.$$this$flow.emit(showEvent0, d0);
                        return object0 == b.l() ? object0 : S0.a;
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    public Object emit(Object object0, d d0) {
                        return this.emit(((ShowEvent)object0), d0);
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                return i0.collect(androidShow$invoke$1$50, this) == object1 ? object1 : S0.a;
            }
        });
    }

    @Override  // com.unity3d.ads.core.domain.Show
    @m
    public Object terminate(@l AdObject adObject0, @l d d0) {
        AdPlayer adPlayer0 = adObject0.getAdPlayer();
        if(adPlayer0 != null) {
            Object object0 = adPlayer0.destroy(d0);
            return object0 == b.l() ? object0 : S0.a;
        }
        return S0.a;
    }
}

