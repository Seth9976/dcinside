package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub;

public abstract class UnusedAppRestrictionsBackportService extends Service {
    private Stub a;
    @SuppressLint({"ActionValue"})
    public static final String b = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    public UnusedAppRestrictionsBackportService() {
        this.a = new Stub() {
            final UnusedAppRestrictionsBackportService b;

            @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public void N0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0) throws RemoteException {
                if(iUnusedAppRestrictionsBackportCallback0 == null) {
                    return;
                }
                UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback0 = new UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback0);
                UnusedAppRestrictionsBackportService.this.a(unusedAppRestrictionsBackportCallback0);
            }
        };
    }

    protected abstract void a(UnusedAppRestrictionsBackportCallback arg1);

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return this.a;
    }
}

