package com.dcinside.app.settings.block.dccon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.dcinside.app.base.g;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.Dl;
import io.realm.F0;
import io.realm.P0;
import io.realm.T0;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nBlockDcconChildActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockDcconChildActivity.kt\ncom/dcinside/app/settings/block/dccon/BlockDcconChildActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,127:1\n1#2:128\n129#3,15:129\n*S KotlinDebug\n*F\n+ 1 BlockDcconChildActivity.kt\ncom/dcinside/app/settings/block/dccon/BlockDcconChildActivity\n*L\n101#1:129,15\n*E\n"})
public final class BlockDcconChildActivity extends g implements P0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @m Long long0, @l String s) {
            L.p(context0, "context");
            L.p(s, "name");
            Intent intent0 = new Intent(context0, BlockDcconChildActivity.class);
            intent0.putExtra("EXTRA_DCCON_GROUP_NAME", s);
            intent0.putExtra("EXTRA_DCCON_GROUP_INDEX", long0);
            context0.startActivity(intent0);
        }
    }

    @l
    private static final String A = "EXTRA_DCCON_GROUP_INDEX";
    @l
    private static final String B = "EXTRA_DCCON_GROUP_NAME";
    private Y.l w;
    @m
    private f x;
    @m
    private com.dcinside.app.realm.f y;
    @l
    public static final a z;

    static {
        BlockDcconChildActivity.z = new a(null);
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.R1(((com.dcinside.app.realm.f)object0));
    }

    private final void O1() {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F150B1B);  // string:unblock_all_dccon "해당 디시콘 그룹 전체를 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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


        static final class d extends N implements Function1 {
            final BlockDcconChildActivity e;

            d(BlockDcconChildActivity blockDcconChildActivity0) {
                this.e = blockDcconChildActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.T1();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        e.e.a(this).n(b.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new d(this), "$tmp0");
            new d(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean P1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Q1(Function1 function10, Object object0) [...]

    public void R1(@l com.dcinside.app.realm.f f0) {
        L.p(f0, "result");
        if(f0.s() && !f0.Q5().isEmpty()) {
            f f1 = this.x;
            if(f1 != null) {
                f1.x(f0.Q5(), f0.S5());
            }
            return;
        }
        this.finish();
    }

    // 检测为 Lambda 实现
    private static final void S1(BlockDcconChildActivity blockDcconChildActivity0, View view0) [...]

    private final void T1() {
        F0 f00 = this.F1();
        if(f00 != null) {
            if(!f00.E0()) {
                goto label_9;
            }
            com.dcinside.app.realm.f f0 = this.y;
            if(f0 != null) {
                T0 t00 = f0.Q5();
                if(t00 != null) {
                    t00.L0();
                    return;
                label_9:
                    f00.beginTransaction();
                    try {
                        com.dcinside.app.realm.f f1 = this.y;
                        if(f1 != null) {
                            T0 t01 = f1.Q5();
                            if(t01 != null) {
                                t01.L0();
                            }
                        }
                        f00.p();
                        return;
                    }
                    catch(Throwable throwable0) {
                    }
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable0;
                }
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        Y.l l0 = Y.l.c(this.getLayoutInflater());
        L.o(l0, "inflate(...)");
        this.w = l0;
        Y.l l1 = null;
        if(l0 == null) {
            L.S("binding");
            l0 = null;
        }
        this.setContentView(l0.b());
        Y.l l2 = this.w;
        if(l2 == null) {
            L.S("binding");
            l2 = null;
        }
        this.S0(l2.c);
        kr.bhbfhfb.designcompat.a.d(this);
        long v = this.getIntent().getLongExtra("EXTRA_DCCON_GROUP_INDEX", 0L);
        F0 f00 = this.F1();
        if(f00 == null) {
            Dl.D(this, 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            this.finish();
            return;
        }
        this.setTitle(this.getIntent().getStringExtra("EXTRA_DCCON_GROUP_NAME"));
        com.dcinside.app.realm.f f0 = (com.dcinside.app.realm.f)f00.C4(com.dcinside.app.realm.f.class).g0("groupIndex", v).s0();
        this.y = f0;
        if(f0 != null) {
            f0.r5(this);
        }
        this.x = new f();
        Y.l l3 = this.w;
        if(l3 == null) {
            L.S("binding");
        }
        else {
            l1 = l3;
        }
        l1.b.setAdapter(this.x);
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(l1.b.getContext(), 4);
        l1.b.setLayoutManager(gridLayoutManager0);
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@m Menu menu0) {
        this.getMenuInflater().inflate(0x7F100015, menu0);  // mipmap:ic_launcher24
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        com.dcinside.app.realm.f f0 = this.y;
        if(f0 != null) {
            if(!f0.s()) {
                f0 = null;
            }
            if(f0 != null) {
                f0.K5();
            }
        }
        this.y = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // com.dcinside.app.base.d
    public boolean onPrepareOptionsMenu(@m Menu menu0) {
        View view0 = null;
        MenuItem menuItem0 = menu0 == null ? null : menu0.findItem(0x7F0B006F);  // id:action_remove_dccon
        if(menuItem0 != null) {
            View view1 = menuItem0.getActionView();
            if(view1 != null) {
                view0 = view1.findViewById(0x7F0B082D);  // id:menu_remove_all
            }
            if(view0 != null) {
                view0.setOnClickListener((View view0) -> {
                    L.p(this, "this$0");
                    this.O1();
                });
            }
        }
        return super.onPrepareOptionsMenu(menu0);
    }
}

