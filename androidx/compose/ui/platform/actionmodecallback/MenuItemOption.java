package androidx.compose.ui.platform.actionmodecallback;

import kotlin.J;

public enum MenuItemOption {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[MenuItemOption.values().length];
            try {
                arr_v[MenuItemOption.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MenuItemOption.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MenuItemOption.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MenuItemOption.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);

    private final int a;
    private final int b;

    private MenuItemOption(int v1) {
        this.a = v1;
        this.b = v1;
    }

    private static final MenuItemOption[] a() [...] // Inlined contents

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        switch(this) {
            case 1: {
                return 0x1040001;
            }
            case 2: {
                return 0x104000B;
            }
            case 3: {
                return 0x1040003;
            }
            case 4: {
                return 0x104000D;
            }
            default: {
                throw new J();
            }
        }
    }
}

