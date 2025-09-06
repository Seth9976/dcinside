package com.unity3d.ads.gatewayclient;

import A3.o;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.ErrorOuterClass.Error;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest;
import gatewayprotocol.v1.UniversalResponseKt.Dsl;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import java.util.Map;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.random.f;
import kotlin.time.r;
import kotlin.time.s.b.a;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.u1;
import y4.l;
import y4.m;

@s0({"SMAP\nCommonGatewayClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonGatewayClient.kt\ncom/unity3d/ads/gatewayclient/CommonGatewayClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 UniversalResponseKt.kt\ngatewayprotocol/v1/UniversalResponseKtKt\n+ 4 ErrorKt.kt\ngatewayprotocol/v1/ErrorKtKt\n*L\n1#1,261:1\n1#2:262\n1#2:264\n1#2:266\n10#3:263\n10#4:265\n*S KotlinDebug\n*F\n+ 1 CommonGatewayClient.kt\ncom/unity3d/ads/gatewayclient/CommonGatewayClient\n*L\n225#1:264\n226#1:266\n225#1:263\n226#1:265\n*E\n"})
public final class CommonGatewayClient implements GatewayClient {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    @l
    public static final Companion Companion = null;
    @l
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    @l
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    @l
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    @l
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    @l
    private final HttpClient httpClient;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @l
    private final SessionRepository sessionRepository;

    static {
        CommonGatewayClient.Companion = new Companion(null);
    }

    public CommonGatewayClient(@l HttpClient httpClient0, @l HandleGatewayUniversalResponse handleGatewayUniversalResponse0, @l SendDiagnosticEvent sendDiagnosticEvent0, @l SessionRepository sessionRepository0) {
        L.p(httpClient0, "httpClient");
        L.p(handleGatewayUniversalResponse0, "handleGatewayUniversalResponse");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.httpClient = httpClient0;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
        this.sessionRepository = sessionRepository0;
    }

