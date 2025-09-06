package com.bytedance.adsdk.ugeno.yoga;

import com.bytedance.adsdk.ugeno.yoga.PjT.PjT;

@PjT
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int XX;

    private YogaLogLevel(int v1) {
        this.XX = v1;
    }

    @PjT
    public static YogaLogLevel fromInt(int v) {
        switch(v) {
            case 0: {
                return YogaLogLevel.PjT;
            }
            case 1: {
                return YogaLogLevel.Zh;
            }
            case 2: {
                return YogaLogLevel.ReZ;
            }
            case 3: {
                return YogaLogLevel.cr;
            }
            case 4: {
                return YogaLogLevel.JQp;
            }
            case 5: {
                return YogaLogLevel.cz;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + v);
            }
        }
    }
}

