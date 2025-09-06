package com.unity3d.ads.core.domain.scar;

import A3.o;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge.BannerEvent;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.S0;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.K;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class CommonScarEventReceiver implements IEventSender {
    @l
    private final D _gmaEventFlow;
    @l
    private final D _versionFlow;
    @l
    private final I gmaEventFlow;
    @l
    private final O scope;
    @l
    private final I versionFlow;

    public CommonScarEventReceiver(@l O o0) {
        L.p(o0, "scope");
        super();
        this.scope = o0;
        D d0 = K.b(0, 0, null, 7, null);
        this._versionFlow = d0;
        this.versionFlow = k.l(d0);
        D d1 = K.b(0, 0, null, 7, null);
        this._gmaEventFlow = d1;
        this.gmaEventFlow = k.l(d1);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    @l
    public final I getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    @l
    public final I getVersionFlow() {
        return this.versionFlow;
    }

    @Override  // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@l Enum enum0, @l Enum enum1, @l Object[] arr_object) {
        L.p(enum0, "eventCategory");
        L.p(enum1, "eventId");
        L.p(arr_object, "params");
        if(!u.W1(k0.u(new WebViewEventCategory[]{WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER}), enum0)) {
            return false;
        }
        com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.sendEvent.1 commonScarEventReceiver$sendEvent$10 = new o(arr_object, this, null) {
            final Enum $eventId;
            final Object[] $params;
            int label;

            {
                this.$eventId = enum0;
                this.$params = arr_object;
                CommonScarEventReceiver.this = commonScarEventReceiver0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.sendEvent.1(this.$eventId, this.$params, CommonScarEventReceiver.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.sendEvent.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        Enum enum0 = this.$eventId;
                        if(enum0 == c.f) {
                            String s = (String)this.$params[0];
                            D d0 = CommonScarEventReceiver.this._versionFlow;
                            if(L.g(s, "0.0.0")) {
                                s = null;
                            }
                            this.label = 1;
                            if(d0.emit(s, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            c c0 = c.k;
                            if(enum0 == c0) {
                                Object object2 = this.$params[0];
                                L.n(object2, "null cannot be cast to non-null type kotlin.String");
                                GmaEventData gmaEventData0 = new GmaEventData(c0, null, null, ((String)object2), null, null, null, 0x76, null);
                                this.label = 2;
                                if(CommonScarEventReceiver.this._gmaEventFlow.emit(gmaEventData0, this) == object1) {
                                    return object1;
                                }
                            }
                            else {
                                c c1 = c.p;
                                if(enum0 == c1) {
                                    Object object3 = this.$params[0];
                                    L.n(object3, "null cannot be cast to non-null type kotlin.String");
                                    Object object4 = this.$params[1];
                                    L.n(object4, "null cannot be cast to non-null type kotlin.String");
                                    Object object5 = this.$params[2];
                                    L.n(object5, "null cannot be cast to non-null type kotlin.String");
                                    Object object6 = this.$params[3];
                                    L.n(object6, "null cannot be cast to non-null type kotlin.Int");
                                    GmaEventData gmaEventData1 = new GmaEventData(c1, null, null, ((String)object3), ((String)object4), ((String)object5), ((Integer)object6), 6, null);
                                    this.label = 3;
                                    if(CommonScarEventReceiver.this._gmaEventFlow.emit(gmaEventData1, this) == object1) {
                                        return object1;
                                    }
                                }
                                else {
                                    if(enum0 instanceof c) {
                                        GmaEventData gmaEventData2 = new GmaEventData(((c)this.$eventId), null, null, null, null, null, null, 0x7E, null);
                                        this.label = 4;
                                        if(CommonScarEventReceiver.this._gmaEventFlow.emit(gmaEventData2, this) == object1) {
                                            return object1;
                                        }
                                    }
                                label_44:
                                    if(this.$eventId instanceof BannerEvent) {
                                        Object object7 = this.$params[0];
                                        L.n(object7, "null cannot be cast to non-null type kotlin.String");
                                        GmaEventData gmaEventData3 = new GmaEventData(c.G, ((BannerEvent)this.$eventId), ((String)object7), null, null, null, null, 120, null);
                                        this.label = 5;
                                        if(CommonScarEventReceiver.this._gmaEventFlow.emit(gmaEventData3, this) == object1) {
                                            return object1;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 4: {
                        f0.n(object0);
                        goto label_44;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 5: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        };
        kotlinx.coroutines.k.f(this.scope, null, null, commonScarEventReceiver$sendEvent$10, 3, null);
        return true;
    }
}

