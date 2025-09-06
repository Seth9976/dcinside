package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene;
import com.bytedance.sdk.component.utils.PjT;
import org.json.JSONObject;

public class RD implements IDefaultEncrypt {
    private final CryptDataScene PjT;

    public RD(CryptDataScene pangleEncryptConstant$CryptDataScene0) {
        this.PjT = pangleEncryptConstant$CryptDataScene0;
    }

    @Override  // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject0, int v) {
        Sks.PjT(1, this.PjT, v);
        return PjT.PjT(jSONObject0);
    }
}

