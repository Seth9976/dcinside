package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.utils.g;

public abstract class AdSession {
    public abstract void addFriendlyObstruction(View arg1, FriendlyObstructionPurpose arg2, @Nullable String arg3);

    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration0, AdSessionContext adSessionContext0) {
        g.a();
        g.a(adSessionConfiguration0, "AdSessionConfiguration is null");
        g.a(adSessionContext0, "AdSessionContext is null");
        return new a(adSessionConfiguration0, adSessionContext0);
    }

    public abstract void error(ErrorType arg1, String arg2);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View arg1);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View arg1);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener arg1);

    public abstract void start();
}

