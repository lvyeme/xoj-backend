package com.lvye.xoj.judge.codesandbox.impl;

import com.lvye.xoj.judge.codesandbox.CodeSandbox;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @author LVye
 * @version 1.0
 * 第三方代码沙箱(调用现成的代码沙箱)
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        //https://github.com/criyle/go-judge
        System.out.println("第三方代码沙箱");

        return null;
    }
}
