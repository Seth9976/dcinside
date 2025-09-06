package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.id;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import j..time.Duration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AccessibilityNodeInfoCompat {
    public static class AccessibilityActionCompat {
        public static final AccessibilityActionCompat A = null;
        public static final AccessibilityActionCompat B = null;
        public static final AccessibilityActionCompat C = null;
        public static final AccessibilityActionCompat D = null;
        public static final AccessibilityActionCompat E = null;
        public static final AccessibilityActionCompat F = null;
        public static final AccessibilityActionCompat G = null;
        public static final AccessibilityActionCompat H = null;
        public static final AccessibilityActionCompat I = null;
        public static final AccessibilityActionCompat J = null;
        public static final AccessibilityActionCompat K = null;
        public static final AccessibilityActionCompat L = null;
        public static final AccessibilityActionCompat M = null;
        public static final AccessibilityActionCompat N = null;
        public static final AccessibilityActionCompat O = null;
        public static final AccessibilityActionCompat P = null;
        public static final AccessibilityActionCompat Q = null;
        public static final AccessibilityActionCompat R = null;
        public static final AccessibilityActionCompat S = null;
        public static final AccessibilityActionCompat T = null;
        public static final AccessibilityActionCompat U = null;
        public static final AccessibilityActionCompat V = null;
        @OptIn(markerClass = {PrereleaseSdkCheck.class})
        public static final AccessibilityActionCompat W = null;
        final Object a;
        private final int b;
        private final Class c;
        @RestrictTo({Scope.c})
        protected final AccessibilityViewCommand d;
        private static final String e = "A11yActionCompat";
        public static final AccessibilityActionCompat f;
        public static final AccessibilityActionCompat g;
        public static final AccessibilityActionCompat h;
        public static final AccessibilityActionCompat i;
        public static final AccessibilityActionCompat j;
        public static final AccessibilityActionCompat k;
        public static final AccessibilityActionCompat l;
        public static final AccessibilityActionCompat m;
        public static final AccessibilityActionCompat n;
        public static final AccessibilityActionCompat o;
        public static final AccessibilityActionCompat p;
        public static final AccessibilityActionCompat q;
        public static final AccessibilityActionCompat r;
        public static final AccessibilityActionCompat s;
        public static final AccessibilityActionCompat t;
        public static final AccessibilityActionCompat u;
        public static final AccessibilityActionCompat v;
        public static final AccessibilityActionCompat w;
        public static final AccessibilityActionCompat x;
        public static final AccessibilityActionCompat y;
        public static final AccessibilityActionCompat z;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityNodeInfo$AccessibilityAction0 = null;
            AccessibilityActionCompat.f = new AccessibilityActionCompat(1, null);
            AccessibilityActionCompat.g = new AccessibilityActionCompat(2, null);
            AccessibilityActionCompat.h = new AccessibilityActionCompat(4, null);
            AccessibilityActionCompat.i = new AccessibilityActionCompat(8, null);
            AccessibilityActionCompat.j = new AccessibilityActionCompat(16, null);
            AccessibilityActionCompat.k = new AccessibilityActionCompat(0x20, null);
            AccessibilityActionCompat.l = new AccessibilityActionCompat(0x40, null);
            AccessibilityActionCompat.m = new AccessibilityActionCompat(0x80, null);
            AccessibilityActionCompat.n = new AccessibilityActionCompat(0x100, null, MoveAtGranularityArguments.class);
            AccessibilityActionCompat.o = new AccessibilityActionCompat(0x200, null, MoveAtGranularityArguments.class);
            AccessibilityActionCompat.p = new AccessibilityActionCompat(0x400, null, MoveHtmlArguments.class);
            AccessibilityActionCompat.q = new AccessibilityActionCompat(0x800, null, MoveHtmlArguments.class);
            AccessibilityActionCompat.r = new AccessibilityActionCompat(0x1000, null);
            AccessibilityActionCompat.s = new AccessibilityActionCompat(0x2000, null);
            AccessibilityActionCompat.t = new AccessibilityActionCompat(0x4000, null);
            AccessibilityActionCompat.u = new AccessibilityActionCompat(0x8000, null);
            AccessibilityActionCompat.v = new AccessibilityActionCompat(0x10000, null);
            AccessibilityActionCompat.w = new AccessibilityActionCompat(0x20000, null, SetSelectionArguments.class);
            AccessibilityActionCompat.x = new AccessibilityActionCompat(0x40000, null);
            AccessibilityActionCompat.y = new AccessibilityActionCompat(0x80000, null);
            AccessibilityActionCompat.z = new AccessibilityActionCompat(0x100000, null);
            AccessibilityActionCompat.A = new AccessibilityActionCompat(0x200000, null, SetTextArguments.class);
            int v = Build.VERSION.SDK_INT;
            AccessibilityActionCompat.B = new AccessibilityActionCompat((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN), 0x1020036, null, null, null);
            AccessibilityActionCompat.C = new AccessibilityActionCompat((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION), 0x1020037, null, null, ScrollToPositionArguments.class);
            AccessibilityActionCompat.D = new AccessibilityActionCompat((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP), 0x1020038, null, null, null);
            AccessibilityActionCompat.E = new AccessibilityActionCompat((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT), 0x1020039, null, null, null);
            AccessibilityActionCompat.F = new AccessibilityActionCompat((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN), 0x102003A, null, null, null);
            AccessibilityActionCompat.G = new AccessibilityActionCompat((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT), 0x102003B, null, null, null);
            AccessibilityActionCompat.H = new AccessibilityActionCompat((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP), 0x1020046, null, null, null);
            AccessibilityActionCompat.I = new AccessibilityActionCompat((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN), 0x1020047, null, null, null);
            AccessibilityActionCompat.J = new AccessibilityActionCompat((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT), 0x1020048, null, null, null);
            AccessibilityActionCompat.K = new AccessibilityActionCompat((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT), 0x1020049, null, null, null);
            AccessibilityActionCompat.L = new AccessibilityActionCompat((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK), 0x102003C, null, null, null);
            AccessibilityActionCompat.M = new AccessibilityActionCompat((v < 24 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS), 0x102003D, null, null, SetProgressArguments.class);
            AccessibilityActionCompat.N = new AccessibilityActionCompat((v < 26 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW), 0x1020042, null, null, MoveWindowArguments.class);
            AccessibilityActionCompat.O = new AccessibilityActionCompat((v < 28 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP), 0x1020044, null, null, null);
            AccessibilityActionCompat.P = new AccessibilityActionCompat((v < 28 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP), 0x1020045, null, null, null);
            AccessibilityActionCompat.Q = new AccessibilityActionCompat((v < 30 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD), 0x102004A, null, null, null);
            AccessibilityActionCompat.R = new AccessibilityActionCompat((v < 30 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER), 0x1020054, null, null, null);
            AccessibilityActionCompat.S = new AccessibilityActionCompat((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START), 0x1020055, null, null, null);
            AccessibilityActionCompat.T = new AccessibilityActionCompat((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP), 0x1020056, null, null, null);
            AccessibilityActionCompat.U = new AccessibilityActionCompat((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL), 0x1020057, null, null, null);
            AccessibilityActionCompat.V = new AccessibilityActionCompat((v < 33 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS), 0x1020058, null, null, null);
            if(v >= 34) {
                accessibilityNodeInfo$AccessibilityAction0 = Api34Impl.a();
            }
            AccessibilityActionCompat.W = new AccessibilityActionCompat(accessibilityNodeInfo$AccessibilityAction0, 0x102005E, null, null, null);
        }

        public AccessibilityActionCompat(int v, CharSequence charSequence0) {
            this(null, v, charSequence0, null, null);
        }

        @RestrictTo({Scope.c})
        public AccessibilityActionCompat(int v, CharSequence charSequence0, AccessibilityViewCommand accessibilityViewCommand0) {
            this(null, v, charSequence0, accessibilityViewCommand0, null);
        }

        private AccessibilityActionCompat(int v, CharSequence charSequence0, Class class0) {
            this(null, v, charSequence0, null, class0);
        }

        AccessibilityActionCompat(Object object0) {
            this(object0, 0, null, null, null);
        }

        AccessibilityActionCompat(Object object0, int v, CharSequence charSequence0, AccessibilityViewCommand accessibilityViewCommand0, Class class0) {
            this.b = v;
            this.d = accessibilityViewCommand0;
            this.a = object0 == null ? new AccessibilityNodeInfo.AccessibilityAction(v, charSequence0) : object0;
            this.c = class0;
        }

        @RestrictTo({Scope.c})
        public AccessibilityActionCompat a(CharSequence charSequence0, AccessibilityViewCommand accessibilityViewCommand0) {
            return new AccessibilityActionCompat(null, this.b, charSequence0, accessibilityViewCommand0, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getLabel();
        }

        @RestrictTo({Scope.c})
        public boolean d(View view0, Bundle bundle0) {
            CommandArguments accessibilityViewCommand$CommandArguments1;
            if(this.d != null) {
                Class class0 = this.c;
                CommandArguments accessibilityViewCommand$CommandArguments0 = null;
                if(class0 != null) {
                    try {
                        accessibilityViewCommand$CommandArguments1 = (CommandArguments)class0.getDeclaredConstructor(null).newInstance(null);
                    }
                    catch(Exception exception0) {
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (this.c == null ? "null" : this.c.getName()), exception0);
                        return this.d.a(view0, accessibilityViewCommand$CommandArguments0);
                    }
                    try {
                        accessibilityViewCommand$CommandArguments1.a(bundle0);
                        return this.d.a(view0, accessibilityViewCommand$CommandArguments1);
                    }
                    catch(Exception exception0) {
                        accessibilityViewCommand$CommandArguments0 = accessibilityViewCommand$CommandArguments1;
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (this.c == null ? "null" : this.c.getName()), exception0);
                    return this.d.a(view0, accessibilityViewCommand$CommandArguments0);
                }
                return this.d.a(view0, null);
            }
            return false;
        }

        @Override
        public boolean equals(Object object0) {
            if(!(object0 instanceof AccessibilityActionCompat)) {
                return false;
            }
            return this.a == null ? ((AccessibilityActionCompat)object0).a == null : this.a.equals(((AccessibilityActionCompat)object0).a);
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("AccessibilityActionCompat: ");
            String s = AccessibilityNodeInfoCompat.o(this.b);
            if(s.equals("ACTION_UNKNOWN") && this.c() != null) {
                s = this.c().toString();
            }
            stringBuilder0.append(s);
            return stringBuilder0.toString();
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        public static Object a(int v, float f, float f1, float f2) {
            return new AccessibilityNodeInfo.RangeInfo(v, f, f1, f2);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo0, CharSequence charSequence0) {
            accessibilityNodeInfo0.setStateDescription(charSequence0);
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        public static CollectionItemInfoCompat a(boolean z, int v, int v1, int v2, int v3, boolean z1, String s, String s1) {
            return new CollectionItemInfoCompat(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(v).setRowIndex(v1).setColumnSpan(v2).setRowSpan(v3).setSelected(z1).setRowTitle(s).setColumnTitle(s1).build());
        }

        public static AccessibilityNodeInfoCompat b(AccessibilityNodeInfo accessibilityNodeInfo0, int v, int v1) {
            return AccessibilityNodeInfoCompat.u2(accessibilityNodeInfo0.getChild(v, v1));
        }

        public static String c(Object object0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo)object0).getColumnTitle();
        }

        public static String d(Object object0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo)object0).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getExtraRenderingInfo();
        }

        public static AccessibilityNodeInfoCompat f(AccessibilityNodeInfo accessibilityNodeInfo0, int v) {
            return AccessibilityNodeInfoCompat.u2(accessibilityNodeInfo0.getParent(v));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
            accessibilityNodeInfo0.setTextSelectable(z);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo0, String s) {
            accessibilityNodeInfo0.setUniqueId(s);
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo0, Rect rect0) {
            accessibilityNodeInfo0.getBoundsInWindow(rect0);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return a0.a(accessibilityNodeInfo0).toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
            accessibilityNodeInfo0.setAccessibilityDataSensitive(z);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo0, Rect rect0) {
            accessibilityNodeInfo0.setBoundsInWindow(rect0);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo0, CharSequence charSequence0) {
            accessibilityNodeInfo0.setContainerTitle(charSequence0);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo0, long v) {
            Z.a(accessibilityNodeInfo0, Duration.ofMillis(v));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo0, View view0, boolean z) {
            accessibilityNodeInfo0.setQueryFromAppProcessEnabled(view0, z);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
            accessibilityNodeInfo0.setRequestInitialAccessibilityFocus(z);
        }
    }

    @RequiresApi(35)
    static class Api35Impl {
        public static CollectionInfoCompat a(int v, int v1, boolean z, int v2, int v3, int v4) {
            return new CollectionInfoCompat(new AccessibilityNodeInfo.CollectionInfo.Builder().setRowCount(v).setColumnCount(v1).setHierarchical(z).setSelectionMode(v2).setItemCount(v3).setImportantForAccessibilityItemCount(v4).build());
        }

        public static int b(Object object0) {
            return ((AccessibilityNodeInfo.CollectionInfo)object0).getImportantForAccessibilityItemCount();
        }

        public static int c(Object object0) {
            return ((AccessibilityNodeInfo.CollectionInfo)object0).getItemCount();
        }
    }

    public static class CollectionInfoCompat {
        public static final class Builder {
            private int a;
            private int b;
            private boolean c;
            private int d;
            private int e;
            private int f;

            public Builder() {
                this.a = 0;
                this.b = 0;
                this.c = false;
                this.e = -1;
                this.f = -1;
            }

            public CollectionInfoCompat a() {
                return Build.VERSION.SDK_INT < 35 ? CollectionInfoCompat.h(this.a, this.b, this.c, this.d) : Api35Impl.a(this.a, this.b, this.c, this.d, this.e, this.f);
            }

            public Builder b(int v) {
                this.b = v;
                return this;
            }

            public Builder c(boolean z) {
                this.c = z;
                return this;
            }

            public Builder d(int v) {
                this.f = v;
                return this;
            }

            public Builder e(int v) {
                this.e = v;
                return this;
            }

            public Builder f(int v) {
                this.a = v;
                return this;
            }

            public Builder g(int v) {
                this.d = v;
                return this;
            }
        }

        final Object a;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = -1;

        CollectionInfoCompat(Object object0) {
            this.a = object0;
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo)this.a).getColumnCount();
        }

        public int b() {
            return Build.VERSION.SDK_INT < 35 ? -1 : Api35Impl.b(this.a);
        }

        public int c() {
            return Build.VERSION.SDK_INT < 35 ? -1 : Api35Impl.c(this.a);
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionInfo)this.a).getRowCount();
        }

        public int e() {
            return ((AccessibilityNodeInfo.CollectionInfo)this.a).getSelectionMode();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionInfo)this.a).isHierarchical();
        }

        public static CollectionInfoCompat g(int v, int v1, boolean z) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(v, v1, z));
        }

        public static CollectionInfoCompat h(int v, int v1, boolean z, int v2) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(v, v1, z, v2));
        }
    }

    public static class CollectionItemInfoCompat {
        public static final class androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder {
            private boolean a;
            private int b;
            private int c;
            private int d;
            private int e;
            private boolean f;
            private String g;
            private String h;

            public CollectionItemInfoCompat a() {
                return Build.VERSION.SDK_INT < 33 ? new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(this.c, this.e, this.b, this.d, this.a, this.f)) : Api33Impl.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder b(int v) {
                this.b = v;
                return this;
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder c(int v) {
                this.d = v;
                return this;
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder d(String s) {
                this.h = s;
                return this;
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder e(boolean z) {
                this.a = z;
                return this;
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder f(int v) {
                this.c = v;
                return this;
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder g(int v) {
                this.e = v;
                return this;
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder h(String s) {
                this.g = s;
                return this;
            }

            public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder i(boolean z) {
                this.f = z;
                return this;
            }
        }

        final Object a;

        CollectionItemInfoCompat(Object object0) {
            this.a = object0;
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo)this.a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo)this.a).getColumnSpan();
        }

        public String c() {
            return Build.VERSION.SDK_INT < 33 ? null : Api33Impl.c(this.a);
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo)this.a).getRowIndex();
        }

        public int e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo)this.a).getRowSpan();
        }

        public String f() {
            return Build.VERSION.SDK_INT < 33 ? null : Api33Impl.d(this.a);
        }

        @Deprecated
        public boolean g() {
            return ((AccessibilityNodeInfo.CollectionItemInfo)this.a).isHeading();
        }

        public boolean h() {
            return ((AccessibilityNodeInfo.CollectionItemInfo)this.a).isSelected();
        }

        public static CollectionItemInfoCompat i(int v, int v1, int v2, int v3, boolean z) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(v, v1, v2, v3, z));
        }

        public static CollectionItemInfoCompat j(int v, int v1, int v2, int v3, boolean z, boolean z1) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(v, v1, v2, v3, z, z1));
        }
    }

    public static class RangeInfoCompat {
        final Object a;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;

        public RangeInfoCompat(int v, float f, float f1, float f2) {
            if(Build.VERSION.SDK_INT >= 30) {
                this.a = Api30Impl.a(v, f, f1, f2);
                return;
            }
            this.a = AccessibilityNodeInfo.RangeInfo.obtain(v, f, f1, f2);
        }

        RangeInfoCompat(Object object0) {
            this.a = object0;
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo)this.a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo)this.a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo)this.a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo)this.a).getType();
        }

        public static RangeInfoCompat e(int v, float f, float f1, float f2) {
            return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(v, f, f1, f2));
        }
    }

    public static final class TouchDelegateInfoCompat {
        final AccessibilityNodeInfo.TouchDelegateInfo a;

        TouchDelegateInfoCompat(AccessibilityNodeInfo.TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo0) {
            this.a = accessibilityNodeInfo$TouchDelegateInfo0;
        }

        public TouchDelegateInfoCompat(Map map0) {
            if(Build.VERSION.SDK_INT >= 29) {
                this.a = e0.a(map0);
                return;
            }
            this.a = null;
        }

        public Region a(@IntRange(from = 0L) int v) {
            return Build.VERSION.SDK_INT < 29 ? null : this.a.getRegionAt(v);
        }

        @IntRange(from = 0L)
        public int b() {
            return Build.VERSION.SDK_INT < 29 ? 0 : this.a.getRegionCount();
        }

        public AccessibilityNodeInfoCompat c(Region region0) {
            if(Build.VERSION.SDK_INT >= 29) {
                AccessibilityNodeInfo accessibilityNodeInfo0 = this.a.getTargetForRegion(region0);
                return accessibilityNodeInfo0 == null ? null : AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0);
            }
            return null;
        }
    }

    private static final int A = 0x4000000;
    public static final int A0 = 8;
    public static final int B = 1;
    public static final int B0 = 16;
    public static final int C = 2;
    public static final int C0 = 0x20;
    public static final int D = 4;
    @SuppressLint({"MinMaxConstant"})
    public static final int D0 = 50;
    public static final int E = 8;
    private static int E0 = 0;
    public static final int F = 16;
    public static final int G = 0x20;
    public static final int H = 0x40;
    public static final int I = 0x80;
    public static final int J = 0x100;
    public static final int K = 0x200;
    public static final int L = 0x400;
    public static final int M = 0x800;
    public static final int N = 0x1000;
    public static final int O = 0x2000;
    public static final int P = 0x4000;
    public static final int Q = 0x8000;
    public static final int R = 0x10000;
    public static final int S = 0x20000;
    public static final int T = 0x40000;
    public static final int U = 0x80000;
    public static final int V = 0x100000;
    public static final int W = 0x200000;
    public static final String X = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String Y = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String Z = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    private final AccessibilityNodeInfo a;
    public static final String a0 = "ACTION_ARGUMENT_SELECTION_START_INT";
    @RestrictTo({Scope.c})
    public int b;
    public static final String b0 = "ACTION_ARGUMENT_SELECTION_END_INT";
    private int c;
    public static final String c0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    private static final String d = "AccessibilityNodeInfo.roleDescription";
    public static final String d0 = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    private static final String e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    public static final String e0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    private static final String f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    public static final String f0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    private static final String g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    public static final String g0 = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    private static final String h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    public static final String h0 = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    private static final String i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    @SuppressLint({"ActionValue"})
    public static final String i0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    private static final String j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    public static final String j0 = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    private static final String k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    public static final String k0 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    private static final String l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    public static final int l0 = 1;
    private static final String m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    public static final int m0 = 2;
    private static final String n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    public static final int n0 = 1;
    private static final String o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
    public static final int o0 = 2;
    private static final String p = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";
    public static final int p0 = 4;
    private static final String q = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";
    public static final int q0 = 8;
    private static final String r = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";
    public static final int r0 = 16;
    private static final String s = "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY";
    public static final String s0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    private static final int t = 1;
    public static final String t0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY";
    private static final int u = 2;
    public static final String u0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    private static final int v = 4;
    public static final String v0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    private static final int w = 8;
    public static final int w0 = 20000;
    private static final int x = 0x20;
    public static final int x0 = 1;
    private static final int y = 0x40;
    public static final int y0 = 2;
    private static final int z = 0x800000;
    public static final int z0 = 4;

    static {
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo0) {
        this.b = -1;
        this.c = -1;
        this.a = accessibilityNodeInfo0;
    }

    @Deprecated
    public AccessibilityNodeInfoCompat(Object object0) {
        this.b = -1;
        this.c = -1;
        this.a = (AccessibilityNodeInfo)object0;
    }

    public CollectionInfoCompat A() {
        AccessibilityNodeInfo.CollectionInfo accessibilityNodeInfo$CollectionInfo0 = this.a.getCollectionInfo();
        return accessibilityNodeInfo$CollectionInfo0 == null ? null : new CollectionInfoCompat(accessibilityNodeInfo$CollectionInfo0);
    }

    public boolean A0() {
        return this.a.isFocused();
    }

    public void A1(boolean z) {
        this.d1(0x4000000, z);
    }

    public CollectionItemInfoCompat B() {
        AccessibilityNodeInfo.CollectionItemInfo accessibilityNodeInfo$CollectionItemInfo0 = this.a.getCollectionItemInfo();
        return accessibilityNodeInfo$CollectionItemInfo0 == null ? null : new CollectionItemInfoCompat(accessibilityNodeInfo$CollectionItemInfo0);
    }

    public boolean B0() {
        return this.r(0x4000000);
    }

    public void B1(boolean z) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
            return;
        }
        this.d1(2, z);
    }

    public CharSequence C() {
        return Build.VERSION.SDK_INT < 34 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY") : Api34Impl.c(this.a);
    }

    public boolean C0() {
        if(Build.VERSION.SDK_INT >= 28) {
            return this.a.isHeading();
        }
        if(this.r(2)) {
            return true;
        }
        CollectionItemInfoCompat accessibilityNodeInfoCompat$CollectionItemInfoCompat0 = this.B();
        return accessibilityNodeInfoCompat$CollectionItemInfoCompat0 != null && accessibilityNodeInfoCompat$CollectionItemInfoCompat0.g();
    }

    public void C1(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 26) {
            this.a.setHintText(charSequence0);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence0);
    }

    public CharSequence D() {
        return this.a.getContentDescription();
    }

    public boolean D0() {
        return Build.VERSION.SDK_INT < 24 ? true : this.a.isImportantForAccessibility();
    }

    public void D1(boolean z) {
        if(Build.VERSION.SDK_INT >= 24) {
            this.a.setImportantForAccessibility(z);
        }
    }

    public int E() {
        return Build.VERSION.SDK_INT < 24 ? 0 : this.a.getDrawingOrder();
    }

    public boolean E0() {
        return this.a.isLongClickable();
    }

    public void E1(int v) {
        this.a.setInputType(v);
    }

    public CharSequence F() {
        return this.a.getError();
    }

    public boolean F0() {
        return this.a.isMultiLine();
    }

    public void F1(View view0) {
        this.a.setLabelFor(view0);
    }

    public AccessibilityNodeInfo.ExtraRenderingInfo G() {
        return Build.VERSION.SDK_INT < 33 ? null : Api33Impl.e(this.a);
    }

    public boolean G0() {
        return this.a.isPassword();
    }

    public void G1(View view0, int v) {
        this.a.setLabelFor(view0, v);
    }

    public Bundle H() {
        return this.a.getExtras();
    }

    public boolean H0() {
        return Build.VERSION.SDK_INT < 28 ? this.r(1) : this.a.isScreenReaderFocusable();
    }

    public void H1(View view0) {
        this.a.setLabeledBy(view0);
    }

    public CharSequence I() {
        return Build.VERSION.SDK_INT < 26 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY") : this.a.getHintText();
    }

    public boolean I0() {
        return this.a.isScrollable();
    }

    public void I1(View view0, int v) {
        this.a.setLabeledBy(view0, v);
    }

    @Deprecated
    public Object J() {
        return this.a;
    }

    public boolean J0() {
        return this.a.isSelected();
    }

    public void J1(int v) {
        this.a.setLiveRegion(v);
    }

    public int K() {
        return this.a.getInputType();
    }

    public boolean K0() {
        return Build.VERSION.SDK_INT < 26 ? this.r(4) : this.a.isShowingHintText();
    }

    public void K1(boolean z) {
        this.a.setLongClickable(z);
    }

    public AccessibilityNodeInfoCompat L() {
        return AccessibilityNodeInfoCompat.u2(this.a.getLabelFor());
    }

    public boolean L0() {
        return Build.VERSION.SDK_INT < 29 ? this.r(8) : this.a.isTextEntryKey();
    }

    public void L1(int v) {
        this.a.setMaxTextLength(v);
    }

    public AccessibilityNodeInfoCompat M() {
        return AccessibilityNodeInfoCompat.u2(this.a.getLabeledBy());
    }

    public boolean M0() {
        return Build.VERSION.SDK_INT < 33 ? this.r(0x800000) : Api33Impl.h(this.a);
    }

    public void M1(long v) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.j(this.a, v);
            return;
        }
        this.a.getExtras().putLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY", v);
    }

    public int N() {
        return this.a.getLiveRegion();
    }

    public boolean N0() {
        return this.a.isVisibleToUser();
    }

    public void N1(int v) {
        this.a.setMovementGranularities(v);
    }

    public int O() {
        return this.a.getMaxTextLength();
    }

    public static AccessibilityNodeInfoCompat O0() {
        return AccessibilityNodeInfoCompat.t2(AccessibilityNodeInfo.obtain());
    }

    public void O1(boolean z) {
        this.a.setMultiLine(z);
    }

    public long P() {
        return Build.VERSION.SDK_INT < 34 ? this.a.getExtras().getLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY") : Api34Impl.d(this.a);
    }

    public static AccessibilityNodeInfoCompat P0(View view0) {
        return AccessibilityNodeInfoCompat.t2(AccessibilityNodeInfo.obtain(view0));
    }

    public void P1(CharSequence charSequence0) {
        this.a.setPackageName(charSequence0);
    }

    public int Q() {
        return this.a.getMovementGranularities();
    }

    public static AccessibilityNodeInfoCompat Q0(View view0, int v) {
        return AccessibilityNodeInfoCompat.u2(AccessibilityNodeInfo.obtain(view0, v));
    }

    public void Q1(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setPaneTitle(charSequence0);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence0);
    }

    private SparseArray R(View view0) {
        SparseArray sparseArray0 = this.Y(view0);
        if(sparseArray0 == null) {
            sparseArray0 = new SparseArray();
            view0.setTag(id.tag_accessibility_clickable_spans, sparseArray0);
        }
        return sparseArray0;
    }

    public static AccessibilityNodeInfoCompat R0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        return AccessibilityNodeInfoCompat.t2(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat0.a));
    }

    public void R1(View view0) {
        this.b = -1;
        this.a.setParent(view0);
    }

    public CharSequence S() {
        return this.a.getPackageName();
    }

    public boolean S0(int v) {
        return this.a.performAction(v);
    }

    public void S1(View view0, int v) {
        this.b = v;
        this.a.setParent(view0, v);
    }

    public CharSequence T() {
        return Build.VERSION.SDK_INT < 28 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY") : this.a.getPaneTitle();
    }

    public boolean T0(int v, Bundle bundle0) {
        return this.a.performAction(v, bundle0);
    }

    public void T1(boolean z) {
        this.a.setPassword(z);
    }

    public AccessibilityNodeInfoCompat U() {
        return AccessibilityNodeInfoCompat.u2(this.a.getParent());
    }

    @Deprecated
    public void U0() {
    }

    public void U1(View view0, boolean z) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.k(this.a, view0, z);
        }
    }

    public AccessibilityNodeInfoCompat V(int v) {
        return Build.VERSION.SDK_INT < 33 ? this.U() : Api33Impl.f(this.a, v);
    }

    public boolean V0() {
        return this.a.refresh();
    }

    public void V1(RangeInfoCompat accessibilityNodeInfoCompat$RangeInfoCompat0) {
        this.a.setRangeInfo(((AccessibilityNodeInfo.RangeInfo)accessibilityNodeInfoCompat$RangeInfoCompat0.a));
    }

    public RangeInfoCompat W() {
        AccessibilityNodeInfo.RangeInfo accessibilityNodeInfo$RangeInfo0 = this.a.getRangeInfo();
        return accessibilityNodeInfo$RangeInfo0 == null ? null : new RangeInfoCompat(accessibilityNodeInfo$RangeInfo0);
    }

    public boolean W0(AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0) {
        return this.a.removeAction(((AccessibilityNodeInfo.AccessibilityAction)accessibilityNodeInfoCompat$AccessibilityActionCompat0.a));
    }

    @SuppressLint({"GetterSetterNames"})
    public void W1(boolean z) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.l(this.a, z);
            return;
        }
        this.d1(0x20, z);
    }

    public CharSequence X() {
        return this.a.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    public boolean X0(View view0) {
        return this.a.removeChild(view0);
    }

    public void X1(CharSequence charSequence0) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence0);
    }

    private SparseArray Y(View view0) {
        return (SparseArray)view0.getTag(id.tag_accessibility_clickable_spans);
    }

    public boolean Y0(View view0, int v) {
        return this.a.removeChild(view0, v);
    }

    public void Y1(boolean z) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
            return;
        }
        this.d1(1, z);
    }

    public CharSequence Z() {
        return Build.VERSION.SDK_INT < 30 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY") : Api30Impl.b(this.a);
    }

    private void Z0(View view0) {
        SparseArray sparseArray0 = this.Y(view0);
        if(sparseArray0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                if(((WeakReference)sparseArray0.valueAt(v1)).get() == null) {
                    arrayList0.add(v1);
                }
            }
            for(int v = 0; v < arrayList0.size(); ++v) {
                sparseArray0.remove(((int)(((Integer)arrayList0.get(v)))));
            }
        }
    }

    public void Z1(boolean z) {
        this.a.setScrollable(z);
    }

    public void a(int v) {
        this.a.addAction(v);
    }

    public CharSequence a0() {
        if(this.m0()) {
            List list0 = this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List list1 = this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List list2 = this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List list3 = this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            CharSequence charSequence0 = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for(int v = 0; v < list0.size(); ++v) {
                ((Spannable)charSequence0).setSpan(new AccessibilityClickableSpanCompat(((int)(((Integer)list3.get(v)))), this, this.H().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((int)(((Integer)list0.get(v)))), ((int)(((Integer)list1.get(v)))), ((int)(((Integer)list2.get(v)))));
            }
            return charSequence0;
        }
        return this.a.getText();
    }

    public void a1(boolean z) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.g(this.a, z);
            return;
        }
        this.d1(0x40, z);
    }

    public void a2(boolean z) {
        this.a.setSelected(z);
    }

    public void b(AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0) {
        this.a.addAction(((AccessibilityNodeInfo.AccessibilityAction)accessibilityNodeInfoCompat$AccessibilityActionCompat0.a));
    }

    public int b0() {
        return this.a.getTextSelectionEnd();
    }

    public void b1(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public void b2(boolean z) {
        if(Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
            return;
        }
        this.d1(4, z);
    }

    public void c(View view0) {
        this.a.addChild(view0);
    }

    public int c0() {
        return this.a.getTextSelectionStart();
    }

    public void c1(List list0) {
        if(Build.VERSION.SDK_INT >= 26) {
            this.a.setAvailableExtraData(list0);
        }
    }

    public void c2(View view0) {
        this.c = -1;
        this.a.setSource(view0);
    }

    public void d(View view0, int v) {
        this.a.addChild(view0, v);
    }

    public CharSequence d0() {
        return Build.VERSION.SDK_INT < 28 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY") : this.a.getTooltipText();
    }

    private void d1(int v, boolean z) {
        Bundle bundle0 = this.H();
        if(bundle0 != null) {
            int v1 = bundle0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & ~v;
            if(!z) {
                v = 0;
            }
            bundle0.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", v | v1);
        }
    }

    public void d2(View view0, int v) {
        this.c = v;
        this.a.setSource(view0, v);
    }

    private void e(ClickableSpan clickableSpan0, Spanned spanned0, int v) {
        this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(spanned0.getSpanStart(clickableSpan0));
        this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(spanned0.getSpanEnd(clickableSpan0));
        this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(spanned0.getSpanFlags(clickableSpan0));
        this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(v);
    }

    public TouchDelegateInfoCompat e0() {
        if(Build.VERSION.SDK_INT >= 29) {
            AccessibilityNodeInfo.TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo0 = this.a.getTouchDelegateInfo();
            return accessibilityNodeInfo$TouchDelegateInfo0 == null ? null : new TouchDelegateInfoCompat(accessibilityNodeInfo$TouchDelegateInfo0);
        }
        return null;
    }

    @Deprecated
    public void e1(Rect rect0) {
        this.a.setBoundsInParent(rect0);
    }

    public void e2(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 30) {
            Api30Impl.c(this.a, charSequence0);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(accessibilityNodeInfo0 == null) {
            if(((AccessibilityNodeInfoCompat)object0).a != null) {
                return false;
            }
        }
        else if(!accessibilityNodeInfo0.equals(((AccessibilityNodeInfoCompat)object0).a)) {
            return false;
        }
        return this.c == ((AccessibilityNodeInfoCompat)object0).c ? this.b == ((AccessibilityNodeInfoCompat)object0).b : false;
    }

    @RestrictTo({Scope.c})
    public void f(CharSequence charSequence0, View view0) {
        if(Build.VERSION.SDK_INT < 26) {
            this.h();
            this.Z0(view0);
            ClickableSpan[] arr_clickableSpan = AccessibilityNodeInfoCompat.z(charSequence0);
            if(arr_clickableSpan != null && arr_clickableSpan.length > 0) {
                this.H().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", id.accessibility_action_clickable_span);
                SparseArray sparseArray0 = this.R(view0);
                for(int v = 0; v < arr_clickableSpan.length; ++v) {
                    int v1 = this.n0(arr_clickableSpan[v], sparseArray0);
                    sparseArray0.put(v1, new WeakReference(arr_clickableSpan[v]));
                    this.e(arr_clickableSpan[v], ((Spanned)charSequence0), v1);
                }
            }
        }
    }

    public AccessibilityNodeInfoCompat f0() {
        return Build.VERSION.SDK_INT < 22 ? null : AccessibilityNodeInfoCompat.u2(this.a.getTraversalAfter());
    }

    public void f1(Rect rect0) {
        this.a.setBoundsInScreen(rect0);
    }

    public void f2(CharSequence charSequence0) {
        this.a.setText(charSequence0);
    }

    public boolean g() {
        return this.a.canOpenPopup();
    }

    public AccessibilityNodeInfoCompat g0() {
        return Build.VERSION.SDK_INT < 22 ? null : AccessibilityNodeInfoCompat.u2(this.a.getTraversalBefore());
    }

    public void g1(Rect rect0) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.h(this.a, rect0);
            return;
        }
        this.a.getExtras().putParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY", rect0);
    }

    public void g2(boolean z) {
        if(Build.VERSION.SDK_INT >= 29) {
            this.a.setTextEntryKey(z);
            return;
        }
        this.d1(8, z);
    }

    private void h() {
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public String h0() {
        return Build.VERSION.SDK_INT < 33 ? this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY") : Api33Impl.g(this.a);
    }

    public void h1(boolean z) {
        this.a.setCanOpenPopup(z);
    }

    public void h2(boolean z) {
        if(Build.VERSION.SDK_INT >= 33) {
            Api33Impl.i(this.a, z);
            return;
        }
        this.d1(0x800000, z);
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    private List i(String s) {
        List list0 = this.a.getExtras().getIntegerArrayList(s);
        if(list0 == null) {
            list0 = new ArrayList();
            this.a.getExtras().putIntegerArrayList(s, ((ArrayList)list0));
        }
        return list0;
    }

    public String i0() {
        return this.a.getViewIdResourceName();
    }

    public void i1(boolean z) {
        this.a.setCheckable(z);
    }

    public void i2(int v, int v1) {
        this.a.setTextSelection(v, v1);
    }

    public List j(String s) {
        List list0 = new ArrayList();
        List list1 = this.a.findAccessibilityNodeInfosByText(s);
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list0.add(AccessibilityNodeInfoCompat.t2(((AccessibilityNodeInfo)list1.get(v1))));
        }
        return list0;
    }

    public AccessibilityWindowInfoCompat j0() {
        return AccessibilityWindowInfoCompat.y(this.a.getWindow());
    }

    public void j1(boolean z) {
        this.a.setChecked(z);
    }

    public void j2(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setTooltipText(charSequence0);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence0);
    }

    public List k(String s) {
        List list0 = this.a.findAccessibilityNodeInfosByViewId(s);
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(AccessibilityNodeInfoCompat.t2(((AccessibilityNodeInfo)object0)));
        }
        return list1;
    }

    public int k0() {
        return this.a.getWindowId();
    }

    public void k1(CharSequence charSequence0) {
        this.a.setClassName(charSequence0);
    }

    public void k2(TouchDelegateInfoCompat accessibilityNodeInfoCompat$TouchDelegateInfoCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            this.a.setTouchDelegateInfo(accessibilityNodeInfoCompat$TouchDelegateInfoCompat0.a);
        }
    }

    public AccessibilityNodeInfoCompat l(int v) {
        return AccessibilityNodeInfoCompat.u2(this.a.findFocus(v));
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean l0() {
        return Build.VERSION.SDK_INT < 34 ? this.r(0x20) : Api34Impl.e(this.a);
    }

    public void l1(boolean z) {
        this.a.setClickable(z);
    }

    public void l2(View view0) {
        if(Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view0);
        }
    }

    public AccessibilityNodeInfoCompat m(int v) {
        return AccessibilityNodeInfoCompat.u2(this.a.focusSearch(v));
    }

    private boolean m0() {
        return !this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void m1(Object object0) {
        this.a.setCollectionInfo((object0 == null ? null : ((AccessibilityNodeInfo.CollectionInfo)((CollectionInfoCompat)object0).a)));
    }

    public void m2(View view0, int v) {
        if(Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view0, v);
        }
    }

    public List n() {
        List list0 = this.a.getActionList();
        List list1 = new ArrayList();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list1.add(new AccessibilityActionCompat(list0.get(v1)));
        }
        return list1;
    }

    private int n0(ClickableSpan clickableSpan0, SparseArray sparseArray0) {
        if(sparseArray0 != null) {
            for(int v = 0; v < sparseArray0.size(); ++v) {
                if(clickableSpan0.equals(((ClickableSpan)((WeakReference)sparseArray0.valueAt(v)).get()))) {
                    return sparseArray0.keyAt(v);
                }
            }
        }
        int v1 = AccessibilityNodeInfoCompat.E0;
        AccessibilityNodeInfoCompat.E0 = v1 + 1;
        return v1;
    }

    public void n1(Object object0) {
        this.a.setCollectionItemInfo((object0 == null ? null : ((AccessibilityNodeInfo.CollectionItemInfo)((CollectionItemInfoCompat)object0).a)));
    }

    public void n2(View view0) {
        if(Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalBefore(view0);
        }
    }

    static String o(int v) {
        switch(v) {
            case 1: {
                return "ACTION_FOCUS";
            }
            case 2: {
                return "ACTION_CLEAR_FOCUS";
            }
            case 4: {
                return "ACTION_SELECT";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 0x20: {
                return "ACTION_LONG_CLICK";
            }
            case 0x40: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 0x80: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 0x100: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 0x200: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 0x400: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 0x800: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 0x1000: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 0x2000: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 0x4000: {
                return "ACTION_COPY";
            }
            case 0x8000: {
                return "ACTION_PASTE";
            }
            case 0x10000: {
                return "ACTION_CUT";
            }
            case 0x20000: {
                return "ACTION_SET_SELECTION";
            }
            case 0x40000: {
                return "ACTION_EXPAND";
            }
            case 0x80000: {
                return "ACTION_COLLAPSE";
            }
            case 0x200000: {
                return "ACTION_SET_TEXT";
            }
            case 0x1020036: {
                return "ACTION_SHOW_ON_SCREEN";
            }
            case 0x1020037: {
                return "ACTION_SCROLL_TO_POSITION";
            }
            case 0x1020038: {
                return "ACTION_SCROLL_UP";
            }
            case 0x1020039: {
                return "ACTION_SCROLL_LEFT";
            }
            case 0x102003A: {
                return "ACTION_SCROLL_DOWN";
            }
            case 0x102003B: {
                return "ACTION_SCROLL_RIGHT";
            }
            case 0x102003C: {
                return "ACTION_CONTEXT_CLICK";
            }
            case 0x102003D: {
                return "ACTION_SET_PROGRESS";
            }
            case 0x1020042: {
                return "ACTION_MOVE_WINDOW";
            }
            case 0x1020044: {
                return "ACTION_SHOW_TOOLTIP";
            }
            case 0x1020045: {
                return "ACTION_HIDE_TOOLTIP";
            }
            case 0x1020046: {
                return "ACTION_PAGE_UP";
            }
            case 0x1020047: {
                return "ACTION_PAGE_DOWN";
            }
            case 0x1020048: {
                return "ACTION_PAGE_LEFT";
            }
            case 0x1020049: {
                return "ACTION_PAGE_RIGHT";
            }
            case 0x102004A: {
                return "ACTION_PRESS_AND_HOLD";
            }
            case 0x1020054: {
                return "ACTION_IME_ENTER";
            }
            case 0x1020055: {
                return "ACTION_DRAG_START";
            }
            case 0x1020056: {
                return "ACTION_DRAG_DROP";
            }
            case 0x1020057: {
                return "ACTION_DRAG_CANCEL";
            }
            case 0x102005E: {
                return "ACTION_SCROLL_IN_DIRECTION";
            }
            default: {
                return "ACTION_UNKNOWN";
            }
        }
    }

    public boolean o0() {
        return Build.VERSION.SDK_INT < 34 ? this.r(0x40) : Api34Impl.f(this.a);
    }

    public void o1(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.i(this.a, charSequence0);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence0);
    }

    public void o2(View view0, int v) {
        if(Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalBefore(view0, v);
        }
    }

    @Deprecated
    public int p() {
        return this.a.getActions();
    }

    public boolean p0() {
        return this.a.isAccessibilityFocused();
    }

    public void p1(CharSequence charSequence0) {
        this.a.setContentDescription(charSequence0);
    }

    public void p2(String s) {
        if(Build.VERSION.SDK_INT >= 33) {
            Api33Impl.j(this.a, s);
            return;
        }
        this.a.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", s);
    }

    public List q() {
        return Build.VERSION.SDK_INT < 26 ? Collections.emptyList() : this.a.getAvailableExtraData();
    }

    public boolean q0() {
        return this.a.isCheckable();
    }

    public void q1(boolean z) {
        this.a.setContentInvalid(z);
    }

    public void q2(String s) {
        this.a.setViewIdResourceName(s);
    }

    private boolean r(int v) {
        Bundle bundle0 = this.H();
        return bundle0 == null ? false : (bundle0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & v) == v;
    }

    public boolean r0() {
        return this.a.isChecked();
    }

    public void r1(boolean z) {
        if(Build.VERSION.SDK_INT >= 23) {
            this.a.setContextClickable(z);
        }
    }

    public void r2(boolean z) {
        this.a.setVisibleToUser(z);
    }

    @Deprecated
    public void s(Rect rect0) {
        this.a.getBoundsInParent(rect0);
    }

    public boolean s0() {
        return this.a.isClickable();
    }

    public void s1(boolean z) {
        this.a.setDismissable(z);
    }

    public AccessibilityNodeInfo s2() {
        return this.a;
    }

    public void t(Rect rect0) {
        this.a.getBoundsInScreen(rect0);
    }

    public boolean t0() {
        return this.a.isContentInvalid();
    }

    public void t1(int v) {
        if(Build.VERSION.SDK_INT >= 24) {
            this.a.setDrawingOrder(v);
        }
    }

    public static AccessibilityNodeInfoCompat t2(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        Rect rect0 = new Rect();
        this.s(rect0);
        stringBuilder0.append("; boundsInParent: " + rect0);
        this.t(rect0);
        stringBuilder0.append("; boundsInScreen: " + rect0);
        this.u(rect0);
        stringBuilder0.append("; boundsInWindow: " + rect0);
        stringBuilder0.append("; packageName: ");
        stringBuilder0.append(this.S());
        stringBuilder0.append("; className: ");
        stringBuilder0.append(this.y());
        stringBuilder0.append("; text: ");
        stringBuilder0.append(this.a0());
        stringBuilder0.append("; error: ");
        stringBuilder0.append(this.F());
        stringBuilder0.append("; maxTextLength: ");
        stringBuilder0.append(this.O());
        stringBuilder0.append("; stateDescription: ");
        stringBuilder0.append(this.Z());
        stringBuilder0.append("; contentDescription: ");
        stringBuilder0.append(this.D());
        stringBuilder0.append("; tooltipText: ");
        stringBuilder0.append(this.d0());
        stringBuilder0.append("; viewIdResName: ");
        stringBuilder0.append(this.i0());
        stringBuilder0.append("; uniqueId: ");
        stringBuilder0.append(this.h0());
        stringBuilder0.append("; checkable: ");
        stringBuilder0.append(this.q0());
        stringBuilder0.append("; checked: ");
        stringBuilder0.append(this.r0());
        stringBuilder0.append("; fieldRequired: ");
        stringBuilder0.append(this.y0());
        stringBuilder0.append("; focusable: ");
        stringBuilder0.append(this.z0());
        stringBuilder0.append("; focused: ");
        stringBuilder0.append(this.A0());
        stringBuilder0.append("; selected: ");
        stringBuilder0.append(this.J0());
        stringBuilder0.append("; clickable: ");
        stringBuilder0.append(this.s0());
        stringBuilder0.append("; longClickable: ");
        stringBuilder0.append(this.E0());
        stringBuilder0.append("; contextClickable: ");
        stringBuilder0.append(this.u0());
        stringBuilder0.append("; enabled: ");
        stringBuilder0.append(this.x0());
        stringBuilder0.append("; password: ");
        stringBuilder0.append(this.G0());
        stringBuilder0.append("; scrollable: " + this.I0());
        stringBuilder0.append("; containerTitle: ");
        stringBuilder0.append(this.C());
        stringBuilder0.append("; granularScrollingSupported: ");
        stringBuilder0.append(this.B0());
        stringBuilder0.append("; importantForAccessibility: ");
        stringBuilder0.append(this.D0());
        stringBuilder0.append("; visible: ");
        stringBuilder0.append(this.N0());
        stringBuilder0.append("; isTextSelectable: ");
        stringBuilder0.append(this.M0());
        stringBuilder0.append("; accessibilityDataSensitive: ");
        stringBuilder0.append(this.o0());
        stringBuilder0.append("; [");
        List list0 = this.n();
        for(int v = 0; v < list0.size(); ++v) {
            AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0 = (AccessibilityActionCompat)list0.get(v);
            String s = AccessibilityNodeInfoCompat.o(accessibilityNodeInfoCompat$AccessibilityActionCompat0.b());
            if(s.equals("ACTION_UNKNOWN") && accessibilityNodeInfoCompat$AccessibilityActionCompat0.c() != null) {
                s = accessibilityNodeInfoCompat$AccessibilityActionCompat0.c().toString();
            }
            stringBuilder0.append(s);
            if(v != list0.size() - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public void u(Rect rect0) {
        if(Build.VERSION.SDK_INT >= 34) {
            Api34Impl.b(this.a, rect0);
            return;
        }
        Rect rect1 = (Rect)this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if(rect1 != null) {
            rect0.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
        }
    }

    public boolean u0() {
        return Build.VERSION.SDK_INT < 23 ? false : this.a.isContextClickable();
    }

    public void u1(boolean z) {
        this.a.setEditable(z);
    }

    static AccessibilityNodeInfoCompat u2(Object object0) {
        return object0 == null ? null : new AccessibilityNodeInfoCompat(object0);
    }

    public AccessibilityNodeInfoCompat v(int v) {
        return AccessibilityNodeInfoCompat.u2(this.a.getChild(v));
    }

    public boolean v0() {
        return this.a.isDismissable();
    }

    public void v1(boolean z) {
        this.a.setEnabled(z);
    }

    public AccessibilityNodeInfoCompat w(int v, int v1) {
        return Build.VERSION.SDK_INT < 33 ? this.v(v) : Api33Impl.b(this.a, v, v1);
    }

    public boolean w0() {
        return this.a.isEditable();
    }

    public void w1(CharSequence charSequence0) {
        this.a.setError(charSequence0);
    }

    public int x() {
        return this.a.getChildCount();
    }

    public boolean x0() {
        return this.a.isEnabled();
    }

    public void x1(boolean z) {
        this.a.getExtras().putBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY", z);
    }

    public CharSequence y() {
        return this.a.getClassName();
    }

    public boolean y0() {
        return this.a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void y1(boolean z) {
        this.a.setFocusable(z);
    }

    // 去混淆评级： 低(20)
    @RestrictTo({Scope.c})
    public static ClickableSpan[] z(CharSequence charSequence0) {
        return charSequence0 instanceof Spanned ? ((ClickableSpan[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), ClickableSpan.class)) : null;
    }

    public boolean z0() {
        return this.a.isFocusable();
    }

    public void z1(boolean z) {
        this.a.setFocused(z);
    }
}

