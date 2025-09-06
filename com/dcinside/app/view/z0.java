package com.dcinside.app.view;

import android.view.View.OnClickListener;
import android.view.View;

public final class z0 implements View.OnClickListener {
    public final ShareVoiceView a;

    public z0(ShareVoiceView shareVoiceView0) {
        this.a = shareVoiceView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ShareVoiceView.C(this.a, view0);
    }
}

