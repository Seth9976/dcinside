package com.dcinside.app.image.edit.text;

import com.dcinside.app.image.view.DrawStateView;
import com.dcinside.app.view.ColorSeekBar.a;
import java.lang.ref.WeakReference;

public final class h implements a {
    public final WeakReference a;
    public final DrawStateView b;

    public h(WeakReference weakReference0, DrawStateView drawStateView0) {
        this.a = weakReference0;
        this.b = drawStateView0;
    }

    @Override  // com.dcinside.app.view.ColorSeekBar$a
    public final void q(int v, int v1, int v2) {
        i.f(this.a, this.b, v, v1, v2);
    }
}

