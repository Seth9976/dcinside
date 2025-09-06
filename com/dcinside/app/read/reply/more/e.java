package com.dcinside.app.read.reply.more;

import android.content.Context;
import rx.functions.b;

public final class e implements b {
    public final Context a;

    public e(Context context0) {
        this.a = context0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        f.R(this.a, ((Throwable)object0));
    }
}

