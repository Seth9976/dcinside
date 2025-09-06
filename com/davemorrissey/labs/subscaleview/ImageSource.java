package com.davemorrissey.labs.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class ImageSource {
    static final String ASSET_SCHEME = "file:///android_asset/";
    static final String FILE_SCHEME = "file:///";
    private final Bitmap bitmap;
    private boolean cached;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;
    private final Uri uri;

    private ImageSource(int v) {
        this.bitmap = null;
        this.uri = null;
        this.resource = v;
        this.tile = true;
    }

    private ImageSource(Bitmap bitmap0, boolean z) {
        this.bitmap = bitmap0;
        this.uri = null;
        this.resource = null;
        this.tile = false;
        this.sWidth = bitmap0.getWidth();
        this.sHeight = bitmap0.getHeight();
        this.cached = z;
    }

    private ImageSource(@NonNull Uri uri0) {
        String s = uri0.toString();
        if(s.startsWith("file:///") && !new File(s.substring(7)).exists()) {
            try {
                uri0 = Uri.parse(URLDecoder.decode(s, "UTF-8"));
            }
            catch(UnsupportedEncodingException unused_ex) {
            }
        }
        this.bitmap = null;
        this.uri = uri0;
        this.resource = null;
        this.tile = true;
    }

    @NonNull
    public static ImageSource asset(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("Asset name must not be null");
        }
        return ImageSource.uri(("file:///android_asset/" + s));
    }

    @NonNull
    public static ImageSource bitmap(@NonNull Bitmap bitmap0) {
        if(bitmap0 == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        return new ImageSource(bitmap0, false);
    }

    @NonNull
    public static ImageSource cachedBitmap(@NonNull Bitmap bitmap0) {
        if(bitmap0 == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        return new ImageSource(bitmap0, true);
    }

    @NonNull
    public ImageSource dimensions(int v, int v1) {
        if(this.bitmap == null) {
            this.sWidth = v;
            this.sHeight = v1;
        }
        this.setInvariants();
        return this;
    }

    protected final Bitmap getBitmap() {
        return this.bitmap;
    }

    protected final Integer getResource() {
        return this.resource;
    }

    protected final int getSHeight() {
        return this.sHeight;
    }

    protected final Rect getSRegion() {
        return this.sRegion;
    }

    protected final int getSWidth() {
        return this.sWidth;
    }

    protected final boolean getTile() {
        return this.tile;
    }

    protected final Uri getUri() {
        return this.uri;
    }

    protected final boolean isCached() {
        return this.cached;
    }

    @NonNull
    public ImageSource region(Rect rect0) {
        this.sRegion = rect0;
        this.setInvariants();
        return this;
    }

    @NonNull
    public static ImageSource resource(int v) {
        return new ImageSource(v);
    }

    private void setInvariants() {
        Rect rect0 = this.sRegion;
        if(rect0 != null) {
            this.tile = true;
            this.sWidth = rect0.width();
            this.sHeight = this.sRegion.height();
        }
    }

    @NonNull
    public ImageSource tiling(boolean z) {
        this.tile = z;
        return this;
    }

    @NonNull
    public ImageSource tilingDisabled() {
        return this.tiling(false);
    }

    @NonNull
    public ImageSource tilingEnabled() {
        return this.tiling(true);
    }

    @NonNull
    public static ImageSource uri(@NonNull Uri uri0) {
        if(uri0 == null) {
            throw new NullPointerException("Uri must not be null");
        }
        return new ImageSource(uri0);
    }

    @NonNull
    public static ImageSource uri(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("Uri must not be null");
        }
        if(!s.contains("://")) {
            if(s.startsWith("/")) {
                s = s.substring(1);
            }
            s = "file:///" + s;
        }
        return new ImageSource(Uri.parse(s));
    }
}

