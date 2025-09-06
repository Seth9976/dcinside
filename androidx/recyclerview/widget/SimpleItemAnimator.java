package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class SimpleItemAnimator extends ItemAnimator {
    boolean l;
    private static final boolean m = false;
    private static final String n = "SimpleItemAnimator";

    public SimpleItemAnimator() {
        this.l = true;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean D(ViewHolder arg1);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean E(ViewHolder arg1, ViewHolder arg2, int arg3, int arg4, int arg5, int arg6);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean F(ViewHolder arg1, int arg2, int arg3, int arg4, int arg5);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean G(ViewHolder arg1);

    @SuppressLint({"UnknownNullness"})
    public final void H(ViewHolder recyclerView$ViewHolder0) {
        this.h(recyclerView$ViewHolder0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void I(ViewHolder recyclerView$ViewHolder0) {
    }

    @SuppressLint({"UnknownNullness"})
    public final void J(ViewHolder recyclerView$ViewHolder0, boolean z) {
        this.h(recyclerView$ViewHolder0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void K(ViewHolder recyclerView$ViewHolder0, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public final void L(ViewHolder recyclerView$ViewHolder0) {
        this.h(recyclerView$ViewHolder0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void M(ViewHolder recyclerView$ViewHolder0) {
    }

    @SuppressLint({"UnknownNullness"})
    public final void N(ViewHolder recyclerView$ViewHolder0) {
        this.h(recyclerView$ViewHolder0);
    }

    @SuppressLint({"UnknownNullness"})
    public final void O(ViewHolder recyclerView$ViewHolder0) {
    }

    public boolean P() {
        return this.l;
    }

    @SuppressLint({"UnknownNullness"})
    public void Q(ViewHolder recyclerView$ViewHolder0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void R(ViewHolder recyclerView$ViewHolder0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void S(ViewHolder recyclerView$ViewHolder0, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void T(ViewHolder recyclerView$ViewHolder0, boolean z) {
    }

    @SuppressLint({"UnknownNullness"})
    public void U(ViewHolder recyclerView$ViewHolder0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void V(ViewHolder recyclerView$ViewHolder0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void W(ViewHolder recyclerView$ViewHolder0) {
    }

    @SuppressLint({"UnknownNullness"})
    public void X(ViewHolder recyclerView$ViewHolder0) {
    }

    public void Y(boolean z) {
        this.l = z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean a(@NonNull ViewHolder recyclerView$ViewHolder0, @Nullable ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        if(recyclerView$ItemAnimator$ItemHolderInfo0 != null) {
            int v = recyclerView$ItemAnimator$ItemHolderInfo0.a;
            int v1 = recyclerView$ItemAnimator$ItemHolderInfo1.a;
            return v == v1 && recyclerView$ItemAnimator$ItemHolderInfo0.b == recyclerView$ItemAnimator$ItemHolderInfo1.b ? this.D(recyclerView$ViewHolder0) : this.F(recyclerView$ViewHolder0, v, recyclerView$ItemAnimator$ItemHolderInfo0.b, v1, recyclerView$ItemAnimator$ItemHolderInfo1.b);
        }
        return this.D(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean b(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull ViewHolder recyclerView$ViewHolder1, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        int v = recyclerView$ItemAnimator$ItemHolderInfo0.a;
        int v1 = recyclerView$ItemAnimator$ItemHolderInfo0.b;
        return recyclerView$ViewHolder1.shouldIgnore() ? this.E(recyclerView$ViewHolder0, recyclerView$ViewHolder1, v, v1, recyclerView$ItemAnimator$ItemHolderInfo0.a, recyclerView$ItemAnimator$ItemHolderInfo0.b) : this.E(recyclerView$ViewHolder0, recyclerView$ViewHolder1, v, v1, recyclerView$ItemAnimator$ItemHolderInfo1.a, recyclerView$ItemAnimator$ItemHolderInfo1.b);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean c(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @Nullable ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        int v = recyclerView$ItemAnimator$ItemHolderInfo0.a;
        int v1 = recyclerView$ItemAnimator$ItemHolderInfo0.b;
        View view0 = recyclerView$ViewHolder0.itemView;
        int v2 = recyclerView$ItemAnimator$ItemHolderInfo1 == null ? view0.getLeft() : recyclerView$ItemAnimator$ItemHolderInfo1.a;
        int v3 = recyclerView$ItemAnimator$ItemHolderInfo1 == null ? view0.getTop() : recyclerView$ItemAnimator$ItemHolderInfo1.b;
        if(!recyclerView$ViewHolder0.isRemoved() && (v != v2 || v1 != v3)) {
            view0.layout(v2, v3, view0.getWidth() + v2, view0.getHeight() + v3);
            return this.F(recyclerView$ViewHolder0, v, v1, v2, v3);
        }
        return this.G(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean d(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        int v = recyclerView$ItemAnimator$ItemHolderInfo0.a;
        int v1 = recyclerView$ItemAnimator$ItemHolderInfo1.a;
        if(v == v1 && recyclerView$ItemAnimator$ItemHolderInfo0.b == recyclerView$ItemAnimator$ItemHolderInfo1.b) {
            this.L(recyclerView$ViewHolder0);
            return false;
        }
        return this.F(recyclerView$ViewHolder0, v, recyclerView$ItemAnimator$ItemHolderInfo0.b, v1, recyclerView$ItemAnimator$ItemHolderInfo1.b);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean f(@NonNull ViewHolder recyclerView$ViewHolder0) {
        return !this.l || recyclerView$ViewHolder0.isInvalid();
    }
}

