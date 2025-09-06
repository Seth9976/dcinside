package com.unity3d.ads.core.domain;

import A3.o;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class AndroidRefresh implements Refresh {
    @l
    private final K defaultDispatcher;
    @l
    private final GatewayClient gatewayClient;
    @l
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    @l
    private final GetRequestPolicy getRequestPolicy;

    public AndroidRefresh(@l K k0, @l GetAdDataRefreshRequest getAdDataRefreshRequest0, @l GetRequestPolicy getRequestPolicy0, @l GatewayClient gatewayClient0) {
        L.p(k0, "defaultDispatcher");
        L.p(getAdDataRefreshRequest0, "getAdDataRefreshRequest");
        L.p(getRequestPolicy0, "getRequestPolicy");
        L.p(gatewayClient0, "gatewayClient");
        super();
        this.defaultDispatcher = k0;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest0;
        this.getRequestPolicy = getRequestPolicy0;
        this.gatewayClient = gatewayClient0;
    }

    @Override  // com.unity3d.ads.core.domain.Refresh
    @m
    public Object invoke(@l ByteString byteString0, @l ByteString byteString1, @l d d0) {
        com.unity3d.ads.core.domain.AndroidRefresh.invoke.1 androidRefresh$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidRefresh.invoke.1) {
            androidRefresh$invoke$10 = (com.unity3d.ads.core.domain.AndroidRefresh.invoke.1)d0;
            int v = androidRefresh$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidRefresh$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                androidRefresh$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidRefresh$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = androidRefresh$invoke$10.result;
        Object object1 = b.l();
        switch(androidRefresh$invoke$10.label) {
            case 0: {
                f0.n(object0);
                com.unity3d.ads.core.domain.AndroidRefresh.invoke.2 androidRefresh$invoke$20 = new o(byteString1, byteString0, null) {
                    final ByteString $adDataRefreshToken;
                    final ByteString $opportunityId;
                    int label;

                    {
                        AndroidRefresh.this = androidRefresh0;
                        this.$adDataRefreshToken = byteString0;
                        this.$opportunityId = byteString1;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.unity3d.ads.core.domain.AndroidRefresh.invoke.2(AndroidRefresh.this, this.$adDataRefreshToken, this.$opportunityId, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.unity3d.ads.core.domain.AndroidRefresh.invoke.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.label) {
                            case 0: {
                                f0.n(object0);
                                this.label = 1;
                                object0 = AndroidRefresh.this.getAdDataRefreshRequest.invoke(this.$adDataRefreshToken, this.$opportunityId, this);
                                if(object0 == object1) {
                                    return object1;
                                }
                                break;
                            }
                            case 1: {
                                f0.n(object0);
                                break;
                            }
                            case 2: {
                                f0.n(object0);
                                return ((UniversalResponse)object0).getPayload().getAdDataRefreshResponse();
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        RequestPolicy requestPolicy0 = AndroidRefresh.this.getRequestPolicy.invoke();
                        this.label = 2;
                        object0 = DefaultImpls.request$default(AndroidRefresh.this.gatewayClient, null, ((UniversalRequest)object0), requestPolicy0, OperationType.REFRESH, this, 1, null);
                        return object0 == object1 ? object1 : ((UniversalResponse)object0).getPayload().getAdDataRefreshResponse();
                    }
                };
                androidRefresh$invoke$10.label = 1;
                object0 = i.h(this.defaultDispatcher, androidRefresh$invoke$20, androidRefresh$invoke$10);
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
        L.o(object0, "override suspend fun inv…RefreshResponse\n        }");
        return object0;
    }
}

