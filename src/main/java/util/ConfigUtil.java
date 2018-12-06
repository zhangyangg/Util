package util;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * @Author: zy
 * @Date: 2018/12/6 10:21
 * 配置管理用confactoryFactory进行统一配置管理
 */
public class ConfigUtil {

    Config config = null;

    // 读取设置路径的配置文件
    public ConfigUtil(String path)
    {
        config = ConfigFactory.load(path);



    }

    //默认加载classpath下的application.conf,application.json和application.properties文件
    public ConfigUtil()
    {
        config = ConfigFactory.load();
    }

    public static void main(String args[])
    {
        ConfigUtil configUtil = null;
        if(args.length == 1)
            configUtil = new ConfigUtil(args[0]);
        else
            configUtil = new ConfigUtil();


    }
}
