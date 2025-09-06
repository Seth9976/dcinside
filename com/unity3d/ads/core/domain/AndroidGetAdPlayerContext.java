package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import java.util.Locale;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import y4.l;
import y4.m;

public final class AndroidGetAdPlayerContext {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String KEY_GAME_ID = "gameId";
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final SessionRepository sessionRepository;

    static {
        AndroidGetAdPlayerContext.Companion = new Companion(null);
    }

    public AndroidGetAdPlayerContext(@l DeviceInfoRepository deviceInfoRepository0, @l SessionRepository sessionRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.deviceInfoRepository = deviceInfoRepository0;
        this.sessionRepository = sessionRepository0;
    }

    @m
    public final Object invoke(@l d d0) {
        AndroidGetAdPlayerContext androidGetAdPlayerContext0;
        com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.invoke.1 androidGetAdPlayerContext$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.invoke.1) {
            androidGetAdPlayerContext$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.invoke.1)d0;
            int v = androidGetAdPlayerContext$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetAdPlayerContext$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                androidGetAdPlayerContext$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetAdPlayerContext$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = androidGetAdPlayerContext$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetAdPlayerContext$invoke$10.label) {
            case 0: {
                f0.n(object0);
                androidGetAdPlayerContext$invoke$10.L$0 = this;
                androidGetAdPlayerContext$invoke$10.label = 1;
                object0 = this.deviceInfoRepository.staticDeviceInfo(androidGetAdPlayerContext$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidGetAdPlayerContext0 = this;
                break;
            }
            case 1: {
                androidGetAdPlayerContext0 = (AndroidGetAdPlayerContext)androidGetAdPlayerContext$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 = androidGetAdPlayerContext0.deviceInfoRepository.getDynamicDeviceInfo();
        String s = androidGetAdPlayerContext0.sessionRepository.getGameId();
        if(s == null) {
            s = "";
        }
        return Y.W(new V[]{r0.a("bundleId", ((StaticDeviceInfo)object0).getBundleId()), r0.a("bundleVersion", ""), r0.a("webviewHash", "unknown"), r0.a("sdkVersion", kotlin.coroutines.jvm.internal.b.f(41401)), r0.a("sdkVersionName", "4.14.1"), r0.a("osVersion", ""), r0.a("systemLanguage", Locale.getDefault().toString()), r0.a("deviceModel", ""), r0.a("limitAdTracking", kotlin.coroutines.jvm.internal.b.a(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getLimitedTracking())), r0.a("maxVolume", kotlin.coroutines.jvm.internal.b.d(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getAndroid().getMaxVolume())), r0.a("gameId", s)});
    }
}

