package com.igaworks.ssp;

import android.content.Context;
import com.igaworks.ssp.rewardplus.listener.IRewardAdEventCallbackListener;
import org.json.JSONObject;

public abstract class i0 {
    public static void a(Context context0, JSONObject jSONObject0) {
        class a implements N {
            final Context a;

            a(Context context0) {
            }

            @Override  // com.igaworks.ssp.N
            public void a(e t$e0, String s, boolean z) {
                IRewardAdEventCallbackListener iRewardAdEventCallbackListener0 = E.g().h();
                if(iRewardAdEventCallbackListener0 != null) {
                    iRewardAdEventCallbackListener0.OnEventResult(1, this.a.getString(string.apssp_pointbox_claim_success));
                }
            }

            @Override  // com.igaworks.ssp.N
            public void b(e t$e0, String s, boolean z) {
                IRewardAdEventCallbackListener iRewardAdEventCallbackListener0 = E.g().h();
                if(s != null) {
                    try {
                        if(!s.isEmpty()) {
                            int v = new JSONObject(s).getInt("result_code");
                            if(iRewardAdEventCallbackListener0 != null) {
                                switch(v) {
                                    case 6108: {
                                        iRewardAdEventCallbackListener0.OnEventResult(6108, this.a.getString(string.apssp_pointbox_claim_error_user_limit));
                                        return;
                                    }
                                    case 6109: {
                                        iRewardAdEventCallbackListener0.OnEventResult(6109, this.a.getString(string.apssp_pointbox_claim_error_media_month_limit));
                                        return;
                                    }
                                    default: {
                                        iRewardAdEventCallbackListener0.OnEventResult(2, this.a.getString(string.apssp_pointbox_claim_error));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }

        t t0 = E.g().d();
        a i0$a0 = new a(context0);
        t0.a(context0, e.J, jSONObject0, i0$a0);
    }

    public static void a(Context context0, JSONObject jSONObject0, N n0) {
        E.g().d().a(context0, e.K, jSONObject0, n0);
    }
}

