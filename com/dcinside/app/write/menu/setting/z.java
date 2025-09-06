package com.dcinside.app.write.menu.setting;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class z implements CompoundButton.OnCheckedChangeListener {
    public final PostPollSettingActivity a;

    public z(PostPollSettingActivity postPollSettingActivity0) {
        this.a = postPollSettingActivity0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        PostPollSettingActivity.k2(this.a, compoundButton0, z);
    }
}

