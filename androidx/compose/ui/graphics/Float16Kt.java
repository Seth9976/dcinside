package androidx.compose.ui.graphics;

public final class Float16Kt {
    public static final short a(short v, short v1) {
        if(!Float16.F(v) && !Float16.F(v1)) {
            return Float16.p(v, v1) >= 0 ? v : v1;
        }
        return 0x7E00;
    }

    public static final short b(short v, short v1) {
        if(!Float16.F(v) && !Float16.F(v1)) {
            return Float16.p(v, v1) <= 0 ? v : v1;
        }
        return 0x7E00;
    }
}

