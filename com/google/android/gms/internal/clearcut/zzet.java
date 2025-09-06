package com.google.android.gms.internal.clearcut;

final class zzet {
    static String zzc(zzbb zzbb0) {
        zzeu zzeu0 = new zzeu(zzbb0);
        StringBuilder stringBuilder0 = new StringBuilder(zzeu0.size());
        for(int v = 0; v < zzeu0.size(); ++v) {
            int v1 = zzeu0.zzj(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        v1 = (v1 & 7) + 0x30;
                    }
                    stringBuilder0.append(((char)v1));
                }
            }
        }
        return stringBuilder0.toString();
    }
}

