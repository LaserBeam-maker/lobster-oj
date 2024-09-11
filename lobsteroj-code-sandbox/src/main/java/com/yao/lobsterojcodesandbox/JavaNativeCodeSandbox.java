package com.yao.lobsterojcodesandbox;

import com.yao.lobsterojcodesandbox.model.ExecuteCodeRequest;
import com.yao.lobsterojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * Java 原生代码沙箱实现（直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
