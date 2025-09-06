package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.a;
import android.support.customtabs.d.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PostMessageService extends Service {
    private b a;

    public PostMessageService() {
        this.a = new b() {
            final PostMessageService c;

            @Override  // android.support.customtabs.d
            public void T0(@NonNull a a0, @NonNull String s, @Nullable Bundle bundle0) throws RemoteException {
                a0.d(s, bundle0);
            }

            @Override  // android.support.customtabs.d
            public void m(@NonNull a a0, @Nullable Bundle bundle0) throws RemoteException {
                a0.d1(bundle0);
            }
        };
    }

    @Override  // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent0) {
        return this.a;
    }
}

