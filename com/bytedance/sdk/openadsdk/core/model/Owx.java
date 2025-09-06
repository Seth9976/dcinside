package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.PjT.ReZ.cr;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.xf.PjT.Zh;
import com.bytedance.sdk.openadsdk.utils.Co;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import v.c;

public abstract class Owx {
    public static class PjT {
        private List Au;
        private String DWo;
        private String JQp;
        private String PjT;
        private String ReZ;
        private String SM;
        private String XX;
        private String Zh;
        private String cr;
        private String cz;
        private String fDm;
        private String qj;
        private String xf;
        private String xs;

        public String Au() {
            return this.ReZ;
        }

        public void Au(String s) {
            this.XX = s;
        }

        public String DWo() {
            return this.JQp;
        }

        public void DWo(String s) {
            this.DWo = s;
        }

        public String JQp() {
            return this.cz;
        }

        public void JQp(String s) {
            this.ReZ = s;
        }

        @NonNull
        public static cr PjT(PjT owx$PjT0, String s) {
            return cr.PjT().PjT(owx$PjT0.cz()).Zh(owx$PjT0.XX()).ReZ(owx$PjT0.Au()).cr(owx$PjT0.SM()).JQp(owx$PjT0.JQp()).cz(s);
        }

        public void PjT(String s) {
            this.SM = s;
        }

        public void PjT(List list0) {
            this.Au = list0;
        }

        public List ReZ() {
            return this.Au;
        }

        public void ReZ(String s) {
            this.PjT = s;
        }

        public String SM() {
            return this.cr;
        }

        public void SM(String s) {
            this.qj = s;
        }

        public String XX() {
            return this.Zh;
        }

        public void XX(String s) {
            this.JQp = s;
        }

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.DWo.XX.PjT Zh(PjT owx$PjT0, String s) {
            return new com.bytedance.sdk.openadsdk.core.DWo.XX.PjT().PjT(owx$PjT0.cz()).Zh(owx$PjT0.xE()).ReZ(owx$PjT0.qla()).cr(owx$PjT0.ub()).JQp(s);
        }

        public void Zh(String s) {
            this.cz = s;
        }

        public String cr() {
            return this.SM;
        }

        public void cr(String s) {
            this.Zh = s;
        }

        public String cz() {
            return this.PjT;
        }

        public void cz(String s) {
            this.cr = s;
        }

        // 去混淆评级： 低(20)
        public boolean fDm() {
            return !TextUtils.isEmpty(this.DWo) && this.DWo.equals("v3");
        }

        public String qj() {
            return this.XX;
        }

        public void qj(String s) {
            this.xf = s;
        }

        public String qla() {
            return this.xf;
        }

        public String ub() {
            return this.fDm;
        }

        public String xE() {
            return this.xs;
        }

        public String xf() {
            return this.qj;
        }

        public void xf(String s) {
            this.xs = s;
        }

        public String xs() {
            return this.DWo;
        }

        public void xs(String s) {
            this.fDm = s;
        }
    }

    protected String Au;
    protected long DWo;
    public static final String JQp;
    protected boolean PjT;
    public static final String ReZ;
    protected int SM;
    protected int XX;
    protected boolean Zh;
    public static final String cr;
    protected boolean cz;
    protected int qj;
    protected static int xf;
    private long xs;

    static {
        Owx.ReZ = "is_arbitrage";
        Owx.cr = "is_arbitrage_sample";
        Owx.JQp = "arbitrage_strategy";
        Owx.xf = 330;
    }

    public Owx() {
        this.xs = 0L;
        this.Zh = false;
        this.cz = ReZ.PjT;
        this.XX = ReZ.Zh;
        this.Au = "engaged_view";
        this.qj = 0;
        this.PjT = com.bytedance.sdk.openadsdk.RD.PjT.PjT("is_new_playable", false);
    }

    public abstract boolean AK();

    public abstract boolean AjB();

    public abstract boolean Alu();

    private static double Au(JSONObject jSONObject0) {
        return jSONObject0 == null ? 0.0 : jSONObject0.optDouble("pack_time", 0.0);
    }

    public abstract void Au(int arg1);

    public abstract void Au(String arg1);

    public abstract void Au(boolean arg1);

    public abstract boolean Au();

    public abstract com.bytedance.sdk.openadsdk.core.DWo.XX.PjT BPY();

    public abstract long Bf();

    public abstract boolean CD();

    public abstract List CY();

    public abstract String Co();

    public abstract void Co(int arg1);

    public abstract String DWo();

    public abstract void DWo(int arg1);

    public abstract void DWo(String arg1);

    public abstract void DWo(boolean arg1);

    public abstract boolean DnO();

    public abstract long Ebj();

    public abstract boolean Ee();

    public abstract String Ey();

    public abstract String FaL();

    public abstract boolean Fx();

