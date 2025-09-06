package com.fsn.cauly.blackdragoncore;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.fsn.cauly.Y.i0;
import com.fsn.cauly.Y.j0;
import com.fsn.cauly.Y.l;
import com.fsn.cauly.Y.n0.a;
import com.fsn.cauly.Y.n0;
import com.fsn.cauly.Y.p0;
import com.fsn.cauly.Y.q;
import com.fsn.cauly.Y.x;
import com.fsn.cauly.blackdragoncore.contents.c;
import java.util.HashMap;

public class LandingActivity extends Activity implements a, com.fsn.cauly.Y.q.a {
    i0 a;
    j0 b;
    c c;
    q d;
    String e;
    long f;

    public LandingActivity() {
        this.f = 0L;
    }

    public void a(i0 i00, j0 j00) {
        p0 p00 = new p0(this);
        p00.setListener(this);
        this.setContentView(p00);
        p00.a(i00, j00, 1);
    }

    public void a(i0 i00, j0 j00, c c0) {
        x x0 = new x(i00);
        x0.a(this);
        j00.l0 = false;
        x0.a(this);
        x0.a(j00, c0);
    }

    @Override  // com.fsn.cauly.Y.q$a
    public void a(j0 j00) {
        i0 i00 = this.a;
        if(i00 != null) {
            i00.a(102, null, null);
        }
        this.finish();
    }

    @Override  // com.fsn.cauly.Y.q$a
    public void a(j0 j00, int v, String s) {
    }

    @Override  // com.fsn.cauly.Y.n0$a
    public void a(n0 n00, boolean z) {
        if(!z) {
            l.a(this.a, this.b, "back", null);
        }
        else if(this.b.l.equalsIgnoreCase("video")) {
            l.a(this.a, this.b, "video_x", null);
        }
        else {
            l.a(this.a, this.b, "landing_x", null);
        }
        this.finish();
    }

    @Override  // com.fsn.cauly.Y.q$a
    public void b(j0 j00) {
    }

    @Override  // com.fsn.cauly.Y.q$a
    public void onClickAd() {
        q q0 = this.d;
        if(q0 != null) {
            q0.b();
        }
    }

    @Override  // android.app.Activity
    public void onCreate(Bundle bundle0) {
        class com.fsn.cauly.blackdragoncore.LandingActivity.a implements Runnable {
            final LandingActivity a;

            @Override
            public void run() {
                if("landing".equalsIgnoreCase(LandingActivity.this.e)) {
                    LandingActivity.this.a(LandingActivity.this.a, LandingActivity.this.b);
                    return;
                }
                if("interstitial".equalsIgnoreCase(LandingActivity.this.e)) {
                    LandingActivity.this.a(LandingActivity.this.a, LandingActivity.this.b, LandingActivity.this.c);
                    return;
                }
                LandingActivity.this.finish();
            }
        }

        this.requestWindowFeature(1);
        this.getWindow().setFlags(0x1000000, 0x1000000);
        super.onCreate(bundle0);
        HashMap hashMap0 = com.fsn.cauly.blackdragoncore.c.b().a();
        if(hashMap0 == null) {
            this.finish();
            return;
        }
        this.e = (String)hashMap0.get("landing_type");
        this.a = (i0)hashMap0.get("adContext");
        this.b = (j0)hashMap0.get("adItem");
        this.d = (q)hashMap0.get("adContainer");
        if(hashMap0.containsKey("contentView")) {
            this.c = (c)hashMap0.get("contentView");
        }
        new Handler().post(new com.fsn.cauly.blackdragoncore.LandingActivity.a(this));
        if(this.a != null && this.b != null) {
            return;
        }
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}

