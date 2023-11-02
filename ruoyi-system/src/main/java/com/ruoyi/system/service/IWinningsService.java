package com.ruoyi.system.service;

import com.ruoyi.system.domain.Setting;

import java.util.List;

public interface IWinningsService {
    /**
     * 查询公告信息
     *
     * @param noticeId 公告ID
     * @return 公告信息
     */
    public Setting selectWinningsById(Long noticeId);

    public List<Setting> selectWinningsIp(Setting winnings);

    /**
     * 查询公告列表
     *
     * @param winnings 公告信息
     * @return 公告集合
     */
    public List<Setting> selectWinningsList(Setting winnings);

    public List<Setting> selectWinningsListV1(Setting winnings);

    /**
     * 新增公告
     *
     * @param winnings 公告信息
     * @return 结果
     */
    public int insertWinnings(Setting winnings);

    /**
     * 修改公告
     *
     * @param winnings 公告信息
     * @return 结果
     */
    public int updateWinnings(Setting winnings);

    /**
     * 删除公告信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWinningsByIds(String ids);
}
