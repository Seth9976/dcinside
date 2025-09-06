package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Map;
import java.util.WeakHashMap;

public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {
    public static class ItemDelegate extends AccessibilityDelegateCompat {
        final RecyclerViewAccessibilityDelegate d;
        private Map e;

        public ItemDelegate(@NonNull RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0) {
            this.e = new WeakHashMap();
            this.d = recyclerViewAccessibilityDelegate0;
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean a(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            return accessibilityDelegateCompat0 == null ? super.a(view0, accessibilityEvent0) : accessibilityDelegateCompat0.a(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        @Nullable
        public AccessibilityNodeProviderCompat b(@NonNull View view0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            return accessibilityDelegateCompat0 == null ? super.b(view0) : accessibilityDelegateCompat0.b(view0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void f(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            if(accessibilityDelegateCompat0 != null) {
                accessibilityDelegateCompat0.f(view0, accessibilityEvent0);
                return;
            }
            super.f(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, @SuppressLint({"InvalidNullabilityOverride"}) @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            if(!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().y1(view0, accessibilityNodeInfoCompat0);
                AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
                if(accessibilityDelegateCompat0 != null) {
                    accessibilityDelegateCompat0.g(view0, accessibilityNodeInfoCompat0);
                    return;
                }
                super.g(view0, accessibilityNodeInfoCompat0);
                return;
            }
            super.g(view0, accessibilityNodeInfoCompat0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void h(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            if(accessibilityDelegateCompat0 != null) {
                accessibilityDelegateCompat0.h(view0, accessibilityEvent0);
                return;
            }
            super.h(view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean i(@NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(viewGroup0);
            return accessibilityDelegateCompat0 == null ? super.i(viewGroup0, view0, accessibilityEvent0) : accessibilityDelegateCompat0.i(viewGroup0, view0, accessibilityEvent0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, int v, @SuppressLint({"InvalidNullabilityOverride"}) @Nullable Bundle bundle0) {
            if(!this.d.o() && this.d.d.getLayoutManager() != null) {
                AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
                if(accessibilityDelegateCompat0 != null) {
                    return accessibilityDelegateCompat0.j(view0, v, bundle0) ? true : this.d.d.getLayoutManager().S1(view0, v, bundle0);
                }
                return super.j(view0, v, bundle0) ? true : this.d.d.getLayoutManager().S1(view0, v, bundle0);
            }
            return super.j(view0, v, bundle0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void l(@NonNull View view0, int v) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            if(accessibilityDelegateCompat0 != null) {
                accessibilityDelegateCompat0.l(view0, v);
                return;
            }
            super.l(view0, v);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void m(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = (AccessibilityDelegateCompat)this.e.get(view0);
            if(accessibilityDelegateCompat0 != null) {
                accessibilityDelegateCompat0.m(view0, accessibilityEvent0);
                return;
            }
            super.m(view0, accessibilityEvent0);
        }

        AccessibilityDelegateCompat n(View view0) {
            return (AccessibilityDelegateCompat)this.e.remove(view0);
        }

        void o(View view0) {
            AccessibilityDelegateCompat accessibilityDelegateCompat0 = ViewCompat.G(view0);
            if(accessibilityDelegateCompat0 != null && accessibilityDelegateCompat0 != this) {
                this.e.put(view0, accessibilityDelegateCompat0);
            }
        }
    }

    final RecyclerView d;
    private final ItemDelegate e;

    public RecyclerViewAccessibilityDelegate(@NonNull RecyclerView recyclerView0) {
        this.d = recyclerView0;
        AccessibilityDelegateCompat accessibilityDelegateCompat0 = this.n();
        if(accessibilityDelegateCompat0 != null && accessibilityDelegateCompat0 instanceof ItemDelegate) {
            this.e = (ItemDelegate)accessibilityDelegateCompat0;
            return;
        }
        this.e = new ItemDelegate(this);
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void f(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, @SuppressLint({"InvalidNullabilityOverride"}) @NonNull AccessibilityEvent accessibilityEvent0) {
        super.f(view0, accessibilityEvent0);
        if(view0 instanceof RecyclerView && !this.o() && ((RecyclerView)view0).getLayoutManager() != null) {
            ((RecyclerView)view0).getLayoutManager().u1(accessibilityEvent0);
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void g(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, @SuppressLint({"InvalidNullabilityOverride"}) @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.g(view0, accessibilityNodeInfoCompat0);
        if(!this.o() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().w1(accessibilityNodeInfoCompat0);
        }
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) @NonNull View view0, int v, @SuppressLint({"InvalidNullabilityOverride"}) @Nullable Bundle bundle0) {
        if(super.j(view0, v, bundle0)) {
            return true;
        }
        return this.o() || this.d.getLayoutManager() == null ? false : this.d.getLayoutManager().Q1(v, bundle0);
    }

    @NonNull
    public AccessibilityDelegateCompat n() {
        return this.e;
    }

    boolean o() {
        return this.d.hasPendingAdapterUpdates();
    }
}

