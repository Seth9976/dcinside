package com.dcinside.app.settings.block.image;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.realm.h;
import io.realm.F0;
import io.realm.g1;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public final class e extends Adapter {
    @m
    private g1 a;

    // 检测为 Lambda 实现
    private static final void A(Function1 function10, Object object0) [...]

    public void B(@l a a0, int v) {
        L.p(a0, "holder");
        ImageView imageView0 = a0.f();
        String s = null;
        h h0 = this.a == null ? null : ((h)this.a.get(v));
        if(h0 != null) {
            s = "";
        }
        com.dcinside.app.glide.a.l(imageView0).t0(s).q1(imageView0);
        a0.e().setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            Context context0 = view0.getContext();
            L.o(context0, "getContext(...)");
            this.y(context0, h0);
        });
    }

    // 检测为 Lambda 实现
    private static final void C(e e0, h h0, View view0) [...]

    @l
    public a D(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01A2, viewGroup0, false);  // layout:view_block_image_item
        L.m(view0);
        return new a(view0);
    }

    public final void E(@l g1 g10) {
        L.p(g10, "items");
        this.a = g10;
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a == null ? 0 : this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.B(((a)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.D(viewGroup0, v);
    }

    private final void y(Context context0, h h0) {
        static final class com.dcinside.app.settings.block.image.e.a extends N implements Function1 {
            public static final com.dcinside.app.settings.block.image.e.a e;

            static {
                com.dcinside.app.settings.block.image.e.a.e = new com.dcinside.app.settings.block.image.e.a();
            }

            com.dcinside.app.settings.block.image.e.a() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150B22);  // string:unblock_image_confirm "해당 이미지를 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        @s0({"SMAP\nBlockImageListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockImageListAdapter.kt\ncom/dcinside/app/settings/block/image/BlockImageListAdapter$confirmDelete$3\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n112#2,3:65\n129#2,15:69\n116#2:84\n129#2,15:85\n1#3:68\n*S KotlinDebug\n*F\n+ 1 BlockImageListAdapter.kt\ncom/dcinside/app/settings/block/image/BlockImageListAdapter$confirmDelete$3\n*L\n55#1:65,3\n55#1:69,15\n55#1:84\n55#1:85,15\n55#1:68\n*E\n"})
        static final class c extends N implements Function1 {
            final h e;

            c(h h0) {
                this.e = h0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                h h0 = this.e;
                F0 f00 = F0.g4();
                L.m(f00);
                if(f00.E0()) {
                    h0.z5();
                }
                else {
                    f00.beginTransaction();
                    goto label_7;
                }
                goto label_19;
                try {
                label_7:
                    h0.z5();
                    f00.p();
                    goto label_19;
                }
                catch(Throwable throwable1) {
                    try {
                        if(f00.E0()) {
                            f00.e();
                        }
                        throw throwable1;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable2;
                }
            label_19:
                kotlin.io.c.a(f00, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        if(h0 == null) {
            return;
        }
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(com.dcinside.app.settings.block.image.e.a.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(b.e, "$tmp0");
            return (Boolean)b.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new c(h0), "$tmp0");
            new c(h0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean z(Function1 function10, Object object0) [...]
}

