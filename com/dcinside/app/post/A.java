package com.dcinside.app.post;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.i;
import com.dcinside.app.response.PostItem;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAbstractPostSelectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPostSelectionAdapter.kt\ncom/dcinside/app/post/AbstractPostSelectionAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
public abstract class a extends Adapter implements i, o {
    private int a;
    private int b;
    @m
    private String c;
    @m
    private WeakReference d;
    private int e;

    public a() {
        this.a = -1;
        this.b = -1;
        this.e = -1;
    }

    public final void A(int v) {
        this.a = v;
    }

    public final void B(@l String s, int v, int v1) {
        int v2;
        L.p(s, "galleryId");
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                if(!recyclerView0.isLayoutSuppressed()) {
                    recyclerView0.stopScroll();
                }
                if(v > 0) {
                    LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                    Integer integer0 = null;
                    LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
                    if(linearLayoutManager0 == null) {
                        return;
                    }
                    Integer integer1 = linearLayoutManager0.s();
                    if(integer1.intValue() >= 0) {
                        integer0 = integer1;
                    }
                    if(integer0 == null) {
                        return;
                    }
                    v2 = (int)integer0;
                    int v3 = linearLayoutManager0.i();
                    int v4 = Math.min(this.getItemCount() - 1, v3);
                    if(v2 <= v4) {
                        while(true) {
                            if(6 == this.getItemViewType(v2) || 15 == this.getItemViewType(v2)) {
                                PostItem postItem0 = this.v(v2);
                                if(postItem0 == null || postItem0.C() != v) {
                                    goto label_24;
                                }
                                goto label_29;
                            }
                        label_24:
                            if(v2 == v4) {
                                goto label_28;
                            }
                            ++v2;
                        }
                        return;
                    }
                }
            label_28:
                v2 = -1;
            label_29:
                int v5 = this.a;
                this.a = -1;
                this.c = s;
                this.b = v;
                this.e = v1;
                if(v5 != v2) {
                    if(v5 >= 0) {
                        this.notifyItemChanged(v5);
                    }
                    if(v2 >= 0) {
                        this.notifyItemChanged(v2);
                    }
                }
                else if(v2 >= 0) {
                    this.notifyItemChanged(v2);
                }
            }
        }
    }

    public static void C(a a0, String s, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSelection");
        }
        if((v2 & 4) != 0) {
            v1 = -1;
        }
        a0.B(s, v, v1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.d = new WeakReference(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.d = null;
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        WeakReference weakReference0 = this.d;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.d = null;
    }

    @m
    public abstract PostItem v(int arg1);

    @m
    public final WeakReference w() {
        return this.d;
    }

    public final int x() {
        return this.e;
    }

    @m
    public final String y() {
        return this.c;
    }

    public final int z() {
        return this.b;
    }
}

