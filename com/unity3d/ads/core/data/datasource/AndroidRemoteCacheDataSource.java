package com.unity3d.ads.core.data.datasource;

import A3.o;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult.Failure;
import com.unity3d.ads.core.data.model.CacheResult.Success;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidRemoteCacheDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRemoteCacheDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    @l
    private final CreateFile createFile;
    @l
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    @l
    private final HttpClient httpClient;
    @l
    private final K ioDispatcher;

    public AndroidRemoteCacheDataSource(@l K k0, @l CreateFile createFile0, @l GetFileExtensionFromUrl getFileExtensionFromUrl0, @l HttpClient httpClient0) {
        L.p(k0, "ioDispatcher");
        L.p(createFile0, "createFile");
        L.p(getFileExtensionFromUrl0, "getFileExtensionFromUrl");
        L.p(httpClient0, "httpClient");
        super();
        this.ioDispatcher = k0;
        this.createFile = createFile0;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl0;
        this.httpClient = httpClient0;
    }

    public static final Object access$downloadFile(AndroidRemoteCacheDataSource androidRemoteCacheDataSource0, String s, Integer integer0, d d0) {
        return androidRemoteCacheDataSource0.downloadFile(s, integer0, d0);
    }

    public static final Object access$saveToCache(AndroidRemoteCacheDataSource androidRemoteCacheDataSource0, File file0, Object object0, d d0) {
        return androidRemoteCacheDataSource0.saveToCache(file0, object0, d0);
    }

    private final Object downloadFile(String s, Integer integer0, d d0) {
        HttpRequest httpRequest0 = new HttpRequest(s, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, (integer0 == null ? 0x7FFFFFFF : ((int)integer0)), 0xFFFE, null);
        return this.httpClient.execute(httpRequest0, d0);
    }

    @Override  // com.unity3d.ads.core.data.datasource.CacheDataSource
    @m
    public Object getFile(@l File file0, @l String s, @m String s1, @m Integer integer0, @l d d0) {
        S0 s00;
        File file4;
        String s7;
        String s6;
        HttpResponse httpResponse1;
        Integer integer3;
        String s5;
        HttpResponse httpResponse0;
        Integer integer1;
        String s3;
        AndroidRemoteCacheDataSource androidRemoteCacheDataSource0;
        String s2;
        File file1;
        com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile.1 androidRemoteCacheDataSource$getFile$10;
        if(d0 instanceof com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile.1) {
            androidRemoteCacheDataSource$getFile$10 = (com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile.1)d0;
            int v = androidRemoteCacheDataSource$getFile$10.label;
            if((v & 0x80000000) == 0) {
                androidRemoteCacheDataSource$getFile$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.getFile(null, null, null, null, this);
                    }
                };
            }
            else {
                androidRemoteCacheDataSource$getFile$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidRemoteCacheDataSource$getFile$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.getFile(null, null, null, null, this);
                }
            };
        }
        Object object0 = androidRemoteCacheDataSource$getFile$10.result;
        Object object1 = b.l();
        switch(androidRemoteCacheDataSource$getFile$10.label) {
            case 0: {
                f0.n(object0);
                if(s1 == null) {
                    return new Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE);
                }
                try {
                    androidRemoteCacheDataSource$getFile$10.L$0 = this;
                    file1 = file0;
                    androidRemoteCacheDataSource$getFile$10.L$1 = file1;
                    s2 = s;
                    androidRemoteCacheDataSource$getFile$10.L$2 = s2;
                    androidRemoteCacheDataSource$getFile$10.L$3 = s1;
                    androidRemoteCacheDataSource$getFile$10.L$4 = integer0;
                    androidRemoteCacheDataSource$getFile$10.label = 1;
                    Object object2 = this.downloadFile(s1, integer0, androidRemoteCacheDataSource$getFile$10);
                    if(object2 == object1) {
                        return object1;
                    }
                    androidRemoteCacheDataSource0 = this;
                    s3 = s1;
                    integer1 = integer0;
                    httpResponse0 = (HttpResponse)object2;
                    goto label_43;
                }
                catch(Exception unused_ex) {
                    return new Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE);
                }
            }
            case 1: {
                Integer integer2 = (Integer)androidRemoteCacheDataSource$getFile$10.L$4;
                s3 = (String)androidRemoteCacheDataSource$getFile$10.L$3;
                s2 = (String)androidRemoteCacheDataSource$getFile$10.L$2;
                File file2 = (File)androidRemoteCacheDataSource$getFile$10.L$1;
                androidRemoteCacheDataSource0 = (AndroidRemoteCacheDataSource)androidRemoteCacheDataSource$getFile$10.L$0;
                try {
                    f0.n(object0);
                    integer1 = integer2;
                    file1 = file2;
                    httpResponse0 = (HttpResponse)object0;
                }
                catch(Exception unused_ex) {
                    return new Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE);
                }
            label_43:
                String s4 = s3.length() == 0 ? null : androidRemoteCacheDataSource0.getFileExtensionFromUrl.invoke(s3);
                if(HttpResponseKt.isSuccessful(httpResponse0)) {
                    File file3 = androidRemoteCacheDataSource0.createFile.invoke(file1, s2);
                    try {
                        androidRemoteCacheDataSource$getFile$10.L$0 = s2;
                        androidRemoteCacheDataSource$getFile$10.L$1 = s3;
                        androidRemoteCacheDataSource$getFile$10.L$2 = integer1;
                        androidRemoteCacheDataSource$getFile$10.L$3 = httpResponse0;
                        androidRemoteCacheDataSource$getFile$10.L$4 = s4;
                        androidRemoteCacheDataSource$getFile$10.L$5 = file3;
                        androidRemoteCacheDataSource$getFile$10.label = 2;
                        if(androidRemoteCacheDataSource0.saveToCache(file3, httpResponse0.getBody(), androidRemoteCacheDataSource$getFile$10) == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable0) {
                        s5 = s2;
                        integer3 = integer1;
                        httpResponse1 = httpResponse0;
                        s6 = s4;
                        s7 = s3;
                        file4 = file3;
                        break;
                    }
                    s5 = s2;
                    integer3 = integer1;
                    httpResponse1 = httpResponse0;
                    s6 = s4;
                    s7 = s3;
                    file4 = file3;
                    s00 = S0.a;
                    goto label_83;
                }
                return new Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE);
            }
            case 2: {
                file4 = (File)androidRemoteCacheDataSource$getFile$10.L$5;
                s6 = (String)androidRemoteCacheDataSource$getFile$10.L$4;
                httpResponse1 = (HttpResponse)androidRemoteCacheDataSource$getFile$10.L$3;
                integer3 = (Integer)androidRemoteCacheDataSource$getFile$10.L$2;
                s7 = (String)androidRemoteCacheDataSource$getFile$10.L$1;
                s5 = (String)androidRemoteCacheDataSource$getFile$10.L$0;
                try {
                    f0.n(object0);
                    s00 = S0.a;
                    goto label_83;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        s00 = e0.b(f0.a(throwable0));
    label_83:
        String s8 = s6;
        if(e0.e(s00) != null) {
            return new Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE);
        }
        if(s8 == null) {
            s8 = "";
        }
        long v1 = httpResponse1.getContentSize();
        String s9 = httpResponse1.getProtocol();
        return integer3 == null ? new Success(new CachedFile("", s7, s5, file4, s8, v1, s9, 0x7FFFFFFF), CacheSource.REMOTE) : new Success(new CachedFile("", s7, s5, file4, s8, v1, s9, ((int)integer3)), CacheSource.REMOTE);
    }

    private final Object saveToCache(File file0, Object object0, d d0) {
        com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.saveToCache.2 androidRemoteCacheDataSource$saveToCache$20 = new o(file0, null) {
            final Object $body;
            final File $dest;
            int label;

            {
                this.$body = object0;
                this.$dest = file0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.saveToCache.2(this.$body, this.$dest, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.saveToCache.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Object object1 = this.$body;
                if(object1 instanceof File) {
                    kotlin.io.m.T(((File)object1), this.$dest, true, 0, 4, null);
                    return kotlin.coroutines.jvm.internal.b.a(((File)this.$body).delete());
                }
                if(!(object1 instanceof byte[])) {
                    throw new IllegalStateException("Unknown body type");
                }
                this.$dest.createNewFile();
                kotlin.io.m.G(this.$dest, ((byte[])this.$body));
                return S0.a;
            }
        };
        Object object1 = i.h(this.ioDispatcher, androidRemoteCacheDataSource$saveToCache$20, d0);
        return object1 == b.l() ? object1 : S0.a;
    }
}

