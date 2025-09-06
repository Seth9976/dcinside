package com.dcinside.app.license;

import Y.A;
import android.os.Bundle;
import android.view.MenuItem;
import com.dcinside.app.base.g;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import kr.bhbfhfb.designcompat.a;
import y4.l;
import y4.m;

public final class LicenseActivity extends g {
    private A w;

    private final String K1() {
        InputStream inputStream0 = this.getResources().openRawResource(0x7F140004);  // style:AdsFreeTextView
        L.o(inputStream0, "openRawResource(...)");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            for(int v = inputStream0.read(); v != -1; v = inputStream0.read()) {
                byteArrayOutputStream0.write(v);
            }
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            L.o(arr_b, "toByteArray(...)");
            return new String(arr_b, f.b);
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        return "";
    }

    private final void L1() {
        A a0 = this.w;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        String s = this.K1();
        a0.b.setText(s);
    }

    private final void M1() {
        A a0 = this.w;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        this.S0(a0.c);
        a.d(this);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        A a0 = A.c(this.getLayoutInflater());
        L.o(a0, "inflate(...)");
        this.w = a0;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        this.setContentView(a0.b());
        this.M1();
        this.L1();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

