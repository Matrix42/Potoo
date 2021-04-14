package cn.matrix42.potoo.lang;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class StringUtils {

    private StringUtils() {

    }

    /**
     * @param str the String to check, may be null
     * @return <code>true</code> if the String is not empty and not null
     * @since 1.0.0
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * @param str the String to check, may be null
     * @return <code>true</code> if the String is null, empty or whitespace
     * @since 1.0.0
     */
    public static boolean isNotEmpty(String str) {
        return !StringUtils.isEmpty(str);
    }

}
