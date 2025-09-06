package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.a.b;
import android.support.v4.app.a;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class NotificationManagerCompat {
    @RequiresApi(23)
    static class Api23Impl {
        static List a(NotificationManager notificationManager0) {
            StatusBarNotification[] arr_statusBarNotification = notificationManager0.getActiveNotifications();
            return arr_statusBarNotification == null ? new ArrayList() : Arrays.asList(arr_statusBarNotification);
        }

        static int b(NotificationManager notificationManager0) {
            return notificationManager0.getCurrentInterruptionFilter();
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static boolean a(NotificationManager notificationManager0) {
            return notificationManager0.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager0) {
            return notificationManager0.getImportance();
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static void a(NotificationManager notificationManager0, NotificationChannel notificationChannel0) {
            notificationManager0.createNotificationChannel(notificationChannel0);
        }

        static void b(NotificationManager notificationManager0, NotificationChannelGroup notificationChannelGroup0) {
            notificationManager0.createNotificationChannelGroup(notificationChannelGroup0);
        }

        static void c(NotificationManager notificationManager0, List list0) {
            notificationManager0.createNotificationChannelGroups(list0);
        }

        static void d(NotificationManager notificationManager0, List list0) {
            notificationManager0.createNotificationChannels(list0);
        }

        static void e(NotificationManager notificationManager0, String s) {
            notificationManager0.deleteNotificationChannel(s);
        }

        static void f(NotificationManager notificationManager0, String s) {
            notificationManager0.deleteNotificationChannelGroup(s);
        }

        static String g(NotificationChannel notificationChannel0) {
            return notificationChannel0.getId();
        }

        static String h(NotificationChannelGroup notificationChannelGroup0) {
            return notificationChannelGroup0.getId();
        }

        static NotificationChannel i(NotificationManager notificationManager0, String s) {
            return notificationManager0.getNotificationChannel(s);
        }

        static List j(NotificationManager notificationManager0) {
            return notificationManager0.getNotificationChannelGroups();
        }

        static List k(NotificationManager notificationManager0) {
            return notificationManager0.getNotificationChannels();
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static NotificationChannelGroup a(NotificationManager notificationManager0, String s) {
            return notificationManager0.getNotificationChannelGroup(s);
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static NotificationChannel a(NotificationManager notificationManager0, String s, String s1) {
            return notificationManager0.getNotificationChannel(s, s1);
        }

        static String b(NotificationChannel notificationChannel0) {
            return notificationChannel0.getParentChannelId();
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        static boolean a(NotificationManager notificationManager0) {
            return notificationManager0.canUseFullScreenIntent();
        }
    }

    static class CancelTask implements Task {
        final String a;
        final int b;
        final String c;
        final boolean d;

        CancelTask(String s) {
            this.a = s;
            this.b = 0;
            this.c = null;
            this.d = true;
        }

        CancelTask(String s, int v, String s1) {
            this.a = s;
            this.b = v;
            this.c = s1;
            this.d = false;
        }

        @Override  // androidx.core.app.NotificationManagerCompat$Task
        public void a(a a0) throws RemoteException {
            if(this.d) {
                a0.L0(this.a);
                return;
            }
            a0.o(this.a, this.b, this.c);
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "CancelTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + ", all:" + this.d + "]";
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterruptionFilter {
    }

    public static class NotificationWithIdAndTag {
        final String a;
        final int b;
        Notification c;

        public NotificationWithIdAndTag(int v, Notification notification0) {
            this(null, v, notification0);
        }

        public NotificationWithIdAndTag(String s, int v, Notification notification0) {
            this.a = s;
            this.b = v;
            this.c = notification0;
        }
    }

    static class NotifyTask implements Task {
        final String a;
        final int b;
        final String c;
        final Notification d;

        NotifyTask(String s, int v, String s1, Notification notification0) {
            this.a = s;
            this.b = v;
            this.c = s1;
            this.d = notification0;
        }

        @Override  // androidx.core.app.NotificationManagerCompat$Task
        public void a(a a0) throws RemoteException {
            a0.l0(this.a, this.b, this.c, this.d);
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + "]";
        }
    }

    static class ServiceConnectedEvent {
        final ComponentName a;
        final IBinder b;

        ServiceConnectedEvent(ComponentName componentName0, IBinder iBinder0) {
            this.a = componentName0;
            this.b = iBinder0;
        }
    }

    static class SideChannelManager implements ServiceConnection, Handler.Callback {
        static class ListenerRecord {
            final ComponentName a;
            boolean b;
            a c;
            ArrayDeque d;
            int e;

            ListenerRecord(ComponentName componentName0) {
                this.b = false;
                this.d = new ArrayDeque();
                this.e = 0;
                this.a = componentName0;
            }
        }

        private final Context a;
        private final HandlerThread b;
        private final Handler c;
        private final Map d;
        private Set e;
        private static final int f = 0;
        private static final int g = 1;
        private static final int h = 2;
        private static final int i = 3;

        SideChannelManager(Context context0) {
            this.d = new HashMap();
            this.e = new HashSet();
            this.a = context0;
            HandlerThread handlerThread0 = new HandlerThread("NotificationManagerCompat");
            this.b = handlerThread0;
            handlerThread0.start();
            this.c = new Handler(handlerThread0.getLooper(), this);
        }

        private boolean a(ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord0) {
            if(notificationManagerCompat$SideChannelManager$ListenerRecord0.b) {
                return true;
            }
            Intent intent0 = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(notificationManagerCompat$SideChannelManager$ListenerRecord0.a);
            boolean z = this.a.bindService(intent0, this, 33);
            notificationManagerCompat$SideChannelManager$ListenerRecord0.b = z;
            if(z) {
                notificationManagerCompat$SideChannelManager$ListenerRecord0.e = 0;
                return notificationManagerCompat$SideChannelManager$ListenerRecord0.b;
            }
            Log.w("NotifManCompat", "Unable to bind to listener " + notificationManagerCompat$SideChannelManager$ListenerRecord0.a);
            this.a.unbindService(this);
            return notificationManagerCompat$SideChannelManager$ListenerRecord0.b;
        }

        private void b(ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord0) {
            if(notificationManagerCompat$SideChannelManager$ListenerRecord0.b) {
                this.a.unbindService(this);
                notificationManagerCompat$SideChannelManager$ListenerRecord0.b = false;
            }
            notificationManagerCompat$SideChannelManager$ListenerRecord0.c = null;
        }

        private void c(Task notificationManagerCompat$Task0) {
            this.j();
            for(Object object0: this.d.values()) {
                ((ListenerRecord)object0).d.add(notificationManagerCompat$Task0);
                this.g(((ListenerRecord)object0));
            }
        }

        private void d(ComponentName componentName0) {
            ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord0 = (ListenerRecord)this.d.get(componentName0);
            if(notificationManagerCompat$SideChannelManager$ListenerRecord0 != null) {
                this.g(notificationManagerCompat$SideChannelManager$ListenerRecord0);
            }
        }

        private void e(ComponentName componentName0, IBinder iBinder0) {
            ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord0 = (ListenerRecord)this.d.get(componentName0);
            if(notificationManagerCompat$SideChannelManager$ListenerRecord0 != null) {
                notificationManagerCompat$SideChannelManager$ListenerRecord0.c = b.i1(iBinder0);
                notificationManagerCompat$SideChannelManager$ListenerRecord0.e = 0;
                this.g(notificationManagerCompat$SideChannelManager$ListenerRecord0);
            }
        }

        private void f(ComponentName componentName0) {
            ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord0 = (ListenerRecord)this.d.get(componentName0);
            if(notificationManagerCompat$SideChannelManager$ListenerRecord0 != null) {
                this.b(notificationManagerCompat$SideChannelManager$ListenerRecord0);
            }
        }

        private void g(ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord0) {
            if(Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + notificationManagerCompat$SideChannelManager$ListenerRecord0.a + ", " + notificationManagerCompat$SideChannelManager$ListenerRecord0.d.size() + " queued tasks");
            }
            if(notificationManagerCompat$SideChannelManager$ListenerRecord0.d.isEmpty()) {
                return;
            }
            if(this.a(notificationManagerCompat$SideChannelManager$ListenerRecord0) && notificationManagerCompat$SideChannelManager$ListenerRecord0.c != null) {
                Task notificationManagerCompat$Task0;
                while((notificationManagerCompat$Task0 = (Task)notificationManagerCompat$SideChannelManager$ListenerRecord0.d.peek()) != null) {
                    try {
                        if(Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + notificationManagerCompat$Task0);
                        }
                        notificationManagerCompat$Task0.a(notificationManagerCompat$SideChannelManager$ListenerRecord0.c);
                        notificationManagerCompat$SideChannelManager$ListenerRecord0.d.remove();
                        continue;
                    }
                    catch(DeadObjectException unused_ex) {
                    }
                    catch(RemoteException remoteException0) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + notificationManagerCompat$SideChannelManager$ListenerRecord0.a, remoteException0);
                        break;
                    }
                    if(!Log.isLoggable("NotifManCompat", 3)) {
                        break;
                    }
                    Log.d("NotifManCompat", "Remote service has died: " + notificationManagerCompat$SideChannelManager$ListenerRecord0.a);
                    break;
                }
                if(!notificationManagerCompat$SideChannelManager$ListenerRecord0.d.isEmpty()) {
                    this.i(notificationManagerCompat$SideChannelManager$ListenerRecord0);
                }
                return;
            }
            this.i(notificationManagerCompat$SideChannelManager$ListenerRecord0);
        }

        public void h(Task notificationManagerCompat$Task0) {
            this.c.obtainMessage(0, notificationManagerCompat$Task0).sendToTarget();
        }

        @Override  // android.os.Handler$Callback
        public boolean handleMessage(Message message0) {
            switch(message0.what) {
                case 0: {
                    this.c(((Task)message0.obj));
                    return true;
                }
                case 1: {
                    this.e(((ServiceConnectedEvent)message0.obj).a, ((ServiceConnectedEvent)message0.obj).b);
                    return true;
                }
                case 2: {
                    this.f(((ComponentName)message0.obj));
                    return true;
                }
                case 3: {
                    this.d(((ComponentName)message0.obj));
                    return true;
                }
                default: {
                    return false;
                }
            }
        }

        private void i(ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord0) {
            if(this.c.hasMessages(3, notificationManagerCompat$SideChannelManager$ListenerRecord0.a)) {
                return;
            }
            int v = notificationManagerCompat$SideChannelManager$ListenerRecord0.e;
            notificationManagerCompat$SideChannelManager$ListenerRecord0.e = v + 1;
            if(v + 1 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + notificationManagerCompat$SideChannelManager$ListenerRecord0.d.size() + " tasks to " + notificationManagerCompat$SideChannelManager$ListenerRecord0.a + " after " + notificationManagerCompat$SideChannelManager$ListenerRecord0.e + " retries");
                notificationManagerCompat$SideChannelManager$ListenerRecord0.d.clear();
                return;
            }
            int v1 = (1 << v) * 1000;
            if(Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + v1 + " ms");
            }
            Message message0 = this.c.obtainMessage(3, notificationManagerCompat$SideChannelManager$ListenerRecord0.a);
            this.c.sendMessageDelayed(message0, ((long)v1));
        }

        private void j() {
            Set set0 = NotificationManagerCompat.t(this.a);
            if(set0.equals(this.e)) {
                return;
            }
            this.e = set0;
            List list0 = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                ResolveInfo resolveInfo0 = (ResolveInfo)object0;
                if(set0.contains(resolveInfo0.serviceInfo.packageName)) {
                    ComponentName componentName0 = new ComponentName(resolveInfo0.serviceInfo.packageName, resolveInfo0.serviceInfo.name);
                    if(resolveInfo0.serviceInfo.permission == null) {
                        hashSet0.add(componentName0);
                    }
                    else {
                        Log.w("NotifManCompat", "Permission present on component " + componentName0 + ", not adding listener record.");
                    }
                }
            }
            for(Object object1: hashSet0) {
                ComponentName componentName1 = (ComponentName)object1;
                if(!this.d.containsKey(componentName1)) {
                    if(Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName1);
                    }
                    ListenerRecord notificationManagerCompat$SideChannelManager$ListenerRecord0 = new ListenerRecord(componentName1);
                    this.d.put(componentName1, notificationManagerCompat$SideChannelManager$ListenerRecord0);
                }
            }
            Iterator iterator2 = this.d.entrySet().iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                Map.Entry map$Entry0 = (Map.Entry)object2;
                if(!hashSet0.contains(map$Entry0.getKey())) {
                    if(Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + map$Entry0.getKey());
                    }
                    this.b(((ListenerRecord)map$Entry0.getValue()));
                    iterator2.remove();
                }
            }
        }

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
            if(Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName0);
            }
            ServiceConnectedEvent notificationManagerCompat$ServiceConnectedEvent0 = new ServiceConnectedEvent(componentName0, iBinder0);
            this.c.obtainMessage(1, notificationManagerCompat$ServiceConnectedEvent0).sendToTarget();
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName0) {
            if(Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName0);
            }
            this.c.obtainMessage(2, componentName0).sendToTarget();
        }
    }

    interface Task {
        void a(a arg1) throws RemoteException;
    }

    public static final int A = 4;
    public static final int B = 5;
    private final Context a;
    private final NotificationManager b;
    private static final String c = "NotifManCompat";
    private static final String d = "checkOpNoThrow";
    private static final String e = "OP_POST_NOTIFICATION";
    public static final String f = "android.support.useSideChannel";
    public static final String g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    static final int h = 19;
    private static final int i = 1000;
    private static final int j = 6;
    private static final String k = "enabled_notification_listeners";
    private static final Object l = null;
    @GuardedBy("sEnabledNotificationListenersLock")
    private static String m = null;
    @GuardedBy("sEnabledNotificationListenersLock")
    private static Set n = null;
    private static final Object o = null;
    @GuardedBy("sLock")
    private static SideChannelManager p = null;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final int t = 4;
    public static final int u = 0;
    public static final int v = -1000;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 3;

    static {
        NotificationManagerCompat.l = new Object();
        NotificationManagerCompat.n = new HashSet();
        NotificationManagerCompat.o = new Object();
    }

    @VisibleForTesting
    NotificationManagerCompat(NotificationManager notificationManager0, Context context0) {
        this.a = context0;
        this.b = notificationManager0;
    }

    private NotificationManagerCompat(Context context0) {
        this.a = context0;
        this.b = (NotificationManager)context0.getSystemService("notification");
    }

    public NotificationChannelGroupCompat A(String s) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            NotificationChannelGroup notificationChannelGroup0 = this.z(s);
            return notificationChannelGroup0 == null ? null : new NotificationChannelGroupCompat(notificationChannelGroup0);
        }
        if(v >= 26) {
            NotificationChannelGroup notificationChannelGroup1 = this.z(s);
            return notificationChannelGroup1 == null ? null : new NotificationChannelGroupCompat(notificationChannelGroup1, this.D());
        }
        return null;
    }

    public List B() {
        return Build.VERSION.SDK_INT < 26 ? Collections.emptyList() : Api26Impl.j(this.b);
    }

    public List C() {
        int v = Build.VERSION.SDK_INT;
        if(v >= 26) {
            List list0 = this.B();
            if(!list0.isEmpty()) {
                List list1 = v < 28 ? this.D() : Collections.emptyList();
                List list2 = new ArrayList(list0.size());
                for(Object object0: list0) {
                    NotificationChannelGroup notificationChannelGroup0 = (NotificationChannelGroup)object0;
                    if(Build.VERSION.SDK_INT >= 28) {
                        list2.add(new NotificationChannelGroupCompat(notificationChannelGroup0));
                    }
                    else {
                        list2.add(new NotificationChannelGroupCompat(notificationChannelGroup0, list1));
                    }
                }
                return list2;
            }
        }
        return Collections.emptyList();
    }

    public List D() {
        return Build.VERSION.SDK_INT < 26 ? Collections.emptyList() : Api26Impl.k(this.b);
    }

    public List E() {
        if(Build.VERSION.SDK_INT >= 26) {
            List list0 = this.D();
            if(!list0.isEmpty()) {
                List list1 = new ArrayList(list0.size());
                for(Object object0: list0) {
                    list1.add(new NotificationChannelCompat(((NotificationChannel)object0)));
                }
                return list1;
            }
        }
        return Collections.emptyList();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void F(int v, Notification notification0) {
        this.G(null, v, notification0);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void G(String s, int v, Notification notification0) {
        if(NotificationManagerCompat.J(notification0)) {
            this.I(new NotifyTask("com.dcinside.app.android", v, s, notification0));
            this.b.cancel(s, v);
            return;
        }
        this.b.notify(s, v, notification0);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void H(List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            NotificationWithIdAndTag notificationManagerCompat$NotificationWithIdAndTag0 = (NotificationWithIdAndTag)list0.get(v1);
            this.G(notificationManagerCompat$NotificationWithIdAndTag0.a, notificationManagerCompat$NotificationWithIdAndTag0.b, notificationManagerCompat$NotificationWithIdAndTag0.c);
        }
    }

    private void I(Task notificationManagerCompat$Task0) {
        synchronized(NotificationManagerCompat.o) {
            if(NotificationManagerCompat.p == null) {
                NotificationManagerCompat.p = new SideChannelManager(this.a.getApplicationContext());
            }
            NotificationManagerCompat.p.h(notificationManagerCompat$Task0);
        }
    }

    private static boolean J(Notification notification0) {
        Bundle bundle0 = NotificationCompat.n(notification0);
        return bundle0 != null && bundle0.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if(Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.a(this.b);
        }
        AppOpsManager appOpsManager0 = (AppOpsManager)this.a.getSystemService("appops");
        int v = this.a.getApplicationInfo().uid;
        try {
            Method method0 = AppOpsManager.class.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
            Integer integer0 = (Integer)AppOpsManager.class.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            integer0.intValue();
            return ((int)(((Integer)method0.invoke(appOpsManager0, integer0, v, "com.dcinside.app.android")))) == 0;
        }
        catch(ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException unused_ex) {
            return true;
        }
    }

    public boolean b() {
        int v = Build.VERSION.SDK_INT;
        if(v < 29) {
            return true;
        }
        return v >= 34 ? Api34Impl.a(this.b) : this.a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0;
    }

    public void c(int v) {
        this.d(null, v);
    }

    public void d(String s, int v) {
        this.b.cancel(s, v);
    }

    public void e() {
        this.b.cancelAll();
    }

    public void f(NotificationChannel notificationChannel0) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.a(this.b, notificationChannel0);
        }
    }

    public void g(NotificationChannelCompat notificationChannelCompat0) {
        this.f(notificationChannelCompat0.m());
    }

    public void h(NotificationChannelGroup notificationChannelGroup0) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.b(this.b, notificationChannelGroup0);
        }
    }

    public void i(NotificationChannelGroupCompat notificationChannelGroupCompat0) {
        this.h(notificationChannelGroupCompat0.f());
    }

    public void j(List list0) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.c(this.b, list0);
        }
    }

    public void k(List list0) {
        if(Build.VERSION.SDK_INT >= 26 && !list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                arrayList0.add(((NotificationChannelGroupCompat)object0).f());
            }
            Api26Impl.c(this.b, arrayList0);
        }
    }

    public void l(List list0) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.d(this.b, list0);
        }
    }

    public void m(List list0) {
        if(Build.VERSION.SDK_INT >= 26 && !list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                arrayList0.add(((NotificationChannelCompat)object0).m());
            }
            Api26Impl.d(this.b, arrayList0);
        }
    }

    public void n(String s) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.e(this.b, s);
        }
    }

    public void o(String s) {
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.f(this.b, s);
        }
    }

    public void p(Collection collection0) {
        if(Build.VERSION.SDK_INT >= 26) {
            for(Object object0: Api26Impl.k(this.b)) {
                NotificationChannel notificationChannel0 = (NotificationChannel)object0;
                if(!collection0.contains(Api26Impl.g(notificationChannel0)) && (Build.VERSION.SDK_INT < 30 || !collection0.contains(Api30Impl.b(notificationChannel0)))) {
                    String s = Api26Impl.g(notificationChannel0);
                    Api26Impl.e(this.b, s);
                }
            }
        }
    }

    public static NotificationManagerCompat q(Context context0) {
        return new NotificationManagerCompat(context0);
    }

    public List r() {
        return Build.VERSION.SDK_INT >= 23 ? Api23Impl.a(this.b) : new ArrayList();
    }

    public int s() {
        return Build.VERSION.SDK_INT >= 23 ? Api23Impl.b(this.b) : 0;
    }

    public static Set t(Context context0) {
        String s = Settings.Secure.getString(context0.getContentResolver(), "enabled_notification_listeners");
        synchronized(NotificationManagerCompat.l) {
            if(s != null && !s.equals(NotificationManagerCompat.m)) {
                String[] arr_s = s.split(":", -1);
                HashSet hashSet0 = new HashSet(arr_s.length);
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    ComponentName componentName0 = ComponentName.unflattenFromString(arr_s[v1]);
                    if(componentName0 != null) {
                        hashSet0.add(componentName0.getPackageName());
                    }
                }
                NotificationManagerCompat.n = hashSet0;
                NotificationManagerCompat.m = s;
            }
            return NotificationManagerCompat.n;
        }
    }

    public int u() {
        return Build.VERSION.SDK_INT < 24 ? -1000 : Api24Impl.b(this.b);
    }

    public NotificationChannel v(String s) {
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.i(this.b, s);
    }

    public NotificationChannel w(String s, String s1) {
        return Build.VERSION.SDK_INT < 30 ? this.v(s) : Api30Impl.a(this.b, s, s1);
    }

    public NotificationChannelCompat x(String s) {
        if(Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel0 = this.v(s);
            return notificationChannel0 == null ? null : new NotificationChannelCompat(notificationChannel0);
        }
        return null;
    }

    public NotificationChannelCompat y(String s, String s1) {
        if(Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel0 = this.w(s, s1);
            return notificationChannel0 == null ? null : new NotificationChannelCompat(notificationChannel0);
        }
        return null;
    }

    public NotificationChannelGroup z(String s) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            return Api28Impl.a(this.b, s);
        }
        if(v >= 26) {
            for(Object object0: this.B()) {
                NotificationChannelGroup notificationChannelGroup0 = (NotificationChannelGroup)object0;
                if(Api26Impl.h(notificationChannelGroup0).equals(s)) {
                    return notificationChannelGroup0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }
}

