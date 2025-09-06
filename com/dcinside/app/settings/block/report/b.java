package com.dcinside.app.settings.block.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.c;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.realm.j;
import com.dcinside.app.span.g;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.vk;
import io.realm.g1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nBlockReportPostAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockReportPostAdapter.kt\ncom/dcinside/app/settings/block/report/BlockReportPostAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n257#2,2:139\n257#2,2:141\n1863#3,2:143\n1863#3,2:145\n*S KotlinDebug\n*F\n+ 1 BlockReportPostAdapter.kt\ncom/dcinside/app/settings/block/report/BlockReportPostAdapter\n*L\n58#1:139,2\n61#1:141,2\n89#1:143,2\n107#1:145,2\n*E\n"})
public final class b extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class com.dcinside.app.settings.block.report.b.b {
        private final int a;
        @l
        private final String b;
        @l
        private final j c;
        private boolean d;

        public com.dcinside.app.settings.block.report.b.b(int v, @l String s, @l j j0, boolean z) {
            L.p(s, "headerDate");
            L.p(j0, "post");
            super();
            this.a = v;
            this.b = s;
            this.c = j0;
            this.d = z;
        }

        public com.dcinside.app.settings.block.report.b.b(int v, String s, j j0, boolean z, int v1, w w0) {
            if((v1 & 8) != 0) {
                z = false;
            }
            this(v, s, j0, z);
        }

        public final int a() {
            return this.a;
        }

        @l
        public final String b() {
            return this.b;
        }

