package com.zyyglxt.controller.governresCountersign;


import com.zyyglxt.annotation.LogAnnotation;
import com.zyyglxt.dataobject.GovernresCountersign;
import com.zyyglxt.error.EmBusinessError;
import com.zyyglxt.response.ResponseData;
import com.zyyglxt.service.IGovernresCountersignService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "政务办公-内部会签")
@RestController
@RequestMapping(value = "governresCountersign")
public class GovernresCountersignController {

    @Resource
    IGovernresCountersignService governresCountersignService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    @LogAnnotation(appCode ="",logTitle ="政务办公-内部会签-录入会签",logLevel ="3",creater ="",updater = "")
    public ResponseData insertSelective(@RequestBody GovernresCountersign governresCountersign) {
        governresCountersignService.insertSelective(governresCountersign);
        return new ResponseData(EmBusinessError.success);
    }

    @RequestMapping(value = "/delete/{itemCode}", method = RequestMethod.DELETE)
    @ResponseBody
    @LogAnnotation(appCode ="",logTitle ="政务办公-内部会签-删除",logLevel ="4",creater ="",updater = "")
    public ResponseData deleteByPrimaryKey(@PathVariable("itemCode") String itemCode) {
        governresCountersignService.deleteByPrimaryKey(itemCode);
        return new ResponseData(EmBusinessError.success);
    }

    @GetMapping(value = "/selectAll")
    @ResponseBody
    @LogAnnotation(appCode ="",logTitle ="政务办公-内部会签-显示所有文件",logLevel ="1",creater ="",updater = "")
    public ResponseData selectAll() {
        return new ResponseData(EmBusinessError.success,governresCountersignService.selectAll());
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    @LogAnnotation(appCode ="",logTitle ="政务办公-内部会签-修改",logLevel ="2",creater ="",updater = "")
    public ResponseData updateByPrimaryKeySelective(@RequestBody GovernresCountersign record) {
        governresCountersignService.updateByPrimaryKeySelective(record);
        return new ResponseData(EmBusinessError.success);
    }

    @RequestMapping(value = "/select/{itemCode}",method = RequestMethod.GET)
    @ResponseBody
    @LogAnnotation(appCode ="",logTitle ="政务办公-内部会签-查看文件",logLevel ="1",creater ="",updater = "")
    public ResponseData selectByPrimaryKey( @PathVariable("itemCode") String itemCode){
        GovernresCountersign governresCountersign= governresCountersignService.selectByPrimaryKey(itemCode);
        return new ResponseData(EmBusinessError.success,governresCountersign);
    }
}
