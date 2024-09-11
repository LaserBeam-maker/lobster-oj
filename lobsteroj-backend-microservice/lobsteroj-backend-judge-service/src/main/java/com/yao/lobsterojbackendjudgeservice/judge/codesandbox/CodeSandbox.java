package com.yao.lobsterojbackendjudgeservice.judge.codesandbox;

import com.yao.lobsterojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.yao.lobsterojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
