package com.dcinside.app.settings.text;

import android.view.View;
import top.defaults.colorpicker.e;

public final class b implements e {
    public final View a;

    public b(View view0) {
        this.a = view0;
    }

    @Override  // top.defaults.colorpicker.e
    public final void e(int v, boolean z, boolean z1) {
        GalleryTextOptionSettingActivity.F2(this.a, v, z, z1);
    }
}

