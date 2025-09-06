package com.unity3d.scar.adapter.v2300.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

public class a extends QueryInfoGenerationCallback {
    private String a;
    private com.unity3d.scar.adapter.common.signals.a b;

    public a(String s, com.unity3d.scar.adapter.common.signals.a a0) {
        this.a = s;
        this.b = a0;
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String s) {
        this.b.onFailure(s);
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo0) {
        this.b.a(this.a, queryInfo0.getQuery(), queryInfo0);
    }
}

