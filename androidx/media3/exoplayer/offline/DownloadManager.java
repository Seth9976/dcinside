package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.datasource.DataSource.Factory;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

@UnstableApi
public final class DownloadManager {
    static final class DownloadUpdate {
        public final Download a;
        public final boolean b;
        public final List c;
        @Nullable
        public final Exception d;

        public DownloadUpdate(Download download0, boolean z, List list0, @Nullable Exception exception0) {
            this.a = download0;
            this.b = z;
            this.c = list0;
            this.d = exception0;
        }
    }

    static final class InternalHandler extends Handler {
        public boolean a;
        private final HandlerThread b;
        private final WritableDownloadIndex c;
        private final DownloaderFactory d;
        private final Handler e;
        private final ArrayList f;
        private final HashMap g;
        private int h;
        private boolean i;
        private int j;
        private int k;
        private int l;
        private boolean m;
        private static final int n = 5000;

        public InternalHandler(HandlerThread handlerThread0, WritableDownloadIndex writableDownloadIndex0, DownloaderFactory downloaderFactory0, Handler handler0, int v, int v1, boolean z) {
            super(handlerThread0.getLooper());
            this.b = handlerThread0;
            this.c = writableDownloadIndex0;
            this.d = downloaderFactory0;
            this.e = handler0;
            this.j = v;
            this.k = v1;
            this.i = z;
            this.f = new ArrayList();
            this.g = new HashMap();
        }

        private void A(@Nullable Task downloadManager$Task0) {
            if(downloadManager$Task0 != null) {
                Assertions.i(!downloadManager$Task0.d);
                downloadManager$Task0.f(false);
            }
        }

