package com.bytedance.adsdk.Zh;

public enum ltE {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean PjT(int v, boolean z, int v1) {
        switch(this) {
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
            default: {
                if(z && v < 28) {
                    return true;
                }
                return v1 <= 4 ? v <= 25 : true;
            }
        }
    }
}

