package com.dcinside.app.settings.recent;

import io.realm.F0.d;
import io.realm.F0;
import java.util.List;

public final class e implements d {
    public final List a;
    public final int b;

    public e(List list0, int v) {
        this.a = list0;
        this.b = v;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        RecentGallerySettingActivity.d2(this.a, this.b, f00);
    }
}

