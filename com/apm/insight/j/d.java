package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.l.a;
import java.util.ArrayList;
import java.util.List;

public final class d {
    private List a;

    private d(Handler handler0, Context context0) {
        this.a = new ArrayList(3);
        if(a.c(context0)) {
            this.a.add(new c(handler0));
        }
    }

    public static d a(Handler handler0, Context context0) {
        return new d(handler0, context0);
    }

    public final void a() {
        com.apm.insight.a.a(("[ScheduleTaskManager] execute, task size=" + this.a.size()));
        for(Object object0: this.a) {
            com.apm.insight.j.a a0 = (com.apm.insight.j.a)object0;
            try {
                a0.a();
            }
            catch(Throwable unused_ex) {
            }
        }
    }
}

