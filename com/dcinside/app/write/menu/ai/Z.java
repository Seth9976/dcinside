package com.dcinside.app.write.menu.ai;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class z implements ActivityResultCallback {
    public final AiImageMakeActivity a;

    public z(AiImageMakeActivity aiImageMakeActivity0) {
        this.a = aiImageMakeActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        AiImageMakeActivity.t3(this.a, ((ActivityResult)object0));
    }
}

