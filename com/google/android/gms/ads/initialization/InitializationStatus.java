package com.google.android.gms.ads.initialization;

import androidx.annotation.NonNull;
import java.util.Map;

public interface InitializationStatus {
    @NonNull
    Map getAdapterStatusMap();
}

