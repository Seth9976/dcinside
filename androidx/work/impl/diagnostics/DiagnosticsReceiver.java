package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;

@RestrictTo({Scope.b})
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a;

    static {
        DiagnosticsReceiver.a = "WM-DiagnosticsRcvr";
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context0, @Nullable Intent intent0) {
        if(intent0 == null) {
            return;
        }
        Logger.e().a("WM-DiagnosticsRcvr", "Requesting diagnostics");
        try {
            WorkManager.q(context0).j(OneTimeWorkRequest.e(DiagnosticsWorker.class));
        }
        catch(IllegalStateException illegalStateException0) {
            Logger.e().d("WM-DiagnosticsRcvr", "WorkManager is not initialized", illegalStateException0);
        }
    }
}

