package com.lvye.xoj.judge.codesandbox.impl;

import com.lvye.xoj.judge.codesandbox.CodeSandbox;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.lvye.xoj.model.dto.questionsubmit.JudgeInfo;
import com.lvye.xoj.model.enums.JudgeInfoMessageEnum;
import com.lvye.xoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * @author LVye
 * @version 1.0
 * 示例代码沙箱
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMassage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCESS.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
