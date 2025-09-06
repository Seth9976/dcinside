package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo;
import gatewayprotocol.v1.InitializationRequestKt.Dsl;
import gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo;
import gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder;
import gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetInitializationRequestPayload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetInitializationRequestPayload.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload\n+ 2 InitializationRequestKt.kt\ngatewayprotocol/v1/InitializationRequestKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InitializationDeviceInfoKt.kt\ngatewayprotocol/v1/InitializationDeviceInfoKtKt\n+ 5 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n*L\n1#1,70:1\n10#2:71\n1#3:72\n1#3:73\n1#3:75\n10#4:74\n7#5,7:76\n*S KotlinDebug\n*F\n+ 1 AndroidGetInitializationRequestPayload.kt\ncom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload\n*L\n20#1:71\n20#1:72\n28#1:75\n28#1:74\n65#1:76,7\n*E\n"})
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final GetClientInfo getClientInfo;
    @l
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    @l
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    @l
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationRequestPayload(@l GetClientInfo getClientInfo0, @l SessionRepository sessionRepository0, @l DeviceInfoRepository deviceInfoRepository0, @l LegacyUserConsentRepository legacyUserConsentRepository0, @l MediationInitBlobMetadataReader mediationInitBlobMetadataReader0) {
        L.p(getClientInfo0, "getClientInfo");
        L.p(sessionRepository0, "sessionRepository");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(legacyUserConsentRepository0, "legacyUserConsentRepository");
        L.p(mediationInitBlobMetadataReader0, "mediationInitBlobMetadataReader");
        super();
        this.getClientInfo = getClientInfo0;
        this.sessionRepository = sessionRepository0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.legacyUserConsentRepository = legacyUserConsentRepository0;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader0;
    }

    @Override  // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    @m
    public Object invoke(@l d d0) {
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload4;
        Dsl initializationRequestKt$Dsl9;
        Dsl initializationRequestKt$Dsl8;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload3;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload2;
        Dsl initializationRequestKt$Dsl7;
        Dsl initializationRequestKt$Dsl6;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl initializationDeviceInfoKt$Dsl3;
        Dsl initializationRequestKt$Dsl5;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl initializationDeviceInfoKt$Dsl2;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload1;
        Dsl initializationRequestKt$Dsl4;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl initializationDeviceInfoKt$Dsl1;
        gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl initializationDeviceInfoKt$Dsl0;
        Dsl initializationRequestKt$Dsl3;
        Dsl initializationRequestKt$Dsl2;
        Dsl initializationRequestKt$Dsl1;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload0;
        int v1;
        Dsl initializationRequestKt$Dsl0;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke.1 androidGetInitializationRequestPayload$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke.1) {
            androidGetInitializationRequestPayload$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke.1)d0;
            int v = androidGetInitializationRequestPayload$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetInitializationRequestPayload$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
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
                androidGetInitializationRequestPayload$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetInitializationRequestPayload$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                Object L$6;
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
        Object object0 = androidGetInitializationRequestPayload$invoke$10.result;
        Object object1 = b.l();
        Object object2 = null;
        switch(androidGetInitializationRequestPayload$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder initializationRequestOuterClass$InitializationRequest$Builder0 = InitializationRequest.newBuilder();
                L.o(initializationRequestOuterClass$InitializationRequest$Builder0, "newBuilder()");
                initializationRequestKt$Dsl0 = Dsl.Companion._create(initializationRequestOuterClass$InitializationRequest$Builder0);
                Storage storage0 = StorageManager.getStorage(StorageType.PRIVATE);
                if(storage0.readStorage()) {
                    Object object3 = storage0.get("configuration.hasInitialized");
                    Boolean boolean0 = object3 instanceof Boolean ? ((Boolean)object3) : null;
                    v1 = (boolean0 == null ? false : boolean0.booleanValue()) ? 1 : 0;
                }
                else {
                    v1 = 0;
                }
                initializationRequestKt$Dsl0.setIsFirstInit(((boolean)(v1 ^ 1)));
                androidGetInitializationRequestPayload$invoke$10.L$0 = this;
                androidGetInitializationRequestPayload$invoke$10.L$1 = initializationRequestKt$Dsl0;
                androidGetInitializationRequestPayload$invoke$10.L$2 = initializationRequestKt$Dsl0;
                androidGetInitializationRequestPayload$invoke$10.L$3 = initializationRequestKt$Dsl0;
                androidGetInitializationRequestPayload$invoke$10.label = 1;
                object0 = this.getClientInfo.invoke(androidGetInitializationRequestPayload$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidGetInitializationRequestPayload0 = this;
                initializationRequestKt$Dsl1 = initializationRequestKt$Dsl0;
                initializationRequestKt$Dsl2 = initializationRequestKt$Dsl1;
                goto label_46;
            }
            case 1: {
                initializationRequestKt$Dsl0 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$3;
                initializationRequestKt$Dsl1 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$2;
                initializationRequestKt$Dsl2 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$1;
                androidGetInitializationRequestPayload0 = (AndroidGetInitializationRequestPayload)androidGetInitializationRequestPayload$invoke$10.L$0;
                f0.n(object0);
            label_46:
                initializationRequestKt$Dsl0.setClientInfo(((ClientInfo)object0));
                androidGetInitializationRequestPayload$invoke$10.L$0 = androidGetInitializationRequestPayload0;
                androidGetInitializationRequestPayload$invoke$10.L$1 = initializationRequestKt$Dsl2;
                androidGetInitializationRequestPayload$invoke$10.L$2 = initializationRequestKt$Dsl1;
                androidGetInitializationRequestPayload$invoke$10.L$3 = initializationRequestKt$Dsl1;
                androidGetInitializationRequestPayload$invoke$10.label = 2;
                object0 = androidGetInitializationRequestPayload0.deviceInfoRepository.getIdfi(androidGetInitializationRequestPayload$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                initializationRequestKt$Dsl3 = initializationRequestKt$Dsl1;
                goto label_62;
            }
            case 2: {
                initializationRequestKt$Dsl3 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$3;
                initializationRequestKt$Dsl1 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$2;
                initializationRequestKt$Dsl2 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$1;
                androidGetInitializationRequestPayload0 = (AndroidGetInitializationRequestPayload)androidGetInitializationRequestPayload$invoke$10.L$0;
                f0.n(object0);
            label_62:
                initializationRequestKt$Dsl3.setIdfi(((String)object0));
                String s = androidGetInitializationRequestPayload0.deviceInfoRepository.getAnalyticsUserId();
                if(s != null) {
                    initializationRequestKt$Dsl1.setAnalyticsUserId(s);
                }
                initializationRequestKt$Dsl1.setSessionId(androidGetInitializationRequestPayload0.sessionRepository.getSessionId());
                gatewayprotocol.v1.InitializationRequestOuterClass.InitializationDeviceInfo.Builder initializationRequestOuterClass$InitializationDeviceInfo$Builder0 = InitializationDeviceInfo.newBuilder();
                L.o(initializationRequestOuterClass$InitializationDeviceInfo$Builder0, "newBuilder()");
                initializationDeviceInfoKt$Dsl0 = gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl.Companion._create(initializationRequestOuterClass$InitializationDeviceInfo$Builder0);
                initializationDeviceInfoKt$Dsl0.setBundleId(androidGetInitializationRequestPayload0.deviceInfoRepository.getAppName());
                initializationDeviceInfoKt$Dsl0.setDeviceModel(androidGetInitializationRequestPayload0.deviceInfoRepository.getModel());
                initializationDeviceInfoKt$Dsl0.setDeviceMake(androidGetInitializationRequestPayload0.deviceInfoRepository.getManufacturer());
                initializationDeviceInfoKt$Dsl0.setOsVersion(androidGetInitializationRequestPayload0.deviceInfoRepository.getOsVersion());
                androidGetInitializationRequestPayload$invoke$10.L$0 = androidGetInitializationRequestPayload0;
                androidGetInitializationRequestPayload$invoke$10.L$1 = initializationRequestKt$Dsl2;
                androidGetInitializationRequestPayload$invoke$10.L$2 = initializationRequestKt$Dsl1;
                androidGetInitializationRequestPayload$invoke$10.L$3 = initializationDeviceInfoKt$Dsl0;
                androidGetInitializationRequestPayload$invoke$10.L$4 = initializationRequestKt$Dsl1;
                androidGetInitializationRequestPayload$invoke$10.L$5 = initializationDeviceInfoKt$Dsl0;
                androidGetInitializationRequestPayload$invoke$10.L$6 = initializationDeviceInfoKt$Dsl0;
                androidGetInitializationRequestPayload$invoke$10.label = 3;
                object0 = androidGetInitializationRequestPayload0.deviceInfoRepository.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                initializationDeviceInfoKt$Dsl1 = initializationDeviceInfoKt$Dsl0;
                initializationRequestKt$Dsl4 = initializationRequestKt$Dsl2;
                androidGetInitializationRequestPayload1 = androidGetInitializationRequestPayload0;
                initializationDeviceInfoKt$Dsl2 = initializationDeviceInfoKt$Dsl1;
                initializationRequestKt$Dsl5 = initializationRequestKt$Dsl1;
                goto label_99;
            }
            case 3: {
                initializationDeviceInfoKt$Dsl0 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl)androidGetInitializationRequestPayload$invoke$10.L$6;
                initializationDeviceInfoKt$Dsl1 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl)androidGetInitializationRequestPayload$invoke$10.L$5;
                initializationRequestKt$Dsl1 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$4;
                initializationDeviceInfoKt$Dsl2 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl)androidGetInitializationRequestPayload$invoke$10.L$3;
                initializationRequestKt$Dsl5 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$2;
                initializationRequestKt$Dsl4 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$1;
                androidGetInitializationRequestPayload1 = (AndroidGetInitializationRequestPayload)androidGetInitializationRequestPayload$invoke$10.L$0;
                f0.n(object0);
            label_99:
                initializationDeviceInfoKt$Dsl0.setTotalDiskSpace(((StaticDeviceInfo)object0).getTotalDiskSpace());
                androidGetInitializationRequestPayload$invoke$10.L$0 = androidGetInitializationRequestPayload1;
                androidGetInitializationRequestPayload$invoke$10.L$1 = initializationRequestKt$Dsl4;
                androidGetInitializationRequestPayload$invoke$10.L$2 = initializationRequestKt$Dsl5;
                androidGetInitializationRequestPayload$invoke$10.L$3 = initializationDeviceInfoKt$Dsl2;
                androidGetInitializationRequestPayload$invoke$10.L$4 = initializationRequestKt$Dsl1;
                androidGetInitializationRequestPayload$invoke$10.L$5 = initializationDeviceInfoKt$Dsl1;
                androidGetInitializationRequestPayload$invoke$10.L$6 = initializationDeviceInfoKt$Dsl1;
                androidGetInitializationRequestPayload$invoke$10.label = 4;
                object0 = androidGetInitializationRequestPayload1.deviceInfoRepository.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                initializationDeviceInfoKt$Dsl3 = initializationDeviceInfoKt$Dsl1;
                goto label_121;
            }
            case 4: {
                initializationDeviceInfoKt$Dsl3 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl)androidGetInitializationRequestPayload$invoke$10.L$6;
                initializationDeviceInfoKt$Dsl1 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl)androidGetInitializationRequestPayload$invoke$10.L$5;
                initializationRequestKt$Dsl1 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$4;
                initializationDeviceInfoKt$Dsl2 = (gatewayprotocol.v1.InitializationDeviceInfoKt.Dsl)androidGetInitializationRequestPayload$invoke$10.L$3;
                initializationRequestKt$Dsl5 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$2;
                initializationRequestKt$Dsl4 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$1;
                androidGetInitializationRequestPayload1 = (AndroidGetInitializationRequestPayload)androidGetInitializationRequestPayload$invoke$10.L$0;
                f0.n(object0);
            label_121:
                initializationDeviceInfoKt$Dsl3.setTotalRamMemory(((StaticDeviceInfo)object0).getTotalRamMemory());
                initializationDeviceInfoKt$Dsl1.setCurrentUiTheme(((long)androidGetInitializationRequestPayload1.deviceInfoRepository.getCurrentUiTheme()));
                L.o("", "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                initializationDeviceInfoKt$Dsl1.setNetworkOperator("");
                initializationDeviceInfoKt$Dsl1.setBatteryLevel(androidGetInitializationRequestPayload1.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                initializationDeviceInfoKt$Dsl1.setBatteryStatus(androidGetInitializationRequestPayload1.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                initializationDeviceInfoKt$Dsl1.setSystemBootTime(androidGetInitializationRequestPayload1.deviceInfoRepository.getSystemBootTime());
                L.o("", "deviceInfoRepository.dynamicDeviceInfo.language");
                initializationDeviceInfoKt$Dsl1.setLanguage("");
                initializationDeviceInfoKt$Dsl1.setLocalList(u.m3(androidGetInitializationRequestPayload1.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                initializationDeviceInfoKt$Dsl1.setConnectionType(androidGetInitializationRequestPayload1.deviceInfoRepository.getConnectionTypeStr());
                initializationRequestKt$Dsl1.setDeviceInfo(initializationDeviceInfoKt$Dsl2._build());
                androidGetInitializationRequestPayload$invoke$10.L$0 = androidGetInitializationRequestPayload1;
                androidGetInitializationRequestPayload$invoke$10.L$1 = initializationRequestKt$Dsl4;
                androidGetInitializationRequestPayload$invoke$10.L$2 = initializationRequestKt$Dsl5;
                androidGetInitializationRequestPayload$invoke$10.L$3 = null;
                androidGetInitializationRequestPayload$invoke$10.L$4 = null;
                androidGetInitializationRequestPayload$invoke$10.L$5 = null;
                androidGetInitializationRequestPayload$invoke$10.L$6 = null;
                androidGetInitializationRequestPayload$invoke$10.label = 5;
                object0 = androidGetInitializationRequestPayload1.deviceInfoRepository.getAuidByteString(androidGetInitializationRequestPayload$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                initializationRequestKt$Dsl6 = initializationRequestKt$Dsl5;
                initializationRequestKt$Dsl7 = initializationRequestKt$Dsl4;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload1;
                goto label_152;
            }
            case 5: {
                initializationRequestKt$Dsl6 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$2;
                initializationRequestKt$Dsl7 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload)androidGetInitializationRequestPayload$invoke$10.L$0;
                f0.n(object0);
            label_152:
                if(((ByteString)object0) != null) {
                    initializationRequestKt$Dsl6.setAuid(((ByteString)object0));
                }
                androidGetInitializationRequestPayload$invoke$10.L$0 = androidGetInitializationRequestPayload2;
                androidGetInitializationRequestPayload$invoke$10.L$1 = initializationRequestKt$Dsl7;
                androidGetInitializationRequestPayload$invoke$10.L$2 = initializationRequestKt$Dsl6;
                androidGetInitializationRequestPayload$invoke$10.label = 6;
                object0 = androidGetInitializationRequestPayload2.deviceInfoRepository.getAuidString(androidGetInitializationRequestPayload$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                goto label_165;
            }
            case 6: {
                initializationRequestKt$Dsl6 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$2;
                initializationRequestKt$Dsl7 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload)androidGetInitializationRequestPayload$invoke$10.L$0;
                f0.n(object0);
            label_165:
                if(((String)object0) != null && ((String)object0).length() != 0) {
                    initializationRequestKt$Dsl6.setAuidString(((String)object0));
                }
                androidGetInitializationRequestPayload$invoke$10.L$0 = androidGetInitializationRequestPayload2;
                androidGetInitializationRequestPayload$invoke$10.L$1 = initializationRequestKt$Dsl7;
                androidGetInitializationRequestPayload$invoke$10.L$2 = initializationRequestKt$Dsl6;
                androidGetInitializationRequestPayload$invoke$10.label = 7;
                object0 = androidGetInitializationRequestPayload2.sessionRepository.getPrivacy(androidGetInitializationRequestPayload$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                goto label_180;
            }
            case 7: {
                initializationRequestKt$Dsl6 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$2;
                initializationRequestKt$Dsl7 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload)androidGetInitializationRequestPayload$invoke$10.L$0;
                f0.n(object0);
            label_180:
                if(!((ByteString)object0).isEmpty()) {
                    initializationRequestKt$Dsl6.setPrivacy(((ByteString)object0));
                }
                androidGetInitializationRequestPayload$invoke$10.L$0 = androidGetInitializationRequestPayload3;
                androidGetInitializationRequestPayload$invoke$10.L$1 = initializationRequestKt$Dsl7;
                androidGetInitializationRequestPayload$invoke$10.L$2 = initializationRequestKt$Dsl6;
                androidGetInitializationRequestPayload$invoke$10.label = 8;
                object0 = androidGetInitializationRequestPayload3.sessionRepository.getGatewayCache(androidGetInitializationRequestPayload$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                initializationRequestKt$Dsl8 = initializationRequestKt$Dsl6;
                initializationRequestKt$Dsl9 = initializationRequestKt$Dsl7;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                break;
            }
            case 8: {
                initializationRequestKt$Dsl8 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$2;
                initializationRequestKt$Dsl9 = (Dsl)androidGetInitializationRequestPayload$invoke$10.L$1;
                androidGetInitializationRequestPayload4 = (AndroidGetInitializationRequestPayload)androidGetInitializationRequestPayload$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!((ByteString)object0).isEmpty()) {
            initializationRequestKt$Dsl8.setCache(((ByteString)object0));
        }
        Object object4 = androidGetInitializationRequestPayload4.mediationInitBlobMetadataReader.getJsonStorage().get(androidGetInitializationRequestPayload4.mediationInitBlobMetadataReader.getKey());
        if(object4 != null) {
            L.o(object4, "get(key)");
            if(!(object4 instanceof String)) {
                object4 = null;
            }
            if(object4 != null) {
                object2 = object4;
            }
        }
        if(((String)object2) != null) {
            initializationRequestKt$Dsl8.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(((String)object2)));
        }
        String s1 = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
        if(s1 != null) {
            initializationRequestKt$Dsl8.setLegacyFlowUserConsent(s1);
        }
        return initializationRequestKt$Dsl9._build();
    }
}

