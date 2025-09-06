package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.internal.E;
import com.google.android.material.internal.ParcelableSparseArray;

@e
public class d {
    public static final boolean a = false;
    private static final String b = "BadgeUtils";

    static {
        d.a = false;
    }

    private static void b(@NonNull a a0, @NonNull View view0) {
        class b extends AccessibilityDelegateCompat {
            final a d;

            b(View.AccessibilityDelegate view$AccessibilityDelegate0, a a0) {
                this.d = a0;
                super(view$AccessibilityDelegate0);
            }

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.p1(this.d.r());
            }
        }


        class c extends AccessibilityDelegateCompat {
            final a d;

            c(a a0) {
            }

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.p1(this.d.r());
            }
        }

        if(Build.VERSION.SDK_INT >= 29 && ViewCompat.L0(view0)) {
            ViewCompat.J1(view0, new b(view0.getAccessibilityDelegate(), a0));
            return;
        }
        ViewCompat.J1(view0, new c(a0));
    }

    public static void c(@NonNull a a0, @NonNull View view0) {
        d.d(a0, view0, null);
    }

    public static void d(@NonNull a a0, @NonNull View view0, @Nullable FrameLayout frameLayout0) {
        d.m(a0, view0, frameLayout0);
        if(a0.s() != null) {
            a0.s().setForeground(a0);
            return;
        }
        if(d.a) {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
        view0.getOverlay().add(a0);
    }

    public static void e(@NonNull a a0, @NonNull Toolbar toolbar0, @IdRes int v) {
        d.f(a0, toolbar0, v, null);
    }

    public static void f(@NonNull a a0, @NonNull Toolbar toolbar0, @IdRes int v, @Nullable FrameLayout frameLayout0) {
        class com.google.android.material.badge.d.a implements Runnable {
            final Toolbar a;
            final int b;
            final a c;
            final FrameLayout d;

            com.google.android.material.badge.d.a(Toolbar toolbar0, int v, a a0, FrameLayout frameLayout0) {
                this.b = v;
                this.c = a0;
                this.d = frameLayout0;
                super();
            }

            @Override
            public void run() {
                ActionMenuItemView actionMenuItemView0 = E.a(this.a, this.b);
                if(actionMenuItemView0 != null) {
                    Resources resources0 = this.a.getResources();
                    d.n(this.c, resources0);
                    d.d(this.c, actionMenuItemView0, this.d);
                    d.b(this.c, actionMenuItemView0);
                }
            }
        }

        toolbar0.post(new com.google.android.material.badge.d.a(toolbar0, v, a0, frameLayout0));
    }

    @NonNull
    public static SparseArray g(Context context0, @NonNull ParcelableSparseArray parcelableSparseArray0) {
        SparseArray sparseArray0 = new SparseArray(parcelableSparseArray0.size());
        for(int v = 0; v < parcelableSparseArray0.size(); ++v) {
            int v1 = parcelableSparseArray0.keyAt(v);
            State badgeState$State0 = (State)parcelableSparseArray0.valueAt(v);
            sparseArray0.put(v1, (badgeState$State0 == null ? null : a.h(context0, badgeState$State0)));
        }
        return sparseArray0;
    }

    @NonNull
    public static ParcelableSparseArray h(@NonNull SparseArray sparseArray0) {
        ParcelableSparseArray parcelableSparseArray0 = new ParcelableSparseArray();
        for(int v = 0; v < sparseArray0.size(); ++v) {
            int v1 = sparseArray0.keyAt(v);
            a a0 = (a)sparseArray0.valueAt(v);
            parcelableSparseArray0.put(v1, (a0 == null ? null : a0.G()));
        }
        return parcelableSparseArray0;
    }

    private static void i(@NonNull View view0) {
        class com.google.android.material.badge.d.d extends AccessibilityDelegateCompat {
            com.google.android.material.badge.d.d(View.AccessibilityDelegate view$AccessibilityDelegate0) {
            }

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.p1(null);
            }
        }

        if(Build.VERSION.SDK_INT >= 29 && ViewCompat.L0(view0)) {
            ViewCompat.J1(view0, new com.google.android.material.badge.d.d(view0.getAccessibilityDelegate()));
            return;
        }
        ViewCompat.J1(view0, null);
    }

    public static void j(@Nullable a a0, @NonNull View view0) {
        if(a0 == null) {
            return;
        }
        if(!d.a && a0.s() == null) {
            view0.getOverlay().remove(a0);
            return;
        }
        a0.s().setForeground(null);
    }

    public static void k(@Nullable a a0, @NonNull Toolbar toolbar0, @IdRes int v) {
        if(a0 == null) {
            return;
        }
        ActionMenuItemView actionMenuItemView0 = E.a(toolbar0, v);
        if(actionMenuItemView0 != null) {
            d.l(a0);
            d.j(a0, actionMenuItemView0);
            d.i(actionMenuItemView0);
            return;
        }
        Log.w("BadgeUtils", "Trying to remove badge from a null menuItemView: " + v);
    }

    @VisibleForTesting
    static void l(a a0) {
        a0.h0(0);
        a0.i0(0);
    }

    public static void m(@NonNull a a0, @NonNull View view0, @Nullable FrameLayout frameLayout0) {
        Rect rect0 = new Rect();
        view0.getDrawingRect(rect0);
        a0.setBounds(rect0);
        a0.P0(view0, frameLayout0);
    }

    @VisibleForTesting
    static void n(a a0, Resources resources0) {
        a0.h0(resources0.getDimensionPixelOffset(dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        a0.i0(resources0.getDimensionPixelOffset(dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void o(@NonNull Rect rect0, float f, float f1, float f2, float f3) {
        rect0.set(((int)(f - f2)), ((int)(f1 - f3)), ((int)(f + f2)), ((int)(f1 + f3)));
    }
}

