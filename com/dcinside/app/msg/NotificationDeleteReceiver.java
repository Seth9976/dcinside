package com.dcinside.app.msg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import com.dcinside.app.realm.n;
import com.dcinside.app.util.dl;
import g0.c;
import io.realm.F0;
import io.realm.g1;
import java.util.ArrayList;
import timber.log.b;

public class NotificationDeleteReceiver extends BroadcastReceiver {
    public static final String a = "com.dcinside.app.action.POST_REPLIED";
    public static final String b = "com.dcinside.app.action.GROUP_REPLIED";

    private void b(Intent intent0) {
        if(intent0.getBooleanExtra("com.dcinside.app.extra.EXTRA_PUSH_ALERT_MY_ACTIVE", false)) {
            n.j.b(c.e.c());
            return;
        }
        n.j.b(c.h.c());
    }

    private int c(Intent intent0, Context context0) {
        ArrayList arrayList0 = new ArrayList();
        String s = intent0.getStringExtra("com.dcinside.app.extra.GALLERY_ID");
        int v = 0;
        int v1 = intent0.getIntExtra("com.dcinside.app.extra.POST_NUMBER", 0);
        try(F0 f00 = F0.g4()) {
            g1 g10 = f00.C4(n.class).i0("galleryId", s).f0("postNumber", v1).p0();
            if(!g10.isEmpty()) {
                f00.Y3((F0 f00) -> for(Object object0: g10) {
                    long v = ((n)object0).S5();
                    NotificationManagerCompat.q(context0).c(((int)(v % 10L + 1100L)));
                    arrayList0.add(((n)object0).Q5());
                    ((n)object0).z5();
                });
            }
        }
        catch(Exception exception0) {
            b.B(exception0);
        }
        for(Object object0: arrayList0) {
            v += (int)(((Integer)object0));
        }
        return v;
    }

    // 检测为 Lambda 实现
    private static void d(g1 g10, Context context0, ArrayList arrayList0, F0 f00) [...]

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        String s = intent0.getAction();
        if(s == null) {
            return;
        }
        try {
            if("com.dcinside.app.action.POST_REPLIED".equals(s)) {
                int v = this.c(intent0, context0);
                int v1 = Math.max(0, dl.a.w1() - v);
                dl.a.m5(v1);
                MessagingService.o.b(context0, v1);
                return;
            }
            if("com.dcinside.app.action.GROUP_REPLIED".equals(s)) {
                this.b(intent0);
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }
}

