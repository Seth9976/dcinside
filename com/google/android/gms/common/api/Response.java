package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

public class Response {
    private Result zza;

    public Response() {
    }

    protected Response(@NonNull Result result0) {
        this.zza = result0;
    }

    @NonNull
    protected Result getResult() {
        return this.zza;
    }

    public void setResult(@NonNull Result result0) {
        this.zza = result0;
    }
}

