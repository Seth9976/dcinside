package com.bytedance.sdk.openadsdk.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface PAGConstant {
    @Retention(RetentionPolicy.CLASS)
    public @interface PAGGDPRConsentType {
        public static final int PAG_GDPR_CONSENT_TYPE_CONSENT = 1;
        public static final int PAG_GDPR_CONSENT_TYPE_DEFAULT = -1;
        public static final int PAG_GDPR_CONSENT_TYPE_NO_CONSENT;

    }

    @Retention(RetentionPolicy.CLASS)
    public @interface PAGPAConsentType {
        public static final int PAG_PA_CONSENT_TYPE_CONSENT = 1;
        public static final int PAG_PA_CONSENT_TYPE_NO_CONSENT;

    }

}

