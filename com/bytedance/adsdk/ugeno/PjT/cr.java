package com.bytedance.adsdk.ugeno.PjT;

public enum cr {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", "float"),
    TRANSLATE_Y("translateY", "translationY", "float"),
    ROTATE_X("rotateX", "rotationX", "float"),
    ROTATE_Y("rotateY", "rotationY", "float"),
    ROTATE_Z("rotateZ", "rotation", "float"),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", "float"),
    SCALE_Y("scaleY", "scaleY", "float"),
    ALPHA("opacity", "alpha", "float"),
    BACKGROUND_COLOR("backgroundColor", "backgroundColor", "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", "float"),
    RIPPLE("ripple", "ripple", "float"),
    SHINE("shine", "shine", "float");

    private final String qla;
    private final String ub;
    private final String xE;

    private cr(String s1, String s2, String s3) {
        this.qla = s1;
        this.xE = s2;
        this.ub = s3;
    }

    public static cr PjT(String s) {
        s.hashCode();
        switch(s) {
            case "backgroundColor": {
                return cr.qj;
            }
            case "borderRadius": {
                return cr.xf;
            }
            case "opacity": {
                return cr.DWo;
            }
            case "ripple": {
                return cr.xs;
            }
            case "rotateX": {
                return cr.cr;
            }
            case "rotateY": {
                return cr.JQp;
            }
            case "rotateZ": {
                return cr.cz;
            }
            case "scale": {
                return cr.XX;
            }
            case "scaleX": {
                return cr.Au;
            }
            case "scaleY": {
                return cr.SM;
            }
            case "translate": {
                return cr.PjT;
            }
            case "translateX": {
                return cr.Zh;
            }
            case "translateY": {
                return cr.ReZ;
            }
            default: {
                return cr.Zh;
            }
        }
    }

    public String PjT() {
        return this.qla;
    }

    public String ReZ() {
        return this.ub;
    }

    public String Zh() {
        return this.xE;
    }
}

