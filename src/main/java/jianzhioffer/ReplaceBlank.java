package jianzhioffer;

/**
 * �滻�ո�
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class ReplaceBlank {

    /**
     * ʹ��StringBuffer �Դ�����
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
     * �½��ַ�����ֵ����
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
