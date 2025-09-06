package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.r0;
import kotlin.time.s.b.a;
import y4.l;
import y4.m;

public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    @l
    private final GatewayClient gatewayClient;
    @l
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    @l
    private final GetRequestPolicy getRequestPolicy;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidTriggerInitializationCompletedRequest(@l GetInitializationCompletedRequest getInitializationCompletedRequest0, @l GetRequestPolicy getRequestPolicy0, @l GatewayClient gatewayClient0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(getInitializationCompletedRequest0, "getInitializationCompletedRequest");
        L.p(getRequestPolicy0, "getRequestPolicy");
        L.p(gatewayClient0, "gatewayClient");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.getInitializationCompletedRequest = getInitializationCompletedRequest0;
        this.getRequestPolicy = getRequestPolicy0;
        this.gatewayClient = gatewayClient0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    @m
    public Object invoke(@l d d0) {
        long v3;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest2;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest1;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest0;
        long v2;
        long v1;
        com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.invoke.1 androidTriggerInitializationCompletedRequest$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.invoke.1) {
            androidTriggerInitializationCompletedRequest$invoke$10 = (com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.invoke.1)d0;
            int v = androidTriggerInitializationCompletedRequest$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidTriggerInitializationCompletedRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    long J$0;
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(this);
                    }
                };
            }
            else {
                androidTriggerInitializationCompletedRequest$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidTriggerInitializationCompletedRequest$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                long J$0;
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(this);
                }
            };
        }
        Object object0 = androidTriggerInitializationCompletedRequest$invoke$10.result;
        Object object1 = b.l();
        switch(androidTriggerInitializationCompletedRequest$invoke$10.label) {
            case 0: {
                f0.n(object0);
                v1 = 3264000L;
                DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_completed_event_request_started", null, null, null, null, 30, null);
                try {
                    androidTriggerInitializationCompletedRequest$invoke$10.L$0 = this;
                    androidTriggerInitializationCompletedRequest$invoke$10.J$0 = 3264000L;
                    androidTriggerInitializationCompletedRequest$invoke$10.label = 1;
                    object0 = this.getInitializationCompletedRequest.invoke(androidTriggerInitializationCompletedRequest$invoke$10);
                }
                catch(Exception exception0) {
                    v2 = 3264000L;
                    androidTriggerInitializationCompletedRequest0 = this;
                    break;
                }
                if(object0 == object1) {
                    return object1;
                }
                androidTriggerInitializationCompletedRequest1 = this;
                goto label_37;
            }
            case 1: {
                v1 = androidTriggerInitializationCompletedRequest$invoke$10.J$0;
                androidTriggerInitializationCompletedRequest1 = (AndroidTriggerInitializationCompletedRequest)androidTriggerInitializationCompletedRequest$invoke$10.L$0;
                try {
                    f0.n(object0);
                }
                catch(Exception exception0) {
                    v2 = v1;
                    androidTriggerInitializationCompletedRequest0 = androidTriggerInitializationCompletedRequest1;
                    break;
                }
                try {
                label_37:
                    androidTriggerInitializationCompletedRequest2 = androidTriggerInitializationCompletedRequest1;
                    v3 = v1;
                    RequestPolicy requestPolicy0 = androidTriggerInitializationCompletedRequest1.getRequestPolicy.invoke();
                    androidTriggerInitializationCompletedRequest$invoke$10.L$0 = androidTriggerInitializationCompletedRequest1;
                    androidTriggerInitializationCompletedRequest$invoke$10.J$0 = v1;
                    androidTriggerInitializationCompletedRequest$invoke$10.label = 2;
                    androidTriggerInitializationCompletedRequest2 = androidTriggerInitializationCompletedRequest1;
                    v3 = v1;
                    object0 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(androidTriggerInitializationCompletedRequest1.gatewayClient, null, ((UniversalRequest)object0), requestPolicy0, OperationType.INITIALIZATION_COMPLETED, androidTriggerInitializationCompletedRequest$invoke$10, 1, null);
                }
                catch(Exception exception0) {
                    androidTriggerInitializationCompletedRequest0 = androidTriggerInitializationCompletedRequest2;
                    v2 = v3;
                    break;
                }
                if(object0 == object1) {
                    return object1;
                }
                androidTriggerInitializationCompletedRequest0 = androidTriggerInitializationCompletedRequest2;
                v2 = v3;
                goto label_59;
            }
            case 2: {
                v2 = androidTriggerInitializationCompletedRequest$invoke$10.J$0;
                androidTriggerInitializationCompletedRequest0 = (AndroidTriggerInitializationCompletedRequest)androidTriggerInitializationCompletedRequest$invoke$10.L$0;
                try {
                    f0.n(object0);
                label_59:
                    if(((UniversalResponse)object0).hasError()) {
                        Double double0 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v2)));
                        Map map0 = Y.W(new V[]{r0.a("operation", OperationType.INITIALIZATION_COMPLETED.toString()), r0.a("reason", "gateway"), r0.a("reason_debug", "")});
                        DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest0.sendDiagnosticEvent, "native_initialization_completed_event_request_failure_time", double0, map0, null, null, 24, null);
                        return S0.a;
                    }
                    goto label_69;
                }
                catch(Exception exception0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Double double1 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v2)));
        Map map1 = Y.W(new V[]{r0.a("operation", OperationType.INITIALIZATION_COMPLETED.toString()), r0.a("reason", "uncaught_exception"), r0.a("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(exception0, 0, 1, null))});
        DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest0.sendDiagnosticEvent, "native_initialization_completed_event_request_failure_time", double1, map1, null, null, 24, null);
        return S0.a;
    label_69:
        Double double2 = kotlin.coroutines.jvm.internal.b.d(TimeExtensionsKt.elapsedMillis(a.d(v2)));
        DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest0.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", double2, null, null, null, 28, null);
        return S0.a;
    }
}

