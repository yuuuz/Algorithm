package jianzhi_offer.String;

/**
 * 2018/7/19 14:57
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] arr = str.toString().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(arr[i]);
            }
        }
        return stringBuffer.toString();
    }
}
