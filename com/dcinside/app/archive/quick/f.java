package com.dcinside.app.archive.quick;

import A3.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveChangeFolderItemHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveChangeFolderItemHolder.kt\ncom/dcinside/app/archive/quick/ArchiveChangeFolderItemHolder\n+ 2 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n20#2:29\n25#3:30\n1#4:31\n*S KotlinDebug\n*F\n+ 1 ArchiveChangeFolderItemHolder.kt\ncom/dcinside/app/archive/quick/ArchiveChangeFolderItemHolder\n*L\n22#1:29\n22#1:30\n*E\n"})
public final class f extends e {
    @l
    private final View a;
    @l
    private final TextView b;

    public f(@l ViewGroup viewGroup0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.archive.quick.ArchiveChangeFolderItemHolder$1", f = "ArchiveChangeFolderItemHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final f l;

            a(f f0, d d0) {
                this.l = f0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.k();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E0196);  // layout:view_archive_change_folder_item
        View view0 = this.itemView.findViewById(0x7F0B0126);  // id:archive_change_folder_item_icon
        L.o(view0, "findViewById(...)");
        this.a = view0;
        View view1 = this.itemView.findViewById(0x7F0B0127);  // id:archive_change_folder_item_title
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        L.o(this.itemView, "itemView");
        a f$a0 = new a(this, null);
        r.M(this.itemView, null, f$a0, 1, null);
    }

    @l
    public final View i() {
        return this.a;
    }

    @l
    public final TextView j() {
        return this.b;
    }

    private final void k() {
        b b0;
        RecyclerView recyclerView0 = this.e();
        Integer integer0 = null;
        if(recyclerView0 == null) {
            b0 = null;
        }
        else {
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(!(recyclerView$Adapter0 instanceof b)) {
                recyclerView$Adapter0 = null;
            }
            b0 = (b)recyclerView$Adapter0;
        }
        if(b0 == null) {
            return;
        }
        Integer integer1 = this.getAdapterPosition();
        if(integer1.intValue() >= 0) {
            integer0 = integer1;
        }
        if(integer0 != null) {
            b0.G(((int)integer0));
        }
    }
}

