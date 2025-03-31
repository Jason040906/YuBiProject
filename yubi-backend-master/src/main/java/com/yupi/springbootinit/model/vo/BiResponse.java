package com.yupi.springbootinit.model.vo;

import lombok.Data;

/**
 * Bi 的返回结果
 */
@Data
public class BiResponse {

    /**
     * 生成的图表信息
     */
    private String genChart;

    /**
     * 生成的图标结论
     */
    private String genResult;

    /**
     * 生成的图表的id
     */
    private Long chartId;
}
