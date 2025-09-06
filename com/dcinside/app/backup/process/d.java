package com.dcinside.app.backup.process;

import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import rx.functions.b;

public final class d implements b {
    public final Completer a;

    public d(Completer callbackToFutureAdapter$Completer0) {
        this.a = callbackToFutureAdapter$Completer0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        AutoBackupWorker.m(this.a, ((Throwable)object0));
    }
}

