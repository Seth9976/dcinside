package com.unity3d.ads.core.extensions;

import P2.e;
import gatewayprotocol.v1.InitializationResponseOuterClass.AdFormat;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdFormatExtensionsKt {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[AdFormat.values().length];
            try {
                arr_v[AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @m
    public static final e toUnityAdFormat(@l AdFormat initializationResponseOuterClass$AdFormat0) {
        L.p(initializationResponseOuterClass$AdFormat0, "<this>");
        switch(initializationResponseOuterClass$AdFormat0) {
            case 1: {
                return e.b;
            }
            case 2: {
                return e.a;
            }
            case 3: {
                return e.c;
            }
            default: {
                return null;
            }
        }
    }
}

