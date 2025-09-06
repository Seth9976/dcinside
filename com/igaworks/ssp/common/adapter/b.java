package com.igaworks.ssp.common.adapter;

import android.content.Context;
import com.igaworks.ssp.SdkInitListener;

public final class b implements Runnable {
    public final AdForusAdapter a;
    public final Context b;
    public final SdkInitListener c;

    public b(AdForusAdapter adForusAdapter0, Context context0, SdkInitListener sdkInitListener0) {
        this.a = adForusAdapter0;
        this.b = context0;
        this.c = sdkInitListener0;
    }

    @Override
    public final void run() {
        this.a.a(this.b, this.c);
    }
}

