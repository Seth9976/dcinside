package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.Set;

@AutoValue
public abstract class e {
    @NonNull
    public static e a(@NonNull Set set0) {
        return new c(set0);
    }

    @NonNull
    public abstract Set b();
}

