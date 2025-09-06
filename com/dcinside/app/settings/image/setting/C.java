package com.dcinside.app.settings.image.setting;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class c implements ActivityResultCallback {
    public final DefaultImageSettingActivity a;
    public final K b;

    public c(DefaultImageSettingActivity defaultImageSettingActivity0, K k0) {
        this.a = defaultImageSettingActivity0;
        this.b = k0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        DefaultImageSettingActivity.b3(this.a, this.b, ((ActivityResult)object0));
    }
}

