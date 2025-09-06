package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.F.e.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class g implements Q {
    @Nullable
    private final byte[] a;
    @NonNull
    private final String b;
    @NonNull
    private final String c;

    g(@NonNull String s, @NonNull String s1, @Nullable byte[] arr_b) {
        this.b = s;
        this.c = s1;
        this.a = arr_b;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.Q
    @NonNull
    public String a() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.Q
    @Nullable
    public b b() {
        byte[] arr_b = this.c();
        return arr_b == null ? null : b.a().b(arr_b).c(this.b).a();
    }

    @Nullable
    private byte[] c() {
        if(this.d()) {
            return null;
        }
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0)) {
            gZIPOutputStream0.write(this.a);
            gZIPOutputStream0.finish();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    private boolean d() {
        return this.a == null || this.a.length == 0;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.Q
    @Nullable
    public InputStream e() {
        return this.d() ? null : new ByteArrayInputStream(this.a);
    }
}

