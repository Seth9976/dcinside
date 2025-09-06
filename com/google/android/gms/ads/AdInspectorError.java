package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AdInspectorError extends AdError {
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdInspectorErrorCode {
    }

    public static final int ERROR_CODE_ALREADY_OPEN = 3;
    public static final int ERROR_CODE_FAILED_TO_LOAD = 1;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_NOT_IN_TEST_MODE = 2;

    public AdInspectorError(int v, @NonNull String s, @NonNull String s1) {
        super(v, s, s1);
    }

    @Override  // com.google.android.gms.ads.AdError
    public int getCode() {
        return super.getCode();
    }
}

