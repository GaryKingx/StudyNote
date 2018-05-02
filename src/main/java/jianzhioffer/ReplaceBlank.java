package jianzhioffer;

/**
 * 替换空格
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceBlank {

    /**
     * 使用StringBuffer 自带方法
     *
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(" "))
                str.replace(i, i + 1, "%20");
        }
        return str.toString();
    }

    /**
     * 新建字符串赋值遍历
     * @param str
     * @return
     */
    public String replaceSpace2(StringBuffer str) {
        String stringBuffer = "";
        char[] chars = str.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).equals(" "))
                stringBuffer += "%20";
            else
                stringBuffer += chars[i];
        }
        return stringBuffer;
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We Are Happy");
        ReplaceBlank replaceBlank = new ReplaceBlank();
        System.out.println(replaceBlank.replaceSpace2(stringBuffer));
    }
}
