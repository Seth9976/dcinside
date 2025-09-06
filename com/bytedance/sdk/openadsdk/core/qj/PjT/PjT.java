package com.bytedance.sdk.openadsdk.core.qj.PjT;

import androidx.annotation.NonNull;

public enum PjT {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int Au;

    private PjT(int v1) {
        this.Au = v1;
    }

    @NonNull
    public String PjT() {
        return String.valueOf(this.Au);
    }
}

