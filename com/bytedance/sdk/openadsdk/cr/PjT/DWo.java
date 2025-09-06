package com.bytedance.sdk.openadsdk.cr.PjT;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.cz.PjT.Zh.ReZ;
import com.bytedance.sdk.component.cz.PjT.Zh.Zh;
import com.bytedance.sdk.component.cz.PjT.cr.PjT;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.ltE;
import com.bytedance.sdk.openadsdk.core.settings.SM;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.JQp;
import com.bytedance.sdk.openadsdk.ub.cr;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class DWo implements ReZ {
    public ltE PjT;
    private final com.bytedance.sdk.openadsdk.cr.PjT.ReZ Zh;

    public DWo() {
        this.Zh = com.bytedance.sdk.openadsdk.cr.PjT.ReZ.PjT();
    }

    // 去混淆评级： 低(20)
    private boolean PjT(List list0, JQp jQp0) {
        return this.ReZ(list0) ? false : jQp0.Zh >= 400 && jQp0.Zh < 500;
    }

    public JQp PjT(List list0) {
        if(this.PjT == null) {
            this.PjT = ub.ReZ();
        }
        if(this.PjT == null) {
            return null;
        }
        int v = xs.Gr().kFP();
        if(3 == v) {
            List list1 = this.Zh.PjT(list0, false);
            JSONObject jSONObject0 = this.Zh.Zh();
            JSONObject jSONObject1 = this.Zh.PjT(list1, System.currentTimeMillis(), jSONObject0, true);
            return this.PjT.PjT(jSONObject1, this.Zh.PjT(list0), true);
        }
        if(2 == v) {
            long v1 = System.currentTimeMillis();
            JSONObject jSONObject2 = this.Zh.Zh();
            List list2 = this.Zh.PjT(list0, true);
            JSONObject jSONObject3 = this.Zh.PjT(list2, v1, jSONObject2, true);
            this.PjT.PjT(jSONObject3, this.Zh.PjT(list0), true);
            List list3 = this.Zh.Zh(list0);
            JSONObject jSONObject4 = this.Zh.PjT(list3, v1, jSONObject2, false);
            return this.PjT.PjT(jSONObject4, this.Zh.PjT(list0), false);
        }
        JSONObject jSONObject5 = this.Zh.Zh();
        JSONObject jSONObject6 = this.Zh.PjT(list0, System.currentTimeMillis(), jSONObject5, false);
        return this.PjT.PjT(jSONObject6, this.Zh.PjT(list0), false);
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.Zh.ReZ
    public void PjT(List list0, @Nullable Zh zh0) {
        if(list0 != null && !list0.isEmpty() && ub.cr().oMU()) {
            PjT pjT0 = (PjT)list0.get(0);
            if(pjT0 == null) {
                return;
            }
            int v = pjT0.cr();
            ArrayList arrayList0 = new ArrayList();
            if(v == 0) {
                com.bytedance.sdk.openadsdk.ub.ReZ.PjT(new cr() {
                    final DWo PjT;

                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                        pjT0.Zh("applog");
                        return pjT0;
                    }
                });
                Jo.PjT(new com.bytedance.sdk.component.Au.ReZ.Zh(7, "upload_ad_event") {
                    final DWo cr;

                    @Override
                    public void run() {
                        Iterator iterator0;
                        try {
                            iterator0 = DWo.this.cr(list0).entrySet().iterator();
                        }
                        catch(Throwable throwable0) {
                            RD.Zh("OverSeaEventUploadImp", throwable0.getMessage());
                            iterator0 = null;
                        }
                        if(iterator0 == null) {
                            Zh zh0 = zh0;
                            if(zh0 != null) {
                                zh0.PjT(arrayList0);
                            }
                            return;
                        }
                        while(iterator0.hasNext()) {
                            try {
                                com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.cr);
                                Object object0 = iterator0.next();
                                List list0 = (List)((Map.Entry)object0).getValue();
                                ArrayList arrayList0 = new ArrayList();
                                for(Object object1: list0) {
                                    JSONObject jSONObject0 = ((PjT)object1).XX();
                                    arrayList0.add(new com.bytedance.sdk.openadsdk.cr.PjT(((PjT)object1).ReZ(), jSONObject0));
                                }
                                JQp jQp0 = DWo.this.PjT(arrayList0);
                                if(zh0 != null && jQp0 != null) {
                                    boolean z = DWo.this.PjT(arrayList0, jQp0) ? true : jQp0.cr;
                                    com.bytedance.sdk.component.cz.PjT.Zh.ReZ.PjT pjT0 = new com.bytedance.sdk.component.cz.PjT.Zh.ReZ.PjT(new com.bytedance.sdk.component.cz.PjT.Zh.ReZ.Zh(jQp0.PjT, jQp0.Zh, jQp0.ReZ, z, ""), list0);
                                    arrayList0.add(pjT0);
                                    if(jQp0.Zh == 200) {
                                        com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.cr, true);
                                        com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new cr() {
                                            final com.bytedance.sdk.openadsdk.cr.PjT.DWo.2 PjT;

                                            @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                                pjT0.Zh("applog");
                                                return pjT0;
                                            }
                                        });
                                    }
                                    else if(z) {
                                        com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.cr, false);
                                        com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new cr() {
                                            final com.bytedance.sdk.openadsdk.cr.PjT.DWo.2 PjT;

                                            @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                                pjT0.Zh("applog");
                                                return pjT0;
                                            }
                                        });
                                    }
                                    else {
                                        com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new cr() {
                                            final com.bytedance.sdk.openadsdk.cr.PjT.DWo.2 PjT;

                                            @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                            public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                                com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                                pjT0.Zh("applog");
                                                return pjT0;
                                            }
                                        });
                                    }
                                }
                                if(zh0 == null || jQp0 != null) {
                                    continue;
                                }
                                com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new cr() {
                                    final com.bytedance.sdk.openadsdk.cr.PjT.DWo.2 PjT;

                                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                        pjT0.Zh("applog");
                                        return pjT0;
                                    }
                                });
                                continue;
                            }
                            catch(Throwable throwable1) {
                            }
                            RD.Zh("OverSeaEventUploadImp", throwable1.getMessage());
                        }
                        Zh zh1 = zh0;
                        if(zh1 != null) {
                            zh1.PjT(arrayList0);
                        }
                    }
                });
                return;
            }
            if(v == 1) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: list0) {
                    JSONObject jSONObject0 = ((PjT)object0).XX();
                    arrayList1.add(new com.bytedance.sdk.openadsdk.qla.ReZ.ReZ.PjT(((PjT)object0).ReZ(), jSONObject0));
                }
                com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.JQp);
                if(arrayList1.size() > 0) {
                    com.bytedance.sdk.openadsdk.ub.ReZ.PjT(new cr() {
                        final DWo PjT;

                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                            pjT0.Zh("stats");
                            return pjT0;
                        }
                    });
                    Jo.PjT(new com.bytedance.sdk.component.Au.ReZ.Zh(6, "upload_stats_event") {
                        final DWo JQp;

                        @Override
                        public void run() {
                            JQp jQp0 = DWo.this.Zh(arrayList1);
                            if(zh0 != null && jQp0 != null) {
                                com.bytedance.sdk.component.cz.PjT.Zh.ReZ.PjT pjT0 = new com.bytedance.sdk.component.cz.PjT.Zh.ReZ.PjT(new com.bytedance.sdk.component.cz.PjT.Zh.ReZ.Zh(jQp0.PjT, jQp0.Zh, jQp0.ReZ, jQp0.cr, ""), list0);
                                arrayList0.add(pjT0);
                                zh0.PjT(arrayList0);
                                if(jQp0.Zh == 200) {
                                    com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.JQp, true);
                                    com.bytedance.sdk.openadsdk.ub.ReZ.Zh(new cr() {
                                        final com.bytedance.sdk.openadsdk.cr.PjT.DWo.4 PjT;

                                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                            pjT0.Zh("stats");
                                            return pjT0;
                                        }
                                    });
                                }
                                else if(jQp0.cr) {
                                    com.bytedance.sdk.openadsdk.cr.PjT.PjT.PjT(com.bytedance.sdk.openadsdk.cr.PjT.PjT.JQp, false);
                                    com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new cr() {
                                        final com.bytedance.sdk.openadsdk.cr.PjT.DWo.4 PjT;

                                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                            pjT0.Zh("stats");
                                            return pjT0;
                                        }
                                    });
                                }
                                else {
                                    com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new cr() {
                                        final com.bytedance.sdk.openadsdk.cr.PjT.DWo.4 PjT;

                                        @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                        public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                            com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                            pjT0.Zh("stats");
                                            return pjT0;
                                        }
                                    });
                                }
                            }
                            if(zh0 != null && jQp0 == null) {
                                com.bytedance.sdk.openadsdk.ub.ReZ.ReZ(new cr() {
                                    final com.bytedance.sdk.openadsdk.cr.PjT.DWo.4 PjT;

                                    @Override  // com.bytedance.sdk.openadsdk.ub.cr
                                    public com.bytedance.sdk.openadsdk.ub.Zh.PjT generatorModel() {
                                        com.bytedance.sdk.openadsdk.ub.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.ub.Zh.PjT();
                                        pjT0.Zh("stats");
                                        return pjT0;
                                    }
                                });
                            }
                        }
                    });
                }
            }
        }
    }

    private boolean ReZ(List list0) {
        if(list0 != null && list0.size() != 0) {
            JSONObject jSONObject0 = ((com.bytedance.sdk.openadsdk.cr.PjT)list0.get(0)).ReZ();
            return jSONObject0 == null ? true : TextUtils.isEmpty(jSONObject0.optString("app_log_url"));
        }
        return true;
    }

    public JQp Zh(List list0) {
        if(this.PjT == null) {
            this.PjT = ub.ReZ();
        }
        if(list0 != null && list0.size() != 0 && SM.PjT()) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: list0) {
                    jSONArray0.put(((com.bytedance.sdk.openadsdk.qla.ReZ.ReZ.PjT)object0).Zh);
                }
                jSONObject0.put("stats_list", jSONArray0);
                long v = System.currentTimeMillis();
                jSONObject0.put("ts", v / 1000L);
                jSONObject0.put("ts_ms", v);
                boolean z = com.bytedance.sdk.openadsdk.core.SM.Zh().cr() != null;
                jSONObject0.put("req_sign", com.bytedance.sdk.component.utils.JQp.PjT(("" + v / 1000L + "7.1.0.4")));
                jSONObject0.put("req_uniq", com.bytedance.sdk.component.utils.JQp.PjT(("dc3f860c-4917-40f4-b3d7-ccc009440b3b-" + v)));
            }
            catch(Throwable unused_ex) {
                return null;
            }
            return this.PjT.Zh(jSONObject0);
        }
        return null;
    }

    private HashMap cr(List list0) {
        HashMap hashMap0 = new HashMap();
        new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            PjT pjT0 = (PjT)list0.get(v);
            JSONObject jSONObject0 = pjT0.XX();
            if(jSONObject0 != null) {
                String s = jSONObject0.optString("app_log_url");
                List list1 = (List)hashMap0.get(s);
                if(list1 == null) {
                    list1 = new ArrayList();
                    hashMap0.put(s, list1);
                }
                list1.add(pjT0);
            }
        }
        return hashMap0;
    }
}

