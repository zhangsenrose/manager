package com.eva.cn.web.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@Api(value = "用户接口类")
public class UserController {



    @RequestMapping("save")
    @ResponseBody
    @ApiOperation(value = "保存用户",httpMethod = "POST",notes = "")
    public String saveUser(
                @ApiParam(name = "username", value = "用户名")@RequestParam(required = false)String username
    ){
        return "保存成功";

    }


}
