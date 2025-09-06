package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;

class r0 extends Binder {
    interface a {
        Task a(Intent arg1);
    }

    private final a a;

    r0(a r0$a0) {
        this.a = r0$a0;
    }

    // 检测为 Lambda 实现
    private static void b(com.google.firebase.messaging.u0.a u0$a0, Task task0) [...]

    void c(com.google.firebase.messaging.u0.a u0$a0) {
        if(Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.a.a(u0$a0.a).addOnCompleteListener(new androidx.media3.exoplayer.dash.offline.a(), (Task task0) -> u0$a0.d());
    }
}

