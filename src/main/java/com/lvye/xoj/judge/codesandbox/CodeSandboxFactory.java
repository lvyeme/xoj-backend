package com.lvye.xoj.judge.codesandbox;

import com.lvye.xoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.lvye.xoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.lvye.xoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

import java.lang.reflect.Type;
import java.net.Proxy;

/**
 * @author LVye
 * @version 1.0
 */
public class CodeSandboxFactory {
    /**
     * 创建代码沙箱示例
     * @param type
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdparty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
