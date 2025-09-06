package com.unity3d.ads.metadata;

import android.content.Context;

public class PlayerMetaData extends MetaData {
    public static final String KEY_SERVER_ID = "server_id";

    public PlayerMetaData(Context context0) {
        super(context0);
        this.setCategory("player");
    }

    public void setServerId(String s) {
        this.set("server_id", s);
    }
}

