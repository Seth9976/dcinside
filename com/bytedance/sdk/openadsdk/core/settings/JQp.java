package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.RD;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public interface JQp {
    public interface PjT {
        PjT PjT(String arg1);

        PjT PjT(String arg1, float arg2);

        PjT PjT(String arg1, int arg2);

        PjT PjT(String arg1, long arg2);

        PjT PjT(String arg1, String arg2);

        PjT PjT(String arg1, boolean arg2);

        void PjT();
    }

    public interface Zh {
        Object Zh(String arg1);
    }

    public static final Zh PjT;
    public static final Zh Zh;

    static {
        JQp.PjT = new Zh() {
            public JSONObject PjT(String s) {
                try {
                    return new JSONObject(s);
                }
                catch(Exception exception0) {
                    RD.PjT("ISettingsDataRepository", "", exception0);
                    return null;
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$Zh
            public Object Zh(String s) {
                return this.PjT(s);
            }
        };
        JQp.Zh = new Zh() {
            public Set PjT(String s) {
                Set set0 = new HashSet();
                try {
                    JSONArray jSONArray0 = new JSONArray(s);
                    int v = jSONArray0.length();
                label_4:
                    for(int v1 = 0; v1 < v; ++v1) {
                        ((HashSet)set0).add(jSONArray0.getString(v1));
                    }
                }
                catch(Exception exception0) {
                    RD.PjT("ISettingsDataRepository", "", exception0);
                    if(true) {
                        return set0;
                    }
                    goto label_4;
                }
                return set0;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.settings.JQp$Zh
            public Object Zh(String s) {
                return this.PjT(s);
            }
        };
    }

    void PjT(JSONObject arg1);
}

