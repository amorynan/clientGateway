package com.cjs.amory.client.controllers;

import com.cjs.amory.client.apis.UnifiedApis;
import com.cjs.amory.client.interfaces.MiniProPluginClient;
import com.cjs.amory.common.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: amory
 * @Date: 2019-07-10
 */
@RestController
@RequestMapping(UnifiedApis.WX_USER)
public class MiniProPluginController {
    @Autowired
    private MiniProPluginClient miniProPluginClient;

    @PostMapping(UnifiedApis.LOGIN)
    public CommonResult wxMemberLogin(@RequestBody Map<String, String> request){
        return miniProPluginClient.wxMemberLogin(request);
    }
}
