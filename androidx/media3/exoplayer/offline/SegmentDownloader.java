package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager.PriorityTooLowException;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec.Builder;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource.Factory;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.datasource.cache.CacheWriter.ProgressListener;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.upstream.ParsingLoadable.Parser;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@UnstableApi
public abstract class SegmentDownloader implements Downloader {
    static final class ProgressNotifier implements ProgressListener {
        private final androidx.media3.exoplayer.offline.Downloader.ProgressListener a;
        private final long b;
        private final int c;
        private long d;
        private int e;

        public ProgressNotifier(androidx.media3.exoplayer.offline.Downloader.ProgressListener downloader$ProgressListener0, long v, int v1, long v2, int v3) {
            this.a = downloader$ProgressListener0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            this.e = v3;
        }

        @Override  // androidx.media3.datasource.cache.CacheWriter$ProgressListener
        public void a(long v, long v1, long v2) {
            long v3 = this.d + v2;
            this.d = v3;
            float f = this.b();
            this.a.a(this.b, v3, f);
        }

        private float b() {
            long v = this.b;
            if(v != -1L && v != 0L) {
                return ((float)this.d) * 100.0f / ((float)v);
            }
            return this.c == 0 ? -1.0f : ((float)this.e) * 100.0f / ((float)this.c);
        }

        public void c() {
            ++this.e;
            long v = this.d;
            float f = this.b();
            this.a.a(this.b, v, f);
        }
    }

    public static class Segment implements Comparable {
        public final long a;
        public final DataSpec b;

        public Segment(long v, DataSpec dataSpec0) {
            this.a = v;
            this.b = dataSpec0;
        }

