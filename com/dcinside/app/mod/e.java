package com.dcinside.app.mod;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class e implements AdapterView.OnItemClickListener {
    public final h a;

    public e(h h0) {
        this.a = h0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.a.z0(adapterView0, view0, v, v1);
    }
}

