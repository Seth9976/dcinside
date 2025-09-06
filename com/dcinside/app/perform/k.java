package com.dcinside.app.perform;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import kotlin.jvm.functions.Function1;
import rx.n;

public final class k implements AdapterView.OnItemClickListener {
    public final Function1 a;
    public final n b;
    public final p c;

    public k(Function1 function10, n n0, p p0) {
        this.a = function10;
        this.b = n0;
        this.c = p0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        h.n(this.a, this.b, this.c, adapterView0, view0, v, v1);
    }
}

