package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public abstract class TransformedResult {
    public abstract void andFinally(@NonNull ResultCallbacks arg1);

    @NonNull
    @ResultIgnorabilityUnspecified
    public abstract TransformedResult then(@NonNull ResultTransform arg1);
}

