package androidx.media3.exoplayer.offline;

public final class a {
    public static boolean a(DownloadCursor downloadCursor0) {
        return downloadCursor0.getCount() == 0 ? true : downloadCursor0.getPosition() == downloadCursor0.getCount();
    }

    public static boolean b(DownloadCursor downloadCursor0) {
        return downloadCursor0.getCount() == 0 ? true : downloadCursor0.getPosition() == -1;
    }

    public static boolean c(DownloadCursor downloadCursor0) {
        return downloadCursor0.getPosition() == 0 && downloadCursor0.getCount() != 0;
    }

    public static boolean d(DownloadCursor downloadCursor0) {
        int v = downloadCursor0.getCount();
        return downloadCursor0.getPosition() == v - 1 && v != 0;
    }

    public static boolean e(DownloadCursor downloadCursor0) {
        return downloadCursor0.moveToPosition(0);
    }

    public static boolean f(DownloadCursor downloadCursor0) {
        return downloadCursor0.moveToPosition(downloadCursor0.getCount() - 1);
    }

    public static boolean g(DownloadCursor downloadCursor0) {
        return downloadCursor0.moveToPosition(downloadCursor0.getPosition() + 1);
    }

    public static boolean h(DownloadCursor downloadCursor0) {
        return downloadCursor0.moveToPosition(downloadCursor0.getPosition() - 1);
    }
}

