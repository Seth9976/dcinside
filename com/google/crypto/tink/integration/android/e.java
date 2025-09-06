package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.W0;
import com.google.crypto.tink.proto.r2;
import com.google.crypto.tink.subtle.C;
import com.google.crypto.tink.z;
import java.io.IOException;

public final class e implements z {
    private final SharedPreferences.Editor a;
    private final String b;

    public e(Context context0, String s, String s1) {
        if(s == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = s;
        Context context1 = context0.getApplicationContext();
        if(s1 == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(context1).edit();
            return;
        }
        this.a = context1.getSharedPreferences(s1, 0).edit();
    }

    @Override  // com.google.crypto.tink.z
    public void a(r2 r20) throws IOException {
        String s = C.b(r20.toByteArray());
        if(!this.a.putString(this.b, s).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override  // com.google.crypto.tink.z
    public void b(W0 w00) throws IOException {
        String s = C.b(w00.toByteArray());
        if(!this.a.putString(this.b, s).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}

