package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.a;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONObject;

public final class MediaEvents {
    private final a adSession;

    private MediaEvents(a a0) {
        this.adSession = a0;
    }

    public void adUserInteraction(InteractionType interactionType0) {
        g.a(interactionType0, "InteractionType is null");
        g.a(this.adSession);
        JSONObject jSONObject0 = new JSONObject();
        c.a(jSONObject0, "interactionType", interactionType0);
        this.adSession.getAdSessionStatePublisher().a("adUserInteraction", jSONObject0);
    }

    public void bufferFinish() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferFinish");
    }

    public void bufferStart() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferStart");
    }

    public void complete() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("complete");
    }

    private void confirmValidDuration(float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession0) {
        g.a(adSession0, "AdSession is null");
        g.f(((a)adSession0));
        g.c(((a)adSession0));
        g.b(((a)adSession0));
        g.h(((a)adSession0));
        MediaEvents mediaEvents0 = new MediaEvents(((a)adSession0));
        ((a)adSession0).getAdSessionStatePublisher().a(mediaEvents0);
        return mediaEvents0;
    }

    public void firstQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("firstQuartile");
    }

    public void midpoint() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("midpoint");
    }

    public void pause() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("pause");
    }

    public void playerStateChange(PlayerState playerState0) {
        g.a(playerState0, "PlayerState is null");
        g.a(this.adSession);
        JSONObject jSONObject0 = new JSONObject();
        c.a(jSONObject0, "state", playerState0);
        this.adSession.getAdSessionStatePublisher().a("playerStateChange", jSONObject0);
    }

    public void resume() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("resume");
    }

    public void skipped() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("skipped");
    }

    public void start(float f, float f1) {
        this.confirmValidDuration(f);
        this.confirmValidVolume(f1);
        g.a(this.adSession);
        JSONObject jSONObject0 = new JSONObject();
        c.a(jSONObject0, "duration", f);
        c.a(jSONObject0, "mediaPlayerVolume", f1);
        c.a(jSONObject0, "deviceVolume", i.c().b());
        this.adSession.getAdSessionStatePublisher().a("start", jSONObject0);
    }

    public void thirdQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("thirdQuartile");
    }

    public void volumeChange(float f) {
        this.confirmValidVolume(f);
        g.a(this.adSession);
        JSONObject jSONObject0 = new JSONObject();
        c.a(jSONObject0, "mediaPlayerVolume", f);
        c.a(jSONObject0, "deviceVolume", i.c().b());
        this.adSession.getAdSessionStatePublisher().a("volumeChange", jSONObject0);
    }
}

