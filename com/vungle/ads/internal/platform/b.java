package com.vungle.ads.internal.platform;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

public final class b implements OnSuccessListener {
    public final c a;

    public b(c c0) {
        this.a = c0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        c.updateAppSetID$lambda-2(this.a, ((AppSetIdInfo)object0));
    }
}

