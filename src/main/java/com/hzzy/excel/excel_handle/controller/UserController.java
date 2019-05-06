package com.hzzy.excel.excel_handle.controller;

import com.alibaba.fastjson.JSON;
import com.hzzy.excel.excel_handle.domain.User;
import com.hzzy.excel.excel_handle.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 测试数据导入导出模块
 * @author: lph
 * @date:  2019/5/6 9:16
 * @version V1.0
 */
@RestController
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/export")
    public void export(HttpServletResponse response){
        // 模拟数控获取数据进行数据的导出excel
        List<User> userList = new ArrayList<>();
        userList.add(new User("路飞", "1", 18, new Date()));
        userList.add(new User("娜美", "2", 18,new Date()));
        userList.add(new User("索隆", "1", 18,new Date()));
        userList.add(new User("小狸猫", "1", 18,new Date()));

        FileUtils.exportExcel(userList, "花名册", "草帽一伙", User.class, "海贼王.xls", response);
        logger.info("export success");
    }

    @RequestMapping("/importExcel")
    public void importExcel(){
        String filePath = "F:\\海贼王.xls";
        List<User> userList = FileUtils.importExcel(filePath, 1, 1, User.class);
        logger.info("import ret message:{}", JSON.toJSONString(userList));

    }

}
