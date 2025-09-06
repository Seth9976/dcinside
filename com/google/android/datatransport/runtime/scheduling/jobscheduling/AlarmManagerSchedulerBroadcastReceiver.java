package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.r.a;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.w;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static void a() {
    }

    private static void b() {
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        String s = intent0.getData().getQueryParameter("backendName");
        String s1 = intent0.getData().getQueryParameter("extras");
        int v = (int)Integer.valueOf(intent0.getData().getQueryParameter("priority"));
        int v1 = intent0.getExtras().getInt("attemptNumber");
        w.f(context0);
        a r$a0 = r.a().b(s).d(C1.a.b(v));
        if(s1 != null) {
            r$a0.c(Base64.decode(s1, 0));
        }
        w.c().e().v(r$a0.a(), v1, new b());
    }
}

