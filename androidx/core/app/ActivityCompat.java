package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends ContextCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static void a(Activity activity0) {
            activity0.finishAfterTransition();
        }

        static void b(Activity activity0) {
            activity0.postponeEnterTransition();
        }

        static void c(Activity activity0, SharedElementCallback sharedElementCallback0) {
            activity0.setEnterSharedElementCallback(sharedElementCallback0);
        }

        static void d(Activity activity0, SharedElementCallback sharedElementCallback0) {
            activity0.setExitSharedElementCallback(sharedElementCallback0);
        }

        static void e(Activity activity0) {
            activity0.startPostponedEnterTransition();
        }
    }

    @RequiresApi(22)
    static class Api22Impl {
        static Uri a(Activity activity0) {
            return activity0.getReferrer();
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        static void a(Object object0) {
            ((SharedElementCallback.OnSharedElementsReadyListener)object0).onSharedElementsReady();
        }

        static void b(Activity activity0, String[] arr_s, int v) {
            activity0.requestPermissions(arr_s, v);
        }

        static boolean c(Activity activity0, String s) {
            return activity0.shouldShowRequestPermissionRationale(s);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static Object a(Activity activity0, int v) {
            return activity0.requireViewById(v);
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static Display a(ContextWrapper contextWrapper0) {
            return contextWrapper0.getDisplay();
        }

        static void b(Activity activity0, LocusIdCompat locusIdCompat0, Bundle bundle0) {
            activity0.setLocusContext((locusIdCompat0 == null ? null : locusIdCompat0.c()), bundle0);
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static boolean a(Activity activity0) {
            return activity0.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity0, String s) {
            try {
                PackageManager packageManager0 = activity0.getApplication().getPackageManager();
                return ((Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(packageManager0, s)).booleanValue();
            }
            catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException unused_ex) {
                return activity0.shouldShowRequestPermissionRationale(s);
            }
        }
    }

    @RequiresApi(0x20)
    static class Api32Impl {
        static boolean a(Activity activity0, String s) {
            return activity0.shouldShowRequestPermissionRationale(s);
        }
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int arg1, String[] arg2, int[] arg3);
    }

    public interface PermissionCompatDelegate {
        boolean a(Activity arg1, String[] arg2, @IntRange(from = 0L) int arg3);

        boolean b(Activity arg1, @IntRange(from = 0L) int arg2, int arg3, Intent arg4);
    }

    @RestrictTo({Scope.c})
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int arg1);
    }

    @RequiresApi(21)
    static class SharedElementCallback21Impl extends SharedElementCallback {
        private final androidx.core.app.SharedElementCallback a;

        SharedElementCallback21Impl(androidx.core.app.SharedElementCallback sharedElementCallback0) {
            this.a = sharedElementCallback0;
        }

        @Override  // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view0, Matrix matrix0, RectF rectF0) {
            return this.a.b(view0, matrix0, rectF0);
        }

        @Override  // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context0, Parcelable parcelable0) {
            return this.a.c(context0, parcelable0);
        }

        @Override  // android.app.SharedElementCallback
        public void onMapSharedElements(List list0, Map map0) {
        }

        @Override  // android.app.SharedElementCallback
        public void onRejectSharedElements(List list0) {
        }

        @Override  // android.app.SharedElementCallback
        public void onSharedElementEnd(List list0, List list1, List list2) {
        }

        @Override  // android.app.SharedElementCallback
        public void onSharedElementStart(List list0, List list1, List list2) {
        }

        @Override  // android.app.SharedElementCallback
        @RequiresApi(23)
        public void onSharedElementsArrived(List list0, List list1, SharedElementCallback.OnSharedElementsReadyListener sharedElementCallback$OnSharedElementsReadyListener0) {
            b b0 = new b(sharedElementCallback$OnSharedElementsReadyListener0);
            this.a.h(list0, list1, b0);
        }
    }

    private static PermissionCompatDelegate a;

    public static void c(Activity activity0) {
        activity0.finishAffinity();
    }

    public static void d(Activity activity0) {
        Api21Impl.a(activity0);
    }

    @RestrictTo({Scope.c})
    public static PermissionCompatDelegate e() {
        return ActivityCompat.a;
    }

    public static Uri f(Activity activity0) {
        if(Build.VERSION.SDK_INT >= 22) {
            return Api22Impl.a(activity0);
        }
        Intent intent0 = activity0.getIntent();
        Uri uri0 = (Uri)intent0.getParcelableExtra("android.intent.extra.REFERRER");
        if(uri0 != null) {
            return uri0;
        }
        String s = intent0.getStringExtra("android.intent.extra.REFERRER_NAME");
        return s == null ? null : Uri.parse(s);
    }

    @Deprecated
    public static boolean g(Activity activity0) {
        activity0.invalidateOptionsMenu();
        return true;
    }

    public static boolean h(Activity activity0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 0x1F) {
            return Api31Impl.a(activity0);
        }
        switch(v) {
            case 29: {
                return activity0.getWindowManager().getDefaultDisplay() != null && activity0.getWindowManager().getDefaultDisplay().getDisplayId() != 0;
            }
            case 30: {
                return Api30Impl.a(activity0) != null && Api30Impl.a(activity0).getDisplayId() != 0;
            }
            default: {
                return false;
            }
        }
    }

    // 检测为 Lambda 实现
    private static void i(Activity activity0) [...]

    public static void j(Activity activity0) {
        Api21Impl.b(activity0);
    }

    public static void k(Activity activity0) {
        if(Build.VERSION.SDK_INT >= 28) {
            activity0.recreate();
            return;
        }
        new Handler(activity0.getMainLooper()).post(() -> if(!activity0.isFinishing() && !ActivityRecreator.i(activity0)) {
            activity0.recreate();
        });
    }

    public static DragAndDropPermissionsCompat l(Activity activity0, DragEvent dragEvent0) {
        return DragAndDropPermissionsCompat.b(activity0, dragEvent0);
    }

    public static void m(Activity activity0, String[] arr_s, @IntRange(from = 0L) int v) {
        if(ActivityCompat.a != null && ActivityCompat.a.a(activity0, arr_s, v)) {
            return;
        }
        HashSet hashSet0 = new HashSet();
        for(int v2 = 0; v2 < arr_s.length; ++v2) {
            if(TextUtils.isEmpty(arr_s[v2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(arr_s) + " must not contain null or empty values");
            }
            if(Build.VERSION.SDK_INT < 33 && TextUtils.equals(arr_s[v2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet0.add(v2);
            }
        }
        int v3 = hashSet0.size();
        String[] arr_s1 = v3 <= 0 ? arr_s : new String[arr_s.length - v3];
        if(v3 > 0) {
            if(v3 == arr_s.length) {
                return;
            }
            int v4 = 0;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(!hashSet0.contains(v1)) {
                    arr_s1[v4] = arr_s[v1];
                    ++v4;
                }
            }
        }
        if(Build.VERSION.SDK_INT >= 23) {
            if(activity0 instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator)activity0).validateRequestPermissionsRequestCode(v);
            }
            Api23Impl.b(activity0, arr_s, v);
            return;
        }
        if(activity0 instanceof OnRequestPermissionsResultCallback) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    int[] arr_v = new int[arr_s1.length];
                    PackageManager packageManager0 = activity0.getPackageManager();
                    for(int v = 0; v < arr_s1.length; ++v) {
                        arr_v[v] = packageManager0.checkPermission(arr_s1[v], "com.dcinside.app.android");
                    }
                    ((OnRequestPermissionsResultCallback)activity0).onRequestPermissionsResult(v, arr_s1, arr_v);
                }
            });
        }
    }

    public static View n(Activity activity0, @IdRes int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return (View)Api28Impl.a(activity0, v);
        }
        View view0 = activity0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Activity");
        }
        return view0;
    }

    public static void o(Activity activity0, androidx.core.app.SharedElementCallback sharedElementCallback0) {
        Api21Impl.c(activity0, (sharedElementCallback0 == null ? null : new SharedElementCallback21Impl(sharedElementCallback0)));
    }

    public static void p(Activity activity0, androidx.core.app.SharedElementCallback sharedElementCallback0) {
        Api21Impl.d(activity0, (sharedElementCallback0 == null ? null : new SharedElementCallback21Impl(sharedElementCallback0)));
    }

    public static void q(Activity activity0, LocusIdCompat locusIdCompat0, Bundle bundle0) {
        if(Build.VERSION.SDK_INT >= 30) {
            Api30Impl.b(activity0, locusIdCompat0, bundle0);
        }
    }

    public static void r(PermissionCompatDelegate activityCompat$PermissionCompatDelegate0) {
        ActivityCompat.a = activityCompat$PermissionCompatDelegate0;
    }

    public static boolean s(Activity activity0, String s) {
        int v = Build.VERSION.SDK_INT;
        if(v < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", s)) {
            return false;
        }
        if(v >= 0x20) {
            return Api32Impl.a(activity0, s);
        }
        if(v == 0x1F) {
            return Api31Impl.b(activity0, s);
        }
        return v < 23 ? false : Api23Impl.c(activity0, s);
    }

    public static void t(Activity activity0, Intent intent0, int v, Bundle bundle0) {
        activity0.startActivityForResult(intent0, v, bundle0);
    }

    public static void u(Activity activity0, IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) throws IntentSender.SendIntentException {
        activity0.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    public static void v(Activity activity0) {
        Api21Impl.e(activity0);
    }
}

