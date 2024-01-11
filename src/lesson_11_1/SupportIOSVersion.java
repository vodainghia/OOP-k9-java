package lesson_11_1;

public enum SupportIOSVersion {
    // Hold value enum
    IOS_13("iOS 13", 13),
    IOS_15("iOS 15", 15);

    private final String iOSName;
    private final int version;

    // private by default
    SupportIOSVersion(String iOSName, int version) {
        this.iOSName = iOSName;
        this.version = version;
    }

    public String getIOSName() {
        return iOSName;
    }

    public int getVersion() {
        return version;
    }
}
