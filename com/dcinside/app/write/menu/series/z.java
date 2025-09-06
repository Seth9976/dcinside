package com.dcinside.app.write.menu.series;

import com.leinardi.android.speeddial.SpeedDialActionItem;
import com.leinardi.android.speeddial.SpeedDialView.h;

public final class z implements h {
    public final SeriesManageActivity a;

    public z(SeriesManageActivity seriesManageActivity0) {
        this.a = seriesManageActivity0;
    }

    @Override  // com.leinardi.android.speeddial.SpeedDialView$h
    public final boolean a(SpeedDialActionItem speedDialActionItem0) {
        return SeriesManageActivity.E2(this.a, speedDialActionItem0);
    }
}

