package com.dcinside.app.internal;

import com.dcinside.app.image.edit.ImageEditorView;

public final class q implements Runnable {
    public final ImageEditorView a;

    public q(ImageEditorView imageEditorView0) {
        this.a = imageEditorView0;
    }

    @Override
    public final void run() {
        r.i(this.a);
    }
}

