package com.dcinside.app.auth;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthenticationService extends Service {
    private c a;

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return this.a.getIBinder();
    }

    @Override  // android.app.Service
    public void onCreate() {
        this.a = new c(this);
    }
}

