public class StrUtil {

    /**
     * 处理下划线、从第二个单词起首字母写
     *
     * @param str
     * @return
     */
    public static String strJoint(String str) {
        StringBuilder sb = new StringBuilder();
        String[] arry = str.split("_");
        for (int i = 0; i < arry.length; i++) {
            if (i == 0) {
                sb.append(arry[i]);
                continue;
            }
            String tempStr = arry[i];
            String handlerStr = (tempStr.charAt(0) + "").toUpperCase() + tempStr.substring(1);
            sb.append(handlerStr);
        }
        return sb.toString();
    }
}