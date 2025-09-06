package com.dcinside.app.view.dccon;

import kotlin.jvm.functions.Function1;
import rx.functions.p;

public final class o implements p {
    public final Function1 a;

    public o(Function1 function10) {
        this.a = function10;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return DcConPickerView.j0(this.a, object0);
    }
}

