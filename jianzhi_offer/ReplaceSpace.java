package jianzhi_offer;

/**
 * 2018/7/19 14:57
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
