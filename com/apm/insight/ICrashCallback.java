package com.apm.insight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ICrashCallback {
    void onCrash(@NonNull CrashType arg1, @Nullable String arg2, @Nullable Thread arg3);
}

