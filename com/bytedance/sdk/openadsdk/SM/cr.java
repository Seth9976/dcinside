package com.bytedance.sdk.openadsdk.SM;

import android.content.Context;
import com.bytedance.sdk.component.JQp.JQp;
import com.bytedance.sdk.component.JQp.Owx;
import com.bytedance.sdk.component.JQp.RD;
import com.bytedance.sdk.component.JQp.Zh.ReZ;
import com.bytedance.sdk.component.Zh.PjT.cz;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xs;
import com.bytedance.sdk.component.utils.DWo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.ZX;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class cr {
    static final class PjT {
        static class com.bytedance.sdk.openadsdk.SM.cr.PjT.PjT implements com.bytedance.sdk.component.JQp.cr {
            private com.bytedance.sdk.openadsdk.SM.cr.PjT.PjT() {
            }

            com.bytedance.sdk.openadsdk.SM.cr.PjT.PjT(com.bytedance.sdk.openadsdk.SM.cr.1 cr$10) {
            }

            private ReZ PjT(com.bytedance.sdk.component.JQp.Zh.cr cr0, Throwable throwable0) {
                throwable0.getMessage();
                if(cr0 != null) {
                    cr0.ReZ(System.currentTimeMillis());
                }
                ReZ reZ0 = new ReZ(98765, throwable0, "net failed");
                reZ0.PjT(cr0);
                return reZ0;
            }

            private Map PjT(JQp jQp0, qla qla0) {
                if(jQp0.Zh()) {
                    cz cz0 = qla0.XX();
                    Map map0 = new HashMap();
                    int v = cz0.PjT();
                    for(int v1 = 0; v1 < v; ++v1) {
                        String s = cz0.PjT(v1);
                        String s1 = cz0.Zh(v1);
                        if(s != null) {
                            map0.put(s, s1);
                        }
                    }
                    return map0;
                }
                return null;
            }

            @Override  // com.bytedance.sdk.component.JQp.cr
            public com.bytedance.sdk.component.JQp.cz PjT(JQp jQp0) {
                return this.Zh(jQp0);
            }

            public ReZ Zh(JQp jQp0) {
                ReZ reZ1;
                ReZ reZ0;
                qj qj0 = Zh.PjT().Zh().JQp();
                xs xs0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT().Zh(jQp0.PjT()).PjT().Zh();
                qla qla0 = null;
                com.bytedance.sdk.component.JQp.Zh.cr cr0 = jQp0.ReZ() ? new com.bytedance.sdk.component.JQp.Zh.cr() : null;
                if(cr0 != null) {
                    cr0.PjT(System.currentTimeMillis());
                }
                try {
                    qla0 = qj0.PjT(xs0).Zh();
                    if(cr0 != null) {
                        cr0.Zh(System.currentTimeMillis());
                    }
                    Map map0 = this.PjT(jQp0, qla0);
                    byte[] arr_b = qla0.cz().cr();
                    reZ0 = new ReZ(qla0.ReZ(), arr_b, "", map0);
                    goto label_21;
                }
                catch(Throwable throwable0) {
                }
                try {
                    reZ1 = this.PjT(cr0, throwable0);
                }
                catch(Throwable throwable1) {
                    DWo.PjT(qla0);
                    throw throwable1;
                }
                DWo.PjT(qla0);
                return reZ1;
            label_21:
                DWo.PjT(qla0);
                return reZ0;
            }
        }

        private static int JQp;
        public static boolean PjT;
        private static int ReZ;
        private static final com.bytedance.sdk.component.JQp.qla Zh;
        private static int cr;

        static {
            PjT.Zh = PjT.PjT(ub.PjT());
            PjT.PjT = true;
            PjT.ReZ = 10;
            PjT.cr = 15;
            PjT.JQp = 30;
        }

        // 去混淆评级： 低(20)
        private static com.bytedance.sdk.component.JQp.DWo PjT(com.bytedance.sdk.component.JQp.DWo dWo0) {
            return ZX.PjT() ? dWo0.PjT(new com.bytedance.sdk.openadsdk.SM.JQp()) : dWo0;
        }

        private static com.bytedance.sdk.component.JQp.qla PjT(Context context0) {
            PjT.PjT();
            if(PjT.PjT) {
                com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh zh0 = new com.bytedance.sdk.component.JQp.cr.ReZ.PjT.Zh(0, PjT.ReZ, PjT.cr, ((long)PjT.JQp), new File(CacheDirFactory.getImageCacheDir("image_p")));
                return com.bytedance.sdk.component.JQp.cr.ReZ.Zh.PjT(context0, new com.bytedance.sdk.component.JQp.cr.ReZ.JQp.PjT().PjT(zh0).PjT(new Owx() {
                    @Override  // com.bytedance.sdk.component.JQp.Owx
                    public ExecutorService PjT() {
                        return Jo.Zh();
                    }

                    @Override  // com.bytedance.sdk.component.JQp.Owx
                    public ExecutorService Zh() {
                        return Jo.ReZ();
                    }
                }).PjT(new RD() {
                    @Override  // com.bytedance.sdk.component.JQp.RD
                    public void PjT(int v, String s) {
                        com.bytedance.sdk.openadsdk.qla.ReZ.PjT(s, true);
                    }
                }).PjT(new com.bytedance.sdk.openadsdk.SM.cr.PjT.PjT(null)).PjT());
            }
            com.bytedance.sdk.component.JQp.ReZ.PjT.PjT pjT0 = new com.bytedance.sdk.component.JQp.ReZ.PjT.PjT(Math.max(Math.min(Runtime.getRuntime().maxMemory().intValue() / 16, 0x5000000), 0xA00000), 0x2800000L, new File(CacheDirFactory.getImageCacheDir("image")));
            return com.bytedance.sdk.component.JQp.ReZ.Zh.PjT(context0, new com.bytedance.sdk.component.JQp.ReZ.JQp.PjT().PjT(pjT0).PjT(new Owx() {
                @Override  // com.bytedance.sdk.component.JQp.Owx
                public ExecutorService PjT() {
                    return Jo.Zh();
                }

                @Override  // com.bytedance.sdk.component.JQp.Owx
                public ExecutorService Zh() {
                    return null;
                }
            }).PjT(new RD() {
                @Override  // com.bytedance.sdk.component.JQp.RD
                public void PjT(int v, String s) {
                    com.bytedance.sdk.openadsdk.qla.ReZ.PjT(s, false);
                }
            }).PjT(new com.bytedance.sdk.openadsdk.SM.cr.PjT.PjT(null)).PjT());
        }

        public static void PjT() {
            PjT.PjT = com.bytedance.sdk.openadsdk.RD.PjT.PjT("image_config", "use_new_img", 1) == 1;
            PjT.ReZ = com.bytedance.sdk.openadsdk.RD.PjT.PjT("image_config", "bitmap_cache_count", 10);
            PjT.cr = com.bytedance.sdk.openadsdk.RD.PjT.PjT("image_config", "data_cache_count", 15);
            PjT.JQp = com.bytedance.sdk.openadsdk.RD.PjT.PjT("image_config", "disk_cache_count", 30);
        }

        private static com.bytedance.sdk.component.JQp.DWo Zh(xE xE0) {
            return PjT.PjT(PjT.Zh.PjT(xE0.PjT()).PjT(xE0.Zh()).Zh(xE0.ReZ()).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).PjT(xE0.XX()));
        }

        private static com.bytedance.sdk.component.JQp.DWo Zh(String s) {
            return PjT.PjT(PjT.Zh.PjT(s).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())));
        }

        private static InputStream Zh(String s, String s1) {
            return PjT.Zh.PjT(s, s1);
        }

        private static boolean Zh(String s, String s1, String s2) {
            return PjT.Zh.PjT(s, s1, s2);
        }
    }

    public static com.bytedance.sdk.component.JQp.DWo PjT(xE xE0) {
        return PjT.Zh(xE0);
    }

    public static com.bytedance.sdk.component.JQp.DWo PjT(String s) {
        return PjT.Zh(s);
    }

    public static com.bytedance.sdk.component.JQp.qla PjT() {
        return PjT.Zh;
    }

    public static InputStream PjT(String s, String s1) {
        return PjT.Zh(s, s1);
    }

    public static boolean PjT(String s, String s1, String s2) {
        return PjT.Zh(s, s1, s2);
    }

    public static boolean Zh() [...] // 潜在的解密器

    class com.bytedance.sdk.openadsdk.SM.cr.1 {
    }

}

