package com.bytedance.sdk.openadsdk.Sks;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import org.json.JSONObject;

public class ReZ {
    private int JQp;
    private final String PjT;
    private cr ReZ;
    private Zh Zh;
    private PjT cr;
    private Runnable cz;

    public ReZ(cr cr0) {
        this.PjT = "StrategyCenter";
        this.Zh = null;
        this.JQp = 0;
        this.cz = () -> {
            if(ReZ.this.ReZ != null && ReZ.this.ReZ.JQp() != null && ReZ.this.ReZ.cz() != null) {
                ReZ.this.ReZ.PjT().execute(new Runnable() {
                    final ReZ PjT;

                    @Override
                    public void run() {
                        OutputStream outputStream0;
                        HttpURLConnection httpURLConnection0;
                        ++ReZ.this.JQp;
                        try {
                            if(ReZ.this.cr != null) {
                                ReZ.this.cr.PjT();
                            }
                            httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(ReZ.this.ReZ.JQp()).openConnection())));
                            if(ReZ.this.ReZ.XX() != null && ReZ.this.ReZ.XX().size() > 0) {
                                for(Object object0: ReZ.this.ReZ.XX().entrySet()) {
                                    httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                                }
                            }
                            httpURLConnection0.setRequestMethod("POST");
                            httpURLConnection0.setRequestProperty("Content-Type", "application/json");
                        }
                        catch(Throwable throwable0) {
                            goto label_41;
                        }
                        try {
                            outputStream0 = null;
                            outputStream0 = httpURLConnection0.getOutputStream();
                            outputStream0.write(ReZ.this.ReZ.cz().toString().getBytes());
                            goto label_20;
                        }
                        catch(Throwable throwable1) {
                            try {
                                if(outputStream0 != null) {
                                    outputStream0.close();
                                }
                                throw throwable1;
                            label_20:
                                outputStream0.close();
                                int v = httpURLConnection0.getResponseCode();
                                Log.i("StrategyCenter", "executing strategy fetch");
                                if(v == 200) {
                                    BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(httpURLConnection0.getInputStream()));
                                    StringBuffer stringBuffer0 = new StringBuffer();
                                    String s;
                                    while((s = bufferedReader0.readLine()) != null) {
                                        stringBuffer0.append(s);
                                    }
                                    bufferedReader0.close();
                                    JSONObject jSONObject0 = ReZ.this.ReZ.PjT(new JSONObject(stringBuffer0.toString()));
                                    ReZ.this.Zh.PjT();
                                    ReZ.this.Zh.PjT(jSONObject0);
                                    if(ReZ.this.cr != null) {
                                        ReZ.this.cr.Zh();
                                    }
                                }
                                else if(ReZ.this.cr != null) {
                                    ReZ.this.cr.PjT(v, httpURLConnection0.getResponseMessage());
                                }
                                goto label_44;
                            }
                            catch(Throwable throwable0) {
                            }
                        }
                    label_41:
                        Log.e("StrategyCenter", (throwable0.getMessage() == null ? "error " : throwable0.getMessage()));
                        if(ReZ.this.cr != null) {
                            ReZ.this.cr.PjT(-1, throwable0.getMessage());
                        }
                    label_44:
                        ReZ.this.Zh.PjT("local_last_update_time", System.currentTimeMillis());
                        ReZ.this.PjT();
                    }
                });
            }
        };
        JQp jQp0 = new JQp(cr0);
        this.ReZ = jQp0;
        String s = jQp0.ReZ();
        if(!TextUtils.isEmpty(s) && !s.startsWith("pag")) {
            s = "pag_" + s;
        }
        this.Zh = new Zh(this.ReZ.Zh(), s);
    }

    public int PjT(String s, int v) {
        return this.Zh == null ? v : this.Zh.PjT(s, v);
    }

    public String PjT(String s, String s1) {
        return this.Zh == null ? s1 : this.Zh.PjT(s, s1);
    }

    public void PjT() {
        if(this.ReZ != null) {
            int v = 3600000;
            int v1 = this.Zh.PjT("req_interval", 3600000);
            long v2 = 0L;
            long v3 = this.Zh.Zh("local_last_update_time", 0L);
            if(v1 >= 600000 && v1 <= 86400000) {
                v = v1;
            }
            long v4 = System.currentTimeMillis() - v3;
            Log.i("StrategyCenter", "before  realInterval=" + v4);
            if(v4 >= 0L && v4 <= ((long)v)) {
                v2 = ((long)v) - v4;
            }
            Log.i("StrategyCenter", "after  realInterval=" + v2);
            this.ReZ.cr().removeCallbacks(this.cz);
            if(this.JQp > 24) {
                return;
            }
            this.ReZ.cr().postDelayed(this.cz, v2);
        }
    }

    public void PjT(PjT pjT0) {
        this.cr = pjT0;
    }

    public boolean PjT(String s, boolean z) {
        return this.Zh == null ? z : this.Zh.PjT(s, z);
    }

    // 检测为 Lambda 实现
    private void Zh() [...]

    class com.bytedance.sdk.openadsdk.Sks.ReZ.2 implements Runnable {
        final ReZ PjT;

        @Override
        public void run() {
            ReZ.this.Zh();
        }
    }

}

