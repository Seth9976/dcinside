package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii;
import gatewayprotocol.v1.MutableDataOuterClass.MutableData;
import gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters;
import gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.E;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidHandleGatewayUniversalResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHandleGatewayUniversalResponse.kt\ncom/unity3d/ads/core/domain/AndroidHandleGatewayUniversalResponse\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,48:1\n230#2,5:49\n*S KotlinDebug\n*F\n+ 1 AndroidHandleGatewayUniversalResponse.kt\ncom/unity3d/ads/core/domain/AndroidHandleGatewayUniversalResponse\n*L\n27#1:49,5\n*E\n"})
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final SessionRepository sessionRepository;

    public AndroidHandleGatewayUniversalResponse(@l SessionRepository sessionRepository0, @l DeviceInfoRepository deviceInfoRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        super();
        this.sessionRepository = sessionRepository0;
        this.deviceInfoRepository = deviceInfoRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    @m
    public Object invoke(@l UniversalResponse universalResponseOuterClass$UniversalResponse0, @l d d0) {
        AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse0;
        MutableData mutableDataOuterClass$MutableData0;
        com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.invoke.1 androidHandleGatewayUniversalResponse$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.invoke.1) {
            androidHandleGatewayUniversalResponse$invoke$10 = (com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse.invoke.1)d0;
            int v = androidHandleGatewayUniversalResponse$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidHandleGatewayUniversalResponse$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(null, this);
                    }
                };
            }
            else {
                androidHandleGatewayUniversalResponse$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidHandleGatewayUniversalResponse$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(null, this);
                }
            };
        }
        Object object0 = androidHandleGatewayUniversalResponse$invoke$10.result;
        Object object1 = b.l();
        switch(androidHandleGatewayUniversalResponse$invoke$10.label) {
            case 0: {
                f0.n(object0);
                if(universalResponseOuterClass$UniversalResponse0.hasError()) {
                    L.o("", "response.error.errorText");
                    throw new GatewayException("", new IllegalStateException(""), "gateway_universal", "");
                }
                else if(universalResponseOuterClass$UniversalResponse0.hasMutableData()) {
                    mutableDataOuterClass$MutableData0 = universalResponseOuterClass$UniversalResponse0.getMutableData();
                    E e0 = this.deviceInfoRepository.getAllowedPii();
                    do {
                        Object object2 = e0.getValue();
                        AllowedPii allowedPiiOuterClass$AllowedPii0 = (AllowedPii)object2;
                        AllowedPii allowedPiiOuterClass$AllowedPii1 = mutableDataOuterClass$MutableData0.getAllowedPii();
                        L.o(allowedPiiOuterClass$AllowedPii1, "mutableData.allowedPii");
                    }
                    while(!e0.compareAndSet(object2, allowedPiiOuterClass$AllowedPii1));
                    ByteString byteString0 = mutableDataOuterClass$MutableData0.getCurrentState();
                    L.o(byteString0, "mutableData.currentState");
                    this.sessionRepository.setGatewayState(byteString0);
                    if(mutableDataOuterClass$MutableData0.hasSessionToken()) {
                        ByteString byteString1 = mutableDataOuterClass$MutableData0.getSessionToken();
                        L.o(byteString1, "mutableData.sessionToken");
                        this.sessionRepository.setSessionToken(byteString1);
                    }
                    if(mutableDataOuterClass$MutableData0.hasPrivacy()) {
                        ByteString byteString2 = mutableDataOuterClass$MutableData0.getPrivacy();
                        L.o(byteString2, "mutableData.privacy");
                        androidHandleGatewayUniversalResponse$invoke$10.L$0 = this;
                        androidHandleGatewayUniversalResponse$invoke$10.L$1 = mutableDataOuterClass$MutableData0;
                        androidHandleGatewayUniversalResponse$invoke$10.label = 1;
                        if(this.sessionRepository.setPrivacy(byteString2, androidHandleGatewayUniversalResponse$invoke$10) == object1) {
                            return object1;
                        }
                    }
                    androidHandleGatewayUniversalResponse0 = this;
                    goto label_47;
                }
                break;
            }
            case 1: {
                mutableDataOuterClass$MutableData0 = (MutableData)androidHandleGatewayUniversalResponse$invoke$10.L$1;
                androidHandleGatewayUniversalResponse0 = (AndroidHandleGatewayUniversalResponse)androidHandleGatewayUniversalResponse$invoke$10.L$0;
                f0.n(object0);
            label_47:
                if(mutableDataOuterClass$MutableData0.hasSessionCounters()) {
                    SessionCounters sessionCountersOuterClass$SessionCounters0 = mutableDataOuterClass$MutableData0.getSessionCounters();
                    L.o(sessionCountersOuterClass$SessionCounters0, "mutableData.sessionCounters");
                    androidHandleGatewayUniversalResponse0.sessionRepository.setSessionCounters(sessionCountersOuterClass$SessionCounters0);
                }
                if(mutableDataOuterClass$MutableData0.hasCache()) {
                    ByteString byteString3 = mutableDataOuterClass$MutableData0.getCache();
                    L.o(byteString3, "mutableData.cache");
                    androidHandleGatewayUniversalResponse$invoke$10.L$0 = androidHandleGatewayUniversalResponse0;
                    androidHandleGatewayUniversalResponse$invoke$10.L$1 = mutableDataOuterClass$MutableData0;
                    androidHandleGatewayUniversalResponse$invoke$10.label = 2;
                    if(androidHandleGatewayUniversalResponse0.sessionRepository.setGatewayCache(byteString3, androidHandleGatewayUniversalResponse$invoke$10) == object1) {
                        return object1;
                    }
                }
                goto label_62;
            }
            case 2: {
                mutableDataOuterClass$MutableData0 = (MutableData)androidHandleGatewayUniversalResponse$invoke$10.L$1;
                androidHandleGatewayUniversalResponse0 = (AndroidHandleGatewayUniversalResponse)androidHandleGatewayUniversalResponse$invoke$10.L$0;
                f0.n(object0);
            label_62:
                if(mutableDataOuterClass$MutableData0.hasPrivacyFsm()) {
                    ByteString byteString4 = mutableDataOuterClass$MutableData0.getPrivacyFsm();
                    L.o(byteString4, "mutableData.privacyFsm");
                    androidHandleGatewayUniversalResponse$invoke$10.L$0 = null;
                    androidHandleGatewayUniversalResponse$invoke$10.L$1 = null;
                    androidHandleGatewayUniversalResponse$invoke$10.label = 3;
                    return androidHandleGatewayUniversalResponse0.sessionRepository.setPrivacyFsm(byteString4, androidHandleGatewayUniversalResponse$invoke$10) == object1 ? object1 : S0.a;
                }
                break;
            }
            case 3: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return S0.a;
    }
}

