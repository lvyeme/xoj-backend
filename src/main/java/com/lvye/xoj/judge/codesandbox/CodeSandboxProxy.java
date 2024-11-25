package com.lvye.xoj.judge.codesandbox;

import cn.hutool.log.Log;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeResponse;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

/**
 * @author LVye
 * @version 1.0
 */
@Slf4j

public class CodeSandboxProxy implements CodeSandbox{


    private CodeSandbox codeSandbox;

    //也可以使用注释 @AllArgsConstructor
    public CodeSandboxProxy(CodeSandbox codeSandbox) {
        this.codeSandbox = codeSandbox;
    }
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱请求信息："+ executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱相应信息："+ executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
