package com.ruoyi.web.controller.winnings;

import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.system.domain.Setting;
import com.ruoyi.system.service.ISettingService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author ruoyi
 */
@CrossOrigin(origins = {"*"},maxAge = 3600)
@Controller
@RequestMapping("/setting")
public class SettingController  extends BaseController {
    @Resource
    private ISettingService settingService;

    @PostMapping("/v1/list")
    @ResponseBody
    public TableDataInfo list(Setting setting) {
        startPage();
        List<Setting> list = settingService.selectSettingList(setting);
        return getDataTable(list);
    }

    @GetMapping("/view")
    public String view() {
        return "setting/view";
    }

    /**
     * 新增
     */
    @GetMapping("/add")
    public String add() {
        return "setting/add";
    }

    /**
     * 新增
     */
    @PostMapping("/add")
    @Transactional(rollbackFor = Exception.class)
    @ResponseBody
    public AjaxResult addSave(Setting setting){
        setting.setActivity_name("");
        return toAjax(settingService.insertSetting(setting));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        mmap.put("winnings", settingService.selectSettingById(id));
        return "setting/edit";
    }

    /**
     * 修改保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Setting setting) {
        setting.setUpdateBy(ShiroUtils.getLoginName());
        return toAjax(settingService.updateSetting(setting));
    }
}
