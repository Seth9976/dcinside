package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.persistence.d;

public class a implements y {
    private final Context a;
    private final d b;
    private AlarmManager c;
    private final g d;
    private final com.google.android.datatransport.runtime.time.a e;
    private static final String f = "AlarmManagerScheduler";
    static final String g = "attemptNumber";
    static final String h = "backendName";
    static final String i = "priority";
    static final String j = "extras";

    @VisibleForTesting
    a(Context context0, d d0, AlarmManager alarmManager0, com.google.android.datatransport.runtime.time.a a0, g g0) {
        this.a = context0;
        this.b = d0;
        this.c = alarmManager0;
        this.e = a0;
        this.d = g0;
    }

    public a(Context context0, d d0, com.google.android.datatransport.runtime.time.a a0, g g0) {
        this(context0, d0, ((AlarmManager)context0.getSystemService("alarm")), a0, g0);
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(r r0, int v, boolean z) {
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.appendQueryParameter("backendName", r0.b());
        uri$Builder0.appendQueryParameter("priority", String.valueOf(C1.a.a(r0.d())));
        if(r0.c() != null) {
            uri$Builder0.appendQueryParameter("extras", Base64.encodeToString(r0.c(), 0));
        }
        Intent intent0 = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent0.setData(uri$Builder0.build());
        intent0.putExtra("attemptNumber", v);
        if(!z && this.c(intent0)) {
            z1.a.c("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", r0);
            return;
        }
        long v1 = this.b.Q2(r0);
        h h0 = r0.d();
        long v2 = this.d.h(h0, v1, v);
        z1.a.e("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", new Object[]{r0, v2, v1, v});
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.a, 0, intent0, (Build.VERSION.SDK_INT < 23 ? 0 : 0x4000000));
        this.c.set(3, this.e.J() + v2, pendingIntent0);
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(r r0, int v) {
        this.a(r0, v, false);
    }

    @VisibleForTesting
    boolean c(Intent intent0) {
        return PendingIntent.getBroadcast(this.a, 0, intent0, (Build.VERSION.SDK_INT < 23 ? 0x20000000 : 0x24000000)) != null;
    }
}

