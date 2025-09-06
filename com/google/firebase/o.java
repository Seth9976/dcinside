package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

public class o extends Exception {
    @Deprecated
    protected o() {
    }

    public o(@NonNull String s) {
        Preconditions.checkNotEmpty(s, "Detail message must not be empty");
        super(s);
    }

    public o(@NonNull String s, @NonNull Throwable throwable0) {
        Preconditions.checkNotEmpty(s, "Detail message must not be empty");
        super(s, throwable0);
    }
}

