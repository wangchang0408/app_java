package com.springcloud.swagger2.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchang
 * @date 2020/3/30 14:21
 */
@RestController
@Api("测试我的swagger2")
public class TestSwagger2 {

    @ApiOperation("第一个接口")
    @RequestMapping(value = "/getData/{id}",method = RequestMethod.GET)
    public JSONObject getData(String id) {
        JSONObject json = new JSONObject();
        if (id.equals("1")) {
            json.put("车站名", "北京西站");
            json.put("货物列车日均到达列数", 14);
            json.put("货物列车日均出发列数", 12);
            json.put("货车日均出入总辆数（辆）", 33);
            json.put("其中有调中转车出入辆数", 22);
            json.put("其中无调中转车出入辆数", 111);
            json.put("到达时间", "2020-03-30");
        } else {
            json.put("message", "有错误！！");
        }
        return json;
    }
}