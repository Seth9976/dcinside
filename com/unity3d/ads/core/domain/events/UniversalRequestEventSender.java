package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class UniversalRequestEventSender {
    @l
    private final GatewayClient gatewayClient;
    @l
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    @l
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    public UniversalRequestEventSender(@l GatewayClient gatewayClient0, @l HandleGatewayEventResponse handleGatewayEventResponse0, @l UniversalRequestTtlValidator universalRequestTtlValidator0) {
        L.p(gatewayClient0, "gatewayClient");
        L.p(handleGatewayEventResponse0, "handleGatewayEventResponse");
        L.p(universalRequestTtlValidator0, "universalRequestTtlValidator");
        super();
        this.gatewayClient = gatewayClient0;
        this.handleGatewayEventResponse = handleGatewayEventResponse0;
        this.universalRequestTtlValidator = universalRequestTtlValidator0;
    }

    @m
    public final Object invoke(@l UniversalRequest universalRequestOuterClass$UniversalRequest0, @l RequestPolicy requestPolicy0, @l d d0) {
        Object object2;
        UniversalRequestEventSender universalRequestEventSender0;
        com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke.1 universalRequestEventSender$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke.1) {
            universalRequestEventSender$invoke$10 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke.1)d0;
            int v = universalRequestEventSender$invoke$10.label;
            if((v & 0x80000000) == 0) {
                universalRequestEventSender$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, this);
                    }
                };
            }
            else {
                universalRequestEventSender$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            universalRequestEventSender$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, this);
                }
            };
        }
        Object object0 = universalRequestEventSender$invoke$10.result;
        Object object1 = b.l();
        switch(universalRequestEventSender$invoke$10.label) {
            case 0: {
                f0.n(object0);
                if(!this.universalRequestTtlValidator.invoke(universalRequestOuterClass$UniversalRequest0, requestPolicy0)) {
                    return S0.a;
                }
                try {
                    universalRequestEventSender$invoke$10.L$0 = this;
                    universalRequestEventSender$invoke$10.label = 1;
                    object0 = DefaultImpls.request$default(this.gatewayClient, null, universalRequestOuterClass$UniversalRequest0, requestPolicy0, OperationType.UNIVERSAL_EVENT, universalRequestEventSender$invoke$10, 1, null);
                }
                catch(Throwable throwable0) {
                    universalRequestEventSender0 = this;
                    break;
                }
                if(object0 == object1) {
                    return object1;
                }
                universalRequestEventSender0 = this;
                object2 = e0.b(((UniversalResponse)object0));
                goto label_35;
            }
            case 1: {
                universalRequestEventSender0 = (UniversalRequestEventSender)universalRequestEventSender$invoke$10.L$0;
                try {
                    f0.n(object0);
                    object2 = e0.b(((UniversalResponse)object0));
                    goto label_35;
                }
                catch(Throwable throwable0) {
                }
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
        object2 = e0.b(f0.a(throwable0));
    label_35:
        if(e0.e(object2) instanceof GatewayException) {
            return S0.a;
        }
        f0.n(object2);
        universalRequestEventSender$invoke$10.L$0 = null;
        universalRequestEventSender$invoke$10.label = 2;
        return universalRequestEventSender0.handleGatewayEventResponse.invoke(((UniversalResponse)object2), universalRequestEventSender$invoke$10) == object1 ? object1 : S0.a;
    }
}

