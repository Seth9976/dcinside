package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    @VisibleForTesting
    IUnusedAppRestrictionsBackportService a;
    ResolvableFuture b;
    private final Context c;
    private boolean d;

    UnusedAppRestrictionsBackportServiceConnection(Context context0) {
        this.a = null;
        this.d = false;
        this.c = context0;
    }

    public void a(ResolvableFuture resolvableFuture0) {
        if(this.d) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.d = true;
        this.b = resolvableFuture0;
        Intent intent0 = new Intent("android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService").setPackage(PackageManagerCompat.b(this.c.getPackageManager()));
        this.c.bindService(intent0, this, 1);
    }

    public void b() {
        if(!this.d) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.d = false;
        this.c.unbindService(this);
    }

    private IUnusedAppRestrictionsBackportCallback c() {
        return new Stub() {
            final UnusedAppRestrictionsBackportServiceConnection b;

            @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void C0(boolean z, boolean z1) throws RemoteException {
                if(z) {
                    if(z1) {
                        UnusedAppRestrictionsBackportServiceConnection.this.b.r(3);
                        return;
                    }
                    UnusedAppRestrictionsBackportServiceConnection.this.b.r(2);
                    return;
                }
                UnusedAppRestrictionsBackportServiceConnection.this.b.r(0);
                Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
            }
        };
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportService0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.i1(iBinder0);
        this.a = iUnusedAppRestrictionsBackportService0;
        try {
            iUnusedAppRestrictionsBackportService0.N0(this.c());
        }
        catch(RemoteException unused_ex) {
            this.b.r(0);
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName0) {
        this.a = null;
    }
}

