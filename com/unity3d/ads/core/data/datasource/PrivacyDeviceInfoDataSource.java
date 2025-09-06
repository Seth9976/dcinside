package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii;
import gatewayprotocol.v1.PiiOuterClass.Pii;
import kotlin.jvm.internal.L;
import y4.l;

public interface PrivacyDeviceInfoDataSource {
    public static final class DefaultImpls {
        public static Pii fetch$default(PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource0, AllowedPii allowedPiiOuterClass$AllowedPii0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if((v & 1) != 0) {
                allowedPiiOuterClass$AllowedPii0 = AllowedPii.getDefaultInstance();
                L.o(allowedPiiOuterClass$AllowedPii0, "getDefaultInstance()");
            }
            return privacyDeviceInfoDataSource0.fetch(allowedPiiOuterClass$AllowedPii0);
        }
    }

    @l
    Pii fetch(@l AllowedPii arg1);
}

