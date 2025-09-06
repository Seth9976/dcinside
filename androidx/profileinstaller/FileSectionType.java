package androidx.profileinstaller;

enum FileSectionType {
    DEX_FILES(0L),
    EXTRA_DESCRIPTORS(1L),
    CLASSES(2L),
    METHODS(3L),
    AGGREGATION_COUNT(4L);

    private final long a;

    private FileSectionType(long v1) {
        this.a = v1;
    }

    private static FileSectionType[] a() [...] // Inlined contents

    static FileSectionType b(long v) {
        FileSectionType[] arr_fileSectionType = FileSectionType.values();
        for(int v1 = 0; v1 < arr_fileSectionType.length; ++v1) {
            if(arr_fileSectionType[v1].c() == v) {
                return arr_fileSectionType[v1];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + v);
    }

    public long c() {
        return this.a;
    }
}

