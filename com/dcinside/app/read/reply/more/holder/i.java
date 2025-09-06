package com.dcinside.app.read.reply.more.holder;

import android.widget.TextView;
import rx.functions.b;

public final class i implements b {
    public final TextView a;

    public i(TextView textView0) {
        this.a = textView0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        j.k(this.a, ((Throwable)object0));
    }
}

