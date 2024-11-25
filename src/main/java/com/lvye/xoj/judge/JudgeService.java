package com.lvye.xoj.judge;

import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.lvye.xoj.model.entity.QuestionSubmit;
import com.lvye.xoj.model.vo.QuestionSubmitVO;
import freemarker.template.utility.Execute;

/**
 * @author LVye
 * @version 1.0
 * 判题服务
 */
public interface JudgeService {
    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
