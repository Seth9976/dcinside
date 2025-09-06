package com.dcinside.app.write.menu.series;

import rx.functions.o;

public final class t implements o {
    public final SeriesManageActivity a;
    public final String b;

    public t(SeriesManageActivity seriesManageActivity0, String s) {
        this.a = seriesManageActivity0;
        this.b = s;
    }

    @Override  // rx.functions.o
    public final Object call() {
        return SeriesManageActivity.J2(this.a, this.b);
    }
}

