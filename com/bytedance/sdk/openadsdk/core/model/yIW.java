package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.qj.PjT;
import com.bytedance.sdk.openadsdk.utils.Co;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.c;

public class yIW extends Owx {
    private int AjB;
    private boolean Alu;
    private final Zh BPY;
    private String CD;
    private boolean CY;
    private String Co;
    private boolean DnO;
    private int Ebj;
    private boolean Ee;
    private int FaL;
    private String GL;
    private int GP;
    private float Gr;
    private int HG;
    private String HGd;
    private String IJ;
    private String It;
    private int JDf;
    private int JU;
    private String Jo;
    private boolean KH;
    private int KLT;
    private List KM;
    private PjT KP;
    private int Ld;
    private String Lmo;
    private xE Lrd;
    private Lrd Lrs;
    private int Lx;
    private int MN;
    private int MWx;
    private cRA NR;
    private String Nv;
    private int OL;
    private String OMu;
    private boolean Ohg;
    private xs OnL;
    private String Os;
    private final Co Owx;
    private cz Pv;
    private int QB;
    private String Qf;
    private JSONObject Qtm;
    private int RD;
    private SM RV;
    private volatile boolean RXa;
    private Yo SW;
    private int Sks;
    private int Sky;
    private String Tn;
    private int UR;
    private ub Uo;
    private String VY;
    private ltE VZ;
    private int Vs;
    private int WAt;
    private qla WHM;
    private int Wcm;
    private int Wo;
    private JQp XWz;
    private c Xe;
    private Map Xtz;
    private String Xw;
    private List Yo;
    private PAGBannerSize Yr;
    private String ZX;
    private String Zd;
    private xf ZsT;
    private long cI;
    private xE cRA;
    private int cyr;
    private String dDm;
    private int dG;
    private JSONObject dIF;
    private String dnv;
    private int dwk;
    private int en;
    private boolean es;
    private boolean fA;
    public long fDm;
    private int fK;
    private String fU;
    private long gH;
    private final List gK;
    private int hLk;
    private int hN;
    private int hx;
    private Sks iZF;
    private String iZZ;
    private cr ig;
    private com.bytedance.sdk.openadsdk.core.model.Owx.PjT ix;
    private int jK;
    private com.bytedance.sdk.openadsdk.core.DWo.XX.PjT joj;
    private int jp;
    private c kFP;
    private com.bytedance.sdk.openadsdk.core.DWo.XX.PjT kNB;
    private boolean kW;
    private int kWj;
    private int kph;
    private final List ltE;
    private AdSlot na;
    private int oG;
    private String oMU;
    private int pBJ;
    private int qZS;
    protected int qla;
    private qj rds;
    private int sjb;
    private int tT;
    private String tY;
    private com.bytedance.sdk.openadsdk.Lrd.PjT.Zh uLf;
    private int uQg;
    private final List ub;
    private int uvo;
    private int vSp;
    private boolean wKV;
    private String wN;
    private boolean wWn;
    protected int xE;
    private int xH;
    private int xR;
    private JSONObject xi;
    public boolean xs;
    private boolean xu;
    private String yIW;
    private JSONObject ydj;
    private int yks;
    private String zSs;
    private int zYH;
    private c zZ;

