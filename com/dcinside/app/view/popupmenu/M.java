package com.dcinside.app.view.popupmenu;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class m {
    @l
    public static final k a(@l Function1 function10) {
        L.p(function10, "init");
        return m.b(function10).a();
    }

    @l
    public static final com.dcinside.app.view.popupmenu.l b(@l Function1 function10) {
        L.p(function10, "init");
        com.dcinside.app.view.popupmenu.l l0 = new com.dcinside.app.view.popupmenu.l();
        function10.invoke(l0);
        return l0;
    }
}

