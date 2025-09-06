package com.dcinside.app.main.showgallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.util.Dk;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nShowAllGalleryListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowAllGalleryListAdapter.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryListAdapter\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,99:1\n177#2,9:100\n177#2,9:115\n257#3,2:109\n257#3,2:111\n257#3,2:113\n257#3,2:124\n257#3,2:126\n257#3,2:128\n*S KotlinDebug\n*F\n+ 1 ShowAllGalleryListAdapter.kt\ncom/dcinside/app/main/showgallery/ShowAllGalleryListAdapter\n*L\n43#1:100,9\n56#1:115,9\n49#1:109,2\n52#1:111,2\n53#1:113,2\n62#1:124,2\n65#1:126,2\n66#1:128,2\n*E\n"})
public final class m extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b extends ViewHolder {
        public b(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
        }
    }

    @l
    private final Function1 a;
    @l
    private final Function1 b;
    @l
    private final Function1 c;
    @y4.m
    private List d;
    @y4.m
    private List e;
    @l
    public static final a f = null;
    private static final int g = 0;
    private static final int h = 1;

    static {
        m.f = new a(null);
    }

    public m(@l Function1 function10, @l Function1 function11, @l Function1 function12) {
        L.p(function10, "deleteAction");
        L.p(function11, "openAction");
        L.p(function12, "longTouchAction");
        super();
        this.a = function10;
        this.b = function11;
        this.c = function12;
    }

    public final boolean A() {
        return this.d != null && !this.d.isEmpty() == 1;
    }

    public final void B(@y4.m List list0) {
        this.e = list0;
    }

    public final void C(@y4.m List list0) {
        this.d = list0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        int v;
        List list0 = this.d;
        if(list0 == null) {
            list0 = this.e;
            v = list0 == null ? 0 : list0.size();
        }
        else {
            v = list0.size();
        }
        int v1 = this.A();
        if(v % 2 == 1) {
            ++v;
        }
        return v + v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return !this.A() || v != this.getItemCount() - 1 ? 0 : 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.main.showgallery.l) {
            int v1 = 0x7F0804A8;  // drawable:person_gall_ic
            int v2 = 8;
            String s = null;
            int v3 = 0;
            if(this.d != null && !this.d.isEmpty() == 1) {
                List list0 = this.d;
                com.dcinside.app.realm.s0 s00 = null;
                if(list0 != null) {
                    try {
                        s00 = (com.dcinside.app.realm.s0)u.W2(list0, v);
                    }
                    catch(Exception unused_ex) {
                    }
                }
                boolean z = s00 != null && s00.T5() == com.dcinside.app.type.m.i.c();
                boolean z1 = s00 != null && s00.T5() == com.dcinside.app.type.m.j.c();
                if(z) {
                    v1 = 0x7F080415;  // drawable:mini_gall_ic
                }
                int v4 = z ? 0 : Dk.b(0x7F0703C6);  // dimen:person_icon_padding
                TextView textView0 = ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).k();
                if(s00 != null) {
                    s = s00.S5();
                }
                textView0.setText(s);
                ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).l().setVisibility((z || z1 ? 0 : 8));
                ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).l().setImageResource(v1);
                ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).l().setPadding(0, v4, v4, 0);
                ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).j().setVisibility((s00 == null ? 0 : 8));
                View view0 = ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).m();
                if((s00 == null ? 0 : s00.U5()) > 0) {
                    v2 = 0;
                }
                view0.setVisibility(v2);
                return;
            }
            if(this.e != null && !this.e.isEmpty() == 1) {
                List list1 = this.e;
                com.dcinside.app.realm.m m0 = null;
                if(list1 != null) {
                    try {
                        m0 = (com.dcinside.app.realm.m)u.W2(list1, v);
                    }
                    catch(Exception unused_ex) {
                    }
                }
                boolean z2 = m0 != null && m0.Q5() == com.dcinside.app.type.m.i.c();
                boolean z3 = m0 != null && m0.Q5() == com.dcinside.app.type.m.j.c();
                if(z2) {
                    v1 = 0x7F080415;  // drawable:mini_gall_ic
                }
                int v5 = z2 ? 0 : Dk.b(0x7F0703C6);  // dimen:person_icon_padding
                TextView textView1 = ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).k();
                if(m0 != null) {
                    s = m0.S5();
                }
                textView1.setText(s);
                ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).l().setVisibility((z2 || z3 ? 0 : 8));
                ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).l().setImageResource(v1);
                ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).l().setPadding(0, v5, v5, 0);
                View view1 = ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).j();
                if(m0 == null) {
                    v3 = 8;
                }
                view1.setVisibility(v3);
                ((com.dcinside.app.main.showgallery.l)recyclerView$ViewHolder0).m().setVisibility(8);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == 0) {
            View view0 = layoutInflater0.inflate(0x7F0E0193, viewGroup0, false);  // layout:view_all_gallery_item
            L.m(view0);
            return new com.dcinside.app.main.showgallery.l(view0);
        }
        View view1 = layoutInflater0.inflate(0x7F0E0192, viewGroup0, false);  // layout:view_all_gallery_desc
        L.m(view1);
        return new b(view1);
    }

    @l
    public final Function1 v() {
        return this.a;
    }

    @y4.m
    public final List w() {
        return this.e;
    }

    @l
    public final Function1 x() {
        return this.c;
    }

    @l
    public final Function1 y() {
        return this.b;
    }

    @y4.m
    public final List z() {
        return this.d;
    }
}

