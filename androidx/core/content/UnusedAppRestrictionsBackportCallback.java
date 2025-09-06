package androidx.core.content;

import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

public class UnusedAppRestrictionsBackportCallback {
    private IUnusedAppRestrictionsBackportCallback a;

    @RestrictTo({Scope.a})
    public UnusedAppRestrictionsBackportCallback(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0) {
        this.a = iUnusedAppRestrictionsBackportCallback0;
    }

    public void a(boolean z, boolean z1) throws RemoteException {
        this.a.C0(z, z1);
    }
}

