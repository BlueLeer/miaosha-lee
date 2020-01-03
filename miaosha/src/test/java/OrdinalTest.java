/**
 * @author lee
 * @date 2020/1/3 14:46
 */
public enum OrdinalTest {
    FIRST,SECOND;
    private String code;

    public String getCode() {
        return String.valueOf(this.ordinal());
    }
}
