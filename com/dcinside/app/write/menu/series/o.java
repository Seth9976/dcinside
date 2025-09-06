package com.dcinside.app.write.menu.series;

import android.view.View.OnClickListener;
import android.view.View;

public final class o implements View.OnClickListener {
    public final SeriesListActivity a;

    public o(SeriesListActivity seriesListActivity0) {
        this.a = seriesListActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SeriesListActivity.q2(this.a, view0);
    }
}

