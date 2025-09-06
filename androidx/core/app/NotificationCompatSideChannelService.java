package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.a.b;
import androidx.annotation.DeprecatedSinceApi;

public abstract class NotificationCompatSideChannelService extends Service {
    class NotificationSideChannelStub extends b {
        final NotificationCompatSideChannelService d;

        @Override  // android.support.v4.app.a
        public void L0(String s) {
            int v = Binder.getCallingUid();
            NotificationCompatSideChannelService.this.c(v, s);
            long v1 = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.b(s);
            }
            finally {
                Binder.restoreCallingIdentity(v1);
            }
        }

        @Override  // android.support.v4.app.a
        public void l0(String s, int v, String s1, Notification notification0) throws RemoteException {
            int v1 = Binder.getCallingUid();
            NotificationCompatSideChannelService.this.c(v1, s);
            long v2 = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.d(s, v, s1, notification0);
            }
            finally {
                Binder.restoreCallingIdentity(v2);
            }
        }

        @Override  // android.support.v4.app.a
        public void o(String s, int v, String s1) throws RemoteException {
            int v1 = Binder.getCallingUid();
            NotificationCompatSideChannelService.this.c(v1, s);
            long v2 = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.a(s, v, s1);
            }
            finally {
                Binder.restoreCallingIdentity(v2);
            }
        }
    }

    public abstract void a(String arg1, int arg2, String arg3);

    public abstract void b(String arg1);

    void c(int v, String s) {
        String[] arr_s = this.getPackageManager().getPackagesForUid(v);
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(arr_s[v1].equals(s)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + v + " is not authorized for package " + s);
    }

    public abstract void d(String arg1, int arg2, String arg3, Notification arg4);

    @Override  // android.app.Service
    @DeprecatedSinceApi(api = 19, message = "SDKs past 19 have no need for side channeling.")
    public IBinder onBind(Intent intent0) {
        intent0.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}

