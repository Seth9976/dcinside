package com.dcinside.app.settings.image.list;

import android.view.View;
import com.dcinside.app.util.ql.b.f;
import io.realm.F0;

public final class a implements f {
    public final DefaultImageListActivity a;
    public final F0 b;

    public a(DefaultImageListActivity defaultImageListActivity0, F0 f00) {
        this.a = defaultImageListActivity0;
        this.b = f00;
    }

    @Override  // com.dcinside.app.util.ql$b$f
    public final boolean a(View view0, int v) {
        return DefaultImageListActivity.Q1(this.a, this.b, view0, v);
    }
}

