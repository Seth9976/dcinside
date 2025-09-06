package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.W0;
import com.google.crypto.tink.proto.r2;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.subtle.C;
import com.google.crypto.tink.y;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class d implements y {
    private final SharedPreferences a;
    private final String b;

    public d(Context context0, String s, String s1) throws IOException {
        if(s == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = s;
        Context context1 = context0.getApplicationContext();
        if(s1 == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(context1);
            return;
        }
        this.a = context1.getSharedPreferences(s1, 0);
    }

    @Override  // com.google.crypto.tink.y
    public W0 a() throws IOException {
        return W0.a3(this.b(), V.d());
    }

    private byte[] b() throws IOException {
        try {
            String s = this.a.getString(this.b, null);
            if(s == null) {
                throw new FileNotFoundException(String.format("can\'t read keyset; the pref value %s does not exist", this.b));
            }
            return C.a(s);
        }
        catch(ClassCastException | IllegalArgumentException unused_ex) {
            throw new CharConversionException(String.format("can\'t read keyset; the pref value %s is not a valid hex string", this.b));
        }
    }

    @Override  // com.google.crypto.tink.y
    public r2 read() throws IOException {
        return r2.j3(this.b(), V.d());
    }
}

