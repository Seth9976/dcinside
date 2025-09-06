package com.dcinside.app.settings.image.list;

import Y.n0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.g;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.q;
import com.dcinside.app.settings.image.AutoImageData;
import com.dcinside.app.settings.image.auto.MyAutoImageActivity;
import com.dcinside.app.settings.image.d;
import com.dcinside.app.settings.image.e;
import com.dcinside.app.settings.image.i;
import com.dcinside.app.settings.image.setting.DefaultImageSettingActivity;
import io.realm.F0;
import io.realm.g1;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import rx.o;
import rx.subscriptions.f;
import y4.l;
import y4.m;

@s0({"SMAP\nDefaultImageListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageListActivity.kt\ncom/dcinside/app/settings/image/list/DefaultImageListActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,176:1\n257#2,2:177\n257#2,2:179\n257#2,2:190\n257#2,2:192\n177#3,9:181\n25#4:194\n*S KotlinDebug\n*F\n+ 1 DefaultImageListActivity.kt\ncom/dcinside/app/settings/image/list/DefaultImageListActivity\n*L\n63#1:177,2\n64#1:179,2\n153#1:190,2\n154#1:192,2\n143#1:181,9\n73#1:194\n*E\n"})
public final class DefaultImageListActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            context0.startActivity(new Intent(context0, DefaultImageListActivity.class));
        }
    }

    private ActivityResultLauncher A;
    @l
    public static final a B;
    private n0 w;
    @m
    private I0 x;
    @m
    private g1 y;
    private o z;

    static {
        DefaultImageListActivity.B = new a(null);
    }

    public DefaultImageListActivity() {
        this.z = f.e();
    }

    // 检测为 Lambda 实现
    private static final boolean Q1(DefaultImageListActivity defaultImageListActivity0, F0 f00, View view0, int v) [...]

    // 检测为 Lambda 实现
    private static final void R1(DefaultImageListActivity defaultImageListActivity0, ActivityResult activityResult0) [...]

    private final void S1(boolean z) {
        n0 n00 = this.w;
        n0 n01 = null;
        if(n00 == null) {
            L.S("binding");
            n00 = null;
        }
        L.o(n00.d, "defImgListSettingProgress");
        int v = 8;
        n00.d.setVisibility((z ? 0 : 8));
        n0 n02 = this.w;
        if(n02 == null) {
            L.S("binding");
        }
        else {
            n01 = n02;
        }
        RecyclerView recyclerView0 = n01.e;
        L.o(recyclerView0, "defImgListSettingRecycler");
        if(!z) {
            v = 0;
        }
        recyclerView0.setVisibility(v);
    }

    private final void T1() {
        @s0({"SMAP\nDefaultImageListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageListActivity.kt\ncom/dcinside/app/settings/image/list/DefaultImageListActivity$setAutoImages$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n25#2:177\n487#3,7:178\n774#4:185\n865#4,2:186\n1053#4:188\n*S KotlinDebug\n*F\n+ 1 DefaultImageListActivity.kt\ncom/dcinside/app/settings/image/list/DefaultImageListActivity$setAutoImages$1\n*L\n109#1:177\n120#1:178,7\n123#1:185\n123#1:186,2\n124#1:188\n*E\n"})
        static final class b extends N implements Function1 {
            final DefaultImageListActivity e;

            b(DefaultImageListActivity defaultImageListActivity0) {
                this.e = defaultImageListActivity0;
                super(1);
            }

            public final void b(e e0) {
                static final class com.dcinside.app.settings.image.list.DefaultImageListActivity.b.a extends N implements Function1 {
                    final e e;

                    com.dcinside.app.settings.image.list.DefaultImageListActivity.b.a(e e0) {
                        this.e = e0;
                        super(1);
                    }

                    @m
                    public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                        L.p(p$a0, "b");
                        return p$a0.n(((com.dcinside.app.settings.image.e.a)this.e).d().getMessage());
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.perform.p.a)object0));
                    }
                }


                static final class com.dcinside.app.settings.image.list.DefaultImageListActivity.b.b extends N implements Function1 {
                    final DefaultImageListActivity e;

                    com.dcinside.app.settings.image.list.DefaultImageListActivity.b.b(DefaultImageListActivity defaultImageListActivity0) {
                        this.e = defaultImageListActivity0;
                        super(1);
                    }

                    public final void a(Boolean boolean0) {
                        this.e.finish();
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Boolean)object0));
                        return S0.a;
                    }
                }


                @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DefaultImageListActivity.kt\ncom/dcinside/app/settings/image/list/DefaultImageListActivity$setAutoImages$1\n*L\n1#1,102:1\n124#2:103\n*E\n"})
                public static final class c implements Comparator {
                    // 去混淆评级： 低(40)
                    @Override
                    public final int compare(Object object0, Object object1) {
                        return kotlin.comparisons.a.l("", "");
                    }
                }

                this.e.S1(false);
                if(e0 instanceof com.dcinside.app.settings.image.e.b) {
                    d d0 = ((com.dcinside.app.settings.image.e.b)e0).d();
                    ArrayList arrayList0 = new ArrayList();
                    n0 n00 = this.e.w;
                    if(n00 == null) {
                        L.S("binding");
                        n00 = null;
                    }
                    L.o(n00.e, "defImgListSettingRecycler");
                    Adapter recyclerView$Adapter0 = n00.e.getAdapter();
                    if(!(recyclerView$Adapter0 instanceof com.dcinside.app.settings.image.list.f)) {
                        recyclerView$Adapter0 = null;
                    }
                    AutoImageData autoImageData0 = (AutoImageData)Map.-EL.getOrDefault(d0.f(), "X", null);
                    if(autoImageData0 == null) {
                        L.o("기본", "getString(...)");
                        arrayList0.add(new AutoImageData(null, null, false, false, false, 0, "X", "기본", 0x3F, null));
                    }
                    else {
                        arrayList0.add(autoImageData0);
                    }
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    for(Object object0: d0.f().entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        if(!L.g(((String)map$Entry0.getKey()), "X")) {
                            linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                        }
                    }
                    Iterable iterable0 = u.s2(linkedHashMap0.values());
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object1: iterable0) {
                        if(!((AutoImageData)object1).o().isEmpty() || ((AutoImageData)object1).s()) {
                            arrayList1.add(object1);
                        }
                    }
                    arrayList0.addAll(u.u5(arrayList1, new c()));
                    if(((com.dcinside.app.settings.image.list.f)recyclerView$Adapter0) != null) {
                        ((com.dcinside.app.settings.image.list.f)recyclerView$Adapter0).z(arrayList0);
                    }
                }
                else if(e0 instanceof com.dcinside.app.settings.image.e.a) {
                    com.dcinside.app.perform.e.e.a(this.e).n(new com.dcinside.app.settings.image.list.DefaultImageListActivity.b.a(e0)).z(0x7F15034A).b().x5((Object object0) -> {
                        L.p(new com.dcinside.app.settings.image.list.DefaultImageListActivity.b.b(this.e), "$tmp0");
                        new com.dcinside.app.settings.image.list.DefaultImageListActivity.b.b(this.e).invoke(object0);
                    });
                }
            }

            // 检测为 Lambda 实现
            private static final void c(Function1 function10, Object object0) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((e)object0));
                return S0.a;
            }
        }

        this.z.l();
        this.S1(true);
        this.z = i.g().M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new b(this), "$tmp0");
            new b(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.S1(false);
        });
    }

    // 检测为 Lambda 实现
    private static final void U1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void V1(DefaultImageListActivity defaultImageListActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        n0 n00 = n0.c(this.getLayoutInflater());
        L.o(n00, "inflate(...)");
        this.w = n00;
        n0 n01 = null;
        if(n00 == null) {
            L.S("binding");
            n00 = null;
        }
        this.setContentView(n00.b());
        n0 n02 = this.w;
        if(n02 == null) {
            L.S("binding");
            n02 = null;
        }
        this.S0(n02.f);
        kr.bhbfhfb.designcompat.a.d(this);
        F0 f00 = this.F1();
        if(f00 == null) {
            this.finish();
            return;
        }
        i.d();
        B b0 = B.E.V(f00);
        if(b0 == null) {
            n0 n05 = this.w;
            if(n05 == null) {
                L.S("binding");
                n05 = null;
            }
            L.o(n05.c, "defImgListProfileName");
            n05.c.setVisibility(8);
            n0 n06 = this.w;
            if(n06 == null) {
                L.S("binding");
                n06 = null;
            }
            L.o(n06.b, "defImgListProfileIcon");
            n06.b.setVisibility(8);
        }
        else {
            com.dcinside.app.main.login.g g0 = com.dcinside.app.main.login.g.a;
            n0 n03 = this.w;
            if(n03 == null) {
                L.S("binding");
                n03 = null;
            }
            TextView textView0 = n03.c;
            L.o(textView0, "defImgListProfileName");
            n0 n04 = this.w;
            if(n04 == null) {
                L.S("binding");
                n04 = null;
            }
            L.o(n04.b, "defImgListProfileIcon");
            g0.u(textView0, n04.b, b0);
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this);
        n0 n07 = this.w;
        if(n07 == null) {
            L.S("binding");
        }
        else {
            n01 = n07;
        }
        L.o(n01.e, "defImgListSettingRecycler");
        n01.e.setLayoutManager(linearLayoutManager0);
        com.dcinside.app.settings.image.list.f f0 = new com.dcinside.app.settings.image.list.f();
        n01.e.setAdapter(f0);
        com.dcinside.app.settings.image.list.a a0 = (View view0, int v) -> {
            ActivityResultLauncher activityResultLauncher1;
            L.p(this, "this$0");
            n0 n00 = this.w;
            if(n00 == null) {
                L.S("binding");
                n00 = null;
            }
            L.o(n00.e, "defImgListSettingRecycler");
            Adapter recyclerView$Adapter0 = n00.e.getAdapter();
            if(!(recyclerView$Adapter0 instanceof com.dcinside.app.settings.image.list.f)) {
                recyclerView$Adapter0 = null;
            }
            if(((com.dcinside.app.settings.image.list.f)recyclerView$Adapter0) == null) {
                return false;
            }
            Object object0 = ((com.dcinside.app.settings.image.list.f)recyclerView$Adapter0).w(v);
            if(v == 0) {
                com.dcinside.app.settings.image.auto.MyAutoImageActivity.a.b(MyAutoImageActivity.L, this, false, null, null, 12, null);
                return true;
            }
            if(object0 instanceof AutoImageData) {
                q q0 = q.o.b(f00, "");
                com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.a defaultImageSettingActivity$a0 = DefaultImageSettingActivity.Q;
                boolean z = q0 != null && q0.S5();
                ActivityResultLauncher activityResultLauncher0 = this.A;
                if(activityResultLauncher0 == null) {
                    L.S("activityResultMyImageChanged");
                    activityResultLauncher1 = null;
                }
                else {
                    activityResultLauncher1 = activityResultLauncher0;
                }
                defaultImageSettingActivity$a0.a(this, "", "", z, activityResultLauncher1);
            }
            return true;
        };
        com.dcinside.app.util.ql.b.e(n01.e, a0);
        this.T1();
        this.A = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            L.p(this, "this$0");
            L.p(activityResult0, "result");
            this.T1();
        });
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        this.z.l();
        I0 i00 = this.x;
        if(i00 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.x = null;
        if(this.y != null && this.y.s()) {
            g1 g10 = this.y;
            if(g10 != null) {
                g10.D();
            }
            this.y = null;
        }
        super.onDestroy();
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
    protected void onResume() {
        super.onResume();
        i.a.h();
    }
}

