package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SendPrivacyUpdateRequest {
    @l
    private final GatewayClient gatewayClient;
    @l
    private final GetPrivacyUpdateRequest getPrivacyUpdateRequest;
    @l
    private final GetRequestPolicy getRequestPolicy;

    public SendPrivacyUpdateRequest(@l GetPrivacyUpdateRequest getPrivacyUpdateRequest0, @l GetRequestPolicy getRequestPolicy0, @l GatewayClient gatewayClient0) {
        L.p(getPrivacyUpdateRequest0, "getPrivacyUpdateRequest");
        L.p(getRequestPolicy0, "getRequestPolicy");
        L.p(gatewayClient0, "gatewayClient");
        super();
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest0;
        this.getRequestPolicy = getRequestPolicy0;
        this.gatewayClient = gatewayClient0;
    }

    @m
    public final Object invoke(int v, @l ByteString byteString0, @l d d0) {
        SendPrivacyUpdateRequest sendPrivacyUpdateRequest0;
        com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.invoke.1 sendPrivacyUpdateRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.invoke.1) {
            sendPrivacyUpdateRequest$invoke$10 = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.invoke.1)d0;
            int v1 = sendPrivacyUpdateRequest$invoke$10.label;
            if((v1 & 0x80000000) == 0) {
                sendPrivacyUpdateRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(0, null, this);
                    }
                };
            }
            else {
                sendPrivacyUpdateRequest$invoke$10.label = v1 ^ 0x80000000;
            }
        }
        else {
            sendPrivacyUpdateRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(0, null, this);
                }
            };
        }
        Object object0 = sendPrivacyUpdateRequest$invoke$10.result;
        Object object1 = b.l();
        switch(sendPrivacyUpdateRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                sendPrivacyUpdateRequest$invoke$10.L$0 = this;
                sendPrivacyUpdateRequest$invoke$10.label = 1;
                object0 = this.getPrivacyUpdateRequest.invoke(v, byteString0, sendPrivacyUpdateRequest$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                sendPrivacyUpdateRequest0 = this;
                goto label_23;
            }
            case 1: {
                sendPrivacyUpdateRequest0 = (SendPrivacyUpdateRequest)sendPrivacyUpdateRequest$invoke$10.L$0;
                f0.n(object0);
            label_23:
                RequestPolicy requestPolicy0 = sendPrivacyUpdateRequest0.getRequestPolicy.invoke();
                sendPrivacyUpdateRequest$invoke$10.L$0 = null;
                sendPrivacyUpdateRequest$invoke$10.label = 2;
                object0 = DefaultImpls.request$default(sendPrivacyUpdateRequest0.gatewayClient, null, ((UniversalRequest)object0), requestPolicy0, OperationType.PRIVACY_UPDATE, sendPrivacyUpdateRequest$invoke$10, 1, null);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0 = ((UniversalResponse)object0).getPayload().getPrivacyUpdateResponse();
        L.o(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0, "response.payload.privacyUpdateResponse");
        return privacyUpdateResponseOuterClass$PrivacyUpdateResponse0;
    }
}

