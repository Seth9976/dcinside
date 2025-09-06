package androidx.media3.exoplayer.offline;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.NotificationUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.exoplayer.scheduler.Scheduler;
import h4.m;
import java.util.HashMap;
import java.util.List;

@UnstableApi
public abstract class DownloadService extends Service {
    static final class DownloadManagerHelper implements Listener {
        private final Context a;
        private final DownloadManager b;
        private final boolean c;
        @Nullable
        private final Scheduler d;
        private final Class e;
        @Nullable
        private DownloadService f;
        private Requirements g;

        private DownloadManagerHelper(Context context0, DownloadManager downloadManager0, boolean z, @Nullable Scheduler scheduler0, Class class0) {
            this.a = context0;
            this.b = downloadManager0;
            this.c = z;
            this.d = scheduler0;
            this.e = class0;
            downloadManager0.e(this);
            this.q();
        }

        DownloadManagerHelper(Context context0, DownloadManager downloadManager0, boolean z, Scheduler scheduler0, Class class0, androidx.media3.exoplayer.offline.DownloadService.1 downloadService$10) {
            this(context0, downloadManager0, z, scheduler0, class0);
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadManager$Listener
        public void a(DownloadManager downloadManager0, boolean z) {
            if(!z && !downloadManager0.i() && this.p()) {
                List list0 = downloadManager0.g();
                for(int v = 0; v < list0.size(); ++v) {
                    if(((Download)list0.get(v)).b == 0) {
                        this.n();
                        return;
                    }
                }
            }
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadManager$Listener
        public void b(DownloadManager downloadManager0, Download download0) {
            DownloadService downloadService0 = this.f;
            if(downloadService0 != null) {
                downloadService0.A();
            }
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadManager$Listener
        public void c(DownloadManager downloadManager0, boolean z) {
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadManager$Listener
        public void d(DownloadManager downloadManager0, Requirements requirements0, int v) {
            this.q();
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadManager$Listener
        public void e(DownloadManager downloadManager0, Download download0, @Nullable Exception exception0) {
            DownloadService downloadService0 = this.f;
            if(downloadService0 != null) {
                downloadService0.z(download0);
            }
            if(this.p() && DownloadService.y(download0.b)) {
                Log.n("DownloadService", "DownloadService wasn\'t running. Restarting.");
                this.n();
            }
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadManager$Listener
        public final void f(DownloadManager downloadManager0) {
            DownloadService downloadService0 = this.f;
            if(downloadService0 != null) {
                downloadService0.C();
            }
        }

        @Override  // androidx.media3.exoplayer.offline.DownloadManager$Listener
        public void g(DownloadManager downloadManager0) {
            DownloadService downloadService0 = this.f;
            if(downloadService0 != null) {
                downloadService0.B(downloadManager0.g());
            }
        }

        public void j(DownloadService downloadService0) {
            Assertions.i(this.f == null);
            this.f = downloadService0;
            if(this.b.p()) {
                Util.J().postAtFrontOfQueue(() -> downloadService0.B(this.b.g()));
            }
        }

        @m({"scheduler"})
        private void k() {
            Requirements requirements0 = new Requirements(0);
            if(this.o(requirements0)) {
                this.d.cancel();
                this.g = requirements0;
            }
        }

        public void l(DownloadService downloadService0) {
            Assertions.i(this.f == downloadService0);
            this.f = null;
        }

        // 检测为 Lambda 实现
        private void m(DownloadService downloadService0) [...]

        private void n() {
            if(this.c) {
                try {
                    Intent intent0 = DownloadService.t(this.a, this.e, "androidx.media3.exoplayer.downloadService.action.RESTART");
                    Util.p2(this.a, intent0);
                }
                catch(IllegalStateException unused_ex) {
                    Log.n("DownloadService", "Failed to restart (foreground launch restriction)");
                }
                return;
            }
            try {
                Intent intent1 = DownloadService.t(this.a, this.e, "androidx.media3.exoplayer.downloadService.action.INIT");
                this.a.startService(intent1);
            }
            catch(IllegalStateException unused_ex) {
                Log.n("DownloadService", "Failed to restart (process is idle)");
            }
        }

        private boolean o(Requirements requirements0) {
            return !Util.g(this.g, requirements0);
        }

        private boolean p() {
            return this.f == null || this.f.x();
        }

        public boolean q() {
            boolean z = this.b.q();
            if(this.d == null) {
                return !z;
            }
            if(!z) {
                this.k();
                return true;
            }
            Requirements requirements0 = this.b.m();
            if(!this.d.b(requirements0).equals(requirements0)) {
                this.k();
                return false;
            }
            if(!this.o(requirements0)) {
                return true;
            }
            if(this.d.a(requirements0, "com.dcinside.app.android", "androidx.media3.exoplayer.downloadService.action.RESTART")) {
                this.g = requirements0;
                return true;
            }
            Log.n("DownloadService", "Failed to schedule restart");
            this.k();
            return false;
        }
    }

    final class ForegroundNotificationUpdater {
        private final int a;
        private final long b;
        private final Handler c;
        private boolean d;
        private boolean e;
        final DownloadService f;

        public ForegroundNotificationUpdater(int v, long v1) {
            this.a = v;
            this.b = v1;
            this.c = new Handler(Looper.getMainLooper());
        }

        public void b() {
            if(this.e) {
                this.f();
            }
        }

        public void c() {
            if(!this.e) {
                this.f();
            }
        }

        public void d() {
            this.d = true;
            this.f();
        }

        public void e() {
            this.d = false;
            this.c.removeCallbacksAndMessages(null);
        }

        // 检测为 Lambda 实现
        @SuppressLint({"InlinedApi"})
        private void f() [...]
    }

    private static final String A = "DownloadService";
    private static final HashMap B = null;
    @Nullable
    private final ForegroundNotificationUpdater a;
    @Nullable
    private final String b;
    @StringRes
    private final int c;
    @StringRes
    private final int d;
    private DownloadManagerHelper e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    public static final String k = "androidx.media3.exoplayer.downloadService.action.INIT";
    private static final String l = "androidx.media3.exoplayer.downloadService.action.RESTART";
    public static final String m = "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String n = "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    public static final String o = "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String p = "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String q = "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String r = "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final String s = "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String t = "download_request";
    public static final String u = "content_id";
    public static final String v = "stop_reason";
    public static final String w = "requirements";
    public static final String x = "foreground";
    public static final int y = 0;
    public static final long z = 1000L;

    static {
        DownloadService.B = new HashMap();
    }

    protected DownloadService(int v) {
        this(v, 1000L);
    }

    protected DownloadService(int v, long v1) {
        this(v, v1, null, 0, 0);
    }

    protected DownloadService(int v, long v1, @Nullable String s, @StringRes int v2, @StringRes int v3) {
        if(v == 0) {
            this.a = null;
            this.b = null;
            this.c = 0;
            this.d = 0;
            return;
        }
        this.a = new ForegroundNotificationUpdater(this, v, v1);
        this.b = s;
        this.c = v2;
        this.d = v3;
    }

    private void A() {
        ForegroundNotificationUpdater downloadService$ForegroundNotificationUpdater0 = this.a;
        if(downloadService$ForegroundNotificationUpdater0 != null) {
            downloadService$ForegroundNotificationUpdater0.b();
        }
    }

    private void B(List list0) {
        if(this.a != null) {
            for(int v = 0; v < list0.size(); ++v) {
                if(DownloadService.y(((Download)list0.get(v)).b)) {
                    this.a.d();
                    return;
                }
            }
        }
    }

    private void C() {
        ForegroundNotificationUpdater downloadService$ForegroundNotificationUpdater0 = this.a;
        if(downloadService$ForegroundNotificationUpdater0 != null) {
            downloadService$ForegroundNotificationUpdater0.e();
        }
        if(!((DownloadManagerHelper)Assertions.g(this.e)).q()) {
            return;
        }
        if(Util.a < 28 && this.h) {
            this.stopSelf();
            this.i = true;
            return;
        }
        this.i |= this.stopSelfResult(this.f);
    }

    public static void D(Context context0, Class class0, DownloadRequest downloadRequest0, int v, boolean z) {
        DownloadService.N(context0, DownloadService.i(context0, class0, downloadRequest0, v, z), z);
    }

    public static void E(Context context0, Class class0, DownloadRequest downloadRequest0, boolean z) {
        DownloadService.N(context0, DownloadService.j(context0, class0, downloadRequest0, z), z);
    }

    public static void F(Context context0, Class class0, boolean z) {
        DownloadService.N(context0, DownloadService.k(context0, class0, z), z);
    }

    public static void G(Context context0, Class class0, boolean z) {
        DownloadService.N(context0, DownloadService.l(context0, class0, z), z);
    }

    public static void H(Context context0, Class class0, String s, boolean z) {
        DownloadService.N(context0, DownloadService.m(context0, class0, s, z), z);
    }

    public static void I(Context context0, Class class0, boolean z) {
        DownloadService.N(context0, DownloadService.n(context0, class0, z), z);
    }

    public static void J(Context context0, Class class0, Requirements requirements0, boolean z) {
        DownloadService.N(context0, DownloadService.o(context0, class0, requirements0, z), z);
    }

    public static void K(Context context0, Class class0, @Nullable String s, int v, boolean z) {
        DownloadService.N(context0, DownloadService.p(context0, class0, s, v, z), z);
    }

    public static void L(Context context0, Class class0) {
        context0.startService(DownloadService.t(context0, class0, "androidx.media3.exoplayer.downloadService.action.INIT"));
    }

    public static void M(Context context0, Class class0) {
        Util.p2(context0, DownloadService.u(context0, class0, "androidx.media3.exoplayer.downloadService.action.INIT", true));
    }

    private static void N(Context context0, Intent intent0, boolean z) {
        if(z) {
            Util.p2(context0, intent0);
            return;
        }
        context0.startService(intent0);
    }

    public static Intent i(Context context0, Class class0, DownloadRequest downloadRequest0, int v, boolean z) {
        return DownloadService.u(context0, class0, "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD", z).putExtra("download_request", downloadRequest0).putExtra("stop_reason", v);
    }

    public static Intent j(Context context0, Class class0, DownloadRequest downloadRequest0, boolean z) {
        return DownloadService.i(context0, class0, downloadRequest0, 0, z);
    }

    public static Intent k(Context context0, Class class0, boolean z) {
        return DownloadService.u(context0, class0, "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS", z);
    }

    public static Intent l(Context context0, Class class0, boolean z) {
        return DownloadService.u(context0, class0, "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS", z);
    }

    public static Intent m(Context context0, Class class0, String s, boolean z) {
        return DownloadService.u(context0, class0, "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD", z).putExtra("content_id", s);
    }

    public static Intent n(Context context0, Class class0, boolean z) {
        return DownloadService.u(context0, class0, "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS", z);
    }

    public static Intent o(Context context0, Class class0, Requirements requirements0, boolean z) {
        return DownloadService.u(context0, class0, "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS", z).putExtra("requirements", requirements0);
    }

    @Override  // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent0) {
        throw new UnsupportedOperationException();
    }

    @Override  // android.app.Service
    public void onCreate() {
        String s = this.b;
        if(s != null) {
            NotificationUtil.a(this, s, this.c, this.d, 2);
        }
        boolean z = false;
        Class class0 = this.getClass();
        HashMap hashMap0 = DownloadService.B;
        DownloadManagerHelper downloadService$DownloadManagerHelper0 = (DownloadManagerHelper)hashMap0.get(class0);
        if(downloadService$DownloadManagerHelper0 == null) {
            boolean z1 = this.a != null;
            if(Util.a < 0x1F) {
                z = true;
            }
            Scheduler scheduler0 = !z1 || !z ? null : this.v();
            DownloadManager downloadManager0 = this.r();
            downloadManager0.C();
            downloadService$DownloadManagerHelper0 = new DownloadManagerHelper(this.getApplicationContext(), downloadManager0, z1, scheduler0, class0, null);
            hashMap0.put(class0, downloadService$DownloadManagerHelper0);
        }
        this.e = downloadService$DownloadManagerHelper0;
        downloadService$DownloadManagerHelper0.j(this);
    }

    @Override  // android.app.Service
    public void onDestroy() {
        this.j = true;
        ((DownloadManagerHelper)Assertions.g(this.e)).l(this);
        ForegroundNotificationUpdater downloadService$ForegroundNotificationUpdater0 = this.a;
        if(downloadService$ForegroundNotificationUpdater0 != null) {
            downloadService$ForegroundNotificationUpdater0.e();
        }
    }

    @Override  // android.app.Service
    public int onStartCommand(@Nullable Intent intent0, int v, int v1) {
        String s1;
        String s;
        this.f = v1;
        this.h = false;
        if(intent0 == null) {
            s = null;
            s1 = null;
        }
        else {
            s = intent0.getAction();
            s1 = intent0.getStringExtra("content_id");
            this.g |= intent0.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(s);
        }
        if(s == null) {
            s = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        DownloadManager downloadManager0 = ((DownloadManagerHelper)Assertions.g(this.e)).b;
        switch(s) {
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD": {
                DownloadRequest downloadRequest0 = (DownloadRequest)((Intent)Assertions.g(intent0)).getParcelableExtra("download_request");
                if(downloadRequest0 == null) {
                    Log.d("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                }
                else {
                    downloadManager0.d(downloadRequest0, intent0.getIntExtra("stop_reason", 0));
                }
                break;
            }
            case "androidx.media3.exoplayer.downloadService.action.INIT": {
                break;
            }
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS": {
                downloadManager0.x();
                break;
            }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS": {
                downloadManager0.z();
                break;
            }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD": {
                if(s1 == null) {
                    Log.d("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                }
                else {
                    downloadManager0.A(s1);
                }
                break;
            }
            case "androidx.media3.exoplayer.downloadService.action.RESTART": {
                break;
            }
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS": {
                downloadManager0.C();
                break;
            }
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS": {
                Requirements requirements0 = (Requirements)((Intent)Assertions.g(intent0)).getParcelableExtra("requirements");
                if(requirements0 == null) {
                    Log.d("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                }
                else {
                    downloadManager0.G(requirements0);
                }
                break;
            }
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON": {
                if(((Intent)Assertions.g(intent0)).hasExtra("stop_reason")) {
                    downloadManager0.H(s1, intent0.getIntExtra("stop_reason", 0));
                }
                else {
                    Log.d("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                }
                break;
            }
            default: {
                Log.d("DownloadService", "Ignored unrecognized action: " + s);
            }
        }
        if(Util.a >= 26 && this.g) {
            ForegroundNotificationUpdater downloadService$ForegroundNotificationUpdater0 = this.a;
            if(downloadService$ForegroundNotificationUpdater0 != null) {
                downloadService$ForegroundNotificationUpdater0.c();
            }
        }
        this.i = false;
        if(downloadManager0.o()) {
            this.C();
        }
        return 1;
    }

    @Override  // android.app.Service
    public void onTaskRemoved(Intent intent0) {
        this.h = true;
    }

    public static Intent p(Context context0, Class class0, @Nullable String s, int v, boolean z) {
        return DownloadService.u(context0, class0, "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON", z).putExtra("content_id", s).putExtra("stop_reason", v);
    }

    public static void q() {
        DownloadService.B.clear();
    }

    protected abstract DownloadManager r();

    protected abstract Notification s(List arg1, int arg2);

    private static Intent t(Context context0, Class class0, String s) {
        return new Intent(context0, class0).setAction(s);
    }

    private static Intent u(Context context0, Class class0, String s, boolean z) {
        return DownloadService.t(context0, class0, s).putExtra("foreground", z);
    }

    @Nullable
    protected abstract Scheduler v();

    protected final void w() {
        ForegroundNotificationUpdater downloadService$ForegroundNotificationUpdater0 = this.a;
        if(downloadService$ForegroundNotificationUpdater0 != null && !this.j) {
            downloadService$ForegroundNotificationUpdater0.b();
        }
    }

    private boolean x() {
        return this.i;
    }

    private static boolean y(int v) {
        return v == 2 || v == 5 || v == 7;
    }

    private void z(Download download0) {
        if(this.a != null) {
            if(DownloadService.y(download0.b)) {
                this.a.d();
                return;
            }
            this.a.b();
        }
    }

    class androidx.media3.exoplayer.offline.DownloadService.1 {
    }

}

