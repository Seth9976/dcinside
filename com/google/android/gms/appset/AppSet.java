package com.google.android.gms.appset;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.appset.zzr;

public final class AppSet {
    @NonNull
    public static AppSetIdClient getClient(@NonNull Context context0) {
        return new zzr(context0);
    }
}

