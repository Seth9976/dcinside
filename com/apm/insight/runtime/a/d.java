package com.apm.insight.runtime.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.m;

final class d {
    final class a extends BroadcastReceiver {
        private d a;

        private a() {
        }

        a(byte b) {
        }

        @Override  // android.content.BroadcastReceiver
        public final void onReceive(Context context0, Intent intent0) {
            try {
                if("android.intent.action.BATTERY_CHANGED".equals(intent0.getAction())) {
                    int v = intent0.getIntExtra("level", 0);
                    int v1 = intent0.getIntExtra("scale", 100);
                    d.this.a = (int)(((float)v) * 100.0f / ((float)v1));
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private int a;

    d(Context context0) {
        m.a().a(new Runnable() {
            private d b;

            @Override
            public final void run() {
                try {
                    context0.registerReceiver(new a(d.this, 0), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                }
                catch(Throwable throwable0) {
                    j.a(throwable0, "NPTH_CATCH");
                }
            }
        });
    }

    public final int a() {
        return this.a;
    }
}

