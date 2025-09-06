package com.dcinside.app.backup;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class n implements ActivityResultCallback {
    public final BackupActivity a;

    public n(BackupActivity backupActivity0) {
        this.a = backupActivity0;
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void a(Object object0) {
        BackupActivity.s2(this.a, ((ActivityResult)object0));
    }
}

