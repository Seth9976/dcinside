package com.bytedance.sdk.openadsdk.core.settings;

import androidx.annotation.Keep;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

final class AppSetIdAndScope.1 implements OnSuccessListener {
    @Keep
    public void onSuccess(AppSetIdInfo appSetIdInfo0) {
        cr.PjT = Integer.toString(appSetIdInfo0.getScope());
        cr.Zh = appSetIdInfo0.getId();
        cr.cr = 1;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    @Keep
    public void onSuccess(Object object0) {
        this.onSuccess(((AppSetIdInfo)object0));
    }
}

