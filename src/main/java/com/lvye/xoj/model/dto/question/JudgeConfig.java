package com.lvye.xoj.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 * @author LVye
 * @version 1.0
 */
@Data
public class JudgeConfig {
    /**
     *时间限制（ms）
     */
    private Long timeLimite;
    /**
     * 内存限制(kb)
     */
    private Long memoryLimite;
    /**
     *堆栈限制（kb）
     */
    private Long stackLimite;

}
