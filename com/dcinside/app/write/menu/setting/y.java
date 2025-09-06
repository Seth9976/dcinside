package com.dcinside.app.write.menu.setting;

import android.view.View.OnClickListener;
import android.view.View;

public final class y implements View.OnClickListener {
    public final PostPollSettingActivity a;

    public y(PostPollSettingActivity postPollSettingActivity0) {
        this.a = postPollSettingActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        PostPollSettingActivity.j2(this.a, view0);
    }
}

