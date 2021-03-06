package cn.internetware.support.haixinyuan.syncclient.controller;

import cn.internetware.support.haixinyuan.common.model.Result;
import cn.internetware.support.haixinyuan.syncclient.model.StatisticalInformation;
import cn.internetware.support.haixinyuan.syncclient.service.StatisticalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Profile("!server")
@RestController
@RequestMapping("statistical/information")
public class StatisticalInformationController {
    @Autowired
    private StatisticalInformationService informationService;

    @ResponseBody
    @GetMapping("/hour")
    public Result getStatisticalInfo() {
        List<StatisticalInformation> infoList = informationService.getStatisticalInfo();
        Result result = new Result();
        result.setCode(0);
        result.setMessage("");
        result.setData(infoList);
        return result;
    }

    @ResponseBody
    @GetMapping("/day")
    public Result getStatisticalInfoAccordingDay() {
        List<StatisticalInformation> infoList = informationService.getStatisticalInfoAccordingDay();
        Result result = new Result();
        result.setCode(0);
        result.setMessage("");
        result.setData(infoList);
        return result;
    }

    @ResponseBody
    @GetMapping("/month")
    public Result getStatisticalInfoAccordingMonth() {
        List<StatisticalInformation> infoList = informationService.getStatisticalInfoAccordingMonth();
        Result result = new Result();
        result.setCode(0);
        result.setMessage("");
        result.setData(infoList);
        return result;
    }
}
