package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult.Failure;
import com.unity3d.ads.core.data.model.CacheResult.Success;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import java.io.File;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidLocalCacheDataSource implements CacheDataSource {
    @l
    private final CreateFile createFile;
    @l
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(@l CreateFile createFile0, @l GetFileExtensionFromUrl getFileExtensionFromUrl0) {
        L.p(createFile0, "createFile");
        L.p(getFileExtensionFromUrl0, "getFileExtensionFromUrl");
        super();
        this.createFile = createFile0;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl0;
    }

    @l
    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override  // com.unity3d.ads.core.data.datasource.CacheDataSource
    @m
    public Object getFile(@l File file0, @l String s, @m String s1, @m Integer integer0, @l d d0) {
        File file1 = this.createFile.invoke(file0, s);
        if(file1.exists()) {
            String s2 = s1 == null || s1.length() == 0 ? null : this.getFileExtensionFromUrl.invoke(s1);
            String s3 = s1 == null ? "" : s1;
            String s4 = s2 == null ? "" : s2;
            long v = file1.length();
            return integer0 == null ? new Success(new CachedFile("", s3, s, file1, s4, v, null, 0x7FFFFFFF, 0x40, null), CacheSource.LOCAL) : new Success(new CachedFile("", s3, s, file1, s4, v, null, ((int)integer0), 0x40, null), CacheSource.LOCAL);
        }
        return new Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
    }

    @l
    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}

