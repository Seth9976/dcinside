package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.ub;

public class cz {
    public static class PjT {
        public final int PjT;
        public final float Zh;

        public PjT(int v, float f) {
            this.PjT = v;
            this.Zh = f;
        }
    }

    static int PjT = -1;
    private static long ReZ;
    static float Zh;

    static {
    }

    @NonNull
    public static PjT PjT() {
        if(cz.ReZ == 0L || SystemClock.elapsedRealtime() - cz.ReZ > 60000L) {
            Intent intent0 = ub.PjT().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is " + intent0);
            if(intent0 != null) {
                cz.PjT(intent0);
                cz.ReZ = SystemClock.elapsedRealtime();
            }
        }
        return new PjT(cz.PjT, cz.Zh);
    }

    private static void PjT(Intent intent0) {
        cz.PjT = intent0.getIntExtra("status", -1) == 2 ? 1 : 0;
        cz.Zh = ((float)(intent0.getIntExtra("level", -1) * 100)) / ((float)intent0.getIntExtra("scale", -1));
    }
}

