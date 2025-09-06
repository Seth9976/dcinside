package com.dcinside.app.settings.theme;

import android.view.View;
import com.dcinside.app.util.ql.b.f;

public final class d implements f {
    public final ThemeSettingActivity a;

    public d(ThemeSettingActivity themeSettingActivity0) {
        this.a = themeSettingActivity0;
    }

    @Override  // com.dcinside.app.util.ql$b$f
    public final boolean a(View view0, int v) {
        return ThemeSettingActivity.L1(this.a, view0, v);
    }
}

