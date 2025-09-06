package com.dcinside.app.image;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.work.Data.Builder;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker.Result;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.dcinside.app.Application;
import com.dcinside.app.main.HomeActivity;
import com.dcinside.app.realm.z;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Fk;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.Vk;
import com.dcinside.app.util.Zk;
import com.dcinside.app.util.vk;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import kotlin.V;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import timber.log.b;
import y4.l;
import y4.m;

@s0({"SMAP\nImageDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDownloadWorker.kt\ncom/dcinside/app/image/ImageDownloadWorker\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n120#2,3:250\n124#2:254\n1#3:253\n*S KotlinDebug\n*F\n+ 1 ImageDownloadWorker.kt\ncom/dcinside/app/image/ImageDownloadWorker\n*L\n39#1:250,3\n39#1:254\n39#1:253\n*E\n"})
public final class ImageDownloadWorker extends Worker {
    @s0({"SMAP\nImageDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDownloadWorker.kt\ncom/dcinside/app/image/ImageDownloadWorker$Companion\n+ 2 Data.kt\nandroidx/work/DataKt\n+ 3 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,249:1\n31#2,5:250\n105#3:255\n*S KotlinDebug\n*F\n+ 1 ImageDownloadWorker.kt\ncom/dcinside/app/image/ImageDownloadWorker$Companion\n*L\n240#1:250,5\n241#1:255\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@m String s) {
            new V[]{r0.a("download_fail_data", s)};
            V v0 = r0.a("download_fail_data", s);
            Builder data$Builder0 = new Builder();
            data$Builder0.b(((String)v0.e()), v0.f());
            Data data0 = data$Builder0.a();
            OneTimeWorkRequest oneTimeWorkRequest0 = (OneTimeWorkRequest)((androidx.work.OneTimeWorkRequest.Builder)new androidx.work.OneTimeWorkRequest.Builder(ImageDownloadWorker.class).w(data0)).b();
            Context context0 = Application.e.c();
            WorkManager.a.b(context0).m("image_download_worker", ExistingWorkPolicy.c, oneTimeWorkRequest0);
        }

        public static void b(a imageDownloadWorker$a0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = null;
            }
            imageDownloadWorker$a0.a(s);
        }
    }

    @l
    public static final a a = null;
    @l
    public static final String b = "download_fail_data";
    @l
    private static final String c = "image_download_worker";

    static {
        ImageDownloadWorker.a = new a(null);
    }

    public ImageDownloadWorker(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "context");
        L.p(workerParameters0, "params");
        super(context0, workerParameters0);
    }

    @Override  // androidx.work.Worker
    @l
    public Result doWork() {
        Exception exception2;
        String s4;
        String s3;
        String s2;
        String s1;
        z z0;
        Class class0;
        Context context0;
        String s = this.getInputData().q("download_fail_data");
        F0 f00 = F0.g4();
        L.m(f00);
        context0 = this.getApplicationContext();
        L.o(context0, "getApplicationContext(...)");
        class0 = z.class;
        if(s == null) {
            goto label_7;
        }
        else {
            goto label_10;
        }
        goto label_12;
        try {
            try {
            label_7:
                RealmQuery realmQuery0 = f00.C4(class0).f0("state", 1).d2().f0("state", 2);
                L.m(realmQuery0);
                goto label_12;
            label_10:
                realmQuery0 = f00.C4(class0).i0("name", s);
                L.m(realmQuery0);
            label_12:
                if(realmQuery0.N() > 0L) {
                    g1 g10 = realmQuery0.f2("time").p0();
                    L.m(g10);
                    Iterator iterator0 = g10.iterator();
                    while(true) {
                    label_16:
                        if(!iterator0.hasNext()) {
                            goto label_52;
                        }
                        Object object0 = iterator0.next();
                        z0 = (z)object0;
                        s1 = z0.T5();
                        s2 = z0.W5();
                        s3 = z0.Z5();
                        s4 = z0.Y5();
                        if(s4 == null || s1 == null) {
                            this.l(context0, context0.getString(0x7F150296, new Object[]{s2}), s1);  // string:download_error "다운로드 실패 : %1$s"
                            f00.Y3((F0 f00) -> {
                                L.p(z0, "$info");
                                z0.e6(0);
                            });
                            continue;
                        }
                        goto label_27;
                    }
                }
                else {
                    goto label_54;
                }
                goto label_55;
            }
            catch(Exception exception0) {
                b.a.y(exception0);
                goto label_52;
            }
            try {
            label_27:
                this.m(s1);
                f00.Y3((F0 f00) -> {
                    L.p(z0, "$info");
                    z0.e6(2);
                });
                Uri uri0 = Uri.parse(s3);
                L.o(uri0, "parse(...)");
                com.dcinside.app.image.j.a j$a0 = j.a.k(context0, uri0, s4, s1);
                String s5 = j$a0.a();
                String s6 = context0.getString(0x7F1502A0, new Object[]{s2});  // string:download_success "다운로드 : %1$s"
                L.o(s6, "getString(...)");
                if(!z0.s()) {
                    this.k();
                    goto label_52;
                }
                f00.Y3((F0 f00) -> {
                    L.p(z0, "$info");
                    L.p(s5, "$resultName");
                    z0.c6(s5);
                    z0.e6(0);
                });
                this.n(s6, j$a0.b());
                goto label_16;
            }
            catch(Exception exception1) {
            }
            exception2 = exception1;
            try {
                this.o(exception2, f00, z0, s2, s1);
                goto label_16;
            }
            catch(Exception exception0) {
            }
            b.a.y(exception0);
            goto label_52;
        }
        catch(Throwable throwable1) {
        }
        try {
            Vk.a.b(context0, 202);
            throw throwable1;
        label_52:
            com.dcinside.app.util.Vk.a vk$a0 = Vk.a;
            goto label_55;
        label_54:
            vk$a0 = Vk.a;
        label_55:
            vk$a0.b(context0, 202);
            goto label_62;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable2) {
            c.a(f00, throwable0);
            throw throwable2;
        }
    label_62:
        c.a(f00, null);
        Result listenableWorker$Result0 = Result.e();
        L.o(listenableWorker$Result0, "success(...)");
        return listenableWorker$Result0;
    }

    // 检测为 Lambda 实现
    private static final void g(z z0, F0 f00) [...]

    // 检测为 Lambda 实现
    private static final void h(z z0, F0 f00) [...]

    // 检测为 Lambda 实现
    private static final void i(z z0, String s, F0 f00) [...]

    private final PendingIntent j(Uri uri0, String s) {
        Intent intent0;
        try {
            if(s == null) {
                intent0 = null;
            }
            else if(s.length() != 0) {
                intent0 = Dl.l(s);
            }
            else {
                intent0 = null;
            }
            if(intent0 == null) {
                intent0 = Dl.k(uri0);
            }
            return intent0 == null ? null : PendingIntent.getActivity(this.getApplicationContext(), 0, intent0, Zk.e.c());
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    private final void k() {
        L.o(this.getApplicationContext(), "getApplicationContext(...)");
        L.o("다운로드가 취소되었습니다.", "getString(...)");
        L.o("다운로드 목록을 확인해주세요.", "getString(...)");
        androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0 = new androidx.core.app.NotificationCompat.Builder(this.getApplicationContext(), "com.dcinside.app_channel_7").O("다운로드가 취소되었습니다.").N("다운로드 목록을 확인해주세요.").B0("다운로드가 취소되었습니다.").z0(new BigTextStyle().A("다운로드 목록을 확인해주세요."));
        Context context0 = this.getApplicationContext();
        L.o(context0, "getApplicationContext(...)");
        androidx.core.app.NotificationCompat.Builder notificationCompat$Builder1 = notificationCompat$Builder0.I(vk.b(context0, 0x7F040158)).t0(0x7F0802F1).C(true);  // attr:colorPrimary
        Context context1 = this.getApplicationContext();
        L.o(context1, "getApplicationContext(...)");
        Notification notification0 = notificationCompat$Builder1.h();
        L.o(notification0, "build(...)");
        Vk.a.e(context1, 200, notification0);
    }

    private final void l(Context context0, String s, String s1) {
        Intent intent0 = new Intent(context0, HomeActivity.class).setAction("com.dcinside.app.action.RETRY_DOWNLOAD").putExtra("download_fail_data", s1);
        L.o(intent0, "putExtra(...)");
        PendingIntent pendingIntent0 = PendingIntent.getActivity(context0, 203, intent0, 0x14000000);
        Intent intent1 = new Intent(context0, ImageDownloadReceiver.class).setAction("com.dcinside.app.action.RETRY_DOWNLOAD").putExtra("download_fail_data", s1);
        L.o(intent1, "putExtra(...)");
        PendingIntent pendingIntent1 = PendingIntent.getBroadcast(context0, 204, intent1, 0x14000000);
        L.o("다시 시도하려면 터치하세요.", "getString(...)");
        androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0 = new androidx.core.app.NotificationCompat.Builder(context0, "com.dcinside.app_channel_7").O(s).N("다시 시도하려면 터치하세요.").B0(s).z0(new BigTextStyle().A("다시 시도하려면 터치하세요.")).I(vk.b(context0, 0x7F040158)).t0(0x7F0802F1).C(true).M(pendingIntent0).a(0x7F080543, "다시 시도", pendingIntent1);  // attr:colorPrimary
        Context context1 = this.getApplicationContext();
        L.o(context1, "getApplicationContext(...)");
        Notification notification0 = notificationCompat$Builder0.h();
        L.o(notification0, "build(...)");
        Vk.a.e(context1, 200, notification0);
    }

    private final void m(String s) {
        Context context0 = this.getApplicationContext();
        L.o(context0, "getApplicationContext(...)");
        String s1 = m0.a.a.i(s) ? "다운로드 준비" : context0.getString(0x7F15029B, new Object[]{s});  // string:download_progressed "다운로드 중 : %s"
        L.m(s1);
        androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0 = new androidx.core.app.NotificationCompat.Builder(this.getApplicationContext(), "com.dcinside.app_channel_7");
        androidx.core.app.NotificationCompat.Builder notificationCompat$Builder1 = notificationCompat$Builder0.O(s1);
        Context context1 = this.getApplicationContext();
        L.o(context1, "getApplicationContext(...)");
        notificationCompat$Builder1.I(vk.b(context1, 0x7F040158)).t0(0x7F0802F1).l0(0, 100, true);  // attr:colorPrimary
        Context context2 = this.getApplicationContext();
        L.o(context2, "getApplicationContext(...)");
        Notification notification0 = notificationCompat$Builder0.h();
        L.o(notification0, "build(...)");
        Vk.a.e(context2, 202, notification0);
    }

    private final void n(String s, Uri uri0) {
        String s1 = Gk.r(uri0);
        com.dcinside.app.scan.a.a.a(s1);
        String s2 = Fk.i((m0.a.a.i(s1) ? uri0.toString() : s1));
        androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0 = new androidx.core.app.NotificationCompat.Builder(this.getApplicationContext(), "com.dcinside.app_channel_7");
        androidx.core.app.NotificationCompat.Builder notificationCompat$Builder1 = notificationCompat$Builder0.O(s).N(s2).B0(s2).z0(new BigTextStyle().A(s2));
        Context context0 = this.getApplicationContext();
        L.o(context0, "getApplicationContext(...)");
        notificationCompat$Builder1.I(vk.b(context0, 0x7F040158)).t0(0x7F0802F1).C(true).M(this.j(uri0, s1));  // attr:colorPrimary
        Context context1 = this.getApplicationContext();
        L.o(context1, "getApplicationContext(...)");
        Notification notification0 = notificationCompat$Builder0.h();
        L.o(notification0, "build(...)");
        Vk.a.e(context1, 200, notification0);
    }

    private final void o(Throwable throwable0, F0 f00, z z0, String s, String s1) {
        Context context0 = this.getApplicationContext();
        L.o(context0, "getApplicationContext(...)");
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null) {
            throwable0 = throwable1;
        }
        if(throwable0 instanceof SocketTimeoutException) {
            this.l(context0, "서버에 연결할 수 없습니다.", s1);
            return;
        }
        String s2 = throwable0.getMessage();
        if(s2 == null) {
            this.l(context0, context0.getString(0x7F150296, new Object[]{s}), s1);  // string:download_error "다운로드 실패 : %1$s"
            return;
        }
        if(v.v2(s2, "Object is no longer valid to operate on.", false, 2, null)) {
            this.k();
            return;
        }
        try {
            if(z0.s()) {
                f00.Y3((F0 f00) -> {
                    L.p(z0, "$info");
                    z0.e6(3);
                });
            }
        }
        catch(Exception unused_ex) {
        }
        if(!v.v2(s2, "Unable to resolve host", false, 2, null) && !v.v2(s2, "failed to connect to", false, 2, null) && !v.v2(s2, "Failed to connect to", false, 2, null) && !v.v2(s2, "unexpected end of stream", false, 2, null) && !v.v2(s2, "Unexpected status line", false, 2, null) && !v.v2(s2, "stream was reset", false, 2, null) && !v.v2(s2, "recvfrom failed", false, 2, null) && !v.v2(s2, "timeout", false, 2, null) && !v.v2(s2, "Software caused connection abort", false, 2, null) && !v.v2(s2, "Connection timed out", false, 2, null) && !v.v2(s2, "SSL handshake", false, 2, null) && !v.v2(s2, "Connection reset", false, 2, null)) {
            if(v.v2(s2, "Failed to create file", false, 2, null)) {
                this.l(context0, "파일 생성을 실패했습니다.", s1);
                return;
            }
            if(v.v2(s2, "Permission denied", false, 2, null)) {
                this.l(context0, "권한이 거부되었습니다.", s1);
                return;
            }
            if(v.W2(s2, "No space", false, 2, null)) {
                this.l(context0, "다운로드 실패 : 저장소에 공간이 부족합니다.", s1);
                return;
            }
            this.l(context0, context0.getString(0x7F150296, new Object[]{s}), s1);  // string:download_error "다운로드 실패 : %1$s"
            return;
        }
        this.l(context0, "서버에 연결할 수 없습니다.", s1);
    }

    // 检测为 Lambda 实现
    private static final void p(z z0, F0 f00) [...]
}

