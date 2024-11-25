package com.lvye.xoj.judge.strategy;

import com.lvye.xoj.model.dto.questionsubmit.JudgeInfo;

/**
 * @author LVye
 * @version 1.0
 */
public interface JudgeStrategy {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);

}
