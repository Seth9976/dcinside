package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;

final class WakeLockManager {
    private final Context a;
    @Nullable
    private PowerManager.WakeLock b;
    private boolean c;
    private boolean d;
    private static final String e = "WakeLockManager";
    private static final String f = "ExoPlayer:WakeLockManager";

    public WakeLockManager(Context context0) {
        this.a = context0.getApplicationContext();
    }

    public void a(boolean z) {
        if(z && this.b == null) {
            PowerManager powerManager0 = (PowerManager)this.a.getSystemService("power");
            if(powerManager0 == null) {
                Log.n("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock powerManager$WakeLock0 = powerManager0.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.b = powerManager$WakeLock0;
            powerManager$WakeLock0.setReferenceCounted(false);
        }
        this.c = z;
        this.c();
    }

    public void b(boolean z) {
        this.d = z;
        this.c();
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock powerManager$WakeLock0 = this.b;
        if(powerManager$WakeLock0 == null) {
            return;
        }
        if(this.c && this.d) {
            powerManager$WakeLock0.acquire();
            return;
        }
        powerManager$WakeLock0.release();
    }
}

