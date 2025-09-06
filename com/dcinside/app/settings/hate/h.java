package com.dcinside.app.settings.hate;

import io.realm.F0.d;
import io.realm.F0;

public final class h implements d {
    public final b a;
    public final int b;

    public h(b hateWordSettingActivity$b0, int v) {
        this.a = hateWordSettingActivity$b0;
        this.b = v;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        b.x(this.a, this.b, f00);
    }
}

