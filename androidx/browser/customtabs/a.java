package androidx.browser.customtabs;

import android.os.IBinder.DeathRecipient;

public final class a implements IBinder.DeathRecipient {
    public final androidx.browser.customtabs.CustomTabsService.1 a;
    public final CustomTabsSessionToken b;

    public a(androidx.browser.customtabs.CustomTabsService.1 customTabsService$10, CustomTabsSessionToken customTabsSessionToken0) {
        this.a = customTabsService$10;
        this.b = customTabsSessionToken0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        this.a.m1(this.b);
    }
}

