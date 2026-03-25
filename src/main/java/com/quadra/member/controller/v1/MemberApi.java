package com.quadra.member.controller.v1;

import com.quadra.member.common.Result;

public interface MemberApi {
    /**
     * 校验会员是否存在 - 伪实现
     * @param memberId 会员id
     * @return true 存在 false 不存在
     */
    Result<Boolean> verifyMember(String memberId);
}
