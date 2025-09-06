package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.iab.omid.library.vungle.adsession.q;
import java.lang.ref.WeakReference;

public class j {
    private WeakReference a;
    private boolean b;
    private boolean c;
    @SuppressLint({"StaticFieldLeak"})
    private static j d;

    static {
        j.d = new j();
    }

    public j() {
        this.b = false;
        this.c = false;
    }

    public void a() {
        Context context0 = (Context)this.a.get();
        if(context0 == null) {
            return;
        }
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        boolean z = Build.VERSION.SDK_INT < 22 ? keyguardManager0.inKeyguardRestrictedInputMode() : keyguardManager0.isDeviceLocked();
        this.c(this.b, z);
        this.c = z;
    }

    public void b(Context context0) {
        class a extends BroadcastReceiver {
            final j a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                boolean z1;
                boolean z;
                j j0;
                if(intent0.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    j0 = j.this;
                    z = j0.c;
                    z1 = true;
                }
                else if(intent0.getAction().equals("android.intent.action.SCREEN_ON")) {
                    j0 = j.this;
                    z = j0.c;
                    z1 = false;
                }
                else {
                    return;
                }
                j0.c(z1, z);
                j.this.b = z1;
            }
        }

        if(context0 == null) {
            return;
        }
        this.a = new WeakReference(context0);
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter0.addAction("android.intent.action.SCREEN_ON");
        context0.registerReceiver(new a(this), intentFilter0);
    }

    public void c(boolean z, boolean z1) {
        if((z1 || z ? 1 : 0) == (this.c || this.b ? 1 : 0)) {
            return;
        }
        for(Object object0: c.e().c()) {
            ((q)object0).f().r(z1 || z);
        }
    }

    public static j f() {
        return j.d;
    }
}

