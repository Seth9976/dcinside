package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final class l implements Callable {
    public final Context a;
    public final Intent b;

    public l(Context context0, Intent intent0) {
        this.a = context0;
        this.b = intent0;
    }

    @Override
    public final Object call() {
        return o.h(this.a, this.b);
    }
}

