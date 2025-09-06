package com.dcinside.app.image;

import androidx.annotation.UiThread;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.File;

public final class a implements t {
    private SubsamplingScaleImageView a;
    private File b;

    public a(SubsamplingScaleImageView subsamplingScaleImageView0, File file0) {
        this.a = subsamplingScaleImageView0;
        this.b = file0;
    }

    @Override  // com.dcinside.app.image.t
    @UiThread
    public void a() {
        this.a.setImage(ImageSource.uri(this.b.getAbsolutePath()));
    }
}

