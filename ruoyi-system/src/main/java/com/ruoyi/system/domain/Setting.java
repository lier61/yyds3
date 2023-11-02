package com.ruoyi.system.domain;

import com.ruoyi.common.base.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Setting extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long roulette_id;

    /** 活动名称 */
    private String activity_name;

    /** 活动开始时间 */
    private String act_s_time;

    /** 活动结束时间 */
    private String act_e_time;

    /** 活动状态（1：开 2：关） */
    private String act_status;

    /**
     * 累计单个用户最高参与次数
     */
    private String max_num;


    public Long getRoulette_id() {
        return roulette_id;
    }

    public void setRoulette_id(Long roulette_id) {
        this.roulette_id = roulette_id;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getAct_s_time() {
        return act_s_time;
    }

    public void setAct_s_time(String act_s_time) {
        this.act_s_time = act_s_time;
    }

    public String getAct_e_time() {
        return act_e_time;
    }

    public void setAct_e_time(String act_e_time) {
        this.act_e_time = act_e_time;
    }

    public String getAct_status() {
        return act_status;
    }

    public void setAct_status(String act_status) {
        this.act_status = act_status;
    }

    public String getMax_num() {
        return max_num;
    }

    public void setMax_num(String max_num) {
        this.max_num = max_num;
    }
}
