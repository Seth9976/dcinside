package com.dcinside.app.browser;

import android.content.Context;

public final class m implements Runnable {
    public final Context a;
    public final String b;

    public m(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override
    public final void run() {
        n.i(this.a, this.b);
    }
}

