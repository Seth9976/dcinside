package com.dcinside.app.write.menu.video;

import rx.functions.b;

public final class g implements b {
    public final VideoSettingActivity a;

    public g(VideoSettingActivity videoSettingActivity0) {
        this.a = videoSettingActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        VideoSettingActivity.f2(this.a, ((Throwable)object0));
    }
}

