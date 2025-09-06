package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzck {
    @Nullable
    public String zza;
    @Nullable
    public String zzb;
    @Nullable
    public String zzc;
    public List zzd;
    public List zze;
    public int zzf;
    public int zzg;

    public zzck() {
        this.zzf = 1;
        this.zzd = Collections.emptyList();
        this.zze = Collections.emptyList();
        this.zzg = 1;
    }

    // This method was un-flattened
    public static zzck zza(JsonReader jsonReader0) throws IOException {
        int v2;
        zzck zzck0 = new zzck();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            int v = 6;
            int v1 = 3;
            switch(jsonReader0.nextName()) {
                case "actions": {
                    zzck0.zze = new ArrayList();
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        zzcj zzcj0 = new zzcj();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                        alab1:
                            switch(jsonReader0.nextName()) {
                                case "action_type": {
                                    String s2 = jsonReader0.nextString();
                                    switch(s2) {
                                        case "CLEAR": {
                                            v2 = 3;
                                            break alab1;
                                        }
                                        case "UNKNOWN_ACTION_TYPE": {
                                            v2 = 1;
                                            break alab1;
                                        }
                                        case "WRITE": {
                                            v2 = 2;
                                            break alab1;
                                        }
                                        default: {
                                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: " + s2);
                                        }
                                    }
                                }
                                case "args_json": {
                                    zzcj0.zza = jsonReader0.nextString();
                                    continue;
                                }
                                default: {
                                    jsonReader0.skipValue();
                                    continue;
                                }
                            }
                            zzcj0.zzb = v2;
                        }
                        jsonReader0.endObject();
                        zzck0.zze.add(zzcj0);
                    }
                    jsonReader0.endArray();
                    break;
                }
                case "consent_form_base_url": {
                    zzck0.zzb = jsonReader0.nextString();
                    break;
                }
                case "consent_form_payload": {
                    zzck0.zza = jsonReader0.nextString();
                    break;
                }
                case "consent_signal": {
                    String s = jsonReader0.nextString();
                    switch(s) {
                        case "CONSENT_SIGNAL_COLLECT_CONSENT": {
                            v = 5;
                            break;
                        }
                        case "CONSENT_SIGNAL_ERROR": {
                            v = 7;
                            break;
                        }
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS": {
                            v = 3;
                            break;
                        }
                        case "CONSENT_SIGNAL_NOT_REQUIRED": {
                            break;
                        }
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS": {
                            v = 2;
                            break;
                        }
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION": {
                            v = 8;
                            break;
                        }
                        case "CONSENT_SIGNAL_SUFFICIENT": {
                            v = 4;
                            break;
                        }
                        case "CONSENT_SIGNAL_UNKNOWN": {
                            v = 1;
                            break;
                        }
                        default: {
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: " + s);
                        }
                    }
                    zzck0.zzf = v;
                    break;
                }
                case "error_message": {
                    zzck0.zzc = jsonReader0.nextString();
                    break;
                }
                case "privacy_options_required": {
                    String s1 = jsonReader0.nextString();
                    switch(s1) {
                        case "NOT_REQUIRED": {
                            break;
                        }
                        case "REQUIRED": {
                            v1 = 2;
                            break;
                        }
                        case "UNKNOWN": {
                            v1 = 1;
                            break;
                        }
                        default: {
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: " + s1);
                        }
                    }
                    zzck0.zzg = v1;
                    break;
                }
                case "request_info_keys": {
                    zzck0.zzd = new ArrayList();
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        String s3 = jsonReader0.nextString();
                        zzck0.zzd.add(s3);
                    }
                    jsonReader0.endArray();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return zzck0;
    }
}