    public abstract boolean GL();

    public abstract String GP();

    public abstract int Gr();

    public abstract boolean HG();

    public abstract long HGd();

    public abstract boolean Hi();

    public abstract void IJ(int arg1);

    public abstract boolean IJ();

    public abstract boolean Ik();

    public abstract c It();

    public abstract boolean JDf();

    public static boolean JQp(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        int v = owx0.fK();
        return owx0.uvo() || (v == 5 || v == 15 || v == 50);
    }

    public long JQp() {
        return this.xs;
    }

    public abstract void JQp(int arg1);

    public abstract void JQp(String arg1);

    public abstract void JQp(JSONObject arg1);

    public abstract void JQp(boolean arg1);

    public abstract c JU();

    public abstract int Jo();

    public abstract void Jo(int arg1);

    public abstract boolean KH();

    public abstract int KLT();

    public abstract void KM(int arg1);

    public abstract void KM(String arg1);

    public abstract boolean KM();

    public abstract boolean KP();

    public abstract String Ld();

    public abstract void Ld(int arg1);

    public abstract boolean Lex();

    public abstract int Lf();

    public abstract int Lmo();

    public abstract int Lrd();

    public abstract void Lrd(int arg1);

    public abstract void Lrd(String arg1);

    public abstract void Lrs();

    public abstract int Lx();

    public abstract String MN();

    public abstract String MT();

    public abstract c MWx();

    public abstract void MWx(int arg1);

    public abstract int Mn();

    public abstract void NR();

    public abstract String Nv();

    public abstract boolean OL();

    public abstract int OMu();

    public abstract void OMu(int arg1);

    public abstract com.bytedance.sdk.openadsdk.core.DWo.XX.PjT Ohg();

    public abstract int OnL();

    public abstract boolean Os();

    public abstract cRA Owx();

    public abstract void Owx(int arg1);

    public abstract void Owx(String arg1);

    public static int PjT(JSONObject jSONObject0) {
        return jSONObject0 == null ? 0 : jSONObject0.optInt("ut", 0);
    }

    public static long PjT(String s) {
        return Owx.XX(Owx.ReZ(s));
    }

    public static Zh PjT(String s, Owx owx0) {
        owx0.rds(0);
        switch(owx0.XWz()) {
            case 3: {
                return new Zh(s, owx0.It(), owx0.JU(), owx0.hx(), owx0.gH(), 4);
            }
            case 7: {
                return new Zh(s, owx0.It(), owx0.JU(), owx0.hx(), owx0.gH(), 1);
            }
            case 8: {
                return new Zh(s, owx0.It(), owx0.JU(), owx0.hx(), owx0.gH(), 2);
            }
            default: {
                return new Zh(s, owx0.It(), owx0.JU(), owx0.hx(), owx0.gH(), 3);
            }
        }
    }

