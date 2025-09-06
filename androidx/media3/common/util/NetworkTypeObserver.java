package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback.DisplayInfoListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

@UnstableApi
public final class NetworkTypeObserver {
    @RequiresApi(0x1F)
    static final class Api31 {
        static final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            private final NetworkTypeObserver a;

            public DisplayInfoCallback(NetworkTypeObserver networkTypeObserver0) {
                this.a = networkTypeObserver0;
            }

            @Override  // android.telephony.TelephonyCallback$DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo0) {
                int v = telephonyDisplayInfo0.getOverrideNetworkType();
                int v1 = 5;
                NetworkTypeObserver networkTypeObserver0 = this.a;
                if(v == 3 || (v == 4 || v == 5)) {
                    v1 = 10;
                }
                networkTypeObserver0.l(v1);
            }
        }

        public static void a(Context context0, NetworkTypeObserver networkTypeObserver0) {
            try {
                TelephonyManager telephonyManager0 = (TelephonyManager)Assertions.g(((TelephonyManager)context0.getSystemService("phone")));
                DisplayInfoCallback networkTypeObserver$Api31$DisplayInfoCallback0 = new DisplayInfoCallback(networkTypeObserver0);
                telephonyManager0.registerTelephonyCallback(context0.getMainExecutor(), networkTypeObserver$Api31$DisplayInfoCallback0);
                telephonyManager0.unregisterTelephonyCallback(networkTypeObserver$Api31$DisplayInfoCallback0);
            }
            catch(RuntimeException unused_ex) {
                networkTypeObserver0.l(5);
            }
        }
    }

    public interface Listener {
        void a(int arg1);
    }

    final class Receiver extends BroadcastReceiver {
        final NetworkTypeObserver a;

        private Receiver() {
        }

        Receiver(androidx.media3.common.util.NetworkTypeObserver.1 networkTypeObserver$10) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            int v = NetworkTypeObserver.g(context0);
            if(Util.a >= 0x1F && v == 5) {
                Api31.a(context0, NetworkTypeObserver.this);
                return;
            }
            NetworkTypeObserver.this.l(v);
        }
    }

    private final Handler a;
    private final CopyOnWriteArrayList b;
    private final Object c;
    @GuardedBy("networkTypeLock")
    private int d;
    @Nullable
    private static NetworkTypeObserver e;

    private NetworkTypeObserver(Context context0) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context0.registerReceiver(new Receiver(this, null), intentFilter0);
    }

    public static NetworkTypeObserver d(Context context0) {
        synchronized(NetworkTypeObserver.class) {
            if(NetworkTypeObserver.e == null) {
                NetworkTypeObserver.e = new NetworkTypeObserver(context0);
            }
            return NetworkTypeObserver.e;
        }
    }

    private static int e(NetworkInfo networkInfo0) {
        switch(networkInfo0.getSubtype()) {
            case 1: 
            case 2: {
                return 3;
            }
            case 13: {
                return 5;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 14: 
            case 15: 
            case 17: {
                return 4;
            }
            case 18: {
                return 2;
            }
            case 20: {
                return Util.a < 29 ? 0 : 9;
            }
            default: {
                return 6;
            }
        }
    }

    public int f() {
        synchronized(this.c) {
        }
        return this.d;
    }

    private static int g(Context context0) {
        NetworkInfo networkInfo0;
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        int v = 0;
        if(connectivityManager0 == null) {
            return 0;
        }
        try {
            networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        }
        catch(SecurityException unused_ex) {
            return v;
        }
        v = 1;
        if(networkInfo0 != null && networkInfo0.isConnected()) {
            switch(networkInfo0.getType()) {
                case 1: {
                    return 2;
                }
                case 0: 
                case 4: 
                case 5: {
                    return NetworkTypeObserver.e(networkInfo0);
                }
                case 6: {
                    return 5;
                }
                case 9: {
                    return 7;
                }
                default: {
                    return 8;
                }
            }
        }
        return v;
    }

    // 检测为 Lambda 实现
    private void h(Listener networkTypeObserver$Listener0) [...]

    public void i(Listener networkTypeObserver$Listener0) {
        this.j();
        WeakReference weakReference0 = new WeakReference(networkTypeObserver$Listener0);
        this.b.add(weakReference0);
        d d0 = () -> networkTypeObserver$Listener0.a(this.f());
        this.a.post(d0);
    }

    private void j() {
        for(Object object0: this.b) {
            WeakReference weakReference0 = (WeakReference)object0;
            if(weakReference0.get() == null) {
                this.b.remove(weakReference0);
            }
        }
    }

    @VisibleForTesting
    public static void k() {
        synchronized(NetworkTypeObserver.class) {
            NetworkTypeObserver.e = null;
        }
    }

    private void l(int v) {
        synchronized(this.c) {
            if(this.d == v) {
                return;
            }
            this.d = v;
        }
        for(Object object1: this.b) {
            WeakReference weakReference0 = (WeakReference)object1;
            Listener networkTypeObserver$Listener0 = (Listener)weakReference0.get();
            if(networkTypeObserver$Listener0 == null) {
                this.b.remove(weakReference0);
            }
            else {
                networkTypeObserver$Listener0.a(v);
            }
        }
    }

    class androidx.media3.common.util.NetworkTypeObserver.1 {
    }

}

