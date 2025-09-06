package com.dcinside.app.gallery.history;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.util.Dl;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class i extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.gallery.history.a.values().length];
            try {
                arr_v[com.dcinside.app.gallery.history.a.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.gallery.history.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.gallery.history.a.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    private ArrayList a;
    @l
    private com.dcinside.app.gallery.history.a b;
    private int c;
    private boolean d;
    @l
    public static final a e = null;
    private static final int f = 0;
    private static final int g = 1;

    static {
        i.e = new a(null);
    }

    public i() {
        this.a = new ArrayList();
        this.b = com.dcinside.app.gallery.history.a.b;
    }

    private final void A(j j0) {
        switch(this.b) {
            case 1: {
                j0.k().setVisibility(0);
                j0.j().setVisibility(0);
                j0.m().setVisibility(0);
                j0.l().setVisibility(0);
                return;
            }
            case 2: 
            case 3: {
                j0.k().setVisibility(8);
                j0.j().setVisibility(8);
                j0.m().setVisibility(8);
                j0.l().setVisibility(8);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size() + 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return v < this.a.size() ? 0 : 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        Context context0 = recyclerView$ViewHolder0.itemView.getContext();
        int v1 = 0;
        int v2 = 4;
        if(recyclerView$ViewHolder0 instanceof j) {
            if(v >= this.a.size()) {
                return;
            }
            Object object0 = this.a.get(v);
            L.o(object0, "get(...)");
            this.A(((j)recyclerView$ViewHolder0));
            this.w(((j)recyclerView$ViewHolder0), ((com.dcinside.app.gallery.history.b)object0));
            View view0 = ((j)recyclerView$ViewHolder0).r();
            if(v == 0) {
                v1 = 4;
            }
            view0.setVisibility(v1);
            return;
        }
        if(recyclerView$ViewHolder0 instanceof k) {
            ((k)recyclerView$ViewHolder0).h().setVisibility((this.d ? 0 : 4));
            ((k)recyclerView$ViewHolder0).e().setVisibility((this.d ? 4 : 0));
            TextView textView0 = ((k)recyclerView$ViewHolder0).f();
            if(!this.d) {
                v2 = 0;
            }
            textView0.setVisibility(v2);
            ((k)recyclerView$ViewHolder0).f().setText(context0.getString(0x7F1503C9, new Object[]{this.c}));  // string:gallery_manage_history_list_content "※ 최근 %d일 내역만 공개됩니다."
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        if(v == 0) {
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E020F, viewGroup0, false);  // layout:view_manage_history_item
            L.m(view0);
            return new j(view0);
        }
        View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0210, viewGroup0, false);  // layout:view_manage_history_more
        L.m(view1);
        return new k(view1);
    }

    public final void v(@m com.dcinside.app.gallery.history.b[] arr_b, int v, @l com.dcinside.app.gallery.history.a a0) {
        L.p(a0, "selectedTab");
        if(arr_b == null) {
            return;
        }
        this.c = v;
        this.b = a0;
        u.s0(this.a, arr_b);
        this.notifyDataSetChanged();
    }

    private final void w(j j0, com.dcinside.app.gallery.history.b b0) {
        Context context0 = j0.itemView.getContext();
        switch(this.b) {
            case 1: {
                String s = b0.l();
                boolean z = s != null && s.length() <= 0;
                j0.f().setText((z ? "닉네임(IP)" : "닉네임(식별 코드)"));
                String s1 = z ? b0.e() : b0.l();
                if(s1 == null || s1.length() == 0) {
                    j0.f().setText("닉네임");
                    j0.e().setText(b0.i());
                }
                else {
                    String s2 = !com.dcinside.app.gallery.history.b.m.a(b0) || z ? "" : "+ IP";
                    L.m(s2);
                    j0.e().setText(context0.getString(0x7F150390, new Object[]{b0.i(), s1, s2}));  // string:gallery_history_user_data "%1$s(%2$s) %3$s"
                }
                String s3 = b0.c();
                if(s3 == null || s3.length() <= 0) {
                    j0.i().setVisibility(8);
                    j0.h().setVisibility(8);
                }
                else {
                    j0.i().setText(b0.c());
                    j0.h().setText((b0.j() == null ? b0.h() : b0.j()));
                }
                j0.k().setText("사유");
                j0.j().setText(Dl.C(Dl.M((b0.h() == null ? b0.j() : b0.h()))));
                j0.m().setText("기간");
                j0.l().setText(b0.a());
                break;
            }
            case 2: {
                String s4 = b0.l();
                boolean z1 = s4 != null && s4.length() <= 0;
                j0.f().setText((z1 ? "닉네임(IP)" : "닉네임(식별 코드)"));
                String s5 = z1 ? b0.e() : b0.l();
                if(s5 == null || s5.length() == 0) {
                    j0.f().setText("닉네임");
                    j0.e().setText(b0.i());
                }
                else {
                    j0.e().setText(context0.getString(0x7F150390, new Object[]{b0.i(), s5, ""}));  // string:gallery_history_user_data "%1$s(%2$s) %3$s"
                }
                j0.i().setText((b0.c() == null ? "게시글" : b0.c()));
                j0.h().setText(Dl.C(Dl.M((b0.h() == null ? b0.j() : b0.h()))));
                String s6 = b0.c();
                if(s6 == null || s6.length() <= 0) {
                    j0.k().setVisibility(8);
                    j0.j().setVisibility(8);
                }
                else {
                    j0.k().setText(b0.c());
                    j0.j().setText((b0.j() == null ? b0.h() : b0.j()));
                }
                j0.m().setText("기간");
                j0.l().setText(b0.a());
                break;
            }
            case 3: {
                j0.f().setText("종류");
                j0.e().setText(Dl.M(b0.k()));
                j0.i().setText("내용");
                j0.h().setText(Dl.C(Dl.M((b0.h() == null ? b0.j() : b0.h()))));
            }
        }
        j0.o().setText("처리일");
        j0.n().setText(b0.d());
        String s7 = b0.g();
        if(s7 != null && s7.length() > 0) {
            j0.q().setVisibility(0);
            j0.p().setVisibility(0);
            j0.q().setText("처리자");
            String s8 = b0.f();
            j0.p().setText((s8 == null || s8.length() <= 0 ? b0.g() : context0.getString(0x7F150390, new Object[]{b0.g(), b0.f(), ""})));  // string:gallery_history_user_data "%1$s(%2$s) %3$s"
            return;
        }
        j0.q().setVisibility(8);
        j0.p().setVisibility(8);
    }

    public final void x() {
        this.a.clear();
        this.notifyDataSetChanged();
    }

    public final boolean y() {
        return this.a.isEmpty();
    }

    public final void z(boolean z, @m RecyclerView recyclerView0) {
        if(recyclerView0 == null) {
            return;
        }
        this.d = z;
        ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(this.a.size());
        k k0 = recyclerView$ViewHolder0 instanceof k ? ((k)recyclerView$ViewHolder0) : null;
        if(k0 == null) {
            return;
        }
        Context context0 = recyclerView0.getContext();
        k0.h().setVisibility((z ? 0 : 4));
        k0.f().setText(context0.getString(0x7F1503C9, new Object[]{this.c}));  // string:gallery_manage_history_list_content "※ 최근 %d일 내역만 공개됩니다."
    }
}

