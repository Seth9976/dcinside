package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

@Deprecated
public interface CustomEventNative extends CustomEvent {
    void requestNativeAd(@NonNull Context arg1, @NonNull CustomEventNativeListener arg2, @Nullable String arg3, @NonNull NativeMediationAdRequest arg4, @Nullable Bundle arg5);
}

