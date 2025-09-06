package com.google.android.gms.common.api;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zah extends BasePendingResult {
    public zah(@Nullable GoogleApiClient googleApiClient0) {
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final Result createFailedResult(Status status0) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}

