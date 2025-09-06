package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.a.b;
import android.support.customtabs.trusted.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TrustedWebActivityCallbackRemote {
    private final a a;

    private TrustedWebActivityCallbackRemote(@NonNull a a0) {
        this.a = a0;
    }

    @Nullable
    static TrustedWebActivityCallbackRemote a(@Nullable IBinder iBinder0) {
        a a0 = iBinder0 == null ? null : b.i1(iBinder0);
        return a0 == null ? null : new TrustedWebActivityCallbackRemote(a0);
    }

    public void b(@NonNull String s, @NonNull Bundle bundle0) throws RemoteException {
        this.a.c1(s, bundle0);
    }
}

