package com.apm.insight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IOOMCallback {
    void onCrash(@NonNull CrashType arg1, @Nullable Throwable arg2, @Nullable Thread arg3, long arg4);
}

