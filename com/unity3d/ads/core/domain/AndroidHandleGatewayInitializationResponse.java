package com.unity3d.ads.core.domain;

import A3.o;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse;
import gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    @l
    private final O sdkScope;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final TransactionEventManager transactionEventManager;
    @l
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(@l TransactionEventManager transactionEventManager0, @l TriggerInitializationCompletedRequest triggerInitializationCompletedRequest0, @l SessionRepository sessionRepository0, @l O o0) {
        L.p(transactionEventManager0, "transactionEventManager");
        L.p(triggerInitializationCompletedRequest0, "triggerInitializationCompletedRequest");
        L.p(sessionRepository0, "sessionRepository");
        L.p(o0, "sdkScope");
        super();
        this.transactionEventManager = transactionEventManager0;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest0;
        this.sessionRepository = sessionRepository0;
        this.sdkScope = o0;
    }

    @Override  // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    @m
    public Object invoke(@l InitializationResponse initializationResponseOuterClass$InitializationResponse0, @l d d0) {
        if(!initializationResponseOuterClass$InitializationResponse0.hasError()) {
            NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration0 = initializationResponseOuterClass$InitializationResponse0.getNativeConfiguration();
            L.o(nativeConfigurationOuterClass$NativeConfiguration0, "response.nativeConfiguration");
            this.sessionRepository.setNativeConfiguration(nativeConfigurationOuterClass$NativeConfiguration0);
            boolean z = !initializationResponseOuterClass$InitializationResponse0.hasUniversalRequestUrl();
            List list0 = this.sessionRepository.getScarEligibleFormats();
            List list1 = initializationResponseOuterClass$InitializationResponse0.getScarEligibleFormatsList();
            L.o(list1, "response.scarEligibleFormatsList");
            list0.addAll(list1);
            if(initializationResponseOuterClass$InitializationResponse0.getTriggerInitializationCompletedRequest()) {
                com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.invoke.2 androidHandleGatewayInitializationResponse$invoke$20 = new o(null) {
                    int label;

                    {
                        AndroidHandleGatewayInitializationResponse.this = androidHandleGatewayInitializationResponse0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.invoke.2(AndroidHandleGatewayInitializationResponse.this, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                this.label = 1;
                                return AndroidHandleGatewayInitializationResponse.this.triggerInitializationCompletedRequest.invoke(this) == object1 ? object1 : S0.a;
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
                k.f(this.sdkScope, null, null, androidHandleGatewayInitializationResponse$invoke$20, 3, null);
            }
            if(initializationResponseOuterClass$InitializationResponse0.getNativeConfiguration().getEnableIapEvent()) {
                this.transactionEventManager.invoke();
            }
            return S0.a;
        }
        L.o("", "response.error.errorText");
        throw new GatewayException("", new IllegalStateException(""), "gateway_initialization", "");
    }
}

