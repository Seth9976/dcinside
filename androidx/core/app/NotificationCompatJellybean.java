package androidx.core.app;

import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jeb.synthetic.FIN;

class NotificationCompatJellybean {
    public static final String a = "NotificationCompat";
    static final String b = "android.support.dataRemoteInputs";
    static final String c = "android.support.allowGeneratedReplies";
    private static final String d = "icon";
    private static final String e = "title";
    private static final String f = "actionIntent";
    private static final String g = "extras";
    private static final String h = "remoteInputs";
    private static final String i = "dataOnlyRemoteInputs";
    private static final String j = "resultKey";
    private static final String k = "label";
    private static final String l = "choices";
    private static final String m = "allowFreeFormInput";
    private static final String n = "allowedDataTypes";
    private static final String o = "semanticAction";
    private static final String p = "showsUserInterface";
    private static final Object q;
    private static Field r;
    private static boolean s;
    private static final Object t;
    private static Field u;
    private static Field v;
    private static Field w;
    private static Field x;
    private static boolean y;

    static {
        NotificationCompatJellybean.q = new Object();
        NotificationCompatJellybean.t = new Object();
    }

    public static SparseArray a(List list0) {
        int v = list0.size();
        SparseArray sparseArray0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            Bundle bundle0 = (Bundle)list0.get(v1);
            if(bundle0 != null) {
                if(sparseArray0 == null) {
                    sparseArray0 = new SparseArray();
                }
                sparseArray0.put(v1, bundle0);
            }
        }
        return sparseArray0;
    }

    private static boolean b() {
        if(NotificationCompatJellybean.y) {
            return false;
        }
        if(NotificationCompatJellybean.u == null) {
            try {
                NotificationCompatJellybean.v = Notification.Action.class.getDeclaredField("icon");
                NotificationCompatJellybean.w = Notification.Action.class.getDeclaredField("title");
                NotificationCompatJellybean.x = Notification.Action.class.getDeclaredField("actionIntent");
                Field field0 = Notification.class.getDeclaredField("actions");
                NotificationCompatJellybean.u = field0;
                field0.setAccessible(true);
                return !NotificationCompatJellybean.y;
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.e("NotificationCompat", "Unable to access notification actions", classNotFoundException0);
                NotificationCompatJellybean.y = true;
                return !NotificationCompatJellybean.y;
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.e("NotificationCompat", "Unable to access notification actions", noSuchFieldException0);
                NotificationCompatJellybean.y = true;
                return false;
            }
        }
        return !NotificationCompatJellybean.y;
    }

    private static RemoteInput c(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getStringArrayList("allowedDataTypes");
        HashSet hashSet0 = new HashSet();
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                hashSet0.add(((String)object0));
            }
        }
        return new RemoteInput(bundle0.getString("resultKey"), bundle0.getCharSequence("label"), bundle0.getCharSequenceArray("choices"), bundle0.getBoolean("allowFreeFormInput"), 0, bundle0.getBundle("extras"), hashSet0);
    }

    private static RemoteInput[] d(Bundle[] arr_bundle) {
        if(arr_bundle == null) {
            return null;
        }
        RemoteInput[] arr_remoteInput = new RemoteInput[arr_bundle.length];
        for(int v = 0; v < arr_bundle.length; ++v) {
            arr_remoteInput[v] = NotificationCompatJellybean.c(arr_bundle[v]);
        }
        return arr_remoteInput;
    }

    public static Action e(Notification notification0, int v) {
        Bundle bundle1;
        synchronized(NotificationCompatJellybean.t) {
            try {
                Object[] arr_object = NotificationCompatJellybean.h(notification0);
                if(arr_object != null) {
                    Object object1 = arr_object[v];
                    Bundle bundle0 = NotificationCompatJellybean.k(notification0);
                    if(bundle0 == null) {
                        bundle1 = null;
                    }
                    else {
                        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android.support.actionExtras");
                        bundle1 = sparseArray0 == null ? null : ((Bundle)sparseArray0.get(v));
                    }
                    return NotificationCompatJellybean.l(NotificationCompatJellybean.v.getInt(object1), ((CharSequence)NotificationCompatJellybean.w.get(object1)), ((PendingIntent)NotificationCompatJellybean.x.get(object1)), bundle1);
                }
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("NotificationCompat", "Unable to access notification actions", illegalAccessException0);
                NotificationCompatJellybean.y = true;
            }
        }
        return null;
    }

    public static int f(Notification notification0) {
        synchronized(NotificationCompatJellybean.t) {
            Object[] arr_object = NotificationCompatJellybean.h(notification0);
            return arr_object == null ? 0 : arr_object.length;
        }
    }

    static Action g(Bundle bundle0) {
        Bundle bundle1 = bundle0.getBundle("extras");
        if(bundle1 != null) {
            boolean z = bundle1.getBoolean("android.support.allowGeneratedReplies", false);
            return new Action(bundle0.getInt("icon"), bundle0.getCharSequence("title"), ((PendingIntent)bundle0.getParcelable("actionIntent")), bundle0.getBundle("extras"), NotificationCompatJellybean.d(NotificationCompatJellybean.i(bundle0, "remoteInputs")), NotificationCompatJellybean.d(NotificationCompatJellybean.i(bundle0, "dataOnlyRemoteInputs")), z, bundle0.getInt("semanticAction"), bundle0.getBoolean("showsUserInterface"), false, false);
        }
        return new Action(bundle0.getInt("icon"), bundle0.getCharSequence("title"), ((PendingIntent)bundle0.getParcelable("actionIntent")), bundle0.getBundle("extras"), NotificationCompatJellybean.d(NotificationCompatJellybean.i(bundle0, "remoteInputs")), NotificationCompatJellybean.d(NotificationCompatJellybean.i(bundle0, "dataOnlyRemoteInputs")), false, bundle0.getInt("semanticAction"), bundle0.getBoolean("showsUserInterface"), false, false);
    }

    private static Object[] h(Notification notification0) {
        Object object0 = NotificationCompatJellybean.t;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(!NotificationCompatJellybean.b()) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return null;
        }
        try {
            Object[] arr_object = (Object[])NotificationCompatJellybean.u.get(notification0);
            FIN.finallyExec$NT(v);
            return arr_object;
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("NotificationCompat", "Unable to access notification actions", illegalAccessException0);
            NotificationCompatJellybean.y = true;
            FIN.finallyExec$NT(v);
            return null;
        }
    }

    private static Bundle[] i(Bundle bundle0, String s) {
        Parcelable[] arr_parcelable = bundle0.getParcelableArray(s);
        if(!(arr_parcelable instanceof Bundle[]) && arr_parcelable != null) {
            Bundle[] arr_bundle = (Bundle[])Arrays.copyOf(arr_parcelable, arr_parcelable.length, Bundle[].class);
            bundle0.putParcelableArray(s, arr_bundle);
            return arr_bundle;
        }
        return (Bundle[])arr_parcelable;
    }

    static Bundle j(Action notificationCompat$Action0) {
        Bundle bundle0 = new Bundle();
        IconCompat iconCompat0 = notificationCompat$Action0.f();
        bundle0.putInt("icon", (iconCompat0 == null ? 0 : iconCompat0.u()));
        bundle0.putCharSequence("title", notificationCompat$Action0.j());
        bundle0.putParcelable("actionIntent", notificationCompat$Action0.a());
        Bundle bundle1 = notificationCompat$Action0.d() == null ? new Bundle() : new Bundle(notificationCompat$Action0.d());
        bundle1.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action0.b());
        bundle0.putBundle("extras", bundle1);
        bundle0.putParcelableArray("remoteInputs", NotificationCompatJellybean.n(notificationCompat$Action0.g()));
        bundle0.putBoolean("showsUserInterface", notificationCompat$Action0.i());
        bundle0.putInt("semanticAction", notificationCompat$Action0.h());
        return bundle0;
    }

    public static Bundle k(Notification notification0) {
        synchronized(NotificationCompatJellybean.q) {
            if(NotificationCompatJellybean.s) {
                return null;
            }
            try {
                if(NotificationCompatJellybean.r == null) {
                    Field field0 = Notification.class.getDeclaredField("extras");
                    Class class0 = field0.getType();
                    if(!Bundle.class.isAssignableFrom(class0)) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        NotificationCompatJellybean.s = true;
                        return null;
                    }
                    field0.setAccessible(true);
                    NotificationCompatJellybean.r = field0;
                }
                Bundle bundle0 = (Bundle)NotificationCompatJellybean.r.get(notification0);
                if(bundle0 == null) {
                    bundle0 = new Bundle();
                    NotificationCompatJellybean.r.set(notification0, bundle0);
                }
                return bundle0;
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("NotificationCompat", "Unable to access notification extras", illegalAccessException0);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.e("NotificationCompat", "Unable to access notification extras", noSuchFieldException0);
            }
            NotificationCompatJellybean.s = true;
            return null;
        }
    }

    public static Action l(int v, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0) {
        return bundle0 == null ? new Action(v, charSequence0, pendingIntent0, null, null, null, false, 0, true, false, false) : new Action(v, charSequence0, pendingIntent0, bundle0, NotificationCompatJellybean.d(NotificationCompatJellybean.i(bundle0, "android.support.remoteInputs")), NotificationCompatJellybean.d(NotificationCompatJellybean.i(bundle0, "android.support.dataRemoteInputs")), bundle0.getBoolean("android.support.allowGeneratedReplies"), 0, true, false, false);
    }

    private static Bundle m(RemoteInput remoteInput0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("resultKey", remoteInput0.o());
        bundle0.putCharSequence("label", remoteInput0.n());
        bundle0.putCharSequenceArray("choices", remoteInput0.h());
        bundle0.putBoolean("allowFreeFormInput", remoteInput0.f());
        bundle0.putBundle("extras", remoteInput0.m());
        Set set0 = remoteInput0.g();
        if(set0 != null && !set0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(set0.size());
            for(Object object0: set0) {
                arrayList0.add(((String)object0));
            }
            bundle0.putStringArrayList("allowedDataTypes", arrayList0);
        }
        return bundle0;
    }

    private static Bundle[] n(RemoteInput[] arr_remoteInput) {
        if(arr_remoteInput == null) {
            return null;
        }
        Bundle[] arr_bundle = new Bundle[arr_remoteInput.length];
        for(int v = 0; v < arr_remoteInput.length; ++v) {
            arr_bundle[v] = NotificationCompatJellybean.m(arr_remoteInput[v]);
        }
        return arr_bundle;
    }

    public static Bundle o(Notification.Builder notification$Builder0, Action notificationCompat$Action0) {
        IconCompat iconCompat0 = notificationCompat$Action0.f();
        notification$Builder0.addAction((iconCompat0 == null ? 0 : iconCompat0.u()), notificationCompat$Action0.j(), notificationCompat$Action0.a());
        Bundle bundle0 = new Bundle(notificationCompat$Action0.d());
        if(notificationCompat$Action0.g() != null) {
            bundle0.putParcelableArray("android.support.remoteInputs", NotificationCompatJellybean.n(notificationCompat$Action0.g()));
        }
        if(notificationCompat$Action0.c() != null) {
            bundle0.putParcelableArray("android.support.dataRemoteInputs", NotificationCompatJellybean.n(notificationCompat$Action0.c()));
        }
        bundle0.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action0.b());
        return bundle0;
    }
}

