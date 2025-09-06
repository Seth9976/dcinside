package com.dcinside.app.settings.hate;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class a implements CompoundButton.OnCheckedChangeListener {
    public final HateSettingActivity a;

    public a(HateSettingActivity hateSettingActivity0) {
        this.a = hateSettingActivity0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        HateSettingActivity.P1(this.a, compoundButton0, z);
    }
}