    public static String PjT(Context context0, Owx owx0) {
        if(context0 != null && owx0 != null) {
            switch(owx0.XWz()) {
                case 7: 
                case 8: {
                    if(!owx0.IJ()) {
                        return null;
                    }
                    String s = Owx.Zh(context0, owx0);
                    return TextUtils.isEmpty(s) || true ? null : s;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean PjT(Owx owx0) {
        return owx0 != null && owx0.MWx() != null && owx0.MWx().z() == 1;
    }

    public static boolean PjT(Owx owx0, boolean z, boolean z1, boolean z2, boolean z3) {
        if(Owx.PjT(owx0)) {
            return false;
        }
        if(!z3 && owx0 != null && owx0.MWx() != null && !TextUtils.isEmpty(owx0.MWx().M())) {
            if(Owx.ReZ(owx0)) {
                return z2;
            }
            return owx0.MWx() == null || owx0.MWx().i() != 1 ? z : z1;
        }
        return false;
    }

    public abstract int PjT();

    public abstract void PjT(double arg1);

    public abstract void PjT(float arg1);

    public abstract void PjT(int arg1);

    public abstract void PjT(int arg1, int arg2);

    public void PjT(long v) {
        this.xs = v;
    }

    public abstract void PjT(AdSlot arg1);

    public abstract void PjT(FilterWord arg1);

    public abstract void PjT(com.bytedance.sdk.openadsdk.Lrd.PjT.Zh arg1);

    public abstract void PjT(PAGBannerSize arg1);

    public abstract void PjT(com.bytedance.sdk.openadsdk.core.DWo.XX.PjT arg1);

    public abstract void PjT(JQp arg1);

    public abstract void PjT(Lrd arg1);

    public abstract void PjT(PjT arg1);

    public abstract void PjT(SM arg1);

    public abstract void PjT(Sks arg1);

    public abstract void PjT(Yo arg1);

    public abstract void PjT(cRA arg1);

    public abstract void PjT(com.bytedance.sdk.openadsdk.core.model.cr arg1);

    public abstract void PjT(cz arg1);

    public abstract void PjT(ltE arg1);

    public abstract void PjT(qj arg1);

    public abstract void PjT(qla arg1);

    public abstract void PjT(ub arg1);

    public abstract void PjT(xE arg1);

    public abstract void PjT(xf arg1);

    public abstract void PjT(xs arg1);

    public abstract void PjT(com.bytedance.sdk.openadsdk.core.qj.PjT arg1);

    public abstract void PjT(Map arg1);

    public abstract void PjT(c arg1);

    public abstract void PjT(boolean arg1);

    public abstract boolean Pv();

    public abstract com.bytedance.sdk.openadsdk.core.qj.PjT QB();

    public abstract int Qf();

    public abstract void Qf(int arg1);

    public abstract float Qtm();

    public abstract int RD();

    public abstract void RD(int arg1);

    public abstract void RD(String arg1);

    public abstract qj RV();

    public abstract com.bytedance.sdk.component.SM.Zh.PjT RXa();

    public static JSONObject ReZ(String s) {
        if(!TextUtils.isEmpty(s)) {
            try {
                return new JSONObject(s);
            }
            catch(JSONException jSONException0) {
                RD.Zh("MaterialMeta", jSONException0.getMessage());
            }
        }
        return null;
    }

    public static boolean ReZ(Owx owx0) {
        return owx0 != null && owx0.MWx() != null && owx0.MWx().z() == 7 && !cRA.XX(owx0);
    }

    public int ReZ() {
        JQp jQp0 = this.xE();
        return jQp0 == null ? -1 : jQp0.PjT();
    }

    public abstract void ReZ(int arg1);

    public abstract void ReZ(long arg1);

    public abstract void ReZ(xE arg1);

    public abstract void ReZ(JSONObject arg1);

    public abstract void ReZ(c arg1);

    public abstract void ReZ(boolean arg1);

    public abstract void SM(int arg1);

    public abstract void SM(String arg1);

    public abstract void SM(boolean arg1);

    public abstract boolean SM();

    @Nullable
    public abstract String SW();

    public abstract int Sks();

    public abstract void Sks(int arg1);

    public abstract void Sks(String arg1);

    public abstract boolean Sky();

    public abstract void TE();

    public abstract JSONObject Tn();

    public abstract long UR();

    public abstract int Uo();

    public abstract void VNy();

    public abstract PjT VY();

    public abstract void VY(int arg1);

    public abstract boolean VZ();

    public abstract Map Vs();

    public abstract String WAt();

    public abstract xs WHM();

    public abstract Sks WQX();

    public abstract boolean Wcm();

    public abstract PAGBannerSize WfD();

    public abstract JSONObject Wo();

    public abstract int XWz();

    private static long XX(JSONObject jSONObject0) {
        return jSONObject0 == null ? 0L : jSONObject0.optLong("uid", 0L);
    }

    public abstract int XX();

    public abstract void XX(int arg1);

    public abstract void XX(String arg1);

    public abstract void XX(boolean arg1);

    public abstract xE Xe();

    public abstract String Xtz();

    public abstract void Xw();

    public abstract int Yo();

    public abstract void Yo(int arg1);

    public abstract void Yo(String arg1);

    public abstract String Yr();

    public abstract int ZX();

    public abstract void ZX(int arg1);

    public abstract SM Zd();

    public abstract void Zd(int arg1);

    public static double Zh(String s) {
        return Owx.Au(Owx.ReZ(s));
    }

    public static String Zh(Context context0, Owx owx0) {
        if(context0 != null && owx0 != null) {
            try {
                if(owx0.cI() == 8 || owx0.qla().PjT()) {
                    String s = com.bytedance.sdk.openadsdk.core.act.PjT.PjT(context0);
                    return !TextUtils.isEmpty(s) ? s : null;
                }
                return null;
            }
            catch(Throwable throwable0) {
            }
            RD.Zh("MaterialMeta", throwable0.getMessage());
            return null;
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public static boolean Zh(Owx owx0) {
        return !Owx.PjT(owx0) && !Owx.ReZ(owx0);
    }

    public abstract int Zh();

    public abstract void Zh(double arg1);

    public abstract void Zh(int arg1);

    public abstract void Zh(long arg1);

    public abstract void Zh(com.bytedance.sdk.openadsdk.core.DWo.XX.PjT arg1);

    public abstract void Zh(xE arg1);

    public abstract void Zh(JSONObject arg1);

    public abstract void Zh(c arg1);

    public abstract void Zh(boolean arg1);

    public abstract int ZsT();

    public abstract boolean bop();

    public abstract int cI();

    public abstract String cRA();

    public abstract String cRA(String arg1);

    public abstract void cRA(int arg1);

    public abstract int cX();

    public abstract Lrd ceO();

    public static int cr(String s) {
        return Owx.PjT(Owx.ReZ(s));
    }

    public static boolean cr(Owx owx0) {
        return owx0 != null && owx0.MWx() != null && owx0.MWx().i() == 1;
    }

    public abstract void cr(int arg1);

    public abstract void cr(long arg1);

    public abstract void cr(JSONObject arg1);

    public abstract void cr(boolean arg1);

    public boolean cr() {
        int v = this.RD();
        return this.iZZ() == 2 && (v != 5 && v != 6 && v != 12 && v != 19);
    }

    public abstract int cyr();

    public static Owx cz() {
        return new yIW();
    }

    public static boolean cz(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        try {
            Map map0 = owx0.Vs();
            if(map0 == null) {
                return false;
            }
            Object object0 = map0.get("sdk_bidding_type");
            if(object0 == null) {
                return false;
            }
            if(2 == Integer.parseInt(object0.toString())) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            throwable0.getMessage();
        }
        return false;
    }

    public abstract void cz(int arg1);

    public abstract void cz(String arg1);

    public abstract void cz(JSONObject arg1);

    public abstract void cz(boolean arg1);

    public abstract JSONObject dDm();

    public abstract int dG();

    public abstract String dIF();

    public abstract boolean dnv();

    public abstract int dwk();

    public abstract void dwk(int arg1);

    public abstract boolean en();

    public abstract boolean es();

    public abstract String fA();

    public abstract ub fDm();

    public abstract void fDm(int arg1);

    public abstract void fDm(String arg1);

    public abstract int fK();

    public abstract int fU();

    public abstract boolean fc();

    public abstract boolean fd();

    public abstract int gH();

    public abstract int gK();

    public abstract void gK(int arg1);

    public abstract void gK(String arg1);

    public abstract int hG();

    public abstract qla hLk();

    public abstract String hN();

    public abstract int hx();

    public abstract boolean iZF();

    public abstract int iZZ();

    public abstract void iZZ(int arg1);

    public abstract void iZZ(String arg1);

    public abstract AdSlot ig();

    public abstract void ig(int arg1);

    public abstract String ix();

    public abstract int jK();

    public abstract int joj();

    public abstract boolean jp();

    public abstract xE kFP();

    public abstract double kNB();

    public abstract int kW();

    public abstract boolean kWj();

    public abstract String kph();

    public abstract void kph(int arg1);

    public abstract long ltE();

    public abstract void ltE(int arg1);

    public abstract void ltE(String arg1);

    public abstract List na();

    public abstract boolean oG();

    public abstract boolean oKO();

    public abstract JSONObject oMU();

    public abstract boolean pBJ();

    public abstract com.bytedance.sdk.openadsdk.core.model.Zh pz();

    public abstract int qZS();

    public abstract void qZS(int arg1);

    public abstract String qj();

    public abstract void qj(int arg1);

    public abstract void qj(String arg1);

    public abstract void qj(boolean arg1);

    public abstract cz qla();

    public abstract void qla(int arg1);

    public abstract void qla(String arg1);

    public abstract int qx();

    public abstract int rds();

    public abstract void rds(int arg1);

    public abstract String sjb();

    public abstract String tR();

    public abstract int tT();

    public abstract void tT(int arg1);

    public abstract void tT(String arg1);

    public abstract void tY(int arg1);

    public abstract boolean tY();

    public abstract int uLf();

    public abstract com.bytedance.sdk.openadsdk.core.model.cr uQg();

    public abstract int ub();

    public abstract void ub(int arg1);

    public abstract void ub(String arg1);

    public abstract boolean uvo();

    public abstract JSONObject vSp();

    public abstract List wKV();

    public abstract int wN();

    public abstract void wN(int arg1);

    public abstract boolean wWn();

    public abstract JQp xE();

    public abstract void xE(int arg1);

    public abstract void xE(String arg1);

    public abstract Yo xH();

    public abstract void xH(int arg1);

    public abstract String xR();

    public abstract void xf(int arg1);

    public abstract void xf(String arg1);

    public abstract void xf(boolean arg1);

    // 去混淆评级： 低(20)
    public boolean xf() {
        return !TextUtils.isEmpty(this.DWo()) && !TextUtils.isEmpty(this.qj());
    }

    public abstract int xi();

    public abstract ltE xs();

    public abstract void xs(int arg1);

    public abstract void xs(String arg1);

    public abstract String xu();

    public abstract int yIW();

    public abstract void yIW(int arg1);

    public abstract void yIW(String arg1);

    public abstract String ydj();

    public abstract List yks();

    public abstract com.bytedance.sdk.openadsdk.Lrd.PjT.Zh zE();

    public abstract Co zSs();

    public abstract List zYH();

    public abstract int zZ();

    public abstract int za();

    public abstract boolean zq();
}

