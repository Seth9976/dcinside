package com.bytedance.sdk.openadsdk.Owx.PjT;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.openadsdk.RD.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.xf.cz;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class cr {
    private int JQp;
    private final Handler PjT;
    private int ReZ;
    private static volatile cr Zh;
    private int cr;
    private final ArrayList cz;

    private cr() {
        this.ReZ = 0;
        this.cr = 2;
        this.JQp = 3600000;
        this.cz = new ArrayList();
        Jo.Zh(new Au("pag_pre_render_init") {
            final cr PjT;

            @Override
            public void run() {
                int v = PjT.PjT("plb_pre_render_enable", 0);
                cr.this.ReZ = v;
                int v1 = PjT.PjT("plb_pre_render_max_count", 2);
                cr.this.cr = v1;
                if(cr.this.cr <= 0 || cr.this.cr > 4) {
                    cr.this.cr = 2;
                }
                int v2 = PjT.PjT("plb_pre_render_alive_time", 3600000);
                cr.this.JQp = v2;
                if(cr.this.JQp <= 0 || cr.this.JQp > 3600000) {
                    cr.this.JQp = 3600000;
                }
            }
        });
        this.PjT = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            final cr PjT;

            @Override  // android.os.Handler$Callback
            public boolean handleMessage(@NonNull Message message0) {
                if(message0.obj instanceof Zh) {
                    cr.this.cz.remove(message0.obj);
                    ((Zh)message0.obj).cr();
                    return true;
                }
                return false;
            }
        });
    }

    public static cr PjT() {
        if(cr.Zh == null) {
            Class class0 = cr.class;
            __monitor_enter(class0);
            try {
                if(cr.Zh == null) {
                    cr.Zh = new cr();
                }
                __monitor_exit(class0);
                return cr.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cr.Zh;
    }

    @MainThread
    public Zh PjT(@NonNull Owx owx0, FrameLayout frameLayout0, cz cz0) {
        Zh zh1;
        if(this.Zh() && owx0.ig() != null && !TextUtils.isEmpty(owx0.ig().getBidAdm()) && cRA.cz(owx0) && frameLayout0 != null) {
            String s = owx0.ydj();
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            int v;
            for(v = 0; true; ++v) {
                if(v >= this.cz.size()) {
                    v = -1;
                    zh1 = null;
                    break;
                }
                Zh zh0 = (Zh)this.cz.get(v);
                if(s.equals(zh0.Au())) {
                    zh1 = zh0;
                    break;
                }
            }
            if(zh1 != null) {
                this.PjT.removeMessages(s.hashCode());
                this.cz.remove(v);
                this.cz.size();
                owx0.DWo(true);
                zh1.PjT(frameLayout0, cz0);
                ReZ.PjT(owx0, wN.ReZ(owx0.ig().getDurationSlotType()), "PL_use_pre_render", new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                    final cr PjT;

                    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                    public JSONObject PjT() {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            jSONObject0.put("is_pre_render", 1);
                        }
                        catch(JSONException unused_ex) {
                        }
                        return jSONObject0;
                    }
                });
                return zh1;
            }
        }
        return null;
    }

    @MainThread
    public void PjT(@Nullable Owx owx0) {
        if(this.Zh() && owx0 != null && cRA.cz(owx0)) {
            String s = owx0.ydj();
            if(TextUtils.isEmpty(s)) {
                return;
            }
            Jo.PjT(new Runnable() {
                final cr ReZ;

                @Override
                public void run() {
                    try {
                        if(cr.this.cz.size() >= cr.this.cr) {
                            cr.this.cz.size();
                            Zh zh0 = (Zh)cr.this.cz.remove(0);
                            if(zh0 != null) {
                                cr.this.PjT.removeMessages(zh0.Au().hashCode());
                                zh0.cr();
                            }
                        }
                        owx0.DWo(true);
                        Context context0 = ub.PjT();
                        int v = owx0.jK();
                        FrameLayout frameLayout0 = new FrameLayout(ub.PjT());
                        Zh zh1 = new Zh(context0, owx0, v, true, frameLayout0, s);
                        cr.this.cz.add(zh1);
                        zh1.XX();
                        Message message0 = Message.obtain();
                        message0.what = s.hashCode();
                        message0.obj = zh1;
                        cr.this.PjT.sendMessageDelayed(message0, ((long)cr.this.JQp));
                        zh1.PjT(new com.bytedance.sdk.openadsdk.Owx.PjT.PjT.PjT() {
                            final com.bytedance.sdk.openadsdk.Owx.PjT.cr.3 Zh;

                            @Override  // com.bytedance.sdk.openadsdk.Owx.PjT.PjT$PjT
                            public void PjT() {
                                cr.this.PjT.removeMessages(com.bytedance.sdk.openadsdk.Owx.PjT.cr.3.this.Zh.hashCode());
                                cr.this.cz.remove(zh1);
                                zh1.cr();
                            }
                        });
                        String s = wN.ReZ(owx0.ig().getDurationSlotType());
                        com.bytedance.sdk.openadsdk.Owx.PjT.cr.3.2 cr$3$20 = new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                            final com.bytedance.sdk.openadsdk.Owx.PjT.cr.3 PjT;

                            @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                            public JSONObject PjT() {
                                JSONObject jSONObject0 = new JSONObject();
                                try {
                                    jSONObject0.put("is_pre_render", 1);
                                }
                                catch(JSONException unused_ex) {
                                }
                                return jSONObject0;
                            }
                        };
                        ReZ.PjT(owx0, s, "PL_start_pre_render", cr$3$20);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            });
        }
    }

    public boolean Zh() {
        return this.ReZ == 1;
    }
}

