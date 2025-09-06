package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.ReZ;
import org.json.JSONObject;

public class fDm implements ReZ {
    public static class PjT {
        private int Au;
        private int DWo;
        private float JQp;
        protected SparseArray PjT;
        private long ReZ;
        private int SM;
        private float XX;
        private long Zh;
        private float cr;
        private float cz;
        private JSONObject fDm;
        private boolean gK;
        private int qj;
        private int qla;
        private boolean ub;
        private JSONObject xE;
        private String xf;
        private int xs;

        public PjT() {
            this.ub = false;
            this.PjT = new SparseArray();
        }

        public PjT JQp(int v) {
            this.DWo = v;
            return this;
        }

        public PjT PjT(float f) {
            this.cr = f;
            return this;
        }

        public PjT PjT(int v) {
            this.qla = v;
            return this;
        }

        public PjT PjT(long v) {
            this.Zh = v;
            return this;
        }

        public PjT PjT(SparseArray sparseArray0) {
            this.PjT = sparseArray0;
            return this;
        }

        public PjT PjT(String s) {
            this.xf = s;
            return this;
        }

        public PjT PjT(JSONObject jSONObject0) {
            this.fDm = jSONObject0;
            return this;
        }

        public PjT PjT(boolean z) {
            this.gK = z;
            return this;
        }

        public fDm PjT() {
            return new fDm(this, null);
        }

        public PjT ReZ(float f) {
            this.cz = f;
            return this;
        }

        public PjT ReZ(int v) {
            this.Au = v;
            return this;
        }

        public PjT Zh(float f) {
            this.JQp = f;
            return this;
        }

        public PjT Zh(int v) {
            this.xs = v;
            return this;
        }

        public PjT Zh(long v) {
            this.ReZ = v;
            return this;
        }

        public PjT Zh(JSONObject jSONObject0) {
            this.xE = jSONObject0;
            return this;
        }

        public PjT Zh(boolean z) {
            this.ub = z;
            return this;
        }

        public PjT cr(float f) {
            this.XX = f;
            return this;
        }

        public PjT cr(int v) {
            this.SM = v;
            return this;
        }

        public PjT cz(int v) {
            this.qj = v;
            return this;
        }
    }

    public final int Au;
    public final int DWo;
    public final long JQp;
    public final float PjT;
    public final float ReZ;
    public final int SM;
    public final int XX;
    public final float Zh;
    public final float cr;
    public final long cz;
    public SparseArray fDm;
    public boolean gK;
    public final String qj;
    public final boolean qla;
    public JSONObject ub;
    public int xE;
    public int xf;
    public JSONObject xs;

    private fDm(@NonNull PjT fDm$PjT0) {
        this.PjT = fDm$PjT0.XX;
        this.Zh = fDm$PjT0.cz;
        this.ReZ = fDm$PjT0.JQp;
        this.cr = fDm$PjT0.cr;
        this.JQp = fDm$PjT0.ReZ;
        this.cz = fDm$PjT0.Zh;
        this.XX = fDm$PjT0.Au;
        this.Au = fDm$PjT0.SM;
        this.SM = fDm$PjT0.DWo;
        this.DWo = fDm$PjT0.qj;
        this.qj = fDm$PjT0.xf;
        this.fDm = fDm$PjT0.PjT;
        this.qla = fDm$PjT0.gK;
        this.xf = fDm$PjT0.xs;
        this.xs = fDm$PjT0.fDm;
        this.xE = fDm$PjT0.qla;
        this.ub = fDm$PjT0.xE;
        this.gK = fDm$PjT0.ub;
    }

    fDm(PjT fDm$PjT0, com.bytedance.sdk.openadsdk.core.model.fDm.1 fDm$10) {
        this(fDm$PjT0);
    }

    class com.bytedance.sdk.openadsdk.core.model.fDm.1 {
    }

}

