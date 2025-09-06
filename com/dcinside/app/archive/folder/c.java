package com.dcinside.app.archive.folder;

import android.view.View.OnClickListener;
import android.view.View;

public final class c implements View.OnClickListener {
    public final ArchiveFolderActivity a;

    public c(ArchiveFolderActivity archiveFolderActivity0) {
        this.a = archiveFolderActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ArchiveFolderActivity.X1(this.a, view0);
    }
}

