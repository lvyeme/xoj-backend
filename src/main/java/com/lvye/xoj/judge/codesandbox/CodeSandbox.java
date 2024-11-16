package com.lvye.xoj.judge.codesandbox;

import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.lvye.xoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @author LVye
 * @version 1.0
 */
public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
