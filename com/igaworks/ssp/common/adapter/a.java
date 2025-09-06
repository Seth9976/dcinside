package com.igaworks.ssp.common.adapter;

import android.content.Context;
import com.igaworks.ssp.SdkInitListener;

public final class a implements Runnable {
    public final ADOPAdapter a;
    public final Context b;
    public final SdkInitListener c;

    public a(ADOPAdapter aDOPAdapter0, Context context0, SdkInitListener sdkInitListener0) {
        this.a = aDOPAdapter0;
        this.b = context0;
        this.c = sdkInitListener0;
    }

    @Override
    public final void run() {
        this.a.a(this.b, this.c);
    }
}

