package com.dcinside.app.view.tool;

import android.content.Context;
import android.view.View;
import com.dcinside.app.util.ql.b.f;
import java.util.List;

public final class b implements f {
    public final String a;
    public final List b;
    public final Context c;

    public b(String s, List list0, Context context0) {
        this.a = s;
        this.b = list0;
        this.c = context0;
    }

    @Override  // com.dcinside.app.util.ql$b$f
    public final boolean a(View view0, int v) {
        return c.C(this.a, this.b, this.c, view0, v);
    }
}

