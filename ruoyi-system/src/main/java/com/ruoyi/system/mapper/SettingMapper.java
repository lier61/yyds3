package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Setting;

import java.util.List;

/**
 * 彩金 数据层
 *
 * @author ruoyi
 */
public interface SettingMapper {
    public Setting selectSettingById(Long settingId);

    public List<Setting> selectSettingList(Setting setting);

    public int insertSetting(Setting setting);

    public int updateSetting(Setting setting);

    public int deleteSettingIds(String ids);
}
