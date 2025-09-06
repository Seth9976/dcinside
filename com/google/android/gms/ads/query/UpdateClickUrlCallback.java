package com.google.android.gms.ads.query;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class UpdateClickUrlCallback {
    @KeepForSdk
    public void onFailure(@NonNull String s) {
    }

    @KeepForSdk
    public void onSuccess(@NonNull Uri uri0) {
    }
}

