package com.unity3d.ads.core.data.model;

import java.io.File;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class CachedFile {
    private final long contentLength;
    @m
    private final String extension;
    @m
    private final File file;
    @l
    private final String name;
    @l
    private final String objectId;
    private final int priority;
    @l
    private final String protocol;
    @l
    private final String url;

    public CachedFile(@l String s, @l String s1, @l String s2, @m File file0, @m String s3, long v, @l String s4, int v1) {
        L.p(s, "objectId");
        L.p(s1, "url");
        L.p(s2, "name");
        L.p(s4, "protocol");
        super();
        this.objectId = s;
        this.url = s1;
        this.name = s2;
        this.file = file0;
        this.extension = s3;
        this.contentLength = v;
        this.protocol = s4;
        this.priority = v1;
    }

    public CachedFile(String s, String s1, String s2, File file0, String s3, long v, String s4, int v1, int v2, w w0) {
        this(s, s1, s2, ((v2 & 8) == 0 ? file0 : null), ((v2 & 16) == 0 ? s3 : ""), ((v2 & 0x20) == 0 ? v : -1L), ((v2 & 0x40) == 0 ? s4 : ""), ((v2 & 0x80) == 0 ? v1 : 0x7FFFFFFF));
    }

    @l
    public final String component1() {
        return this.objectId;
    }

    @l
    public final String component2() {
        return this.url;
    }

    @l
    public final String component3() {
        return this.name;
    }

    @m
    public final File component4() {
        return this.file;
    }

    @m
    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    @l
    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    @l
    public final CachedFile copy(@l String s, @l String s1, @l String s2, @m File file0, @m String s3, long v, @l String s4, int v1) {
        L.p(s, "objectId");
        L.p(s1, "url");
        L.p(s2, "name");
        L.p(s4, "protocol");
        return new CachedFile(s, s1, s2, file0, s3, v, s4, v1);
    }

    public static CachedFile copy$default(CachedFile cachedFile0, String s, String s1, String s2, File file0, String s3, long v, String s4, int v1, int v2, Object object0) {
        String s5 = (v2 & 1) == 0 ? s : cachedFile0.objectId;
        String s6 = (v2 & 2) == 0 ? s1 : cachedFile0.url;
        String s7 = (v2 & 4) == 0 ? s2 : cachedFile0.name;
        File file1 = (v2 & 8) == 0 ? file0 : cachedFile0.file;
        String s8 = (v2 & 16) == 0 ? s3 : cachedFile0.extension;
        long v3 = (v2 & 0x20) == 0 ? v : cachedFile0.contentLength;
        String s9 = (v2 & 0x40) == 0 ? s4 : cachedFile0.protocol;
        return (v2 & 0x80) == 0 ? cachedFile0.copy(s5, s6, s7, file1, s8, v3, s9, v1) : cachedFile0.copy(s5, s6, s7, file1, s8, v3, s9, cachedFile0.priority);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CachedFile)) {
            return false;
        }
        if(!L.g(this.objectId, ((CachedFile)object0).objectId)) {
            return false;
        }
        if(!L.g(this.url, ((CachedFile)object0).url)) {
            return false;
        }
        if(!L.g(this.name, ((CachedFile)object0).name)) {
            return false;
        }
        if(!L.g(this.file, ((CachedFile)object0).file)) {
            return false;
        }
        if(!L.g(this.extension, ((CachedFile)object0).extension)) {
            return false;
        }
        if(this.contentLength != ((CachedFile)object0).contentLength) {
            return false;
        }
        return L.g(this.protocol, ((CachedFile)object0).protocol) ? this.priority == ((CachedFile)object0).priority : false;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    @m
    public final String getExtension() {
        return this.extension;
    }

    @m
    public final File getFile() {
        return this.file;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    @l
    public final String getProtocol() {
        return this.protocol;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    @Override
    public int hashCode() {
        int v = this.objectId.hashCode();
        int v1 = this.url.hashCode();
        int v2 = this.name.hashCode();
        int v3 = 0;
        int v4 = this.file == null ? 0 : this.file.hashCode();
        String s = this.extension;
        if(s != null) {
            v3 = s.hashCode();
        }
        return ((((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v4) * 0x1F + v3) * 0x1F + ((int)(this.contentLength ^ this.contentLength >>> 0x20))) * 0x1F + this.protocol.hashCode()) * 0x1F + this.priority;
    }

    @Override
    @l
    public String toString() {
        return "CachedFile(objectId=" + this.objectId + ", url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }
}

