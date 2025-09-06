package com.apm.insight.j;

import android.os.Handler;
import com.apm.insight.e;

public final class c extends a {
    c(Handler handler0) {
        super(handler0, 15000L);
    }

    // 去混淆评级： 低(24)
    @Override
    public final void run() {
        if(e.c().b()) {
            return;
        }
        this.a(this.b());
        com.apm.insight.a.a("[DeviceIdTask] did is null, continue check.");
    }
}

