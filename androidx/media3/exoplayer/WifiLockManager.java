package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager.WifiLock;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;

final class WifiLockManager {
    private final Context a;
    @Nullable
    private WifiManager.WifiLock b;
    private boolean c;
    private boolean d;
    private static final String e = "WifiLockManager";
    private static final String f = "ExoPlayer:WifiLockManager";

    public WifiLockManager(Context context0) {
        this.a = context0.getApplicationContext();
    }

    public void a(boolean z) {
        if(z && this.b == null) {
            WifiManager wifiManager0 = (WifiManager)this.a.getApplicationContext().getSystemService("wifi");
            if(wifiManager0 == null) {
                Log.n("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock wifiManager$WifiLock0 = wifiManager0.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.b = wifiManager$WifiLock0;
            wifiManager$WifiLock0.setReferenceCounted(false);
        }
        this.c = z;
        this.c();
    }

    public void b(boolean z) {
        this.d = z;
        this.c();
    }

    private void c() {
        WifiManager.WifiLock wifiManager$WifiLock0 = this.b;
        if(wifiManager$WifiLock0 == null) {
            return;
        }
        if(this.c && this.d) {
            wifiManager$WifiLock0.acquire();
            return;
        }
        wifiManager$WifiLock0.release();
    }
}

