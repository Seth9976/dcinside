package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.Au;
import com.bytedance.adsdk.Zh.ReZ.PjT.DWo;
import com.bytedance.adsdk.Zh.ReZ.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.PjT.ReZ;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.io.IOException;
import java.util.List;

public class cr {
    static Au JQp(JsonReader jsonReader0, XX xX0) throws IOException {
        return new Au(cr.PjT(jsonReader0, cz.PjT(), xX0, wN.PjT));
    }

    static ReZ PjT(JsonReader jsonReader0, XX xX0, int v) throws IOException {
        return new ReZ(cr.PjT(jsonReader0, xX0, new qla(v)));
    }

    public static Zh PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        return cr.PjT(jsonReader0, xX0, true);
    }

    // 去混淆评级： 低(20)
    public static Zh PjT(JsonReader jsonReader0, XX xX0, boolean z) throws IOException {
        return z ? new Zh(cr.PjT(jsonReader0, cz.PjT(), xX0, (JsonReader jsonReader0, float f) -> this.PjT(jsonReader0, f))) : new Zh(cr.PjT(jsonReader0, 1.0f, xX0, (JsonReader jsonReader0, float f) -> this.PjT(jsonReader0, f)));
    }

    private static List PjT(JsonReader jsonReader0, float f, XX xX0, IJ iJ0) throws IOException {
        return RD.PjT(jsonReader0, xX0, f, iJ0, false);
    }

    private static List PjT(JsonReader jsonReader0, XX xX0, IJ iJ0) throws IOException {
        return RD.PjT(jsonReader0, xX0, 1.0f, iJ0, false);
    }

    static com.bytedance.adsdk.Zh.ReZ.PjT.cz ReZ(JsonReader jsonReader0, XX xX0) throws IOException {
        return new com.bytedance.adsdk.Zh.ReZ.PjT.cz(RD.PjT(jsonReader0, xX0, cz.PjT(), (JsonReader jsonReader0, float f) -> this.PjT(jsonReader0, f), true));
    }

    static PjT XX(JsonReader jsonReader0, XX xX0) throws IOException {
        return new PjT(cr.PjT(jsonReader0, xX0, com.bytedance.adsdk.Zh.JQp.XX.PjT));
    }

    static com.bytedance.adsdk.Zh.ReZ.PjT.cr Zh(JsonReader jsonReader0, XX xX0) throws IOException {
        return new com.bytedance.adsdk.Zh.ReZ.PjT.cr(cr.PjT(jsonReader0, xX0, (JsonReader jsonReader0, float f) -> this.PjT(jsonReader0, f)));
    }

    static com.bytedance.adsdk.Zh.ReZ.PjT.XX cr(JsonReader jsonReader0, XX xX0) throws IOException {
        return new com.bytedance.adsdk.Zh.ReZ.PjT.XX(cr.PjT(jsonReader0, xX0, (JsonReader jsonReader0, float f) -> this.PjT(jsonReader0, f)));
    }

    static DWo cz(JsonReader jsonReader0, XX xX0) throws IOException {
        return new DWo(cr.PjT(jsonReader0, cz.PjT(), xX0, SM.PjT));
    }
}

