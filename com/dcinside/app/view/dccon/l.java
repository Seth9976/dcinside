package com.dcinside.app.view.dccon;

import kotlin.jvm.functions.Function1;
import rx.functions.b;

public final class l implements b {
    public final Function1 a;

    public l(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        DcConPickerView.O(this.a, object0);
    }
}

