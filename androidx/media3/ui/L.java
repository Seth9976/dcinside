package androidx.media3.ui;

import android.view.View.OnClickListener;
import android.view.View;

public final class l implements View.OnClickListener {
    public final SettingViewHolder a;

    public l(SettingViewHolder playerControlView$SettingViewHolder0) {
        this.a = playerControlView$SettingViewHolder0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.j(view0);
    }
}

