package com.dcinside.app.image.edit.crop;

import A3.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditCropHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditCropHolder.kt\ncom/dcinside/app/image/edit/crop/ImageEditCropHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,25:1\n1#2:26\n20#3:27\n25#4:28\n*S KotlinDebug\n*F\n+ 1 ImageEditCropHolder.kt\ncom/dcinside/app/image/edit/crop/ImageEditCropHolder\n*L\n21#1:27\n21#1:28\n*E\n"})
public final class e extends com.dcinside.app.base.e {
    @l
    private final TextView a;

    public e(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.image.edit.crop.ImageEditCropHolder$1", f = "ImageEditCropHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final e l;

            a(e e0, d d0) {
                this.l = e0;
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
                this.l.j();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E01E1);  // layout:view_image_edit_crop_item
        View view0 = this.itemView.findViewById(0x7F0B05B0);  // id:image_edit_menu_item_title
        L.o(view0, "findViewById(...)");
        this.a = (TextView)view0;
        L.o(this.itemView, "itemView");
        a e$a0 = new a(this, null);
        r.M(this.itemView, null, e$a0, 1, null);
    }

    @l
    public final TextView i() {
        return this.a;
    }

    private final void j() {
        Integer integer0 = this.getAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            RecyclerView recyclerView0 = this.e();
            if(recyclerView0 != null) {
                Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
                if(recyclerView$Adapter1 instanceof b) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                recyclerView$Adapter0 = (b)recyclerView$Adapter0;
            }
            if(recyclerView$Adapter0 != null) {
                ((b)recyclerView$Adapter0).y(v);
            }
        }
    }
}

