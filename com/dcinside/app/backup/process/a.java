package com.dcinside.app.backup.process;

import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter.Resolver;

public final class a implements Resolver {
    public final AutoBackupWorker a;

    public a(AutoBackupWorker autoBackupWorker0) {
        this.a = autoBackupWorker0;
    }

    @Override  // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object a(Completer callbackToFutureAdapter$Completer0) {
        return AutoBackupWorker.n(this.a, callbackToFutureAdapter$Completer0);
    }
}

