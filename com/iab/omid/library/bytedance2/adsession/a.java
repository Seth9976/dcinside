package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public class a extends AdSession {
    private final AdSessionContext a;
    private final AdSessionConfiguration b;
    private final f c;
    private com.iab.omid.library.bytedance2.weakreference.a d;
    private AdSessionStatePublisher e;
    private boolean f;
    private boolean g;
    private final String h;
    private boolean i;
    private boolean j;
    private PossibleObstructionListener k;

    a(AdSessionConfiguration adSessionConfiguration0, AdSessionContext adSessionContext0) {
        this(adSessionConfiguration0, adSessionContext0, "77eb3c7d-c4b0-47ad-a007-b6008a8a4e37");
    }

    a(AdSessionConfiguration adSessionConfiguration0, AdSessionContext adSessionContext0, String s) {
        this.c = new f();
        this.f = false;
        this.g = false;
        this.b = adSessionConfiguration0;
        this.a = adSessionContext0;
        this.h = s;
        this.b(null);
        com.iab.omid.library.bytedance2.publisher.a a0 = adSessionContext0.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext0.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT ? new com.iab.omid.library.bytedance2.publisher.a(s, adSessionContext0.getWebView()) : new b(s, adSessionContext0.getInjectedResourcesMap(), adSessionContext0.getOmidJsScriptContent());
        this.e = a0;
        this.e.i();
        c.c().a(this);
        this.e.a(adSessionConfiguration0);
    }

    private void a() {
        if(this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(View view0) {
        Collection collection0 = c.c().b();
        if(collection0 != null && !collection0.isEmpty()) {
            for(Object object0: collection0) {
                a a0 = (a)object0;
                if(a0 != this && a0.c() == view0) {
                    a0.d.clear();
                }
            }
        }
    }

    public void a(List list0) {
        if(this.e()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                View view0 = (View)((com.iab.omid.library.bytedance2.weakreference.a)object0).get();
                if(view0 != null) {
                    arrayList0.add(view0);
                }
            }
            this.k.onPossibleObstructionsDetected(this.h, arrayList0);
        }
    }

    void a(@NonNull JSONObject jSONObject0) {
        this.b();
        this.getAdSessionStatePublisher().a(jSONObject0);
        this.j = true;
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view0, FriendlyObstructionPurpose friendlyObstructionPurpose0, @Nullable String s) {
        if(this.g) {
            return;
        }
        this.c.a(view0, friendlyObstructionPurpose0, s);
    }

    private void b() {
        if(this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(View view0) {
        this.d = new com.iab.omid.library.bytedance2.weakreference.a(view0);
    }

    public View c() {
        return (View)this.d.get();
    }

    public List d() {
        return this.c.a();
    }

    public boolean e() {
        return this.k != null;
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType0, String s) {
        if(this.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType0, "Error type is null");
        g.a(s, "Message is null");
        this.getAdSessionStatePublisher().a(errorType0, s);
    }

    // 去混淆评级： 低(20)
    public boolean f() {
        return this.f && !this.g;
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if(this.g) {
            return;
        }
        this.d.clear();
        this.removeAllFriendlyObstructions();
        this.g = true;
        this.getAdSessionStatePublisher().f();
        c.c().b(this);
        this.getAdSessionStatePublisher().b();
        this.e = null;
        this.k = null;
    }

    public boolean g() {
        return this.g;
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.h;
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.e;
    }

    public boolean h() {
        return this.b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f;
    }

    void k() {
        this.a();
        this.getAdSessionStatePublisher().g();
        this.i = true;
    }

    void l() {
        this.b();
        this.getAdSessionStatePublisher().h();
        this.j = true;
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view0) {
        if(this.g) {
            return;
        }
        g.a(view0, "AdView is null");
        if(this.c() == view0) {
            return;
        }
        this.b(view0);
        this.getAdSessionStatePublisher().a();
        this.a(view0);
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if(this.g) {
            return;
        }
        this.c.b();
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view0) {
        if(this.g) {
            return;
        }
        this.c.c(view0);
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener0) {
        this.k = possibleObstructionListener0;
    }

    @Override  // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if(this.f) {
            return;
        }
        this.f = true;
        c.c().c(this);
        float f = i.c().b();
        this.e.a(f);
        this.e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.e.a(this, this.a);
    }
}

