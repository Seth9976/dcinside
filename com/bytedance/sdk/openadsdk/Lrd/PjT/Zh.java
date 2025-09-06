package com.bytedance.sdk.openadsdk.Lrd.PjT;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    private final Runnable Au;
    private final AtomicInteger JQp;
    private int PjT;
    private final AtomicBoolean ReZ;
    private long XX;
    private final Owx Zh;
    private final AtomicBoolean cr;
    private long cz;

    public Zh(Owx owx0) {
        this.PjT = ReZ.Zh;
        this.ReZ = new AtomicBoolean(false);
        this.cr = new AtomicBoolean(true);
        this.JQp = new AtomicInteger(0);
        this.cz = 0L;
        this.XX = 0L;
        this.Au = () -> {
            if(Zh.this.ReZ.compareAndSet(false, true)) {
                Zh.this.Zh();
                long v = Zh.this.XX + (SystemClock.elapsedRealtime() - Zh.this.cz);
                Zh.this.XX = v;
                Jo.ReZ(new Au("ev_tracker") {
                    final Zh Zh;

                    @Override
                    public void run() {
                        String s = wN.PjT(Zh.this.Zh);
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            jSONObject0.put("ev_wait_time_server", Zh.this.Zh.Mn() * 1000);
                            jSONObject0.put("ev_wait_time_client", v);
                        }
                        catch(JSONException jSONException0) {
                            RD.Zh("EvTracker", jSONException0.getMessage());
                        }
                        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(Zh.this.Zh, s, Zh.this.Zh.MT(), jSONObject0);
                    }
                });
            }
        };
        this.Zh = owx0;
    }

    private void JQp() {
        if(this.JQp.get() == 2) {
            this.cz = SystemClock.elapsedRealtime();
            Handler handler0 = PjT.PjT();
            if(handler0 != null) {
                handler0.postDelayed(this.Au, ((long)this.PjT) - this.XX);
            }
            this.JQp.set(1);
        }
    }

    public void PjT() {
        if(this.JQp.get() != 0) {
            return;
        }
        this.PjT = this.Zh.Mn() * 1000;
        this.JQp.set(1);
        this.cz = SystemClock.elapsedRealtime();
        Handler handler0 = PjT.PjT();
        if(handler0 != null) {
            handler0.postDelayed(this.Au, ((long)this.PjT));
        }
    }

    public void PjT(int v) {
        if(this.JQp.get() == 3) {
            return;
        }
        Handler handler0 = PjT.PjT();
        if(handler0 == null) {
            return;
        }
        handler0.post(new Runnable() {
            final Zh Zh;

            @Override
            public void run() {
                if(v == 4 && Zh.this.cr.get()) {
                    Zh.this.JQp();
                    return;
                }
                int v = v;
                if(v == 8) {
                    Zh.this.cz();
                    return;
                }
                if(v == 5) {
                    Zh.this.cr();
                }
            }
        });
    }

    public void PjT(boolean z) {
        this.cr.set(z);
    }

    public boolean ReZ() {
        return this.JQp.get() == 3;
    }

    public void Zh() {
        this.JQp.set(3);
        Handler handler0 = PjT.PjT();
        if(handler0 != null) {
            handler0.removeCallbacks(this.Au);
        }
    }

    // 检测为 Lambda 实现
    private void cr() [...]

    private void cz() {
        if(this.JQp.get() == 1 && this.cz != 0L) {
            Handler handler0 = PjT.PjT();
            if(handler0 != null) {
                handler0.removeCallbacks(this.Au);
            }
            this.XX += SystemClock.elapsedRealtime() - this.cz;
            this.cz = 0L;
            this.JQp.set(2);
        }
    }

    class com.bytedance.sdk.openadsdk.Lrd.PjT.Zh.3 implements Runnable {
        final Zh PjT;

        @Override
        public void run() {
            Zh.this.cr();
        }
    }

}

