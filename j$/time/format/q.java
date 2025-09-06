package j$.time.format;

enum q implements f {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    @Override  // j$.time.format.f
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        switch(this.ordinal()) {
            case 0: {
                w0.m(true);
                return v;
            }
            case 1: {
                w0.m(false);
                return v;
            }
            case 2: {
                w0.q(true);
                return v;
            }
            case 3: {
                w0.q(false);
                return v;
            }
            default: {
                return v;
            }
        }
    }

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "ParseCaseSensitive(true)";
            }
            case 1: {
                return "ParseCaseSensitive(false)";
            }
            case 2: {
                return "ParseStrict(true)";
            }
            case 3: {
                return "ParseStrict(false)";
            }
            default: {
                throw new IllegalStateException("Unreachable");
            }
        }
    }
}