        @l
        public final j c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        @l
        public final com.dcinside.app.settings.block.report.b.b e(int v, @l String s, @l j j0, boolean z) {
            L.p(s, "headerDate");
            L.p(j0, "post");
            return new com.dcinside.app.settings.block.report.b.b(v, s, j0, z);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.dcinside.app.settings.block.report.b.b)) {
                return false;
            }
            if(this.a != ((com.dcinside.app.settings.block.report.b.b)object0).a) {
                return false;
            }
            if(!L.g(this.b, ((com.dcinside.app.settings.block.report.b.b)object0).b)) {
                return false;
            }
            return L.g(this.c, ((com.dcinside.app.settings.block.report.b.b)object0).c) ? this.d == ((com.dcinside.app.settings.block.report.b.b)object0).d : false;
        }

        public static com.dcinside.app.settings.block.report.b.b f(com.dcinside.app.settings.block.report.b.b b$b0, int v, String s, j j0, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = b$b0.a;
            }
            if((v1 & 2) != 0) {
                s = b$b0.b;
            }
            if((v1 & 4) != 0) {
                j0 = b$b0.c;
            }
            if((v1 & 8) != 0) {
                z = b$b0.d;
            }
            return b$b0.e(v, s, j0, z);
        }

        @l
        public final String g() {
            return this.b;
        }

        @l
        public final j h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return ((this.a * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + c.a(this.d);
        }

        public final int i() {
            return this.a;
        }

        public final boolean j() {
            return this.d;
        }

        public final void k(boolean z) {
            this.d = z;
        }

        @Override
        @l
        public String toString() {
            return "ReportedPosts(type=" + this.a + ", headerDate=" + this.b + ", post=" + this.c + ", isClosed=" + this.d + ")";
        }
    }

    @l
    private final List a;
    @l
    public static final a b = null;
    private static final int c = 0;
    private static final int d = 1;

    static {
        b.b = new a(null);
    }

    public b() {
        this.a = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((com.dcinside.app.settings.block.report.b.b)this.a.get(v)).i();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        com.dcinside.app.settings.block.report.b.b b$b0 = (com.dcinside.app.settings.block.report.b.b)this.a.get(v);
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.settings.block.report.c) {
            ((com.dcinside.app.settings.block.report.c)recyclerView$ViewHolder0).h().setText(b$b0.g());
            ((com.dcinside.app.settings.block.report.c)recyclerView$ViewHolder0).l(b$b0.j());
            return;
        }
        if(recyclerView$ViewHolder0 instanceof d) {
            if(b$b0.j()) {
                recyclerView$ViewHolder0.itemView.getLayoutParams().height = 0;
                L.o(recyclerView$ViewHolder0.itemView, "itemView");
                recyclerView$ViewHolder0.itemView.setVisibility(8);
            }
            else {
                recyclerView$ViewHolder0.itemView.getLayoutParams().height = -2;
                L.o(recyclerView$ViewHolder0.itemView, "itemView");
                recyclerView$ViewHolder0.itemView.setVisibility(0);
            }
            Context context0 = recyclerView$ViewHolder0.itemView.getContext();
            j j0 = b$b0.h();
            String s = j0.T5();
            if(this.v(v)) {
                Context context1 = recyclerView$ViewHolder0.itemView.getContext();
                L.o(context1, "getContext(...)");
                ((d)recyclerView$ViewHolder0).i().setBackgroundColor(vk.b(context1, 0x7F0406F5));  // attr:windowBackgroundColor
                ((d)recyclerView$ViewHolder0).i().setDrawBottom(true);
            }
            else {
                ((d)recyclerView$ViewHolder0).i().setBackgroundResource(0x7F080558);  // drawable:report_item_last
                ((d)recyclerView$ViewHolder0).i().setDrawBottom(false);
            }
            ((d)recyclerView$ViewHolder0).f().setText(j0.X5());
            String s1 = j0.U5();
            if(s1 == null) {
                s1 = "";
            }
            String s2 = j0.R5();
            TextView textView0 = ((d)recyclerView$ViewHolder0).h();
            L.m(context0);
            textView0.setText(g.g(context0, -1, s, s1, s2, null));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                View view1 = layoutInflater0.inflate(0x7F0E01A4, viewGroup0, false);  // layout:view_block_report_post_item
                L.m(view1);
                return new d(view1);
            }
            case 1: {
                View view2 = layoutInflater0.inflate(0x7F0E01A3, viewGroup0, false);  // layout:view_block_report_post_head
                L.m(view2);
                return new com.dcinside.app.settings.block.report.c(view2);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E01A4, viewGroup0, false);  // layout:view_block_report_post_item
                L.m(view0);
                return new d(view0);
            }
        }
    }

    private final boolean v(int v) {
        return v < this.a.size() - 1 && ((com.dcinside.app.settings.block.report.b.b)this.a.get(v + 1)).i() == 0;
    }

    public final void w(@l Context context0, int v) {
        L.p(context0, "context");
        j j0 = ((com.dcinside.app.settings.block.report.b.b)this.a.get(v)).h();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        String s = j0.S5();
        if(s == null) {
            return;
        }
        new com.dcinside.app.util.Xk.a(s, j0.V5(), 0, null, false, false, false, false, false, false, null, false, null, null, 0x3FFC, null).a(appCompatActivity0);
    }

    public final void x(@m g1 g10) {
        if(g10 != null) {
            String s = "";
            for(Object object0: g10) {
                j j0 = (j)object0;
                long v = j0.W5();
                String s1 = Bk.a.B(v);
                if(!L.g(s, s1)) {
                    L.m(j0);
                    com.dcinside.app.settings.block.report.b.b b$b0 = new com.dcinside.app.settings.block.report.b.b(1, s1, j0, false, 8, null);
                    this.a.add(b$b0);
                    s = s1;
                }
                L.m(j0);
                com.dcinside.app.settings.block.report.b.b b$b1 = new com.dcinside.app.settings.block.report.b.b(0, s1, j0, false, 8, null);
                this.a.add(b$b1);
            }
        }
        this.notifyItemRangeInserted(0, this.getItemCount());
    }

    public final void y(int v) {
        String s = ((com.dcinside.app.settings.block.report.b.b)this.a.get(v)).g();
        for(Object object0: this.a) {
            com.dcinside.app.settings.block.report.b.b b$b0 = (com.dcinside.app.settings.block.report.b.b)object0;
            if(L.g(b$b0.g(), s)) {
                b$b0.k(!b$b0.j());
            }
        }
        this.notifyItemRangeChanged(0, this.getItemCount());
    }
}

