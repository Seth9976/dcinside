package com.bytedance.sdk.openadsdk.core.Au;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.MessageQueue;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.JQp.JQp;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import com.bytedance.sdk.component.adexpress.PjT.PjT.Zh;
import com.bytedance.sdk.component.adexpress.PjT.PjT.cr;
import com.bytedance.sdk.openadsdk.core.Au;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.aidl.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class xf {
    private static String PjT;
    private static String Zh;

    public static void PjT() {
        PjT.PjT().PjT(new Zh() {
            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.Zh
            public int PjT(String s, ContentValues contentValues0, String s1, String[] arr_s) {
                return com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), s, contentValues0, s1, arr_s);
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.Zh
            public int PjT(String s, String s1, String[] arr_s) {
                return com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), s, s1, arr_s);
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.Zh
            public Cursor PjT(String s, String[] arr_s, String s1, String[] arr_s1, String s2, String s3, String s4) {
                return new ReZ(com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), s, arr_s, s1, arr_s1, s2, s3, s4));
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.Zh
            public void PjT(String s, ContentValues contentValues0) {
                com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(ub.PjT(), s, contentValues0);
            }
        });
        PjT.PjT().PjT(new com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ() {
            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public String Au() {
                return SM.Zh().cr();
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public int DWo() {
                return ub.cr().Ld();
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public com.bytedance.sdk.component.adexpress.PjT.ReZ.PjT JQp() {
                return ub.ReZ().PjT();
            }

            private void PjT(MessageQueue messageQueue0, int v) {
                if(messageQueue0 != null && v > 0) {
                    messageQueue0.addIdleHandler(new MessageQueue.IdleHandler() {
                        final com.bytedance.sdk.openadsdk.core.Au.xf.2 ReZ;

                        @Override  // android.os.MessageQueue$IdleHandler
                        public boolean queueIdle() {
                            new com.bytedance.sdk.openadsdk.core.widget.PjT.Zh(v, true, messageQueue0).Zh();
                            return false;
                        }
                    });
                }
            }

            private void PjT(MessageQueue messageQueue0, int v, int v1) {
                if(messageQueue0 != null) {
                    int v2 = com.bytedance.sdk.openadsdk.RD.PjT.PjT("ad_load_and_render_opt", "w_p_delay", 500);
                    com.bytedance.sdk.openadsdk.core.Au.xf.2.2 xf$2$20 = new Runnable() {
                        final com.bytedance.sdk.openadsdk.core.Au.xf.2 JQp;

                        @Override
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.Au.xf.2.this.Zh(messageQueue0, v);
                            com.bytedance.sdk.openadsdk.core.Au.xf.2.this.PjT(messageQueue0, v1);
                        }
                    };
                    if(v2 > 0) {
                        fDm.ReZ().postDelayed(xf$2$20, ((long)v2));
                        return;
                    }
                    xf$2$20.run();
                }
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public int PjT() {
                return ub.cr() == null ? 0 : ub.cr().cr();
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public Handler ReZ() {
                return fDm.ReZ();
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public int SM() {
                return 1;
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public com.bytedance.sdk.component.XX.Zh.Zh XX() {
                com.bytedance.sdk.component.XX.Zh.Zh zh0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().ReZ();
                zh0.PjT(8);
                zh0.PjT("express_get");
                return zh0;
            }

            private void Zh(MessageQueue messageQueue0, int v) {
                if(messageQueue0 != null && v > 0) {
                    messageQueue0.addIdleHandler(new MessageQueue.IdleHandler() {
                        final com.bytedance.sdk.openadsdk.core.Au.xf.2 ReZ;

                        @Override  // android.os.MessageQueue$IdleHandler
                        public boolean queueIdle() {
                            new com.bytedance.sdk.openadsdk.core.widget.PjT.Zh(v, false, messageQueue0).Zh();
                            return false;
                        }
                    });
                }
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public Context Zh() {
                return ub.PjT();
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public void cr() {
                int v = ub.cr().Ld();
                int v1 = ub.cr().cI();
                if(v == 0 && v1 == 0) {
                    return;
                }
                JQp.PjT().PjT(v);
                JQp.PjT().Zh(v1);
                int v2 = com.bytedance.sdk.openadsdk.RD.PjT.cz();
                int v3 = com.bytedance.sdk.openadsdk.RD.PjT.JQp();
                if(v2 == 0 && v3 == 0) {
                    return;
                }
                MessageQueue[] arr_messageQueue = new MessageQueue[1];
                if(Build.VERSION.SDK_INT >= 23) {
                    MessageQueue messageQueue0 = fDm.ReZ().getLooper().getQueue();
                    arr_messageQueue[0] = messageQueue0;
                    this.PjT(messageQueue0, v3, v2);
                    return;
                }
                if(Looper.getMainLooper() == Looper.myLooper()) {
                    MessageQueue messageQueue1 = Looper.myQueue();
                    arr_messageQueue[0] = messageQueue1;
                    this.PjT(messageQueue1, v3, v2);
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.core.Au.xf.2 cr;

                    @Override
                    public void run() {
                        arr_messageQueue[0] = Looper.myQueue();
                        com.bytedance.sdk.openadsdk.core.Au.xf.2.this.PjT(arr_messageQueue[0], v3, v2);
                    }
                });
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public com.bytedance.sdk.component.XX.Zh.PjT cz() {
                com.bytedance.sdk.component.XX.Zh.PjT pjT0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT().Zh().cr();
                pjT0.PjT(8);
                pjT0.PjT("express_down");
                return pjT0;
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public ExecutorService fDm() {
                return Jo.xf() ? Jo.DWo() : null;
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public int qj() {
                return ub.cr().cI();
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public int qla() {
                return qZS.ReZ(ub.PjT());
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public boolean ub() {
                return com.bytedance.sdk.openadsdk.RD.PjT.PjT("destroy_render_script", true);
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public int xE() {
                return qZS.JQp(ub.PjT());
            }

            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public int xf() {
                return 0;
            }

            // 去混淆评级： 低(20)
            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ
            public ExecutorService xs() {
                return Jo.xf() ? Jo.JQp() : null;
            }
        });
        PjT.PjT().PjT(new cr() {
            @Override  // com.bytedance.sdk.component.adexpress.PjT.PjT.cr
            public void PjT(int v) {
                com.bytedance.sdk.openadsdk.qla.PjT.cr cr0 = com.bytedance.sdk.openadsdk.qla.PjT.cr.Zh().Zh(v).cz(Au.PjT(v));
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT().PjT(cr0);
            }
        });
        com.bytedance.sdk.component.SM.PjT.PjT.PjT().PjT(new com.bytedance.sdk.component.SM.PjT.Zh() {
            @Override  // com.bytedance.sdk.component.SM.PjT.Zh
            public void PjT(com.bytedance.sdk.component.SM.Zh.PjT pjT0, String s, String s1, JSONObject jSONObject0) {
                if(pjT0 != null) {
                    Owx owx0 = Owx.cz();
                    owx0.RD(pjT0.PjT());
                    owx0.Owx(pjT0.Zh());
                    owx0.gK(pjT0.ReZ());
                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(System.currentTimeMillis(), owx0, s, s1, new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                        final com.bytedance.sdk.openadsdk.core.Au.xf.4 ReZ;

                        @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                        public JSONObject PjT() {
                            return jSONObject0;
                        }
                    });
                }
            }

            @Override  // com.bytedance.sdk.component.SM.PjT.Zh
            public void PjT(com.bytedance.sdk.component.SM.Zh.PjT pjT0, String s, String s1, JSONObject jSONObject0, long v) {
                Owx owx0 = Owx.cz();
                owx0.RD(pjT0.PjT());
                owx0.Owx(pjT0.Zh());
                owx0.gK(pjT0.ReZ());
                com.bytedance.sdk.openadsdk.cr.ReZ.Zh(owx0, s, s1, jSONObject0, v);
            }

            @Override  // com.bytedance.sdk.component.SM.PjT.Zh
            public void PjT(String s, String s1, JSONObject jSONObject0) {
                com.bytedance.sdk.openadsdk.cr.ReZ.ReZ(com.bytedance.sdk.openadsdk.utils.Zh.PjT(), s, s1, jSONObject0);
            }
        });
    }

    public static String ReZ() [...] // 潜在的解密器

    @NonNull
    public static String Zh() [...] // 潜在的解密器
}

