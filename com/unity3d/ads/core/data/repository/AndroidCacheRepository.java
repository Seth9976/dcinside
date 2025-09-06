package com.unity3d.ads.core.data.repository;

import A3.o;
import android.content.Context;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult.Failure;
import com.unity3d.ads.core.data.model.CacheResult.Success;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.FileExtensionsKt;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.i;
import org.json.JSONArray;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidCacheRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCacheRepository.kt\ncom/unity3d/ads/core/data/repository/AndroidCacheRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class AndroidCacheRepository implements CacheRepository {
    @l
    private final File cacheDir;
    @l
    private final ConcurrentHashMap cachedFiles;
    @l
    private final CleanupDirectory cleanupDirectory;
    @l
    private final Context context;
    @l
    private final DownloadPriorityQueue downloadPriorityQueue;
    @l
    private final GetCacheDirectory getCacheDirectory;
    @l
    private final CacheDataSource localCacheDataSource;
    @l
    private final ConcurrentHashMap neededFiles;
    @l
    private final CacheDataSource remoteCacheDataSource;
    @l
    private final O scope;
    @l
    private final SessionRepository sessionRepository;

    public AndroidCacheRepository(@l K k0, @l GetCacheDirectory getCacheDirectory0, @l CacheDataSource cacheDataSource0, @l CacheDataSource cacheDataSource1, @l Context context0, @l SessionRepository sessionRepository0, @l CleanupDirectory cleanupDirectory0, @l DownloadPriorityQueue downloadPriorityQueue0) {
        L.p(k0, "ioDispatcher");
        L.p(getCacheDirectory0, "getCacheDirectory");
        L.p(cacheDataSource0, "localCacheDataSource");
        L.p(cacheDataSource1, "remoteCacheDataSource");
        L.p(context0, "context");
        L.p(sessionRepository0, "sessionRepository");
        L.p(cleanupDirectory0, "cleanupDirectory");
        L.p(downloadPriorityQueue0, "downloadPriorityQueue");
        super();
        this.getCacheDirectory = getCacheDirectory0;
        this.localCacheDataSource = cacheDataSource0;
        this.remoteCacheDataSource = cacheDataSource1;
        this.context = context0;
        this.sessionRepository = sessionRepository0;
        this.cleanupDirectory = cleanupDirectory0;
        this.downloadPriorityQueue = downloadPriorityQueue0;
        this.scope = P.m(P.m(P.a(k0), new N("CacheRepository")), W0.a);
        this.cachedFiles = new ConcurrentHashMap();
        this.neededFiles = new ConcurrentHashMap();
        this.cacheDir = this.initCacheDir();
    }

    private final void addFileToCache(CachedFile cachedFile0) {
        this.cachedFiles.put(cachedFile0.getName(), cachedFile0);
        Set set0 = (Set)this.neededFiles.get(cachedFile0.getName());
        if(set0 == null) {
            set0 = new LinkedHashSet();
        }
        set0.add(cachedFile0.getObjectId());
        this.neededFiles.put(cachedFile0.getName(), set0);
    }

    @Override  // com.unity3d.ads.core.data.repository.CacheRepository
    @m
    public Object clearCache(@l d d0) {
        return i.h(this.scope.getCoroutineContext(), new o(null) {
            int label;

            {
                AndroidCacheRepository.this = androidCacheRepository0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidCacheRepository.clearCache.2(AndroidCacheRepository.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository.clearCache.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                if(!AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                    File[] arr_file = AndroidCacheRepository.this.cacheDir.listFiles();
                    if(arr_file != null) {
                        for(int v = 0; v < arr_file.length; ++v) {
                            arr_file[v].delete();
                        }
                        return S0.a;
                    }
                    return null;
                }
                CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration0 = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
                AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.cacheDir, nativeConfigurationOuterClass$CachedAssetsConfiguration0.getMaxCachedAssetSizeMb(), nativeConfigurationOuterClass$CachedAssetsConfiguration0.getMaxCachedAssetAgeMs());
                return S0.a;
            }
        }, d0);
    }

    @Override  // com.unity3d.ads.core.data.repository.CacheRepository
    @m
    public Object doesFileExist(@l String s, @l d d0) {
        return b.a(this.cachedFiles.containsKey(s));
    }

    private final File getCacheDirBase() {
        File file0 = this.context.getCacheDir();
        L.o(file0, "context.cacheDir");
        return file0;
    }

    private final String getCacheDirPath() [...] // Inlined contents

    @Override  // com.unity3d.ads.core.data.repository.CacheRepository
    @m
    public Object getCacheSize(@l d d0) {
        return i.h(this.scope.getCoroutineContext(), new o(null) {
            int label;

            {
                AndroidCacheRepository.this = androidCacheRepository0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidCacheRepository.getCacheSize.2(AndroidCacheRepository.this, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository.getCacheSize.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return b.g(FileExtensionsKt.getDirectorySize(AndroidCacheRepository.this.cacheDir));
            }
        }, d0);
    }

    @l
    public final ConcurrentHashMap getCachedFiles() {
        return this.cachedFiles;
    }

    @Override  // com.unity3d.ads.core.data.repository.CacheRepository
    @m
    public Object getFile(@l String s, @l String s1, @m JSONArray jSONArray0, int v, @l d d0) {
        return i.h(this.scope.getCoroutineContext(), new o(s, v, s1, null) {
            final String $objectId;
            final int $priority;
            final String $url;
            Object L$0;
            int label;

            {
                AndroidCacheRepository.this = androidCacheRepository0;
                this.$url = s;
                this.$priority = v;
                this.$objectId = s1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.repository.AndroidCacheRepository.getFile.2(AndroidCacheRepository.this, this.$url, this.$priority, this.$objectId, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository.getFile.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                E e0;
                String s1;
                Object object2;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.label) {
                    case 0: {
                        f0.n(object0);
                        String s = AndroidCacheRepository.this.getFilename(this.$url);
                        this.L$0 = s;
                        this.label = 1;
                        object2 = AndroidCacheRepository.this.localCacheDataSource.getFile(AndroidCacheRepository.this.cacheDir, s, this.$url, b.f(this.$priority), this);
                        if(object2 == object1) {
                            return object1;
                        }
                        s1 = s;
                        goto label_18;
                    }
                    case 1: {
                        String s2 = (String)this.L$0;
                        f0.n(object0);
                        s1 = s2;
                        object2 = object0;
                    label_18:
                        if(((CacheResult)object2) instanceof Success) {
                            CachedFile cachedFile0 = CachedFile.copy$default(((Success)(((CacheResult)object2))).getCachedFile(), this.$objectId, null, null, null, null, 0L, null, 0, 0xFE, null);
                            AndroidCacheRepository.this.addFileToCache(cachedFile0);
                            return (CacheResult)object2;
                        }
                        e0 = W.a(null);
                        com.unity3d.ads.core.data.repository.AndroidCacheRepository.getFile.2.1 androidCacheRepository$getFile$2$10 = new Function1(s1, this.$url, this.$priority, this.$objectId, e0, null) {
                            final E $fileResult;
                            final String $filename;
                            final String $objectId;
                            final int $priority;
                            final String $url;
                            int label;

                            {
                                AndroidCacheRepository.this = androidCacheRepository0;
                                this.$filename = s;
                                this.$url = s1;
                                this.$priority = v;
                                this.$objectId = s2;
                                this.$fileResult = e0;
                                super(1, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@l d d0) {
                                return new com.unity3d.ads.core.data.repository.AndroidCacheRepository.getFile.2.1(AndroidCacheRepository.this, this.$filename, this.$url, this.$priority, this.$objectId, this.$fileResult, d0);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                return this.invoke(((d)object0));
                            }

                            @m
                            public final Object invoke(@m d d0) {
                                return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository.getFile.2.1)this.create(d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = kotlin.coroutines.intrinsics.b.l();
                                switch(this.label) {
                                    case 0: {
                                        f0.n(object0);
                                        this.label = 1;
                                        object0 = AndroidCacheRepository.this.localCacheDataSource.getFile(AndroidCacheRepository.this.cacheDir, this.$filename, this.$url, b.f(this.$priority), this);
                                        if(object0 == object1) {
                                            return object1;
                                        }
                                        goto label_9;
                                    }
                                    case 1: {
                                        f0.n(object0);
                                    label_9:
                                        if(((CacheResult)object0) instanceof Success) {
                                            CachedFile cachedFile0 = CachedFile.copy$default(((Success)(((CacheResult)object0))).getCachedFile(), this.$objectId, null, null, null, null, 0L, null, 0, 0xFE, null);
                                            AndroidCacheRepository.this.addFileToCache(cachedFile0);
                                            E e0 = this.$fileResult;
                                            do {
                                                Object object2 = e0.getValue();
                                                CacheResult cacheResult0 = (CacheResult)object2;
                                            }
                                            while(!e0.compareAndSet(object2, ((CacheResult)object0)));
                                            return S0.a;
                                        }
                                        this.label = 2;
                                        object0 = AndroidCacheRepository.this.remoteCacheDataSource.getFile(AndroidCacheRepository.this.cacheDir, this.$filename, this.$url, b.f(this.$priority), this);
                                        if(object0 == object1) {
                                            return object1;
                                        }
                                        goto label_22;
                                    }
                                    case 2: {
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                f0.n(object0);
                            label_22:
                                if(((CacheResult)object0) instanceof Success) {
                                    CachedFile cachedFile1 = CachedFile.copy$default(((Success)(((CacheResult)object0))).getCachedFile(), this.$objectId, null, null, null, null, 0L, null, 0, 0xFE, null);
                                    AndroidCacheRepository.this.addFileToCache(cachedFile1);
                                }
                                E e1 = this.$fileResult;
                                do {
                                    Object object3 = e1.getValue();
                                    CacheResult cacheResult1 = (CacheResult)object3;
                                }
                                while(!e1.compareAndSet(object3, ((CacheResult)object0)));
                                return S0.a;
                            }
                        };
                        this.L$0 = e0;
                        this.label = 2;
                        if(AndroidCacheRepository.this.downloadPriorityQueue.invoke(this.$priority, androidCacheRepository$getFile$2$10, this) == object1) {
                            return object1;
                        }
                        goto label_30;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                e0 = (E)this.L$0;
                f0.n(object0);
            label_30:
                kotlinx.coroutines.flow.i i0 = k.t0(e0);
                this.L$0 = null;
                this.label = 3;
                Object object3 = k.v0(i0, this);
                return object3 == object1 ? object1 : object3;
            }
        }, d0);
    }

    @l
    public final String getFilename(@l String s) {
        L.p(s, "url");
        return StringExtensionsKt.getSHA256Hash(s);
    }

    @l
    public final ConcurrentHashMap getNeededFiles() {
        return this.neededFiles;
    }

    private final File initCacheDir() {
        File file0 = this.getCacheDirBase();
        File file1 = this.getCacheDirectory.invoke(file0, "UnityAdsCache");
        file1.mkdirs();
        return file1;
    }

    @Override  // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(@l CachedFile cachedFile0) {
        L.p(cachedFile0, "cachedFile");
        this.cachedFiles.remove(cachedFile0.getName());
        Set set0 = (Set)this.neededFiles.get(cachedFile0.getName());
        if(set0 != null) {
            set0.remove(cachedFile0.getObjectId());
        }
        File file0 = cachedFile0.getFile();
        if(file0 != null) {
            if(!file0.exists()) {
                file0 = null;
            }
            return file0 == null ? false : file0.delete();
        }
        return false;
    }

    @Override  // com.unity3d.ads.core.data.repository.CacheRepository
    @l
    public CacheResult retrieveFile(@l String s) {
        L.p(s, "fileName");
        CachedFile cachedFile0 = (CachedFile)this.cachedFiles.get(s);
        return cachedFile0 != null ? new Success(cachedFile0, CacheSource.LOCAL) : new Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
    }
}

