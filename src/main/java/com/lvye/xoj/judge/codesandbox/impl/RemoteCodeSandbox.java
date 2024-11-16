package com.lvye.xoj.judge.codesandbox.impl;

import com.lvye.xoj.judge.codesandbox.CodeSandbox;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @author LVye
 * @version 1.0
 * 远程代码沙箱(实际调用接口的沙箱)
 */
public class RemoteCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");

        return null;
    }
}
