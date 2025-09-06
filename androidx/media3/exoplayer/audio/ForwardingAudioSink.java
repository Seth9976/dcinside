package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.nio.ByteBuffer;

@UnstableApi
public class ForwardingAudioSink implements AudioSink {
    private final AudioSink h;

    public ForwardingAudioSink(AudioSink audioSink0) {
        this.h = audioSink0;
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void A(@Nullable PlayerId playerId0) {
        this.h.A(playerId0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void B(long v) {
        this.h.B(v);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void C() {
        this.h.C();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean a(Format format0) {
        return this.h.a(format0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean b() {
        return this.h.b();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void c() {
        this.h.c();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    @Nullable
    public AudioAttributes d() {
        return this.h.d();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void e(AudioAttributes audioAttributes0) {
        this.h.e(audioAttributes0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void f(Listener audioSink$Listener0) {
        this.h.f(audioSink$Listener0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        this.h.flush();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void g(int v) {
        this.h.g(v);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean h() {
        return this.h.h();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void i() {
        this.h.i();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void j(AuxEffectInfo auxEffectInfo0) {
        this.h.j(auxEffectInfo0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void k(int v) {
        this.h.k(v);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void l(PlaybackParameters playbackParameters0) {
        this.h.l(playbackParameters0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public PlaybackParameters m() {
        return this.h.m();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void n(Format format0, int v, @Nullable int[] arr_v) throws ConfigurationException {
        this.h.n(format0, v, arr_v);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void o(float f) {
        this.h.o(f);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void p() {
        this.h.p();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.h.pause();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public int q(Format format0) {
        return this.h.q(format0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void r(boolean z) {
        this.h.r(z);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        this.h.release();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        this.h.reset();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void s(Clock clock0) {
        this.h.s(clock0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport t(Format format0) {
        return this.h.t(format0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(23)
    public void u(@Nullable AudioDeviceInfo audioDeviceInfo0) {
        this.h.u(audioDeviceInfo0);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean v() {
        return this.h.v();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public boolean w(ByteBuffer byteBuffer0, long v, int v1) throws InitializationException, WriteException {
        return this.h.w(byteBuffer0, v, v1);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public void x() throws WriteException {
        this.h.x();
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void y(int v, int v1) {
        this.h.y(v, v1);
    }

    @Override  // androidx.media3.exoplayer.audio.AudioSink
    public long z(boolean z) {
        return this.h.z(z);
    }
}

