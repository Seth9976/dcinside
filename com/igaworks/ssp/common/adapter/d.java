package com.igaworks.ssp.common.adapter;

import android.content.Context;
import com.igaworks.ssp.SdkInitListener;

public final class d implements Runnable {
    public final GAMAdapter a;
    public final Context b;
    public final SdkInitListener c;

    public d(GAMAdapter gAMAdapter0, Context context0, SdkInitListener sdkInitListener0) {
        this.a = gAMAdapter0;
        this.b = context0;
        this.c = sdkInitListener0;
    }

    @Override
    public final void run() {
        this.a.a(this.b, this.c);
    }
}

