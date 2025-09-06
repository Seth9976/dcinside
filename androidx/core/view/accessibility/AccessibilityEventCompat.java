package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AccessibilityEventCompat {
    @RequiresApi(34)
    static class Api34Impl {
        static boolean a(AccessibilityEvent accessibilityEvent0) {
            return accessibilityEvent0.isAccessibilityDataSensitive();
        }

        static void b(AccessibilityEvent accessibilityEvent0, boolean z) {
            accessibilityEvent0.setAccessibilityDataSensitive(z);
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentChangeType {
    }

    public static final int A = 0x40;
    public static final int B = 0x80;
    public static final int C = 0x100;
    public static final int D = 0x200;
    public static final int E = 0x400;
    public static final int F = 0x800;
    public static final int G = 0x1000;
    public static final int H = -1;
    @Deprecated
    public static final int a = 0x80;
    @Deprecated
    public static final int b = 0x100;
    @Deprecated
    public static final int c = 0x200;
    @Deprecated
    public static final int d = 0x400;
    @Deprecated
    public static final int e = 0x800;
    @Deprecated
    public static final int f = 0x1000;
    @Deprecated
    public static final int g = 0x2000;
    public static final int h = 0x4000;
    public static final int i = 0x8000;
    public static final int j = 0x10000;
    public static final int k = 0x20000;
    public static final int l = 0x40000;
    public static final int m = 0x80000;
    public static final int n = 0x100000;
    public static final int o = 0x200000;
    public static final int p = 0x400000;
    public static final int q = 0x800000;
    public static final int r = 0x1000000;
    public static final int s = 0x4000000;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 4;
    public static final int x = 8;
    public static final int y = 16;
    public static final int z = 0x20;

    @ReplaceWith(expression = "event.appendRecord(record)")
    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent0, AccessibilityRecordCompat accessibilityRecordCompat0) {
        accessibilityEvent0.appendRecord(((AccessibilityRecord)accessibilityRecordCompat0.g()));
    }

    @Deprecated
    public static AccessibilityRecordCompat b(AccessibilityEvent accessibilityEvent0) {
        return new AccessibilityRecordCompat(accessibilityEvent0);
    }

    @ReplaceWith(expression = "event.getAction()")
    @Deprecated
    public static int c(AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.getAction();
    }

    @SuppressLint({"WrongConstant"})
    @ReplaceWith(expression = "event.getContentChangeTypes()")
    @Deprecated
    public static int d(AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.getContentChangeTypes();
    }

    @ReplaceWith(expression = "event.getMovementGranularity()")
    @Deprecated
    public static int e(AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.getMovementGranularity();
    }

    @Deprecated
    public static AccessibilityRecordCompat f(AccessibilityEvent accessibilityEvent0, int v) {
        return new AccessibilityRecordCompat(accessibilityEvent0.getRecord(v));
    }

    @ReplaceWith(expression = "event.getRecordCount()")
    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.getRecordCount();
    }

    public static boolean h(AccessibilityEvent accessibilityEvent0) {
        return Build.VERSION.SDK_INT < 34 ? false : Api34Impl.a(accessibilityEvent0);
    }

    public static void i(AccessibilityEvent accessibilityEvent0, boolean z) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.b(accessibilityEvent0, z);
        }
    }

    @ReplaceWith(expression = "event.setAction(action)")
    @Deprecated
    public static void j(AccessibilityEvent accessibilityEvent0, int v) {
        accessibilityEvent0.setAction(v);
    }

    @ReplaceWith(expression = "event.setContentChangeTypes(changeTypes)")
    @Deprecated
    public static void k(AccessibilityEvent accessibilityEvent0, int v) {
        accessibilityEvent0.setContentChangeTypes(v);
    }

    @ReplaceWith(expression = "event.setMovementGranularity(granularity)")
    @Deprecated
    public static void l(AccessibilityEvent accessibilityEvent0, int v) {
        accessibilityEvent0.setMovementGranularity(v);
    }
}

