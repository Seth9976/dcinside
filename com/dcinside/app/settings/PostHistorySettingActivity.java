package com.dcinside.app.settings;

import A3.p;
import A3.q;
import Y.y0;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.dl;
import io.realm.F0;
import io.realm.RealmQuery;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class PostHistorySettingActivity extends g {
    private y0 w;

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.settings.PostHistorySettingActivity$onCreate$1", f = "PostHistorySettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements q {
            int k;
            boolean l;

            a(d d0) {
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m d d0) {
                a postHistorySettingActivity$a0 = new a(d0);
                postHistorySettingActivity$a0.l = z;
                return postHistorySettingActivity$a0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                dl.a.Y4(this.l);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.PostHistorySettingActivity$onCreate$2", f = "PostHistorySettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final PostHistorySettingActivity l;

            b(PostHistorySettingActivity postHistorySettingActivity0, d d0) {
                this.l = postHistorySettingActivity0;
                super(3, d0);
            }

            @m
            public final Object g(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            // 检测为 Lambda 实现
            private static final Boolean h(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void i(Function1 function10, Object object0) [...]

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.g(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                static final class com.dcinside.app.settings.PostHistorySettingActivity.b.a extends N implements Function1 {
                    public static final com.dcinside.app.settings.PostHistorySettingActivity.b.a e;

                    static {
                        com.dcinside.app.settings.PostHistorySettingActivity.b.a.e = new com.dcinside.app.settings.PostHistorySettingActivity.b.a();
                    }

                    com.dcinside.app.settings.PostHistorySettingActivity.b.a() {
                        super(1);
                    }

                    @m
                    public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                        L.p(p$a0, "it");
                        return p$a0.m(0x7F150458);  // string:history_config_delete_warn "최근 본 글이 모두 삭제됩니다.\n삭제하시겠습니까?"
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.perform.p.a)object0));
                    }
                }


                static final class com.dcinside.app.settings.PostHistorySettingActivity.b.b extends N implements Function1 {
                    public static final com.dcinside.app.settings.PostHistorySettingActivity.b.b e;

                    static {
                        com.dcinside.app.settings.PostHistorySettingActivity.b.b.e = new com.dcinside.app.settings.PostHistorySettingActivity.b.b();
                    }

                    com.dcinside.app.settings.PostHistorySettingActivity.b.b() {
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


                @s0({"SMAP\nPostHistorySettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHistorySettingActivity.kt\ncom/dcinside/app/settings/PostHistorySettingActivity$onCreate$2$3\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,67:1\n112#2,3:68\n129#2,3:72\n132#2,12:76\n116#2:88\n129#2,15:89\n1#3:71\n37#4:75\n*S KotlinDebug\n*F\n+ 1 PostHistorySettingActivity.kt\ncom/dcinside/app/settings/PostHistorySettingActivity$onCreate$2$3\n*L\n48#1:68,3\n48#1:72,3\n48#1:76,12\n48#1:88\n48#1:89,15\n48#1:71\n49#1:75\n*E\n"})
                static final class c extends N implements Function1 {
                    public static final c e;

                    static {
                        c.e = new c();
                    }

                    c() {
                        super(1);
                    }

                    public final void a(Boolean boolean0) {
                        Class class0;
                        F0 f00 = F0.g4();
                        L.m(f00);
                        boolean z = f00.E0();
                        class0 = com.dcinside.app.realm.f0.class;
                        if(z) {
                            RealmQuery realmQuery0 = f00.C4(class0);
                            L.o(realmQuery0, "this.where(T::class.java)");
                            realmQuery0.p0().L0();
                        }
                        else {
                            f00.beginTransaction();
                            goto label_10;
                        }
                        goto label_24;
                        try {
                        label_10:
                            RealmQuery realmQuery1 = f00.C4(class0);
                            L.o(realmQuery1, "this.where(T::class.java)");
                            realmQuery1.p0().L0();
                            f00.p();
                            goto label_24;
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
                    label_24:
                        kotlin.io.c.a(f00, null);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Boolean)object0));
                        return S0.a;
                    }
                }

                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                e.e.a(this.l).n(com.dcinside.app.settings.PostHistorySettingActivity.b.a.e).z(0x7F15045B).x(0x1040000).b().Z1((Object object0) -> ((Boolean)com.dcinside.app.settings.PostHistorySettingActivity.b.b.e.invoke(object0))).x5((Object object0) -> c.e.invoke(object0));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        y0 y00 = y0.c(this.getLayoutInflater());
        L.o(y00, "inflate(...)");
        this.w = y00;
        if(y00 == null) {
            L.S("binding");
            y00 = null;
        }
        this.setContentView(y00.b());
        y0 y01 = this.w;
        if(y01 == null) {
            L.S("binding");
            y01 = null;
        }
        this.S0(y01.g);
        kr.bhbfhfb.designcompat.a.d(this);
        y0 y02 = this.w;
        if(y02 == null) {
            L.S("binding");
            y02 = null;
        }
        boolean z = dl.a.g1();
        y02.e.setChecked(z);
        y0 y03 = this.w;
        if(y03 == null) {
            L.S("binding");
            y03 = null;
        }
        L.o(y03.e, "settingPostHistoryEnableSwitch");
        a postHistorySettingActivity$a0 = new a(null);
        r.J(y03.e, null, postHistorySettingActivity$a0, 1, null);
        y0 y04 = this.w;
        if(y04 == null) {
            L.S("binding");
            y04 = null;
        }
        L.o(y04.b, "settingPostHistoryClear");
        b postHistorySettingActivity$b0 = new b(this, null);
        r.M(y04.b, null, postHistorySettingActivity$b0, 1, null);
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
}

