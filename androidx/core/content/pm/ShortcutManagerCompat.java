package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import j..util.Objects;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ShortcutManagerCompat {
    @RequiresApi(25)
    static class Api25Impl {
        static String a(List list0) {
            int v = -1;
            String s = null;
            for(Object object0: list0) {
                ShortcutInfo shortcutInfo0 = (ShortcutInfo)object0;
                if(shortcutInfo0.getRank() > v) {
                    s = shortcutInfo0.getId();
                    v = shortcutInfo0.getRank();
                }
            }
            return s;
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    @VisibleForTesting
    static final String e = "com.android.launcher.action.INSTALL_SHORTCUT";
    @VisibleForTesting
    static final String f = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final int g = 0x60;
    private static final int h = 0x30;
    public static final String i = "android.intent.extra.shortcut.ID";
    private static volatile ShortcutInfoCompatSaver j = null;
    private static volatile List k = null;
    private static final String l = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final String m = "androidx.core.content.pm.shortcut_listener_impl";

    static {
    }

    @VisibleForTesting
    static void A(List list0) {
        ShortcutManagerCompat.k = list0;
    }

    @VisibleForTesting
    static void B(ShortcutInfoCompatSaver shortcutInfoCompatSaver0) {
        ShortcutManagerCompat.j = shortcutInfoCompatSaver0;
    }

    public static boolean C(Context context0, List list0) {
        List list1 = ShortcutManagerCompat.w(list0, 1);
        int v = Build.VERSION.SDK_INT;
        if(v <= 29) {
            ShortcutManagerCompat.c(context0, list1);
        }
        if(v >= 25) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list1) {
                arrayList0.add(((ShortcutInfoCompat)object0).H());
            }
            if(!a0.a(context0.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList0)) {
                return false;
            }
        }
        ShortcutManagerCompat.o(context0).a(list1);
        Iterator iterator1 = ShortcutManagerCompat.n(context0).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
        return true;
    }

    public static boolean a(Context context0, List list0) {
        List list1 = ShortcutManagerCompat.w(list0, 1);
        int v = Build.VERSION.SDK_INT;
        if(v <= 29) {
            ShortcutManagerCompat.c(context0, list1);
        }
        if(v >= 25) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list1) {
                arrayList0.add(((ShortcutInfoCompat)object0).H());
            }
            if(!a0.a(context0.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList0)) {
                return false;
            }
        }
        ShortcutManagerCompat.o(context0).a(list1);
        Iterator iterator1 = ShortcutManagerCompat.n(context0).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
        return true;
    }

    @VisibleForTesting
    static boolean b(Context context0, ShortcutInfoCompat shortcutInfoCompat0) {
        IconCompat iconCompat0 = shortcutInfoCompat0.i;
        if(iconCompat0 == null) {
            return false;
        }
        int v = iconCompat0.a;
        if(v != 4 && v != 6) {
            return true;
        }
        InputStream inputStream0 = iconCompat0.A(context0);
        if(inputStream0 == null) {
            return false;
        }
        Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream0);
        if(bitmap0 == null) {
            return false;
        }
        shortcutInfoCompat0.i = v == 6 ? IconCompat.k(bitmap0) : IconCompat.n(bitmap0);
        return true;
    }

    @VisibleForTesting
    static void c(Context context0, List list0) {
        for(Object object0: new ArrayList(list0)) {
            ShortcutInfoCompat shortcutInfoCompat0 = (ShortcutInfoCompat)object0;
            if(!ShortcutManagerCompat.b(context0, shortcutInfoCompat0)) {
                list0.remove(shortcutInfoCompat0);
            }
        }
    }

    public static Intent d(Context context0, ShortcutInfoCompat shortcutInfoCompat0) {
        Intent intent0 = Build.VERSION.SDK_INT < 26 ? null : a0.a(context0.getSystemService(ShortcutManager.class)).createShortcutResultIntent(shortcutInfoCompat0.H());
        if(intent0 == null) {
            intent0 = new Intent();
        }
        return shortcutInfoCompat0.a(intent0);
    }

    public static void e(Context context0, List list0, CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 25) {
            a0.a(context0.getSystemService(ShortcutManager.class)).disableShortcuts(list0, charSequence0);
        }
        ShortcutManagerCompat.o(context0).d(list0);
        Iterator iterator0 = ShortcutManagerCompat.n(context0).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    public static void f(Context context0, List list0) {
        List list1 = ShortcutManagerCompat.w(list0, 1);
        if(Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list1) {
                arrayList0.add(((ShortcutInfoCompat)object0).b);
            }
            a0.a(context0.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList0);
        }
        ShortcutManagerCompat.o(context0).a(list1);
        Iterator iterator1 = ShortcutManagerCompat.n(context0).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
    }

    public static List g(Context context0) {
        if(Build.VERSION.SDK_INT >= 25) {
            List list0 = a0.a(context0.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                list1.add(new Builder(context0, ((ShortcutInfo)object0)).c());
            }
            return list1;
        }
        try {
            return ShortcutManagerCompat.o(context0).b();
        }
        catch(Exception unused_ex) {
            return new ArrayList();
        }
    }

    private static int h(Context context0, boolean z) {
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        int v = Math.max(1, (activityManager0 == null || activityManager0.isLowRamDevice() ? 0x30 : 0x60));
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        return z ? ((int)(((float)v) * (displayMetrics0.xdpi / 160.0f))) : ((int)(((float)v) * (displayMetrics0.ydpi / 160.0f)));
    }

    public static int i(Context context0) {
        Preconditions.l(context0);
        return Build.VERSION.SDK_INT < 25 ? ShortcutManagerCompat.h(context0, false) : a0.a(context0.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    public static int j(Context context0) {
        Preconditions.l(context0);
        return Build.VERSION.SDK_INT < 25 ? ShortcutManagerCompat.h(context0, true) : a0.a(context0.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    public static int k(Context context0) {
        Preconditions.l(context0);
        return Build.VERSION.SDK_INT < 25 ? 5 : a0.a(context0.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    @VisibleForTesting
    static List l() {
        return ShortcutManagerCompat.k;
    }

    private static String m(List list0) {
        int v = -1;
        String s = null;
        for(Object object0: list0) {
            ShortcutInfoCompat shortcutInfoCompat0 = (ShortcutInfoCompat)object0;
            if(shortcutInfoCompat0.v() > v) {
                s = shortcutInfoCompat0.k();
                v = shortcutInfoCompat0.v();
            }
        }
        return s;
    }

    private static List n(Context context0) {
        if(ShortcutManagerCompat.k == null) {
            ArrayList arrayList0 = new ArrayList();
            PackageManager packageManager0 = context0.getPackageManager();
            Intent intent0 = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent0.setPackage("com.dcinside.app.android");
            for(Object object0: packageManager0.queryIntentActivities(intent0, 0x80)) {
                ActivityInfo activityInfo0 = ((ResolveInfo)object0).activityInfo;
                if(activityInfo0 != null) {
                    Bundle bundle0 = activityInfo0.metaData;
                    if(bundle0 != null) {
                        String s = bundle0.getString("androidx.core.content.pm.shortcut_listener_impl");
                        if(s != null) {
                            try {
                                arrayList0.add(((ShortcutInfoChangeListener)Class.forName(s, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context0)));
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                    }
                }
            }
            if(ShortcutManagerCompat.k == null) {
                ShortcutManagerCompat.k = arrayList0;
            }
        }
        return ShortcutManagerCompat.k;
    }

    private static ShortcutInfoCompatSaver o(Context context0) {
        if(ShortcutManagerCompat.j == null) {
            if(Build.VERSION.SDK_INT >= 23) {
                try {
                    ShortcutManagerCompat.j = (ShortcutInfoCompatSaver)Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context0);
                }
                catch(Exception unused_ex) {
                }
            }
            if(ShortcutManagerCompat.j == null) {
                ShortcutManagerCompat.j = new NoopImpl();
            }
        }
        return ShortcutManagerCompat.j;
    }

    public static List p(Context context0, int v) {
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 30) {
            return ShortcutInfoCompat.c(context0, a0.a(context0.getSystemService(ShortcutManager.class)).getShortcuts(v));
        }
        if(v1 >= 25) {
            ShortcutManager shortcutManager0 = a0.a(context0.getSystemService(ShortcutManager.class));
            ArrayList arrayList0 = new ArrayList();
            if((v & 1) != 0) {
                arrayList0.addAll(shortcutManager0.getManifestShortcuts());
            }
            if((v & 2) != 0) {
                arrayList0.addAll(shortcutManager0.getDynamicShortcuts());
            }
            if((v & 4) != 0) {
                arrayList0.addAll(shortcutManager0.getPinnedShortcuts());
            }
            return ShortcutInfoCompat.c(context0, arrayList0);
        }
        if((v & 2) != 0) {
            try {
                return ShortcutManagerCompat.o(context0).b();
            }
            catch(Exception unused_ex) {
            }
        }
        return Collections.emptyList();
    }

    public static boolean q(Context context0) {
        Preconditions.l(context0);
        return Build.VERSION.SDK_INT < 25 ? ShortcutManagerCompat.p(context0, 3).size() == ShortcutManagerCompat.k(context0) : a0.a(context0.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    public static boolean r(Context context0) {
        if(Build.VERSION.SDK_INT >= 26) {
            return a0.a(context0.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if(ContextCompat.checkSelfPermission(context0, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        for(Object object0: context0.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0)) {
            String s = ((ResolveInfo)object0).activityInfo.permission;
            if(TextUtils.isEmpty(s) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public static boolean s(Context context0, ShortcutInfoCompat shortcutInfoCompat0) {
        Preconditions.l(context0);
        Preconditions.l(shortcutInfoCompat0);
        int v = Build.VERSION.SDK_INT;
        if(v <= 0x20 && shortcutInfoCompat0.E(1)) {
            for(Object object0: ShortcutManagerCompat.n(context0)) {
                ((ShortcutInfoChangeListener)object0).b(Collections.singletonList(shortcutInfoCompat0));
            }
            return true;
        }
        int v1 = ShortcutManagerCompat.k(context0);
        if(v1 == 0) {
            return false;
        }
        if(v <= 29) {
            ShortcutManagerCompat.b(context0, shortcutInfoCompat0);
        }
        if(v >= 30) {
            a0.a(context0.getSystemService(ShortcutManager.class)).pushDynamicShortcut(shortcutInfoCompat0.H());
        }
        else if(v >= 25) {
            ShortcutManager shortcutManager0 = a0.a(context0.getSystemService(ShortcutManager.class));
            if(shortcutManager0.isRateLimitingActive()) {
                return false;
            }
            List list0 = shortcutManager0.getDynamicShortcuts();
            if(list0.size() >= v1) {
                shortcutManager0.removeDynamicShortcuts(Arrays.asList(new String[]{Api25Impl.a(list0)}));
            }
            shortcutManager0.addDynamicShortcuts(Arrays.asList(new ShortcutInfo[]{shortcutInfoCompat0.H()}));
        }
        ShortcutInfoCompatSaver shortcutInfoCompatSaver0 = ShortcutManagerCompat.o(context0);
        try {
            List list1 = shortcutInfoCompatSaver0.b();
            if(list1.size() >= v1) {
                shortcutInfoCompatSaver0.d(Arrays.asList(new String[]{ShortcutManagerCompat.m(list1)}));
            }
            shortcutInfoCompatSaver0.a(Arrays.asList(new ShortcutInfoCompat[]{shortcutInfoCompat0}));
            return true;
        }
        catch(Exception unused_ex) {
            for(Object object1: ShortcutManagerCompat.n(context0)) {
                ((ShortcutInfoChangeListener)object1).b(Collections.singletonList(shortcutInfoCompat0));
            }
            ShortcutManagerCompat.x(context0, shortcutInfoCompat0.k());
            return false;
        }
        finally {
            for(Object object2: ShortcutManagerCompat.n(context0)) {
                ((ShortcutInfoChangeListener)object2).b(Collections.singletonList(shortcutInfoCompat0));
            }
            ShortcutManagerCompat.x(context0, shortcutInfoCompat0.k());
        }
    }

    public static void t(Context context0) {
        if(Build.VERSION.SDK_INT >= 25) {
            a0.a(context0.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        ShortcutManagerCompat.o(context0).c();
        Iterator iterator0 = ShortcutManagerCompat.n(context0).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    public static void u(Context context0, List list0) {
        if(Build.VERSION.SDK_INT >= 25) {
            a0.a(context0.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list0);
        }
        ShortcutManagerCompat.o(context0).d(list0);
        Iterator iterator0 = ShortcutManagerCompat.n(context0).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    public static void v(Context context0, List list0) {
        if(Build.VERSION.SDK_INT < 30) {
            ShortcutManagerCompat.u(context0, list0);
            return;
        }
        a0.a(context0.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list0);
        ShortcutManagerCompat.o(context0).d(list0);
        Iterator iterator0 = ShortcutManagerCompat.n(context0).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
    }

    private static List w(List list0, int v) {
        Objects.requireNonNull(list0);
        if(Build.VERSION.SDK_INT > 0x20) {
            return list0;
        }
        List list1 = new ArrayList(list0);
        for(Object object0: list0) {
            ShortcutInfoCompat shortcutInfoCompat0 = (ShortcutInfoCompat)object0;
            if(shortcutInfoCompat0.E(v)) {
                list1.remove(shortcutInfoCompat0);
            }
        }
        return list1;
    }

    public static void x(Context context0, String s) {
        Preconditions.l(context0);
        Preconditions.l(s);
        if(Build.VERSION.SDK_INT >= 25) {
            a0.a(context0.getSystemService(ShortcutManager.class)).reportShortcutUsed(s);
        }
        for(Object object0: ShortcutManagerCompat.n(context0)) {
            ((ShortcutInfoChangeListener)object0).e(Collections.singletonList(s));
        }
    }

    public static boolean y(Context context0, ShortcutInfoCompat shortcutInfoCompat0, IntentSender intentSender0) {
        int v = Build.VERSION.SDK_INT;
        if(v <= 0x20 && shortcutInfoCompat0.E(1)) {
            return false;
        }
        if(v >= 26) {
            return a0.a(context0.getSystemService(ShortcutManager.class)).requestPinShortcut(shortcutInfoCompat0.H(), intentSender0);
        }
        if(!ShortcutManagerCompat.r(context0)) {
            return false;
        }
        Intent intent0 = shortcutInfoCompat0.a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
        if(intentSender0 == null) {
            context0.sendBroadcast(intent0);
            return true;
        }
        context0.sendOrderedBroadcast(intent0, null, new BroadcastReceiver() {
            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                try {
                    intentSender0.sendIntent(context0, 0, null, null, null);
                }
                catch(IntentSender.SendIntentException unused_ex) {
                }
            }
        }, null, -1, null, null);
        return true;
    }

    public static boolean z(Context context0, List list0) {
        Preconditions.l(context0);
        Preconditions.l(list0);
        List list1 = ShortcutManagerCompat.w(list0, 1);
        if(Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList0 = new ArrayList(list1.size());
            for(Object object0: list1) {
                arrayList0.add(((ShortcutInfoCompat)object0).H());
            }
            if(!a0.a(context0.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList0)) {
                return false;
            }
        }
        ShortcutManagerCompat.o(context0).c();
        ShortcutManagerCompat.o(context0).a(list1);
        Iterator iterator1 = ShortcutManagerCompat.n(context0).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
        return true;
    }
}

