package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzba;

public final class zzfdk {
    public static zze zza(Throwable throwable0) {
        if(throwable0 instanceof zzeda) {
            return zzfdk.zzc(((zzeda)throwable0).zza(), ((zzeda)throwable0).zzb());
        }
        if(throwable0 instanceof zzdvy) {
            return throwable0.getMessage() == null ? zzfdk.zzd(((zzdvy)throwable0).zza(), null, null) : zzfdk.zzd(((zzdvy)throwable0).zza(), throwable0.getMessage(), null);
        }
        return throwable0 instanceof zzba ? new zze(((zzba)throwable0).zza(), zzfve.zzc(((zzba)throwable0).getMessage()), "com.google.android.gms.ads", null, null) : zzfdk.zzd(1, null, null);
    }

    public static zze zzb(Throwable throwable0, @Nullable zzedb zzedb0) {
        zze zze0 = zzfdk.zza(throwable0);
        if((zze0.zza == 0 || zze0.zza == 3) && (zze0.zzd != null && !zze0.zzd.zzc.equals("com.google.android.gms.ads"))) {
            zze0.zzd = null;
        }
        if(zzedb0 != null) {
            zze0.zze = zzedb0.zzb();
        }
        return zze0;
    }

    public static zze zzc(int v, zze zze0) {
        switch(v) {
            case 0: {
                throw null;
            }
            case 8: {
                return ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzif)))) > 0 ? zze0 : zzfdk.zzd(8, null, zze0);
            }
            default: {
                return zzfdk.zzd(v, null, zze0);
            }
        }
    }

    public static zze zzd(int v, @Nullable String s, @Nullable zze zze0) {
        String s1;
        if(s == null) {
            if(v == 0) {
                throw null;
            }
            s = "No fill.";
            switch(v - 1) {
                case 1: {
                    s = "Invalid request.";
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    s = "App ID missing.";
                    break;
                }
                case 4: {
                    s = "Network error.";
                    break;
                }
                case 5: {
                    s = "Invalid request: Invalid ad unit ID.";
                    break;
                }
                case 6: {
                    s = "Invalid request: Invalid ad size.";
                    break;
                }
                case 7: {
                    s = "A mediation adapter failed to show the ad.";
                    break;
                }
                case 8: {
                    s = "The ad is not ready.";
                    break;
                }
                case 9: {
                    s = "The ad has already been shown.";
                    break;
                }
                case 10: {
                    s = "The ad can not be shown when app is not in foreground.";
                    break;
                }
                case 12: {
                    if(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzii)))) <= 0) {
                        s = "The mediation adapter did not return an ad.";
                    }
                    break;
                }
                case 13: {
                    s = "Mismatch request IDs.";
                    break;
                }
                case 14: {
                    s = "Invalid ad string.";
                    break;
                }
                case 15: {
                    s = "Ad inspector had an internal error.";
                    break;
                }
                case 16: {
                    s = "Ad inspector failed to load.";
                    break;
                }
                case 17: {
                    s = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                }
                case 18: {
                    s = "Ad inspector cannot be opened because it is already open.";
                    break;
                }
                default: {
                    s = "Internal error.";
                }
            }
        }
        if(v == 0) {
            throw null;
        }
        int v1 = 2;
        switch(v - 1) {
            case 3: {
                v1 = 8;
                break;
            }
            case 7: {
                return new zze(4, s, "com.google.android.gms.ads", zze0, null);
            }
            case 12: {
                return ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzii)))) > 0 ? new zze(3, s, "com.google.android.gms.ads", zze0, null) : new zze(9, s, "com.google.android.gms.ads", zze0, null);
            }
            case 13: {
                return new zze(10, s, "com.google.android.gms.ads", zze0, null);
            }
            case 14: {
                return new zze(11, s, "com.google.android.gms.ads", zze0, null);
            }
            case 0: 
            case 11: 
            case 15: {
                return new zze(0, s, "com.google.android.gms.ads", zze0, null);
            }
            case 1: 
            case 5: 
            case 6: 
            case 9: 
            case 16: {
                return new zze(1, s, "com.google.android.gms.ads", zze0, null);
            }
            case 4: 
            case 8: 
            case 17: {
                break;
            }
            case 2: 
            case 10: 
            case 18: {
                return new zze(3, s, "com.google.android.gms.ads", zze0, null);
            }
            default: {
                switch(v) {
                    case 1: {
                        s1 = "INTERNAL_ERROR";
                        break;
                    }
                    case 2: {
                        s1 = "INVALID_REQUEST";
                        break;
                    }
                    case 3: {
                        s1 = "NO_FILL";
                        break;
                    }
                    case 4: {
                        s1 = "APP_ID_MISSING";
                        break;
                    }
                    case 5: {
                        s1 = "NETWORK_ERROR";
                        break;
                    }
                    case 6: {
                        s1 = "INVALID_AD_UNIT_ID";
                        break;
                    }
                    case 7: {
                        s1 = "INVALID_AD_SIZE";
                        break;
                    }
                    case 8: {
                        s1 = "MEDIATION_SHOW_ERROR";
                        break;
                    }
                    case 9: {
                        s1 = "NOT_READY";
                        break;
                    }
                    case 10: {
                        s1 = "AD_REUSED";
                        break;
                    }
                    case 11: {
                        s1 = "APP_NOT_FOREGROUND";
                        break;
                    }
                    case 12: {
                        s1 = "INTERNAL_SHOW_ERROR";
                        break;
                    }
                    case 13: {
                        s1 = "MEDIATION_NO_FILL";
                        break;
                    }
                    case 14: {
                        s1 = "REQUEST_ID_MISMATCH";
                        break;
                    }
                    case 15: {
                        s1 = "INVALID_AD_STRING";
                        break;
                    }
                    case 16: {
                        s1 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    }
                    case 17: {
                        s1 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    }
                    case 18: {
                        s1 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    }
                    default: {
                        s1 = "AD_INSPECTOR_ALREADY_OPEN";
                    }
                }
                throw new AssertionError("Unknown SdkError: " + s1);
            }
        }
        return new zze(v1, s, "com.google.android.gms.ads", zze0, null);
    }
}

