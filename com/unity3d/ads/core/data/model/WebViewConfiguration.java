package com.unity3d.ads.core.data.model;

import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class WebViewConfiguration {
    @l
    private final List additionalFiles;
    @l
    private final String entryPoint;
    private final int version;

    public WebViewConfiguration(int v, @l String s, @l List list0) {
        L.p(s, "entryPoint");
        L.p(list0, "additionalFiles");
        super();
        this.version = v;
        this.entryPoint = s;
        this.additionalFiles = list0;
    }

    public final int component1() {
        return this.version;
    }

    @l
    public final String component2() {
        return this.entryPoint;
    }

    @l
    public final List component3() {
        return this.additionalFiles;
    }

    @l
    public final WebViewConfiguration copy(int v, @l String s, @l List list0) {
        L.p(s, "entryPoint");
        L.p(list0, "additionalFiles");
        return new WebViewConfiguration(v, s, list0);
    }

    public static WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration0, int v, String s, List list0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = webViewConfiguration0.version;
        }
        if((v1 & 2) != 0) {
            s = webViewConfiguration0.entryPoint;
        }
        if((v1 & 4) != 0) {
            list0 = webViewConfiguration0.additionalFiles;
        }
        return webViewConfiguration0.copy(v, s, list0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WebViewConfiguration)) {
            return false;
        }
        if(this.version != ((WebViewConfiguration)object0).version) {
            return false;
        }
        return L.g(this.entryPoint, ((WebViewConfiguration)object0).entryPoint) ? L.g(this.additionalFiles, ((WebViewConfiguration)object0).additionalFiles) : false;
    }

    @l
    public final List getAdditionalFiles() {
        return this.additionalFiles;
    }

    @l
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override
    public int hashCode() {
        return (this.version * 0x1F + this.entryPoint.hashCode()) * 0x1F + this.additionalFiles.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ')';
    }
}

