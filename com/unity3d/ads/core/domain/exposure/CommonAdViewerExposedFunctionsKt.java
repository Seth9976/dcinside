package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage.SetOrientation;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult.Failure;
import com.unity3d.ads.core.data.model.CacheResult.Success;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse;
import gatewayprotocol.v1.AllowedPiiKt.Dsl;
import gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.ConnectionType;
import gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse;
import java.util.Iterator;
import java.util.Map;
import kotlin.J;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.k;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.W;
import kotlin.r0;
import kotlin.sequences.p;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.E;
import org.json.JSONArray;
import org.json.JSONObject;
import y4.l;
import y4.m;

public final class CommonAdViewerExposedFunctionsKt {
    @l
    public static final ExposedFunction attributionRegisterClick(@l AndroidAttribution androidAttribution0, @l AdObject adObject0) {
        L.p(androidAttribution0, "androidAttribution");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution0.registerClick(((String)object0), adObject0, d0);
            }
        };
    }

    @l
    public static final ExposedFunction attributionRegisterView(@l AndroidAttribution androidAttribution0, @l AdObject adObject0) {
        L.p(androidAttribution0, "androidAttribution");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution0.registerView(((String)object0), adObject0, d0);
            }
        };
    }

    @l
    public static final ExposedFunction clearStorage() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                k k0 = new k(b.e(d0));
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Storage.clear(((String)object0), new ContinuationFromCallback(k0));
                Object object1 = k0.a();
                if(object1 == b.l()) {
                    h.c(d0);
                }
                return object1;
            }
        }

    }

    @l
    public static final ExposedFunction deleteStorage() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                k k0 = new k(b.e(d0));
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Object object1 = arr_object[1];
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                Storage.delete(((String)object0), ((String)object1), new ContinuationFromCallback(k0));
                Object object2 = k0.a();
                if(object2 == b.l()) {
                    h.c(d0);
                }
                return object2;
            }
        }

    }

    @l
    public static final ExposedFunction download(@l CacheFile cacheFile0, @l AdObject adObject0) {
        L.p(cacheFile0, "cacheFile");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                String s1;
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.download.1.invoke.1 commonAdViewerExposedFunctionsKt$download$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.download.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.download.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$download$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$download$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                            Object L$0;
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
                        commonAdViewerExposedFunctionsKt$download$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                        Object L$0;
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
                Object object0 = commonAdViewerExposedFunctionsKt$download$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$download$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type org.json.JSONObject");
                        String s = ((JSONObject)object2).getString("url");
                        Object object3 = kotlin.collections.l.Pe(arr_object, 2);
                        int v1 = ((JSONObject)object2).optInt("priority", 0);
                        L.o(s, "url");
                        commonAdViewerExposedFunctionsKt$download$1$invoke$10.L$0 = s;
                        commonAdViewerExposedFunctionsKt$download$1$invoke$10.label = 1;
                        object0 = cacheFile0.invoke(s, adObject0, ((JSONArray)object3), v1, commonAdViewerExposedFunctionsKt$download$1$invoke$10);
                        if(object0 == object1) {
                            return object1;
                        }
                        s1 = s;
                        break;
                    }
                    case 1: {
                        s1 = (String)commonAdViewerExposedFunctionsKt$download$1$invoke$10.L$0;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((CacheResult)object0) instanceof Success) {
                    String s2 = ((Success)(((CacheResult)object0))).getCachedFile().getExtension();
                    if(s2 != null && s2.length() == 0) {
                        s1 = "unity-ads-cache://unity.ads.cache/" + ((Success)(((CacheResult)object0))).getCachedFile().getName();
                        L.o(s1, "when (result) {\n        …sult.Failure -> url\n    }");
                        return s1;
                    }
                    s1 = "unity-ads-cache://unity.ads.cache/" + ((Success)(((CacheResult)object0))).getCachedFile().getName() + '.' + ((Success)(((CacheResult)object0))).getCachedFile().getExtension();
                }
                else if(((CacheResult)object0) instanceof Failure) {
                }
                else {
                    throw new J();
                }
                L.o(s1, "when (result) {\n        …sult.Failure -> url\n    }");
                return s1;
            }
        };
    }

    @l
    public static final ExposedFunction getAdContext-yLuu4LI(@l AndroidGetAdPlayerContext androidGetAdPlayerContext0, @l String s, @l String s1, @l String s2, @l IsOMActivated isOMActivated0, @l AdObject adObject0) {
        L.p(androidGetAdPlayerContext0, "getAndroidAdPlayerContext");
        L.p(s, "adData");
        L.p(s1, "impressionConfig");
        L.p(s2, "adDataRefreshToken");
        L.p(isOMActivated0, "isOMActivated");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                Map map3;
                Map map2;
                Map map1;
                IsOMActivated isOMActivated1;
                AdObject adObject1;
                String s;
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAdContext.1.invoke.1 commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAdContext.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAdContext.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
                            Object L$5;
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
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        Object L$5;
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
                Object object0 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        AdObject adObject0 = adObject0;
                        IsOMActivated isOMActivated0 = isOMActivated0;
                        Map map0 = Y.g();
                        map0.put("adData", s);
                        map0.put("impressionConfig", s1);
                        map0.put("adDataRefreshToken", s2);
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$0 = adObject0;
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$1 = isOMActivated0;
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$2 = map0;
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$3 = map0;
                        s = "nativeContext";
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$4 = "nativeContext";
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$5 = map0;
                        commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.label = 1;
                        object0 = androidGetAdPlayerContext0.invoke(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10);
                        if(object0 == object1) {
                            return object1;
                        }
                        adObject1 = adObject0;
                        isOMActivated1 = isOMActivated0;
                        map1 = map0;
                        map2 = map1;
                        map3 = map2;
                        break;
                    }
                    case 1: {
                        map1 = (Map)commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$5;
                        s = (String)commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$4;
                        map2 = (Map)commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$3;
                        map3 = (Map)commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$2;
                        isOMActivated1 = (IsOMActivated)commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$1;
                        adObject1 = (AdObject)commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$10.L$0;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                map1.put(s, object0);
                map2.put("trackingToken", ProtobufExtensionsKt.toBase64$default(adObject1.getTrackingToken(), false, 1, null));
                JSONObject jSONObject0 = adObject1.getLoadOptions().getData();
                if(jSONObject0 != null && jSONObject0.length() != 0) {
                    Iterator iterator0 = jSONObject0.keys();
                    L.o(iterator0, "loadOptions.keys()");
                    kotlin.sequences.m m0 = p.e(iterator0);
                    JSONObject jSONObject1 = new JSONObject();
                    for(Object object2: m0) {
                        String s1 = (String)object2;
                        if(!L.g(s1, "adMarkup") && !L.g(s1, "objectId")) {
                            jSONObject1 = jSONObject1.put(s1, jSONObject0.get(s1));
                            L.o(jSONObject1, "acc.put(key, loadOptions[key])");
                        }
                    }
                    map2.put("loadOptions", jSONObject1);
                }
                if(isOMActivated1.invoke()) {
                    map2.put("openMeasurement", Y.W(new V[]{r0.a("sessionFilePath", "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js"), r0.a("serviceFilePath", "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js")}));
                }
                map2.put("isHeaderBidding", kotlin.coroutines.jvm.internal.b.a(adObject1.isHeaderBidding()));
                return Y.d(map3);
            }
        };
    }

    @l
    public static final ExposedFunction getAllowedPii(@l DeviceInfoRepository deviceInfoRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                String s = Base64.encodeToString(((AllowedPii)deviceInfoRepository0.getAllowedPii().getValue()).toByteArray(), 2);
                L.o(s, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return s;
            }
        };
    }

    @l
    public static final ExposedFunction getConnectionType(@l DeviceInfoRepository deviceInfoRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                ConnectionType dynamicDeviceInfoOuterClass$ConnectionType0 = deviceInfoRepository0.getDynamicDeviceInfo().getConnectionType();
                L.o(dynamicDeviceInfoOuterClass$ConnectionType0, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return dynamicDeviceInfoOuterClass$ConnectionType0;
            }
        };
    }

    @l
    public static final ExposedFunction getDeviceMaxVolume(@l DeviceInfoRepository deviceInfoRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                return kotlin.coroutines.jvm.internal.b.d(deviceInfoRepository0.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    @l
    public static final ExposedFunction getDeviceVolume(@l DeviceInfoRepository deviceInfoRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                return kotlin.coroutines.jvm.internal.b.d(deviceInfoRepository0.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    @l
    public static final ExposedFunction getKeysStorage() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                k k0 = new k(b.e(d0));
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Object object1 = arr_object[1];
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                Object object2 = arr_object[2];
                L.n(object2, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys(((String)object0), ((String)object1), ((Boolean)object2), new ContinuationFromCallback(k0));
                Object object3 = k0.a();
                if(object3 == b.l()) {
                    h.c(d0);
                }
                return object3;
            }
        }

    }

    @l
    public static final ExposedFunction getPrivacy(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacy.1.invoke.1 commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacy.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacy.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10.label = 1;
                        object0 = sessionRepository0.getPrivacy(commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$10);
                        return object0 == object1 ? object1 : ProtobufExtensionsKt.toBase64$default(((ByteString)object0), false, 1, null);
                    }
                    case 1: {
                        f0.n(object0);
                        return ProtobufExtensionsKt.toBase64$default(((ByteString)object0), false, 1, null);
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        };
    }

    @l
    public static final ExposedFunction getPrivacyFsm(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacyFsm.1.invoke.1 commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacyFsm.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getPrivacyFsm.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10.label = 1;
                        object0 = sessionRepository0.getPrivacyFsm(commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$10);
                        return object0 == object1 ? object1 : ProtobufExtensionsKt.toBase64$default(((ByteString)object0), false, 1, null);
                    }
                    case 1: {
                        f0.n(object0);
                        return ProtobufExtensionsKt.toBase64$default(((ByteString)object0), false, 1, null);
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        };
    }

    @l
    public static final ExposedFunction getScreenHeight(@l DeviceInfoRepository deviceInfoRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                return kotlin.coroutines.jvm.internal.b.f(deviceInfoRepository0.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    @l
    public static final ExposedFunction getScreenWidth(@l DeviceInfoRepository deviceInfoRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                return kotlin.coroutines.jvm.internal.b.f(deviceInfoRepository0.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    @l
    public static final ExposedFunction getSessionToken(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                return ProtobufExtensionsKt.toBase64$default(sessionRepository0.getSessionToken(), false, 1, null);
            }
        };
    }

    @l
    public static final ExposedFunction getStorage() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                k k0 = new k(b.e(d0));
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Object object1 = arr_object[1];
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                Storage.get(((String)object0), ((String)object1), new ContinuationFromCallback(k0));
                Object object2 = k0.a();
                if(object2 == b.l()) {
                    h.c(d0);
                }
                return object2;
            }
        }

    }

    @l
    public static final ExposedFunction hbTokenIncrementStarts(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                sessionRepository0.incrementTokenStartsCount();
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction hbTokenIncrementWins(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                sessionRepository0.incrementTokenWinsCount();
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction hbTokenReset(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                sessionRepository0.resetTokenCounters();
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction incrementBannerImpressionCount(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                sessionRepository0.incrementBannerImpressionCount();
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction isAttributionAvailable(@l AndroidAttribution androidAttribution0) {
        L.p(androidAttribution0, "androidAttribution");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                return androidAttribution0.isAvailable(d0);
            }
        };
    }

    @l
    public static final ExposedFunction isFileCached(@l GetIsFileCache getIsFileCache0) {
        L.p(getIsFileCache0, "getIfFileCache");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                return getIsFileCache0.invoke(((String)object0), d0);
            }
        };
    }

    @l
    public static final ExposedFunction loadOfferwallAd(@l LoadOfferwallAd loadOfferwallAd0, @l AdObject adObject0) {
        L.p(loadOfferwallAd0, "loadOfferwallAd");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadOfferwallAd.1.invoke.1 commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadOfferwallAd.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadOfferwallAd.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type org.json.JSONObject");
                        String s = ((JSONObject)object2).optString("placementName");
                        adObject0.setOfferwallAd(true);
                        adObject0.setOfferwallPlacementName(s);
                        L.o(s, "placementName");
                        commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10.label = 1;
                        return loadOfferwallAd0.invoke(s, commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction loadScarAd(@l LoadScarAd loadScarAd0, @l AdObject adObject0) {
        L.p(loadScarAd0, "loadScarAd");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadScarAd.1.invoke.1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadScarAd.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.loadScarAd.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type org.json.JSONObject");
                        String s = ((JSONObject)object2).optString("type");
                        String s1 = ((JSONObject)object2).optString("adUnitId");
                        String s2 = ((JSONObject)object2).optString("adString");
                        String s3 = ((JSONObject)object2).optString("queryId");
                        int v1 = ((JSONObject)object2).optInt("videoLength");
                        adObject0.setScarAd(true);
                        adObject0.setScarAdUnitId(s1);
                        adObject0.setScarQueryId(s3);
                        adObject0.setScarAdString(s2);
                        L.o(s, "adType");
                        L.o(s1, "adUnitId");
                        L.o(s2, "adString");
                        L.o(s3, "queryId");
                        commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10.label = 1;
                        return loadScarAd0.invoke(s, adObject0.getPlacementId(), s1, s2, s3, v1, commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction markCampaignStateShown(@l CampaignRepository campaignRepository0, @l AdObject adObject0) {
        L.p(campaignRepository0, "campaignRepository");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                campaignRepository0.setShowTimestamp(adObject0.getOpportunityId());
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction omFinishSession(@l OmFinishSession omFinishSession0, @l AdObject adObject0) {
        L.p(omFinishSession0, "omFinishSession");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omFinishSession.1.invoke.1 commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omFinishSession.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omFinishSession.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10.label = 1;
                        return omFinishSession0.invoke(adObject0, commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction omGetData(@l GetOmData getOmData0) {
        L.p(getOmData0, "getOmData");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omGetData.1.invoke.1 commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omGetData.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omGetData.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10.label = 1;
                        object0 = getOmData0.invoke(commonAdViewerExposedFunctionsKt$omGetData$1$invoke$10);
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
                Map map0 = Y.g();
                map0.put("version", ((OMData)object0).getVersion());
                map0.put("partnerName", ((OMData)object0).getPartnerName());
                map0.put("partnerVersion", ((OMData)object0).getPartnerVersion());
                return Y.d(map0);
            }
        };
    }

    @l
    public static final ExposedFunction omImpression(@l OmImpressionOccurred omImpressionOccurred0, @l AdObject adObject0) {
        L.p(omImpressionOccurred0, "omImpressionOccurred");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omImpression.1.invoke.1 commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omImpression.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omImpression.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type kotlin.Boolean");
                        commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10.label = 1;
                        return omImpressionOccurred0.invoke(adObject0, ((Boolean)object2).booleanValue(), commonAdViewerExposedFunctionsKt$omImpression$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction omStartSession(@l AndroidOmStartSession androidOmStartSession0, @l AdObject adObject0) {
        L.p(androidOmStartSession0, "omStartSession");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omStartSession.1.invoke.1 commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omStartSession.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.omStartSession.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type org.json.JSONObject");
                        commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10.label = 1;
                        return androidOmStartSession0.invoke(adObject0, ((JSONObject)object2), commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction openUrl(@l HandleOpenUrl handleOpenUrl0) {
        L.p(handleOpenUrl0, "handleOpenUrl");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Object object1 = kotlin.collections.l.Pe(arr_object, 1);
                String s = null;
                JSONObject jSONObject0 = object1 instanceof JSONObject ? ((JSONObject)object1) : null;
                if(jSONObject0 != null) {
                    s = jSONObject0.optString("packageName");
                }
                handleOpenUrl0.invoke(((String)object0), s);
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction readStorage() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                k k0 = new k(b.e(d0));
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Storage.read(((String)object0), new ContinuationFromCallback(k0));
                Object object1 = k0.a();
                if(object1 == b.l()) {
                    h.c(d0);
                }
                return object1;
            }
        }

    }

    @l
    public static final ExposedFunction refreshAdData(@l Refresh refresh0, @l AdObject adObject0) {
        L.p(refresh0, "refresh");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                ByteString byteString0;
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.refreshAdData.1.invoke.1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.refreshAdData.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.refreshAdData.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        if(arr_object.length == 0) {
                            byteString0 = ByteString.EMPTY;
                        }
                        else {
                            Object object2 = arr_object[0];
                            L.n(object2, "null cannot be cast to non-null type org.json.JSONObject");
                            String s = ((JSONObject)object2).optString("adDataRefreshToken");
                            L.o(s, "refreshToken");
                            byteString0 = ProtobufExtensionsKt.fromBase64$default(s, false, 1, null);
                        }
                        L.o(byteString0, "refreshTokenByteString");
                        commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10.label = 1;
                        object0 = refresh0.invoke(byteString0, adObject0.getOpportunityId(), commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$10);
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
                if(((AdDataRefreshResponse)object0).hasError()) {
                    throw new IllegalArgumentException("Refresh failed");
                }
                Map map0 = Y.g();
                ByteString byteString1 = ((AdDataRefreshResponse)object0).getAdData();
                L.o(byteString1, "adRefreshResponse.adData");
                map0.put("adData", ProtobufExtensionsKt.toBase64$default(byteString1, false, 1, null));
                ByteString byteString2 = ((AdDataRefreshResponse)object0).getAdDataRefreshToken();
                L.o(byteString2, "adRefreshResponse.adDataRefreshToken");
                map0.put("adDataRefreshToken", ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
                ByteString byteString3 = ((AdDataRefreshResponse)object0).getTrackingToken();
                L.o(byteString3, "adRefreshResponse.trackingToken");
                map0.put("trackingToken", ProtobufExtensionsKt.toBase64$default(byteString3, false, 1, null));
                return Y.d(map0);
            }
        };
    }

    @l
    public static final ExposedFunction sendDiagnosticEvent(@l SendDiagnosticEvent sendDiagnosticEvent0, @l AdObject adObject0) {
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                Double double0;
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Object object1 = arr_object[1];
                L.n(object1, "null cannot be cast to non-null type org.json.JSONObject");
                Map map0 = Y.g();
                Iterator iterator0 = ((JSONObject)object1).keys();
                L.o(iterator0, "tags.keys()");
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    map0.put(((String)object2), ((JSONObject)object1).getString(((String)object2)));
                }
                Map map1 = Y.d(map0);
                Object object3 = kotlin.collections.l.Pe(arr_object, 2);
                if(object3 == null) {
                    double0 = null;
                }
                else {
                    String s = object3.toString();
                    double0 = s == null ? null : kotlin.coroutines.jvm.internal.b.d(Double.parseDouble(s));
                }
                DefaultImpls.invoke$default(sendDiagnosticEvent0, ((String)object0), double0, map1, null, adObject0, 8, null);
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction sendOperativeEvent(@l GetOperativeEventApi getOperativeEventApi0, @l AdObject adObject0) {
        L.p(getOperativeEventApi0, "getOperativeEventApi");
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendOperativeEvent.1.invoke.1 commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendOperativeEvent.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendOperativeEvent.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type kotlin.String");
                        byte[] arr_b = Base64.decode(((String)object2), 2);
                        L.o(arr_b, "decode(it[0] as String, Base64.NO_WRAP)");
                        ByteString byteString0 = ByteStringsKt.toByteString(arr_b);
                        commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10.label = 1;
                        return getOperativeEventApi0.invoke(OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER, adObject0, byteString0, commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction sendPrivacyUpdateRequest(@l SendPrivacyUpdateRequest sendPrivacyUpdateRequest0) {
        L.p(sendPrivacyUpdateRequest0, "sendPrivacyUpdateRequest");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest.1.invoke.1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type org.json.JSONObject");
                        String s = ((JSONObject)object2).optString("content");
                        int v1 = ((JSONObject)object2).optInt("version");
                        L.o(s, "privacyUpdateContentBase64");
                        ByteString byteString0 = ProtobufExtensionsKt.fromBase64$default(s, false, 1, null);
                        commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10.label = 1;
                        object0 = sendPrivacyUpdateRequest0.invoke(v1, byteString0, commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$10);
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
                Map map0 = Y.g();
                map0.put("version", kotlin.coroutines.jvm.internal.b.f(((PrivacyUpdateResponse)object0).getVersion()));
                ByteString byteString1 = ((PrivacyUpdateResponse)object0).getContent();
                L.o(byteString1, "response.content");
                map0.put("content", ProtobufExtensionsKt.toBase64$default(byteString1, false, 1, null));
                return Y.d(map0);
            }
        };
    }

    @l
    public static final ExposedFunction setAllowedPii(@l DeviceInfoRepository deviceInfoRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type org.json.JSONObject");
                E e0 = deviceInfoRepository0.getAllowedPii();
                do {
                    Object object1 = e0.getValue();
                    Builder generatedMessageLite$Builder0 = ((AllowedPii)object1).toBuilder();
                    L.o(generatedMessageLite$Builder0, "this.toBuilder()");
                    Dsl allowedPiiKt$Dsl0 = Dsl.Companion._create(((gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder)generatedMessageLite$Builder0));
                    boolean z = ((JSONObject)object0).optBoolean("idfa");
                    new W() {
                        {
                            super(object0, Dsl.class, "idfa", "getIdfa()Z", 0);
                        }

                        @Override  // kotlin.jvm.internal.W
                        @m
                        public Object get() {
                            return Boolean.valueOf(((Dsl)this.receiver).getIdfa());
                        }

                        @Override  // kotlin.jvm.internal.W
                        public void set(@m Object object0) {
                            ((Dsl)this.receiver).setIdfa(((Boolean)object0).booleanValue());
                        }
                    }.set(kotlin.coroutines.jvm.internal.b.a(z));
                    boolean z1 = ((JSONObject)object0).optBoolean("idfv");
                    new W() {
                        {
                            super(object0, Dsl.class, "idfv", "getIdfv()Z", 0);
                        }

                        @Override  // kotlin.jvm.internal.W
                        @m
                        public Object get() {
                            return Boolean.valueOf(((Dsl)this.receiver).getIdfv());
                        }

                        @Override  // kotlin.jvm.internal.W
                        public void set(@m Object object0) {
                            ((Dsl)this.receiver).setIdfv(((Boolean)object0).booleanValue());
                        }
                    }.set(kotlin.coroutines.jvm.internal.b.a(z1));
                }
                while(!e0.compareAndSet(object1, allowedPiiKt$Dsl0._build()));
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction setOrientation(@l AdObject adObject0) {
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOrientation.1.invoke.1 commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOrientation.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOrientation.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type kotlin.Int");
                        D d1 = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        String s = adObject0.getOpportunityId().toStringUtf8();
                        L.o(s, "adObject.opportunityId.toStringUtf8()");
                        SetOrientation displayMessage$SetOrientation0 = new SetOrientation(s, ((int)(((Integer)object2))));
                        commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10.label = 1;
                        return d1.emit(displayMessage$SetOrientation0, commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction setPrivacy(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacy.1.invoke.1 commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacy.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacy.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type kotlin.String");
                        byte[] arr_b = Base64.decode(((String)object2), 2);
                        L.o(arr_b, "decode(it[0] as String, Base64.NO_WRAP)");
                        ByteString byteString0 = ByteStringsKt.toByteString(arr_b);
                        commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10.label = 1;
                        return sessionRepository0.setPrivacy(byteString0, commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction setPrivacyFsm(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacyFsm.1.invoke.1 commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10;
                if(d0 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacyFsm.1.invoke.1) {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setPrivacyFsm.1.invoke.1)d0;
                    int v = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10.label;
                    if((v & 0x80000000) == 0) {
                        commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                        commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10.label = v ^ 0x80000000;
                    }
                }
                else {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                Object object0 = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10.result;
                Object object1 = b.l();
                switch(commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10.label) {
                    case 0: {
                        f0.n(object0);
                        Object object2 = arr_object[0];
                        L.n(object2, "null cannot be cast to non-null type kotlin.String");
                        byte[] arr_b = Base64.decode(((String)object2), 2);
                        L.o(arr_b, "decode(it[0] as String, Base64.NO_WRAP)");
                        ByteString byteString0 = ByteStringsKt.toByteString(arr_b);
                        commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10.label = 1;
                        return sessionRepository0.setPrivacyFsm(byteString0, commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$10) == object1 ? object1 : S0.a;
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
    }

    @l
    public static final ExposedFunction setStorage() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                k k0 = new k(b.e(d0));
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Object object1 = arr_object[1];
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                Storage.set(((String)object0), ((String)object1), arr_object[2], new ContinuationFromCallback(k0));
                Object object2 = k0.a();
                if(object2 == b.l()) {
                    h.c(d0);
                }
                return object2;
            }
        }

    }

    @l
    public static final ExposedFunction showOfferwallAd() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                return S0.a;
            }
        }

    }

    @l
    public static final ExposedFunction showScarAd() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                return S0.a;
            }
        }

    }

    @l
    public static final ExposedFunction updateTrackingToken(@l AdObject adObject0) {
        L.p(adObject0, "adObject");
        return new ExposedFunction() {
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Object[])object0), ((d)object1));
            }

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type org.json.JSONObject");
                String s = ((JSONObject)object0).optString("trackingToken");
                if(s != null && s.length() != 0) {
                    L.o(s, "token");
                    ByteString byteString0 = ProtobufExtensionsKt.fromBase64$default(s, false, 1, null);
                    adObject0.setTrackingToken(byteString0);
                }
                return S0.a;
            }
        };
    }

    @l
    public static final ExposedFunction writeStorage() {
        return (Object object0, Object object1) -> this.invoke(((Object[])object0), ((d)object1));

        final class com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1 implements ExposedFunction {
            public static final com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1 INSTANCE;

            static {
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1.INSTANCE = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1();
            }

            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override  // A3.o
            public Object invoke(Object object0, Object object1) [...]

            @m
            public final Object invoke(@l Object[] arr_object, @l d d0) {
                k k0 = new k(b.e(d0));
                Object object0 = arr_object[0];
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                Storage.write(((String)object0), new ContinuationFromCallback(k0));
                Object object1 = k0.a();
                if(object1 == b.l()) {
                    h.c(d0);
                }
                return object1;
            }
        }

    }
}

