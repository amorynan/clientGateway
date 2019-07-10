package com.cjs.amory.client.interfaces;

import com.cjs.amory.client.apis.ClientGateWayApis;
import com.cjs.amory.common.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * mini pro plugin 客户段
 * @Author: amory
 * @Date: 2019-07-10
 */
@FeignClient (name = ClientGateWayApis.MINIPROPLUGIN_NAME, decode404 = true)
public interface MiniProPluginClient {

    /**
     * 微信小程序端用户登陆api
     * 返回给小程序端 自定义登陆态 token
     */
    @GetMapping (ClientGateWayApis.LOGIN)
    CommonResult wxMemberLogin(@RequestBody Map<String, String> request);
}
