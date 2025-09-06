package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a;

    static {
        RescheduleReceiver.a = "WM-RescheduleReceiver";
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        Logger.e().a("WM-RescheduleReceiver", "Received intent " + intent0);
        if(Build.VERSION.SDK_INT >= 23) {
            try {
                WorkManagerImpl.O(context0).c0(this.goAsync());
            }
            catch(IllegalStateException illegalStateException0) {
                Logger.e().d("WM-RescheduleReceiver", "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException0);
            }
            return;
        }
        context0.startService(CommandHandler.e(context0));
    }
}

