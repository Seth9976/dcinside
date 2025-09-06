package com.dcinside.app.write.menu.video;

import rx.functions.b;

public final class k implements b {
    public final VideoSettingActivity a;

    public k(VideoSettingActivity videoSettingActivity0) {
        this.a = videoSettingActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        VideoSettingActivity.U1(this.a, ((Throwable)object0));
    }
}

