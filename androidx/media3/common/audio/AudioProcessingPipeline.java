package androidx.media3.common.audio;

import O1.a;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class AudioProcessingPipeline {
    private final O2 a;
    private final List b;
    private ByteBuffer[] c;
    private AudioFormat d;
    private AudioFormat e;
    private boolean f;

    public AudioProcessingPipeline(O2 o20) {
        this.a = o20;
        this.b = new ArrayList();
        this.c = new ByteBuffer[0];
        this.d = AudioFormat.e;
        this.e = AudioFormat.e;
        this.f = false;
    }

    // 去混淆评级： 中等(60)
    @a
    public AudioFormat a(AudioFormat audioProcessor$AudioFormat0) throws UnhandledAudioFormatException {
        throw new UnhandledAudioFormatException(audioProcessor$AudioFormat0);
    }

    public void b() {
        this.b.clear();
        this.d = this.e;
        this.f = false;
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            AudioProcessor audioProcessor0 = (AudioProcessor)this.a.get(v1);
            audioProcessor0.flush();
            if(audioProcessor0.isActive()) {
                this.b.add(audioProcessor0);
            }
        }
        this.c = new ByteBuffer[this.b.size()];
        for(int v = 0; v <= this.c(); ++v) {
            ByteBuffer[] arr_byteBuffer = this.c;
            arr_byteBuffer[v] = ((AudioProcessor)this.b.get(v)).e();
        }
    }

    private int c() {
        return this.c.length - 1;
    }

    public ByteBuffer d() {
        if(!this.g()) {
            return AudioProcessor.a;
        }
        ByteBuffer byteBuffer0 = this.c[this.c()];
        if(byteBuffer0.hasRemaining()) {
            return byteBuffer0;
        }
        this.h(AudioProcessor.a);
        return this.c[this.c()];
    }

    public AudioFormat e() {
        return this.d;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AudioProcessingPipeline)) {
            return false;
        }
        if(this.a.size() != ((AudioProcessingPipeline)object0).a.size()) {
            return false;
        }
        for(int v = 0; v < this.a.size(); ++v) {
            if(this.a.get(v) != ((AudioProcessingPipeline)object0).a.get(v)) {
                return false;
            }
        }
        return true;
    }

    // 去混淆评级： 低(30)
    public boolean f() {
        return this.f && ((AudioProcessor)this.b.get(this.c())).b() && !this.c[this.c()].hasRemaining();
    }

    public boolean g() {
        return !this.b.isEmpty();
    }

    private void h(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1;
        for(int v = 1; v != 0; v = v1) {
            int v1 = 0;
            for(int v2 = 0; v2 <= this.c(); ++v2) {
                if(!this.c[v2].hasRemaining()) {
                    AudioProcessor audioProcessor0 = (AudioProcessor)this.b.get(v2);
                    if(!audioProcessor0.b()) {
                        if(v2 > 0) {
                            byteBuffer1 = this.c[v2 - 1];
                        }
                        else {
                            byteBuffer1 = byteBuffer0.hasRemaining() ? byteBuffer0 : AudioProcessor.a;
                        }
                        audioProcessor0.c(byteBuffer1);
                        ByteBuffer[] arr_byteBuffer = this.c;
                        arr_byteBuffer[v2] = audioProcessor0.e();
                        v1 |= (this.c[v2].hasRemaining() ? 1 : 0);
                    }
                    else if(!this.c[v2].hasRemaining() && v2 < this.c()) {
                        ((AudioProcessor)this.b.get(v2 + 1)).d();
                    }
                }
            }
        }
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public void i() {
        if(this.g() && !this.f) {
            this.f = true;
            ((AudioProcessor)this.b.get(0)).d();
        }
    }

    public void j(ByteBuffer byteBuffer0) {
        if(this.g() && !this.f) {
            this.h(byteBuffer0);
        }
    }

    public void k() {
        for(int v = 0; v < this.a.size(); ++v) {
            AudioProcessor audioProcessor0 = (AudioProcessor)this.a.get(v);
            audioProcessor0.flush();
            audioProcessor0.reset();
        }
        this.c = new ByteBuffer[0];
        this.d = AudioFormat.e;
        this.e = AudioFormat.e;
        this.f = false;
    }
}

