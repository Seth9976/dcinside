package com.bytedance.sdk.openadsdk.core.DWo.Zh;

import android.content.Context;
import com.bytedance.adsdk.ugeno.SM.ReZ.PjT;

public class ReZ extends PjT {
    public ReZ(Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.adsdk.ugeno.SM.ReZ.PjT
    public String XX(String s) {
        s.hashCode();
        switch(s) {
            case "close": {
                return "tt_close_btn";
            }
            case "feedback": {
                return "tt_reward_full_feedback";
            }
            case "logo": {
                return "tt_ad_logo";
            }
            case "muted": {
                return "tt_reward_full_mute";
            }
            case "right_arrow": {
                return "tt_skip_btn";
            }
            case "unmuted": {
                return "tt_reward_full_unmute";
            }
            default: {
                return null;
            }
        }
    }
}