    private final HttpRequest buildHttpRequest(String s, Map map0, RequestPolicy requestPolicy0, UniversalRequest universalRequestOuterClass$UniversalRequest0) {
        byte[] arr_b = universalRequestOuterClass$UniversalRequest0.toByteArray();
        return new HttpRequest(s, null, RequestType.POST, arr_b, map0, null, null, null, null, requestPolicy0.getConnectTimeout(), requestPolicy0.getReadTimeout(), requestPolicy0.getWriteTimeout(), requestPolicy0.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long v, RequestPolicy requestPolicy0, int v1) {
        return Math.min(this.calculateExponentialBackoff(v, requestPolicy0, v1) + this.calculateJitter(requestPolicy0.getRetryWaitBase(), requestPolicy0.getRetryJitterPct()), requestPolicy0.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long v, RequestPolicy requestPolicy0, int v1) {
        return v1 == 0 ? v : ((long)(((float)v) * requestPolicy0.getRetryScalingFactor()));
    }

    private final long calculateJitter(int v, float f) {
        if(f == 0.0f) {
            return 0L;
        }
        long v1 = (long)(((float)v) * f);
        return f.a.q(-v1, v1);
    }

    private final Object executeRequest(HttpRequest httpRequest0, int v, OperationType operationType0, d d0) {
        int v4;
        CommonGatewayClient commonGatewayClient0;
        int v3;
        OperationType operationType1;
        long v2;
        com.unity3d.ads.gatewayclient.CommonGatewayClient.executeRequest.1 commonGatewayClient$executeRequest$10;
        if(d0 instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient.executeRequest.1) {
            commonGatewayClient$executeRequest$10 = (com.unity3d.ads.gatewayclient.CommonGatewayClient.executeRequest.1)d0;
            int v1 = commonGatewayClient$executeRequest$10.label;
            if((v1 & 0x80000000) == 0) {
                commonGatewayClient$executeRequest$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int I$0;
                    long J$0;
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.executeRequest(null, 0, null, this);
                    }
                };
            }
            else {
                commonGatewayClient$executeRequest$10.label = v1 ^ 0x80000000;
            }
        }
        else {
            commonGatewayClient$executeRequest$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int I$0;
                long J$0;
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.executeRequest(null, 0, null, this);
                }
            };
        }
        Object object0 = commonGatewayClient$executeRequest$10.result;
        Object object1 = b.l();
        switch(commonGatewayClient$executeRequest$10.label) {
            case 0: {
                f0.n(object0);
                v2 = 3360600L;
                commonGatewayClient$executeRequest$10.L$0 = this;
                operationType1 = operationType0;
                commonGatewayClient$executeRequest$10.L$1 = operationType1;
                v3 = v;
                try {
                    commonGatewayClient$executeRequest$10.I$0 = v3;
                    commonGatewayClient$executeRequest$10.J$0 = 3360600L;
                    commonGatewayClient$executeRequest$10.label = 1;
                    object0 = this.httpClient.execute(httpRequest0, commonGatewayClient$executeRequest$10);
                }
                catch(UnityAdsNetworkException unityAdsNetworkException0) {
                    commonGatewayClient0 = this;
                    commonGatewayClient0.sendNetworkErrorDiagnosticEvent(unityAdsNetworkException0, v3, operationType1, a.d(v2));
                    return HttpResponseKt.toHttpResponse(unityAdsNetworkException0);
                }
                catch(s1 unused_ex) {
                    commonGatewayClient0 = this;
                    goto label_58;
                }
                if(object0 == object1) {
                    return object1;
                }
                commonGatewayClient0 = this;
                v4 = v3;
                break;
            }
            case 1: {
                long v5 = commonGatewayClient$executeRequest$10.J$0;
                v4 = commonGatewayClient$executeRequest$10.I$0;
                OperationType operationType2 = (OperationType)commonGatewayClient$executeRequest$10.L$1;
                commonGatewayClient0 = (CommonGatewayClient)commonGatewayClient$executeRequest$10.L$0;
                try {
                    f0.n(object0);
                    operationType1 = operationType2;
                    v2 = v5;
                    break;
                }
                catch(UnityAdsNetworkException unityAdsNetworkException0) {
                    v3 = v4;
                    operationType1 = operationType2;
                    v2 = v5;
                    commonGatewayClient0.sendNetworkErrorDiagnosticEvent(unityAdsNetworkException0, v3, operationType1, a.d(v2));
                    return HttpResponseKt.toHttpResponse(unityAdsNetworkException0);
                }
                catch(s1 unused_ex) {
                    v3 = v4;
                    operationType1 = operationType2;
                    v2 = v5;
                    goto label_58;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            commonGatewayClient0.sendNetworkSuccessDiagnosticEvent(((HttpResponse)object0), v4, operationType1, a.d(v2));
            return (HttpResponse)object0;
        }
        catch(UnityAdsNetworkException unityAdsNetworkException0) {
            v3 = v4;
            commonGatewayClient0.sendNetworkErrorDiagnosticEvent(unityAdsNetworkException0, v3, operationType1, a.d(v2));
            return HttpResponseKt.toHttpResponse(unityAdsNetworkException0);
        }
        catch(s1 unused_ex) {
            v3 = v4;
        }
    label_58:
        NetworkTimeoutException networkTimeoutException0 = new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 0x7E, null);
        commonGatewayClient0.sendNetworkErrorDiagnosticEvent(networkTimeoutException0, v3, operationType1, a.d(v2));
        throw networkTimeoutException0;
    }

    private final Object executeWithRetry(String s, UniversalRequest universalRequestOuterClass$UniversalRequest0, RequestPolicy requestPolicy0, OperationType operationType0, d d0) {
        long v12;
        long v9;
        CommonGatewayClient commonGatewayClient3;
        RequestPolicy requestPolicy3;
        long v8;
        String s4;
        CommonGatewayClient commonGatewayClient2;
        UniversalRequest universalRequestOuterClass$UniversalRequest2;
        RequestPolicy requestPolicy2;
        OperationType operationType2;
        int v6;
        long v4;
        RequestPolicy requestPolicy1;
        UniversalRequest universalRequestOuterClass$UniversalRequest1;
        com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry.1 commonGatewayClient$executeWithRetry$11;
        String s2;
        long v3;
        int v2;
        long v1;
        CommonGatewayClient commonGatewayClient0;
        OperationType operationType1;
        com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry.1 commonGatewayClient$executeWithRetry$10;
        if(d0 instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry.1) {
            commonGatewayClient$executeWithRetry$10 = (com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry.1)d0;
            int v = commonGatewayClient$executeWithRetry$10.label;
            if((v & 0x80000000) == 0) {
                commonGatewayClient$executeWithRetry$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    int I$0;
                    long J$0;
                    long J$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.executeWithRetry(null, null, null, null, this);
                    }
                };
            }
            else {
                commonGatewayClient$executeWithRetry$10.label = v ^ 0x80000000;
            }
        }
        else {
            commonGatewayClient$executeWithRetry$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                int I$0;
                long J$0;
                long J$1;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.executeWithRetry(null, null, null, null, this);
                }
            };
        }
        Object object0 = commonGatewayClient$executeWithRetry$10.result;
        Object object1 = b.l();
        switch(commonGatewayClient$executeWithRetry$10.label) {
            case 0: {
                f0.n(object0);
                String s1 = this.getGatewayUrl(s);
                operationType1 = operationType0;
                commonGatewayClient0 = this;
                v1 = (long)requestPolicy0.getRetryWaitBase();
                v2 = 0;
                v3 = 0x297F0CL;
                s2 = s1;
                commonGatewayClient$executeWithRetry$11 = commonGatewayClient$executeWithRetry$10;
                universalRequestOuterClass$UniversalRequest1 = universalRequestOuterClass$UniversalRequest0;
                requestPolicy1 = requestPolicy0;
                goto label_64;
            }
            case 1: {
                v4 = commonGatewayClient$executeWithRetry$10.J$1;
                long v5 = commonGatewayClient$executeWithRetry$10.J$0;
                v6 = commonGatewayClient$executeWithRetry$10.I$0;
                String s3 = (String)commonGatewayClient$executeWithRetry$10.L$4;
                operationType2 = (OperationType)commonGatewayClient$executeWithRetry$10.L$3;
                requestPolicy2 = (RequestPolicy)commonGatewayClient$executeWithRetry$10.L$2;
                universalRequestOuterClass$UniversalRequest2 = (UniversalRequest)commonGatewayClient$executeWithRetry$10.L$1;
                CommonGatewayClient commonGatewayClient1 = (CommonGatewayClient)commonGatewayClient$executeWithRetry$10.L$0;
                f0.n(object0);
                commonGatewayClient2 = commonGatewayClient1;
                s4 = s3;
                v3 = v5;
                goto label_85;
            }
            case 2: {
                UniversalResponse universalResponseOuterClass$UniversalResponse0 = (UniversalResponse)commonGatewayClient$executeWithRetry$10.L$0;
                f0.n(object0);
                return universalResponseOuterClass$UniversalResponse0;
            }
            case 3: {
                long v7 = commonGatewayClient$executeWithRetry$10.J$1;
                v8 = commonGatewayClient$executeWithRetry$10.J$0;
                v6 = commonGatewayClient$executeWithRetry$10.I$0;
                String s5 = (String)commonGatewayClient$executeWithRetry$10.L$4;
                OperationType operationType3 = (OperationType)commonGatewayClient$executeWithRetry$10.L$3;
                requestPolicy3 = (RequestPolicy)commonGatewayClient$executeWithRetry$10.L$2;
                UniversalRequest universalRequestOuterClass$UniversalRequest3 = (UniversalRequest)commonGatewayClient$executeWithRetry$10.L$1;
                commonGatewayClient3 = (CommonGatewayClient)commonGatewayClient$executeWithRetry$10.L$0;
                try {
                    f0.n(object0);
                    v9 = v7;
                    v3 = v8;
                    operationType2 = operationType3;
                    commonGatewayClient$executeWithRetry$11 = commonGatewayClient$executeWithRetry$10;
                    requestPolicy1 = requestPolicy3;
                    s2 = s5;
                    universalRequestOuterClass$UniversalRequest2 = universalRequestOuterClass$UniversalRequest3;
                    break;
                }
                catch(s1 unused_ex) {
                    throw new NetworkTimeoutException("Gateway was canceled while waiting for next request, after " + v6 + " retries currentDuration: " + ((long)TimeExtensionsKt.elapsedMillis(a.d(v8))) + "ms maxDuration: " + requestPolicy3.getMaxDuration() + "ms", null, null, null, null, null, null, 0x7E, null);
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            universalRequestOuterClass$UniversalRequest1 = universalRequestOuterClass$UniversalRequest2;
            commonGatewayClient0 = commonGatewayClient3;
            v2 = v6 + 1;
            operationType1 = operationType2;
            v1 = v9;
        label_64:
            HttpRequest httpRequest0 = commonGatewayClient0.buildHttpRequest(s2, commonGatewayClient0.getHeaders(v2), requestPolicy1, universalRequestOuterClass$UniversalRequest1);
            commonGatewayClient$executeWithRetry$11.L$0 = commonGatewayClient0;
            commonGatewayClient$executeWithRetry$11.L$1 = universalRequestOuterClass$UniversalRequest1;
            commonGatewayClient$executeWithRetry$11.L$2 = requestPolicy1;
            commonGatewayClient$executeWithRetry$11.L$3 = operationType1;
            commonGatewayClient$executeWithRetry$11.L$4 = s2;
            commonGatewayClient$executeWithRetry$11.I$0 = v2;
            commonGatewayClient$executeWithRetry$11.J$0 = v3;
            commonGatewayClient$executeWithRetry$11.J$1 = v1;
            commonGatewayClient$executeWithRetry$11.label = 1;
            object0 = commonGatewayClient0.executeRequest(httpRequest0, v2, operationType1, commonGatewayClient$executeWithRetry$11);
            if(object0 == object1) {
                return object1;
            }
            s4 = s2;
            commonGatewayClient2 = commonGatewayClient0;
            universalRequestOuterClass$UniversalRequest2 = universalRequestOuterClass$UniversalRequest1;
            requestPolicy2 = requestPolicy1;
            operationType2 = operationType1;
            commonGatewayClient$executeWithRetry$10 = commonGatewayClient$executeWithRetry$11;
            v6 = v2;
            v4 = v1;
        label_85:
            commonGatewayClient3 = commonGatewayClient2;
            if(HttpResponseKt.isSuccessful(((HttpResponse)object0))) {
                UniversalResponse universalResponseOuterClass$UniversalResponse1 = commonGatewayClient3.getUniversalResponse(((HttpResponse)object0), operationType2);
                commonGatewayClient$executeWithRetry$10.L$0 = universalResponseOuterClass$UniversalResponse1;
                commonGatewayClient$executeWithRetry$10.L$1 = null;
                commonGatewayClient$executeWithRetry$10.L$2 = null;
                commonGatewayClient$executeWithRetry$10.L$3 = null;
                commonGatewayClient$executeWithRetry$10.L$4 = null;
                commonGatewayClient$executeWithRetry$10.label = 2;
                return commonGatewayClient3.handleGatewayUniversalResponse.invoke(universalResponseOuterClass$UniversalResponse1, commonGatewayClient$executeWithRetry$10) == object1 ? object1 : universalResponseOuterClass$UniversalResponse1;
            }
            long v10 = commonGatewayClient3.calculateDelayTime(v4, requestPolicy2, v6);
            long v11 = (long)TimeExtensionsKt.elapsedMillis(a.d(v3));
            v12 = v11;
            if(!commonGatewayClient3.shouldRetry(((HttpResponse)object0).getStatusCode(), v11 + v10, requestPolicy2.getMaxDuration())) {
                break;
            }
            try {
                commonGatewayClient$executeWithRetry$10.L$0 = commonGatewayClient3;
                commonGatewayClient$executeWithRetry$10.L$1 = universalRequestOuterClass$UniversalRequest2;
                commonGatewayClient$executeWithRetry$10.L$2 = requestPolicy2;
                commonGatewayClient$executeWithRetry$10.L$3 = operationType2;
                commonGatewayClient$executeWithRetry$10.L$4 = s4;
                commonGatewayClient$executeWithRetry$10.I$0 = v6;
                commonGatewayClient$executeWithRetry$10.J$0 = v3;
                commonGatewayClient$executeWithRetry$10.J$1 = v10;
                commonGatewayClient$executeWithRetry$10.label = 3;
                if(a0.b(v10, commonGatewayClient$executeWithRetry$10) == object1) {
                    return object1;
                }
            }
            catch(s1 unused_ex) {
                requestPolicy3 = requestPolicy2;
                v8 = v3;
                throw new NetworkTimeoutException("Gateway was canceled while waiting for next request, after " + v6 + " retries currentDuration: " + ((long)TimeExtensionsKt.elapsedMillis(a.d(v8))) + "ms maxDuration: " + requestPolicy3.getMaxDuration() + "ms", null, null, null, null, null, null, 0x7E, null);
            }
            v9 = v10;
            s2 = s4;
            commonGatewayClient$executeWithRetry$11 = commonGatewayClient$executeWithRetry$10;
            requestPolicy1 = requestPolicy2;
        }
        throw new NetworkTimeoutException("Gateway request failed after " + v6 + " retries  currentDuration: " + v12 + "ms maxDuration: " + requestPolicy2.getMaxDuration() + "ms", null, null, null, null, null, null, 0x7E, null);
    }

    // 去混淆评级： 低(20)
    private final String getGatewayUrl(String s) {
        return L.g(s, "https://gateway.unityads.unity3d.com/v1") ? this.sessionRepository.getGatewayUrl() : s;
    }

    private final Map getHeaders(int v) {
        Map map0 = Y.g();
        map0.put("Content-Type", u.k("application/x-protobuf"));
        if(v > 0) {
            map0.put("X-RETRY-ATTEMPT", u.k(String.valueOf(v)));
        }
        return Y.d(map0);
    }

    private final UniversalResponse getUniversalResponse(HttpResponse httpResponse0, OperationType operationType0) {
        try {
            Object object0 = httpResponse0.getBody();
            if(object0 instanceof byte[]) {
                UniversalResponse universalResponseOuterClass$UniversalResponse0 = UniversalResponse.parseFrom(((byte[])object0));
                L.o(universalResponseOuterClass$UniversalResponse0, "parseFrom(responseBody)");
                return universalResponseOuterClass$UniversalResponse0;
            }
            if(!(object0 instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] arr_b = ((String)object0).getBytes(kotlin.text.f.b);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            UniversalResponse universalResponseOuterClass$UniversalResponse1 = UniversalResponse.parseFrom(arr_b);
            L.o(universalResponseOuterClass$UniversalResponse1, "parseFrom(\n             ….UTF_8)\n                )");
            return universalResponseOuterClass$UniversalResponse1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
        }
        DeviceLog.debug("Failed to parse response from gateway service with exception: %s", new Object[]{invalidProtocolBufferException0.getLocalizedMessage()});
        Map map0 = Y.W(new V[]{r0.a("operation", operationType0.toString()), r0.a("reason", "protobuf_parsing"), r0.a("reason_debug", httpResponse0.getBody().toString())});
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, map0, null, null, 26, null);
        Builder universalResponseOuterClass$UniversalResponse$Builder0 = UniversalResponse.newBuilder();
        L.o(universalResponseOuterClass$UniversalResponse$Builder0, "newBuilder()");
        Dsl universalResponseKt$Dsl0 = Dsl.Companion._create(universalResponseOuterClass$UniversalResponse$Builder0);
        gatewayprotocol.v1.ErrorOuterClass.Error.Builder errorOuterClass$Error$Builder0 = Error.newBuilder();
        L.o(errorOuterClass$Error$Builder0, "newBuilder()");
        gatewayprotocol.v1.ErrorKt.Dsl errorKt$Dsl0 = gatewayprotocol.v1.ErrorKt.Dsl.Companion._create(errorOuterClass$Error$Builder0);
        errorKt$Dsl0.setErrorText("ERROR: Could not parse response from gateway service");
        universalResponseKt$Dsl0.setError(errorKt$Dsl0._build());
        return universalResponseKt$Dsl0._build();
    }

    @Override  // com.unity3d.ads.gatewayclient.GatewayClient
    @m
    public Object request(@l String s, @l UniversalRequest universalRequestOuterClass$UniversalRequest0, @l RequestPolicy requestPolicy0, @l OperationType operationType0, @l d d0) {
        return u1.c(requestPolicy0.getMaxDuration(), new o(s, universalRequestOuterClass$UniversalRequest0, requestPolicy0, operationType0, null) {
            final OperationType $operationType;
            final UniversalRequest $request;
            final RequestPolicy $requestPolicy;
            final String $url;
            int label;

            {
                CommonGatewayClient.this = commonGatewayClient0;
                this.$url = s;
                this.$request = universalRequestOuterClass$UniversalRequest0;
                this.$requestPolicy = requestPolicy0;
                this.$operationType = operationType0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.gatewayclient.CommonGatewayClient.request.2(CommonGatewayClient.this, this.$url, this.$request, this.$requestPolicy, this.$operationType, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.gatewayclient.CommonGatewayClient.request.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        this.label = 1;
                        object0 = CommonGatewayClient.this.executeWithRetry(this.$url, this.$request, this.$requestPolicy, this.$operationType, this);
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

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException0, int v, OperationType operationType0, r r0) {
        if(operationType0 == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        Map map0 = Y.j0(new V[]{r0.a("operation", operationType0.toString()), r0.a("retries", String.valueOf(v)), r0.a("protocol", unityAdsNetworkException0.getProtocol()), r0.a("network_client", unityAdsNetworkException0.getClient()), r0.a("reason_code", String.valueOf(unityAdsNetworkException0.getCode())), r0.a("reason_debug", unityAdsNetworkException0.getMessage())});
        Double double0 = TimeExtensionsKt.elapsedMillis(r0);
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", double0, map0, null, null, 24, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse0, int v, OperationType operationType0, r r0) {
        if(operationType0 == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        Map map0 = Y.j0(new V[]{r0.a("operation", operationType0.toString()), r0.a("retries", String.valueOf(v)), r0.a("protocol", httpResponse0.getProtocol()), r0.a("network_client", httpResponse0.getClient()), r0.a("reason_code", String.valueOf(httpResponse0.getStatusCode()))});
        Double double0 = TimeExtensionsKt.elapsedMillis(r0);
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", double0, map0, null, null, 24, null);
    }

    private final boolean shouldRetry(int v, long v1, int v2) {
        return 400 <= v && v < 600 && v1 < ((long)v2);
    }
}

