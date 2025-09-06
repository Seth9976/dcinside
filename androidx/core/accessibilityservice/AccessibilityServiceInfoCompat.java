package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.ReplaceWith;

public final class AccessibilityServiceInfoCompat {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 0x20;
    public static final int f = -1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 8;
    public static final int j = 16;
    public static final int k = 0x20;

    public static String a(int v) {
        switch(v) {
            case 1: {
                return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
            }
            case 2: {
                return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
            }
            case 4: {
                return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
            }
            case 8: {
                return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    public static String b(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        while(v > 0) {
            int v1 = 1 << Integer.numberOfTrailingZeros(v);
            v &= ~v1;
            if(stringBuilder0.length() > 1) {
                stringBuilder0.append(", ");
            }
            switch(v1) {
                case 1: {
                    stringBuilder0.append("FEEDBACK_SPOKEN");
                    break;
                }
                case 2: {
                    stringBuilder0.append("FEEDBACK_HAPTIC");
                    break;
                }
                case 4: {
                    stringBuilder0.append("FEEDBACK_AUDIBLE");
                    break;
                }
                case 8: {
                    stringBuilder0.append("FEEDBACK_VISUAL");
                    break;
                }
                case 16: {
                    stringBuilder0.append("FEEDBACK_GENERIC");
                }
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public static String c(int v) {
        switch(v) {
            case 1: {
                return "DEFAULT";
            }
            case 2: {
                return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
            }
            case 4: {
                return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
            }
            case 8: {
                return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
            }
            case 16: {
                return "FLAG_REPORT_VIEW_IDS";
            }
            case 0x20: {
                return "FLAG_REQUEST_FILTER_KEY_EVENTS";
            }
            default: {
                return null;
            }
        }
    }

    @ReplaceWith(expression = "info.getCapabilities()")
    @Deprecated
    public static int d(AccessibilityServiceInfo accessibilityServiceInfo0) {
        return accessibilityServiceInfo0.getCapabilities();
    }

    @ReplaceWith(expression = "info.loadDescription(packageManager)")
    @Deprecated
    public static String e(AccessibilityServiceInfo accessibilityServiceInfo0, PackageManager packageManager0) {
        return accessibilityServiceInfo0.loadDescription(packageManager0);
    }
}

