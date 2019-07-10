package com.cjs.amory.client.apis;

import lombok.Data;

/**
 * 对内服务的接口转接
 *
 * @Author: amory
 * @Date: 2019-07-10
 */
@Data
public class ClientGateWayApis {
    /**
     * 这个name 对应了server 的 ip+port
     */
    public static final String MINIPROPLUGIN_NAME = "miniproplugin";
    /**
     * wx user
     */
    public final static String WX = "/wx";
    public final static String WX_USER = WX +"/user";
    public final static String LOGIN = WX_USER+"/login";


}
