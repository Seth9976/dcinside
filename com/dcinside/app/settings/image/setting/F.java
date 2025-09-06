package com.dcinside.app.settings.image.setting;

import android.view.View.OnClickListener;
import android.view.View;

public final class f implements View.OnClickListener {
    public final DefaultImageSettingActivity a;

    public f(DefaultImageSettingActivity defaultImageSettingActivity0) {
        this.a = defaultImageSettingActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        DefaultImageSettingActivity.Y2(this.a, view0);
    }
}

