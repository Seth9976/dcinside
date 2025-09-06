package com.dcinside.app.gallery.search;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.util.ql.b.f;

public final class k implements f {
    public final RecyclerView a;
    public final AppCompatActivity b;

    public k(RecyclerView recyclerView0, AppCompatActivity appCompatActivity0) {
        this.a = recyclerView0;
        this.b = appCompatActivity0;
    }

    @Override  // com.dcinside.app.util.ql$b$f
    public final boolean a(View view0, int v) {
        return n.K0(this.a, this.b, view0, v);
    }
}

