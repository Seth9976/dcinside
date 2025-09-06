package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class GetOperativeEventApi {
    @l
    private final OperativeEventRepository operativeEventRepository;
    @l
    private final GetOperativeEventRequest operativeEventRequest;

    public GetOperativeEventApi(@l OperativeEventRepository operativeEventRepository0, @l GetOperativeEventRequest getOperativeEventRequest0) {
        L.p(operativeEventRepository0, "operativeEventRepository");
        L.p(getOperativeEventRequest0, "operativeEventRequest");
        super();
        this.operativeEventRepository = operativeEventRepository0;
        this.operativeEventRequest = getOperativeEventRequest0;
    }

    @m
    public final Object invoke(@l OperativeEventType operativeEventRequestOuterClass$OperativeEventType0, @l ByteString byteString0, @l ByteString byteString1, @l ByteString byteString2, @m String s, @l d d0) {
        GetOperativeEventApi getOperativeEventApi0;
        com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke.1 getOperativeEventApi$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke.1) {
            getOperativeEventApi$invoke$10 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke.1)d0;
            int v = getOperativeEventApi$invoke$10.label;
            if((v & 0x80000000) == 0) {
                getOperativeEventApi$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, null, null, null, null, this);
                    }
                };
            }
            else {
                getOperativeEventApi$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            getOperativeEventApi$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, null, null, null, null, this);
                }
            };
        }
        Object object0 = getOperativeEventApi$invoke$10.result;
        Object object1 = b.l();
        switch(getOperativeEventApi$invoke$10.label) {
            case 0: {
                f0.n(object0);
                getOperativeEventApi$invoke$10.L$0 = this;
                getOperativeEventApi$invoke$10.label = 1;
                object0 = this.operativeEventRequest.invoke(operativeEventRequestOuterClass$OperativeEventType0, byteString1, byteString0, byteString2, s, getOperativeEventApi$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                getOperativeEventApi0 = this;
                break;
            }
            case 1: {
                getOperativeEventApi0 = (GetOperativeEventApi)getOperativeEventApi$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        getOperativeEventApi0.operativeEventRepository.addOperativeEvent(((OperativeEventRequest)object0));
        return S0.a;
    }

    @m
    public final Object invoke(@l OperativeEventType operativeEventRequestOuterClass$OperativeEventType0, @l AdObject adObject0, @l ByteString byteString0, @l d d0) {
        Object object0 = this.invoke(operativeEventRequestOuterClass$OperativeEventType0, adObject0.getOpportunityId(), adObject0.getTrackingToken(), byteString0, adObject0.getPlayerServerId(), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public static Object invoke$default(GetOperativeEventApi getOperativeEventApi0, OperativeEventType operativeEventRequestOuterClass$OperativeEventType0, ByteString byteString0, ByteString byteString1, ByteString byteString2, String s, d d0, int v, Object object0) {
        if((v & 16) != 0) {
            s = null;
        }
        return getOperativeEventApi0.invoke(operativeEventRequestOuterClass$OperativeEventType0, byteString0, byteString1, byteString2, s, d0);
    }
}

