package com.igaworks.ssp.common.adapter;

import android.content.Context;
import com.igaworks.ssp.SdkInitListener;

public final class c implements Runnable {
    public final AdmobAdapter a;
    public final Context b;
    public final SdkInitListener c;

    public c(AdmobAdapter admobAdapter0, Context context0, SdkInitListener sdkInitListener0) {
        this.a = admobAdapter0;
        this.b = context0;
        this.c = sdkInitListener0;
    }

    @Override
    public final void run() {
        this.a.a(this.b, this.c);
    }
}

