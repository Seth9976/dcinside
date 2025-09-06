package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends j {
    private Rpc h;
    static final String i = "com.google.android.c2dm.intent.RECEIVE";
    public static final String j = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String k = "com.google.firebase.messaging.NEW_TOKEN";
    static final String l = "token";
    private static final int m = 10;
    private static final Queue n;

    static {
        FirebaseMessagingService.n = new ArrayDeque(10);
    }

    @Override  // com.google.firebase.messaging.j
    protected Intent e(Intent intent0) {
        return e0.b().c();
    }

    @Override  // com.google.firebase.messaging.j
    public void f(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.c2dm.intent.RECEIVE".equals(s) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(s)) {
            if("com.google.firebase.messaging.NEW_TOKEN".equals(s)) {
                this.t(intent0.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent0.getAction());
            return;
        }
        this.p(intent0);
    }

    private boolean l(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Queue queue0 = FirebaseMessagingService.n;
        if(queue0.contains(s)) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + s);
            }
            return true;
        }
        if(queue0.size() >= 10) {
            queue0.remove();
        }
        queue0.add(s);
        return false;
    }

    private void m(Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.remove("androidx.content.wakelockid");
        if(S.v(bundle0)) {
            S s0 = new S(bundle0);
            ExecutorService executorService0 = p.f();
            g g0 = new g(this, s0, executorService0);
            try {
                if(g0.a()) {
                    return;
                }
            }
            finally {
                executorService0.shutdown();
            }
            if(O.E(intent0)) {
                O.w(intent0);
            }
        }
        this.r(new RemoteMessage(bundle0));
    }

    private String n(Intent intent0) {
        String s = intent0.getStringExtra("google.message_id");
        return s == null ? intent0.getStringExtra("message_id") : s;
    }

    private Rpc o(Context context0) {
        if(this.h == null) {
            this.h = new Rpc(context0.getApplicationContext());
        }
        return this.h;
    }

    private void p(Intent intent0) {
        if(!this.l(intent0.getStringExtra("google.message_id"))) {
            this.v(intent0);
        }
        this.o(this).messageHandled(new CloudMessage(intent0));
    }

    @WorkerThread
    public void q() {
    }

    @WorkerThread
    public void r(@NonNull RemoteMessage remoteMessage0) {
    }

    @WorkerThread
    public void s(@NonNull String s) {
    }

    @WorkerThread
    public void t(@NonNull String s) {
    }

    @WorkerThread
    public void u(@NonNull String s, @NonNull Exception exception0) {
    }

    private void v(Intent intent0) {
        String s = intent0.getStringExtra("message_type");
        if(s == null) {
            s = "gcm";
        }
        switch(s) {
            case "deleted_messages": {
                return;
            }
            case "gcm": {
                O.y(intent0);
                this.m(intent0);
                return;
            }
            case "send_error": {
                this.u(this.n(intent0), new d0(intent0.getStringExtra("error")));
                return;
            }
            case "send_event": {
                this.s(intent0.getStringExtra("google.message_id"));
                return;
            }
            default: {
                Log.w("FirebaseMessaging", "Received message with unknown type: " + s);
            }
        }
    }

    @VisibleForTesting
    static void w() {
        FirebaseMessagingService.n.clear();
    }

    @VisibleForTesting
    void x(Rpc rpc0) {
        this.h = rpc0;
    }
}

