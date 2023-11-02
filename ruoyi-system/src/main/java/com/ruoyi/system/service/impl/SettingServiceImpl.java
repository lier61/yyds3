package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.Setting;
import com.ruoyi.system.mapper.SettingMapper;
import com.ruoyi.system.service.ISettingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SettingServiceImpl implements ISettingService {
    @Resource
    private SettingMapper settingMapper;

    /**
     * ID查询活动
     */
    @Override
    public Setting selectSettingById(Long settingId) {
        return settingMapper.selectSettingById(settingId);
    }

    /**
     * 查查询活动列表
     */
    @Override
    public List<Setting> selectSettingList(Setting setting) {
        return settingMapper.selectSettingList(setting);
    }

    /**
     * 新增活动配置
     */
    @Override
    public int insertSetting(Setting setting) {
        return settingMapper.insertSetting(setting);
    }

    /**
     * 修改参数配置
     */
    @Override
    public int updateSetting(Setting setting) {
        return settingMapper.updateSetting(setting);
    }

    /**
     * 批量删除参数配置信息
     */
    @Override
    public int deleteSettingIds(String ids) {
        return settingMapper.deleteSettingIds(ids);
    }
}
