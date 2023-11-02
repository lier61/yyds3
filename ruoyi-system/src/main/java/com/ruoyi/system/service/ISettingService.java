package com.ruoyi.system.service;

import com.ruoyi.system.domain.Setting;

import java.util.List;

public interface ISettingService {
    public Setting selectSettingById(Long settingId);
    public List<Setting> selectSettingList(Setting setting);
    public int insertSetting(Setting setting);
    public int updateSetting(Setting setting);
    public int deleteSettingIds(String ids);
}
