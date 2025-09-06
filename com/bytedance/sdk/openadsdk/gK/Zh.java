package com.bytedance.sdk.openadsdk.gK;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.Zh.PjT.Au;
import com.bytedance.sdk.component.Zh.PjT.PjT.PjT.SM;
import com.bytedance.sdk.component.Zh.PjT.cr;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xs;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.core.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.gK.PjT.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    public class PjT implements Au {
        final Zh PjT;

        @Override  // com.bytedance.sdk.component.Zh.PjT.Au
        public qla PjT(com.bytedance.sdk.component.Zh.PjT.Au.PjT au$PjT0) throws IOException {
            xs xs0 = au$PjT0.PjT();
            if(xs0.Zh() != null && !xs0.Zh().cr().isEmpty()) {
                List list0 = xs0.Zh().cr();
                StringBuilder stringBuilder0 = new StringBuilder();
                for(Object object0: list0) {
                    stringBuilder0.append("/");
                    stringBuilder0.append(((String)object0));
                }
                String s = stringBuilder0.toString();
                return TextUtils.isEmpty(s) || !s.equals("/monitor/collect/c/session") ? au$PjT0.PjT(xs0.SM().Zh()) : au$PjT0.PjT(xs0);
            }
            return au$PjT0.PjT(xs0.SM().Zh());
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Zh PjT;
    private ReZ ReZ;
    private final com.bytedance.sdk.component.XX.PjT Zh;
    private final Map cr;

    private Zh(Context context0) {
        this.cr = new HashMap();
        com.bytedance.sdk.component.XX.PjT.PjT pjT$PjT0 = new com.bytedance.sdk.component.XX.PjT.PjT();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.XX.PjT pjT0 = pjT$PjT0.PjT(10000L, timeUnit0).Zh(10000L, timeUnit0).ReZ(10000L, timeUnit0).PjT(new PjT(this)).PjT(true).PjT();
        this.Zh = pjT0;
        com.bytedance.sdk.component.Zh.PjT.PjT.PjT.PjT.PjT(new SM() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.component.Zh.PjT.PjT.PjT.SM
            public ExecutorService PjT() {
                return com.bytedance.sdk.openadsdk.core.settings.xs.Gr().jK() ? Jo.qj() : null;
            }

            @Override  // com.bytedance.sdk.component.Zh.PjT.PjT.PjT.SM
            public boolean Zh() {
                return com.bytedance.sdk.openadsdk.core.settings.xs.Gr().jK();
            }
        });
        cr cr0 = pjT0.JQp().PjT();
        if(cr0 != null) {
            cr0.PjT(0x20);
        }
    }

    public static Zh PjT() {
        if(Zh.PjT == null) {
            Class class0 = Zh.class;
            __monitor_enter(class0);
            try {
                if(Zh.PjT == null) {
                    Zh.PjT = new Zh(ub.PjT());
                }
                __monitor_exit(class0);
                return Zh.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return Zh.PjT;
    }

    static JSONObject PjT(Zh zh0, String s) {
        return zh0.PjT(s);
    }

    private JSONObject PjT(String s) {
        JSONObject jSONObject0 = (JSONObject)this.cr.get(s);
        if(jSONObject0 == null) {
            JSONObject jSONObject1 = new JSONObject();
            try {
                jSONObject1.put("ipv6", s);
            }
            catch(JSONException unused_ex) {
            }
            jSONObject0 = PangleEncryptManager.encryptType4(jSONObject1, new RD(CryptDataScene.UNKNOWN));
            this.cr.put(s, jSONObject0);
        }
        return jSONObject0;
    }

    public void PjT(int v, ImageView imageView0, Owx owx0) {
        if(owx0 != null && TextUtils.isEmpty(owx0.DWo())) {
            return;
        }
        com.bytedance.sdk.openadsdk.SM.cr.PjT(owx0.DWo()).PjT(v).Zh(v).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).ReZ(2).PjT(com.bytedance.sdk.openadsdk.SM.ReZ.PjT(owx0, owx0.DWo(), imageView0));
        if(imageView0 != null) {
            imageView0.setOnClickListener(new View.OnClickListener() {
                final Zh ReZ;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(imageView0.getDrawable() != null) {
                        Intent intent0 = new Intent();
                        String s = owx0.qj();
                        intent0.setAction("android.intent.action.VIEW");
                        intent0.setData(Uri.parse(s));
                        try {
                            com.bytedance.sdk.component.utils.Zh.PjT(ub.PjT(), intent0, null);
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                }
            });
        }
    }

    public void PjT(xE xE0, ImageView imageView0, Owx owx0) {
        if(xE0 != null && !TextUtils.isEmpty(xE0.PjT()) && imageView0 != null) {
            com.bytedance.sdk.openadsdk.SM.cr.PjT(xE0).ReZ(2).PjT(com.bytedance.sdk.openadsdk.SM.ReZ.PjT(owx0, xE0.PjT(), imageView0));
        }
    }

    public void PjT(xE xE0, ImageView imageView0, Owx owx0, com.bytedance.sdk.component.JQp.xE xE1) {
        if(xE0 != null && !TextUtils.isEmpty(xE0.PjT()) && imageView0 != null) {
            com.bytedance.sdk.openadsdk.SM.cr.PjT(xE0).ReZ(2).PjT(com.bytedance.sdk.openadsdk.SM.ReZ.PjT(owx0, xE0.PjT(), imageView0, xE1));
        }
    }

    public void PjT(String s, int v, int v1, ImageView imageView0, Owx owx0) {
        com.bytedance.sdk.openadsdk.SM.cr.PjT(s).PjT(v).Zh(v1).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).ReZ(2).PjT(com.bytedance.sdk.openadsdk.SM.ReZ.PjT(owx0, s, imageView0));
    }

    public void PjT(String s, View view0) {
        if(view0 != null && !TextUtils.isEmpty(s)) {
            WeakReference weakReference0 = new WeakReference(view0);
            com.bytedance.sdk.openadsdk.SM.cr.PjT(s).ReZ(2).PjT(new com.bytedance.sdk.component.JQp.Au() {
                final Zh Zh;

                @Override  // com.bytedance.sdk.component.JQp.Au
                public Bitmap PjT(Bitmap bitmap0) {
                    View view0 = (View)weakReference0.get();
                    return view0 == null ? null : com.bytedance.sdk.component.adexpress.cr.PjT.PjT(view0.getContext(), bitmap0, 10);
                }
            }).PjT(new com.bytedance.sdk.component.JQp.xE() {
                final Zh Zh;

                @Override  // com.bytedance.sdk.component.JQp.xE
                public void PjT(int v, String s, Throwable throwable0) {
                }

                @Override  // com.bytedance.sdk.component.JQp.xE
                public void PjT(qj qj0) {
                    if(qj0 == null) {
                        return;
                    }
                    Object object0 = qj0.Zh();
                    if(object0 instanceof Bitmap) {
                        View view0 = (View)weakReference0.get();
                        if(view0 == null) {
                            return;
                        }
                        if(Jo.cz()) {
                            if(view0 instanceof ImageView) {
                                ((ImageView)view0).setImageDrawable(new BitmapDrawable(view0.getResources(), ((Bitmap)object0)));
                                return;
                            }
                            view0.setBackground(new BitmapDrawable(view0.getResources(), ((Bitmap)object0)));
                            return;
                        }
                        view0.post(new Runnable() {
                            final com.bytedance.sdk.openadsdk.gK.Zh.3 ReZ;

                            @Override
                            public void run() {
                                View view0 = view0;
                                if(view0 instanceof ImageView) {
                                    ((ImageView)view0).setImageDrawable(new BitmapDrawable(view0.getResources(), ((Bitmap)object0)));
                                    return;
                                }
                                view0.setBackground(new BitmapDrawable(view0.getResources(), ((Bitmap)object0)));
                            }
                        });
                    }
                }
            });
        }
    }

    public ReZ ReZ() {
        this.cr();
        return this.ReZ;
    }

    public com.bytedance.sdk.component.XX.PjT Zh() {
        return this.Zh;
    }

    private void cr() {
        if(this.ReZ == null) {
            this.ReZ = new ReZ();
        }
    }
}

