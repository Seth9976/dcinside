package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.ads.core.data.model.CacheResult.Success;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nGetCachedAsset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCachedAsset.kt\ncom/unity3d/ads/core/domain/GetCachedAsset\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class GetCachedAsset {
    @l
    private final CacheRepository cacheRepository;
    @l
    private final Context context;

    public GetCachedAsset(@l CacheRepository cacheRepository0, @l Context context0) {
        L.p(cacheRepository0, "cacheRepository");
        L.p(context0, "context");
        super();
        this.cacheRepository = cacheRepository0;
        this.context = context0;
    }

    private final WebResourceResponse getBundledAsset(Uri uri0) {
        String s = v.r5(uri0.getPath(), "/", null, 2, null);
        try {
            InputStream inputStream0 = this.context.getAssets().open(s);
            L.o(inputStream0, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(s), null, inputStream0);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri0) {
        Object object0;
        String s = uri0.toString();
        L.o(s, "uri.toString()");
        String s1 = v.D5(v.v5(s, "/", null, 2, null), ".", null, 2, null);
        CacheResult cacheResult0 = this.cacheRepository.retrieveFile(s1);
        if(cacheResult0 instanceof Success) {
            File file0 = ((Success)cacheResult0).getCachedFile().getFile();
            if(file0 == null) {
                return null;
            }
            try {
                object0 = e0.b(new FileInputStream(file0));
            }
            catch(Throwable throwable0) {
                object0 = e0.b(f0.a(throwable0));
            }
            if(e0.i(object0)) {
                object0 = null;
            }
            if(((FileInputStream)object0) == null) {
                return null;
            }
            String s2 = file0.getAbsolutePath() + '.' + ((Success)cacheResult0).getCachedFile().getExtension();
            String s3 = StringExtensionsKt.guessMimeType(s2);
            return s3 == null || v.x3(s3) ? null : new WebResourceResponse(StringExtensionsKt.guessMimeType(s2), null, ((FileInputStream)object0));
        }
        return null;
    }

    @m
    public final WebResourceResponse invoke(@l Uri uri0) {
        L.p(uri0, "uri");
        String s = uri0.getHost();
        if(s != null) {
            switch(s) {
                case "unity.ads.asset": {
                    return this.getBundledAsset(uri0);
                }
                case "unity.ads.cache": {
                    return this.getCachedAsset(uri0);
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }
}

