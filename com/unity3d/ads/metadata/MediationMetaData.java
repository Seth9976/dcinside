package com.unity3d.ads.metadata;

import android.content.Context;

public class MediationMetaData extends MetaData {
    public static final String KEY_MISSED_IMPRESSION_ORDINAL = "missedImpressionOrdinal";
    public static final String KEY_NAME = "name";
    public static final String KEY_ORDINAL = "ordinal";
    public static final String KEY_VERSION = "version";

    public MediationMetaData(Context context0) {
        super(context0);
        this.setCategory("mediation");
    }

    public void setMissedImpressionOrdinal(int v) {
        this.set("missedImpressionOrdinal", v);
    }

    public void setName(String s) {
        this.set("name", s);
    }

    public void setOrdinal(int v) {
        this.set("ordinal", v);
    }

    public void setVersion(String s) {
        this.set("version", s);
    }
}

