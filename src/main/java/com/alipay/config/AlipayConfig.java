package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092700605095";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCNydFVobyNCgt8RMPYlXb/ULAoAozu1aJIdxNvzSfJw7SfNoFiXSrC9/xZjlKYCUFimGrAlBej98GhU1JK67bdd1hb1piO6kBzQDSMGpCQv4vuv2sioCUbpIp7zpVxcyCNHOlKYb28FljgRLb2AxB3uDVJso7VM5nNFeIdVn8kOnRFDkkDcV0jdFOUeifX3fuEU41skxhKiB67WRT3MliO84obhrprozQgXdc/KSfHpSNu8RC4KUSq2Io+Skm/m+FMHVX4JkoeyubW7WxhgdVmMNsJefWRD7N7o+txhbBWToqTe3CXXT2tr9YDlZvks7+mR9mtJ3utJ71+x3MvQQzBAgMBAAECggEAT3ioAWQm57KSn3N3hiS4TwBty+8qCQ/q5sz/MvH9dCRiT77gJD7uIduXMKcJ+jdt05J0ez5GRdwvRnoKLP4TP+yNtOQCHFCGEVMSYNje4JLMHuRha0Xxpp3CFQTEVJNf0lg7FjrUeuDXrdQ17IvpJgE0tPsE/dDvSrkSRLlfh/D59UUeO5fbCuglBQaWk8MZHsB9ECdsbCSTAtV2I+/oo5EX2791/G/aTu6ePEs/XY8DKmqxT/JsRTiphtbpLuoUoux9o/N348CxRqOKcG5/PKNRNo0TRCIgj3JSTGKOxBKmnBUXmhO17enz/xTivr8nKTOwX5DnhBDJY71HCHz9hQKBgQDA8UyNie218TGwdX/tA038oD+Yc+PcXpdijbkhayD6E7L73fCDFi7t+W2kKfWfG0jE1QE6AUTeq5R8PSTjcrv4OBWLGaabSNgBdZuHKXX3hwlrK9zNlL955RWHBKNAA9J6kUGMuwa5OaiUHmmBvRcGpwSIeeyEolMlizSGUsMf4wKBgQC8IKhxzFXzmffCsLovfvZBdj0skwOnsk/e5V8oplWfGodDJDd1KIu0z4t+R/1SoN94Ii3PktB+KzibJf0/9PhckKOXmb1h6j7+HJAdrwSn5rRunn3i+ZtJFWkdolbhF/RMLP3E1u18AJAz+HFl8oyhokRRFjrBX2SKF88l1En6CwKBgHbOXsgs7W4CVgmFYL9uMIBloKNcgSu6J1etUxkL4WN769OBp07gwwcQdv4GRFOztkxVqQqxq1m9p5IVCHjxtmMzDbj4k4m9Ah1r8Nf6pMRFp3wRp0YD2R/S+z2Hkoqhj+KfPRDOPWai5XZHf8o+yEX1ZCoxgX1ugup0XGR14+bnAoGBAJKtP8fiEg2pOPQxyChp6+QkJRQQ16OzMfTOjz/pWA6Bp35gyWBuKWbi/paJ2GfJCBLpSyBxDl+goTTODMMF43KATxxPAMpL0atcZ7zNDWs/Q+SPbAVAqaL0r40sWmKLw6x007LaBDVPVx8+EGP1FVKcanlyRIMqNgA5CggrmTX7AoGBAK3UmwOeP5iZM02eOT8wrE0RbqxygHy8/FdcwEYs7NKP0StHfSF44DNFcMWiNuxsDRZrMJ6UwqUgn26pL5PpGCC0AIhs2j8hTG2hKT2wd+D03ndFtp9AiroCVSfYjDI+e3pKz7kjXzL4XlfoCOnFlCPQg3RzvgYm7Cr/FEc9Rjex";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAy26KOlwriroJcucIxummEEwHzBkRdeGEkYMniTPEVw5hKdKs0QmZOlrV5ey4Wy9xjqIP/KWK8IptyRMwjwOrQB2WqFgX3soytXYO03gDkUC6SVRWHCWUDAK2yyKyvUK75WpqxDiqSKAPGC1xldoPNtAMUlBmB49wSb9G6jTBt5N+iZFoUqj1j4KKReVEFbVCPHJZyJiKSGSU2mNv1UseGYzfQ3tfn2rU/wY0gWxiy8P7leMKFWkP8MNvHMkDNH+uNmyCNvhUaIl2KhC/KD/Y2NZuGSkv337ZjQEIbDv4Ue5RSvILupSHM7ayD8D9e5JGWHdF8cgZWxsLwwWi6EYG6QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/Dcxt3/alipayNotifyNotice.action";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/Dcxt3/alipayReturnNotice.action";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

