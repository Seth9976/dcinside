package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri.Builder;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.Map.Entry;
import java.util.Map;

public class CsiUrlBuilder {
    private final String zza;

    public CsiUrlBuilder() {
        this.zza = "https://csi.gstatic.com/csi";
    }

    @NonNull
    public String generateUrl(@NonNull Map map0) {
        Uri.Builder uri$Builder0 = Uri.parse(this.zza).buildUpon();
        for(Object object0: map0.entrySet()) {
            uri$Builder0.appendQueryParameter(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        return uri$Builder0.build().toString();
    }
}

