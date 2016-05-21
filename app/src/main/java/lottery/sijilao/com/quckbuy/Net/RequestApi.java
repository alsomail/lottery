package lottery.sijilao.com.quckbuy.Net;

import java.util.Map;

/**
 * 描述：
 * 作者： Also
 * 日期： 16/5/21  16:27
 */
public interface RequestApi {

    void postRequest(String url, Map map,NetCallBack callBack);

    void getRequest(String url,NetCallBack callBack);
}
