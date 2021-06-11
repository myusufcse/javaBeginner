package collection;

public enum Users {
    QA("QA Phone number 000000"),
    TEST("TEST Phone number 111111"),
    PROD("PROD Phone number 12369784");

    private final String phoneNo;

    Users(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
