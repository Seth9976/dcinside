package com.dcinside.app.archive.edit;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.c;
import com.dcinside.app.realm.d0;
import com.dcinside.app.span.p;
import com.dcinside.app.util.Bk;
import io.realm.d1;
import io.realm.g1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveEditAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveEditAdapter.kt\ncom/dcinside/app/archive/edit/ArchiveEditAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class o extends Adapter {
    @l
    private final Function1 a;
    @l
    private final SparseBooleanArray b;
    @m
    private g1 c;

    public o(@l Function1 function10) {
        L.p(function10, "funcCheckChanged");
        super();
        this.a = function10;
        this.b = new SparseBooleanArray();
    }

    @l
    public r A(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0197, viewGroup0, false);  // layout:view_archive_edit_item
        L.m(view0);
        return new r(view0);
    }

    public final void B(@m g1 g10) {
        this.c = g10;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c == null ? 0 : this.c.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.y(((r)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.A(viewGroup0, v);
    }

    @l
    public final SparseBooleanArray v() {
        return this.b;
    }

    private final d1 w(int v) {
        return this.c == null ? null : ((d1)this.c.get(v));
    }

    @m
    public final g1 x() {
        return this.c;
    }

    public void y(@l r r0, int v) {
        L.p(r0, "holder");
        d1 d10 = this.w(v);
        Context context0 = r0.itemView.getContext();
        r0.i().setChecked(this.b.get(v));
        String s = "";
        String s1 = null;
        if(d10 instanceof d0) {
            c c0 = ((d0)d10).T5();
            if(c0 != null) {
                s1 = c0.R5();
            }
            r0.j().setText((s1 == null ? "[폴더없음]" : context0.getString(0x7F1500E9, new Object[]{s1})));  // string:archive_folder_name_input "[%1$s]"
            r0.k().setText(((d0)d10).Y5());
            String s2 = ((d0)d10).V5();
            String s3 = ((d0)d10).a6();
            String s4 = ((d0)d10).S5();
            if(s4 != null) {
                String s5 = Bk.l(s4);
                if(s5 != null) {
                    s = s5;
                }
            }
            p.a(r0.l(), new CharSequence[]{s2, s3, s});
            return;
        }
        if(d10 instanceof A0) {
            c c1 = ((A0)d10).R5();
            if(c1 != null) {
                s1 = c1.R5();
            }
            r0.j().setText((s1 == null ? "[폴더없음]" : context0.getString(0x7F1500E9, new Object[]{s1})));  // string:archive_folder_name_input "[%1$s]"
            r0.k().setText(((A0)d10).X5());
            String s6 = ((A0)d10).T5();
            String s7 = ((A0)d10).Z5();
            String s8 = ((A0)d10).Q5();
            if(s8 != null) {
                String s9 = Bk.l(s8);
                if(s9 != null) {
                    s = s9;
                }
            }
            p.a(r0.l(), new CharSequence[]{s6, s7, s});
            return;
        }
        r0.l().setText(null);
    }

    public final void z(int v, boolean z) {
        this.b.put(v, z);
        this.a.invoke(this.b);
    }
}

