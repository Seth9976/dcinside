package com.vungle.ads.internal.model;

import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a {
    public static enum com.vungle.ads.internal.model.a.a {
        ZIP,
        ASSET;

        private static final com.vungle.ads.internal.model.a.a[] $values() [...] // Inlined contents
    }

    public static enum b {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED;

        private static final b[] $values() [...] // Inlined contents
    }

    @l
    private final String adIdentifier;
    private long fileSize;
    @l
    private final com.vungle.ads.internal.model.a.a fileType;
    private final boolean isRequired;
    @l
    private final String localPath;
    @l
    private final String serverPath;
    @l
    private b status;

    public a(@l String s, @l String s1, @l String s2, @l com.vungle.ads.internal.model.a.a a$a0, boolean z) {
        L.p(s, "adIdentifier");
        L.p(s1, "serverPath");
        L.p(s2, "localPath");
        L.p(a$a0, "fileType");
        super();
        this.adIdentifier = s;
        this.serverPath = s1;
        this.localPath = s2;
        this.fileType = a$a0;
        this.isRequired = z;
        this.status = b.NEW;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!L.g(a.class, class0) || this.status != ((a)object0).status) {
                return false;
            }
            if(this.fileType != ((a)object0).fileType) {
                return false;
            }
            if(this.fileSize != ((a)object0).fileSize) {
                return false;
            }
            if(this.isRequired != ((a)object0).isRequired) {
                return false;
            }
            if(!L.g(this.adIdentifier, ((a)object0).adIdentifier)) {
                return false;
            }
            return L.g(this.serverPath, ((a)object0).serverPath) ? L.g(this.localPath, ((a)object0).localPath) : false;
        }
        return false;
    }

    @l
    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @l
    public final com.vungle.ads.internal.model.a.a getFileType() {
        return this.fileType;
    }

    @l
    public final String getLocalPath() {
        return this.localPath;
    }

    @l
    public final String getServerPath() {
        return this.serverPath;
    }

    @l
    public final b getStatus() {
        return this.status;
    }

    @Override
    public int hashCode() {
        return (((((this.adIdentifier.hashCode() * 0x1F + this.serverPath.hashCode()) * 0x1F + this.localPath.hashCode()) * 0x1F + this.status.hashCode()) * 0x1F + this.fileType.hashCode()) * 0x1F + ((int)(this.fileSize ^ this.fileSize >>> 0x20))) * 0x1F + c.a(this.isRequired);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final void setFileSize(long v) {
        this.fileSize = v;
    }

    public final void setStatus(@l b a$b0) {
        L.p(a$b0, "<set-?>");
        this.status = a$b0;
    }

    @Override
    @l
    public String toString() {
        return "AdAsset{, adIdentifier=\'" + this.adIdentifier + "\', serverPath=\'" + this.serverPath + "\', localPath=\'" + this.localPath + "\', status=" + this.status + ", fileType=" + this.fileType + ", fileSize=" + this.fileSize + ", isRequired=" + this.isRequired + '}';
    }
}

