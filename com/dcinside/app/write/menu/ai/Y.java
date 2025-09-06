package com.dcinside.app.write.menu.ai;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class y implements ActivityResultCallback {
    public final AiImageMakeActivity a;

    public y(AiImageMakeActivity aiImageMakeActivity0) {
        this.a = aiImageMakeActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        AiImageMakeActivity.s3(this.a, ((ActivityResult)object0));
    }
}

