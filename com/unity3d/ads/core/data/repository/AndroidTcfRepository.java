package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.TcfDataSource;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidTcfRepository implements TcfRepository {
    @l
    private final TcfDataSource tcfDataSource;

    public AndroidTcfRepository(@l TcfDataSource tcfDataSource0) {
        L.p(tcfDataSource0, "tcfDataSource");
        super();
        this.tcfDataSource = tcfDataSource0;
    }

    @l
    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override  // com.unity3d.ads.core.data.repository.TcfRepository
    @m
    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}

