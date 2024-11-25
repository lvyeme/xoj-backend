package com.lvye.xoj.judge.strategy;

import com.lvye.xoj.model.dto.question.JudgeCase;
import com.lvye.xoj.model.dto.questionsubmit.JudgeInfo;
import com.lvye.xoj.model.entity.Question;
import lombok.Data;

import java.util.List;

/**
 * @author LVye
 * @version 1.0
 * 上下文用于定义在策略中传递的参数
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private Question question;

    private List<JudgeCase> judgeCaseList;
}
