package com.dcinside.app.backup.process;

import A3.s;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.content.ContextCompat;
import androidx.work.ListenableWorker.Result;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.dcinside.app.main.HomeActivity;
import com.dcinside.app.model.X;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.Zk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.google.common.util.concurrent.t0;
import g0.f.c;
import g0.f;
import io.realm.F0;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

public final class AutoBackupWorker extends ListenableWorker {
    @l
    private final Context a;

    public AutoBackupWorker(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "context");
        L.p(workerParameters0, "workerParams");
        super(context0, workerParameters0);
        this.a = context0;
    }

    @l
    public final Context h() {
        return this.a;
    }

    private final void i(String s) {
        L.o("내부 저장소에 자동 백업 파일이 저장되었습니다.", "getString(...)");
        Intent intent0 = new Intent(this.a, HomeActivity.class);
        intent0.setAction("autoBackupNotificationAction");
        PendingIntent pendingIntent0 = PendingIntent.getActivity(this.a, 0x3FB, intent0, Zk.d.c());
        Builder notificationCompat$Builder0 = new Builder(this.a, "com.dcinside.app_channel_6").I(ContextCompat.getColor(this.a, 0x7F0603FE)).t0(0x7F0802F1).B0("내부 저장소에 자동 백업 파일이 저장되었습니다.").O("내부 저장소에 자동 백업 파일이 저장되었습니다.").N(s).C(true).M(pendingIntent0);  // color:primary0
        Object object0 = this.a.getSystemService("notification");
        NotificationManager notificationManager0 = object0 instanceof NotificationManager ? ((NotificationManager)object0) : null;
        if(notificationManager0 != null) {
            notificationManager0.notify(0x3FB, notificationCompat$Builder0.h());
        }
        long v = TimeUnit.DAYS.toMillis(7L);
        dl.a.t3(System.currentTimeMillis() + v);
    }

    private final void j(Completer callbackToFutureAdapter$Completer0) {
        static final class a extends N implements s {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(6);
            }

            public final V.l a(X x0, c f$c0, c f$c1, c f$c2, f f0, c f$c3) {
                return new V.l(x0.a(), f.c.b(f0.a()), f.c.a(f$c0.a()), f.c.c(f$c1.a()), f.c.c(f$c2.a()), f.c.d(f$c3.a()));
            }

            @Override  // A3.s
            public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
                return this.a(((X)object0), ((c)object1), ((c)object2), ((c)object3), ((f)object4), ((c)object5));
            }
        }


        static final class b extends N implements Function1 {
            final AutoBackupWorker e;
            final Completer f;

            b(AutoBackupWorker autoBackupWorker0, Completer callbackToFutureAdapter$Completer0) {
                this.e = autoBackupWorker0;
                this.f = callbackToFutureAdapter$Completer0;
                super(1);
            }

            public final void a(V.l l0) {
                @s0({"SMAP\nAutoBackupWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoBackupWorker.kt\ncom/dcinside/app/backup/process/AutoBackupWorker$onRequestPushConfig$2$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n120#2,3:105\n124#2:109\n1#3:108\n*S KotlinDebug\n*F\n+ 1 AutoBackupWorker.kt\ncom/dcinside/app/backup/process/AutoBackupWorker$onRequestPushConfig$2$1\n*L\n70#1:105,3\n70#1:109\n70#1:108\n*E\n"})
                static final class com.dcinside.app.backup.process.AutoBackupWorker.b.a extends N implements A3.a {
                    final V.l e;

                    com.dcinside.app.backup.process.AutoBackupWorker.b.a(V.l l0) {
                        this.e = l0;
                        super(0);
                    }

                    @l
                    public final V.s b() {
                        V.s s0;
                        F0 f00 = F0.g4();
                        try {
                            L.m(f00);
                            s0 = g.a.b(f00, this.e);
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

                File file0;
                try {
                    file0 = Gk.d();
                }
                catch(Exception unused_ex) {
                    file0 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                }
                L.o("dcbackup_auto.txt", "getString(...)");
                L.m(file0);
                com.dcinside.app.backup.process.AutoBackupWorker.b.a autoBackupWorker$b$a0 = new com.dcinside.app.backup.process.AutoBackupWorker.b.a(l0);
                g.a.j(file0, "dcbackup_auto.txt", true, autoBackupWorker$b$a0);
                this.e.i("dcbackup_auto.txt");
                Result listenableWorker$Result0 = Result.e();
                this.f.c(listenableWorker$Result0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V.l)object0));
                return S0.a;
            }
        }

        rx.g.q0(uk.Hk(), uk.xk("", g0.b.c), uk.Kk(), uk.Jk(), uk.Ik(""), uk.Mk(null), (Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) -> {
            L.p(a.e, "$tmp0");
            return (V.l)a.e.invoke(object0, object1, object2, object3, object4, object5);
        }).y5((Object object0) -> {
            L.p(new b(this, callbackToFutureAdapter$Completer0), "$tmp0");
            new b(this, callbackToFutureAdapter$Completer0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(callbackToFutureAdapter$Completer0, "$completer");
            callbackToFutureAdapter$Completer0.c(Result.d());
        });
    }

    // 检测为 Lambda 实现
    private static final V.l k(s s0, Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) [...]

    // 检测为 Lambda 实现
    private static final void l(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void m(Completer callbackToFutureAdapter$Completer0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final Object n(AutoBackupWorker autoBackupWorker0, Completer callbackToFutureAdapter$Completer0) [...]

    @Override  // androidx.work.ListenableWorker
    @l
    public t0 startWork() {
        t0 t00 = CallbackToFutureAdapter.a((Completer callbackToFutureAdapter$Completer0) -> {
            L.p(this, "this$0");
            L.p(callbackToFutureAdapter$Completer0, "completer");
            if(dl.a.G() && dl.a.H() <= System.currentTimeMillis()) {
                this.j(callbackToFutureAdapter$Completer0);
                return S0.a;
            }
            return Boolean.valueOf(callbackToFutureAdapter$Completer0.c(Result.e()));
        });
        L.o(t00, "getFuture(...)");
        return t00;
    }
}

