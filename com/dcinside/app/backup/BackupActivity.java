package com.dcinside.app.backup;

import V.b;
import V.i;
import V.s;
import V.z;
import W.c;
import Y.j;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.Application;
import com.dcinside.app.base.d;
import com.dcinside.app.model.X;
import com.dcinside.app.model.f0;
import com.dcinside.app.perform.e;
import com.dcinside.app.realm.e0;
import com.dcinside.app.realm.z0;
import com.dcinside.app.type.H;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Fk;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import g0.f;
import io.realm.F0;
import j..time.LocalDateTime;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nBackupActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,580:1\n1#2:581\n177#3,9:582\n257#4,2:591\n*S KotlinDebug\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity\n*L\n181#1:582,9\n434#1:591,2\n*E\n"})
public final class BackupActivity extends d implements PermissionListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            context0.startActivity(new Intent(context0, BackupActivity.class));
        }
    }

    private File A;
    private j B;
    @l
    public static final a C;
    private int u;
    @m
    private I0 v;
    @m
    private o w;
    @m
    private o x;
    @m
    private ActivityResultLauncher y;
    @m
    private s z;

    static {
        BackupActivity.C = new a(null);
    }

    static void A2(BackupActivity backupActivity0, boolean z, s s0, boolean z1, String s1, int v, Object object0) {
        if((v & 8) != 0) {
            s1 = "";
        }
        backupActivity0.z2(z, s0, z1, s1);
    }

    private final void B2(boolean z, s s0, boolean z1) {
        static final class n extends N implements Function1 {
            final V.l e;
            final BackupActivity f;
            final boolean g;
            final s h;
            final boolean i;

            n(V.l l0, BackupActivity backupActivity0, boolean z, s s0, boolean z1) {
                this.e = l0;
                this.f = backupActivity0;
                this.g = z;
                this.h = s0;
                this.i = z1;
                super(1);
            }

            public final void a(f0 f00) {
                String s = "";
                if(L.g(f00.d(), "true")) {
                    b[] arr_b = this.e.a();
                    if(arr_b != null && ((arr_b.length == 0 ? 1 : 0) ^ 1) == 1) {
                        e0.i.i(arr_b);
                    }
                    V.o[] arr_o = this.e.f();
                    if(arr_o != null && arr_o.length != 0) {
                        z0.i.h(arr_o);
                    }
                }
                else {
                    String s1 = f00.a();
                    if(s1 != null) {
                        s = s1;
                    }
                }
                this.f.z2(this.g, this.h, this.i, s);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.backup.BackupActivity.o extends N implements Function1 {
            final Throwable e;

            com.dcinside.app.backup.BackupActivity.o(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class p extends N implements Function1 {
            final BackupActivity e;
            final boolean f;
            final s g;
            final boolean h;

            p(BackupActivity backupActivity0, boolean z, s s0, boolean z1) {
                this.e = backupActivity0;
                this.f = z;
                this.g = s0;
                this.h = z1;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    this.e.B2(this.f, this.g, this.h);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        V.l l0 = s0.i();
        if((l0 == null ? null : l0.b()) != null && z1) {
            this.x = uk.yG(z.g.a(l0)).R1(() -> {
                L.p(this, "this$0");
                this.M2(true);
            }).T1(() -> {
                L.p(this, "this$0");
                this.M2(false);
            }).y5((Object object0) -> {
                L.p(new n(l0, this, z, s0, true), "$tmp0");
                new n(l0, this, z, s0, true).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                L.p(s0, "$restoreData");
                e.e.a(this).n(new com.dcinside.app.backup.BackupActivity.o(throwable0)).z(0x7F1508D7).x(0x104000A).b().x5((Object object0) -> {
                    L.p(new p(backupActivity0, z, s0, z1), "$tmp0");
                    new p(backupActivity0, z, s0, z1).invoke(object0);
                });
            });
            return;
        }
        BackupActivity.A2(this, z, s0, z1, null, 8, null);
    }

    // 检测为 Lambda 实现
    private static final void C2(BackupActivity backupActivity0) [...]

    // 检测为 Lambda 实现
    private static final void D2(BackupActivity backupActivity0) [...]

    // 检测为 Lambda 实现
    private static final void E2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F2(BackupActivity backupActivity0, boolean z, s s0, boolean z1, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void G2(Function1 function10, Object object0) [...]

    private final g H2(int v, boolean z) {
        static final class q extends N implements Function1 {
            final int e;

            q(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class r extends N implements Function1 {
            final BackupActivity e;
            final boolean f;

            r(BackupActivity backupActivity0, boolean z) {
                this.e = backupActivity0;
                this.f = z;
                super(1);
            }

            public final g a(Integer integer0) {
                L.m(integer0);
                return this.e.K2(((int)integer0), this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class com.dcinside.app.backup.BackupActivity.s extends N implements Function1 {
            public static final com.dcinside.app.backup.BackupActivity.s e;

            static {
                com.dcinside.app.backup.BackupActivity.s.e = new com.dcinside.app.backup.BackupActivity.s();
            }

            com.dcinside.app.backup.BackupActivity.s() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1508D0);  // string:restore_error_unknown_file "해당 파일은 복원할 수 없는 파일입니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class t extends N implements Function1 {
            public static final t e;

            static {
                t.e = new t();
            }

            t() {
                super(1);
            }

            public final g a(Boolean boolean0) {
                return g.X1(new c("Data is empty"));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }

        g g0;
        if(v >= 0) {
            g0 = e.e.a(this).n(new q((z ? 0x7F1508CC : 0x7F1508CA))).z(0x7F15034A).x(0x1040000).y(0x7F15013A).d().f2((Object object0) -> {
                L.p(new r(this, z), "$tmp0");
                return (g)new r(this, z).invoke(object0);
            });
            L.m(g0);
            return g0;
        }
        g0 = e.e.a(this).n(com.dcinside.app.backup.BackupActivity.s.e).x(0x104000A).b().f2((Object object0) -> {
            L.p(t.e, "$tmp0");
            return (g)t.e.invoke(object0);
        });
        L.m(g0);
        return g0;
    }

    // 检测为 Lambda 实现
    private static final g I2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g J2(Function1 function10, Object object0) [...]

    private final g K2(int v, boolean z) {
        static final class u extends N implements Function1 {
            public static final u e;

            static {
                u.e = new u();
            }

            u() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F1508CB);  // string:restore_confirm_msg_with_backup "현재 시간 기준으로 전체 설정을 수동 백업 후 복원을 진행합니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class v extends N implements Function1 {
            final boolean e;

            v(boolean z) {
                this.e = z;
                super(1);
            }

            public final g a(Boolean boolean0) {
                L.m(boolean0);
                return boolean0.booleanValue() ? g.Q2(r0.a(Boolean.TRUE, Boolean.valueOf(this.e))) : g.X1(new W.a("Restore cancelled"));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }

        g g0;
        switch(v) {
            case -3: {
                g0 = e.e.a(this).n(u.e).z(0x7F15013A).x(0x1040000).b().f2((Object object0) -> {
                    L.p(new v(z), "$tmp0");
                    return (g)new v(z).invoke(object0);
                });
                L.m(g0);
                return g0;
            }
            case -1: {
                g0 = g.Q2(r0.a(Boolean.FALSE, Boolean.valueOf(z)));
                L.m(g0);
                return g0;
            }
            default: {
                g0 = g.X1(new W.a("Restore cancelled"));
                L.m(g0);
                return g0;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final g L2(Function1 function10, Object object0) [...]

    private final void M2(boolean z) {
        j j0 = this.B;
        if(j0 == null) {
            L.S("binding");
            j0 = null;
        }
        L.o(j0.h, "backupProgress");
        j0.h.setVisibility((z ? 0 : 8));
    }

    @RequiresApi(26)
    private final String k2(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        Cursor cursor0 = this.getContentResolver().query(uri0, new String[]{"_display_name", "_size"}, null, null, null);
        if(cursor0 == null) {
            return null;
        }
        int v = cursor0.getColumnIndex("_display_name");
        int v1 = cursor0.getColumnIndex("_size");
        cursor0.moveToFirst();
        String s = cursor0.getString(v);
        L.o(s, "getString(...)");
        cursor0.getLong(v1);
        File file0 = new File(this.getCacheDir() + "/restoreFiles");
        if(file0.exists()) {
            kotlin.io.m.Y(file0);
        }
        if(!file0.exists() && !file0.mkdirs()) {
            return null;
        }
        File file1 = new File(file0, s);
        try {
            InputStream inputStream0 = this.getContentResolver().openInputStream(uri0);
            if(inputStream0 == null) {
                return null;
            }
            FileOutputStream fileOutputStream0 = new FileOutputStream(file1);
            byte[] arr_b = new byte[0x400];
            int v2;
            while((v2 = inputStream0.read(arr_b)) != -1) {
                fileOutputStream0.write(arr_b, 0, v2);
            }
            inputStream0.close();
            fileOutputStream0.close();
            cursor0.close();
            return file1.getPath();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private final String l2() {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        L.o(localDateTime0, "now(...)");
        String s = this.getString(0x7F15013D, new Object[]{Bk.a.d(localDateTime0)});  // string:backup_file_name "dcbackup_all_%1$s.txt"
        L.o(s, "getString(...)");
        return s;
    }

    private final g m2() {
        static final class com.dcinside.app.backup.BackupActivity.b extends N implements A3.s {
            public static final com.dcinside.app.backup.BackupActivity.b e;

            static {
                com.dcinside.app.backup.BackupActivity.b.e = new com.dcinside.app.backup.BackupActivity.b();
            }

            com.dcinside.app.backup.BackupActivity.b() {
                super(6);
            }

            public final V.l a(X x0, g0.f.c f$c0, g0.f.c f$c1, g0.f.c f$c2, f f0, g0.f.c f$c3) {
                V.m m0 = x0.a();
                Map map0 = f0.a();
                i[] arr_i = f.c.b(map0);
                List list0 = f$c0.a();
                b[] arr_b = f.c.a(list0);
                List list1 = f$c1.a();
                V.o[] arr_o = f.c.c(list1);
                List list2 = f$c2.a();
                V.o[] arr_o1 = f.c.c(list2);
                List list3 = f$c3.a();
                return new V.l(m0, arr_i, arr_b, arr_o, arr_o1, f.c.d(list3));
            }

            @Override  // A3.s
            public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
                return this.a(((X)object0), ((g0.f.c)object1), ((g0.f.c)object2), ((g0.f.c)object3), ((f)object4), ((g0.f.c)object5));
            }
        }

        g g0 = g.q0(uk.Hk(), uk.xk("", g0.b.c), uk.Kk(), uk.Jk(), uk.Ik(""), uk.Mk(null), (Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) -> {
            L.p(com.dcinside.app.backup.BackupActivity.b.e, "$tmp0");
            return (V.l)com.dcinside.app.backup.BackupActivity.b.e.invoke(object0, object1, object2, object3, object4, object5);
        });
        L.o(g0, "combineLatest(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final V.l n2(A3.s s0, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) [...]

    private final void o2() {
        static final class com.dcinside.app.backup.BackupActivity.c extends N implements Function1 {
            public static final com.dcinside.app.backup.BackupActivity.c e;

            static {
                com.dcinside.app.backup.BackupActivity.c.e = new com.dcinside.app.backup.BackupActivity.c();
            }

            com.dcinside.app.backup.BackupActivity.c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.J(0x7F1500D2);  // string:archive_backup_choose "전체 설정 백업"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.backup.BackupActivity.d extends N implements Function1 {
            final BackupActivity e;

            com.dcinside.app.backup.BackupActivity.d(BackupActivity backupActivity0) {
                this.e = backupActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                if(((int)integer0) >= 0) {
                    this.e.u2(((int)integer0));
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        if(this.v != null && this.v.isActive()) {
            return;
        }
        if(cl.i(this, this)) {
            this.u = 107;
            return;
        }
        com.dcinside.app.perform.e.a.w(e.e.a(this).n(com.dcinside.app.backup.BackupActivity.c.e), new String[]{"내부 저장소에 백업", "다른 앱으로 보내기"}, 0, 2, null).x(0x1040000).d().y5((Object object0) -> {
            L.p(new com.dcinside.app.backup.BackupActivity.d(this), "$tmp0");
            new com.dcinside.app.backup.BackupActivity.d(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.m(throwable0);
            this.t2(throwable0);
        });
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onCreate$1", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.backup.BackupActivity.f extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final BackupActivity l;

            com.dcinside.app.backup.BackupActivity.f(BackupActivity backupActivity0, kotlin.coroutines.d d0) {
                this.l = backupActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.backup.BackupActivity.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                this.l.o2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onCreate$2", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.backup.BackupActivity.g extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final BackupActivity l;

            com.dcinside.app.backup.BackupActivity.g(BackupActivity backupActivity0, kotlin.coroutines.d d0) {
                this.l = backupActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.backup.BackupActivity.g(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                this.l.x2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onCreate$3", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nBackupActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,580:1\n1#2:581\n*E\n"})
        static final class h extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final BackupActivity l;

            h(BackupActivity backupActivity0, kotlin.coroutines.d d0) {
                this.l = backupActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                j j0 = this.l.B;
                if(j0 == null) {
                    L.S("binding");
                    j0 = null;
                }
                boolean z = j0.c.isChecked();
                j0.c.setChecked(!z);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onCreate$4", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.backup.BackupActivity.i extends kotlin.coroutines.jvm.internal.o implements A3.q {
            int k;
            boolean l;

            com.dcinside.app.backup.BackupActivity.i(kotlin.coroutines.d d0) {
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.backup.BackupActivity.i backupActivity$i0 = new com.dcinside.app.backup.BackupActivity.i(d0);
                backupActivity$i0.l = z;
                return backupActivity$i0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                dl.a.s3(this.l);
                long v = TimeUnit.DAYS.toMillis(1L);
                dl.a.t3(System.currentTimeMillis() + v);
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        try {
            File file0 = Gk.d();
            L.o(file0, "getDefaultFolder(...)");
            this.A = file0;
        }
        catch(Exception unused_ex) {
            Dl.D(this, 0x7F1502F3);  // string:fail_create_folder "저장 경로를 생성할 수 없습니다."
            this.finish();
            return;
        }
        j j0 = j.c(this.getLayoutInflater());
        L.o(j0, "inflate(...)");
        this.B = j0;
        if(j0 == null) {
            L.S("binding");
            j0 = null;
        }
        this.setContentView(j0.b());
        j j1 = this.B;
        if(j1 == null) {
            L.S("binding");
            j1 = null;
        }
        this.S0(j1.k);
        kr.bhbfhfb.designcompat.a.d(this);
        File file1 = this.A;
        if(file1 == null) {
            L.S("backupDir");
            file1 = null;
        }
        String s = Fk.i(file1.getPath());
        j j2 = this.B;
        if(j2 == null) {
            L.S("binding");
            j2 = null;
        }
        int v = Build.VERSION.SDK_INT;
        String s1 = v < 29 ? this.getString(0x7F15013F, new Object[]{s}) : this.getString(0x7F15013F, new Object[]{"/내장 메모리/Download/dcinside"});  // string:backup_location_msg "내부 저장소에 백업된 데이터는 \'%1$s\' 폴더 내 \'dcbackup_all_날짜_시간.txt\' 
                                                                                                                                                   // 파일로 저장됩니다."
        j2.g.setText(s1);
        j j3 = this.B;
        if(j3 == null) {
            L.S("binding");
            j3 = null;
        }
        L.o(j3.e, "backupBackup");
        com.dcinside.app.backup.BackupActivity.f backupActivity$f0 = new com.dcinside.app.backup.BackupActivity.f(this, null);
        com.dcinside.app.internal.r.M(j3.e, null, backupActivity$f0, 1, null);
        j j4 = this.B;
        if(j4 == null) {
            L.S("binding");
            j4 = null;
        }
        L.o(j4.i, "backupRestore");
        com.dcinside.app.backup.BackupActivity.g backupActivity$g0 = new com.dcinside.app.backup.BackupActivity.g(this, null);
        com.dcinside.app.internal.r.M(j4.i, null, backupActivity$g0, 1, null);
        j j5 = this.B;
        if(j5 == null) {
            L.S("binding");
            j5 = null;
        }
        L.o(j5.d, "backupAutoTitle");
        h backupActivity$h0 = new h(this, null);
        com.dcinside.app.internal.r.M(j5.d, null, backupActivity$h0, 1, null);
        j j6 = this.B;
        if(j6 == null) {
            L.S("binding");
            j6 = null;
        }
        boolean z = dl.a.G();
        j6.c.setChecked(z);
        j j7 = this.B;
        if(j7 == null) {
            L.S("binding");
            j7 = null;
        }
        L.o(j7.c, "backupAutoSwitch");
        com.dcinside.app.backup.BackupActivity.i backupActivity$i0 = new com.dcinside.app.backup.BackupActivity.i(null);
        com.dcinside.app.internal.r.J(j7.c, null, backupActivity$i0, 1, null);
        if(v >= 29) {
            this.y = this.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
                L.p(this, "this$0");
                L.p(activityResult0, "result");
                if(activityResult0.c() == -1) {
                    Intent intent0 = activityResult0.a();
                    String s = this.k2((intent0 == null ? null : intent0.getData()));
                    if(s == null) {
                        s = "";
                    }
                    this.y2(s);
                }
            });
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        this.z = null;
        try {
            I0 i00 = this.v;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.v = null;
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
        this.x = null;
        o o1 = this.w;
        if(o1 != null) {
            o1.l();
        }
        this.w = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        String s = permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName();
        Dl.D(Application.e.c(), cl.b(s));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        String s = permissionGrantedResponse0 == null ? null : permissionGrantedResponse0.getPermissionName();
        Dl.D(Application.e.c(), cl.c(s));
        switch(this.u) {
            case 107: {
                this.o2();
                return;
            }
            case 108: {
                this.x2();
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    // 检测为 Lambda 实现
    private static final void p2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void q2(BackupActivity backupActivity0, Throwable throwable0) [...]

    private final void r2(int v, V.l l0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onBackupProcess$1", f = "BackupActivity.kt", i = {}, l = {0x10B, 0x110}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.backup.BackupActivity.e extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final BackupActivity l;
            final V.l m;
            final int n;

            com.dcinside.app.backup.BackupActivity.e(BackupActivity backupActivity0, V.l l0, int v, kotlin.coroutines.d d0) {
                this.l = backupActivity0;
                this.m = l0;
                this.n = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.backup.BackupActivity.e(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.backup.BackupActivity.e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onBackupProcess$1$1", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.backup.BackupActivity.e.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final int l;
                    final BackupActivity m;
                    final String n;
                    final Uri o;

                    com.dcinside.app.backup.BackupActivity.e.a(int v, BackupActivity backupActivity0, String s, Uri uri0, kotlin.coroutines.d d0) {
                        this.l = v;
                        this.m = backupActivity0;
                        this.n = s;
                        this.o = uri0;
                        super(2, d0);
                    }

                    public static void a(View view0) {
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.backup.BackupActivity.e.a(this.l, this.m, this.n, this.o, d0);
                    }

                    private static final void f(View view0) {
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.backup.BackupActivity.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        if(this.l == 0) {
                            String s = this.m.getString(0x7F150143, new Object[]{this.n});  // string:backup_success "백업 파일이 생성되었습니다.\n\'%1$s\'"
                            L.o(s, "getString(...)");
                            j j0 = this.m.B;
                            if(j0 == null) {
                                L.S("binding");
                                j0 = null;
                            }
                            Snackbar snackbar0 = Snackbar.E0(j0.b, s, -2).G0(0x7F1501F2, new com.dcinside.app.backup.o());  // string:close "닫기"
                            L.o(snackbar0, "setAction(...)");
                            try {
                                TextView textView0 = (TextView)snackbar0.M().findViewById(0x7F0B0F20);  // id:snackbar_text
                                if(textView0 != null) {
                                    textView0.setMaxLines(2);
                                }
                            }
                            catch(Exception unused_ex) {
                            }
                            snackbar0.m0();
                        }
                        else {
                            L.o("다른 앱으로 보내기", "getString(...)");
                            Intent intent0 = new Intent("android.intent.action.SEND");
                            intent0.setFlags(1);
                            intent0.putExtra("android.intent.extra.STREAM", this.o);
                            intent0.setType("text/plain");
                            Intent intent1 = Intent.createChooser(intent0, "다른 앱으로 보내기");
                            this.m.startActivity(intent1);
                        }
                        this.m.M2(false);
                        return S0.a;
                    }
                }


                @s0({"SMAP\nBackupActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onBackupProcess$1$uri$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,580:1\n120#2,3:581\n124#2:585\n1#3:584\n*S KotlinDebug\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onBackupProcess$1$uri$1\n*L\n264#1:581,3\n264#1:585\n264#1:584\n*E\n"})
                static final class com.dcinside.app.backup.BackupActivity.e.b extends N implements A3.a {
                    final V.l e;

                    com.dcinside.app.backup.BackupActivity.e.b(V.l l0) {
                        this.e = l0;
                        super(0);
                    }

                    @l
                    public final s b() {
                        s s0;
                        F0 f00 = F0.g4();
                        try {
                            L.m(f00);
                            s0 = com.dcinside.app.backup.process.g.a.b(f00, this.e);
                        }
                        catch(Throwable throwable0) {
                            kotlin.io.c.a(f00, throwable0);
                            throw throwable0;
                        }
                        kotlin.io.c.a(f00, null);
                        return s0;
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.b();
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onBackupProcess$1$uri$2", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.backup.BackupActivity.e.c extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final BackupActivity l;
                    final Exception m;

                    com.dcinside.app.backup.BackupActivity.e.c(BackupActivity backupActivity0, Exception exception0, kotlin.coroutines.d d0) {
                        this.l = backupActivity0;
                        this.m = exception0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.backup.BackupActivity.e.c(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.backup.BackupActivity.e.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        this.l.t2(this.m);
                        return S0.a;
                    }
                }

                Uri uri0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        kotlin.f0.n(object0);
                        String s = this.l.l2();
                        try {
                            com.dcinside.app.backup.process.g g0 = com.dcinside.app.backup.process.g.a;
                            File file0 = this.l.A;
                            if(file0 == null) {
                                L.S("backupDir");
                                file0 = null;
                            }
                            uri0 = g0.j(file0, s, false, new com.dcinside.app.backup.BackupActivity.e.b(this.m));
                        }
                        catch(Exception exception0) {
                            com.dcinside.app.backup.BackupActivity.e.c backupActivity$e$c0 = new com.dcinside.app.backup.BackupActivity.e.c(this.l, exception0, null);
                            this.k = 1;
                            return kotlinx.coroutines.i.h(h0.e(), backupActivity$e$c0, this) == object1 ? object1 : S0.a;
                        }
                        com.dcinside.app.backup.BackupActivity.e.a backupActivity$e$a0 = new com.dcinside.app.backup.BackupActivity.e.a(this.n, this.l, s, uri0, null);
                        this.k = 2;
                        return kotlinx.coroutines.i.h(h0.e(), backupActivity$e$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        kotlin.f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        kotlin.f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        this.v = k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.backup.BackupActivity.e(this, l0, v, null), 2, null);
    }

    // 检测为 Lambda 实现
    private static final void s2(BackupActivity backupActivity0, ActivityResult activityResult0) [...]

    private final void t2(Throwable throwable0) {
        timber.log.b.a.y(throwable0);
        int v = 0x7F1508D0;  // string:restore_error_unknown_file "해당 파일은 복원할 수 없는 파일입니다."
        try {
            throw throwable0;
        }
        catch(a0.b unused_ex) {
            return;
        }
        catch(FileNotFoundException unused_ex) {
            v = 0x7F1508D2;  // string:restore_error_unsupported "지원하지 않는 버전입니다. 파일을 다시 확인하시거나 앱을 업데이트해주세요."
        }
        catch(W.a unused_ex) {
            v = 0x7F1508CF;  // string:restore_error_read_failed "데이터를 읽을 수 없습니다."
        }
        catch(W.e unused_ex) {
            v = 0x7F1508CE;  // string:restore_error_make_failed "데이터를 생성할 수 없습니다."
        }
        catch(W.d unused_ex) {
            v = 0x7F1508CD;  // string:restore_error_empty "복원할 데이터가 없습니다."
        }
        catch(W.b unused_ex) {
            v = 0x7F1508D1;  // string:restore_error_unknown_status "백업/복원 진행 중 오류가 발생하여 취소되었습니다."
        }
        catch(c | Exception unused_ex) {
        }
        Dl.D(this, v);
        this.M2(false);
    }

    private final void u2(int v) {
        static final class com.dcinside.app.backup.BackupActivity.j extends N implements Function1 {
            final BackupActivity e;
            final int f;

            com.dcinside.app.backup.BackupActivity.j(BackupActivity backupActivity0, int v) {
                this.e = backupActivity0;
                this.f = v;
                super(1);
            }

            public final void a(V.l l0) {
                this.e.r2(this.f, l0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V.l)object0));
                return S0.a;
            }
        }

        this.M2(true);
        this.w = this.m2().y5((Object object0) -> {
            L.p(new com.dcinside.app.backup.BackupActivity.j(this, v), "$tmp0");
            new com.dcinside.app.backup.BackupActivity.j(this, v).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.r2(v, null);
        });
    }

    // 检测为 Lambda 实现
    private static final void v2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w2(BackupActivity backupActivity0, int v, Throwable throwable0) [...]

    private final void x2() {
        static final class com.dcinside.app.backup.BackupActivity.k extends N implements Function1 {
            final BackupActivity e;

            com.dcinside.app.backup.BackupActivity.k(BackupActivity backupActivity0) {
                this.e = backupActivity0;
                super(1);
            }

            public final void a(@l String[] arr_s) {
                L.p(arr_s, "files");
                if(!this.e.s1() && arr_s.length != 0) {
                    String s = (String)kotlin.collections.l.Ah(arr_s);
                    this.e.y2(s);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((String[])object0));
                return S0.a;
            }
        }

        if(this.v != null && this.v.isActive()) {
            return;
        }
        if(cl.i(this, this)) {
            this.u = 108;
            return;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent0.addCategory("android.intent.category.OPENABLE");
            intent0.setType("text/*");
            ActivityResultLauncher activityResultLauncher0 = this.y;
            if(activityResultLauncher0 != null) {
                activityResultLauncher0.b(intent0);
            }
        }
        else {
            e0.c c0 = new e0.c();
            c0.a = 0;
            c0.h(new File("/"));
            c0.e(new File("/"));
            File file0 = this.A;
            if(file0 == null) {
                L.S("backupDir");
                file0 = null;
            }
            c0.g(file0);
            c0.f(new String[]{"txt"});
            com.dcinside.app.pick.file.view.b b0 = new com.dcinside.app.pick.file.view.b(this, c0);
            b0.C(new com.dcinside.app.backup.BackupActivity.k(this));
            b0.show();
        }
    }

    private final void y2(String s) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onRestoreFilePicked$1", f = "BackupActivity.kt", i = {}, l = {337, 343, 350}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.backup.BackupActivity.l extends kotlin.coroutines.jvm.internal.o implements A3.o {
            Object k;
            int l;
            final BackupActivity m;
            final String n;

            com.dcinside.app.backup.BackupActivity.l(BackupActivity backupActivity0, String s, kotlin.coroutines.d d0) {
                this.m = backupActivity0;
                this.n = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.backup.BackupActivity.l(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.backup.BackupActivity.l)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onRestoreFilePicked$1$1", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.backup.BackupActivity.l.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final BackupActivity l;

                    com.dcinside.app.backup.BackupActivity.l.a(BackupActivity backupActivity0, kotlin.coroutines.d d0) {
                        this.l = backupActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.backup.BackupActivity.l.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.backup.BackupActivity.l.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        this.l.M2(true);
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onRestoreFilePicked$1$2", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.backup.BackupActivity.l.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final BackupActivity l;
                    final Exception m;

                    com.dcinside.app.backup.BackupActivity.l.b(BackupActivity backupActivity0, Exception exception0, kotlin.coroutines.d d0) {
                        this.l = backupActivity0;
                        this.m = exception0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.backup.BackupActivity.l.b(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.backup.BackupActivity.l.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        this.l.t2(this.m);
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onRestoreFilePicked$1$3", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nBackupActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onRestoreFilePicked$1$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,580:1\n11102#2:581\n11437#2,3:582\n37#3,2:585\n*S KotlinDebug\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onRestoreFilePicked$1$3\n*L\n353#1:581\n353#1:582,3\n354#1:585,2\n*E\n"})
                static final class com.dcinside.app.backup.BackupActivity.l.c extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final BackupActivity l;
                    final int m;
                    final boolean n;

                    com.dcinside.app.backup.BackupActivity.l.c(BackupActivity backupActivity0, int v, boolean z, kotlin.coroutines.d d0) {
                        this.l = backupActivity0;
                        this.m = v;
                        this.n = z;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.backup.BackupActivity.l.c(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.backup.BackupActivity.l.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        static final class com.dcinside.app.backup.BackupActivity.l.c.a extends N implements Function1 {
                            public static final com.dcinside.app.backup.BackupActivity.l.c.a e;

                            static {
                                com.dcinside.app.backup.BackupActivity.l.c.a.e = new com.dcinside.app.backup.BackupActivity.l.c.a();
                            }

                            com.dcinside.app.backup.BackupActivity.l.c.a() {
                                super(1);
                            }

                            @m
                            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                                L.p(p$a0, "it");
                                return p$a0.J(0x7F150933);  // string:select_restore_type "복원 방식을 선택해주세요."
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                return this.a(((com.dcinside.app.perform.p.a)object0));
                            }
                        }


                        static final class com.dcinside.app.backup.BackupActivity.l.c.b extends N implements Function1 {
                            public static final com.dcinside.app.backup.BackupActivity.l.c.b e;

                            static {
                                com.dcinside.app.backup.BackupActivity.l.c.b.e = new com.dcinside.app.backup.BackupActivity.l.c.b();
                            }

                            com.dcinside.app.backup.BackupActivity.l.c.b() {
                                super(1);
                            }

                            public final Boolean a(Integer integer0) {
                                L.m(integer0);
                                return ((int)integer0) < 0 ? false : true;
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                return this.a(((Integer)object0));
                            }
                        }


                        static final class com.dcinside.app.backup.BackupActivity.l.c.c extends N implements Function1 {
                            final BackupActivity e;
                            final int f;

                            com.dcinside.app.backup.BackupActivity.l.c.c(BackupActivity backupActivity0, int v) {
                                this.e = backupActivity0;
                                this.f = v;
                                super(1);
                            }

                            public final g a(Integer integer0) {
                                return integer0 == null || ((int)integer0) != 0 ? this.e.H2(this.f, false) : this.e.H2(this.f, true);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                return this.a(((Integer)object0));
                            }
                        }


                        static final class com.dcinside.app.backup.BackupActivity.l.c.d extends N implements Function1 {
                            final BackupActivity e;
                            final boolean f;

                            com.dcinside.app.backup.BackupActivity.l.c.d(BackupActivity backupActivity0, boolean z) {
                                this.e = backupActivity0;
                                this.f = z;
                                super(1);
                            }

                            public final void a(V v0) {
                                boolean z = ((Boolean)v0.a()).booleanValue();
                                boolean z1 = ((Boolean)v0.b()).booleanValue();
                                s s0 = this.e.z;
                                if(s0 == null) {
                                    return;
                                }
                                if(this.f) {
                                    this.e.B2(z, s0, z1);
                                    return;
                                }
                                BackupActivity.A2(this.e, z, s0, z1, null, 8, null);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((V)object0));
                                return S0.a;
                            }
                        }

                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        this.l.M2(false);
                        H[] arr_h = H.values();
                        BackupActivity backupActivity0 = this.l;
                        ArrayList arrayList0 = new ArrayList(arr_h.length);
                        for(int v = 0; v < arr_h.length; ++v) {
                            arrayList0.add(arr_h[v].c(backupActivity0));
                        }
                        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
                        com.dcinside.app.perform.e.a.w(e.e.a(this.l).n(com.dcinside.app.backup.BackupActivity.l.c.a.e), arr_s, 0, 2, null).d().Z1((Object object0) -> ((Boolean)com.dcinside.app.backup.BackupActivity.l.c.b.e.invoke(object0))).f2((Object object0) -> ((g)new com.dcinside.app.backup.BackupActivity.l.c.c(this.l, this.m).invoke(object0))).z5((Object object0) -> new com.dcinside.app.backup.BackupActivity.l.c.d(this.l, this.n).invoke(object0), (Throwable throwable0) -> {
                            L.m(throwable0);
                            this.l.t2(throwable0);
                        }, () -> this.l.z = null);
                        return S0.a;
                    }

                    // 检测为 Lambda 实现
                    private static final Boolean j(Function1 function10, Object object0) [...]

                    // 检测为 Lambda 实现
                    private static final g l(Function1 function10, Object object0) [...]

                    // 检测为 Lambda 实现
                    private static final void m(Function1 function10, Object object0) [...]

                    // 检测为 Lambda 实现
                    private static final void n(BackupActivity backupActivity0, Throwable throwable0) [...]

                    // 检测为 Lambda 实现
                    private static final void o(BackupActivity backupActivity0) [...]
                }

                s s0;
                BackupActivity backupActivity1;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                boolean z = true;
                switch(this.l) {
                    case 0: {
                        kotlin.f0.n(object0);
                        com.dcinside.app.backup.BackupActivity.l.a backupActivity$l$a0 = new com.dcinside.app.backup.BackupActivity.l.a(this.m, null);
                        this.l = 1;
                        if(kotlinx.coroutines.i.h(h0.e(), backupActivity$l$a0, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        kotlin.f0.n(object0);
                        break;
                    }
                    case 2: {
                        BackupActivity backupActivity0 = (BackupActivity)this.k;
                        kotlin.f0.n(object0);
                        return S0.a;
                    }
                    case 3: {
                        kotlin.f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                try {
                    backupActivity1 = this.m;
                    s0 = com.dcinside.app.backup.process.g.a.d(this.n);
                }
                catch(Exception exception0) {
                    com.dcinside.app.backup.BackupActivity.l.b backupActivity$l$b0 = new com.dcinside.app.backup.BackupActivity.l.b(this.m, exception0, null);
                    this.k = backupActivity1;
                    this.l = 2;
                    return kotlinx.coroutines.i.h(h0.e(), backupActivity$l$b0, this) == object1 ? object1 : S0.a;
                }
                backupActivity1.z = s0;
                s s1 = this.m.z;
                int v = s1 == null ? 0 : s1.b();
                s s2 = this.m.z;
                if((s2 == null ? null : s2.i()) == null) {
                    z = false;
                }
                com.dcinside.app.backup.BackupActivity.l.c backupActivity$l$c0 = new com.dcinside.app.backup.BackupActivity.l.c(this.m, v, z, null);
                this.l = 3;
                return kotlinx.coroutines.i.h(h0.e(), backupActivity$l$c0, this) == object1 ? object1 : S0.a;
            }
        }

        this.z = null;
        this.v = k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.backup.BackupActivity.l(this, s, null), 2, null);
    }

    private final void z2(boolean z, s s0, boolean z1, String s1) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onRestoreProcess$1", f = "BackupActivity.kt", i = {}, l = {486, 0x201, 0x209}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.backup.BackupActivity.m extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final boolean l;
            final BackupActivity m;
            final s n;
            final boolean o;
            final String p;

            com.dcinside.app.backup.BackupActivity.m(boolean z, BackupActivity backupActivity0, s s0, boolean z1, String s1, kotlin.coroutines.d d0) {
                this.l = z;
                this.m = backupActivity0;
                this.n = s0;
                this.o = z1;
                this.p = s1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.backup.BackupActivity.m(this.l, this.m, this.n, this.o, this.p, d0);
            }

            // 检测为 Lambda 实现
            private static final void g(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void h(BackupActivity backupActivity0, s s0, boolean z, Throwable throwable0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.backup.BackupActivity.m)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onRestoreProcess$1$1", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.backup.BackupActivity.m.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final BackupActivity l;

                    com.dcinside.app.backup.BackupActivity.m.a(BackupActivity backupActivity0, kotlin.coroutines.d d0) {
                        this.l = backupActivity0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.backup.BackupActivity.m.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.backup.BackupActivity.m.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        this.l.M2(true);
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.backup.BackupActivity.m.b extends N implements Function1 {
                    final BackupActivity e;
                    final s f;
                    final boolean g;

                    com.dcinside.app.backup.BackupActivity.m.b(BackupActivity backupActivity0, s s0, boolean z) {
                        this.e = backupActivity0;
                        this.f = s0;
                        this.g = z;
                        super(1);
                    }

                    public final void a(V.l l0) {
                        @s0({"SMAP\nBackupActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onRestoreProcess$1$2$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,580:1\n120#2,3:581\n124#2:585\n1#3:584\n*S KotlinDebug\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onRestoreProcess$1$2$1\n*L\n493#1:581,3\n493#1:585\n493#1:584\n*E\n"})
                        static final class com.dcinside.app.backup.BackupActivity.m.b.a extends N implements A3.a {
                            final V.l e;

                            com.dcinside.app.backup.BackupActivity.m.b.a(V.l l0) {
                                this.e = l0;
                                super(0);
                            }

                            @l
                            public final s b() {
                                s s0;
                                F0 f00 = F0.g4();
                                try {
                                    L.m(f00);
                                    s0 = com.dcinside.app.backup.process.g.a.b(f00, this.e);
                                }
                                catch(Throwable throwable0) {
                                    kotlin.io.c.a(f00, throwable0);
                                    throw throwable0;
                                }
                                kotlin.io.c.a(f00, null);
                                return s0;
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return this.b();
                            }
                        }

                        com.dcinside.app.backup.process.g g0 = com.dcinside.app.backup.process.g.a;
                        File file0 = this.e.A;
                        if(file0 == null) {
                            L.S("backupDir");
                            file0 = null;
                        }
                        g0.j(file0, this.e.l2(), false, new com.dcinside.app.backup.BackupActivity.m.b.a(l0));
                        BackupActivity.A2(this.e, false, this.f, this.g, null, 8, null);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((V.l)object0));
                        return S0.a;
                    }
                }


                @s0({"SMAP\nBackupActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onRestoreProcess$1$3$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,580:1\n120#2,3:581\n124#2:585\n1#3:584\n*S KotlinDebug\n*F\n+ 1 BackupActivity.kt\ncom/dcinside/app/backup/BackupActivity$onRestoreProcess$1$3$1\n*L\n498#1:581,3\n498#1:585\n498#1:584\n*E\n"})
                static final class com.dcinside.app.backup.BackupActivity.m.c extends N implements A3.a {
                    public static final com.dcinside.app.backup.BackupActivity.m.c e;

                    static {
                        com.dcinside.app.backup.BackupActivity.m.c.e = new com.dcinside.app.backup.BackupActivity.m.c();
                    }

                    com.dcinside.app.backup.BackupActivity.m.c() {
                        super(0);
                    }

                    @l
                    public final s b() {
                        s s0;
                        F0 f00 = F0.g4();
                        try {
                            L.m(f00);
                            s0 = com.dcinside.app.backup.process.g.c(com.dcinside.app.backup.process.g.a, f00, null, 2, null);
                        }
                        catch(Throwable throwable0) {
                            kotlin.io.c.a(f00, throwable0);
                            throw throwable0;
                        }
                        kotlin.io.c.a(f00, null);
                        return s0;
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.b();
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onRestoreProcess$1$4", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.backup.BackupActivity.m.d extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final BackupActivity l;
                    final String m;

                    com.dcinside.app.backup.BackupActivity.m.d(BackupActivity backupActivity0, String s, kotlin.coroutines.d d0) {
                        this.l = backupActivity0;
                        this.m = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.backup.BackupActivity.m.d(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.backup.BackupActivity.m.d)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        this.l.M2(false);
                        Dl.G(this.l, this.m);
                        ActivityCompat.c(this.l);
                        Xk.h(this.l, null, null, 6, null);
                        return S0.a;
                    }
                }


                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.backup.BackupActivity$onRestoreProcess$1$5", f = "BackupActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.backup.BackupActivity.m.e extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final BackupActivity l;
                    final Exception m;

                    com.dcinside.app.backup.BackupActivity.m.e(BackupActivity backupActivity0, Exception exception0, kotlin.coroutines.d d0) {
                        this.l = backupActivity0;
                        this.m = exception0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.backup.BackupActivity.m.e(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.backup.BackupActivity.m.e)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        kotlin.f0.n(object0);
                        this.l.t2(this.m);
                        return S0.a;
                    }
                }

                String s;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                try {
                    switch(this.k) {
                        case 0: {
                            goto label_7;
                        }
                        case 1: {
                            goto label_12;
                        }
                        case 2: {
                            goto label_3;
                        }
                        case 3: {
                            goto label_5;
                        }
                    }
                }
                catch(Exception exception0) {
                    goto label_34;
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                try {
                label_3:
                    kotlin.f0.n(object0);
                    return S0.a;
                }
                catch(Exception exception0) {
                    goto label_34;
                }
            label_5:
                kotlin.f0.n(object0);
                return S0.a;
            label_7:
                kotlin.f0.n(object0);
                try {
                    com.dcinside.app.backup.BackupActivity.m.a backupActivity$m$a0 = new com.dcinside.app.backup.BackupActivity.m.a(this.m, null);
                    this.k = 1;
                    if(kotlinx.coroutines.i.h(h0.e(), backupActivity$m$a0, this) == object1) {
                        return object1;
                    label_12:
                        kotlin.f0.n(object0);
                    }
                    if(this.l) {
                        o o0 = this.m.m2().y5((Object object0) -> new com.dcinside.app.backup.BackupActivity.m.b(this.m, this.n, this.o).invoke(object0), (Throwable throwable0) -> {
                            com.dcinside.app.backup.process.g g0 = com.dcinside.app.backup.process.g.a;
                            File file0 = this.m.A;
                            if(file0 == null) {
                                L.S("backupDir");
                                file0 = null;
                            }
                            g0.j(file0, this.m.l2(), false, com.dcinside.app.backup.BackupActivity.m.c.e);
                            BackupActivity.A2(this.m, false, this.n, this.o, null, 8, null);
                        });
                        this.m.w = o0;
                        return S0.a;
                    }
                    com.dcinside.app.backup.process.g.a.f(this.n, this.o);
                    if(this.p.length() > 0) {
                        s = this.p;
                    }
                    else if(!this.n.s() || this.n.a() <= 0) {
                        if(!this.n.t() || this.n.b() <= 0) {
                            return S0.a;
                        }
                        s = "전체 설정이 복원되었습니다.";
                        L.m("전체 설정이 복원되었습니다.");
                    }
                    else {
                        s = "보관함이 복원되었습니다.";
                        L.m("보관함이 복원되었습니다.");
                    }
                    com.dcinside.app.backup.BackupActivity.m.d backupActivity$m$d0 = new com.dcinside.app.backup.BackupActivity.m.d(this.m, s, null);
                    this.k = 2;
                    return kotlinx.coroutines.i.h(h0.e(), backupActivity$m$d0, this) == object1 ? object1 : S0.a;
                }
                catch(Exception exception0) {
                }
            label_34:
                com.dcinside.app.backup.BackupActivity.m.e backupActivity$m$e0 = new com.dcinside.app.backup.BackupActivity.m.e(this.m, exception0, null);
                this.k = 3;
                return kotlinx.coroutines.i.h(h0.e(), backupActivity$m$e0, this) == object1 ? object1 : S0.a;
            }
        }

        this.v = k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.backup.BackupActivity.m(z, this, s0, z1, s1, null), 2, null);
    }
}

