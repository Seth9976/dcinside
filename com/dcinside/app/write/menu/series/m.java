package com.dcinside.app.write.menu.series;

import android.view.View.OnClickListener;
import android.view.View;
import com.dcinside.app.realm.g0;

public final class m implements View.OnClickListener {
    public final SeriesListActivity a;
    public final g0 b;

    public m(SeriesListActivity seriesListActivity0, g0 g00) {
        this.a = seriesListActivity0;
        this.b = g00;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SeriesListActivity.o2(this.a, this.b, view0);
    }
}