    public yIW() {
        this.ub = new ArrayList();
        this.gK = new ArrayList();
        this.ltE = new ArrayList();
        this.Owx = Co.ReZ();
        this.xs = false;
        this.Yo = new ArrayList();
        this.KM = new ArrayList();
        this.Zd = "0";
        this.tY = "";
        this.xH = 0;
        this.dwk = 2;
        this.MWx = -1;
        this.Ld = 0;
        this.hN = 0;
        this.uQg = 1;
        this.RV = new SM();
        this.xR = -200;
        this.fK = 0;
        this.UR = 1;
        this.Vs = 0;
        this.Wo = 0;
        this.jK = 0;
        this.OL = 1;
        this.kWj = 1;
        this.Gr = 100.0f;
        this.sjb = 2;
        this.dG = 1;
        this.vSp = 0;
        this.hx = -1;
        this.gH = -1L;
        this.AjB = 0;
        this.es = false;
        this.cyr = 0;
        this.en = 50;
        this.Ebj = -1;
        this.BPY = new Zh();
        this.Ohg = false;
        this.uLf = null;
        this.qla = -1;
        this.xE = -1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean AK() {
        AdSlot adSlot0 = this.na;
        if(adSlot0 != null) {
            return this.Uo == null ? false : this.Uo.PjT(!TextUtils.isEmpty(adSlot0.getBidAdm()));
        }
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean AjB() {
        switch(this.XWz()) {
            case 3: 
            case 4: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Alu() {
        return (this.Sks == 1 || this.Sks == 2) && 3 == this.RD;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Au(int v) {
        this.MWx = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Au(String s) {
        this.fU = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Au(boolean z) {
        this.wWn = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Au() {
        return this.xu;
    }

    public int Ay() {
        return this.FaL;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public com.bytedance.sdk.openadsdk.core.DWo.XX.PjT BPY() {
        return this.joj;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public long Bf() {
        return this.DWo;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean CD() {
        return this.wKV;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public List CY() {
        return this.ub;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String Co() {
        return this.dDm;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Co(int v) {
        this.pBJ = v;
    }

    private com.bytedance.sdk.openadsdk.core.DWo.XX.PjT Cup() {
        Yo yo0 = this.xH();
        return yo0 == null ? null : new com.bytedance.sdk.openadsdk.core.DWo.XX.PjT().PjT(yo0.PjT()).Zh(yo0.Zh()).ReZ(yo0.ReZ()).cr(yo0.cr()).JQp(this.joj() + "_v3");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String DWo() {
        return this.Os;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void DWo(int v) {
        this.jK = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void DWo(String s) {
        this.Nv = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void DWo(boolean z) {
        this.Zh = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean DnO() {
        return this.XWz() == 5;
    }

    public String ELH() {
        return this.fU;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public long Ebj() {
        return this.fDm;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Ee() {
        if(this.uvo() && !this.en()) {
            int v = new Random().nextInt(100);
            return this.OnL != null && v < this.OnL.ReZ();
        }
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String Ey() {
        if(this.zSs == null) {
            JSONObject jSONObject0 = this.Tn();
            if(jSONObject0 != null) {
                this.zSs = jSONObject0.optString("cid", "");
            }
        }
        return this.zSs;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String FaL() {
        return this.HGd;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Fx() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean GL() {
        return this.XWz() == 8;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String GP() {
        return this.Co;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Gr() {
        return this.uvo <= 0 ? 20 : this.uvo;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean HG() {
        return this.FaL == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public long HGd() {
        if(this.gH < 0L) {
            JSONObject jSONObject0 = this.Tn();
            if(jSONObject0 != null) {
                this.gH = jSONObject0.optLong("ad_id", 0L);
                return this.gH;
            }
            this.gH = 0L;
        }
        return this.gH;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Hi() {
        return this.Alu;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void IJ(int v) {
        this.qZS = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean IJ() {
        return this.St() == 100 || this.Sks == 20;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Ik() {
        if(this.hx <= 0) {
            this.hx = this.XWz();
        }
        return (this.hx == 7 || this.hx == 8) && !yIW.XX(this) && this.Sks() != 21 && this.Wcm == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public c It() {
        return this.kFP;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean JDf() {
        return this.kW;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void JQp(int v) {
        this.Sks = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void JQp(String s) {
        this.Os = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void JQp(JSONObject jSONObject0) {
        this.xi = jSONObject0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void JQp(boolean z) {
        this.es = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public c JU() {
        return this.Xe;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Jo() {
        return this.uQg;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Jo(int v) {
        this.QB = v;
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean KH() {
        return this.uvo() && !this.en() && (this.OnL != null && this.OnL.PjT() == 1);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int KLT() {
        return this.zYH;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void KM(int v) {
        this.Ld = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void KM(String s) {
        if(TextUtils.isEmpty(s)) {
            this.Au = "engaged_view";
            return;
        }
        this.Au = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean KM() {
        return this.Vs == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean KP() {
        return this.RXa;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String Ld() {
        return this.IJ;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Ld(int v) {
        if(v < 0 || v > 30) {
            v = 6;
        }
        this.XX = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Lex() {
        return this.KH;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Lf() {
        return this.SM;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Lmo() {
        return this.JU;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Lrd() {
        return this.sjb;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Lrd(int v) {
        this.FaL = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Lrd(String s) {
        this.Co = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Lrs() {
        if(this.zZ != null && !TextUtils.isEmpty(this.zZ.M())) {
            try {
                if(this.zZ.M().contains("style_id")) {
                    this.DnO = true;
                    this.dnv = (String)Uri.parse(this.zZ.M()).getQueryParameters("style_id").get(0);
                    return;
                }
                this.DnO = false;
                return;
            }
            catch(Throwable throwable0) {
            }
            RD.Zh(throwable0.getMessage(), new Object[0]);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Lx() {
        return this.pBJ;
    }

    public int MD() {
        return this.Vs;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String MN() {
        return this.oMU;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String MT() {
        return this.Au;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public c MWx() {
        return this.zZ;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void MWx(int v) {
        this.SM = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Mn() {
        return this.XX;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void NR() {
        this.RXa = true;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String Nv() {
        if(!TextUtils.isEmpty(this.Jo)) {
            return this.Jo;
        }
        Context context0 = com.bytedance.sdk.openadsdk.core.ub.PjT();
        switch(this.cI()) {
            case 4: {
                return context0 == null ? this.Jo : com.bytedance.sdk.component.utils.Lrd.PjT(context0, "tt_video_download_apk");
            }
            case 2: 
            case 3: 
            case 8: {
                return context0 == null ? this.Jo : com.bytedance.sdk.component.utils.Lrd.PjT(context0, "tt_video_mobile_go_detail");
            }
            default: {
                return this.Jo;
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean OL() {
        if(this.ub.isEmpty()) {
            return false;
        }
        if(this.kph == 4 && this.ub.size() < 3) {
            return false;
        }
        for(Object object0: this.ub) {
            if(!((xE)object0).JQp()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int OMu() {
        return this.yks;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void OMu(int v) {
        this.AjB = v;
    }

    public int OYr() {
        return this.jp;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public com.bytedance.sdk.openadsdk.core.DWo.XX.PjT Ohg() {
        return this.kNB;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int OnL() {
        return this.qZS;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Os() {
        return this.zZ == null || this.zZ.H() != 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public cRA Owx() {
        return this.NR;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Owx(int v) {
        this.HG = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Owx(String s) {
        this.VY = s;
    }

    private void PjT(xE xE0, int v) {
        if(xE0 != null) {
            try {
                if(!TextUtils.isEmpty(xE0.PjT())) {
                    if(xE0.Zh() == 0 && xE0.ReZ() == 0) {
                        xE0.PjT(v);
                        xE0.Zh(v);
                        return;
                    }
                    if(xE0.Zh() == 0) {
                        if(xE0.ReZ() > v) {
                            xE0.Zh(v);
                            xE0.PjT(v);
                            return;
                        }
                        xE0.PjT(xE0.ReZ());
                        return;
                    }
                    if(xE0.ReZ() == 0) {
                        if(xE0.Zh() > v) {
                            xE0.Zh(v);
                            xE0.PjT(v);
                            return;
                        }
                        xE0.Zh(xE0.Zh());
                        return;
                    }
                    if(xE0.Zh() > xE0.ReZ()) {
                        if(xE0.Zh() > v) {
                            xE0.Zh(((int)(((float)v) / (((float)xE0.Zh()) / ((float)xE0.ReZ())))));
                            xE0.PjT(v);
                        }
                    }
                    else if(xE0.ReZ() > v) {
                        xE0.PjT(((int)(((float)v) * (((float)xE0.Zh()) / ((float)xE0.ReZ())))));
                        xE0.Zh(v);
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int PjT() {
        return this.qla;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(double f) {
        if(f != 2.0 && f != 1.0) {
            this.dG = 1;
            return;
        }
        this.dG = (int)f;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(float f) {
        this.Gr = f;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(int v) {
        this.qla = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(int v, int v1) {
        this.tT = v;
        this.Sks = v;
        if(this.na == null) {
            this.Sks = 0;
            return;
        }
        if(v1 <= 0) {
            v1 = this.XWz();
        }
        if(this.na.getNativeAdType() != 3 && this.na.getDurationSlotType() != 3 && v1 != 3) {
            switch(this.na.getNativeAdType()) {
                case 7: 
                case 8: {
                label_25:
                    if(cRA.ReZ(this)) {
                        this.Sks = 12;
                        return;
                    }
                    if(cRA.Zh(this)) {
                        this.Sks = 9;
                        return;
                    }
                    if(this.tT == 5 && !gK.cr(this)) {
                        this.Sks = 7;
                    }
                    if(this.tT == 6 && !gK.Zh(this)) {
                        this.Sks = 7;
                    }
                    if(this.tT == 8 && this.St() != 100) {
                        this.Sks = 7;
                    }
                    if(this.tT == 19 && TextUtils.isEmpty(this.yIW)) {
                        this.Sks = 7;
                    }
                    if(this.tT == 20 && TextUtils.isEmpty(this.yIW)) {
                        this.Sks = 7;
                    }
                    if(this.tT == 38 && !gK.ReZ(this)) {
                        this.Sks = 7;
                    }
                    if(v < 5) {
                        this.Sks = 7;
                    }
                    break;
                }
                default: {
                    switch(this.na.getDurationSlotType()) {
                        case 7: 
                        case 8: {
                            goto label_25;
                        }
                        default: {
                            if(v1 == 7 || v1 == 8) {
                                goto label_25;
                            }
                            else {
                                if(cRA.Zh(this)) {
                                    this.Sks = 4;
                                    return;
                                }
                                if(this.tT == 4 && !cRA.Zh(this)) {
                                    this.Sks = 0;
                                }
                                if(v >= 5) {
                                    this.Sks = 0;
                                    return;
                                }
                                if(this.tT == 2 && this.cI() != 3) {
                                    this.Sks = 0;
                                    return;
                                }
                                if(v == 0 || v == 1 && this.cI() != 3) {
                                    this.Sks = 0;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.Sks = 14;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(AdSlot adSlot0) {
        this.na = adSlot0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(FilterWord filterWord0) {
        this.ltE.add(filterWord0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(com.bytedance.sdk.openadsdk.Lrd.PjT.Zh zh0) {
        this.uLf = zh0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(PAGBannerSize pAGBannerSize0) {
        this.Yr = pAGBannerSize0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0) {
        this.joj = pjT0;
        com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh.PjT().PjT(pjT0, "endcard");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(JQp jQp0) {
        this.XWz = jQp0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(Lrd lrd0) {
        this.Lrs = lrd0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0) {
        this.ix = owx$PjT0;
        com.bytedance.sdk.component.adexpress.PjT.ReZ.cr cr0 = this.RSm();
        if(cr0 != null && !this.tY()) {
            com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.PjT(cr0);
        }
        if(owx$PjT0 != null && !TextUtils.isEmpty(owx$PjT0.qla())) {
            com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0 = this.vBg();
            com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh.PjT().PjT(pjT0, "ad");
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(SM sM0) {
        this.RV = sM0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(Sks sks0) {
        this.iZF = sks0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(Yo yo0) {
        this.SW = yo0;
        if(yo0 != null && !TextUtils.isEmpty(yo0.ReZ())) {
            com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0 = this.Cup();
            com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh.PjT().PjT(pjT0, "adv3");
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(cRA cRA0) {
        this.NR = cRA0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(cr cr0) {
        this.ig = cr0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(cz cz0) {
        this.Pv = cz0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(ltE ltE0) {
        this.VZ = ltE0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(qj qj0) {
        this.rds = qj0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(qla qla0) {
        this.WHM = qla0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(ub ub0) {
        this.Uo = ub0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(xE xE0) {
        this.PjT(xE0, Owx.xf);
        String s = this.ZX(xE0.PjT());
        if(!TextUtils.isEmpty(s)) {
            xE0.Zh(s);
        }
        this.Lrd = xE0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(xf xf0) {
        this.ZsT = xf0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(xs xs0) {
        this.OnL = xs0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(PjT pjT0) {
        this.KP = pjT0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(Map map0) {
        this.Xtz = map0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(c c0) {
        this.zZ = c0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void PjT(boolean z) {
        this.xu = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Pv() {
        if(this.VY() != null) {
            List list0 = this.VY().ReZ();
            return list0 != null && list0.contains(57);
        }
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public PjT QB() {
        return this.KP;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Qf() {
        return this.jK;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Qf(int v) {
        this.Lx = v;
    }

    public void Qf(String s) {
        this.It = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public float Qtm() {
        if(this.Gr <= 0.0f) {
            this.Gr = 100.0f;
        }
        return this.Gr * 1000.0f / 1000.0f;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int RD() {
        return this.Sks;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void RD(int v) {
        this.yks = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void RD(String s) {
        this.oMU = s;
    }

    public com.bytedance.sdk.component.adexpress.PjT.ReZ.cr RSm() {
        com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = this.VY();
        return owx$PjT0 == null ? null : com.bytedance.sdk.openadsdk.core.model.Owx.PjT.PjT(owx$PjT0, String.valueOf(this.joj()));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public qj RV() {
        return this.rds;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public com.bytedance.sdk.component.SM.Zh.PjT RXa() {
        com.bytedance.sdk.component.SM.Zh.PjT pjT0 = new com.bytedance.sdk.component.SM.Zh.PjT();
        pjT0.PjT(this.yks);
        pjT0.Zh(this.Zd);
        pjT0.PjT(this.xR());
        return pjT0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ReZ(int v) {
        this.qj = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ReZ(long v) {
        this.fDm = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ReZ(xE xE0) {
        this.ub.add(xE0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ReZ(JSONObject jSONObject0) {
        this.Qtm = jSONObject0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ReZ(c c0) {
        this.Xe = c0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ReZ(boolean z) {
        this.fA = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void SM(int v) {
        this.Vs = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void SM(String s) {
        this.dDm = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void SM(boolean z) {
        this.Ee = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean SM() {
        return this.CY;
    }

    // 去混淆评级： 中等(60)
    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    @Nullable
    public String SW() {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Sks() {
        return this.tT;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Sks(int v) {
        this.JDf = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Sks(String s) {
        this.CD = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Sky() {
        return this.XWz() == 7;
    }

    public int St() {
        return this.HG;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void TE() {
        this.Alu = true;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public JSONObject Tn() {
        if(this.dIF == null) {
            try {
                if(!TextUtils.isEmpty(this.VY)) {
                    this.dIF = new JSONObject(this.VY);
                    return this.dIF;
                }
            }
            catch(JSONException jSONException0) {
                RD.Zh("MaterialMeta", jSONException0.getMessage());
            }
        }
        return this.dIF;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public long UR() {
        return this.cI;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Uo() {
        return this.cyr;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void VNy() {
        this.KH = true;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public com.bytedance.sdk.openadsdk.core.model.Owx.PjT VY() {
        return this.ix;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void VY(int v) {
        this.Sky = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean VZ() {
        return this.KLT == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public Map Vs() {
        return this.Xtz;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String WAt() {
        return this.GL;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public xs WHM() {
        return this.OnL;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public Sks WQX() {
        return this.iZF;
    }

    public int Wc() {
        return this.oG;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean Wcm() {
        return this.xs;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public PAGBannerSize WfD() {
        return this.Yr;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public JSONObject Wo() {
        return this.Qtm;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int XWz() {
        if(this.hx < 0) {
            JSONObject jSONObject0 = this.Tn();
            if(jSONObject0 != null) {
                this.hx = jSONObject0.optInt("ad_slot_type", 0);
                return this.hx;
            }
            this.hx = 0;
        }
        return this.hx;
    }

    private static double XX(JSONObject jSONObject0) {
        return jSONObject0 == null ? 0.0 : jSONObject0.optDouble("pack_time", 0.0);
    }

    public static boolean XX(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        int v = owx0.fK();
        return owx0.uvo() || (v == 5 || v == 15 || v == 50);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int XX() {
        return this.qj;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void XX(int v) {
        this.dwk = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void XX(String s) {
        this.tY = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void XX(boolean z) {
        this.kW = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public xE Xe() {
        return this.Lrd;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String Xtz() {
        return this.Qf;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Xw() {
        this.Owx.JQp();
        this.XX(false);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Yo() {
        return this.MWx;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Yo(int v) {
        this.kWj = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Yo(String s) {
        this.Xw = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String Yr() {
        return this.dnv;
    }

    public int ZBe() {
        return this.UR;
    }

    private String ZX(String s) {
        try {
            if(!TextUtils.isEmpty(s)) {
                return com.bytedance.sdk.component.utils.xE.PjT(s);
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("MaterialMeta", new Object[]{"generate icon key error", throwable0.getMessage()});
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int ZX() {
        return this.hN;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ZX(int v) {
        this.uvo = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public SM Zd() {
        return this.RV;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zd(int v) {
        this.GP = v;
    }

    private JSONObject Zh(FilterWord filterWord0) {
        if(filterWord0 == null) {
            return null;
        }
        try {
            if(filterWord0.isValid()) {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("id", filterWord0.getId());
                jSONObject0.put("name", filterWord0.getName());
                jSONObject0.put("is_selected", filterWord0.getIsSelected());
                if(filterWord0.hasSecondOptions()) {
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: filterWord0.getOptions()) {
                        jSONArray0.put(this.Zh(((FilterWord)object0)));
                    }
                    if(jSONArray0.length() > 0) {
                        jSONObject0.put("options", jSONArray0);
                    }
                }
                return jSONObject0;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int Zh() {
        return this.xE;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zh(double f) {
        if(f != 2.0 && f != 1.0) {
            this.sjb = 2;
            return;
        }
        this.sjb = (int)f;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zh(int v) {
        this.xE = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zh(long v) {
        this.cI = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zh(com.bytedance.sdk.openadsdk.core.DWo.XX.PjT pjT0) {
        this.kNB = pjT0;
        com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh.PjT().PjT(pjT0, "endcard");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zh(xE xE0) {
        this.cRA = xE0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zh(JSONObject jSONObject0) {
        this.ydj = jSONObject0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zh(c c0) {
        this.kFP = c0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void Zh(boolean z) {
        this.CY = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int ZsT() {
        return this.Lx;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean bop() {
        return this.wWn;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int cI() {
        return this.RD;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String cRA() [...] // 潜在的解密器

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String cRA(String s) {
        JSONObject jSONObject0 = this.Tn();
        return jSONObject0 == null ? s : jSONObject0.optString("rit", s);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cRA(int v) {
        this.WAt = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int cX() {
        return this.en;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public Lrd ceO() {
        return this.Lrs;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cr(int v) {
        this.PjT(v, -1);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cr(long v) {
        this.DWo = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cr(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        this.RD = 4;
        this.Zd = jSONObject0.optString("id");
        this.IJ = jSONObject0.optString("source");
        cr cr0 = new cr();
        this.ig = cr0;
        cr0.ReZ(jSONObject0.optString("pkg_name"));
        this.ig.Zh(jSONObject0.optString("name"));
        this.ig.PjT(jSONObject0.optString("download_url"));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cr(boolean z) {
        this.wKV = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int cyr() {
        return this.AjB;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cz(int v) {
        this.xH = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cz(String s) {
        this.Tn = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cz(JSONObject jSONObject0) {
        this.BPY.PjT(jSONObject0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void cz(boolean z) {
        this.xs = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public JSONObject dDm() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("interaction_type", this.cI());
            jSONObject0.put("iv_skip_time", this.PjT());
            jSONObject0.put("rv_skip_time", this.Zh());
            jSONObject0.put("is_arbitrage_sample", this.dps());
            jSONObject0.put("interaction_method", this.Sks());
            jSONObject0.put("lp_click_type", this.Lf());
            jSONObject0.put("lp_click_interval", this.Bf());
            jSONObject0.put("proportion_watching", this.Yo());
            jSONObject0.put("is_arbitrage", this.Ay());
            jSONObject0.put("arbitrage_strategy", this.zZ());
            jSONObject0.put("target_url", this.xu());
            jSONObject0.put("app_log_url", this.hN());
            jSONObject0.put("gecko_id", this.MN());
            jSONObject0.put("extension", this.vSp());
            jSONObject0.put("ad_id", this.dIF());
            jSONObject0.put("source", this.Ld());
            jSONObject0.put("app_name", this.pV());
            jSONObject0.put("screenshot", this.CD());
            jSONObject0.put("dislike_control", this.qu());
            jSONObject0.put("play_bar_show_time", this.rds());
            jSONObject0.put("play_bar_style", this.qZS());
            jSONObject0.put("if_block_lp", this.MD());
            jSONObject0.put("cache_sort", this.wk());
            jSONObject0.put("if_sp_cache", this.OYr());
            jSONObject0.put("render_control", this.iZZ());
            jSONObject0.put("mrc_report", this.KLT);
            jSONObject0.put("isMrcReportFinish", this.RXa);
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("cta", this.Lrd());
            jSONObject1.put("other", this.tT());
            jSONObject0.put("set_click_type", jSONObject1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("reward_name", "");
            jSONObject2.put("reward_amount", this.yIW());
            jSONObject0.put("reward_data", jSONObject2);
            if(!TextUtils.isEmpty(this.DWo()) && !TextUtils.isEmpty(this.qj())) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("adchoices_icon", this.DWo());
                jSONObject3.put("adchoices_url", this.qj());
                jSONObject0.put("dsp_adchoices", jSONObject3);
            }
            xE xE0 = this.Xe();
            if(xE0 != null && !TextUtils.isEmpty(xE0.PjT())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", xE0.PjT());
                jSONObject4.put("height", xE0.ReZ());
                jSONObject4.put("width", xE0.Zh());
                jSONObject0.put("icon", jSONObject4);
            }
            xE xE1 = this.kFP();
            if(xE1 != null && !TextUtils.isEmpty(xE1.PjT())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", xE1.PjT());
                jSONObject5.put("height", xE1.ReZ());
                jSONObject5.put("width", xE1.Zh());
                jSONObject0.put("cover_image", jSONObject5);
            }
            JSONObject jSONObject6 = this.Wo();
            if(jSONObject6 != null) {
                jSONObject0.put("session_params", jSONObject6);
            }
            SM sM0 = this.Zd();
            if(sM0 != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("click_upper_content_area", sM0.PjT);
                jSONObject7.put("click_upper_non_content_area", sM0.Zh);
                jSONObject7.put("click_lower_content_area", sM0.ReZ);
                jSONObject7.put("click_lower_non_content_area", sM0.cr);
                jSONObject7.put("click_button_area", sM0.JQp);
                jSONObject7.put("click_video_area", sM0.cz);
                jSONObject0.put("click_area", jSONObject7);
            }
            cz cz0 = this.qla();
            if(cz0 != null) {
                jSONObject0.put("arbitrage_interceptor_params", cz0.Au());
            }
            AdSlot adSlot0 = this.ig();
            if(adSlot0 != null) {
                jSONObject0.put("adslot", adSlot0.toJsonObj());
            }
            List list0 = this.CY();
            if(list0 != null) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: list0) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("url", ((xE)object0).PjT());
                    jSONObject8.put("height", ((xE)object0).ReZ());
                    jSONObject8.put("width", ((xE)object0).Zh());
                    jSONObject8.put("image_preview", ((xE)object0).cz());
                    jSONObject8.put("image_key", ((xE)object0).XX());
                    jSONArray0.put(jSONObject8);
                }
                jSONObject0.put("image", jSONArray0);
            }
            List list1 = this.zYH();
            if(list1 != null) {
                JSONArray jSONArray1 = new JSONArray();
                for(Object object1: list1) {
                    jSONArray1.put(((String)object1));
                }
                jSONObject0.put("show_url", jSONArray1);
            }
            List list2 = this.wKV();
            if(list2 != null) {
                JSONArray jSONArray2 = new JSONArray();
                for(Object object2: list2) {
                    jSONArray2.put(((String)object2));
                }
                jSONObject0.put("click_url", jSONArray2);
            }
            List list3 = this.yks();
            if(list3 != null) {
                JSONArray jSONArray3 = new JSONArray();
                for(Object object3: list3) {
                    jSONArray3.put(((String)object3));
                }
                jSONObject0.put("play_start", jSONArray3);
            }
            jSONObject0.put("phone_num", this.fA());
            jSONObject0.put("title", this.Xtz());
            jSONObject0.put("description", this.ix());
            jSONObject0.put("ext", this.xR());
            jSONObject0.put("image_mode", this.fK());
            jSONObject0.put("cover_click_area", this.St());
            jSONObject0.put("intercept_flag", this.pSa());
            jSONObject0.put("button_text", this.Nv());
            jSONObject0.put("ad_logo", this.ZBe());
            jSONObject0.put("video_adaptation", this.wN());
            jSONObject0.put("feed_video_opentype", this.Qf());
            jSONObject0.put("orientation", this.jK());
            jSONObject0.put("aspect_ratio", ((double)this.Qtm()));
            cr cr0 = this.uQg();
            if(cr0 != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("app_name", "");
                jSONObject9.put("package_name", "");
                jSONObject9.put("download_url", "");
                jSONObject9.put("score", cr0.cr());
                jSONObject9.put("comment_num", cr0.JQp());
                jSONObject9.put("app_size", cr0.cz());
                jSONObject9.put("app_category", "");
                jSONObject0.put("app", jSONObject9);
            }
            qj qj0 = this.RV();
            if(qj0 != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("deeplink_url", qj0.PjT());
                jSONObject10.put("fallback_url", qj0.Zh());
                jSONObject10.put("fallback_type", qj0.ReZ());
                jSONObject0.put("deep_link", jSONObject10);
            }
            Lrd lrd0 = this.ceO();
            if(lrd0 != null) {
                JSONObject jSONObject11 = lrd0.DWo();
                if(jSONObject11 != null) {
                    jSONObject0.put("oem", jSONObject11);
                }
            }
            Sks sks0 = this.WQX();
            if(sks0 != null) {
                JSONObject jSONObject12 = sks0.ReZ();
                if(jSONObject12 != null) {
                    jSONObject0.put("multi_ad_scene", jSONObject12);
                }
            }
            List list4 = this.na();
            if(list4 != null) {
                JSONArray jSONArray4 = new JSONArray();
                for(Object object4: list4) {
                    JSONObject jSONObject13 = this.Zh(((FilterWord)object4));
                    if(jSONObject13 != null) {
                        jSONArray4.put(jSONObject13);
                    }
                }
                jSONObject0.put("filter_words", jSONArray4);
            }
            this.Owx().PjT(jSONObject0);
            jSONObject0.put("count_down", this.Wc());
            jSONObject0.put("expiration_time", this.UR());
            c c0 = this.It();
            if(c0 != null) {
                jSONObject0.put("video", c0.G());
            }
            c c1 = this.JU();
            if(c1 != null) {
                jSONObject0.put("h265_video", c1.G());
            }
            jSONObject0.put("video_encode_type", this.gH());
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("if_send_click", this.dwk());
            jSONObject0.put("download_conf", jSONObject14);
            if(this.Vs() != null) {
                JSONObject jSONObject15 = new JSONObject();
                Set set0 = this.Vs().entrySet();
                if(!set0.isEmpty()) {
                    for(Object object5: set0) {
                        jSONObject15.put(((String)((Map.Entry)object5).getKey()), ((Map.Entry)object5).getValue());
                    }
                }
                jSONObject0.put("media_ext", jSONObject15);
            }
            com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = this.VY();
            if(owx$PjT0 != null) {
                JSONObject jSONObject16 = new JSONObject();
                jSONObject16.put("id", owx$PjT0.cz());
                jSONObject16.put("md5", owx$PjT0.XX());
                jSONObject16.put("url", owx$PjT0.Au());
                jSONObject16.put("data", owx$PjT0.SM());
                jSONObject16.put("diff_data", owx$PjT0.DWo());
                jSONObject16.put("version", owx$PjT0.JQp());
                jSONObject16.put("dynamic_creative", owx$PjT0.qj());
                jSONObject16.put("engine_version", owx$PjT0.xs());
                jSONObject16.put("ugen_data", owx$PjT0.ub());
                jSONObject16.put("ugen_md5", owx$PjT0.xE());
                jSONObject16.put("ugen_url", owx$PjT0.qla());
                jSONObject0.put("tpl_info", jSONObject16);
            }
            Yo yo0 = this.SW;
            if(yo0 != null) {
                jSONObject0.put("tpl_info_v3", yo0.cz());
            }
            jSONObject0.put("dynamic_creative", this.zaq());
            jSONObject0.put("creative_extra", this.kph());
            jSONObject0.put("market_url", this.ht());
            jSONObject0.put("auction_price", this.Co());
            jSONObject0.put("ad_info", this.ELH());
            jSONObject0.put("is_package_open", this.ZsT());
            jSONObject0.put("playable_duration_time", this.Gr());
            jSONObject0.put("playable_endcard_close_time", this.fU());
            jSONObject0.put("endcard_close_time", this.Lx());
            JSONObject jSONObject17 = new JSONObject();
            jSONObject17.put("render_sequence", this.ZX());
            jSONObject17.put("backup_render_control", this.Jo());
            jSONObject17.put("reserve_time", this.Lmo());
            jSONObject17.put("render_thread", this.xi());
            jSONObject0.put("render", jSONObject17);
            if(this.VZ == null) {
                ltE ltE0 = new ltE();
                this.VZ = ltE0;
                ltE0.PjT("");
                this.VZ.PjT(10L);
                this.VZ.Zh(20L);
                this.VZ.ReZ(10L);
                this.VZ.cr(20L);
            }
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put("onlylp_loading_maxtime", this.VZ.PjT());
            jSONObject18.put("straight_lp_showtime", this.VZ.Zh());
            jSONObject18.put("onlyagg_loading_maxtime", this.VZ.ReZ());
            jSONObject18.put("straight_agg_showtime", this.VZ.cr());
            jSONObject18.put("loading_text", "");
            ub ub0 = this.Uo;
            if(ub0 != null) {
                jSONObject18 = ub0.PjT(jSONObject18);
            }
            jSONObject0.put("interaction_method_params", jSONObject18);
            JSONObject jSONObject19 = new JSONObject();
            jSONObject19.put("splash_clickarea", this.ub());
            jSONObject19.put("splash_layout_id", this.gK());
            jSONObject19.put("load_wait_time", this.ltE());
            jSONObject19.put("skip_time", (this.XWz == null ? 0 : this.XWz.PjT()));
            jSONObject0.put("splash_control", jSONObject19);
            if(this.pBJ()) {
                jSONObject0.put("dsp_html", this.Lmo);
            }
            if(this.uvo()) {
                jSONObject0.put("vast_json", this.KP.DWo());
            }
            jSONObject0.put("dsp_material_type", this.cyr());
            jSONObject0.put("deep_link_appname", this.Co);
            jSONObject0.put("landing_page_download_clicktype", this.qZS);
            xs xs0 = this.OnL;
            if(xs0 != null) {
                jSONObject0.put("dsp_style", xs0.JQp());
            }
            jSONObject0.put("jump_probability", this.Sky);
            jSONObject0.put("identificationOverlayContent", this.GL);
            if(this.joj != null) {
                JSONObject jSONObject20 = new JSONObject();
                jSONObject20.put("endcard", this.joj.PjT(this.kNB));
                jSONObject0.put("ugen", jSONObject20);
            }
            jSONObject0.put("preload_h5_type", this.Uo());
            jSONObject0.put("hasReportShow", this.wWn);
            jSONObject0.put("endcard_creative", this.Xw);
            jSONObject0.put("image_stay", this.Wcm);
            jSONObject0.put("ad_label", this.BPY.cz());
            JSONObject jSONObject21 = new JSONObject();
            jSONObject21.put("enable", this.cz);
            jSONObject21.put("wait_time", this.XX);
            jSONObject21.put("label", this.Au);
            jSONObject0.put("ev", jSONObject21);
            jSONObject0.put("ad_label", this.BPY.cz());
            if(this.Yr != null) {
                JSONObject jSONObject22 = new JSONObject();
                jSONObject22.put("width", this.Yr.getWidth());
                jSONObject22.put("height", this.Yr.getHeight());
                jSONObject0.put("banner", jSONObject22);
            }
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int dG() {
        return this.xi == null ? 0 : this.xi.optInt("easy_playable_skip_duration", 0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String dIF() {
        return this.Zd;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean dnv() {
        return this.XWz() == 1;
    }

    public int dps() {
        return this.JDf;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int dwk() {
        return this.ZsT == null ? 0 : this.ZsT.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void dwk(int v) {
        this.Wcm = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean en() {
        return this.Owx.PjT > 0L;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.Zd.equals(((Owx)object0).dIF()) && this.VY.equals(((Owx)object0).xR());
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean es() {
        return this.ig() == null ? false : this.ig().getDurationSlotType() == 8 && this.pBJ();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String fA() {
        return this.iZZ;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public ub fDm() {
        return this.Uo;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void fDm(int v) {
        this.UR = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void fDm(String s) {
        this.iZZ = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int fK() {
        return this.kph;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int fU() {
        return this.QB;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean fc() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean fd() {
        return this.Ee;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int gH() {
        return this.hLk;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int gK() {
        if(this.Pv()) {
            return 5;
        }
        if(this.pBJ()) {
            return 4;
        }
        return this.XWz == null ? 1 : this.XWz.ReZ();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void gK(int v) {
        this.OL = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void gK(String s) {
        this.Zd = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int hG() {
        Map map0 = this.Xtz;
        if(map0 != null) {
            try {
                Object object0 = map0.get("sdk_bidding_type");
                return object0 == null ? 0 : Integer.parseInt(object0.toString());
            }
            catch(Throwable unused_ex) {
            }
        }
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public qla hLk() {
        return this.WHM;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String hN() {
        return this.OMu;
    }

    public String ht() {
        return this.CD;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int hx() {
        return this.vSp;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean iZF() {
        return this.DnO;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int iZZ() {
        if(this.Sks != 5 && this.Sks != 6 && this.Sks != 33) {
            return this.es() ? 2 : this.dwk;
        }
        return 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void iZZ(int v) {
        this.oG = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void iZZ(String s) {
        this.GL = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public AdSlot ig() {
        return this.na;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ig(int v) {
        this.zYH = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String ix() {
        return this.ZX;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int jK() {
        if(this.kWj != 2) {
            this.kWj = 1;
        }
        return this.kWj;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int joj() {
        JSONObject jSONObject0 = this.Tn();
        return jSONObject0 == null ? 0 : jSONObject0.optInt("rit", 0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean jp() {
        return this.uvo() ? false : this.qu() == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public xE kFP() {
        return this.cRA;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public double kNB() {
        return yIW.XX(this.Tn());
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int kW() {
        return this.hx;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean kWj() {
        return this.es;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String kph() {
        return this.Nv;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void kph(int v) {
        this.hLk = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public long ltE() {
        return this.XWz == null ? 0L : this.XWz.cr();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ltE(int v) {
        this.jp = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ltE(String s) {
        this.OMu = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public List na() {
        return this.ltE;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean oG() {
        return this.JDf == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean oKO() {
        return this.cz;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public JSONObject oMU() {
        JSONObject jSONObject0 = this.dDm();
        JSONObject jSONObject1 = com.bytedance.sdk.openadsdk.core.settings.xs.Gr().gK(String.valueOf(this.joj()));
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray0 = new JSONArray();
            jSONArray0.put(jSONObject0);
            jSONObject2.put("creatives", jSONArray0);
            jSONObject2.put("did", 1);
            jSONObject2.put("processing_time_ms", 100);
            jSONObject2.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject2.put("s_receive_ts", 1);
            jSONObject2.put("s_send_ts", 1);
            jSONObject2.put("status_code", 20000);
            jSONObject2.put("core_settings", jSONObject1);
        }
        catch(JSONException jSONException0) {
            RD.Zh("MaterialMeta", new Object[]{"toJsonObjPlus", jSONException0.getMessage()});
        }
        return jSONObject2;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean pBJ() {
        return this.AjB == 2;
    }

    public int pSa() {
        return this.MN;
    }

    public String pV() {
        return this.wN;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public Zh pz() {
        return this.BPY;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int qZS() {
        if(this.uvo()) {
            return 5;
        }
        return this.Qtm() != 100.0f || this.iZZ() == 2 ? 0 : this.fK;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void qZS(int v) {
        this.JU = Math.max(0, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String qj() {
        return this.Tn;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void qj(int v) {
        this.hN = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void qj(String s) {
        this.IJ = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void qj(boolean z) {
        this.Ohg = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public cz qla() {
        return this.Pv;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void qla(int v) {
        this.fK = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void qla(String s) {
        this.Qf = s;
    }

    public int qu() {
        return this.Ld;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int qx() {
        String s;
        if(this.WQX() != null && this.WQX().Zh() >= 0) {
            return this.WQX().Zh();
        }
        if(this.ig() != null) {
            s = this.ig().getCodeId();
            return s == null ? 30 : com.bytedance.sdk.openadsdk.core.ub.cr().qj(s);
        }
        int v = this.joj();
        s = v == 0 ? null : String.valueOf(v);
        return s == null ? 30 : com.bytedance.sdk.openadsdk.core.ub.cr().qj(s);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int rds() {
        return this.xR;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void rds(int v) {
        this.vSp = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String sjb() {
        return this.Lmo;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String tR() {
        return this.Xw;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int tT() {
        return this.dG;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void tT(int v) {
        this.RD = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void tT(String s) {
        this.Lmo = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void tY(int v) {
        this.cyr = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean tY() {
        return this.ix == null ? this.hN == 9 || this.hN == 10 : !TextUtils.isEmpty(this.ix.xs());
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int uLf() {
        try {
            JSONObject jSONObject0 = this.Tn();
            return jSONObject0 == null ? 0 : jSONObject0.optInt("rec_clk", 0);
        }
        catch(Exception unused_ex) {
        }
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public cr uQg() {
        return this.ig;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int ub() {
        return this.XWz == null ? 2 : this.XWz.Zh();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ub(int v) {
        this.xR = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void ub(String s) {
        this.Jo = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean uvo() {
        return (this.AjB == 1 || this.AjB == 3) && this.QB() != null;
    }

    private com.bytedance.sdk.openadsdk.core.DWo.XX.PjT vBg() {
        com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = this.VY();
        return owx$PjT0 == null ? null : com.bytedance.sdk.openadsdk.core.model.Owx.PjT.Zh(owx$PjT0, String.valueOf(this.joj()));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public JSONObject vSp() {
        return this.xi;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public List wKV() {
        return this.KM;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int wN() {
        return this.Wo;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void wN(int v) {
        this.KLT = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean wWn() {
        if(!this.en()) {
            int v = new Random().nextInt(100);
            if(this.uvo()) {
                return this.OnL == null ? v < 0 : v < this.OnL.Zh();
            }
            return cRA.Zh(this) ? v < 0 : v < this.Sky;
        }
        return false;
    }

    public int wk() {
        return this.OL;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public JQp xE() {
        return this.XWz;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void xE(int v) {
        this.MN = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void xE(String s) {
        this.ZX = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public Yo xH() {
        return this.SW;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void xH(int v) {
        this.en = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String xR() {
        return this.VY;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void xf(int v) {
        this.uQg = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void xf(String s) {
        this.wN = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void xf(boolean z) {
        this.cz = z;
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean xf() {
        return !TextUtils.isEmpty(this.DWo()) && !TextUtils.isEmpty(this.qj());
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int xi() {
        return this.GP;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public ltE xs() {
        return this.VZ;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void xs(int v) {
        this.Wo = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void xs(String s) {
        this.yIW = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String xu() {
        return this.yIW;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int yIW() {
        return this.xH;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void yIW(int v) {
        this.kph = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public void yIW(String s) {
        this.HGd = s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public String ydj() {
        String s = this.It;
        if(TextUtils.isEmpty(s)) {
            JSONObject jSONObject0 = this.Tn();
            if(jSONObject0 != null) {
                s = jSONObject0.optString("req_id", "");
                this.Qf(s);
            }
        }
        return s == null ? "" : s;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public List yks() {
        return this.gK;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public com.bytedance.sdk.openadsdk.Lrd.PjT.Zh zE() {
        return this.uLf;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public Co zSs() {
        return this.Owx;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public List zYH() {
        return this.Yo;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int zZ() {
        return this.WAt;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public int za() {
        if(this.Ebj < 0) {
            try {
                JSONObject jSONObject0 = this.Tn();
                if(jSONObject0 != null) {
                    this.Ebj = jSONObject0.optInt("is_drop_to_retargeting_sample", 0);
                    return this.Ebj;
                }
                this.Ebj = 0;
                return 0;
            }
            catch(Throwable unused_ex) {
                this.Ebj = 0;
            }
        }
        return this.Ebj;
    }

    public JSONObject zaq() {
        return this.ydj;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.model.Owx
    public boolean zq() {
        return this.Ohg;
    }
}

