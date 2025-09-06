package com.unity3d.ads.core.domain;

import android.opengl.GLES20;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import y4.l;

public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {
    @l
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(@l SessionRepository sessionRepository0) {
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.sessionRepository = sessionRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    @l
    public ByteString invoke() {
        ByteString byteString0;
        if(this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            EglCore eglCore0 = new EglCore(null, 2);
            OffscreenSurface offscreenSurface0 = new OffscreenSurface(eglCore0, 1, 1);
            offscreenSurface0.makeCurrent();
            String s = GLES20.glGetString(0x1F01);
            L.o(s, "renderer");
            byte[] arr_b = s.getBytes(f.b);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            byteString0 = ByteString.copyFrom(arr_b);
            offscreenSurface0.release();
            eglCore0.release();
            L.o(byteString0, "{\n            // We need…dererByteString\n        }");
            return byteString0;
        }
        byteString0 = ByteString.empty();
        L.o(byteString0, "{\n            ByteString.empty()\n        }");
        return byteString0;
    }
}

