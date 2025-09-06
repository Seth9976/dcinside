package com.dcinside.app.settings.launchericon;

import A3.p;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
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

public final class c extends e {
    @l
    private final ImageView a;
    @l
    private final View b;
    @l
    private final View c;

    public c(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.settings.launchericon.LauncherIconSettingHolder$1", f = "LauncherIconSettingHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nLauncherIconSettingHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherIconSettingHolder.kt\ncom/dcinside/app/settings/launchericon/LauncherIconSettingHolder$1\n+ 2 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,27:1\n20#2:28\n25#3:29\n*S KotlinDebug\n*F\n+ 1 LauncherIconSettingHolder.kt\ncom/dcinside/app/settings/launchericon/LauncherIconSettingHolder$1\n*L\n20#1:28\n20#1:29\n*E\n"})
        static final class a extends o implements p {
            int k;
            final c l;

            a(c c0, d d0) {
                this.l = c0;
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
                b b0;
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                RecyclerView recyclerView0 = this.l.e();
                Bitmap bitmap0 = null;
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
                    return S0.a;
                }
                b0.E(this.l.getBindingAdapterPosition());
                Drawable drawable0 = this.l.i().getDrawable();
                BitmapDrawable bitmapDrawable0 = drawable0 instanceof BitmapDrawable ? ((BitmapDrawable)drawable0) : null;
                if(bitmapDrawable0 != null) {
                    bitmap0 = bitmapDrawable0.getBitmap();
                }
                b0.D(bitmap0);
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E01FF);  // layout:view_launcher_icon_setting_item
        View view0 = this.itemView.findViewById(0x7F0B0E86);  // id:setting_launcher_icon_item_ic
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.itemView.findViewById(0x7F0B0E85);  // id:setting_launcher_icon_item_chk
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = this.itemView.findViewById(0x7F0B0E87);  // id:setting_launcher_icon_item_small_chk
        L.o(view2, "findViewById(...)");
        this.c = view2;
        L.o(this.itemView, "itemView");
        a c$a0 = new a(this, null);
        r.M(this.itemView, null, c$a0, 1, null);
    }

    @l
    public final View h() {
        return this.b;
    }

    @l
    public final ImageView i() {
        return this.a;
    }

    @l
    public final View j() {
        return this.c;
    }
}

