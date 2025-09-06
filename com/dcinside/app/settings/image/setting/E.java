package com.dcinside.app.settings.image.setting;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class e implements ActivityResultCallback {
    public final DefaultImageSettingActivity a;

    public e(DefaultImageSettingActivity defaultImageSettingActivity0) {
        this.a = defaultImageSettingActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        DefaultImageSettingActivity.X2(this.a, ((ActivityResult)object0));
    }
}

