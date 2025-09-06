package io.realm.internal.android;

import android.os.Handler;
import android.os.Looper;
import io.realm.internal.Keep;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.internal.a;
import o3.h;

@Keep
public class AndroidRealmNotifier extends RealmNotifier {
    private Handler handler;

    public AndroidRealmNotifier(@h OsSharedRealm osSharedRealm0, a a0) {
        super(osSharedRealm0);
        if(a0.b()) {
            this.handler = new Handler(Looper.myLooper());
            return;
        }
        this.handler = null;
    }

    @Override  // io.realm.internal.RealmNotifier
    public boolean post(Runnable runnable0) {
        return this.handler != null && this.handler.post(runnable0);
    }
}

