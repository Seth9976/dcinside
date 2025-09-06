package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(@NonNull String s, @NonNull Intent intent0) {
        super(s);
        this.zza = intent0;
    }

    @NonNull
    public Intent getIntent() {
        return new Intent(this.zza);
    }
}