        public int a(Segment segmentDownloader$Segment0) {
            return Util.u(this.a, segmentDownloader$Segment0.a);
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((Segment)object0));
        }
    }

    static final class SegmentDownloadRunnable extends RunnableFutureTask {
        public final Segment h;
        public final CacheDataSource i;
        @Nullable
        private final ProgressNotifier j;
        public final byte[] k;
        private final CacheWriter l;

        public SegmentDownloadRunnable(Segment segmentDownloader$Segment0, CacheDataSource cacheDataSource0, @Nullable ProgressNotifier segmentDownloader$ProgressNotifier0, byte[] arr_b) {
            this.h = segmentDownloader$Segment0;
            this.i = cacheDataSource0;
            this.j = segmentDownloader$ProgressNotifier0;
            this.k = arr_b;
            this.l = new CacheWriter(cacheDataSource0, segmentDownloader$Segment0.b, arr_b, segmentDownloader$ProgressNotifier0);
        }

        @Override  // androidx.media3.common.util.RunnableFutureTask
        protected void c() {
            this.l.b();
        }

        @Override  // androidx.media3.common.util.RunnableFutureTask
        protected Object d() throws Exception {
            return this.f();
        }

        protected Void f() throws IOException {
            this.l.a();
            ProgressNotifier segmentDownloader$ProgressNotifier0 = this.j;
            if(segmentDownloader$ProgressNotifier0 != null) {
                segmentDownloader$ProgressNotifier0.c();
            }
            return null;
        }
    }

    private final DataSpec a;
    private final Parser b;
    private final ArrayList c;
    private final Factory d;
    private final Cache e;
    private final CacheKeyFactory f;
    @Nullable
    private final PriorityTaskManager g;
    private final Executor h;
    private final long i;
    private final ArrayList j;
    private volatile boolean k;
    public static final long l = 20000L;
    private static final int m = 0x20000;

    @Deprecated
    public SegmentDownloader(MediaItem mediaItem0, Parser parsingLoadable$Parser0, Factory cacheDataSource$Factory0, Executor executor0) {
        this(mediaItem0, parsingLoadable$Parser0, cacheDataSource$Factory0, executor0, 20000L);
    }

    public SegmentDownloader(MediaItem mediaItem0, Parser parsingLoadable$Parser0, Factory cacheDataSource$Factory0, Executor executor0, long v) {
        Assertions.g(mediaItem0.b);
        this.a = SegmentDownloader.f(mediaItem0.b.a);
        this.b = parsingLoadable$Parser0;
        this.c = new ArrayList(mediaItem0.b.e);
        this.d = cacheDataSource$Factory0;
        this.h = executor0;
        this.e = (Cache)Assertions.g(cacheDataSource$Factory0.g());
        this.f = cacheDataSource$Factory0.h();
        this.g = cacheDataSource$Factory0.i();
        this.j = new ArrayList();
        this.i = Util.F1(v);
    }

    @Override  // androidx.media3.exoplayer.offline.Downloader
    public final void a(@Nullable androidx.media3.exoplayer.offline.Downloader.ProgressListener downloader$ProgressListener0) throws IOException, InterruptedException {
        byte[] arr_b;
        CacheDataSource cacheDataSource1;
        int v9;
        ArrayDeque arrayDeque0 = new ArrayDeque();
        ArrayDeque arrayDeque1 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager0 = this.g;
        if(priorityTaskManager0 != null) {
            priorityTaskManager0.a(-4000);
        }
        try {
            CacheDataSource cacheDataSource0 = this.d.d();
            FilterableManifest filterableManifest0 = this.g(cacheDataSource0, this.a, false);
            if(!this.c.isEmpty()) {
                filterableManifest0 = (FilterableManifest)filterableManifest0.a(this.c);
            }
            List list0 = this.h(cacheDataSource0, filterableManifest0, false);
            Collections.sort(list0);
            SegmentDownloader.i(list0, this.f, this.i);
            int v1 = list0.size();
            int v2 = list0.size() - 1;
            long v3 = 0L;
            long v4 = 0L;
            int v5 = 0;
            while(v2 >= 0) {
                DataSpec dataSpec0 = ((Segment)list0.get(v2)).b;
                String s = this.f.a(dataSpec0);
                long v6 = dataSpec0.h;
                if(v6 == -1L) {
                    long v7 = c.a(this.e.b(s));
                    if(v7 != -1L) {
                        v6 = v7 - dataSpec0.g;
                    }
                }
                long v8 = this.e.i(s, dataSpec0.g, v6);
                v4 += v8;
                if(v6 == -1L) {
                    v9 = v2;
                    v3 = -1L;
                }
                else {
                    if(v6 == v8) {
                        ++v5;
                        v9 = v2;
                        list0.remove(v9);
                    }
                    else {
                        v9 = v2;
                    }
                    if(v3 != -1L) {
                        v3 += v6;
                    }
                }
                v2 = v9 - 1;
            }
            ProgressNotifier segmentDownloader$ProgressNotifier0 = downloader$ProgressListener0 == null ? null : new ProgressNotifier(downloader$ProgressListener0, v3, v1, v4, v5);
            arrayDeque0.addAll(list0);
            while(!this.k && !arrayDeque0.isEmpty()) {
                PriorityTaskManager priorityTaskManager1 = this.g;
                if(priorityTaskManager1 != null) {
                    priorityTaskManager1.b(-4000);
                }
                if(arrayDeque1.isEmpty()) {
                    cacheDataSource1 = this.d.d();
                    arr_b = new byte[0x20000];
                }
                else {
                    SegmentDownloadRunnable segmentDownloader$SegmentDownloadRunnable0 = (SegmentDownloadRunnable)arrayDeque1.removeFirst();
                    cacheDataSource1 = segmentDownloader$SegmentDownloadRunnable0.i;
                    arr_b = segmentDownloader$SegmentDownloadRunnable0.k;
                }
                SegmentDownloadRunnable segmentDownloader$SegmentDownloadRunnable1 = new SegmentDownloadRunnable(((Segment)arrayDeque0.removeFirst()), cacheDataSource1, segmentDownloader$ProgressNotifier0, arr_b);
                this.c(segmentDownloader$SegmentDownloadRunnable1);
                this.h.execute(segmentDownloader$SegmentDownloadRunnable1);
                for(int v10 = this.j.size() - 1; v10 >= 0; --v10) {
                    SegmentDownloadRunnable segmentDownloader$SegmentDownloadRunnable2 = (SegmentDownloadRunnable)this.j.get(v10);
                    if(arrayDeque0.isEmpty() || segmentDownloader$SegmentDownloadRunnable2.isDone()) {
                        try {
                            segmentDownloader$SegmentDownloadRunnable2.get();
                            this.j(v10);
                            arrayDeque1.addLast(segmentDownloader$SegmentDownloadRunnable2);
                        }
                        catch(ExecutionException executionException0) {
                            Throwable throwable0 = (Throwable)Assertions.g(executionException0.getCause());
                            if(throwable0 instanceof PriorityTooLowException) {
                                arrayDeque0.addFirst(segmentDownloader$SegmentDownloadRunnable2.h);
                                this.j(v10);
                                arrayDeque1.addLast(segmentDownloader$SegmentDownloadRunnable2);
                            }
                            else {
                                if(throwable0 instanceof IOException) {
                                    throw (IOException)throwable0;
                                }
                                Util.k2(throwable0);
                                continue;
                            }
                        }
                    }
                }
                segmentDownloader$SegmentDownloadRunnable1.b();
            }
        }
        finally {
            for(int v11 = 0; v11 < this.j.size(); ++v11) {
                ((RunnableFutureTask)this.j.get(v11)).cancel(true);
            }
            for(int v12 = this.j.size() - 1; v12 >= 0; --v12) {
                ((RunnableFutureTask)this.j.get(v12)).a();
                this.j(v12);
            }
            PriorityTaskManager priorityTaskManager2 = this.g;
            if(priorityTaskManager2 != null) {
                priorityTaskManager2.e(-4000);
            }
        }
    }

    private void c(RunnableFutureTask runnableFutureTask0) throws InterruptedException {
        synchronized(this.j) {
            if(!this.k) {
                this.j.add(runnableFutureTask0);
                return;
            }
        }
        throw new InterruptedException();
    }

    @Override  // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized(this.j) {
            this.k = true;
            for(int v1 = 0; v1 < this.j.size(); ++v1) {
                ((RunnableFutureTask)this.j.get(v1)).cancel(true);
            }
        }
    }

    // 去混淆评级： 低(30)
    private static boolean d(DataSpec dataSpec0, DataSpec dataSpec1) {
        return dataSpec0.a.equals(dataSpec1.a) && (dataSpec0.h != -1L && dataSpec0.g + dataSpec0.h == dataSpec1.g && Util.g(dataSpec0.i, dataSpec1.i) && dataSpec0.j == dataSpec1.j && dataSpec0.c == dataSpec1.c && dataSpec0.e.equals(dataSpec1.e));
    }

    protected final Object e(RunnableFutureTask runnableFutureTask0, boolean z) throws InterruptedException, IOException {
        Object object0;
        if(z) {
            runnableFutureTask0.run();
            try {
                return runnableFutureTask0.get();
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = (Throwable)Assertions.g(executionException0.getCause());
                if(throwable0 instanceof IOException) {
                    throw (IOException)throwable0;
                }
                Util.k2(executionException0);
            }
        }
        while(!this.k) {
            PriorityTaskManager priorityTaskManager0 = this.g;
            if(priorityTaskManager0 != null) {
                priorityTaskManager0.b(-4000);
            }
            this.c(runnableFutureTask0);
            this.h.execute(runnableFutureTask0);
            try {
                object0 = runnableFutureTask0.get();
            }
            catch(ExecutionException executionException1) {
                Throwable throwable1 = (Throwable)Assertions.g(executionException1.getCause());
                if(!(throwable1 instanceof PriorityTooLowException)) {
                    if(throwable1 instanceof IOException) {
                        throw (IOException)throwable1;
                    }
                    Util.k2(executionException1);
                }
                continue;
            }
            finally {
                runnableFutureTask0.a();
                this.k(runnableFutureTask0);
            }
            return object0;
        }
        throw new InterruptedException();
    }

    protected static DataSpec f(Uri uri0) {
        return new Builder().j(uri0).c(1).a();
    }

    protected final FilterableManifest g(DataSource dataSource0, DataSpec dataSpec0, boolean z) throws InterruptedException, IOException {
        return (FilterableManifest)this.e(new RunnableFutureTask() {
            final SegmentDownloader j;

            @Override  // androidx.media3.common.util.RunnableFutureTask
            protected Object d() throws Exception {
                return this.f();
            }

            protected FilterableManifest f() throws IOException {
                Parser parsingLoadable$Parser0 = SegmentDownloader.this.b;
                return (FilterableManifest)ParsingLoadable.g(dataSource0, parsingLoadable$Parser0, dataSpec0, 4);
            }
        }, z);
    }

    protected abstract List h(DataSource arg1, FilterableManifest arg2, boolean arg3) throws IOException, InterruptedException;

    private static void i(List list0, CacheKeyFactory cacheKeyFactory0, long v) {
        HashMap hashMap0 = new HashMap();
        int v2 = 0;
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            Segment segmentDownloader$Segment0 = (Segment)list0.get(v1);
            String s = cacheKeyFactory0.a(segmentDownloader$Segment0.b);
            Integer integer0 = (Integer)hashMap0.get(s);
            Segment segmentDownloader$Segment1 = integer0 == null ? null : ((Segment)list0.get(((int)integer0)));
            if(segmentDownloader$Segment1 == null || segmentDownloader$Segment0.a > segmentDownloader$Segment1.a + v || !SegmentDownloader.d(segmentDownloader$Segment1.b, segmentDownloader$Segment0.b)) {
                hashMap0.put(s, v2);
                list0.set(v2, segmentDownloader$Segment0);
                ++v2;
            }
            else {
                long v3 = segmentDownloader$Segment0.b.h;
                DataSpec dataSpec0 = segmentDownloader$Segment1.b.f(0L, (v3 == -1L ? -1L : segmentDownloader$Segment1.b.h + v3));
                list0.set(((int)(((Integer)Assertions.g(integer0)))), new Segment(segmentDownloader$Segment1.a, dataSpec0));
            }
        }
        Util.V1(list0, v2, list0.size());
    }

    private void j(int v) {
        synchronized(this.j) {
            this.j.remove(v);
        }
    }

    private void k(RunnableFutureTask runnableFutureTask0) {
        synchronized(this.j) {
            this.j.remove(runnableFutureTask0);
        }
    }

    @Override  // androidx.media3.exoplayer.offline.Downloader
    public final void remove() {
        CacheDataSource cacheDataSource0 = this.d.e();
        try {
            List list0 = this.h(cacheDataSource0, this.g(cacheDataSource0, this.a, true), true);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                DataSpec dataSpec0 = ((Segment)list0.get(v1)).b;
                String s = this.f.a(dataSpec0);
                this.e.f(s);
            }
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(Exception unused_ex) {
        }
        finally {
            String s1 = this.f.a(this.a);
            this.e.f(s1);
        }
    }
}

