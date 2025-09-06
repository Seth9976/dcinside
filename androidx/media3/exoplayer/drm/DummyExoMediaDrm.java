package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UnstableApi
public final class DummyExoMediaDrm implements ExoMediaDrm {
    public static DummyExoMediaDrm a() {
        return new DummyExoMediaDrm();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void b() {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    public PersistableBundle c() {
        return null;
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public Map d(byte[] arr_b) {
        throw new IllegalStateException();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public ProvisionRequest e() {
        throw new IllegalStateException();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public List f() {
        return t.a(this);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] g() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void h(byte[] arr_b, byte[] arr_b1) {
        throw new IllegalStateException();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void i(String s, String s1) {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void j(byte[] arr_b) {
        t.b(this, arr_b);
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void k(String s, byte[] arr_b) {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public String l(String s) {
        return "";
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    public byte[] m(byte[] arr_b, byte[] arr_b1) {
        throw new IllegalStateException();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void n(byte[] arr_b, PlayerId playerId0) {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void o(@Nullable OnExpirationUpdateListener exoMediaDrm$OnExpirationUpdateListener0) {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void p(byte[] arr_b) {
        throw new IllegalStateException();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public int q() {
        return 1;
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public CryptoConfig r(byte[] arr_b) {
        throw new IllegalStateException();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void release() {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void s(@Nullable OnKeyStatusChangeListener exoMediaDrm$OnKeyStatusChangeListener0) {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public boolean t(byte[] arr_b, String s) {
        throw new IllegalStateException();
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void u(byte[] arr_b) {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] v(String s) {
        return Util.f;
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void w(@Nullable OnEventListener exoMediaDrm$OnEventListener0) {
    }

    @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm
    public KeyRequest x(byte[] arr_b, @Nullable List list0, int v, @Nullable HashMap hashMap0) {
        throw new IllegalStateException();
    }
}

