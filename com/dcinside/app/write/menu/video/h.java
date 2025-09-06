package com.dcinside.app.write.menu.video;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class h implements ActivityResultCallback {
    public final VideoSettingActivity a;

    public h(VideoSettingActivity videoSettingActivity0) {
        this.a = videoSettingActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        VideoSettingActivity.X1(this.a, ((ActivityResult)object0));
    }
}

