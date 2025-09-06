package com.dcinside.app.view.tool;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import y4.l;

public final class g {
    public static final void a(@l RecyclerView recyclerView0, int v, boolean z) {
        L.p(recyclerView0, "<this>");
        recyclerView0.setLayoutManager(new NonPredictiveLayoutManager(recyclerView0.getContext(), v, z));
    }

    public static void b(RecyclerView recyclerView0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        g.a(recyclerView0, v, z);
    }
}

