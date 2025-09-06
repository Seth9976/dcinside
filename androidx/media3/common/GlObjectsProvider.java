package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import androidx.media3.common.util.GlUtil.GlException;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface GlObjectsProvider {
    EGLSurface a(EGLDisplay arg1, Object arg2, int arg3, boolean arg4) throws GlException;

    GlTextureInfo b(int arg1, int arg2, int arg3) throws GlException;

    EGLSurface c(EGLContext arg1, EGLDisplay arg2) throws GlException;

    EGLContext d(EGLDisplay arg1, @IntRange(from = 2L, to = 3L) int arg2, int[] arg3) throws GlException;

    void e(EGLDisplay arg1) throws GlException;
}