        private void B() {
            int v1 = 0;
            for(int v = 0; v < this.f.size(); ++v) {
                Download download0 = (Download)this.f.get(v);
                Task downloadManager$Task0 = (Task)this.g.get(download0.a.a);
                switch(download0.b) {
                    case 0: {
                        downloadManager$Task0 = this.y(downloadManager$Task0, download0);
                        break;
                    }
                    case 1: {
                        this.A(downloadManager$Task0);
                        break;
                    }
                    case 2: {
                        Assertions.g(downloadManager$Task0);
                        this.x(downloadManager$Task0, download0, v1);
                        break;
                    }
                    case 5: 
                    case 7: {
                        this.z(downloadManager$Task0, download0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
                if(downloadManager$Task0 != null && !downloadManager$Task0.d) {
                    ++v1;
                }
            }
        }

        private void C() {
            for(int v = 0; v < this.f.size(); ++v) {
                Download download0 = (Download)this.f.get(v);
                if(download0.b == 2) {
                    try {
                        this.c.b(download0);
                    }
                    catch(IOException iOException0) {
                        Log.e("DownloadManager", "Failed to update index.", iOException0);
                    }
                }
            }
            this.sendEmptyMessageDelayed(12, 5000L);
        }

        private void b(DownloadRequest downloadRequest0, int v) {
            Download download0 = this.f(downloadRequest0.a, true);
            long v1 = System.currentTimeMillis();
            if(download0 == null) {
                this.m(new Download(downloadRequest0, (v == 0 ? 0 : 1), v1, v1, -1L, v, 0));
            }
            else {
                this.m(DownloadManager.r(download0, downloadRequest0, v, v1));
            }
            this.B();
        }

        private boolean c() {
            return !this.i && this.h == 0;
        }

        // 检测为 Lambda 实现
        private static int d(Download download0, Download download1) [...]

        private static Download e(Download download0, int v, int v1) {
            return new Download(download0.a, v, download0.c, System.currentTimeMillis(), download0.e, v1, 0, download0.h);
        }

        @Nullable
        private Download f(String s, boolean z) {
            int v = this.g(s);
            if(v != -1) {
                return (Download)this.f.get(v);
            }
            if(z) {
                try {
                    return this.c.e(s);
                }
                catch(IOException iOException0) {
                    Log.e("DownloadManager", "Failed to load download: " + s, iOException0);
                }
            }
            return null;
        }

        private int g(String s) {
            for(int v = 0; v < this.f.size(); ++v) {
                if(((Download)this.f.get(v)).a.a.equals(s)) {
                    return v;
                }
            }
            return -1;
        }

        private void h(int v) {
            DownloadCursor downloadCursor0;
            try {
                this.h = v;
                downloadCursor0 = null;
                this.c.h();
                downloadCursor0 = this.c.d(new int[]{0, 1, 2, 5, 7});
                while(downloadCursor0.moveToNext()) {
                    Download download0 = downloadCursor0.p0();
                    this.f.add(download0);
                }
            }
            catch(IOException iOException0) {
                Log.e("DownloadManager", "Failed to load index.", iOException0);
                this.f.clear();
            }
            finally {
                Util.t(downloadCursor0);
            }
            ArrayList arrayList0 = new ArrayList(this.f);
            this.e.obtainMessage(1, arrayList0).sendToTarget();
            this.B();
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            boolean z = false;
            switch(message0.what) {
                case 1: {
                    this.h(message0.arg1);
                    z = true;
                    break;
                }
                case 2: {
                    if(message0.arg1 != 0) {
                        z = true;
                    }
                    this.r(z);
                    z = true;
                    break;
                }
                case 3: {
                    this.u(message0.arg1);
                    z = true;
                    break;
                }
                case 4: {
                    this.w(((String)message0.obj), message0.arg1);
                    z = true;
                    break;
                }
                case 5: {
                    this.s(message0.arg1);
                    z = true;
                    break;
                }
                case 6: {
                    this.t(message0.arg1);
                    z = true;
                    break;
                }
                case 7: {
                    this.b(((DownloadRequest)message0.obj), message0.arg1);
                    z = true;
                    break;
                }
                case 8: {
                    this.q(((String)message0.obj));
                    z = true;
                    break;
                }
                case 9: {
                    this.p();
                    z = true;
                    break;
                }
                case 10: {
                    this.l(((Task)message0.obj));
                    break;
                }
                case 11: {
                    this.i(((Task)message0.obj), message0.arg2);
                    return;
                }
                case 12: {
                    this.C();
                    return;
                }
                case 13: {
                    this.o();
                    return;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            this.e.obtainMessage(2, ((int)z), this.g.size()).sendToTarget();
        }

        private void i(Task downloadManager$Task0, long v) {
            Download download0 = (Download)Assertions.g(this.f(downloadManager$Task0.a.a, false));
            if(v != download0.e && v != -1L) {
                this.m(new Download(download0.a, download0.b, download0.c, System.currentTimeMillis(), v, download0.f, download0.g, download0.h));
            }
        }

        private void j(Download download0, @Nullable Exception exception0) {
            Download download1 = new Download(download0.a, (exception0 == null ? 3 : 4), download0.c, System.currentTimeMillis(), download0.e, download0.f, (exception0 == null ? 0 : 1), download0.h);
            int v = this.g(download1.a.a);
            this.f.remove(v);
            try {
                this.c.b(download1);
            }
            catch(IOException iOException0) {
                Log.e("DownloadManager", "Failed to update index.", iOException0);
            }
            DownloadUpdate downloadManager$DownloadUpdate0 = new DownloadUpdate(download1, false, new ArrayList(this.f), exception0);
            this.e.obtainMessage(3, downloadManager$DownloadUpdate0).sendToTarget();
        }

        private void k(Download download0) {
            int v = 1;
            if(download0.b == 7) {
                int v1 = download0.f;
                if(v1 == 0) {
                    v = 0;
                }
                this.n(download0, v, v1);
                this.B();
                return;
            }
            int v2 = this.g(download0.a.a);
            this.f.remove(v2);
            try {
                this.c.c(download0.a.a);
            }
            catch(IOException unused_ex) {
                Log.d("DownloadManager", "Failed to remove from database");
            }
            DownloadUpdate downloadManager$DownloadUpdate0 = new DownloadUpdate(download0, true, new ArrayList(this.f), null);
            this.e.obtainMessage(3, downloadManager$DownloadUpdate0).sendToTarget();
        }

        private void l(Task downloadManager$Task0) {
            String s = downloadManager$Task0.a.a;
            this.g.remove(s);
            boolean z = downloadManager$Task0.d;
            if(z) {
                this.m = false;
            }
            else {
                int v = this.l - 1;
                this.l = v;
                if(v == 0) {
                    this.removeMessages(12);
                }
            }
            if(downloadManager$Task0.g) {
                this.B();
                return;
            }
            Exception exception0 = downloadManager$Task0.h;
            if(exception0 != null) {
                Log.e("DownloadManager", "Task failed: " + downloadManager$Task0.a + ", " + z, exception0);
            }
            Download download0 = (Download)Assertions.g(this.f(s, false));
            switch(download0.b) {
                case 2: {
                    Assertions.i(!z);
                    this.j(download0, exception0);
                    break;
                }
                case 5: 
                case 7: {
                    Assertions.i(z);
                    this.k(download0);
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            this.B();
        }

        private Download m(Download download0) {
            boolean z = true;
            Assertions.i(download0.b != 3 && download0.b != 4);
            int v = this.g(download0.a.a);
            if(v == -1) {
                this.f.add(download0);
                l l0 = (Download download0, Download download1) -> Util.u(download0.c, download1.c);
                Collections.sort(this.f, l0);
            }
            else {
                long v1 = ((Download)this.f.get(v)).c;
                if(download0.c == v1) {
                    z = false;
                }
                this.f.set(v, download0);
                if(z) {
                    l l1 = (Download download0, Download download1) -> Util.u(download0.c, download1.c);
                    Collections.sort(this.f, l1);
                }
            }
            try {
                this.c.b(download0);
            }
            catch(IOException iOException0) {
                Log.e("DownloadManager", "Failed to update index.", iOException0);
            }
            DownloadUpdate downloadManager$DownloadUpdate0 = new DownloadUpdate(download0, false, new ArrayList(this.f), null);
            this.e.obtainMessage(3, downloadManager$DownloadUpdate0).sendToTarget();
            return download0;
        }

        private Download n(Download download0, int v, int v1) {
            Assertions.i(v != 3 && v != 4);
            return this.m(InternalHandler.e(download0, v, v1));
        }

        private void o() {
            for(Object object0: this.g.values()) {
                ((Task)object0).f(true);
            }
            try {
                this.c.h();
            }
            catch(IOException iOException0) {
                Log.e("DownloadManager", "Failed to update index.", iOException0);
            }
            this.f.clear();
            this.b.quit();
            synchronized(this) {
                this.a = true;
                this.notifyAll();
            }
        }

        private void p() {
            ArrayList arrayList0 = new ArrayList();
            try(DownloadCursor downloadCursor0 = this.c.d(new int[]{3, 4})) {
                while(true) {
                    if(!downloadCursor0.moveToNext()) {
                        break;
                    }
                    arrayList0.add(downloadCursor0.p0());
                }
            }
            catch(IOException unused_ex) {
                Log.d("DownloadManager", "Failed to load downloads.");
            }
            for(int v = 0; v < this.f.size(); ++v) {
                Download download0 = InternalHandler.e(((Download)this.f.get(v)), 5, 0);
                this.f.set(v, download0);
            }
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                Download download1 = InternalHandler.e(((Download)arrayList0.get(v1)), 5, 0);
                this.f.add(download1);
            }
            l l0 = (Download download0, Download download1) -> Util.u(download0.c, download1.c);
            Collections.sort(this.f, l0);
            try {
                this.c.g();
            }
            catch(IOException iOException0) {
                Log.e("DownloadManager", "Failed to update index.", iOException0);
            }
            ArrayList arrayList1 = new ArrayList(this.f);
            for(int v2 = 0; v2 < this.f.size(); ++v2) {
                DownloadUpdate downloadManager$DownloadUpdate0 = new DownloadUpdate(((Download)this.f.get(v2)), false, arrayList1, null);
                this.e.obtainMessage(3, downloadManager$DownloadUpdate0).sendToTarget();
            }
            this.B();
        }

        private void q(String s) {
            Download download0 = this.f(s, true);
            if(download0 == null) {
                Log.d("DownloadManager", "Failed to remove nonexistent download: " + s);
                return;
            }
            this.n(download0, 5, 0);
            this.B();
        }

        private void r(boolean z) {
            this.i = z;
            this.B();
        }

        private void s(int v) {
            this.j = v;
            this.B();
        }

        private void t(int v) {
            this.k = v;
        }

        private void u(int v) {
            this.h = v;
            this.B();
        }

        private void v(Download download0, int v) {
            if(v == 0) {
                if(download0.b == 1) {
                    this.n(download0, 0, 0);
                }
            }
            else if(v != download0.f) {
                this.m(new Download(download0.a, (download0.b != 0 && download0.b != 2 ? download0.b : 1), download0.c, System.currentTimeMillis(), download0.e, v, 0, download0.h));
            }
        }

        private void w(@Nullable String s, int v) {
            if(s == null) {
                for(int v1 = 0; v1 < this.f.size(); ++v1) {
                    this.v(((Download)this.f.get(v1)), v);
                }
                try {
                    this.c.f(v);
                }
                catch(IOException iOException0) {
                    Log.e("DownloadManager", "Failed to set manual stop reason", iOException0);
                }
            }
            else {
                Download download0 = this.f(s, false);
                if(download0 == null) {
                    try {
                        this.c.a(s, v);
                    }
                    catch(IOException iOException1) {
                        Log.e("DownloadManager", "Failed to set manual stop reason: " + s, iOException1);
                    }
                }
                else {
                    this.v(download0, v);
                }
            }
            this.B();
        }

        private void x(Task downloadManager$Task0, Download download0, int v) {
            Assertions.i(!downloadManager$Task0.d);
            if(!this.c() || v >= this.j) {
                this.n(download0, 0, 0);
                downloadManager$Task0.f(false);
            }
        }

        @CheckResult
        @Nullable
        private Task y(@Nullable Task downloadManager$Task0, Download download0) {
            if(downloadManager$Task0 != null) {
                Assertions.i(!downloadManager$Task0.d);
                downloadManager$Task0.f(false);
                return downloadManager$Task0;
            }
            if(this.c() && this.l < this.j) {
                Download download1 = this.n(download0, 2, 0);
                Downloader downloader0 = this.d.a(download1.a);
                Task downloadManager$Task1 = new Task(download1.a, downloader0, download1.h, false, this.k, this, null);
                this.g.put(download1.a.a, downloadManager$Task1);
                int v = this.l;
                this.l = v + 1;
                if(v == 0) {
                    this.sendEmptyMessageDelayed(12, 5000L);
                }
                downloadManager$Task1.start();
                return downloadManager$Task1;
            }
            return null;
        }

        private void z(@Nullable Task downloadManager$Task0, Download download0) {
            if(downloadManager$Task0 != null) {
                if(!downloadManager$Task0.d) {
                    downloadManager$Task0.f(false);
                }
                return;
            }
            if(this.m) {
                return;
            }
            Downloader downloader0 = this.d.a(download0.a);
            Task downloadManager$Task1 = new Task(download0.a, downloader0, download0.h, true, this.k, this, null);
            this.g.put(download0.a.a, downloadManager$Task1);
            this.m = true;
            downloadManager$Task1.start();
        }
    }

    public interface Listener {
        void a(DownloadManager arg1, boolean arg2);

        void b(DownloadManager arg1, Download arg2);

        void c(DownloadManager arg1, boolean arg2);

        void d(DownloadManager arg1, Requirements arg2, int arg3);

        void e(DownloadManager arg1, Download arg2, @Nullable Exception arg3);

        void f(DownloadManager arg1);

        void g(DownloadManager arg1);
    }

    static class Task extends Thread implements ProgressListener {
        private final DownloadRequest a;
        private final Downloader b;
        private final DownloadProgress c;
        private final boolean d;
        private final int e;
        @Nullable
        private volatile InternalHandler f;
        private volatile boolean g;
        @Nullable
        private Exception h;
        private long i;

        private Task(DownloadRequest downloadRequest0, Downloader downloader0, DownloadProgress downloadProgress0, boolean z, int v, InternalHandler downloadManager$InternalHandler0) {
            this.a = downloadRequest0;
            this.b = downloader0;
            this.c = downloadProgress0;
            this.d = z;
            this.e = v;
            this.f = downloadManager$InternalHandler0;
            this.i = -1L;
        }

        Task(DownloadRequest downloadRequest0, Downloader downloader0, DownloadProgress downloadProgress0, boolean z, int v, InternalHandler downloadManager$InternalHandler0, androidx.media3.exoplayer.offline.DownloadManager.1 downloadManager$10) {
            this(downloadRequest0, downloader0, downloadProgress0, z, v, downloadManager$InternalHandler0);
        }

        @Override  // androidx.media3.exoplayer.offline.Downloader$ProgressListener
        public void a(long v, long v1, float f) {
            this.c.a = v1;
            this.c.b = f;
            if(v != this.i) {
                this.i = v;
                InternalHandler downloadManager$InternalHandler0 = this.f;
                if(downloadManager$InternalHandler0 != null) {
                    downloadManager$InternalHandler0.obtainMessage(11, ((int)(v >> 0x20)), ((int)v), this).sendToTarget();
                }
            }
        }

        public void f(boolean z) {
            if(z) {
                this.f = null;
            }
            if(!this.g) {
                this.g = true;
                this.b.cancel();
                this.interrupt();
            }
        }

        private static int g(int v) {
            return Math.min((v - 1) * 1000, 5000);
        }

        @Override
        public void run() {
            try {
                if(this.d) {
                    this.b.remove();
                }
                else {
                    long v = -1L;
                    int v1 = 0;
                    while(true) {
                        if(this.g) {
                            break;
                        }
                        try {
                            this.b.a(this);
                            break;
                        }
                        catch(IOException iOException0) {
                            if(this.g) {
                                continue;
                            }
                            long v2 = this.c.a;
                            if(v2 != v) {
                                v = v2;
                                v1 = 0;
                            }
                            ++v1;
                            if(v1 > this.e) {
                                throw iOException0;
                            }
                            Thread.sleep(Task.g(v1));
                            continue;
                        }
                        goto label_23;
                    }
                }
                goto label_25;
            }
            catch(InterruptedException unused_ex) {
            }
            catch(Exception exception0) {
                goto label_23;
            }
            Thread.currentThread().interrupt();
            goto label_25;
        label_23:
            this.h = exception0;
        label_25:
            InternalHandler downloadManager$InternalHandler0 = this.f;
            if(downloadManager$InternalHandler0 != null) {
                downloadManager$InternalHandler0.obtainMessage(10, this).sendToTarget();
            }
        }
    }

    private static final int A = 5;
    private static final int B = 6;
    private static final int C = 7;
    private static final int D = 8;
    private static final int E = 9;
    private static final int F = 10;
    private static final int G = 11;
    private static final int H = 12;
    private static final int I = 13;
    private static final String J = "DownloadManager";
    private final Context a;
    private final WritableDownloadIndex b;
    private final Handler c;
    private final InternalHandler d;
    private final androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener e;
    private final CopyOnWriteArraySet f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private List o;
    private RequirementsWatcher p;
    public static final int q = 3;
    public static final int r = 5;
    public static final Requirements s = null;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = 1;
    private static final int x = 2;
    private static final int y = 3;
    private static final int z = 4;

    static {
        DownloadManager.s = new Requirements(1);
    }

    public DownloadManager(Context context0, DatabaseProvider databaseProvider0, Cache cache0, Factory dataSource$Factory0, Executor executor0) {
        this(context0, new DefaultDownloadIndex(databaseProvider0), new DefaultDownloaderFactory(new androidx.media3.datasource.cache.CacheDataSource.Factory().j(cache0).p(dataSource$Factory0), executor0));
    }

    public DownloadManager(Context context0, WritableDownloadIndex writableDownloadIndex0, DownloaderFactory downloaderFactory0) {
        this.a = context0.getApplicationContext();
        this.b = writableDownloadIndex0;
        this.k = 3;
        this.l = 5;
        this.j = true;
        this.o = Collections.emptyList();
        this.f = new CopyOnWriteArraySet();
        Handler handler0 = Util.K((Message message0) -> switch(message0.what) {
            case 1: {
                this.u(((List)message0.obj));
                return true;
            }
            case 2: {
                this.v(message0.arg1, message0.arg2);
                return true;
            }
            case 3: {
                this.t(((DownloadUpdate)message0.obj));
                return true;
            }
            default: {
                throw new IllegalStateException();
            }
        });
        this.c = handler0;
        HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread0.start();
        InternalHandler downloadManager$InternalHandler0 = new InternalHandler(handlerThread0, writableDownloadIndex0, downloaderFactory0, handler0, 3, 5, true);
        this.d = downloadManager$InternalHandler0;
        k k0 = (RequirementsWatcher requirementsWatcher0, int v) -> {
            Requirements requirements0 = requirementsWatcher0.f();
            if(this.m != v) {
                this.m = v;
                ++this.g;
                this.d.obtainMessage(3, v, 0).sendToTarget();
            }
            boolean z = this.I();
            for(Object object0: this.f) {
                ((Listener)object0).d(this, requirements0, v);
            }
            if(z) {
                this.s();
            }
        };
        this.e = k0;
        RequirementsWatcher requirementsWatcher0 = new RequirementsWatcher(context0, k0, DownloadManager.s);
        this.p = requirementsWatcher0;
        int v = requirementsWatcher0.i();
        this.m = v;
        this.g = 1;
        downloadManager$InternalHandler0.obtainMessage(1, v, 0).sendToTarget();
    }

    public void A(String s) {
        ++this.g;
        this.d.obtainMessage(8, s).sendToTarget();
    }

    public void B(Listener downloadManager$Listener0) {
        this.f.remove(downloadManager$Listener0);
    }

    public void C() {
        this.D(false);
    }

    private void D(boolean z) {
        if(this.j == z) {
            return;
        }
        this.j = z;
        ++this.g;
        this.d.obtainMessage(2, ((int)z), 0).sendToTarget();
        boolean z1 = this.I();
        for(Object object0: this.f) {
            ((Listener)object0).c(this, z);
        }
        if(z1) {
            this.s();
        }
    }

    public void E(@IntRange(from = 1L) int v) {
        Assertions.a(v > 0);
        if(this.k == v) {
            return;
        }
        this.k = v;
        ++this.g;
        this.d.obtainMessage(5, v, 0).sendToTarget();
    }

    public void F(int v) {
        Assertions.a(v >= 0);
        if(this.l == v) {
            return;
        }
        this.l = v;
        ++this.g;
        this.d.obtainMessage(6, v, 0).sendToTarget();
    }

    public void G(Requirements requirements0) {
        if(requirements0.equals(this.p.f())) {
            return;
        }
        this.p.j();
        RequirementsWatcher requirementsWatcher0 = new RequirementsWatcher(this.a, this.e, requirements0);
        this.p = requirementsWatcher0;
        int v = requirementsWatcher0.i();
        this.w(this.p, v);
    }

    public void H(@Nullable String s, int v) {
        ++this.g;
        this.d.obtainMessage(4, v, 0, s).sendToTarget();
    }

    private boolean I() {
        boolean z = false;
        boolean z1 = true;
        if(!this.j && this.m != 0) {
            for(int v = 0; v < this.o.size(); ++v) {
                if(((Download)this.o.get(v)).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        if(this.n == z) {
            z1 = false;
        }
        this.n = z;
        return z1;
    }

    public void c(DownloadRequest downloadRequest0) {
        this.d(downloadRequest0, 0);
    }

    public void d(DownloadRequest downloadRequest0, int v) {
        ++this.g;
        this.d.obtainMessage(7, v, 0, downloadRequest0).sendToTarget();
    }

    public void e(Listener downloadManager$Listener0) {
        Assertions.g(downloadManager$Listener0);
        this.f.add(downloadManager$Listener0);
    }

    public Looper f() {
        return this.c.getLooper();
    }

    public List g() {
        return this.o;
    }

    public DownloadIndex h() {
        return this.b;
    }

    public boolean i() {
        return this.j;
    }

    public int j() {
        return this.k;
    }

    public int k() {
        return this.l;
    }

    public int l() {
        return this.m;
    }

    public Requirements m() {
        return this.p.f();
    }

    // 检测为 Lambda 实现
    private boolean n(Message message0) [...]

    public boolean o() {
        return this.h == 0 && this.g == 0;
    }

    public boolean p() {
        return this.i;
    }

    public boolean q() {
        return this.n;
    }

    static Download r(Download download0, DownloadRequest downloadRequest0, int v, long v1) {
        long v2 = download0.b == 5 || download0.c() ? v1 : download0.c;
        if(download0.b != 5 && download0.b != 7) {
            return v == 0 ? new Download(download0.a.d(downloadRequest0), 0, v2, v1, -1L, 0, 0) : new Download(download0.a.d(downloadRequest0), 1, v2, v1, -1L, v, 0);
        }
        return new Download(download0.a.d(downloadRequest0), 7, v2, v1, -1L, v, 0);
    }

    private void s() {
        for(Object object0: this.f) {
            ((Listener)object0).a(this, this.n);
        }
    }

    private void t(DownloadUpdate downloadManager$DownloadUpdate0) {
        this.o = DesugarCollections.unmodifiableList(downloadManager$DownloadUpdate0.c);
        Download download0 = downloadManager$DownloadUpdate0.a;
        boolean z = this.I();
        if(downloadManager$DownloadUpdate0.b) {
            for(Object object0: this.f) {
                ((Listener)object0).b(this, download0);
            }
        }
        else {
            for(Object object1: this.f) {
                ((Listener)object1).e(this, download0, downloadManager$DownloadUpdate0.d);
            }
        }
        if(z) {
            this.s();
        }
    }

    private void u(List list0) {
        this.i = true;
        this.o = DesugarCollections.unmodifiableList(list0);
        boolean z = this.I();
        for(Object object0: this.f) {
            ((Listener)object0).g(this);
        }
        if(z) {
            this.s();
        }
    }

    private void v(int v, int v1) {
        this.g -= v;
        this.h = v1;
        if(this.o()) {
            for(Object object0: this.f) {
                ((Listener)object0).f(this);
            }
        }
    }

    // 检测为 Lambda 实现
    private void w(RequirementsWatcher requirementsWatcher0, int v) [...]

    public void x() {
        this.D(true);
    }

    public void y() {
        synchronized(this.d) {
            InternalHandler downloadManager$InternalHandler1 = this.d;
            if(downloadManager$InternalHandler1.a) {
                return;
            }
            downloadManager$InternalHandler1.sendEmptyMessage(13);
            boolean z = false;
            while(true) {
                InternalHandler downloadManager$InternalHandler2 = this.d;
                if(downloadManager$InternalHandler2.a) {
                    break;
                }
                try {
                    downloadManager$InternalHandler2.wait();
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                }
            }
            if(z) {
                Thread.currentThread().interrupt();
            }
            this.c.removeCallbacksAndMessages(null);
            this.p.j();
            this.o = Collections.emptyList();
            this.g = 0;
            this.h = 0;
            this.i = false;
            this.m = 0;
            this.n = false;
        }
    }

    public void z() {
        ++this.g;
        this.d.obtainMessage(9).sendToTarget();
    }

    class androidx.media3.exoplayer.offline.DownloadManager.1 {
    }

}

