package com.unity3d.ads.core.data.model;

import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;

public final class InitializationStateKt {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[InitializationState.values().length];
            try {
                arr_v[InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[InitializationState.INITIALIZING.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[InitializationState.INITIALIZED.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[InitializationState.FAILED.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[com.unity3d.services.core.properties.SdkProperties.InitializationState.values().length];
            try {
                arr_v1[com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @l
    public static final InitializationState toBold(@l com.unity3d.services.core.properties.SdkProperties.InitializationState sdkProperties$InitializationState0) {
        L.p(sdkProperties$InitializationState0, "<this>");
        switch(sdkProperties$InitializationState0) {
            case 1: {
                return InitializationState.NOT_INITIALIZED;
            }
            case 2: {
                return InitializationState.INITIALIZING;
            }
            case 3: {
                return InitializationState.INITIALIZED;
            }
            case 4: {
                return InitializationState.FAILED;
            }
            default: {
                throw new J();
            }
        }
    }

    @l
    public static final com.unity3d.services.core.properties.SdkProperties.InitializationState toLegacy(@l InitializationState initializationState0) {
        L.p(initializationState0, "<this>");
        switch(initializationState0) {
            case 1: {
                return com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED;
            }
            case 2: {
                return com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING;
            }
            case 3: {
                return com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY;
            }
            case 4: {
                return com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED;
            }
            default: {
                throw new J();
            }
        }
    }
}

