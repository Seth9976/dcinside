package pl.droidsonroids.gif;

import androidx.annotation.NonNull;
import java.util.Locale;

public enum h {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(0x6F, "Given file was not opened for read"),
    IMAGE_DEFECT(0x70, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(0x71, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(1001, "Invalid screen size, dimensions must be positive"),
    @Deprecated
    INVALID_IMG_DIMS(1002, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(1003, "Image size exceeds screen size"),
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");

    @NonNull
    public final String a;
    int b;

    private h(int v1, @NonNull String s1) {
        this.b = v1;
        this.a = s1;
    }

    static h a(int v) {
        h[] arr_h = h.values();
        for(int v1 = 0; v1 < arr_h.length; ++v1) {
            h h0 = arr_h[v1];
            if(h0.b == v) {
                return h0;
            }
        }
        h.w.b = v;
        return h.w;
    }

    public int b() {
        return this.b;
    }

    String c() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", this.b, this.a);
    }
}

