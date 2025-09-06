package com.google.android.gms.common.data;

import androidx.annotation.NonNull;

public interface Freezable {
    @NonNull
    Object freeze();

    boolean isDataValid();
}

