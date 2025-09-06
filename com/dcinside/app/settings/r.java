package com.dcinside.app.settings;

import rx.functions.b;

public final class r implements b {
    public final NotificationSettingActivity a;

    public r(NotificationSettingActivity notificationSettingActivity0) {
        this.a = notificationSettingActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        NotificationSettingActivity.v2(this.a, ((Throwable)object0));
    }
}

